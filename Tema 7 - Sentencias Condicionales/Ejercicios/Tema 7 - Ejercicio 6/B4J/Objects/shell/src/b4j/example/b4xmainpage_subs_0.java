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
		Debug.PushSubsStack("btnCalcular_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("btncalcular_click")) { return __ref.runUserSub(false, "b4xmainpage","btncalcular_click", __ref);}
RemoteObject _fltgastosenvío = RemoteObject.createImmutable(0f);
RemoteObject _flttotal = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 27;BA.debugLine="Private Sub btnCalcular_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="Private fltGastosEnvío, fltTotal As Float";
Debug.ShouldStop(134217728);
_fltgastosenvío = RemoteObject.createImmutable(0f);Debug.locals.put("fltGastosEnvío", _fltgastosenvío);
_flttotal = RemoteObject.createImmutable(0f);Debug.locals.put("fltTotal", _flttotal);
 BA.debugLineNum = 30;BA.debugLine="If txtUbicación.text = \"EEUU\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtubicación" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("EEUU"))) { 
 BA.debugLineNum = 31;BA.debugLine="fltGastosEnvío = 3";
Debug.ShouldStop(1073741824);
_fltgastosenvío = BA.numberCast(float.class, 3);Debug.locals.put("fltGastosEnvío", _fltgastosenvío);
 }else 
{ BA.debugLineNum = 32;BA.debugLine="else if txtUbicación.text = \"Europa\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtubicación" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("Europa"))) { 
 BA.debugLineNum = 33;BA.debugLine="fltGastosEnvío = 7";
Debug.ShouldStop(1);
_fltgastosenvío = BA.numberCast(float.class, 7);Debug.locals.put("fltGastosEnvío", _fltgastosenvío);
 }else 
{ BA.debugLineNum = 34;BA.debugLine="else if txtUbicación.text = \"Canadá\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtubicación" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("Canadá"))) { 
 BA.debugLineNum = 35;BA.debugLine="fltGastosEnvío = 5";
Debug.ShouldStop(4);
_fltgastosenvío = BA.numberCast(float.class, 5);Debug.locals.put("fltGastosEnvío", _fltgastosenvío);
 }else {
 BA.debugLineNum = 37;BA.debugLine="fltGastosEnvío = 9";
Debug.ShouldStop(16);
_fltgastosenvío = BA.numberCast(float.class, 9);Debug.locals.put("fltGastosEnvío", _fltgastosenvío);
 }}}
;
 BA.debugLineNum = 39;BA.debugLine="fltTotal = fltGastosEnvío + txtCoste.Text";
Debug.ShouldStop(64);
_flttotal = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_fltgastosenvío,BA.numberCast(double.class, __ref.getField(false,"_txtcoste" /*RemoteObject*/ ).runMethod(true,"getText"))}, "+",1, 0));Debug.locals.put("fltTotal", _flttotal);
 BA.debugLineNum = 41;BA.debugLine="lblMensaje.Text = \" Tienes que pagar \" & fltTotal";
Debug.ShouldStop(256);
__ref.getField(false,"_lblmensaje" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable(" Tienes que pagar "),_flttotal,RemoteObject.createImmutable("€, "),__ref.getField(false,"_txtcoste" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable("€ por el producto y "),_fltgastosenvío,RemoteObject.createImmutable("€ por los gastos de envío")));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
 //BA.debugLineNum = 10;BA.debugLine="Private lblMensaje As Label";
b4xmainpage._lblmensaje = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblmensaje",b4xmainpage._lblmensaje);
 //BA.debugLineNum = 11;BA.debugLine="Private txtCoste As TextField";
b4xmainpage._txtcoste = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcoste",b4xmainpage._txtcoste);
 //BA.debugLineNum = 12;BA.debugLine="Private txtUbicación As TextField";
b4xmainpage._txtubicación = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtubicación",b4xmainpage._txtubicación);
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