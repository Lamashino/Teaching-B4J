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
	Private libro1 As clsLibro
	Private libro2 As clsLibro
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	
	libro1.Initialize
	libro2.Initialize
	
	libro1.insertarLibro("Neuromante", "William Gibson", "1984", "Ace")
	libro2.insertarLibro("2001: Una odisea del espacio", "Arthur C. Clarke", "1968", "Ace")
	
	libro1.mostrarLibro
	libro2.mostrarLibro
End Sub

