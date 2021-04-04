B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	
	Private lblIngresos As Label
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("frmIngresos")
End Sub

Private Sub B4XPage_Appear
	cargarDatos	
End Sub

Private Sub cargarDatos
	lblIngresos.Text =  B4XPages.MainPage.fltIngresosTotales
End Sub
