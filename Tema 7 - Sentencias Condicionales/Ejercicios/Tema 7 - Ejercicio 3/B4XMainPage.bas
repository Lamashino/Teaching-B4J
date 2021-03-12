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
	Private btnCalc As Button
	Private txtCoste As TextField
	Private txtComida As TextField
	Private txtCantidad As TextField
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
End Sub


Private Sub btnCalc_Click
'	Hamburguesa	5€
'	Pizza	3€
'	Salchicha	1,5€
	Private fltCoste As Float
	Private meal As String 
	
	If txtComida.text = "Salchicha" Then
		fltCoste = txtCantidad.Text * 1.5
		meal = "Salchicha"
	else if txtComida.text = "Pizza" Then
		fltCoste = txtCantidad.Text * 3
		meal = "Pizza"
	else if txtComida.text = "Hamburguesa" Then
		fltCoste = txtCantidad.Text * 5
		meal = "Hamburguesa"
	End If
	txtCoste.Text = txtCantidad.Text & " x " & meal & " " & fltCoste & " €"
End Sub

