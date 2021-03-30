B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region


' 1.	La pequeña enciclopedia de los perros. Crea una aplicación donde 3 razas de perros
' diferentes se muestren en una pantalla de inicio y, tras hacer clic en el nombre correspondiente,
' se muestre información acerca de la raza junto con dos fotos.

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private pgGolden As B4XPageGoldenRetriever
	Private pgBeagle As B4XPageBeagle
	Private pgJack As B4XPageJackRussell
End Sub

Public Sub Initialize
	
End Sub
' El objetivo de este ejercicio es practicar creando B4XPages
' Puedes decirles que creen sólo 1 página y envíen datos desde
' la MainPage como se ha visto en clase.

' Este evento se invocará una única vez, antes de que la página sea visible
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	pgGolden.Initialize
	B4XPages.AddPage("pg1", pgGolden)
	pgBeagle.Initialize
	B4XPages.AddPage("pg2", pgBeagle)
	pgJack.Initialize
	B4XPages.AddPage("pg3", pgJack)
End Sub

Private Sub Button1_Click
	B4XPages.ShowPage("pg1") 
End Sub

Private Sub Button2_Click
	B4XPages.ShowPage("pg2") 
End Sub

Private Sub Button3_Click
	B4XPages.ShowPage("pg3") 
End Sub
