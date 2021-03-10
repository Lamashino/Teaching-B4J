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
 BA.debugLineNum = 31;BA.debugLine="txtEdFísica.Text = 0";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_txtedfísica" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 32;BA.debugLine="txtFísicaQuímica.Text = 0";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_txtfísicaquímica" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 33;BA.debugLine="txtGeoHistoria.Text = 0";
Debug.ShouldStop(1);
__ref.getField(false,"_txtgeohistoria" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 34;BA.debugLine="txtInformática.Text = 0";
Debug.ShouldStop(2);
__ref.getField(false,"_txtinformática" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 35;BA.debugLine="txtInglés.Text = 0";
Debug.ShouldStop(4);
__ref.getField(false,"_txtinglés" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 36;BA.debugLine="txtLengua.Text = 0";
Debug.ShouldStop(8);
__ref.getField(false,"_txtlengua" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 37;BA.debugLine="txtMatemáticas.Text = 0";
Debug.ShouldStop(16);
__ref.getField(false,"_txtmatemáticas" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 38;BA.debugLine="txtMúsica.Text = 0";
Debug.ShouldStop(32);
__ref.getField(false,"_txtmúsica" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 39;BA.debugLine="txtMedia.Text = 0";
Debug.ShouldStop(64);
__ref.getField(false,"_txtmedia" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(0));
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("btnCalcular_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("btncalcular_click")) { return __ref.runUserSub(false, "b4xmainpage","btncalcular_click", __ref);}
 BA.debugLineNum = 44;BA.debugLine="Private Sub btnCalcular_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="If (txtFísicaQuímica.Text >= 0 And txtFísicaQuími";
Debug.ShouldStop(4096);
if ((RemoteObject.solveBoolean("g",BA.numberCast(double.class, __ref.getField(false,"_txtfísicaquímica" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("k",BA.numberCast(double.class, __ref.getField(false,"_txtfísicaquímica" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 10)))) { 
 BA.debugLineNum = 46;BA.debugLine="If ( txtEdFísica.Text >= 0 And txtEdFísica.Text";
Debug.ShouldStop(8192);
if ((RemoteObject.solveBoolean("g",BA.numberCast(double.class, __ref.getField(false,"_txtedfísica" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("k",BA.numberCast(double.class, __ref.getField(false,"_txtedfísica" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 10)))) { 
 BA.debugLineNum = 47;BA.debugLine="If ( txtGeoHistoria.text >= 0 And txtGeoHistori";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("g",BA.numberCast(double.class, __ref.getField(false,"_txtgeohistoria" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("k",BA.numberCast(double.class, __ref.getField(false,"_txtgeohistoria" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 10)))) { 
 BA.debugLineNum = 48;BA.debugLine="If ( txtInformática.text >= 0 And txtInformáti";
Debug.ShouldStop(32768);
if ((RemoteObject.solveBoolean("g",BA.numberCast(double.class, __ref.getField(false,"_txtinformática" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("k",BA.numberCast(double.class, __ref.getField(false,"_txtinformática" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 10)))) { 
 BA.debugLineNum = 49;BA.debugLine="If (txtInglés.text >= 0 And txtInglés.text <=";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean("g",BA.numberCast(double.class, __ref.getField(false,"_txtinglés" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("k",BA.numberCast(double.class, __ref.getField(false,"_txtinglés" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 10)))) { 
 BA.debugLineNum = 50;BA.debugLine="If (txtLengua.text >= 0 And txtLengua.Text <";
Debug.ShouldStop(131072);
if ((RemoteObject.solveBoolean("g",BA.numberCast(double.class, __ref.getField(false,"_txtlengua" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("k",BA.numberCast(double.class, __ref.getField(false,"_txtlengua" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 10)))) { 
 BA.debugLineNum = 51;BA.debugLine="If  (txtMatemáticas.text >= 0 And txtMatemá";
Debug.ShouldStop(262144);
if ((RemoteObject.solveBoolean("g",BA.numberCast(double.class, __ref.getField(false,"_txtmatemáticas" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("k",BA.numberCast(double.class, __ref.getField(false,"_txtmatemáticas" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 10)))) { 
 BA.debugLineNum = 52;BA.debugLine="If (txtMúsica.text >= 0 And txtMúsica.Text";
Debug.ShouldStop(524288);
if ((RemoteObject.solveBoolean("g",BA.numberCast(double.class, __ref.getField(false,"_txtmúsica" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("k",BA.numberCast(double.class, __ref.getField(false,"_txtmúsica" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 10)))) { 
 BA.debugLineNum = 54;BA.debugLine="txtMedia.Text = (txtFísicaQuímica.Text +";
Debug.ShouldStop(2097152);
__ref.getField(false,"_txtmedia" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_txtfísicaquímica" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, __ref.getField(false,"_txtedfísica" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, __ref.getField(false,"_txtgeohistoria" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, __ref.getField(false,"_txtinformática" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, __ref.getField(false,"_txtinglés" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, __ref.getField(false,"_txtlengua" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, __ref.getField(false,"_txtmatemáticas" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, __ref.getField(false,"_txtmúsica" /*RemoteObject*/ ).runMethod(true,"getText"))}, "+++++++",7, 0)),RemoteObject.createImmutable(8)}, "/",0, 0)));
 }else {
 BA.debugLineNum = 58;BA.debugLine="xui.MsgboxAsync(\"Música debe estar entre";
Debug.ShouldStop(33554432);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Música debe estar entre 0 y 10")),(Object)(RemoteObject.createImmutable("")));
 };
 }else {
 BA.debugLineNum = 61;BA.debugLine="xui.MsgboxAsync(\"Matemáticas debe estar en";
Debug.ShouldStop(268435456);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Matemáticas debe estar entre 0 y 10")),(Object)(RemoteObject.createImmutable("")));
 };
 }else {
 BA.debugLineNum = 64;BA.debugLine="xui.MsgboxAsync(\"Lengua debe estar entre 0";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Lengua debe estar entre 0 y 10")),(Object)(RemoteObject.createImmutable("")));
 };
 }else {
 BA.debugLineNum = 67;BA.debugLine="xui.MsgboxAsync(\"Inglés debe estar entre 0 y";
Debug.ShouldStop(4);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Inglés debe estar entre 0 y 10")),(Object)(RemoteObject.createImmutable("")));
 };
 }else {
 BA.debugLineNum = 70;BA.debugLine="xui.MsgboxAsync(\"Informática debe estar entre";
Debug.ShouldStop(32);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Informática debe estar entre 0 y 10")),(Object)(RemoteObject.createImmutable("")));
 };
 }else {
 BA.debugLineNum = 73;BA.debugLine="xui.MsgboxAsync(\"Geografía e Historia debe est";
Debug.ShouldStop(256);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Geografía e Historia debe estar entre 0 y 10")),(Object)(RemoteObject.createImmutable("")));
 };
 }else {
 BA.debugLineNum = 76;BA.debugLine="xui.MsgboxAsync(\"Educación Física debe estar en";
Debug.ShouldStop(2048);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Educación Física debe estar entre 0 y 10")),(Object)(RemoteObject.createImmutable("")));
 };
 }else {
 BA.debugLineNum = 79;BA.debugLine="xui.MsgboxAsync(\"Física y Química debe estar ent";
Debug.ShouldStop(16384);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Física y Química debe estar entre 0 y 10")),(Object)(RemoteObject.createImmutable("")));
 };
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
 //BA.debugLineNum = 10;BA.debugLine="Private txtEdFísica As TextField";
b4xmainpage._txtedfísica = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtedfísica",b4xmainpage._txtedfísica);
 //BA.debugLineNum = 11;BA.debugLine="Private txtFísicaQuímica As TextField";
b4xmainpage._txtfísicaquímica = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfísicaquímica",b4xmainpage._txtfísicaquímica);
 //BA.debugLineNum = 12;BA.debugLine="Private txtGeoHistoria As TextField";
b4xmainpage._txtgeohistoria = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtgeohistoria",b4xmainpage._txtgeohistoria);
 //BA.debugLineNum = 13;BA.debugLine="Private txtInformática As TextField";
b4xmainpage._txtinformática = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtinformática",b4xmainpage._txtinformática);
 //BA.debugLineNum = 14;BA.debugLine="Private txtInglés As TextField";
b4xmainpage._txtinglés = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtinglés",b4xmainpage._txtinglés);
 //BA.debugLineNum = 15;BA.debugLine="Private txtLengua As TextField";
b4xmainpage._txtlengua = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtlengua",b4xmainpage._txtlengua);
 //BA.debugLineNum = 16;BA.debugLine="Private txtMatemáticas As TextField";
b4xmainpage._txtmatemáticas = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtmatemáticas",b4xmainpage._txtmatemáticas);
 //BA.debugLineNum = 17;BA.debugLine="Private txtMedia As TextField";
b4xmainpage._txtmedia = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtmedia",b4xmainpage._txtmedia);
 //BA.debugLineNum = 18;BA.debugLine="Private txtMúsica As TextField";
b4xmainpage._txtmúsica = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtmúsica",b4xmainpage._txtmúsica);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(1048576);
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
}