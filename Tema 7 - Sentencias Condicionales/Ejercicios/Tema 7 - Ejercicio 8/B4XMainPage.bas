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
'	1-500	0.01
'	501-800	0.008
'	801+	0.005
	Private fltCoste As Float 
	
	If txtDuración.Text >= 1 And txtDuración.Text < 501 Then
		fltCoste = txtDuración.Text * 0.01
	else if txtDuración.Text >= 501 And txtDuración.Text <= 800 Then
		fltCoste = 500 * 0.01 + (txtDuración.Text - 500) * 0.008
	Else 
		fltCoste = 500 * 0.01 + 300 * 0.008 + (txtDuración.Text - 800) * 0.005
	End If
	fltCoste = fltCoste + 25 'Coste fijo
	lblMensaje.Text = "Coste total = " & fltCoste & "€"
	
End Sub