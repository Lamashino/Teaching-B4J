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
 BA.debugLineNum = 24;BA.debugLine="lblNumero.Text = \"\"";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lblnumero" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 25;BA.debugLine="hecho = False";
Debug.ShouldStop(16777216);
__ref.setField ("_hecho" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("btnBorrar_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("btnborrar_click")) { return __ref.runUserSub(false, "b4xmainpage","btnborrar_click", __ref);}
 BA.debugLineNum = 39;BA.debugLine="Private Sub btnBorrar_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="lblNumero.Text = 0";
Debug.ShouldStop(128);
__ref.getField(false,"_lblnumero" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 41;BA.debugLine="fltNumero1 = 0";
Debug.ShouldStop(256);
__ref.setField ("_fltnumero1" /*RemoteObject*/ ,BA.numberCast(float.class, 0));
 BA.debugLineNum = 42;BA.debugLine="fltNumero2 = 0";
Debug.ShouldStop(512);
__ref.setField ("_fltnumero2" /*RemoteObject*/ ,BA.numberCast(float.class, 0));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnig_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnIg_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("btnig_click")) { return __ref.runUserSub(false, "b4xmainpage","btnig_click", __ref);}
 BA.debugLineNum = 45;BA.debugLine="Private Sub btnIg_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="fltNumero2 =  lblNumero.Text";
Debug.ShouldStop(8192);
__ref.setField ("_fltnumero2" /*RemoteObject*/ ,BA.numberCast(float.class, __ref.getField(false,"_lblnumero" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 47;BA.debugLine="If operacion = \"+\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_operacion" /*RemoteObject*/ ),BA.ObjectToString("+"))) { 
 BA.debugLineNum = 48;BA.debugLine="lblNumero.Text = fltNumero1 + fltNumero2";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblnumero" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fltnumero1" /*RemoteObject*/ ),__ref.getField(true,"_fltnumero2" /*RemoteObject*/ )}, "+",1, 0)));
 }else 
{ BA.debugLineNum = 49;BA.debugLine="else If operacion = \"-\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_operacion" /*RemoteObject*/ ),BA.ObjectToString("-"))) { 
 BA.debugLineNum = 50;BA.debugLine="lblNumero.Text = fltNumero1 - fltNumero2";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblnumero" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fltnumero1" /*RemoteObject*/ ),__ref.getField(true,"_fltnumero2" /*RemoteObject*/ )}, "-",1, 0)));
 }else 
{ BA.debugLineNum = 51;BA.debugLine="else If operacion = \"*\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_operacion" /*RemoteObject*/ ),BA.ObjectToString("*"))) { 
 BA.debugLineNum = 52;BA.debugLine="lblNumero.Text = fltNumero1 * fltNumero2";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblnumero" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fltnumero1" /*RemoteObject*/ ),__ref.getField(true,"_fltnumero2" /*RemoteObject*/ )}, "*",0, 0)));
 }else 
{ BA.debugLineNum = 53;BA.debugLine="else If operacion = \"/\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_operacion" /*RemoteObject*/ ),BA.ObjectToString("/"))) { 
 BA.debugLineNum = 54;BA.debugLine="lblNumero.Text = fltNumero1 / fltNumero2";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblnumero" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fltnumero1" /*RemoteObject*/ ),__ref.getField(true,"_fltnumero2" /*RemoteObject*/ )}, "/",0, 0)));
 }}}}
;
 BA.debugLineNum = 56;BA.debugLine="fltNumero1 = lblNumero.Text";
Debug.ShouldStop(8388608);
__ref.setField ("_fltnumero1" /*RemoteObject*/ ,BA.numberCast(float.class, __ref.getField(false,"_lblnumero" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 57;BA.debugLine="hecho = True";
Debug.ShouldStop(16777216);
__ref.setField ("_hecho" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
 //BA.debugLineNum = 11;BA.debugLine="Private lblNumero As Label";
b4xmainpage._lblnumero = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblnumero",b4xmainpage._lblnumero);
 //BA.debugLineNum = 12;BA.debugLine="Private fltNumero1, fltNumero2 As Float";
b4xmainpage._fltnumero1 = RemoteObject.createImmutable(0f);__ref.setField("_fltnumero1",b4xmainpage._fltnumero1);
b4xmainpage._fltnumero2 = RemoteObject.createImmutable(0f);__ref.setField("_fltnumero2",b4xmainpage._fltnumero2);
 //BA.debugLineNum = 13;BA.debugLine="Private operacion As String";
b4xmainpage._operacion = RemoteObject.createImmutable("");__ref.setField("_operacion",b4xmainpage._operacion);
 //BA.debugLineNum = 14;BA.debugLine="Private hecho As Boolean";
b4xmainpage._hecho = RemoteObject.createImmutable(false);__ref.setField("_hecho",b4xmainpage._hecho);
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
public static RemoteObject  _numero_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Numero_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("numero_click")) { return __ref.runUserSub(false, "b4xmainpage","numero_click", __ref);}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
 BA.debugLineNum = 28;BA.debugLine="Private Sub Numero_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Dim b As Button";
Debug.ShouldStop(268435456);
_b = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 30;BA.debugLine="b = Sender";
Debug.ShouldStop(536870912);
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), b4xmainpage.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 31;BA.debugLine="Log(b.Tag)";
Debug.ShouldStop(1073741824);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_b.runMethod(false,"getTag"))));
 BA.debugLineNum = 32;BA.debugLine="If hecho Then";
Debug.ShouldStop(-2147483648);
if (__ref.getField(true,"_hecho" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 33;BA.debugLine="lblNumero.Text = 0";
Debug.ShouldStop(1);
__ref.getField(false,"_lblnumero" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 34;BA.debugLine="hecho = False";
Debug.ShouldStop(2);
__ref.setField ("_hecho" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"False"));
 };
 BA.debugLineNum = 36;BA.debugLine="lblNumero.Text = lblNumero.Text & b.Tag";
Debug.ShouldStop(8);
__ref.getField(false,"_lblnumero" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(__ref.getField(false,"_lblnumero" /*RemoteObject*/ ).runMethod(true,"getText"),_b.runMethod(false,"getTag")));
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _operacion_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("operacion_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("operacion_click")) { return __ref.runUserSub(false, "b4xmainpage","operacion_click", __ref);}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
 BA.debugLineNum = 60;BA.debugLine="Private Sub operacion_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="Dim b As Button";
Debug.ShouldStop(268435456);
_b = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 62;BA.debugLine="b = Sender";
Debug.ShouldStop(536870912);
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ButtonWrapper"), b4xmainpage.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 63;BA.debugLine="operacion = b.Tag";
Debug.ShouldStop(1073741824);
__ref.setField ("_operacion" /*RemoteObject*/ ,BA.ObjectToString(_b.runMethod(false,"getTag")));
 BA.debugLineNum = 64;BA.debugLine="fltNumero1 = lblNumero.Text";
Debug.ShouldStop(-2147483648);
__ref.setField ("_fltnumero1" /*RemoteObject*/ ,BA.numberCast(float.class, __ref.getField(false,"_lblnumero" /*RemoteObject*/ ).runMethod(true,"getText")));
 BA.debugLineNum = 65;BA.debugLine="lblNumero.Text = 0";
Debug.ShouldStop(1);
__ref.getField(false,"_lblnumero" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}