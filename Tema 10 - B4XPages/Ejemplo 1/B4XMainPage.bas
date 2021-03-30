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
	Private página1 As B4XPage1
	Private Boton1 As Button
End Sub

Public Sub Initialize
	
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	página1.Initialize
	B4XPages.AddPage("Mi primera página", página1)
End Sub


Private Sub Boton1_Click
	
	B4XPages.ShowPage("Mi primera página")
	
	'B4XPages.ShowPageAndRemovePreviousPages("Mi primera página")	
End Sub