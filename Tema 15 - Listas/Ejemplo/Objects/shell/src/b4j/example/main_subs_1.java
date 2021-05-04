package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_1 {


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
RemoteObject _islas = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _notasestudiantes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _j = 0;
RemoteObject _notas = null;
RemoteObject _notasest = null;
 BA.debugLineNum = 36;BA.debugLine="Sub Turtle_Start";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="Private islas As List";
Debug.ShouldStop(32);
_islas = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("islas", _islas);
 BA.debugLineNum = 39;BA.debugLine="islas.Initialize";
Debug.ShouldStop(64);
_islas.runVoidMethod ("Initialize");
 BA.debugLineNum = 41;BA.debugLine="islas.AddAll(Array As String(\"Pireus\", \"Paros\", \"";
Debug.ShouldStop(256);
_islas.runVoidMethod ("AddAll",(Object)(main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {4},new Object[] {BA.ObjectToString("Pireus"),BA.ObjectToString("Paros"),BA.ObjectToString("Thira"),RemoteObject.createImmutable("Crete")})))));
 BA.debugLineNum = 43;BA.debugLine="For i = 0 To islas .Size-1";
Debug.ShouldStop(1024);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_islas.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 44;BA.debugLine="Log(islas.Get(i))";
Debug.ShouldStop(2048);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_islas.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 48;BA.debugLine="islas.InsertAt(2, \"Naxos\")";
Debug.ShouldStop(32768);
_islas.runVoidMethod ("InsertAt",(Object)(BA.numberCast(int.class, 2)),(Object)((RemoteObject.createImmutable("Naxos"))));
 BA.debugLineNum = 50;BA.debugLine="For i = 0 To islas .Size-1";
Debug.ShouldStop(131072);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_islas.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 51;BA.debugLine="Log(islas.Get(i))";
Debug.ShouldStop(262144);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_islas.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 55;BA.debugLine="Private NotasEstudiantes As List";
Debug.ShouldStop(4194304);
_notasestudiantes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("NotasEstudiantes", _notasestudiantes);
 BA.debugLineNum = 56;BA.debugLine="NotasEstudiantes.Initialize";
Debug.ShouldStop(8388608);
_notasestudiantes.runVoidMethod ("Initialize");
 BA.debugLineNum = 58;BA.debugLine="For j = 0  To  4";
Debug.ShouldStop(33554432);
{
final int step13 = 1;
final int limit13 = 4;
_j = 0 ;
for (;(step13 > 0 && _j <= limit13) || (step13 < 0 && _j >= limit13) ;_j = ((int)(0 + _j + step13))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 59;BA.debugLine="Private Notas(5)  As Int";
Debug.ShouldStop(67108864);
_notas = RemoteObject.createNewArray ("int", new int[] {5}, new Object[]{});Debug.locals.put("Notas", _notas);
 BA.debugLineNum = 60;BA.debugLine="For i = 0  To  4";
Debug.ShouldStop(134217728);
{
final int step15 = 1;
final int limit15 = 4;
_i = 0 ;
for (;(step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15) ;_i = ((int)(0 + _i + step15))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 61;BA.debugLine="Notas(i) = Rnd(1, 100) ' Crear 5 Notas aleatori";
Debug.ShouldStop(268435456);
_notas.setArrayElement (main.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 100))),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 63;BA.debugLine="NotasEstudiantes.Add(Notas)";
Debug.ShouldStop(1073741824);
_notasestudiantes.runVoidMethod ("Add",(Object)((_notas)));
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 67;BA.debugLine="For j = 0  To  NotasEstudiantes.Size - 1";
Debug.ShouldStop(4);
{
final int step20 = 1;
final int limit20 = RemoteObject.solve(new RemoteObject[] {_notasestudiantes.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step20 > 0 && _j <= limit20) || (step20 < 0 && _j >= limit20) ;_j = ((int)(0 + _j + step20))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 68;BA.debugLine="Log(\"Estudiante: \" & j)";
Debug.ShouldStop(8);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Estudiante: "),RemoteObject.createImmutable(_j))));
 BA.debugLineNum = 69;BA.debugLine="Private notasEst(5)  As Int  = NotasEstudiantes.";
Debug.ShouldStop(16);
_notasest = (_notasestudiantes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _j))));Debug.locals.put("notasEst", _notasest);Debug.locals.put("notasEst", _notasest);
 BA.debugLineNum = 70;BA.debugLine="For I  = 0  To  4";
Debug.ShouldStop(32);
{
final int step23 = 1;
final int limit23 = 4;
_i = 0 ;
for (;(step23 > 0 && _i <= limit23) || (step23 < 0 && _i >= limit23) ;_i = ((int)(0 + _i + step23))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 71;BA.debugLine="Log(notasEst(i))";
Debug.ShouldStop(64);
main.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_notasest.getArrayElement(true,BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}