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
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Turtle_Start";
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="Turtle.SetPenColor(xui.Color_Blue).SetPenSize(5)";
_turtle._setpencolor /*b4j.example.b4xturtle*/ (null,_xui.Color_Blue)._setpensize /*b4j.example.b4xturtle*/ (null,(float) (5));
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="Turtle.MoveForward(210)";
_turtle._moveforward /*b4j.example.b4xturtle*/ (null,(float) (210));
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="Turtle.TurnLeft(90)";
_turtle._turnleft /*b4j.example.b4xturtle*/ (null,(float) (90));
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="Turtle.MoveForward(200)";
_turtle._moveforward /*b4j.example.b4xturtle*/ (null,(float) (200));
RDebugUtils.currentLine=196615;
 //BA.debugLineNum = 196615;BA.debugLine="Turtle.TurnLeft(90)";
_turtle._turnleft /*b4j.example.b4xturtle*/ (null,(float) (90));
RDebugUtils.currentLine=196616;
 //BA.debugLineNum = 196616;BA.debugLine="Turtle.MoveForward(210)";
_turtle._moveforward /*b4j.example.b4xturtle*/ (null,(float) (210));
RDebugUtils.currentLine=196617;
 //BA.debugLineNum = 196617;BA.debugLine="Turtle.TurnLeft(90)";
_turtle._turnleft /*b4j.example.b4xturtle*/ (null,(float) (90));
RDebugUtils.currentLine=196618;
 //BA.debugLineNum = 196618;BA.debugLine="Turtle.MoveForward(200)";
_turtle._moveforward /*b4j.example.b4xturtle*/ (null,(float) (200));
RDebugUtils.currentLine=196621;
 //BA.debugLineNum = 196621;BA.debugLine="Turtle.PenUp";
_turtle._penup /*b4j.example.b4xturtle*/ (null);
RDebugUtils.currentLine=196622;
 //BA.debugLineNum = 196622;BA.debugLine="Turtle.MoveBackward(200)";
_turtle._movebackward /*b4j.example.b4xturtle*/ (null,(float) (200));
RDebugUtils.currentLine=196623;
 //BA.debugLineNum = 196623;BA.debugLine="Turtle.PenDown";
_turtle._pendown /*b4j.example.b4xturtle*/ (null);
RDebugUtils.currentLine=196626;
 //BA.debugLineNum = 196626;BA.debugLine="Turtle.TurnLeft(180)";
_turtle._turnleft /*b4j.example.b4xturtle*/ (null,(float) (180));
RDebugUtils.currentLine=196627;
 //BA.debugLineNum = 196627;BA.debugLine="Turtle.MoveForward(40)";
_turtle._moveforward /*b4j.example.b4xturtle*/ (null,(float) (40));
RDebugUtils.currentLine=196628;
 //BA.debugLineNum = 196628;BA.debugLine="Turtle.TurnRight(90)";
_turtle._turnright /*b4j.example.b4xturtle*/ (null,(float) (90));
RDebugUtils.currentLine=196629;
 //BA.debugLineNum = 196629;BA.debugLine="Turtle.MoveForward(30)";
_turtle._moveforward /*b4j.example.b4xturtle*/ (null,(float) (30));
RDebugUtils.currentLine=196630;
 //BA.debugLineNum = 196630;BA.debugLine="Turtle.TurnRight(90)";
_turtle._turnright /*b4j.example.b4xturtle*/ (null,(float) (90));
RDebugUtils.currentLine=196631;
 //BA.debugLineNum = 196631;BA.debugLine="Turtle.MoveForward(40)";
_turtle._moveforward /*b4j.example.b4xturtle*/ (null,(float) (40));
RDebugUtils.currentLine=196632;
 //BA.debugLineNum = 196632;BA.debugLine="Turtle.TurnLeft(90)";
_turtle._turnleft /*b4j.example.b4xturtle*/ (null,(float) (90));
RDebugUtils.currentLine=196634;
 //BA.debugLineNum = 196634;BA.debugLine="Turtle.MoveForward(30)";
_turtle._moveforward /*b4j.example.b4xturtle*/ (null,(float) (30));
RDebugUtils.currentLine=196635;
 //BA.debugLineNum = 196635;BA.debugLine="Turtle.TurnLeft(90)";
_turtle._turnleft /*b4j.example.b4xturtle*/ (null,(float) (90));
RDebugUtils.currentLine=196636;
 //BA.debugLineNum = 196636;BA.debugLine="Turtle.MoveForward(40)";
_turtle._moveforward /*b4j.example.b4xturtle*/ (null,(float) (40));
RDebugUtils.currentLine=196637;
 //BA.debugLineNum = 196637;BA.debugLine="Turtle.TurnRight(90)";
_turtle._turnright /*b4j.example.b4xturtle*/ (null,(float) (90));
RDebugUtils.currentLine=196638;
 //BA.debugLineNum = 196638;BA.debugLine="Turtle.MoveForward(30)";
_turtle._moveforward /*b4j.example.b4xturtle*/ (null,(float) (30));
RDebugUtils.currentLine=196639;
 //BA.debugLineNum = 196639;BA.debugLine="Turtle.TurnRight(90)";
_turtle._turnright /*b4j.example.b4xturtle*/ (null,(float) (90));
RDebugUtils.currentLine=196640;
 //BA.debugLineNum = 196640;BA.debugLine="Turtle.MoveForward(40)";
_turtle._moveforward /*b4j.example.b4xturtle*/ (null,(float) (40));
RDebugUtils.currentLine=196641;
 //BA.debugLineNum = 196641;BA.debugLine="Turtle.TurnLeft(90)";
_turtle._turnleft /*b4j.example.b4xturtle*/ (null,(float) (90));
RDebugUtils.currentLine=196643;
 //BA.debugLineNum = 196643;BA.debugLine="Turtle.MoveForward(30)";
_turtle._moveforward /*b4j.example.b4xturtle*/ (null,(float) (30));
RDebugUtils.currentLine=196644;
 //BA.debugLineNum = 196644;BA.debugLine="Turtle.TurnLeft(90)";
_turtle._turnleft /*b4j.example.b4xturtle*/ (null,(float) (90));
RDebugUtils.currentLine=196645;
 //BA.debugLineNum = 196645;BA.debugLine="Turtle.MoveForward(40)";
_turtle._moveforward /*b4j.example.b4xturtle*/ (null,(float) (40));
RDebugUtils.currentLine=196646;
 //BA.debugLineNum = 196646;BA.debugLine="Turtle.TurnRight(90)";
_turtle._turnright /*b4j.example.b4xturtle*/ (null,(float) (90));
RDebugUtils.currentLine=196647;
 //BA.debugLineNum = 196647;BA.debugLine="Turtle.MoveForward(30)";
_turtle._moveforward /*b4j.example.b4xturtle*/ (null,(float) (30));
RDebugUtils.currentLine=196648;
 //BA.debugLineNum = 196648;BA.debugLine="Turtle.TurnRight(90)";
_turtle._turnright /*b4j.example.b4xturtle*/ (null,(float) (90));
RDebugUtils.currentLine=196649;
 //BA.debugLineNum = 196649;BA.debugLine="Turtle.MoveForward(40)";
_turtle._moveforward /*b4j.example.b4xturtle*/ (null,(float) (40));
RDebugUtils.currentLine=196650;
 //BA.debugLineNum = 196650;BA.debugLine="Turtle.TurnLeft(90)";
_turtle._turnleft /*b4j.example.b4xturtle*/ (null,(float) (90));
RDebugUtils.currentLine=196652;
 //BA.debugLineNum = 196652;BA.debugLine="Turtle.MoveForward(30)";
_turtle._moveforward /*b4j.example.b4xturtle*/ (null,(float) (30));
RDebugUtils.currentLine=196653;
 //BA.debugLineNum = 196653;BA.debugLine="Turtle.TurnLeft(90)";
_turtle._turnleft /*b4j.example.b4xturtle*/ (null,(float) (90));
RDebugUtils.currentLine=196654;
 //BA.debugLineNum = 196654;BA.debugLine="Turtle.MoveForward(40)";
_turtle._moveforward /*b4j.example.b4xturtle*/ (null,(float) (40));
RDebugUtils.currentLine=196655;
 //BA.debugLineNum = 196655;BA.debugLine="Turtle.TurnRight(90)";
_turtle._turnright /*b4j.example.b4xturtle*/ (null,(float) (90));
RDebugUtils.currentLine=196656;
 //BA.debugLineNum = 196656;BA.debugLine="Turtle.MoveForward(30)";
_turtle._moveforward /*b4j.example.b4xturtle*/ (null,(float) (30));
RDebugUtils.currentLine=196657;
 //BA.debugLineNum = 196657;BA.debugLine="Turtle.TurnRight(90)";
_turtle._turnright /*b4j.example.b4xturtle*/ (null,(float) (90));
RDebugUtils.currentLine=196658;
 //BA.debugLineNum = 196658;BA.debugLine="Turtle.MoveForward(40)";
_turtle._moveforward /*b4j.example.b4xturtle*/ (null,(float) (40));
RDebugUtils.currentLine=196659;
 //BA.debugLineNum = 196659;BA.debugLine="Turtle.TurnLeft(90)";
_turtle._turnleft /*b4j.example.b4xturtle*/ (null,(float) (90));
RDebugUtils.currentLine=196660;
 //BA.debugLineNum = 196660;BA.debugLine="End Sub";
return "";
}
}