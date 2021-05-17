B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private btnPrestar As Button
	Private cmbEstudiante As B4XComboBox
	Private clvLibros As CustomListView
	Private libroElegido As Int = -1
	Private idEstudianteElegido As String =  "" 
	Private idLibroElegido As String  =  ""  
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("frmBorrow") 
	cmbEstudiante.SetItems(mostrarcmbEstudiante)
	cargarListaLibros
End Sub

' Carga la lista CLV con los libros formeateados de tal modo que se mostrarán
' alineados a la izquierda con una fuente de tamaño fijo
Private Sub cargarListaLibros
	For Each tpLibro As Libro In B4XPages.MainPage.mapaLibros.Values
		Private s1, s2, s3, s4, s5, s6, str As String
		s1 = B4XPages.MainPage.pgLibros.anadirEspacios(tpLibro.ID, 1)
		s2 = B4XPages.MainPage.pgLibros.anadirEspacios(tpLibro.Título, 2)
		s3 = B4XPages.MainPage.pgLibros.anadirEspacios(tpLibro.Escritor, 3)
		s4 = B4XPages.MainPage.pgLibros.anadirEspacios(tpLibro.Ano, 4)
		s5 = B4XPages.MainPage.pgLibros.anadirEspacios(tpLibro.Editorial, 5)
		s6 = B4XPages.MainPage.pgLibros.anadirEspacios(tpLibro.Estante, 6)
		
		str = $"${s1}${s2}${s3}${s4}${s5}${s6}"$
		clvLibros.AddTextItem(str, tpLibro.ID)
	Next
End Sub

'Returns a list with alla studentswith idm First LastName and Class
Private Sub mostrarcmbEstudiante As List
	Private nuevaLista As List 
	nuevaLista.Initialize
	For Each clave As String In B4XPages.MainPage.mapaEstudiantes.Keys
		Dim tp As Estudiante
		tp = B4XPages.MainPage.mapaEstudiantes.Get(clave)
		nuevaLista.Add($"${clave} ${tp.Nombre} ${tp.Apellidos} ${tp.Clase}"$)
		Log($"${clave} ${tp.Nombre} ${tp.Apellidos} ${tp.Clase}"$ )
	Next
	Return nuevaLista
End Sub

' Cuando se cambia el combobox, fijamos el valor de idEstudianteElegido al ID del estudiante
Private Sub cmbEstudiante_SelectedIndexChanged (Index As Int)
	idEstudianteElegido = ""
	Private str As String = cmbEstudiante.GetItem(Index)
	Private i As Int = 0 
	Do While str.CharAt(i) <> " " 	
		idEstudianteElegido = idEstudianteElegido & str.CharAt(i)
		i = i + 1
	Loop
	Log(idEstudianteElegido)
End Sub

' Cuando se pulsa en un libro se cambia el color de la línea a blanco o azul
' para marcar o desmarcar la línea. También se establece el valor de libroElegido
' al valor que hay en el índice de la lista CLV y el idLibroElegido
Private Sub clvLibros_ItemClick (Índice As Int, Valor As Object)
	If libroElegido = -1 Then
		Dim p As B4XView = clvLibros.GetPanel(Índice)
		p.GetView(0).Color = xui.Color_Blue
		libroElegido = Índice
		idLibroElegido = clvLibros.GetValue(libroElegido)
	Else
		Dim p As B4XView = clvLibros.GetPanel(libroElegido)
		p.GetView(0).Color = xui.Color_White
		If libroElegido = Índice  Then
			libroElegido = -1
			idLibroElegido = ""
		Else
			Dim p As B4XView = clvLibros.GetPanel(Índice)
			p.GetView(0).Color = xui.Color_Blue
			libroElegido = Índice
			idLibroElegido = clvLibros.GetValue(libroElegido)
		End If
	End If

	Log(libroElegido)
End Sub


Private Sub btnPrestar_Click
	If idLibroElegido <> "" And idEstudianteElegido <> "" Then
		prestarLibro
	End If 
End Sub


' Crear un fichero KVS para el estudiante para guardar los IDs de los libros prestados
Public Sub prestarLibro()
	'si el fichero del Estudiante no existe, lo creamos y creamos un mapa para guardar el id del libro y la fecha del préstamo
	Private mapaEst As Map
	mapaEst.Initialize
	
	Private nombreFichEst As String = idEstudianteElegido & ".dat"
	Log("Nombre del fichero: " & nombreFichEst)
	Private fichEstudiante As KeyValueStore

	If File.Exists(File.DirTemp, nombreFichEst) Then
		fichEstudiante.Initialize(File.DirTemp, nombreFichEst)
		'Si el fichero existe, metemos todos los datos en mapaEst
		Wait For (fichEstudiante.GetMapAsync(fichEstudiante.ListKeys)) Complete (mapaEst As Map)
	Else
		fichEstudiante.Initialize(File.DirTemp, nombreFichEst)
	End If
	
	'Añadir un nuevo valor al mapa
	mapaEst.Put(idLibroElegido, DateTime.Date(DateTime.Now))
	For Each key As String In mapaEst.Keys
		Log (key & " " & mapaEst.Get(key))
	Next
	'Guardar el mapa en el fichero de Estudiantes
	Wait For (fichEstudiante.PutMapAsync(mapaEst)) Complete (Exito As Boolean)
	fichEstudiante.Close
End Sub


