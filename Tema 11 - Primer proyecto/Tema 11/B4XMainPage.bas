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
	Public  movil1, movil2, movil3, movil4 As Movil
	Public  movil5, movil6, movil7, movil8 As Movil
	Public  pgMoviles As B4XPagesMoviles
	Private pgAlmacen As B4XPageAlmacen
	Private pgIngresos As B4XPageIngresos
	Public  fltIngresosTotales As Float 		'Variable para contar los ingresos totales
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	fltIngresosTotales = 0 		' Al principio, hemos ganado 0
	pgMoviles.Initialize
	B4XPages.AddPage("pgMoviles", pgMoviles)
	pgAlmacen.Initialize
	B4XPages.AddPage("pgAlmacen", pgAlmacen)
	pgIngresos.Initialize
	B4XPages.AddPage("pgIngresos", pgIngresos)

	insertarMoviles
End Sub

'Esta subrutina crea los 8 teléfonos
Private Sub insertarMoviles 
	movil1.Initialize
	movil1.nuevoMovil("Yallomi", "6.53", 64, 4,  "Mediatek", 12, "Android", 150)
	movil2.Initialize
	movil2.nuevoMovil("Smith", "6.67", 64, 4, "Qualcomm", 4, "Android", 220)
	movil3.Initialize
	movil3.nuevoMovil("Taurus", "6.1", 128, 4, "Bionic", 7, "IOS", 780)
	movil4.Initialize
	movil4.nuevoMovil("Talisman", "5.8", 64, 4, "Mediatek", 12, "Android", 150)
	movil5.Initialize
	movil5.nuevoMovil("Cranberry", "5.8", 32, 3, "Mediatek", 16, "Android", 130)
	movil6.Initialize
	movil6.nuevoMovil("OzOn", "5.8", 32, 2, "Mediatek", 16, "Android", 90)
	movil7.Initialize
	movil7.nuevoMovil("H2O", "5.8", 64, 3, "Qualcomm", 2, "Android", 170)
	movil8.Initialize
	movil8.nuevoMovil("Zeus", "6.67", 128, 6, "Qualcomm", 4, "Android", 650)
End Sub


Private Sub btnAlmacen_Click
	B4XPages.ShowPage("pgAlmacen")
End Sub

Private Sub btnIngresos_Click
	B4XPages.ShowPage("pgIngresos")
End Sub

Private Sub btnComprar_Click
 	B4XPages.ShowPage("pgMoviles") 
End Sub