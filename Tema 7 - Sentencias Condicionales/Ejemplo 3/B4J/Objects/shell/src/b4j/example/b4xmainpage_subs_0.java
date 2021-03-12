package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Root = Root1";
Debug.ShouldStop(1048576);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 22;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncalcular_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnCalcular_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("btncalcular_click")) { return __ref.runUserSub(false, "b4xmainpage","btncalcular_click", __ref);}
 BA.debugLineNum = 25;BA.debugLine="Private Sub btnCalcular_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="If txtComida.Text = \"Hamburguesa\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtcomida" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("Hamburguesa"))) { 
 BA.debugLineNum = 27;BA.debugLine="lblMostrar.Text = \"Hamburguesa 5€\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblmostrar" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("Hamburguesa 5€"));
 }else 
{ BA.debugLineNum = 28;BA.debugLine="else if txtComida.Text = \"Pizza\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtcomida" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("Pizza"))) { 
 BA.debugLineNum = 29;BA.debugLine="lblMostrar.Text = \"Pizza 3€\"";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lblmostrar" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("Pizza 3€"));
 }else 
{ BA.debugLineNum = 30;BA.debugLine="else if txtComida.Text = \"Salchicha\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtcomida" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("Salchicha"))) { 
 BA.debugLineNum = 31;BA.debugLine="lblMostrar.Text = \"Salchicha 1.5€\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lblmostrar" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("Salchicha 1.5€"));
 }else {
 BA.debugLineNum = 33;BA.debugLine="lblMostrar.Text = \"Entrada incorrecta. Inténtalo";
Debug.ShouldStop(1);
__ref.getField(false,"_lblmostrar" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("Entrada incorrecta. Inténtalo de nuevo"));
 }}}
;
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
 //BA.debugLineNum = 10;BA.debugLine="Private btnCalcular As Button";
b4xmainpage._btncalcular = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btncalcular",b4xmainpage._btncalcular);
 //BA.debugLineNum = 11;BA.debugLine="Private lblMostrar As Label";
b4xmainpage._lblmostrar = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblmostrar",b4xmainpage._lblmostrar);
 //BA.debugLineNum = 12;BA.debugLine="Private txtComida As TextField";
b4xmainpage._txtcomida = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcomida",b4xmainpage._txtcomida);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(16384);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}