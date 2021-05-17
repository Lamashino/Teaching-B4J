B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	
	Private btnDevolver As Button
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
	Root.LoadLayout("frmReturn")
	cmbEstudiante.SetItems(mostrarcmbEstudiante)
End Sub

' Devuelve una lista con todos los estudiantes según su id, nombre, apellidos y clase
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

' Cuando cambiar el combobox, fijamos el valor de idEstudianteElegido al id del estudiante
Private Sub cmbEstudiante_SelectedIndexChanged (Índice As Int)
	idEstudianteElegido = ""
	Private str As String = cmbEstudiante.GetItem(Índice)
	Private i As Int = 0
	Do While str.CharAt(i) <> " "
		idEstudianteElegido = idEstudianteElegido & str.CharAt(i)
		i = i + 1
	Loop
	Log(idEstudianteElegido)
	cargarListaLibros
End Sub


Private Sub cargarListaLibros
	Private studentFile As KeyValueStore
	Private stMAp As Map
	stMAp.Initialize
	Log("comprueba la existencia de " & idEstudianteElegido & ".dat ")
	If File.Exists(File.DirTemp, idEstudianteElegido & ".dat") Then
		studentFile.Initialize(File.DirTemp, idEstudianteElegido & ".dat")
		Wait For (studentFile.GetMapAsync(studentFile.ListKeys)) Complete (stMAp As Map)
		Log("El fichero de estudiante existe") 
		For Each tpLibro As Libro In B4XPages.MainPage.mapaLibros.Values
			If stMAp.ContainsKey(tpLibro.ID) Then
				Private s1, s2, s3, s4, s5, s6, str As String
				s1 = B4XPages.MainPage.pgLibros.anadirEspacios(tpLibro.ID, 1)
				s2 = B4XPages.MainPage.pgLibros.anadirEspacios(tpLibro.Título, 2)
				s3 = B4XPages.MainPage.pgLibros.anadirEspacios(tpLibro.Escritor, 3)
				s4 = B4XPages.MainPage.pgLibros.anadirEspacios(tpLibro.Ano, 4)
				s5 = B4XPages.MainPage.pgLibros.anadirEspacios(tpLibro.Editorial, 5)
				s6 = B4XPages.MainPage.pgLibros.anadirEspacios(tpLibro.Estante, 6)
				
				str = $"${s1}${s2}${s3}${s4}${s5}${s6}"$
				clvLibros.AddTextItem(str, tpLibro.ID)
			End If 
		Next
		studentFile.Close 
	Else 
		clvLibros.Clear
	End If 
End Sub


' Cuando se pulse en un libro se cambia el color de su línea a azul o blanco
' para marcar o desmarcar la línea. También se fija el valor de libroElegido
' con el valor del índice CLV y idLibroElegido con el ID del libro
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


Private Sub btnDevolver_Click
	If idEstudianteElegido <> "" And idLibroElegido <> "" Then 
		devolverLibro
	End If
End Sub

'Remove from student's kvs file borrowed book id 
Public Sub devolverLibro
	Private nombreFichEst As String = idEstudianteElegido & ".dat"
	Log("Nombre del fichero: " & nombreFichEst)
	Private fichEstudiante As KeyValueStore

	fichEstudiante.Initialize(File.DirTemp, nombreFichEst)
	fichEstudiante.Remove(idLibroElegido)
	clvLibros.RemoveAt(libroElegido)
	clvLibros.Refresh
	libroElegido = -1
	If clvLibros.Size = 0 Then
		fichEstudiante.Close
		Log("Fichero vacío")
		File.Delete(File.DirTemp, idEstudianteElegido & ".dat")
	Else 
		fichEstudiante.Close
	End If

End Sub