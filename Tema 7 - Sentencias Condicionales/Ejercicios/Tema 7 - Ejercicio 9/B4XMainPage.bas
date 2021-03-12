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
	Private btnComprobar As Button
	Private btnMax As Button
	Private lblMensaje As Label
	Private txtPrimerIntento As TextField
	Private txtSegundoIntento As TextField
	Private txtTercerIntento As TextField
	Private txtCuartoIntento As TextField
	Private txtQuintoIntento As TextField
	Private txtSextoIntento As TextField
End Sub

Public Sub Initialize
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	txtCuartoIntento.Visible = False
	txtQuintoIntento.Visible = False
	txtSextoIntento.Visible = False
	btnMax.Visible = False 
End Sub

Private Sub btnComprobar_Click
	If txtPrimerIntento.Text > 7.5 Or txtSegundoIntento.Text > 7.5 Or txtTercerIntento.Text > 7.5 Then
		txtCuartoIntento.Visible = True
		txtQuintoIntento.Visible = True
		txtSextoIntento.Visible = True
		btnMax.Visible = True 
	Else
		lblMensaje.Text = "Descalificado"
	End If
	
End Sub


Private Sub btnMax_Click
	Private MAX1 As Float
	
	MAX1 = txtPrimerIntento.Text
	If MAX1 < txtSegundoIntento.Text Then
		MAX1 = txtSegundoIntento.text
	End If
	If MAX1 < txtTercerIntento.Text Then
		MAX1 = txtTercerIntento.text
	End If
	If MAX1 < txtCuartoIntento.Text Then
		MAX1 = txtCuartoIntento.text
	End If
	If MAX1 < txtQuintoIntento.Text Then
		MAX1 = txtQuintoIntento.text
	End If
	If MAX1 < txtSextoIntento.Text Then
		MAX1 = txtSextoIntento.text
	End If
	
	lblMensaje.Text = "Mejor intento = " & MAX1
	
End Sub