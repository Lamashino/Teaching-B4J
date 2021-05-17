B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private clvEstudiantes As CustomListView
	Private diálogo As B4XDialog
	Private txtClase As B4XFloatTextField
	Private txtNombre As B4XFloatTextField
	Private txtID As B4XFloatTextField
	Private txtApellidos As B4XFloatTextField
	Private txtTelefono As B4XFloatTextField
	Public estudianteElegido As Int  = -1
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("fmrStudents") 
	cargarLista
End Sub

' Cargar una lista CLV con los estudiantes formateados con alineación a la
' izquierda y con una fuente de espacio fijo
Private Sub cargarLista
	For Each tpEst As Estudiante In B4XPages.MainPage.mapaEstudiantes.Values
		Private s1, s2, s3, s4, s5, str As String
		s1 = anadirEspacios(tpEst.ID, 1)
		s2 = anadirEspacios(tpEst.Nombre, 2)
		s3 = anadirEspacios(tpEst.Apellidos, 3)
		s4 = anadirEspacios(tpEst.Clase, 4)
		s5 = anadirEspacios(tpEst.Telefono, 5)
		
		str = $"${s1}${s2}${s3}${s4}${s5}"$
		clvEstudiantes.AddTextItem(str, tpEst.ID)
	Next
End Sub 

' Esta rutina añade espacios a los primeros 3 ítems de una lista
' A ID se añaden hasta llegar a 5 caracteres de longitud
' A Nombre y Apellidos se le añaden hasta llegar a 20
' A Clase se añade 3 espacios y a teléfono 12
Private Sub anadirEspacios(s1 As String, pos As Int) As String
	If pos = 1 Then
		Do While s1.Length <= 5 
			s1 = s1 & " "
		Loop
	else if pos = 2 Or pos = 3 Then
		Do While s1.Length <= 20 
			s1 = s1 & " "
		Loop
	else if pos = 4 Then
		Do While s1.Length <= 3 
			s1 = s1 & " "
		Loop
	else if pos = 5 Then
		Do While s1.Length <= 12 
			s1 = s1 & " "
		Loop
	End If
	Return s1
End Sub


' Cuando se pulsa en un estudiante se cambia el color de la línea a blanco o azul
' para marcar o desmarcar la línea. También se establece el valor de estudianteElegido
' al valor que hay en el índice de la lista CLV
Private Sub clvEstudiantes_ItemClick (Índice As Int, Valor As Object)
	If estudianteElegido = -1 Then
		Dim p As B4XView = clvEstudiantes.GetPanel(Índice)
		p.GetView(0).Color = xui.Color_Blue
		estudianteElegido = Índice
	Else 
		Dim p As B4XView = clvEstudiantes.GetPanel(estudianteElegido)
		p.GetView(0).Color = xui.Color_White 
		If estudianteElegido = Índice  Then
			estudianteElegido = -1
		Else
			Dim p As B4XView = clvEstudiantes.GetPanel(Índice)
			p.GetView(0).Color = xui.Color_Blue 
			estudianteElegido = Índice
		End If 
	End If
End Sub


Private Sub btnInsertar_Click
	InsertarEstudiante
End Sub


'Borrar el Estudiante elegido por el usuario
Private Sub btnBorrar_Click
	If estudianteElegido <> - 1 Then
		B4XPages.MainPage.mapaEstudiantes.Remove(clvEstudiantes.GetValue(estudianteElegido))
		clvEstudiantes.RemoveAt(estudianteElegido)
		estudianteElegido = -1
		guardarFicheroEstudiantes
	End If 
End Sub


'Crear un diálogo para insertar un nuevo estudiante
Private Sub InsertarEstudiante
	diálogo.Initialize(Root)
	diálogo.Title = "Insertar Estudiante"
	
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0,0,0, 350dip, 350dip)
	
	p.LoadLayout("dlgStudents")
	diálogo.PutAtTop = True
	Wait For (diálogo.ShowCustom(p, "OK", "", "Cancelar")) Complete (Resultado As Int)
	If Resultado = xui.DialogResponse_Positive Then
		Private nuevoEstudiante As Estudiante
		nuevoEstudiante.ID = txtID.Text
		nuevoEstudiante.Nombre = txtNombre.Text
		nuevoEstudiante.Apellidos = txtApellidos.Text
		nuevoEstudiante.Telefono = txtTelefono.Text
		nuevoEstudiante.Clase = txtClase.Text
		B4XPages.MainPage.mapaEstudiantes.Put(nuevoEstudiante.ID, nuevoEstudiante)
		cargarLista
		guardarFicheroEstudiantes
	End If
End Sub


Private Sub guardarFicheroEstudiantes
	Private str As String
	For Each tpEst As Estudiante In B4XPages.MainPage.mapaEstudiantes.Values
		str = str & $"${tpEst.ID};${tpEst.Nombre};${tpEst.Apellidos};${tpEst.Clase};${tpEst.Telefono}${CRLF}"$
		File.WriteString(File.DirTemp, "students.txt", str)
	Next 
	Log("Guardado en la carpeta: " & File.DirTemp)
End Sub

