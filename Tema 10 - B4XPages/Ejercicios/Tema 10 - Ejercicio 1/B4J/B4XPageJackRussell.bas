B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private txtArInfos As TextArea
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

' Este evento se invocará una única vez, antes de que la página sea visible
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
'load the layout to Root
	Root.LoadLayout("frmJack")
	txtArInfos.Text = $"
		Desarrollado en Inglaterra hace unos 200 años Para cazar zorros, el Jack Russell Terrier, también conocido como Parson Russell Terrier, es un perrito vivo, independiente e inteligente. Son encantadores y cariñosos, pero también son difíciles de entrenar y administrar. ¡Solo para padres de perros con experiencia!
        Aunque estos son perros de raza pura, es posible que aún los encuentres en refugios y rescates. ¡Recuerde adoptar! No compre si esta es la raza para usted.
        Al principio, este perro pequeño, adorable y cariñoso puede parecer una buena opción para los nuevos dueños de mascotas y los habitantes de apartamentos. Pero es posible que se sorprenda de la energía e intensidad de este pequeño cachorro. Estos perros necesitan mucho ejercicio y entrenamiento firme y constante, o bien pueden comportarse con comportamientos no deseados. Dicho esto, si sabes cómo manejar un poco de alboroto y puedes seguir el ritmo de un cachorro enérgico, serás recompensado con un amigo amoroso y leal de por vida.

	"$ 
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.