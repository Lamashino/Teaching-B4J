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
anywheresoftware.b4a.objects.collections.List _islas = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.List _notasestudiantes = null;
int _j = 0;
int[] _notas = null;
int[] _notasest = null;
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Turtle_Start";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Private islas As List";
_islas = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="islas.Initialize";
_islas.Initialize();
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="islas.AddAll(Array As String(\"Pireus\", \"Paros\", \"";
_islas.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Pireus","Paros","Thira","Crete"}));
RDebugUtils.currentLine=196615;
 //BA.debugLineNum = 196615;BA.debugLine="For i = 0 To islas .Size-1";
{
final int step4 = 1;
final int limit4 = (int) (_islas.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=196616;
 //BA.debugLineNum = 196616;BA.debugLine="Log(islas.Get(i))";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_islas.Get(_i)));
 }
};
RDebugUtils.currentLine=196620;
 //BA.debugLineNum = 196620;BA.debugLine="islas.InsertAt(2, \"Naxos\")";
_islas.InsertAt((int) (2),(Object)("Naxos"));
RDebugUtils.currentLine=196622;
 //BA.debugLineNum = 196622;BA.debugLine="For i = 0 To islas .Size-1";
{
final int step8 = 1;
final int limit8 = (int) (_islas.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=196623;
 //BA.debugLineNum = 196623;BA.debugLine="Log(islas.Get(i))";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_islas.Get(_i)));
 }
};
RDebugUtils.currentLine=196627;
 //BA.debugLineNum = 196627;BA.debugLine="Private NotasEstudiantes As List";
_notasestudiantes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=196628;
 //BA.debugLineNum = 196628;BA.debugLine="NotasEstudiantes.Initialize";
_notasestudiantes.Initialize();
RDebugUtils.currentLine=196630;
 //BA.debugLineNum = 196630;BA.debugLine="For j = 0  To  4";
{
final int step13 = 1;
final int limit13 = (int) (4);
_j = (int) (0) ;
for (;_j <= limit13 ;_j = _j + step13 ) {
RDebugUtils.currentLine=196631;
 //BA.debugLineNum = 196631;BA.debugLine="Private Notas(5)  As Int";
_notas = new int[(int) (5)];
;
RDebugUtils.currentLine=196632;
 //BA.debugLineNum = 196632;BA.debugLine="For i = 0  To  4";
{
final int step15 = 1;
final int limit15 = (int) (4);
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=196633;
 //BA.debugLineNum = 196633;BA.debugLine="Notas(i) = Rnd(1, 100) ' Crear 5 Notas aleatori";
_notas[_i] = anywheresoftware.b4a.keywords.Common.Rnd((int) (1),(int) (100));
 }
};
RDebugUtils.currentLine=196635;
 //BA.debugLineNum = 196635;BA.debugLine="NotasEstudiantes.Add(Notas)";
_notasestudiantes.Add((Object)(_notas));
 }
};
RDebugUtils.currentLine=196639;
 //BA.debugLineNum = 196639;BA.debugLine="For j = 0  To  NotasEstudiantes.Size - 1";
{
final int step20 = 1;
final int limit20 = (int) (_notasestudiantes.getSize()-1);
_j = (int) (0) ;
for (;_j <= limit20 ;_j = _j + step20 ) {
RDebugUtils.currentLine=196640;
 //BA.debugLineNum = 196640;BA.debugLine="Log(\"Estudiante: \" & j)";
anywheresoftware.b4a.keywords.Common.Log("Estudiante: "+BA.NumberToString(_j));
RDebugUtils.currentLine=196641;
 //BA.debugLineNum = 196641;BA.debugLine="Private notasEst(5)  As Int  = NotasEstudiantes.";
_notasest = (int[])(_notasestudiantes.Get(_j));
RDebugUtils.currentLine=196642;
 //BA.debugLineNum = 196642;BA.debugLine="For I  = 0  To  4";
{
final int step23 = 1;
final int limit23 = (int) (4);
_i = (int) (0) ;
for (;_i <= limit23 ;_i = _i + step23 ) {
RDebugUtils.currentLine=196643;
 //BA.debugLineNum = 196643;BA.debugLine="Log(notasEst(i))";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_notasest[_i]));
 }
};
 }
};
RDebugUtils.currentLine=196648;
 //BA.debugLineNum = 196648;BA.debugLine="End Sub";
return "";
}
}