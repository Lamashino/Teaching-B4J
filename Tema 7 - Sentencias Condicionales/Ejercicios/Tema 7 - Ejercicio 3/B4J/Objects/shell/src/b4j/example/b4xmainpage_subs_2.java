package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_2 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 21;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Root = Root1";
Debug.ShouldStop(2097152);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 23;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncalc_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnCalc_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("btncalc_click")) { return __ref.runUserSub(false, "b4xmainpage","btncalc_click", __ref);}
RemoteObject _fltcoste = RemoteObject.createImmutable(0f);
RemoteObject _meal = RemoteObject.createImmutable("");
 BA.debugLineNum = 27;BA.debugLine="Private Sub btnCalc_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 31;BA.debugLine="Private fltCoste As Float";
Debug.ShouldStop(1073741824);
_fltcoste = RemoteObject.createImmutable(0f);Debug.locals.put("fltCoste", _fltcoste);
 BA.debugLineNum = 32;BA.debugLine="Private meal As String";
Debug.ShouldStop(-2147483648);
_meal = RemoteObject.createImmutable("");Debug.locals.put("meal", _meal);
 BA.debugLineNum = 34;BA.debugLine="If txtComida.text = \"Salchicha\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtcomida" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("Salchicha"))) { 
 BA.debugLineNum = 35;BA.debugLine="fltCoste = txtCantidad.Text * 1.5";
Debug.ShouldStop(4);
_fltcoste = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_txtcantidad" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(1.5)}, "*",0, 0));Debug.locals.put("fltCoste", _fltcoste);
 BA.debugLineNum = 36;BA.debugLine="meal = \"Salchicha\"";
Debug.ShouldStop(8);
_meal = BA.ObjectToString("Salchicha");Debug.locals.put("meal", _meal);
 }else 
{ BA.debugLineNum = 37;BA.debugLine="else if txtComida.text = \"Pizza\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtcomida" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("Pizza"))) { 
 BA.debugLineNum = 38;BA.debugLine="fltCoste = txtCantidad.Text * 3";
Debug.ShouldStop(32);
_fltcoste = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_txtcantidad" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(3)}, "*",0, 0));Debug.locals.put("fltCoste", _fltcoste);
 BA.debugLineNum = 39;BA.debugLine="meal = \"Pizza\"";
Debug.ShouldStop(64);
_meal = BA.ObjectToString("Pizza");Debug.locals.put("meal", _meal);
 }else 
{ BA.debugLineNum = 40;BA.debugLine="else if txtComida.text = \"Hamburguesa\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtcomida" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("Hamburguesa"))) { 
 BA.debugLineNum = 41;BA.debugLine="fltCoste = txtCantidad.Text * 5";
Debug.ShouldStop(256);
_fltcoste = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_txtcantidad" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(5)}, "*",0, 0));Debug.locals.put("fltCoste", _fltcoste);
 BA.debugLineNum = 42;BA.debugLine="meal = \"Hamburguesa\"";
Debug.ShouldStop(512);
_meal = BA.ObjectToString("Hamburguesa");Debug.locals.put("meal", _meal);
 }}}
;
 BA.debugLineNum = 44;BA.debugLine="txtCoste.Text = txtCantidad.Text & \" x \" & meal &";
Debug.ShouldStop(2048);
__ref.getField(false,"_txtcoste" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(__ref.getField(false,"_txtcantidad" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(" x "),_meal,RemoteObject.createImmutable(" por "),_fltcoste,RemoteObject.createImmutable(" €")));
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
 //BA.debugLineNum = 10;BA.debugLine="Private btnCalc As Button";
b4xmainpage._btncalc = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btncalc",b4xmainpage._btncalc);
 //BA.debugLineNum = 11;BA.debugLine="Private txtCoste As TextField";
b4xmainpage._txtcoste = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcoste",b4xmainpage._txtcoste);
 //BA.debugLineNum = 12;BA.debugLine="Private txtComida As TextField";
b4xmainpage._txtcomida = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcomida",b4xmainpage._txtcomida);
 //BA.debugLineNum = 13;BA.debugLine="Private txtCantidad As TextField";
b4xmainpage._txtcantidad = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcantidad",b4xmainpage._txtcantidad);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32768);
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}