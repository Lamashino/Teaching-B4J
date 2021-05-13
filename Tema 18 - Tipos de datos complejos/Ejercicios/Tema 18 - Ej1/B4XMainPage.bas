B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Type Cliente(ID As String, Nombre As String, Apellidos As String, Teléfono As String) 
	Private Clientes As List 
	Private CustomListView1 As CustomListView
	Private txtNombre As B4XFloatTextField
	Private txtID As B4XFloatTextField
	Private txtApellidos As B4XFloatTextField
	Private txtTeléfono As B4XFloatTextField
	Private dialog As B4XDialog
	
	Private ficheroKVS  As KeyValueStore
	Private btnCargarFichero As Button
End Sub

Public Sub Initialize
	
End Sub


Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	Clientes.Initialize
	crearLista
	
	'Mostrar Clientes 
	For i = 0 To Clientes.Size-1
		Private c As Cliente
		c = Clientes.Get(i)
		LogCliente(c) 	
		Log("---------------------------")
	Next

End Sub


'Carga la CLV con la lista de Clientes
Private Sub btnCargar_Click
	If CustomListView1.IsInitialized Then 
		CustomListView1.Clear
	End If 
	For i = 0 To Clientes.Size-1
		Private c As Cliente
		Private str As String
		c = Clientes.Get(i)
		Private s1, s2, s3, s4 As String 
		s1 = anadirEspacios(c.ID, 1)
		s2 = anadirEspacios(c.Nombre, 2)
		s3 = anadirEspacios(c.Apellidos, 3)
		s4 = c.Teléfono
		
		str = $"${s1}${s2}${s3}${s4}"$
		CustomListView1.AddTextItem(str, c.ID)
	Next
End Sub

'Esta rutina añade más espacios a los 3 primeros ítems de la lista
'ID tendrá más espacio hasta alcanzar 8 caracteres, 
'Nombre y Apellidos tendrán hasta 20 caracteres
Private Sub anadirEspacios(s1 As String, pos As Int) As String 
	If pos = 1 Then 
		Do While s1.Length <= 8 Then
			s1 = s1 & " "
		Loop
	else if pos = 2 Or pos = 3 Then 
		Do While s1.Length <= 20 Then
			s1 = s1 & " "
		Loop
	End If
	Return s1
End Sub

'Muestra el contenido de un Cliente
Private Sub LogCliente(cli As Cliente)
	Log(cli.ID)
	Log(cli.Nombre)
	Log(cli.Apellidos)
	Log(cli.Teléfono)
End Sub

'Cuando se hace clic en un ítem de la lista
Private Sub CustomListView1_ItemClick (Índice As Int, Valor As Object)
	borrarRegistro(Índice, Valor)
	Log(Índice & " " & Valor)
End Sub


'Borrar entrada de la CLV, de la lista y del fichero KVS
Private Sub borrarRegistro(índice As Int, valor As Object) 
	Dim dlg As Object 
	dlg = xui.Msgbox2Async("¿Quieres borrar el Cliente?", "Advertencia", "Sí", "", "No", Null)
	Wait for (dlg) Msgbox_Result (Result As Int)
	If Result = xui.DialogResponse_Positive Then 
		CustomListView1.RemoveAt(índice)
		Clientes.RemoveAt(índice)
		ficheroKVS.Remove(valor)
	End If 
	btnCargar_Click
End Sub 

'Creates a dialog box to fet new Cliente
Private Sub btnInsertar_Click
	dialog.Initialize(Root)
	dialog.Title = "Insertar Cliente"
	
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0,0,0, 350dip, 250dip)
	
	p.LoadLayout("dlgInsertCustomer")
	dialog.PutAtTop = True
	Wait For (dialog.ShowCustom(p, "OK", "", "Cancel")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		Private nuevoCliente As Cliente
		nuevoCliente.ID = txtID.Text
		nuevoCliente.Nombre = txtNombre.Text
		nuevoCliente.Apellidos = txtApellidos.Text
		nuevoCliente.Teléfono = txtTeléfono.Text
		Clientes.Add(nuevoCliente)
		btnCargar_Click
	End If
End Sub

' Crea Clientes iniciales
Private Sub crearLista
	Private cli As Cliente 
	cli.Initialize
	cli.ID = "A3473"
	cli.Nombre = "John"
	cli.Apellidos = "Smith"
	cli.Teléfono = "4563454" 
	Clientes.Add(cli)
	
	Private cli As Cliente
	cli.Initialize
	cli.ID = "X51462"
	cli.Nombre = "Paraskevas"
	cli.Apellidos = "Xatjixaralampos"
	cli.Teléfono = "612978323"
	Clientes.Add(cli)


	Private cli As Cliente
	cli.Initialize
	cli.ID = "B1753"
	cli.Nombre = "Selim"
	cli.Apellidos = "Al Huarizmi"
	cli.Teléfono = "6532578"
	Clientes.Add(cli)
	
	Private cli As Cliente
	cli.Initialize
	cli.ID = "C6544"
	cli.Nombre = "Mateo"
	cli.Apellidos = "Sandor"
	cli.Teléfono = "7345346"
	Clientes.Add(cli)
	
	Private cli As Cliente
	cli.Initialize
	cli.ID = "C6323"
	cli.Nombre = "Lucía"
	cli.Apellidos = "Graham"
	cli.Teléfono = "1231345"
	Clientes.Add(cli)
	
	Private cli As Cliente
	cli.Initialize
	cli.ID = "F1462"
	cli.Nombre = "Noam"
	cli.Apellidos = "Bell"
	cli.Teléfono = "6978323"
	Clientes.Add(cli)
End Sub

'When Save Button clicked
Private Sub btnGuardarFichero_Click
	guardarFichero 
End Sub

'Guarda la lista en un fichero KVS
Private Sub guardarFichero
	File.MakeDir(File.DirTemp, "tema18")
	ficheroKVS.Initialize(File.DirTemp & "tema18", "ej1.dat")
	Log(File. DirTemp  & "tema18")
	For i = 0 To Clientes.Size - 1
		Private clienteSalvado As Cliente
		clienteSalvado = Clientes.Get(i)
		ficheroKVS.Put(clienteSalvado.ID, clienteSalvado)
	Next
End Sub

'Cuando se pulse en "CargarFichero"
Private Sub btnCargarFichero_Click
	cargarFichero
End Sub

'Carga el fichero KVS en la lista e invocar la carga
Private Sub cargarFichero
	ficheroKVS.Initialize(File.DirTemp & "tema18", "ej1.dat")
	Private lstClaves As List = ficheroKVS.ListKeys
	Clientes.Initialize
	For i = 0 To lstClaves.Size-1
		Private cli As Cliente
		cli = ficheroKVS.Get(lstClaves.Get(i))
		Clientes.Add(cli)
	Next
	btnCargar_Click
End Sub
	