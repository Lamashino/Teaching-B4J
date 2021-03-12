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
		Debug.PushSubsStack("btnCalcular_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("btncalcular_click")) { return __ref.runUserSub(false, "b4xmainpage","btncalcular_click", __ref);}
RemoteObject _flttotal = RemoteObject.createImmutable(0f);
RemoteObject _fltcoste = RemoteObject.createImmutable(0f);
RemoteObject _fltimpuesto = RemoteObject.createImmutable(0f);
RemoteObject _strmiembro = RemoteObject.createImmutable("");
 BA.debugLineNum = 27;BA.debugLine="Private Sub btnCalcular_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="Private fltTotal, fltCoste, fltImpuesto As Float";
Debug.ShouldStop(134217728);
_flttotal = RemoteObject.createImmutable(0f);Debug.locals.put("fltTotal", _flttotal);
_fltcoste = RemoteObject.createImmutable(0f);Debug.locals.put("fltCoste", _fltcoste);
_fltimpuesto = RemoteObject.createImmutable(0f);Debug.locals.put("fltImpuesto", _fltimpuesto);
 BA.debugLineNum = 29;BA.debugLine="Private strMiembro As String";
Debug.ShouldStop(268435456);
_strmiembro = RemoteObject.createImmutable("");Debug.locals.put("strMiembro", _strmiembro);
 BA.debugLineNum = 31;BA.debugLine="If txtMiembro.Text = \"Sí\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_txtmiembro" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("Sí"))) { 
 BA.debugLineNum = 32;BA.debugLine="fltImpuesto = 10";
Debug.ShouldStop(-2147483648);
_fltimpuesto = BA.numberCast(float.class, 10);Debug.locals.put("fltImpuesto", _fltimpuesto);
 BA.debugLineNum = 33;BA.debugLine="fltCoste = 2";
Debug.ShouldStop(1);
_fltcoste = BA.numberCast(float.class, 2);Debug.locals.put("fltCoste", _fltcoste);
 BA.debugLineNum = 34;BA.debugLine="strMiembro = \"es miembro\"";
Debug.ShouldStop(2);
_strmiembro = BA.ObjectToString("es miembro");Debug.locals.put("strMiembro", _strmiembro);
 }else {
 BA.debugLineNum = 36;BA.debugLine="fltImpuesto = 20";
Debug.ShouldStop(8);
_fltimpuesto = BA.numberCast(float.class, 20);Debug.locals.put("fltImpuesto", _fltimpuesto);
 BA.debugLineNum = 37;BA.debugLine="fltCoste = 5";
Debug.ShouldStop(16);
_fltcoste = BA.numberCast(float.class, 5);Debug.locals.put("fltCoste", _fltcoste);
 BA.debugLineNum = 38;BA.debugLine="strMiembro = \"no es miembro\"";
Debug.ShouldStop(32);
_strmiembro = BA.ObjectToString("no es miembro");Debug.locals.put("strMiembro", _strmiembro);
 };
 BA.debugLineNum = 41;BA.debugLine="fltTotal = fltCoste * txtHoras.Text + fltCoste *";
Debug.ShouldStop(256);
_flttotal = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_fltcoste,BA.numberCast(double.class, __ref.getField(false,"_txthoras" /*RemoteObject*/ ).runMethod(true,"getText")),_fltcoste,BA.numberCast(double.class, __ref.getField(false,"_txthoras" /*RemoteObject*/ ).runMethod(true,"getText")),_fltimpuesto}, "*+*/",1, 0));Debug.locals.put("fltTotal", _flttotal);
 BA.debugLineNum = 42;BA.debugLine="lblMensaje.Text = \"El usuario \" & strMiembro & \"";
Debug.ShouldStop(512);
__ref.getField(false,"_lblmensaje" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("El usuario "),_strmiembro,RemoteObject.createImmutable(" y ha estado "),__ref.getField(false,"_txthoras" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(" horas por "),_fltcoste,RemoteObject.createImmutable("/hora más "),_fltimpuesto,RemoteObject.createImmutable("% de impuesto, que hace un total de "),_flttotal));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
 //BA.debugLineNum = 11;BA.debugLine="Private lblMensaje As Label";
b4xmainpage._lblmensaje = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblmensaje",b4xmainpage._lblmensaje);
 //BA.debugLineNum = 12;BA.debugLine="Private txtHoras As TextField";
b4xmainpage._txthoras = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txthoras",b4xmainpage._txthoras);
 //BA.debugLineNum = 13;BA.debugLine="Private txtMiembro As TextField";
b4xmainpage._txtmiembro = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtmiembro",b4xmainpage._txtmiembro);
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