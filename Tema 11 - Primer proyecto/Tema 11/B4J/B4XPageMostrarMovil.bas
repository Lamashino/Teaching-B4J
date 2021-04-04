B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private lblCPU As Label
	Public  lblNombre As Label		' Necesitamos esta información de la pantalla de venta
	Private lblCapacidad As Label
	Private lblOS As Label
	Private lblRam As Label
	Private lblPantalla As Label
	Private lblCantidad As Label
	Public  lblTotal As Label		' Necesitamos esta información de la pantalla de venta
	Public  txtCantidad As TextField ' Necesitamos esta información de la pantalla de venta
	
	Public pgVender As B4XPageVender
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("frmMostrarMovil")
	pgVender.Initialize
	B4XPages.AddPage("pgVender", pgVender)
End Sub

Private Sub B4XPage_Appear
	cargarValores
End Sub


'Comrprobar el valor público intMovilClicked desde B4XPagesMovil y leer los valores
'de los objetos
'Para profesores: Esta es una forma muy rudimentaria de cargar estos valores,
'pero para los estudiantes es la única que saben hacer por ahora
Private Sub cargarValores
	If B4XPages.MainPage.pgMoviles.intMovilClicked = 1 Then
		lblCPU.Text = B4XPages.MainPage.movil1.strCPU
	  	lblNombre.Text = B4XPages.MainPage.movil1.strNombre
	  	lblCapacidad.Text = B4XPages.MainPage.movil1.intCapacidad
	 	lblOS.Text = B4XPages.MainPage.movil1.strOS
		lblRam.Text = B4XPages.MainPage.movil1.fltRAM
		lblPantalla.Text = B4XPages.MainPage.movil1.strPantalla
		lblCantidad.Text = B4XPages.MainPage.movil1.intCantidad
		lblTotal.Text = B4XPages.MainPage.movil1.fltPrecio
		txtCantidad.Text = 1
	else if B4XPages.MainPage.pgMoviles.intMovilClicked = 2 Then
		lblCPU.Text = B4XPages.MainPage.movil2.strCPU
		lblNombre.Text = B4XPages.MainPage.movil2.strNombre
		lblCapacidad.Text = B4XPages.MainPage.movil2.intCapacidad
		lblOS.Text = B4XPages.MainPage.movil2.strOS
		lblRam.Text = B4XPages.MainPage.movil2.fltRAM
		lblPantalla.Text = B4XPages.MainPage.movil2.strPantalla
		lblCantidad.Text = B4XPages.MainPage.movil2.intCantidad
		lblTotal.Text = B4XPages.MainPage.movil2.fltPrecio
		txtCantidad.Text = 1
	else if B4XPages.MainPage.pgMoviles.intMovilClicked = 3 Then
		lblCPU.Text = B4XPages.MainPage.movil3.strCPU
		lblNombre.Text = B4XPages.MainPage.movil3.strNombre
		lblCapacidad.Text = B4XPages.MainPage.movil3.intCapacidad
		lblOS.Text = B4XPages.MainPage.movil3.strOS
		lblRam.Text = B4XPages.MainPage.movil3.fltRAM
		lblPantalla.Text = B4XPages.MainPage.movil3.strPantalla
		lblCantidad.Text = B4XPages.MainPage.movil3.intCantidad
		lblTotal.Text = B4XPages.MainPage.movil3.fltPrecio
		txtCantidad.Text = 1	
	else if B4XPages.MainPage.pgMoviles.intMovilClicked = 4 Then
		lblCPU.Text = B4XPages.MainPage.movil4.strCPU
		lblNombre.Text = B4XPages.MainPage.movil4.strNombre
		lblCapacidad.Text = B4XPages.MainPage.movil4.intCapacidad
		lblOS.Text = B4XPages.MainPage.movil4.strOS
		lblRam.Text = B4XPages.MainPage.movil4.fltRAM
		lblPantalla.Text = B4XPages.MainPage.movil4.strPantalla
		lblCantidad.Text = B4XPages.MainPage.movil4.intCantidad
		lblTotal.Text = B4XPages.MainPage.movil4.fltPrecio
		txtCantidad.Text = 1
	else if B4XPages.MainPage.pgMoviles.intMovilClicked = 5 Then
		lblCPU.Text = B4XPages.MainPage.movil5.strCPU
		lblNombre.Text = B4XPages.MainPage.movil5.strNombre
		lblCapacidad.Text = B4XPages.MainPage.movil5.intCapacidad
		lblOS.Text = B4XPages.MainPage.movil5.strOS
		lblRam.Text = B4XPages.MainPage.movil5.fltRAM
		lblPantalla.Text = B4XPages.MainPage.movil5.strPantalla
		lblCantidad.Text = B4XPages.MainPage.movil5.intCantidad
		lblTotal.Text = B4XPages.MainPage.movil5.fltPrecio
		txtCantidad.Text = 1			
	else if B4XPages.MainPage.pgMoviles.intMovilClicked = 6 Then
		lblCPU.Text = B4XPages.MainPage.movil6.strCPU
		lblNombre.Text = B4XPages.MainPage.movil6.strNombre
		lblCapacidad.Text = B4XPages.MainPage.movil6.intCapacidad
		lblOS.Text = B4XPages.MainPage.movil6.strOS
		lblRam.Text = B4XPages.MainPage.movil6.fltRAM
		lblPantalla.Text = B4XPages.MainPage.movil6.strPantalla
		lblCantidad.Text = B4XPages.MainPage.movil6.intCantidad
		lblTotal.Text = B4XPages.MainPage.movil6.fltPrecio
		txtCantidad.Text = 1
	else if B4XPages.MainPage.pgMoviles.intMovilClicked = 7 Then
		lblCPU.Text = B4XPages.MainPage.movil7.strCPU
		lblNombre.Text = B4XPages.MainPage.movil7.strNombre
		lblCapacidad.Text = B4XPages.MainPage.movil7.intCapacidad
		lblOS.Text = B4XPages.MainPage.movil7.strOS
		lblRam.Text = B4XPages.MainPage.movil7.fltRAM
		lblPantalla.Text = B4XPages.MainPage.movil7.strPantalla
		lblCantidad.Text = B4XPages.MainPage.movil7.intCantidad
		lblTotal.Text = B4XPages.MainPage.movil7.fltPrecio
		txtCantidad.Text = 1	
	else if B4XPages.MainPage.pgMoviles.intMovilClicked = 8 Then
		lblCPU.Text = B4XPages.MainPage.movil8.strCPU
		lblNombre.Text = B4XPages.MainPage.movil8.strNombre
		lblCapacidad.Text = B4XPages.MainPage.movil8.intCapacidad
		lblOS.Text = B4XPages.MainPage.movil8.strOS
		lblRam.Text = B4XPages.MainPage.movil8.fltRAM
		lblPantalla.Text = B4XPages.MainPage.movil8.strPantalla
		lblCantidad.Text = B4XPages.MainPage.movil8.intCantidad
		lblTotal.Text = B4XPages.MainPage.movil8.fltPrecio
		txtCantidad.Text = 1	
	End If 		
End Sub 


Private Sub btnVender_Click
	If txtCantidad.Text <= lblCantidad.Text Then 
		B4XPages.ShowPage("pgVender")
	Else
		xui.MsgboxAsync("Error: stock insuficiente en almacén", "")
	End If 
End Sub

Private Sub btnVolver_Click
	B4XPages.ClosePage(Me) 
End Sub

Private Sub txtCantidad_TextChanged (Viejo As String, Nuevo As String)
	If Nuevo <> "" Then 
		lblTotal.Text = B4XPages.MainPage.movil8.fltPrecio * Nuevo
	Else
		lblTotal.Text = 0
	End If 
End Sub
