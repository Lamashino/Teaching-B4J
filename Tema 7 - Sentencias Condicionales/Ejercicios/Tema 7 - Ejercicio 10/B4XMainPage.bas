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
	Private lblMensaje As Label
	Private txtDuración As TextField
End Sub

Public Sub Initialize
	
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
End Sub

Private Sub btnCalcular_Click
	Private fltFee As Float 
	If txtDuración.Text <= 1 Then
		fltFee = 3.5
	else if txtDuración.Text <= 3 Then
		fltFee = 3.5 + (txtDuración.Text - 1) * 8
	Else if txtDuración.Text <= 5 Then
		fltFee = 3.5 + 16 + (txtDuración.Text - 3) * 12
	Else 
		fltFee = 3.5 + 16 + 24 + (txtDuración.Text - 5) * 15
	End If
	lblMensaje.Text = "Total a pagar = " & fltFee
End Sub