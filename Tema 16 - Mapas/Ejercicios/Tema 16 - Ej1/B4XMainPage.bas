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
	Private Países As Map
	Private Capitales As Map
	Private lblCountry As Label
	Private txtCapital As B4XFloatTextField
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	Países.Initialize
	'1
	Países.Put("Cuba", "La Habana")
	Países.Put("Chipre", "Nicosia")
	Países.Put("Chequia", "Praga")
	Países.Put("Egipto", "El Cairo")
	Países.Put("Kenia", "Nairobi")
	Países.Put("México", "Ciudad de México")
	Países.Put("Perú", "Lima")
	Países.Put("Vietnam", "Hanoi")
	Países.Put("Portugal ", "Lisboa")
	
	
	'2
	Países.Put("Japón", "Tokio")
	Países.Put("Barbados", "Bridgetown")
	Países.Put("Fiji", "Suva")
	
	
	'3
	Log("Mostrar países y sus capitales")
	For Each país As String In Países.Keys
		Log(país & " " & Países.Get(país))
	Next
	
	
	'4
	Capitales.Initialize
	For Each país As String In Países.Keys
		Capitales.Put(Países.Get(país), país)
	Next
	Log("Mostrar capitales y sus países") 
	For Each Capital As String In Capitales.Keys
		Log(Capital & " " & Capitales.Get(Capital))
	Next

End Sub


'5 
Private Sub btnShow_Click
	If Capitales.ContainsKey(txtCapital.Text) Then
		lblCountry.Text = Capitales.Get(txtCapital.Text)
	Else
		lblCountry.Text = "No conozco " & txtCapital.text
	End If
End Sub