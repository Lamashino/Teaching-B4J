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
	Private page1 As B4XPage1
End Sub

Public Sub Initialize
	
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	page1.Initialize
	B4XPages.AddPage("mi primera página", page1)
End Sub

Private Sub Button1_Click
	
	B4XPages.ShowPage("mi primera página")
	
	'B4XPages.ShowPageAndRemovePreviousPages("mi primera página")

End Sub

