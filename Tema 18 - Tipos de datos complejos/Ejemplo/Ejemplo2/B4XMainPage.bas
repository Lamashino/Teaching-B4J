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
	Private lstItems As List 

	Private B4XComboBox1 As B4XComboBox
	Private CustomListView1 As CustomListView
	Private lblFecha As Label
	Private lblCmbFecha As Label
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	lstItems.Initialize
	lstItems.AddAll(Array As String("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"))

	B4XComboBox1.SetItems(lstItems) 
	For i = 0 To lstItems.Size-1 
		CustomListView1.AddTextItem(lstItems.Get(i), i)

	Next
End Sub


Private Sub Button1_Click
	xui.MsgboxAsync("¡Hola Mundo!", "B4X")
End Sub


Private Sub CustomListView1_ItemClick (Índice As Int, Valor As Object)
	lblFecha.Text = Valor
End Sub

Private Sub B4XComboBox1_SelectedIndexChanged (Índice As Int)
	lblCmbFecha.Text = Índice
End Sub