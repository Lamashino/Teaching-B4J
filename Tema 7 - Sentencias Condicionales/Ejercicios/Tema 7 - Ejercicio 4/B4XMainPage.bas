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
	Private txtMeme As TextArea
	Private txtWikipedia As TextArea
	Private lblTotal As Label
	Private lblMensaje2 As Label
End Sub

Public Sub Initialize
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
End Sub


Private Sub btnCalcular_Click
	lblTotal.Text = txtMeme.Text * 0.05 + txtWikipedia.Text * 0.1 
	If lblTotal.Text > 100 Then 
		lblMensaje.Text = "Consumo excesivo"
	End If
	If txtMeme.Text * 0.05 > txtWikipedia.Text * 0.1 Then
		lblMensaje.Text = "Demasiados memes"
	End If
End Sub