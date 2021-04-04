B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	'Form Labels
	Private lblMovil1 As Label
	Private lblMovil2 As Label
	Private lblMovil3 As Label
	Private lblMovil4 As Label
	Private lblMovil5 As Label
	Private lblMovil6 As Label
	Private lblMovil7 As Label
	Private lblMovil8 As Label
	Private lblPrecio1 As Label
	Private lblPrecio2 As Label
	Private lblPrecio3 As Label
	Private lblPrecio4 As Label
	Private lblPrecio5 As Label
	Private lblPrecio6 As Label
	Private lblPrecio7 As Label
	Private lblPrecio8 As Label
	
	Public intMovilClicked As Int 		
	Public pgMostrarMovil As B4XPageMostrarMovil
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("frmMoviles")
	pgMostrarMovil.Initialize
	B4XPages.AddPage("pgMostrar", pgMostrarMovil)
End Sub

Private Sub B4XPage_Appear 
	insertValues
End Sub

Private Sub insertValues
	lblMovil1.Text = B4XPages.MainPage.movil1.strNombre
	lblMovil2.Text = B4XPages.MainPage.movil2.strNombre
	lblMovil3.Text = B4XPages.MainPage.movil3.strNombre
	lblMovil4.Text = B4XPages.MainPage.movil4.strNombre
	lblMovil5.Text = B4XPages.MainPage.movil5.strNombre
	lblMovil6.Text = B4XPages.MainPage.movil6.strNombre
	lblMovil7.Text = B4XPages.MainPage.movil7.strNombre
	lblMovil8.Text = B4XPages.MainPage.movil8.strNombre
	lblPrecio1.Text = B4XPages.MainPage.movil1.fltPrecio & " $"
	lblPrecio2.Text = B4XPages.MainPage.movil2.fltPrecio & " $"
	lblPrecio3.Text = B4XPages.MainPage.movil3.fltPrecio & " $"
	lblPrecio4.Text = B4XPages.MainPage.movil4.fltPrecio & " $"
	lblPrecio5.Text = B4XPages.MainPage.movil5.fltPrecio & " $"
	lblPrecio6.Text = B4XPages.MainPage.movil6.fltPrecio & " $"
	lblPrecio7.Text = B4XPages.MainPage.movil7.fltPrecio & " $"
	lblPrecio8.Text = B4XPages.MainPage.movil8.fltPrecio & " $"
End Sub

Private Sub lblMovil1_MouseClicked (EventData As MouseEvent)
	intMovilClicked = 1
	B4XPages.ShowPage("pgMostrar")
End Sub

Private Sub lblMovil2_MouseClicked (EventData As MouseEvent)
	intMovilClicked = 2
	B4XPages.ShowPage("pgMostrar")
End Sub

Private Sub lblMovil3_MouseClicked (EventData As MouseEvent)
	intMovilClicked = 3
	B4XPages.ShowPage("pgMostrar")
End Sub

Private Sub lblMovil4_MouseClicked (EventData As MouseEvent)
	intMovilClicked = 4
	B4XPages.ShowPage("pgMostrar")
End Sub

Private Sub lblMovil5_MouseClicked (EventData As MouseEvent)
	intMovilClicked = 5
	B4XPages.ShowPage("pgMostrar")
End Sub

Private Sub lblMovil6_MouseClicked (EventData As MouseEvent)
	intMovilClicked = 6
	B4XPages.ShowPage("pgMostrar")
End Sub

Private Sub lblMovil7_MouseClicked (EventData As MouseEvent)
	intMovilClicked = 7
	B4XPages.ShowPage("pgMostrar")
End Sub

Private Sub lblMovil8_MouseClicked (EventData As MouseEvent)
	intMovilClicked = 8
	B4XPages.ShowPage("pgMostrar")
End Sub

