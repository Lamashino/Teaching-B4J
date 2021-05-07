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
RemoteObject _inglesgriego = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _inglesespañol = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _palabragr = RemoteObject.createImmutable("");
RemoteObject _palabraesp = RemoteObject.createImmutable("");
RemoteObject _clave = RemoteObject.createImmutable("");
RemoteObject _valor = RemoteObject.createImmutable("");
int _i = 0;
 BA.debugLineNum = 36;BA.debugLine="Sub Turtle_Start";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="Private InglesGriego As Map";
Debug.ShouldStop(32);
_inglesgriego = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("InglesGriego", _inglesgriego);
 BA.debugLineNum = 39;BA.debugLine="InglesGriego.Initialize";
Debug.ShouldStop(64);
_inglesgriego.runVoidMethod ("Initialize");
 BA.debugLineNum = 41;BA.debugLine="Private InglesEspañol As Map";
Debug.ShouldStop(256);
_inglesespañol = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("InglesEspañol", _inglesespañol);
 BA.debugLineNum = 42;BA.debugLine="InglesEspañol.Initialize";
Debug.ShouldStop(512);
_inglesespañol.runVoidMethod ("Initialize");
 BA.debugLineNum = 44;BA.debugLine="InglesGriego.Put(\"Memory\", \"Μνήμη\")";
Debug.ShouldStop(2048);
_inglesgriego.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Memory"))),(Object)((RemoteObject.createImmutable("Μνήμη"))));
 BA.debugLineNum = 45;BA.debugLine="InglesGriego.Put(\"Screen\", \"Οθόνη\")";
Debug.ShouldStop(4096);
_inglesgriego.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Screen"))),(Object)((RemoteObject.createImmutable("Οθόνη"))));
 BA.debugLineNum = 46;BA.debugLine="InglesGriego.Put(\"Printer\", \"Μνήμη\")";
Debug.ShouldStop(8192);
_inglesgriego.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Printer"))),(Object)((RemoteObject.createImmutable("Μνήμη"))));
 BA.debugLineNum = 47;BA.debugLine="InglesGriego.Put(\"Programming  Language\", \"Γλώσσα";
Debug.ShouldStop(16384);
_inglesgriego.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Programming  Language"))),(Object)((RemoteObject.createImmutable("Γλώσσα Προγραμματισμού"))));
 BA.debugLineNum = 49;BA.debugLine="InglesEspañol.Put(\"Memory\", \"Memoria\")";
Debug.ShouldStop(65536);
_inglesespañol.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Memory"))),(Object)((RemoteObject.createImmutable("Memoria"))));
 BA.debugLineNum = 50;BA.debugLine="InglesEspañol.Put(\"Screen\", \"Pantalla\")";
Debug.ShouldStop(131072);
_inglesespañol.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Screen"))),(Object)((RemoteObject.createImmutable("Pantalla"))));
 BA.debugLineNum = 51;BA.debugLine="InglesEspañol.Put(\"Printer\", \"Impresora\")";
Debug.ShouldStop(262144);
_inglesespañol.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Printer"))),(Object)((RemoteObject.createImmutable("Impresora"))));
 BA.debugLineNum = 52;BA.debugLine="InglesEspañol.Put(\"Programming  Language\", \"Lengu";
Debug.ShouldStop(524288);
_inglesespañol.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Programming  Language"))),(Object)((RemoteObject.createImmutable("Lenguaje de programación"))));
 BA.debugLineNum = 54;BA.debugLine="Private PalabraGR, PalabraESP  As String";
Debug.ShouldStop(2097152);
_palabragr = RemoteObject.createImmutable("");Debug.locals.put("PalabraGR", _palabragr);
_palabraesp = RemoteObject.createImmutable("");Debug.locals.put("PalabraESP", _palabraesp);
 BA.debugLineNum = 55;BA.debugLine="PalabraGR = InglesGriego.Get(\"Screen\")";
Debug.ShouldStop(4194304);
_palabragr = BA.ObjectToString(_inglesgriego.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Screen")))));Debug.locals.put("PalabraGR", _palabragr);
 BA.debugLineNum = 56;BA.debugLine="PalabraESP = InglesEspañol.Get(\"Screen\")";
Debug.ShouldStop(8388608);
_palabraesp = BA.ObjectToString(_inglesespañol.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Screen")))));Debug.locals.put("PalabraESP", _palabraesp);
 BA.debugLineNum = 58;BA.debugLine="Log(PalabraGR)";
Debug.ShouldStop(33554432);
main.__c.runVoidMethod ("Log",(Object)(_palabragr));
 BA.debugLineNum = 59;BA.debugLine="Log(PalabraESP)";
Debug.ShouldStop(67108864);
main.__c.runVoidMethod ("Log",(Object)(_palabraesp));
 BA.debugLineNum = 60;BA.debugLine="Private clave As String";
Debug.ShouldStop(134217728);
_clave = RemoteObject.createImmutable("");Debug.locals.put("clave", _clave);
 BA.debugLineNum = 62;BA.debugLine="clave = InglesEspañol.GetKeyAt(2)";
Debug.ShouldStop(536870912);
_clave = BA.ObjectToString(_inglesespañol.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("clave", _clave);
 BA.debugLineNum = 63;BA.debugLine="Log(clave)";
Debug.ShouldStop(1073741824);
main.__c.runVoidMethod ("Log",(Object)(_clave));
 BA.debugLineNum = 65;BA.debugLine="Private Valor As String";
Debug.ShouldStop(1);
_valor = RemoteObject.createImmutable("");Debug.locals.put("Valor", _valor);
 BA.debugLineNum = 66;BA.debugLine="Valor = InglesEspañol.GetValueAt(2)";
Debug.ShouldStop(2);
_valor = BA.ObjectToString(_inglesespañol.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("Valor", _valor);
 BA.debugLineNum = 67;BA.debugLine="Log(Valor)";
Debug.ShouldStop(4);
main.__c.runVoidMethod ("Log",(Object)(_valor));
 BA.debugLineNum = 69;BA.debugLine="For i = 0 To InglesGriego.Size - 1";
Debug.ShouldStop(16);
{
final int step24 = 1;
final int limit24 = RemoteObject.solve(new RemoteObject[] {_inglesgriego.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step24 > 0 && _i <= limit24) || (step24 < 0 && _i >= limit24) ;_i = ((int)(0 + _i + step24))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 70;BA.debugLine="Log(InglesGriego.GetValueAt(i))";
Debug.ShouldStop(32);
main.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_inglesgriego.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}