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
public static RemoteObject  _btncalculate_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnCalculate_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("btncalculate_click")) { return __ref.runUserSub(false, "b4xmainpage","btncalculate_click", __ref);}
RemoteObject _fltcost = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 27;BA.debugLine="Private Sub btnCalculate_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 31;BA.debugLine="Private fltCost As Float";
Debug.ShouldStop(1073741824);
_fltcost = RemoteObject.createImmutable(0f);Debug.locals.put("fltCost", _fltcost);
 BA.debugLineNum = 33;BA.debugLine="If txtDuration.Text >= 1 And txtDuration.Text < 5";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("g",BA.numberCast(double.class, __ref.getField(false,"_txtduration" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("<",BA.numberCast(double.class, __ref.getField(false,"_txtduration" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 501))) { 
 BA.debugLineNum = 34;BA.debugLine="fltCost = txtDuration.Text * 0.01";
Debug.ShouldStop(2);
_fltcost = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_txtduration" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(0.01)}, "*",0, 0));Debug.locals.put("fltCost", _fltcost);
 }else 
{ BA.debugLineNum = 35;BA.debugLine="else if txtDuration.Text >= 501 And txtDuration.T";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("g",BA.numberCast(double.class, __ref.getField(false,"_txtduration" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 501)) && RemoteObject.solveBoolean("k",BA.numberCast(double.class, __ref.getField(false,"_txtduration" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 800))) { 
 BA.debugLineNum = 36;BA.debugLine="fltCost = 500 * 0.01 + (txtDuration.Text - 500)";
Debug.ShouldStop(8);
_fltcost = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(500),RemoteObject.createImmutable(0.01),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_txtduration" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(500)}, "-",1, 0)),RemoteObject.createImmutable(0.008)}, "*+*",1, 0));Debug.locals.put("fltCost", _fltcost);
 }else {
 BA.debugLineNum = 38;BA.debugLine="fltCost = 500 * 0.01 + 300 * 0.008 + (txtDuratio";
Debug.ShouldStop(32);
_fltcost = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(500),RemoteObject.createImmutable(0.01),RemoteObject.createImmutable(300),RemoteObject.createImmutable(0.008),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_txtduration" /*RemoteObject*/ ).runMethod(true,"getText")),RemoteObject.createImmutable(800)}, "-",1, 0)),RemoteObject.createImmutable(0.005)}, "*+*+*",2, 0));Debug.locals.put("fltCost", _fltcost);
 }}
;
 BA.debugLineNum = 41;BA.debugLine="lblMessage.Text = \"Total Cost = \" & fltCost & \"$\"";
Debug.ShouldStop(256);
__ref.getField(false,"_lblmessage" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Total Cost = "),_fltcost,RemoteObject.createImmutable("$")));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Private btnCalculate As Button";
b4xmainpage._btncalculate = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btncalculate",b4xmainpage._btncalculate);
 //BA.debugLineNum = 12;BA.debugLine="Private lblMessage As Label";
b4xmainpage._lblmessage = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblmessage",b4xmainpage._lblmessage);
 //BA.debugLineNum = 13;BA.debugLine="Private txtDuration As TextField";
b4xmainpage._txtduration = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtduration",b4xmainpage._txtduration);
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