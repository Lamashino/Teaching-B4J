B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private lblNumero As Label
	Private fltNumero1, fltNumero2 As Float
	Private operacion As String 
	Private hecho As Boolean 
End Sub

Public Sub Initialize
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	lblNumero.Text = ""
	hecho = False
End Sub

Private Sub Numero_Click
	Dim b As Button
	b = Sender
	Log(b.Tag)
	If hecho Then
		lblNumero.Text = 0
		hecho = False
	End If
	lblNumero.Text = lblNumero.Text & b.Tag
End Sub

Private Sub btnBorrar_Click
	lblNumero.Text = 0
	fltNumero1 = 0
	fltNumero2 = 0
End Sub

Private Sub btnIg_Click
	fltNumero2 =  lblNumero.Text
	If operacion = "+" Then
		lblNumero.Text = fltNumero1 + fltNumero2
	else If operacion = "-" Then
		lblNumero.Text = fltNumero1 - fltNumero2
	else If operacion = "*" Then
		lblNumero.Text = fltNumero1 * fltNumero2
	else If operacion = "/" Then
		lblNumero.Text = fltNumero1 / fltNumero2
	End If 
	fltNumero1 = lblNumero.Text
	hecho = True
End Sub

Private Sub operacion_Click
	Dim b As Button
	b = Sender
	operacion = b.Tag
	fltNumero1 = lblNumero.Text
	lblNumero.Text = 0
End Sub