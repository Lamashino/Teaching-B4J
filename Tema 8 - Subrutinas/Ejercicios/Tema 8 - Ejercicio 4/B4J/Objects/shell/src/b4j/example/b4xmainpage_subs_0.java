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
 BA.debugLineNum = 23;BA.debugLine="txtTipo.Text = \"\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_txttipo" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 24;BA.debugLine="txtAsientos.Text = \"\"";
Debug.ShouldStop(8388608);
__ref.getField(false,"_txtasientos" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("btnCalcular_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("btncalcular_click")) { return __ref.runUserSub(false, "b4xmainpage","btncalcular_click", __ref);}
RemoteObject _ints = RemoteObject.createImmutable(0);
RemoteObject _intt = RemoteObject.createImmutable(0);
 BA.debugLineNum = 28;BA.debugLine="Private Sub btnCalcular_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Private intS, intT As Int";
Debug.ShouldStop(268435456);
_ints = RemoteObject.createImmutable(0);Debug.locals.put("intS", _ints);
_intt = RemoteObject.createImmutable(0);Debug.locals.put("intT", _intt);
 BA.debugLineNum = 31;BA.debugLine="If txtTipo.Text <> \"\" And txtAsientos.Text <> \"\"";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_txttipo" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",__ref.getField(false,"_txtasientos" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 32;BA.debugLine="intS = txtAsientos.Text";
Debug.ShouldStop(-2147483648);
_ints = BA.numberCast(int.class, __ref.getField(false,"_txtasientos" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("intS", _ints);
 BA.debugLineNum = 33;BA.debugLine="intT = txtTipo.Text";
Debug.ShouldStop(1);
_intt = BA.numberCast(int.class, __ref.getField(false,"_txttipo" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("intT", _intt);
 BA.debugLineNum = 34;BA.debugLine="lblMensaje.Text = calcTotal(intT, intS)";
Debug.ShouldStop(2);
__ref.getField(false,"_lblmensaje" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(__ref.runClassMethod (b4j.example.b4xmainpage.class, "_calctotal" /*RemoteObject*/ ,(Object)(_intt),(Object)(_ints))));
 };
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
public static RemoteObject  _calctotal(RemoteObject __ref,RemoteObject _t,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("calcTotal (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("calctotal")) { return __ref.runUserSub(false, "b4xmainpage","calctotal", __ref, _t, _s);}
Debug.locals.put("t", _t);
Debug.locals.put("s", _s);
 BA.debugLineNum = 38;BA.debugLine="Private Sub calcTotal(t As Int, s As Int) As Int";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="If t = 1 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_t,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 40;BA.debugLine="Return s * 20";
Debug.ShouldStop(128);
if (true) return RemoteObject.solve(new RemoteObject[] {_s,RemoteObject.createImmutable(20)}, "*",0, 1);
 }else 
{ BA.debugLineNum = 41;BA.debugLine="else if t = 2 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_t,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 42;BA.debugLine="Return s * 30";
Debug.ShouldStop(512);
if (true) return RemoteObject.solve(new RemoteObject[] {_s,RemoteObject.createImmutable(30)}, "*",0, 1);
 }else 
{ BA.debugLineNum = 43;BA.debugLine="else if t = 3 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_t,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 44;BA.debugLine="Return s * 40";
Debug.ShouldStop(2048);
if (true) return RemoteObject.solve(new RemoteObject[] {_s,RemoteObject.createImmutable(40)}, "*",0, 1);
 }else {
 BA.debugLineNum = 46;BA.debugLine="xui.MsgboxAsync(\"Categoría errónea\" ,\"\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Categoría errónea")),(Object)(RemoteObject.createImmutable("")));
 }}}
;
 BA.debugLineNum = 48;BA.debugLine="Return 0";
Debug.ShouldStop(32768);
if (true) return BA.numberCast(int.class, 0);
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(0);
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
 //BA.debugLineNum = 10;BA.debugLine="Private lblMensaje As Label";
b4xmainpage._lblmensaje = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblmensaje",b4xmainpage._lblmensaje);
 //BA.debugLineNum = 11;BA.debugLine="Private txtAsientos As TextField";
b4xmainpage._txtasientos = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtasientos",b4xmainpage._txtasientos);
 //BA.debugLineNum = 12;BA.debugLine="Private txtTipo As TextField";
b4xmainpage._txttipo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txttipo",b4xmainpage._txttipo);
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