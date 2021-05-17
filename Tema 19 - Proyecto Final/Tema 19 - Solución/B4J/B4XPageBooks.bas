B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private clvLibros As CustomListView
	Private diálogo As B4XDialog
	Private txtID As B4XFloatTextField
	Private txtEditorial As B4XFloatTextField
	Private txtEstante As B4XFloatTextField
	Private txtTitulo As B4XFloatTextField
	Private txtEscritor As B4XFloatTextField
	Private txtAno As B4XFloatTextField
	Public libroElegido As Int 
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("frmBooks")
	
	cargarLista
End Sub

' Carga la lista CLV con los libros formeateados de tal modo que se mostrarán
' alineados a la izquierda con una fuente de tamaño fijo
Private Sub cargarLista
	For Each tpLibro As Libro In B4XPages.MainPage.mapaLibros.Values
		Private s1, s2, s3, s4, s5, s6, str As String
		s1 = anadirEspacios(tpLibro.ID, 1)
		s2 = anadirEspacios(tpLibro.Título, 2)
		s3 = anadirEspacios(tpLibro.Escritor, 3)
		s4 = anadirEspacios(tpLibro.Ano, 4)
		s5 = anadirEspacios(tpLibro.Editorial, 5)
		s6 = anadirEspacios(tpLibro.Estante, 6)
		
		str = $"${s1}${s2}${s3}${s4}${s5}${s6}"$
		clvLibros.AddTextItem(str, tpLibro.ID)
	Next
End Sub

' Esta rutina añade espacios a los primeros 3 ítems de una lista
' A ID se añaden hasta llegar a 5 caracteres de longitud
' A Nombre y Apellidos se le añaden hasta llegar a 20
' A Clase se añade 3 espacios y a teléfono 12
Public Sub anadirEspacios(s1 As String, pos As Int) As String
	If pos = 1 Then
		Do While s1.Length <= 4 
			s1 = s1 & " "
		Loop
	else if pos = 2 Then
		Do While s1.Length <= 40 
			s1 = s1 & " "
		Loop
	else if pos = 3 Or pos = 5 Then
		Do While s1.Length <= 22 
			s1 = s1 & " "
		Loop
	else if pos = 4 Then
		Do While s1.Length <= 6 
			s1 = s1 & " "
		Loop
	else if pos = 6 Then
		Do While s1.Length <= 3 
			s1 = s1 & " "
		Loop
	End If
	Return s1
End Sub


' Cuando se pulsa en un libro se cambia el color de la línea a blanco o azul
' para marcar o desmarcar la línea. También se establece el valor de libroElegido
' al valor que hay en el índice de la lista CLV
Private Sub clvLibros_ItemClick (Índice As Int, Valor As Object)
	If libroElegido = -1 Then
		Dim p As B4XView = clvLibros.GetPanel(Índice)
		p.GetView(0).Color = xui.Color_Blue
		libroElegido = Índice
	Else
		Dim p As B4XView = clvLibros.GetPanel(libroElegido)
		p.GetView(0).Color = xui.Color_White
		If libroElegido = Índice  Then
			libroElegido = -1
		Else
			Dim p As B4XView = clvLibros.GetPanel(Índice)
			p.GetView(0).Color = xui.Color_Blue
			libroElegido = Índice
		End If
	End If
End Sub


'Borrar el libro elegido por el usuario
Private Sub btnBorrar_Click
	If libroElegido <> - 1 Then
		B4XPages.MainPage.mapaLibros.Remove(clvLibros.GetValue(libroElegido))
		clvLibros.RemoveAt(libroElegido)
		libroElegido = -1
		GuardarFicheroLibros
	End If
End Sub


Private Sub btnInsertar_Click
	InsertarLibro
End Sub

'Crea un diálogo para insertar un nuevo libro
Private Sub InsertarLibro
	diálogo.Initialize(Root)
	diálogo.Title = "Insertar Libro"
	
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0,0,0, 350dip, 350dip)
	
	p.LoadLayout("dlgBooks")
	diálogo.PutAtTop = True
	Wait For (diálogo.ShowCustom(p, "OK", "", "Cancelar")) Complete (Resultado As Int)
	If Resultado = xui.DialogResponse_Positive Then
		Private nuevoLibro As Libro
		nuevoLibro.ID = txtID.Text
		nuevoLibro.Título = txtTitulo.Text
		nuevoLibro.Escritor = txtEscritor.Text
		nuevoLibro.Ano = txtAno.Text
		nuevoLibro.Editorial = txtEditorial.Text
		nuevoLibro.Estante = txtEstante.Text
		B4XPages.MainPage.mapaLibros.Put(nuevoLibro.ID, nuevoLibro)
		cargarLista
		GuardarFicheroLibros
	End If
End Sub


Private Sub GuardarFicheroLibros
	Private str As String
	For Each tpLibro As Libro In B4XPages.MainPage.mapaLibros.Values
		str = str & $"${tpLibro.ID};${tpLibro.Título};${tpLibro.Escritor};${tpLibro.Ano};${tpLibro.Editorial};${tpLibro.Estante}${CRLF}"$
	Next
		File.WriteString(File.DirTemp, "books.txt", str)
	Log("Guardado en la carpeta: " & File.DirTemp)
End Sub


