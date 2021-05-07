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
anywheresoftware.b4a.objects.collections.Map _inglesgriego = null;
anywheresoftware.b4a.objects.collections.Map _inglesespañol = null;
String _palabragr = "";
String _palabraesp = "";
String _clave = "";
String _valor = "";
int _i = 0;
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Turtle_Start";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Private InglesGriego As Map";
_inglesgriego = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="InglesGriego.Initialize";
_inglesgriego.Initialize();
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="Private InglesEspañol As Map";
_inglesespañol = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="InglesEspañol.Initialize";
_inglesespañol.Initialize();
RDebugUtils.currentLine=196616;
 //BA.debugLineNum = 196616;BA.debugLine="InglesGriego.Put(\"Memory\", \"Μνήμη\")";
_inglesgriego.Put((Object)("Memory"),(Object)("Μνήμη"));
RDebugUtils.currentLine=196617;
 //BA.debugLineNum = 196617;BA.debugLine="InglesGriego.Put(\"Screen\", \"Οθόνη\")";
_inglesgriego.Put((Object)("Screen"),(Object)("Οθόνη"));
RDebugUtils.currentLine=196618;
 //BA.debugLineNum = 196618;BA.debugLine="InglesGriego.Put(\"Printer\", \"Μνήμη\")";
_inglesgriego.Put((Object)("Printer"),(Object)("Μνήμη"));
RDebugUtils.currentLine=196619;
 //BA.debugLineNum = 196619;BA.debugLine="InglesGriego.Put(\"Programming  Language\", \"Γλώσσα";
_inglesgriego.Put((Object)("Programming  Language"),(Object)("Γλώσσα Προγραμματισμού"));
RDebugUtils.currentLine=196621;
 //BA.debugLineNum = 196621;BA.debugLine="InglesEspañol.Put(\"Memory\", \"Memoria\")";
_inglesespañol.Put((Object)("Memory"),(Object)("Memoria"));
RDebugUtils.currentLine=196622;
 //BA.debugLineNum = 196622;BA.debugLine="InglesEspañol.Put(\"Screen\", \"Pantalla\")";
_inglesespañol.Put((Object)("Screen"),(Object)("Pantalla"));
RDebugUtils.currentLine=196623;
 //BA.debugLineNum = 196623;BA.debugLine="InglesEspañol.Put(\"Printer\", \"Impresora\")";
_inglesespañol.Put((Object)("Printer"),(Object)("Impresora"));
RDebugUtils.currentLine=196624;
 //BA.debugLineNum = 196624;BA.debugLine="InglesEspañol.Put(\"Programming  Language\", \"Lengu";
_inglesespañol.Put((Object)("Programming  Language"),(Object)("Lenguaje de programación"));
RDebugUtils.currentLine=196626;
 //BA.debugLineNum = 196626;BA.debugLine="Private PalabraGR, PalabraESP  As String";
_palabragr = "";
_palabraesp = "";
RDebugUtils.currentLine=196627;
 //BA.debugLineNum = 196627;BA.debugLine="PalabraGR = InglesGriego.Get(\"Screen\")";
_palabragr = BA.ObjectToString(_inglesgriego.Get((Object)("Screen")));
RDebugUtils.currentLine=196628;
 //BA.debugLineNum = 196628;BA.debugLine="PalabraESP = InglesEspañol.Get(\"Screen\")";
_palabraesp = BA.ObjectToString(_inglesespañol.Get((Object)("Screen")));
RDebugUtils.currentLine=196630;
 //BA.debugLineNum = 196630;BA.debugLine="Log(PalabraGR)";
anywheresoftware.b4a.keywords.Common.Log(_palabragr);
RDebugUtils.currentLine=196631;
 //BA.debugLineNum = 196631;BA.debugLine="Log(PalabraESP)";
anywheresoftware.b4a.keywords.Common.Log(_palabraesp);
RDebugUtils.currentLine=196632;
 //BA.debugLineNum = 196632;BA.debugLine="Private clave As String";
_clave = "";
RDebugUtils.currentLine=196634;
 //BA.debugLineNum = 196634;BA.debugLine="clave = InglesEspañol.GetKeyAt(2)";
_clave = BA.ObjectToString(_inglesespañol.GetKeyAt((int) (2)));
RDebugUtils.currentLine=196635;
 //BA.debugLineNum = 196635;BA.debugLine="Log(clave)";
anywheresoftware.b4a.keywords.Common.Log(_clave);
RDebugUtils.currentLine=196637;
 //BA.debugLineNum = 196637;BA.debugLine="Private Valor As String";
_valor = "";
RDebugUtils.currentLine=196638;
 //BA.debugLineNum = 196638;BA.debugLine="Valor = InglesEspañol.GetValueAt(2)";
_valor = BA.ObjectToString(_inglesespañol.GetValueAt((int) (2)));
RDebugUtils.currentLine=196639;
 //BA.debugLineNum = 196639;BA.debugLine="Log(Valor)";
anywheresoftware.b4a.keywords.Common.Log(_valor);
RDebugUtils.currentLine=196641;
 //BA.debugLineNum = 196641;BA.debugLine="For i = 0 To InglesGriego.Size - 1";
{
final int step24 = 1;
final int limit24 = (int) (_inglesgriego.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
RDebugUtils.currentLine=196642;
 //BA.debugLineNum = 196642;BA.debugLine="Log(InglesGriego.GetValueAt(i))";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_inglesgriego.GetValueAt(_i)));
 }
};
RDebugUtils.currentLine=196645;
 //BA.debugLineNum = 196645;BA.debugLine="End Sub";
return "";
}
}