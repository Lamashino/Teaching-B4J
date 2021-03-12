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
	Private txtCantidad As TextField
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
End Sub



Private Sub btnCalcular_Click
	Private fltTotal As Float 
	
	If txtCantidad.text < 200 Then
		fltTotal = txtCantidad.text * 0.70
		lblMensaje.Text = "Coste total = " & fltTotal
	Else
		fltTotal = txtCantidad.text * 0.50
		lblMensaje.Text = "Coste total = " & fltTotal
	End If
	
End Sub