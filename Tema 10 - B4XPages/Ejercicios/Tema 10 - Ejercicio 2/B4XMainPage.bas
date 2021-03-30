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

'2.	Construye una aplicación que resuelva:
'a.	La ecuación de primer grado ax+b=0, 
'b.	La ecuación de segundo grado ax a2+bx+c=0
'c.	Calcule la hipotenusa de un triángulo dadas las longitudes de los dos lados verticales.
' La raíz cuadrada de un número x se calcula con sqrt(x).

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private pg1 As B4XPagePrimerGrado
	Private pg2 As B4XPageSegundoGrado
	Private pg3 As B4XPageTriangulo
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	pg1.Initialize
	B4XPages.AddPage("Primer grado", pg1)
	pg2.Initialize
	B4XPages.AddPage("Segundo grado", pg2)
	pg3.Initialize
	B4XPages.AddPage("Triángulo", pg3)
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub Button1_Click
	B4XPages.ShowPage("Primer grado")	
End Sub

Private Sub Button3_Click
	B4XPages.ShowPage("Triángulo") 
End Sub

Private Sub Button2_Click
	B4XPages.ShowPage("Segundo grado")
End Sub