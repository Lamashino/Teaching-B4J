package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
int _i = 0;
RemoteObject _cntr = null;
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 26;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Root = Root1";
Debug.ShouldStop(67108864);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 28;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 29;BA.debugLine="dialog.Initialize(Root)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ )));
 BA.debugLineNum = 30;BA.debugLine="Países.Initialize";
Debug.ShouldStop(536870912);
__ref.getField(false,"_países" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 32;BA.debugLine="Países.Add(Array As String(\"Cuba\", \"La Habana\"))";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_países" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("Cuba"),RemoteObject.createImmutable("La Habana")}))));
 BA.debugLineNum = 33;BA.debugLine="Países.Add(Array As String(\"Chipre\", \"Nicosia\"))";
Debug.ShouldStop(1);
__ref.getField(false,"_países" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("Chipre"),RemoteObject.createImmutable("Nicosia")}))));
 BA.debugLineNum = 34;BA.debugLine="Países.Add(Array As String(\"Chequia\", \"Praga\"))";
Debug.ShouldStop(2);
__ref.getField(false,"_países" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("Chequia"),RemoteObject.createImmutable("Praga")}))));
 BA.debugLineNum = 35;BA.debugLine="Países.Add(Array As String(\"Egipto\", \"El Cairo\"))";
Debug.ShouldStop(4);
__ref.getField(false,"_países" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("Egipto"),RemoteObject.createImmutable("El Cairo")}))));
 BA.debugLineNum = 36;BA.debugLine="Países.Add(Array As String(\"Kenia\", \"Nairobi\"))";
Debug.ShouldStop(8);
__ref.getField(false,"_países" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("Kenia"),RemoteObject.createImmutable("Nairobi")}))));
 BA.debugLineNum = 37;BA.debugLine="Países.Add(Array As String(\"México\", \"Ciudad de M";
Debug.ShouldStop(16);
__ref.getField(false,"_países" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("México"),RemoteObject.createImmutable("Ciudad de México")}))));
 BA.debugLineNum = 38;BA.debugLine="Países.Add(Array As String(\"Perú\", \"Lima\"))";
Debug.ShouldStop(32);
__ref.getField(false,"_países" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("Perú"),RemoteObject.createImmutable("Lima")}))));
 BA.debugLineNum = 39;BA.debugLine="Países.Add(Array As String(\"Vietnam\", \"Hanoi\"))";
Debug.ShouldStop(64);
__ref.getField(false,"_países" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("Vietnam"),RemoteObject.createImmutable("Hanoi")}))));
 BA.debugLineNum = 40;BA.debugLine="Países.Add(Array As String(\"Portugal\", \"Lisboa\"))";
Debug.ShouldStop(128);
__ref.getField(false,"_países" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("Portugal"),RemoteObject.createImmutable("Lisboa")}))));
 BA.debugLineNum = 42;BA.debugLine="showList(Países)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showlist" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_países" /*RemoteObject*/ )));
 BA.debugLineNum = 45;BA.debugLine="For i = 0 To Países.Size - 1";
Debug.ShouldStop(4096);
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_países" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15) ;_i = ((int)(0 + _i + step15))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 46;BA.debugLine="Private cntr() As String";
Debug.ShouldStop(8192);
_cntr = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("cntr", _cntr);
 BA.debugLineNum = 47;BA.debugLine="cntr = Países.Get(i)";
Debug.ShouldStop(16384);
_cntr = (__ref.getField(false,"_países" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("cntr", _cntr);
 BA.debugLineNum = 48;BA.debugLine="If cntr(0).StartsWith(\"P\") Then";
Debug.ShouldStop(32768);
if (_cntr.getArrayElement(true,BA.numberCast(int.class, 0)).runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("P"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 49;BA.debugLine="Log	(cntr(0) & \" \" & cntr(1))";
Debug.ShouldStop(65536);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(_cntr.getArrayElement(true,BA.numberCast(int.class, 0)),RemoteObject.createImmutable(" "),_cntr.getArrayElement(true,BA.numberCast(int.class, 1)))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnnewcountry_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnNewCountry_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("btnnewcountry_click")) { __ref.runUserSub(false, "b4xmainpage","btnnewcountry_click", __ref); return;}
ResumableSub_btnNewCountry_Click rsub = new ResumableSub_btnNewCountry_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnNewCountry_Click extends BA.ResumableSub {
public ResumableSub_btnNewCountry_Click(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnNewCountry_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,76);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 77;BA.debugLine="dialog.Title = \"Insertar País\"";
Debug.ShouldStop(4096);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Insertar País")));
 BA.debugLineNum = 79;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(16384);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 80;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 300dip, 200dip)";
Debug.ShouldStop(32768);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200))))));
 BA.debugLineNum = 82;BA.debugLine="p.LoadLayout(\"frmNewCountry\")";
Debug.ShouldStop(131072);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("frmNewCountry")),__ref.getField(false, "ba"));
 BA.debugLineNum = 83;BA.debugLine="dialog.PutAtTop = True 'Poner el diálogo en prime";
Debug.ShouldStop(262144);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 85;BA.debugLine="Wait For (dialog.ShowCustom(p, \"Vale\", \"\", \"Cance";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "btnnewcountry_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("Vale"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar")))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 86;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 87;BA.debugLine="Log(txtInsCountry.text & \" \" & txtInsCap.text)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(__ref.getField(false,"_txtinscountry" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ),RemoteObject.createImmutable(" "),__ref.getField(false,"_txtinscap" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ))));
 BA.debugLineNum = 88;BA.debugLine="Países.Add(Array As String(txtInsCountry.Text, t";
Debug.ShouldStop(8388608);
__ref.getField(false,"_países" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {__ref.getField(false,"_txtinscountry" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ),__ref.getField(false,"_txtinscap" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ )}))));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 90;BA.debugLine="showList(Países)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_showlist" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_países" /*RemoteObject*/ )));
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _button1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "b4xmainpage","button1_click", __ref);}
int _i = 0;
RemoteObject _cntr = null;
 BA.debugLineNum = 65;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="For i = 0 To Países.Size - 1";
Debug.ShouldStop(2);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_países" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 67;BA.debugLine="Private cntr() As String";
Debug.ShouldStop(4);
_cntr = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("cntr", _cntr);
 BA.debugLineNum = 68;BA.debugLine="cntr = Países.Get(i)";
Debug.ShouldStop(8);
_cntr = (__ref.getField(false,"_países" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("cntr", _cntr);
 BA.debugLineNum = 69;BA.debugLine="If cntr(0).CompareTo(txtCountry.Text) = 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_cntr.getArrayElement(true,BA.numberCast(int.class, 0)).runMethod(true,"compareTo",(Object)(__ref.getField(false,"_txtcountry" /*RemoteObject*/ ).runMethod(true,"getText"))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 70;BA.debugLine="lblCapital.Text = cntr(1)";
Debug.ShouldStop(32);
__ref.getField(false,"_lblcapital" /*RemoteObject*/ ).runMethod(true,"setText",_cntr.getArrayElement(true,BA.numberCast(int.class, 1)));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
 //BA.debugLineNum = 11;BA.debugLine="Private lblCapital As Label";
b4xmainpage._lblcapital = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblcapital",b4xmainpage._lblcapital);
 //BA.debugLineNum = 12;BA.debugLine="Private txtCountry As TextField";
b4xmainpage._txtcountry = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcountry",b4xmainpage._txtcountry);
 //BA.debugLineNum = 13;BA.debugLine="Private Países As List";
b4xmainpage._países = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_países",b4xmainpage._países);
 //BA.debugLineNum = 15;BA.debugLine="Private txtInsCap As B4XFloatTextField";
b4xmainpage._txtinscap = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_txtinscap",b4xmainpage._txtinscap);
 //BA.debugLineNum = 16;BA.debugLine="Private txtInsCountry As B4XFloatTextField";
b4xmainpage._txtinscountry = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_txtinscountry",b4xmainpage._txtinscountry);
 //BA.debugLineNum = 17;BA.debugLine="Private dialog As B4XDialog";
b4xmainpage._dialog = RemoteObject.createNew ("b4j.example.b4xdialog");__ref.setField("_dialog",b4xmainpage._dialog);
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
public static RemoteObject  _showlist(RemoteObject __ref,RemoteObject _a) throws Exception{
try {
		Debug.PushSubsStack("showList (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("showlist")) { return __ref.runUserSub(false, "b4xmainpage","showlist", __ref, _a);}
int _i = 0;
RemoteObject _cntr = null;
Debug.locals.put("A", _a);
 BA.debugLineNum = 55;BA.debugLine="Private Sub showList(A As List)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="For i = 0 To A.Size - 1";
Debug.ShouldStop(8388608);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {_a.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 57;BA.debugLine="Private cntr() As String";
Debug.ShouldStop(16777216);
_cntr = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("cntr", _cntr);
 BA.debugLineNum = 58;BA.debugLine="cntr = A.Get(i)";
Debug.ShouldStop(33554432);
_cntr = (_a.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("cntr", _cntr);
 BA.debugLineNum = 59;BA.debugLine="Log(cntr(0) & \" \" & cntr(1))";
Debug.ShouldStop(67108864);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(_cntr.getArrayElement(true,BA.numberCast(int.class, 0)),RemoteObject.createImmutable(" "),_cntr.getArrayElement(true,BA.numberCast(int.class, 1)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}