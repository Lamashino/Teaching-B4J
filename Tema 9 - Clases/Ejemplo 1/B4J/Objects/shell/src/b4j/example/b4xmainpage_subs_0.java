package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 19;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Root = Root1";
Debug.ShouldStop(524288);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 21;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 23;BA.debugLine="libro1.Initialize";
Debug.ShouldStop(4194304);
__ref.getField(false,"_libro1" /*RemoteObject*/ ).runClassMethod (b4j.example.clslibro.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 24;BA.debugLine="libro2.Initialize";
Debug.ShouldStop(8388608);
__ref.getField(false,"_libro2" /*RemoteObject*/ ).runClassMethod (b4j.example.clslibro.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 26;BA.debugLine="libro1.insertarLibro(\"Neuromante\", \"William Gibso";
Debug.ShouldStop(33554432);
__ref.getField(false,"_libro1" /*RemoteObject*/ ).runClassMethod (b4j.example.clslibro.class, "_insertarlibro" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Neuromante")),(Object)(BA.ObjectToString("William Gibson")),(Object)(BA.ObjectToString("1984")),(Object)(RemoteObject.createImmutable("Ace")));
 BA.debugLineNum = 27;BA.debugLine="libro2.insertarLibro(\"2001: Una odisea del espaci";
Debug.ShouldStop(67108864);
__ref.getField(false,"_libro2" /*RemoteObject*/ ).runClassMethod (b4j.example.clslibro.class, "_insertarlibro" /*RemoteObject*/ ,(Object)(BA.ObjectToString("2001: Una odisea del espacio")),(Object)(BA.ObjectToString("Arthur C. Clarke")),(Object)(BA.ObjectToString("1968")),(Object)(RemoteObject.createImmutable("Ace")));
 BA.debugLineNum = 29;BA.debugLine="libro1.mostrarLibro";
Debug.ShouldStop(268435456);
__ref.getField(false,"_libro1" /*RemoteObject*/ ).runClassMethod (b4j.example.clslibro.class, "_mostrarlibro" /*RemoteObject*/ );
 BA.debugLineNum = 30;BA.debugLine="libro2.mostrarLibro";
Debug.ShouldStop(536870912);
__ref.getField(false,"_libro2" /*RemoteObject*/ ).runClassMethod (b4j.example.clslibro.class, "_mostrarlibro" /*RemoteObject*/ );
 BA.debugLineNum = 32;BA.debugLine="libro1.Escritor = \"Wil. Gibson\"";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_libro1" /*RemoteObject*/ ).runClassMethod (b4j.example.clslibro.class, "_setescritor" /*RemoteObject*/ ,BA.ObjectToString("Wil. Gibson"));
 BA.debugLineNum = 34;BA.debugLine="Log(libro1.Escritor)";
Debug.ShouldStop(2);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(__ref.getField(false,"_libro1" /*RemoteObject*/ ).runClassMethod (b4j.example.clslibro.class, "_getescritor" /*RemoteObject*/ )));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 10;BA.debugLine="Private libro1 As clsLibro";
b4xmainpage._libro1 = RemoteObject.createNew ("b4j.example.clslibro");__ref.setField("_libro1",b4xmainpage._libro1);
 //BA.debugLineNum = 11;BA.debugLine="Private libro2 As clsLibro";
b4xmainpage._libro2 = RemoteObject.createNew ("b4j.example.clslibro");__ref.setField("_libro2",b4xmainpage._libro2);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(8192);
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}