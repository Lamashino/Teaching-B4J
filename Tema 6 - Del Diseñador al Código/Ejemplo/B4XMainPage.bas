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
	Private txtTotal As TextField
	Private btnCalcular As Button
	Private txtNúmero1 As TextField
	Private txtNúmero2 As TextField
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.


Private Sub btnCalcular_Click
	txtTotal.Text = txtNúmero1.Text + txtNúmero2.Text
End Sub

Private Sub btnBorrar_Click
	txtTotal.Text = ""
	txtNúmero1.Text = ""
	txtNúmero2.Text = ""
End Sub

