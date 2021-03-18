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
	Private txtAsientos As TextField
	Private txtTipo As TextField
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	txtTipo.Text = ""
	txtAsientos.Text = ""
End Sub


Private Sub btnCalcular_Click
	Private intS, intT As Int 

	If txtTipo.Text <> "" And txtAsientos.Text <> "" Then
		intS = txtAsientos.Text
		intT = txtTipo.Text
		lblMensaje.Text = calcTotal(intT, intS)
	End If 
End Sub

Private Sub calcTotal(t As Int, s As Int) As Int 
	If t = 1 Then
		Return s * 20
	else if t = 2 Then 
		Return s * 30
	else if t = 3 Then 
		Return s * 40 
	Else
		xui.MsgboxAsync("Categoría errónea" ,"") 
	End If
	Return 0
End Sub
