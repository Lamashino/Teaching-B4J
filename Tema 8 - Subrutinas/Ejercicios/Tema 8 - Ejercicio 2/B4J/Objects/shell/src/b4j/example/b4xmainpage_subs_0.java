package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 22;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Root = Root1";
Debug.ShouldStop(4194304);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 24;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 25;BA.debugLine="txtA.Text = \"\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_txta" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 26;BA.debugLine="txtB.Text = \"\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_txtb" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 27;BA.debugLine="txtC.Text = \"\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_txtc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("btnCalcular_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("btncalcular_click")) { return __ref.runUserSub(false, "b4xmainpage","btncalcular_click", __ref);}
RemoteObject _d = RemoteObject.createImmutable(0f);
RemoteObject _a = RemoteObject.createImmutable(0f);
RemoteObject _b = RemoteObject.createImmutable(0f);
RemoteObject _c = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 31;BA.debugLine="Private Sub btnCalcular_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Private D, a, b, c As Float";
Debug.ShouldStop(-2147483648);
_d = RemoteObject.createImmutable(0f);Debug.locals.put("D", _d);
_a = RemoteObject.createImmutable(0f);Debug.locals.put("a", _a);
_b = RemoteObject.createImmutable(0f);Debug.locals.put("b", _b);
_c = RemoteObject.createImmutable(0f);Debug.locals.put("c", _c);
 BA.debugLineNum = 34;BA.debugLine="If txtA.Text <> \"\" And txtB.Text <> \"\" And txtC.T";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_txta" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",__ref.getField(false,"_txtb" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",__ref.getField(false,"_txtc" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 35;BA.debugLine="a = txtA.Text";
Debug.ShouldStop(4);
_a = BA.numberCast(float.class, __ref.getField(false,"_txta" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("a", _a);
 BA.debugLineNum = 36;BA.debugLine="b = txtB.Text";
Debug.ShouldStop(8);
_b = BA.numberCast(float.class, __ref.getField(false,"_txtb" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("b", _b);
 BA.debugLineNum = 37;BA.debugLine="c = txtC.Text";
Debug.ShouldStop(16);
_c = BA.numberCast(float.class, __ref.getField(false,"_txtc" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("c", _c);
 BA.debugLineNum = 39;BA.debugLine="D = calcD(a, b, c)";
Debug.ShouldStop(64);
_d = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_calcd" /*RemoteObject*/ ,(Object)(_a),(Object)(_b),(Object)(_c));Debug.locals.put("D", _d);
 BA.debugLineNum = 40;BA.debugLine="txtD.Text = D";
Debug.ShouldStop(128);
__ref.getField(false,"_txtd" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(_d));
 BA.debugLineNum = 42;BA.debugLine="If D < 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("<",_d,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 43;BA.debugLine="xui.MsgboxAsync(\"La ecuación no se puede resolv";
Debug.ShouldStop(1024);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("La ecuación no se puede resolver porque Δ < 0")),(Object)(RemoteObject.createImmutable("")));
 }else 
{ BA.debugLineNum = 44;BA.debugLine="Else if D = 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_d,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 45;BA.debugLine="txtX1.Text = -b/(2*a)";
Debug.ShouldStop(4096);
__ref.getField(false,"_txtx1" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(-(double) (0 + _b.<Float>get().floatValue())/(double)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_a}, "*",0, 0)).<Double>get().doubleValue()));
 }else {
 BA.debugLineNum = 47;BA.debugLine="txtX1.Text = (-b + Sqrt(D) ) / (2*a)";
Debug.ShouldStop(16384);
__ref.getField(false,"_txtx1" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable((-(double) (0 + _b.<Float>get().floatValue())+b4xmainpage.__c.runMethod(true,"Sqrt",(Object)(BA.numberCast(double.class, _d))).<Double>get().doubleValue())),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_a}, "*",0, 0))}, "/",0, 0)));
 BA.debugLineNum = 48;BA.debugLine="txtX2.Text = (-b - Sqrt(D) ) / (2*a)";
Debug.ShouldStop(32768);
__ref.getField(false,"_txtx2" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable((-(double) (0 + _b.<Float>get().floatValue())-b4xmainpage.__c.runMethod(true,"Sqrt",(Object)(BA.numberCast(double.class, _d))).<Double>get().doubleValue())),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_a}, "*",0, 0))}, "/",0, 0)));
 }}
;
 }else {
 BA.debugLineNum = 51;BA.debugLine="xui.MsgboxAsync(\"Debes introducir los coeficient";
Debug.ShouldStop(262144);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Debes introducir los coeficientes a, b, c")),(Object)(RemoteObject.createImmutable("")));
 };
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calcd(RemoteObject __ref,RemoteObject _a,RemoteObject _b,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("calcD (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("calcd")) { return __ref.runUserSub(false, "b4xmainpage","calcd", __ref, _a, _b, _c);}
Debug.locals.put("a", _a);
Debug.locals.put("b", _b);
Debug.locals.put("c", _c);
 BA.debugLineNum = 56;BA.debugLine="Private Sub calcD(a As Float, b As Float, c  As Fl";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Return (  b*b - 4 * a * c )";
Debug.ShouldStop(16777216);
if (true) return BA.numberCast(float.class, (RemoteObject.solve(new RemoteObject[] {_b,_b,RemoteObject.createImmutable(4),_a,_c}, "*-**",1, 0)));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(0f);
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
 //BA.debugLineNum = 10;BA.debugLine="Private txtA As TextField";
b4xmainpage._txta = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txta",b4xmainpage._txta);
 //BA.debugLineNum = 11;BA.debugLine="Private txtB As TextField";
b4xmainpage._txtb = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtb",b4xmainpage._txtb);
 //BA.debugLineNum = 12;BA.debugLine="Private txtC As TextField";
b4xmainpage._txtc = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtc",b4xmainpage._txtc);
 //BA.debugLineNum = 13;BA.debugLine="Private txtD As TextField";
b4xmainpage._txtd = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtd",b4xmainpage._txtd);
 //BA.debugLineNum = 14;BA.debugLine="Private txtX1 As TextField";
b4xmainpage._txtx1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtx1",b4xmainpage._txtx1);
 //BA.debugLineNum = 15;BA.debugLine="Private txtX2 As TextField";
b4xmainpage._txtx2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtx2",b4xmainpage._txtx2);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(131072);
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}