package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 26;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Root = Root1";
Debug.ShouldStop(67108864);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 28;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 29;BA.debugLine="txtCuartoIntento.Visible = False";
Debug.ShouldStop(268435456);
__ref.getField(false,"_txtcuartointento" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 30;BA.debugLine="txtQuintoIntento.Visible = False";
Debug.ShouldStop(536870912);
__ref.getField(false,"_txtquintointento" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 31;BA.debugLine="txtSextoIntento.Visible = False";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_txtsextointento" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 32;BA.debugLine="btnMax.Visible = False";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_btnmax" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"False"));
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncomprobar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnComprobar_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("btncomprobar_click")) { return __ref.runUserSub(false, "b4xmainpage","btncomprobar_click", __ref);}
 BA.debugLineNum = 35;BA.debugLine="Private Sub btnComprobar_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="If txtPrimerIntento.Text > 7.5 Or txtSegundoInten";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_txtprimerintento" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 7.5)) || RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_txtsegundointento" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 7.5)) || RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_txttercerintento" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 7.5))) { 
 BA.debugLineNum = 37;BA.debugLine="txtCuartoIntento.Visible = True";
Debug.ShouldStop(16);
__ref.getField(false,"_txtcuartointento" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 38;BA.debugLine="txtQuintoIntento.Visible = True";
Debug.ShouldStop(32);
__ref.getField(false,"_txtquintointento" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 39;BA.debugLine="txtSextoIntento.Visible = True";
Debug.ShouldStop(64);
__ref.getField(false,"_txtsextointento" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 40;BA.debugLine="btnMax.Visible = True";
Debug.ShouldStop(128);
__ref.getField(false,"_btnmax" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xmainpage.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 42;BA.debugLine="lblMensaje.Text = \"Descalificado\"";
Debug.ShouldStop(512);
__ref.getField(false,"_lblmensaje" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("Descalificado"));
 };
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
public static RemoteObject  _btnmax_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnMax_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("btnmax_click")) { return __ref.runUserSub(false, "b4xmainpage","btnmax_click", __ref);}
RemoteObject _max1 = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 48;BA.debugLine="Private Sub btnMax_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Private MAX1 As Float";
Debug.ShouldStop(65536);
_max1 = RemoteObject.createImmutable(0f);Debug.locals.put("MAX1", _max1);
 BA.debugLineNum = 51;BA.debugLine="MAX1 = txtPrimerIntento.Text";
Debug.ShouldStop(262144);
_max1 = BA.numberCast(float.class, __ref.getField(false,"_txtprimerintento" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("MAX1", _max1);
 BA.debugLineNum = 52;BA.debugLine="If MAX1 < txtSegundoIntento.Text Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("<",_max1,BA.numberCast(double.class, __ref.getField(false,"_txtsegundointento" /*RemoteObject*/ ).runMethod(true,"getText")))) { 
 BA.debugLineNum = 53;BA.debugLine="MAX1 = txtSegundoIntento.text";
Debug.ShouldStop(1048576);
_max1 = BA.numberCast(float.class, __ref.getField(false,"_txtsegundointento" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("MAX1", _max1);
 };
 BA.debugLineNum = 55;BA.debugLine="If MAX1 < txtTercerIntento.Text Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("<",_max1,BA.numberCast(double.class, __ref.getField(false,"_txttercerintento" /*RemoteObject*/ ).runMethod(true,"getText")))) { 
 BA.debugLineNum = 56;BA.debugLine="MAX1 = txtTercerIntento.text";
Debug.ShouldStop(8388608);
_max1 = BA.numberCast(float.class, __ref.getField(false,"_txttercerintento" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("MAX1", _max1);
 };
 BA.debugLineNum = 58;BA.debugLine="If MAX1 < txtCuartoIntento.Text Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("<",_max1,BA.numberCast(double.class, __ref.getField(false,"_txtcuartointento" /*RemoteObject*/ ).runMethod(true,"getText")))) { 
 BA.debugLineNum = 59;BA.debugLine="MAX1 = txtCuartoIntento.text";
Debug.ShouldStop(67108864);
_max1 = BA.numberCast(float.class, __ref.getField(false,"_txtcuartointento" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("MAX1", _max1);
 };
 BA.debugLineNum = 61;BA.debugLine="If MAX1 < txtQuintoIntento.Text Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("<",_max1,BA.numberCast(double.class, __ref.getField(false,"_txtquintointento" /*RemoteObject*/ ).runMethod(true,"getText")))) { 
 BA.debugLineNum = 62;BA.debugLine="MAX1 = txtQuintoIntento.text";
Debug.ShouldStop(536870912);
_max1 = BA.numberCast(float.class, __ref.getField(false,"_txtquintointento" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("MAX1", _max1);
 };
 BA.debugLineNum = 64;BA.debugLine="If MAX1 < txtSextoIntento.Text Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("<",_max1,BA.numberCast(double.class, __ref.getField(false,"_txtsextointento" /*RemoteObject*/ ).runMethod(true,"getText")))) { 
 BA.debugLineNum = 65;BA.debugLine="MAX1 = txtSextoIntento.text";
Debug.ShouldStop(1);
_max1 = BA.numberCast(float.class, __ref.getField(false,"_txtsextointento" /*RemoteObject*/ ).runMethod(true,"getText"));Debug.locals.put("MAX1", _max1);
 };
 BA.debugLineNum = 68;BA.debugLine="lblMensaje.Text = \"Mejor intento = \" & MAX1";
Debug.ShouldStop(8);
__ref.getField(false,"_lblmensaje" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Mejor intento = "),_max1));
 BA.debugLineNum = 70;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 12;BA.debugLine="Private btnComprobar As Button";
b4xmainpage._btncomprobar = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btncomprobar",b4xmainpage._btncomprobar);
 //BA.debugLineNum = 13;BA.debugLine="Private btnMax As Button";
b4xmainpage._btnmax = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnmax",b4xmainpage._btnmax);
 //BA.debugLineNum = 14;BA.debugLine="Private lblMensaje As Label";
b4xmainpage._lblmensaje = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblmensaje",b4xmainpage._lblmensaje);
 //BA.debugLineNum = 15;BA.debugLine="Private txtPrimerIntento As TextField";
b4xmainpage._txtprimerintento = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtprimerintento",b4xmainpage._txtprimerintento);
 //BA.debugLineNum = 16;BA.debugLine="Private txtSegundoIntento As TextField";
b4xmainpage._txtsegundointento = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtsegundointento",b4xmainpage._txtsegundointento);
 //BA.debugLineNum = 17;BA.debugLine="Private txtTercerIntento As TextField";
b4xmainpage._txttercerintento = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txttercerintento",b4xmainpage._txttercerintento);
 //BA.debugLineNum = 18;BA.debugLine="Private txtCuartoIntento As TextField";
b4xmainpage._txtcuartointento = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcuartointento",b4xmainpage._txtcuartointento);
 //BA.debugLineNum = 19;BA.debugLine="Private txtQuintoIntento As TextField";
b4xmainpage._txtquintointento = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtquintointento",b4xmainpage._txtquintointento);
 //BA.debugLineNum = 20;BA.debugLine="Private txtSextoIntento As TextField";
b4xmainpage._txtsextointento = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtsextointento",b4xmainpage._txtsextointento);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 23;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4194304);
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
}