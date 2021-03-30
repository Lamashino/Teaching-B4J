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
	Root.LoadLayout("frmBeagle") 
	txtArInfos.Text = $"
		Pequeños, compactos y resistentes, los Beagles son compañeros activos tanto para niños como para adultos. Los caninos de esta raza de perros son alegres y amantes de la diversión, pero al ser perros, también pueden ser tercos y requieren técnicas de entrenamiento paciente y creativo.
        Sus narices los guían por la vida, y nunca son más felices que cuando siguen un olor interesante. Los beagles originalmente fueron criados como sabuesos para rastrear la caza menor, en su mayoría conejos y liebres. Todavía se utilizan para este propósito en muchos países en la actualidad, incluido Estados Unidos. Pero encontrarás muchos de estos cachorros viviendo como perros de compañía y como miembros de la familia cariñosos y peludos.        
	"$
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.