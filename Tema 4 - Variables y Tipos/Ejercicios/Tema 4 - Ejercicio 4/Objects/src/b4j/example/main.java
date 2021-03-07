package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 600, 600);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static b4j.example.b4xturtle _turtle = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper _menubar1 = null;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args}));}
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="MainForm = Form1";
_mainform = _form1;
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="MainForm.RootPane.LoadLayout(\"Main\")";
_mainform.getRootPane().LoadLayout(ba,"Main");
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="MainForm.Show";
_mainform.Show();
RDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="End Sub";
return "";
}
public static String  _menubar1_action() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "menubar1_action", false))
	 {return ((String) Debug.delegate(ba, "menubar1_action", null));}
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub MenuBar1_Action";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Dim Mi As MenuItem = Sender";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi = (anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper(), (javafx.scene.control.MenuItem)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="Select Mi.Tag";
switch (BA.switchObjectToInt(_mi.getTag(),(Object)("Restart"),(Object)("Exit"))) {
case 0: {
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="Turtle.Stop.ClearScreen.Home";
_turtle._stop /*b4j.example.b4xturtle*/ (null)._clearscreen /*b4j.example.b4xturtle*/ (null)._home /*b4j.example.b4xturtle*/ (null);
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="Turtle_Start";
_turtle_start();
 break; }
case 1: {
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="MainForm.Close";
_mainform.Close();
 break; }
}
;
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="End Sub";
return "";
}
public static String  _turtle_start() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "turtle_start", false))
	 {return ((String) Debug.delegate(ba, "turtle_start", null));}
float _fltbitcoin = 0f;
float _fltvalor = 0f;
float _fltincdis = 0f;
float _fltincdecper = 0f;
float _fltvalortotal = 0f;
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Turtle_Start";
RDebugUtils.currentLine=196615;
 //BA.debugLineNum = 196615;BA.debugLine="Private fltBitcoin, fltValor, fltIncDis, fltIncDe";
_fltbitcoin = 0f;
_fltvalor = 0f;
_fltincdis = 0f;
_fltincdecper = 0f;
_fltvalortotal = 0f;
RDebugUtils.currentLine=196617;
 //BA.debugLineNum = 196617;BA.debugLine="fltBitcoin = 15";
_fltbitcoin = (float) (15);
RDebugUtils.currentLine=196618;
 //BA.debugLineNum = 196618;BA.debugLine="fltValor = 30123";
_fltvalor = (float) (30123);
RDebugUtils.currentLine=196619;
 //BA.debugLineNum = 196619;BA.debugLine="fltIncDecPer = 12/100";
_fltincdecper = (float) (12/(double)100);
RDebugUtils.currentLine=196620;
 //BA.debugLineNum = 196620;BA.debugLine="fltValorTotal = fltBitcoin * fltValor";
_fltvalortotal = (float) (_fltbitcoin*_fltvalor);
RDebugUtils.currentLine=196621;
 //BA.debugLineNum = 196621;BA.debugLine="Log(\"Valor total de los Bitcoins: \" & fltValorTot";
anywheresoftware.b4a.keywords.Common.Log("Valor total de los Bitcoins: "+BA.NumberToString(_fltvalortotal));
RDebugUtils.currentLine=196622;
 //BA.debugLineNum = 196622;BA.debugLine="fltIncDis = fltValorTotal * fltIncDecPer";
_fltincdis = (float) (_fltvalortotal*_fltincdecper);
RDebugUtils.currentLine=196623;
 //BA.debugLineNum = 196623;BA.debugLine="Log(\"Incremento o disminución : \" & fltIncDis )";
anywheresoftware.b4a.keywords.Common.Log("Incremento o disminución : "+BA.NumberToString(_fltincdis));
RDebugUtils.currentLine=196626;
 //BA.debugLineNum = 196626;BA.debugLine="End Sub";
return "";
}
}