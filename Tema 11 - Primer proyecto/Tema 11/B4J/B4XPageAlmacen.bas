B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private lblMovil1 As Label
	Private lblMovil2 As Label
	Private lblMovil3 As Label
	Private lblMovil4 As Label
	Private lblMovil5 As Label
	Private lblMovil6 As Label
	Private lblMovil7 As Label
	Private lblMovil8 As Label
	Private lblC1 As Label
	Private lblC2 As Label
	Private lblC3 As Label
	Private lblC4 As Label
	Private lblC5 As Label
	Private lblC6 As Label
	Private lblC7 As Label
	Private lblC8 As Label
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("frmAlmacen")
End Sub

Private Sub B4XPage_Appear 
	cargarDatos
End Sub

Private Sub cargarDatos
	lblMovil1.Text = B4XPages.MainPage.movil1.strNombre
	lblMovil2.Text = B4XPages.MainPage.movil2.strNombre
	lblMovil3.Text = B4XPages.MainPage.movil3.strNombre
	lblMovil4.Text = B4XPages.MainPage.movil4.strNombre
	lblMovil5.Text = B4XPages.MainPage.movil5.strNombre
	lblMovil6.Text = B4XPages.MainPage.movil6.strNombre
	lblMovil7.Text = B4XPages.MainPage.movil7.strNombre
	lblMovil8.Text = B4XPages.MainPage.movil8.strNombre
	lblC1.Text = B4XPages.MainPage.movil1.intCantidad
	lblC2.Text = B4XPages.MainPage.movil2.intCantidad
	lblC3.Text = B4XPages.MainPage.movil3.intCantidad
	lblC4.Text = B4XPages.MainPage.movil4.intCantidad
	lblC5.Text = B4XPages.MainPage.movil5.intCantidad
	lblC6.Text = B4XPages.MainPage.movil6.intCantidad
	lblC7.Text = B4XPages.MainPage.movil7.intCantidad
	lblC8.Text = B4XPages.MainPage.movil8.intCantidad
End Sub


