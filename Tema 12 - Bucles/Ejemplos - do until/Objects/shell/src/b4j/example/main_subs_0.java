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
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _a = RemoteObject.createImmutable(0);
RemoteObject _intcount = RemoteObject.createImmutable(0);
 BA.debugLineNum = 36;BA.debugLine="Sub Turtle_Start";
Debug.ShouldStop(8);
 BA.debugLineNum = 39;BA.debugLine="Private i As Int = 1";
Debug.ShouldStop(64);
_i = BA.numberCast(int.class, 1);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 41;BA.debugLine="Do Until i > 5";
Debug.ShouldStop(256);
while (!(RemoteObject.solveBoolean(">",_i,BA.numberCast(double.class, 5)))) {
 BA.debugLineNum = 42;BA.debugLine="Log(i)";
Debug.ShouldStop(512);
main.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_i)));
 BA.debugLineNum = 43;BA.debugLine="i = i + 1";
Debug.ShouldStop(1024);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
;
 BA.debugLineNum = 48;BA.debugLine="Private i As Int";
Debug.ShouldStop(32768);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 49;BA.debugLine="i = 100";
Debug.ShouldStop(65536);
_i = BA.numberCast(int.class, 100);Debug.locals.put("i", _i);
 BA.debugLineNum = 50;BA.debugLine="Do Until i < 1";
Debug.ShouldStop(131072);
while (!(RemoteObject.solveBoolean("<",_i,BA.numberCast(double.class, 1)))) {
 BA.debugLineNum = 51;BA.debugLine="Log(i)";
Debug.ShouldStop(262144);
main.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_i)));
 BA.debugLineNum = 52;BA.debugLine="i = i -1";
Debug.ShouldStop(524288);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("i", _i);
 }
;
 BA.debugLineNum = 57;BA.debugLine="i = 1";
Debug.ShouldStop(16777216);
_i = BA.numberCast(int.class, 1);Debug.locals.put("i", _i);
 BA.debugLineNum = 58;BA.debugLine="Do Until i >  100";
Debug.ShouldStop(33554432);
while (!(RemoteObject.solveBoolean(">",_i,BA.numberCast(double.class, 100)))) {
 BA.debugLineNum = 59;BA.debugLine="If i Mod 2 = 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 60;BA.debugLine="Log(i)";
Debug.ShouldStop(134217728);
main.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_i)));
 };
 BA.debugLineNum = 62;BA.debugLine="i = i + 1";
Debug.ShouldStop(536870912);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
;
 BA.debugLineNum = 65;BA.debugLine="i = 2";
Debug.ShouldStop(1);
_i = BA.numberCast(int.class, 2);Debug.locals.put("i", _i);
 BA.debugLineNum = 66;BA.debugLine="Do Until i >  100";
Debug.ShouldStop(2);
while (!(RemoteObject.solveBoolean(">",_i,BA.numberCast(double.class, 100)))) {
 BA.debugLineNum = 67;BA.debugLine="Log(i)";
Debug.ShouldStop(4);
main.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_i)));
 BA.debugLineNum = 68;BA.debugLine="i = i + 2";
Debug.ShouldStop(8);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(2)}, "+",1, 1);Debug.locals.put("i", _i);
 }
;
 BA.debugLineNum = 138;BA.debugLine="Private A As Int";
Debug.ShouldStop(512);
_a = RemoteObject.createImmutable(0);Debug.locals.put("A", _a);
 BA.debugLineNum = 139;BA.debugLine="Private intCount As Int = 0";
Debug.ShouldStop(1024);
_intcount = BA.numberCast(int.class, 0);Debug.locals.put("intCount", _intcount);Debug.locals.put("intCount", _intcount);
 BA.debugLineNum = 141;BA.debugLine="A = 0";
Debug.ShouldStop(4096);
_a = BA.numberCast(int.class, 0);Debug.locals.put("A", _a);
 BA.debugLineNum = 142;BA.debugLine="Do Until  A = 0";
Debug.ShouldStop(8192);
while (!(RemoteObject.solveBoolean("=",_a,BA.numberCast(double.class, 0)))) {
 BA.debugLineNum = 143;BA.debugLine="Log(\"A = \" & A)";
Debug.ShouldStop(16384);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("A = "),_a)));
 BA.debugLineNum = 144;BA.debugLine="intCount = intCount + 1";
Debug.ShouldStop(32768);
_intcount = RemoteObject.solve(new RemoteObject[] {_intcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("intCount", _intcount);
 BA.debugLineNum = 146;BA.debugLine="A = Rnd(-100, 100)";
Debug.ShouldStop(131072);
_a = main.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, -(double) (0 + 100))),(Object)(BA.numberCast(int.class, 100)));Debug.locals.put("A", _a);
 }
;
 BA.debugLineNum = 149;BA.debugLine="Log(\"Count = \" & intCount)";
Debug.ShouldStop(1048576);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Count = "),_intcount)));
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}