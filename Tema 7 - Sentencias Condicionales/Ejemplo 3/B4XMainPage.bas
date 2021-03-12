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
	Private btnCalcular As Button
	Private lblMostrar As Label
	Private txtComida As TextField
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
End Sub

Private Sub btnCalcular_Click
	If txtComida.Text = "Hamburguesa" Then
		lblMostrar.Text = "Hamburguesa 5€"
	else if txtComida.Text = "Pizza" Then
		lblMostrar.Text = "Pizza 3€"
	else if txtComida.Text = "Salchicha" Then
		lblMostrar.Text = "Salchicha 1.5€"
	Else
		lblMostrar.Text = "Entrada incorrecta. Inténtalo de nuevo"
	End If
End Sub