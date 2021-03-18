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
	Private txtRadio As TextField
End Sub

Public Sub Initialize
	
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
End Sub



Private Sub btnCalcular_Click
	Private fltRadio As Float = txtRadio.Text     'fltRadio se usa únicamente para facilitar
	lblMensaje.Text = calcularArea(fltRadio)	  'la comprensión del programa
End Sub

Private Sub calcularArea(r As Float) As Float 
	Return (3.14 * r * r) 
End Sub
