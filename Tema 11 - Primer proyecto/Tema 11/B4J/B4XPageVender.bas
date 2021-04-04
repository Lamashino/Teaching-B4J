B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private lblNombre As Label
	Private lblCantidad As Label
	Private lblTotal As Label
	Private txtDireccion As TextField
	Private txtNombre As TextField
	Private txtApellidos As TextField
End Sub


'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub


'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("frmVender")
End Sub


Private Sub B4XPage_Appear
	cargarValores
End Sub


Private Sub cargarValores
	lblNombre.Text = B4XPages.MainPage.pgMoviles.pgMostrarMovil.lblNombre.Text
	lblCantidad.Text = B4XPages.MainPage.pgMoviles.pgMostrarMovil.txtCantidad.Text
	lblTotal.Text = B4XPages.MainPage.pgMoviles.pgMostrarMovil.lblTotal.Text
End Sub


Private Sub btnVender_Click
	If B4XPages.MainPage.pgMoviles.intMovilClicked = 1 Then
		B4XPages.MainPage.movil1.intCantidad = B4XPages.MainPage.movil1.intCantidad - lblCantidad.Text
	else if B4XPages.MainPage.pgMoviles.intMovilClicked = 2 Then
		B4XPages.MainPage.movil2.intCantidad = B4XPages.MainPage.movil2.intCantidad - lblCantidad.Text
	else If B4XPages.MainPage.pgMoviles.intMovilClicked = 3 Then
		B4XPages.MainPage.movil3.intCantidad = B4XPages.MainPage.movil3.intCantidad - lblCantidad.Text
	else if B4XPages.MainPage.pgMoviles.intMovilClicked = 4 Then
		B4XPages.MainPage.movil4.intCantidad = B4XPages.MainPage.movil4.intCantidad - lblCantidad.Text
	else If B4XPages.MainPage.pgMoviles.intMovilClicked = 5 Then
		B4XPages.MainPage.movil5.intCantidad = B4XPages.MainPage.movil5.intCantidad - lblCantidad.Text
	else if B4XPages.MainPage.pgMoviles.intMovilClicked = 6 Then
		B4XPages.MainPage.movil6.intCantidad = B4XPages.MainPage.movil6.intCantidad - lblCantidad.Text
	else If B4XPages.MainPage.pgMoviles.intMovilClicked = 7 Then
		B4XPages.MainPage.movil7.intCantidad = B4XPages.MainPage.movil7.intCantidad - lblCantidad.Text
	else if B4XPages.MainPage.pgMoviles.intMovilClicked = 8 Then
		B4XPages.MainPage.movil8.intCantidad = B4XPages.MainPage.movil8.intCantidad - lblCantidad.Text
	End If 
	
	B4XPages.MainPage.fltIngresosTotales = B4XPages.MainPage.fltIngresosTotales + lblTotal.Text
	B4XPages.ShowPageAndRemovePreviousPages("MainPage")
End Sub


Private Sub btnVolver_Click
	B4XPages.ClosePage(Me)
End Sub

