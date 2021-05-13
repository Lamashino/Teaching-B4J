B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Type Estudiante(ID As String, Apellidos As String, Nombre As String, Dirección As String, Teléfono As String)
	Public Estudiante1 As Estudiante
	Public Estudiante2 As Estudiante
	Private listaEstudiantes As List 
	Private mapaEstudiantes As Map
	Private kvsFile As KeyValueStore
End Sub

Public Sub Initialize
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	Estudiante1.ID = "FS23534X21"
	Estudiante1.Apellidos = "Ioannidis"
	Estudiante1.Nombre = "Alkinoos"
	Estudiante1.Dirección = "Atenas, Grecia"
	Estudiante1.Teléfono = "+303465854234"

	Log(Estudiante1)
	
	listaEstudiantes.Initialize
	listaEstudiantes.Add(Estudiante1)
	
	For i = 0 To listaEstudiantes.Size-1
		Private est As Estudiante
		est = listaEstudiantes.Get(i)
		LogEstudiante(est)
	Next
	
	mapaEstudiantes.Initialize
	mapaEstudiantes.Put(Estudiante1.ID, Estudiante1)
	
	File.MakeDir(File.DirTemp, "tema18")
	kvsFile.Initialize(File.DirTemp & "tema18", "kvsData.dat")
	Log(File.DirTemp & "tema18")
	
	kvsFile.Put(Estudiante1.ID, Estudiante1)
	kvsFile.PutMapAsync(mapaEstudiantes)
'	kvsFile.
	Private Estudiante3 As Estudiante
	If kvsFile.ContainsKey("FS23534X21") Then 
		Estudiante3 = kvsFile.Get("FS23534X21")
	Else
		Log("Clave ID errónea") 
	End If 
	
	Log("Mostrar claves") 
	Private claves As List = kvsFile.ListKeys
	For i = 0 To claves.Size-1
		Log(claves.Get(i))
	Next
	
	'Log(newMap.Get("FS23534X21")) 
	LogEstudiante(Estudiante3)
	
End Sub

Private Sub LogEstudiante(est As Estudiante)
	Log(est.Nombre)
	Log(est.Apellidos)
	Log(est.Dirección)
	Log(est.Teléfono)
End Sub

