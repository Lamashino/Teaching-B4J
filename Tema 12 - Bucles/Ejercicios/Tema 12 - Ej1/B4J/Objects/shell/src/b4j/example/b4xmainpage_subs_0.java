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
public static RemoteObject  _button1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "b4xmainpage","button1_click", __ref);}
RemoteObject _intsum = RemoteObject.createImmutable(0);
int _i = 0;
 BA.debugLineNum = 28;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Private intSum As Int = 0";
Debug.ShouldStop(268435456);
_intsum = BA.numberCast(int.class, 0);Debug.locals.put("intSum", _intsum);Debug.locals.put("intSum", _intsum);
 BA.debugLineNum = 30;BA.debugLine="If TextField1.Text >= 1 And TextField1.Text <= 10";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("g",BA.numberCast(double.class, __ref.getField(false,"_textfield1" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("k",BA.numberCast(double.class, __ref.getField(false,"_textfield1" /*RemoteObject*/ ).runMethod(true,"getText")),BA.numberCast(double.class, 100))) { 
 BA.debugLineNum = 31;BA.debugLine="For i = 1 To TextField1.Text";
Debug.ShouldStop(1073741824);
{
final int step3 = 1;
final int limit3 = (int)(Double.parseDouble(__ref.getField(false,"_textfield1" /*RemoteObject*/ ).runMethod(true,"getText").<String>get()));
_i = 1 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 32;BA.debugLine="intSum = intSum + i";
Debug.ShouldStop(-2147483648);
_intsum = RemoteObject.solve(new RemoteObject[] {_intsum,RemoteObject.createImmutable(_i)}, "+",1, 1);Debug.locals.put("intSum", _intsum);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 34;BA.debugLine="Label2.Text = intSum";
Debug.ShouldStop(2);
__ref.getField(false,"_label2" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(_intsum));
 }else {
 BA.debugLineNum = 36;BA.debugLine="xui.MsgboxAsync(\"Values must be between 1 and 10";
Debug.ShouldStop(8);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Values must be between 1 and 100")),(Object)(RemoteObject.createImmutable("Error")));
 };
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
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Private Button1 As Button";
b4xmainpage._button1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_button1",b4xmainpage._button1);
 //BA.debugLineNum = 12;BA.debugLine="Private Label2 As Label";
b4xmainpage._label2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_label2",b4xmainpage._label2);
 //BA.debugLineNum = 13;BA.debugLine="Private TextField1 As TextField";
b4xmainpage._textfield1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_textfield1",b4xmainpage._textfield1);
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