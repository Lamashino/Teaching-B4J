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
	Private txtEdFísica As TextField
	Private txtFísicaQuímica As TextField
	Private txtGeoHistoria As TextField
	Private txtInformática As TextField
	Private txtInglés As TextField
	Private txtLengua As TextField
	Private txtMatemáticas As TextField
	Private txtMedia As TextField
	Private txtMúsica As TextField
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	
	' Tan pronto creamos la aplicación, ponemos todas las notas a 0
	txtEdFísica.Text = 0
	txtFísicaQuímica.Text = 0
	txtGeoHistoria.Text = 0
	txtInformática.Text = 0
	txtInglés.Text = 0
	txtLengua.Text = 0
	txtMatemáticas.Text = 0
	txtMúsica.Text = 0
	txtMedia.Text = 0
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub btnCalcular_Click
	If (txtFísicaQuímica.Text >= 0 And txtFísicaQuímica.Text <= 10 ) Then
		If ( txtEdFísica.Text >= 0 And txtEdFísica.Text <=10 ) Then
			If ( txtGeoHistoria.text >= 0 And txtGeoHistoria.Text <= 10 ) Then
				If ( txtInformática.text >= 0 And txtInformática.text <= 10 ) Then
					If (txtInglés.text >= 0 And txtInglés.text <= 10 ) Then
						If (txtLengua.text >= 0 And txtLengua.Text <= 10 ) Then
							If  (txtMatemáticas.text >= 0 And txtMatemáticas.text <= 10 ) Then
								If (txtMúsica.text >= 0 And txtMúsica.Text <= 10 ) Then
									' Sumamos todas las notas y dividimos por 8
									txtMedia.Text = (txtFísicaQuímica.Text + txtEdFísica.Text+txtGeoHistoria.text+ _
									                txtInformática.text+ txtInglés.text+txtLengua.text+ _ 
													txtMatemáticas.text+txtMúsica.text)/8
								Else
									xui.MsgboxAsync("Música debe estar entre 0 y 10", "")
								End If
							Else
								xui.MsgboxAsync("Matemáticas debe estar entre 0 y 10", "")
							End If
						Else
							xui.MsgboxAsync("Lengua debe estar entre 0 y 10", "")
						End If
					Else
						xui.MsgboxAsync("Inglés debe estar entre 0 y 10", "")
					End If
				Else
					xui.MsgboxAsync("Informática debe estar entre 0 y 10", "")
				End If
			Else
				xui.MsgboxAsync("Geografía e Historia debe estar entre 0 y 10", "")
			End If
		Else
			xui.MsgboxAsync("Educación Física debe estar entre 0 y 10", "")
		End If
	Else
		xui.MsgboxAsync("Física y Química debe estar entre 0 y 10", "")
	End If
End Sub