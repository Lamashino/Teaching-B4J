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
public static RemoteObject  _btnborrar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnBorrar_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("btnborrar_click")) { return __ref.runUserSub(false, "b4xmainpage","btnborrar_click", __ref);}
 BA.debugLineNum = 26;BA.debugLine="Private Sub btnBorrar_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="txtTotal.Text = \"\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_txttotal" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 28;BA.debugLine="txtNúmero1.Text = \"\"";
Debug.ShouldStop(134217728);
__ref.getField(false,"_txtnúmero1" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 29;BA.debugLine="txtNúmero2.Text = \"\"";
Debug.ShouldStop(268435456);
__ref.getField(false,"_txtnúmero2" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndiv_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnDiv_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("btndiv_click")) { return __ref.runUserSub(false, "b4xmainpage","btndiv_click", __ref);}
 BA.debugLineNum = 40;BA.debugLine="Private Sub btnDiv_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="If txtNúmero2.Text <> 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_txtnúmero2" /*RemoteObject*/ ).runMethod(true,"getText"),BA.NumberToString(0))) { 
 BA.debugLineNum = 42;BA.debugLine="txtTotal.Text = txtNúmero1.Text / txtNúmero2.Tex";
Debug.ShouldStop(512);
__ref.getField(false,"_txttotal" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_txtnúmero1" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, __ref.getField(false,"_txtnúmero2" /*RemoteObject*/ ).runMethod(true,"getText"))}, "/",0, 0)));
 };
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
public static RemoteObject  _btnmult_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnMult_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("btnmult_click")) { return __ref.runUserSub(false, "b4xmainpage","btnmult_click", __ref);}
 BA.debugLineNum = 36;BA.debugLine="Private Sub btnMult_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="txtTotal.Text = txtNúmero1.Text * txtNúmero2.Text";
Debug.ShouldStop(16);
__ref.getField(false,"_txttotal" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_txtnúmero1" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, __ref.getField(false,"_txtnúmero2" /*RemoteObject*/ ).runMethod(true,"getText"))}, "*",0, 0)));
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
public static RemoteObject  _btnresta_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnResta_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("btnresta_click")) { return __ref.runUserSub(false, "b4xmainpage","btnresta_click", __ref);}
 BA.debugLineNum = 32;BA.debugLine="Private Sub btnResta_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="txtTotal.Text = txtNúmero1.Text - txtNúmero2.Text";
Debug.ShouldStop(1);
__ref.getField(false,"_txttotal" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_txtnúmero1" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, __ref.getField(false,"_txtnúmero2" /*RemoteObject*/ ).runMethod(true,"getText"))}, "-",1, 0)));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsuma_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSuma_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("btnsuma_click")) { return __ref.runUserSub(false, "b4xmainpage","btnsuma_click", __ref);}
 BA.debugLineNum = 46;BA.debugLine="Private Sub btnSuma_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="txtTotal.Text = txtNúmero1.Text + txtNúmero2.Text";
Debug.ShouldStop(16384);
__ref.getField(false,"_txttotal" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_txtnúmero1" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, __ref.getField(false,"_txtnúmero2" /*RemoteObject*/ ).runMethod(true,"getText"))}, "+",1, 0)));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
 //BA.debugLineNum = 10;BA.debugLine="Private txtNúmero1 As TextField";
b4xmainpage._txtnúmero1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnúmero1",b4xmainpage._txtnúmero1);
 //BA.debugLineNum = 11;BA.debugLine="Private txtNúmero2 As TextField";
b4xmainpage._txtnúmero2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnúmero2",b4xmainpage._txtnúmero2);
 //BA.debugLineNum = 12;BA.debugLine="Private txtTotal As TextField";
b4xmainpage._txttotal = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txttotal",b4xmainpage._txttotal);
 //BA.debugLineNum = 13;BA.debugLine="Private btnBorrar As Button";
b4xmainpage._btnborrar = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnborrar",b4xmainpage._btnborrar);
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