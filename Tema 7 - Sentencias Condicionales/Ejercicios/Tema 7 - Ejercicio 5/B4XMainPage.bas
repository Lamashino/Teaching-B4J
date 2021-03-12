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
	Private btnCalcular As Button
	Private lblMensaje As Label
	Private txtHoras As TextField
	Private txtMiembro As TextField
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
End Sub


Private Sub btnCalcular_Click
	Private fltTotal, fltCoste, fltImpuesto As Float
	Private strMiembro As String 
	
	If txtMiembro.Text = "Sí" Then
		fltImpuesto = 10
		fltCoste = 2
		strMiembro = "es miembro"
	Else 
		fltImpuesto = 20
		fltCoste = 5
		strMiembro = "no es miembro"
	End If
	
	fltTotal = fltCoste * txtHoras.Text + fltCoste * txtHoras.Text / fltImpuesto
	lblMensaje.Text = "El usuario " & strMiembro & " y ha estado " & txtHoras.text & " horas por " &  fltCoste & "€/hora más " & _
		 fltImpuesto  & "% de impuesto, que hace un total de " & fltTotal &"€"
		
	
End Sub