package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


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
public static RemoteObject  _btncalcular_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnCalcular_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("btncalcular_click")) { return __ref.runUserSub(false, "b4xmainpage","btncalcular_click", __ref);}
RemoteObject _fltfee = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 26;BA.debugLine="Private Sub btnCalcular_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Private fltFee As Float";
Debug.ShouldStop(67108864);
_fltfee = RemoteObject.createImmutable(0f);Debug.locals.put("fltFee", _fltfee);
 BA.debugLineNum = 28;BA.debugLine="If txtDuración.Text <= 1 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("k",BA.numberCast(double.class, __ref.getField(false,"_txtduración" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 29;BA.debugLine="fltFee = 3.5";
Debug.ShouldStop(268435456);
_fltfee = BA.numberCast(float.class, 3.5);Debug.locals.put("fltFee", _fltfee);
 }else 
{ BA.debugLineNum = 30;BA.debugLine="else if txtDuración.Text <= 3 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("k",BA.numberCast(double.class, __ref.getField(false,"_txtduración" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 31;BA.debugLine="fltFee = 3.5 + (txtDuración.Text - 1) * 8";
Debug.ShouldStop(1073741824);
_fltfee = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(3.5),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_txtduración" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(1)}, "-",1, 0)),RemoteObject.createImmutable(8)}, "+*",1, 0));Debug.locals.put("fltFee", _fltfee);
 }else 
{ BA.debugLineNum = 32;BA.debugLine="Else if txtDuración.Text <= 5 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("k",BA.numberCast(double.class, __ref.getField(false,"_txtduración" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 33;BA.debugLine="fltFee = 3.5 + 16 + (txtDuración.Text - 3) * 12";
Debug.ShouldStop(1);
_fltfee = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(3.5),RemoteObject.createImmutable(16),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_txtduración" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(3)}, "-",1, 0)),RemoteObject.createImmutable(12)}, "++*",2, 0));Debug.locals.put("fltFee", _fltfee);
 }else {
 BA.debugLineNum = 35;BA.debugLine="fltFee = 3.5 + 16 + 24 + (txtDuración.Text - 5)";
Debug.ShouldStop(4);
_fltfee = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(3.5),RemoteObject.createImmutable(16),RemoteObject.createImmutable(24),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_txtduración" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(5)}, "-",1, 0)),RemoteObject.createImmutable(15)}, "+++*",3, 0));Debug.locals.put("fltFee", _fltfee);
 }}}
;
 BA.debugLineNum = 37;BA.debugLine="lblMensaje.Text = \"Total a pagar = \" & fltFee";
Debug.ShouldStop(16);
__ref.getField(false,"_lblmensaje" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Total a pagar = "),_fltfee));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 11;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 12;BA.debugLine="Private btnCalcular As Button";
b4xmainpage._btncalcular = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btncalcular",b4xmainpage._btncalcular);
 //BA.debugLineNum = 13;BA.debugLine="Private lblMensaje As Label";
b4xmainpage._lblmensaje = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblmensaje",b4xmainpage._lblmensaje);
 //BA.debugLineNum = 14;BA.debugLine="Private txtDuración As TextField";
b4xmainpage._txtduración = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtduración",b4xmainpage._txtduración);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(65536);
 BA.debugLineNum = 19;BA.debugLine="End Sub";
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