package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,17);
if (RapidSub.canDelegate("appstart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 17;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(131072);
main._mainform = _form1;
 BA.debugLineNum = 19;BA.debugLine="MainForm.RootPane.LoadLayout(\"Main\")";
Debug.ShouldStop(262144);
main._mainform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("Main")));
 BA.debugLineNum = 20;BA.debugLine="MainForm.Show";
Debug.ShouldStop(524288);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menubar1_action() throws Exception{
try {
		Debug.PushSubsStack("MenuBar1_Action (main) ","main",0,main.ba,main.mostCurrent,23);
if (RapidSub.canDelegate("menubar1_action")) { return b4j.example.main.remoteMe.runUserSub(false, "main","menubar1_action");}
RemoteObject _mi = RemoteObject.declareNull("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
 BA.debugLineNum = 23;BA.debugLine="Sub MenuBar1_Action";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="Dim Mi As MenuItem = Sender";
Debug.ShouldStop(8388608);
_mi = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
_mi = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper"), main.__c.runMethod(false,"Sender",main.ba));Debug.locals.put("Mi", _mi);
 BA.debugLineNum = 25;BA.debugLine="Select Mi.Tag";
Debug.ShouldStop(16777216);
switch (BA.switchObjectToInt(_mi.runMethod(false,"getTag"),RemoteObject.createImmutable(("Restart")),RemoteObject.createImmutable(("Exit")))) {
case 0: {
 BA.debugLineNum = 27;BA.debugLine="Turtle.Stop.ClearScreen.Home";
Debug.ShouldStop(67108864);
main._turtle.runClassMethod (b4j.example.b4xturtle.class, "_stop" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xturtle.class, "_clearscreen" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xturtle.class, "_home" /*RemoteObject*/ );
 BA.debugLineNum = 28;BA.debugLine="Turtle_Start";
Debug.ShouldStop(134217728);
_turtle_start();
 break; }
case 1: {
 BA.debugLineNum = 30;BA.debugLine="MainForm.Close";
Debug.ShouldStop(536870912);
main._mainform.runVoidMethod ("Close");
 break; }
}
;
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
b4xturtle.myClass = BA.getDeviceClass ("b4j.example.b4xturtle");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 10;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 11;BA.debugLine="Private xui As XUI 'ignore";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 12;BA.debugLine="Private Turtle As B4XTurtle";
main._turtle = RemoteObject.createNew ("b4j.example.b4xturtle");
 //BA.debugLineNum = 13;BA.debugLine="Private MenuBar1 As MenuBar";
main._menubar1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper");
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _turtle_start() throws Exception{
try {
		Debug.PushSubsStack("Turtle_Start (main) ","main",0,main.ba,main.mostCurrent,36);
if (RapidSub.canDelegate("turtle_start")) { return b4j.example.main.remoteMe.runUserSub(false, "main","turtle_start");}
RemoteObject _intgeo = RemoteObject.createImmutable(0);
RemoteObject _intalg = RemoteObject.createImmutable(0);
RemoteObject _intfis = RemoteObject.createImmutable(0);
RemoteObject _fltmedia = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 36;BA.debugLine="Sub Turtle_Start";
Debug.ShouldStop(8);
 BA.debugLineNum = 41;BA.debugLine="Private intGeo, intAlg, intFis As Int";
Debug.ShouldStop(256);
_intgeo = RemoteObject.createImmutable(0);Debug.locals.put("intGeo", _intgeo);
_intalg = RemoteObject.createImmutable(0);Debug.locals.put("intAlg", _intalg);
_intfis = RemoteObject.createImmutable(0);Debug.locals.put("intFis", _intfis);
 BA.debugLineNum = 42;BA.debugLine="Private fltMedia As Float";
Debug.ShouldStop(512);
_fltmedia = RemoteObject.createImmutable(0f);Debug.locals.put("fltMedia", _fltmedia);
 BA.debugLineNum = 44;BA.debugLine="intGeo = 14";
Debug.ShouldStop(2048);
_intgeo = BA.numberCast(int.class, 14);Debug.locals.put("intGeo", _intgeo);
 BA.debugLineNum = 45;BA.debugLine="intAlg = 17";
Debug.ShouldStop(4096);
_intalg = BA.numberCast(int.class, 17);Debug.locals.put("intAlg", _intalg);
 BA.debugLineNum = 46;BA.debugLine="intFis = 12";
Debug.ShouldStop(8192);
_intfis = BA.numberCast(int.class, 12);Debug.locals.put("intFis", _intfis);
 BA.debugLineNum = 47;BA.debugLine="fltMedia = (intGeo + intAlg + intFis) / 3";
Debug.ShouldStop(16384);
_fltmedia = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_intgeo,_intalg,_intfis}, "++",2, 1)),RemoteObject.createImmutable(3)}, "/",0, 0));Debug.locals.put("fltMedia", _fltmedia);
 BA.debugLineNum = 48;BA.debugLine="Log(\"Media = \" & fltMedia)";
Debug.ShouldStop(32768);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Media = "),_fltmedia)));
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}