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
	Private imgPic1 As ImageView
	Private imgPic2 As ImageView
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

' Este evento se invocará una única vez, antes de que la página sea visible
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
'load the layout to Root
	Root.LoadLayout("frmGolden")
	
	txtArInfos.Text = $"
	El golden retriever o cobrador dorado es una raza de perro que se desarrolló en el Reino Unido, más concretamente en Escocia, alrededor de 1850. Con sus características de perro cobrador, sabueso, bloodhound y spaniel de agua, es un hábil perro de caza con aptitudes para el rastreo. 
	Posee una disposición amigable y una actitud que lo ha convertido en una de las razas familiares más populares —mediante registro— en los Estados Unidos, Argentina y en Canadá, el quinto más popular en Australia ​y la octava raza más popular en el Reino Unido.
	"$
	
	
End Sub



'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.