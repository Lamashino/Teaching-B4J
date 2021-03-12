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
	Private lblMensaje As Label
	Private txtCoste As TextField
	Private txtUbicación As TextField
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
End Sub



Private Sub btnCalcular_Click
	Private fltGastosEnvío, fltTotal As Float 
	
	If txtUbicación.text = "EEUU" Then
		fltGastosEnvío = 3
	else if txtUbicación.text = "Europa" Then
		fltGastosEnvío = 7
	else if txtUbicación.text = "Canadá" Then
		fltGastosEnvío = 5
	Else 
		fltGastosEnvío = 9
	End If
	fltTotal = fltGastosEnvío + txtCoste.Text
	
	lblMensaje.Text = " Tienes que pagar " & fltTotal & "€, " & txtCoste.Text & _
					  "€ por el producto y " & fltGastosEnvío & "€ por los gastos de envío"

End Sub