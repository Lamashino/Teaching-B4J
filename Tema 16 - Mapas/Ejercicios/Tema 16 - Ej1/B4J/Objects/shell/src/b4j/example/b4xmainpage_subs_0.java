package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
RemoteObject _país = RemoteObject.createImmutable("");
RemoteObject _capital = RemoteObject.createImmutable("");
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 22;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Root = Root1";
Debug.ShouldStop(4194304);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 24;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 25;BA.debugLine="Países.Initialize";
Debug.ShouldStop(16777216);
__ref.getField(false,"_países" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 27;BA.debugLine="Países.Put(\"Cuba\", \"La Habana\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_países" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Cuba"))),(Object)((RemoteObject.createImmutable("La Habana"))));
 BA.debugLineNum = 28;BA.debugLine="Países.Put(\"Chipre\", \"Nicosia\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_países" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Chipre"))),(Object)((RemoteObject.createImmutable("Nicosia"))));
 BA.debugLineNum = 29;BA.debugLine="Países.Put(\"Chequia\", \"Praga\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_países" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Chequia"))),(Object)((RemoteObject.createImmutable("Praga"))));
 BA.debugLineNum = 30;BA.debugLine="Países.Put(\"Egipto\", \"El Cairo\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_países" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Egipto"))),(Object)((RemoteObject.createImmutable("El Cairo"))));
 BA.debugLineNum = 31;BA.debugLine="Países.Put(\"Kenia\", \"Nairobi\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_países" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Kenia"))),(Object)((RemoteObject.createImmutable("Nairobi"))));
 BA.debugLineNum = 32;BA.debugLine="Países.Put(\"México\", \"Ciudad de México\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_países" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("México"))),(Object)((RemoteObject.createImmutable("Ciudad de México"))));
 BA.debugLineNum = 33;BA.debugLine="Países.Put(\"Perú\", \"Lima\")";
Debug.ShouldStop(1);
__ref.getField(false,"_países" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Perú"))),(Object)((RemoteObject.createImmutable("Lima"))));
 BA.debugLineNum = 34;BA.debugLine="Países.Put(\"Vietnam\", \"Hanoi\")";
Debug.ShouldStop(2);
__ref.getField(false,"_países" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Vietnam"))),(Object)((RemoteObject.createImmutable("Hanoi"))));
 BA.debugLineNum = 35;BA.debugLine="Países.Put(\"Portugal \", \"Lisboa\")";
Debug.ShouldStop(4);
__ref.getField(false,"_países" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Portugal "))),(Object)((RemoteObject.createImmutable("Lisboa"))));
 BA.debugLineNum = 39;BA.debugLine="Países.Put(\"Japón\", \"Tokio\")";
Debug.ShouldStop(64);
__ref.getField(false,"_países" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Japón"))),(Object)((RemoteObject.createImmutable("Tokio"))));
 BA.debugLineNum = 40;BA.debugLine="Países.Put(\"Barbados\", \"Bridgetown\")";
Debug.ShouldStop(128);
__ref.getField(false,"_países" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Barbados"))),(Object)((RemoteObject.createImmutable("Bridgetown"))));
 BA.debugLineNum = 41;BA.debugLine="Países.Put(\"Fiji\", \"Suva\")";
Debug.ShouldStop(256);
__ref.getField(false,"_países" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Fiji"))),(Object)((RemoteObject.createImmutable("Suva"))));
 BA.debugLineNum = 45;BA.debugLine="Log(\"Mostrar países y sus capitales\")";
Debug.ShouldStop(4096);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Mostrar países y sus capitales")));
 BA.debugLineNum = 46;BA.debugLine="For Each país As String In Países.Keys";
Debug.ShouldStop(8192);
{
final RemoteObject group17 = __ref.getField(false,"_países" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen17 = group17.runMethod(true,"getSize").<Integer>get()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_país = BA.ObjectToString(group17.runMethod(false,"Get",index17));Debug.locals.put("país", _país);
Debug.locals.put("país", _país);
 BA.debugLineNum = 47;BA.debugLine="Log(país & \" \" & Países.Get(país))";
Debug.ShouldStop(16384);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(_país,RemoteObject.createImmutable(" "),__ref.getField(false,"_países" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_país))))));
 }
}Debug.locals.put("país", _país);
;
 BA.debugLineNum = 52;BA.debugLine="Capitales.Initialize";
Debug.ShouldStop(524288);
__ref.getField(false,"_capitales" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 53;BA.debugLine="For Each país As String In Países.Keys";
Debug.ShouldStop(1048576);
{
final RemoteObject group21 = __ref.getField(false,"_países" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen21 = group21.runMethod(true,"getSize").<Integer>get()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_país = BA.ObjectToString(group21.runMethod(false,"Get",index21));Debug.locals.put("país", _país);
Debug.locals.put("país", _país);
 BA.debugLineNum = 54;BA.debugLine="Capitales.Put(Países.Get(país), país)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_capitales" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(__ref.getField(false,"_países" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_país)))),(Object)((_país)));
 }
}Debug.locals.put("país", _país);
;
 BA.debugLineNum = 56;BA.debugLine="Log(\"Mostrar capitales y sus países\")";
Debug.ShouldStop(8388608);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Mostrar capitales y sus países")));
 BA.debugLineNum = 57;BA.debugLine="For Each Capital As String In Capitales.Keys";
Debug.ShouldStop(16777216);
{
final RemoteObject group25 = __ref.getField(false,"_capitales" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen25 = group25.runMethod(true,"getSize").<Integer>get()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_capital = BA.ObjectToString(group25.runMethod(false,"Get",index25));Debug.locals.put("Capital", _capital);
Debug.locals.put("Capital", _capital);
 BA.debugLineNum = 58;BA.debugLine="Log(Capital & \" \" & Capitales.Get(Capital))";
Debug.ShouldStop(33554432);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(_capital,RemoteObject.createImmutable(" "),__ref.getField(false,"_capitales" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_capital))))));
 }
}Debug.locals.put("Capital", _capital);
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
public static RemoteObject  _btnshow_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnShow_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("btnshow_click")) { return __ref.runUserSub(false, "b4xmainpage","btnshow_click", __ref);}
 BA.debugLineNum = 65;BA.debugLine="Private Sub btnShow_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="If Capitales.ContainsKey(txtCapital.Text) Then";
Debug.ShouldStop(2);
if (__ref.getField(false,"_capitales" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((__ref.getField(false,"_txtcapital" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 67;BA.debugLine="lblCountry.Text = Capitales.Get(txtCapital.Text)";
Debug.ShouldStop(4);
__ref.getField(false,"_lblcountry" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(__ref.getField(false,"_capitales" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((__ref.getField(false,"_txtcapital" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ))))));
 }else {
 BA.debugLineNum = 69;BA.debugLine="lblCountry.Text = \"No conozco \" & txtCapital.tex";
Debug.ShouldStop(16);
__ref.getField(false,"_lblcountry" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("No conozco "),__ref.getField(false,"_txtcapital" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
 //BA.debugLineNum = 11;BA.debugLine="Private Países As Map";
b4xmainpage._países = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_países",b4xmainpage._países);
 //BA.debugLineNum = 12;BA.debugLine="Private Capitales As Map";
b4xmainpage._capitales = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_capitales",b4xmainpage._capitales);
 //BA.debugLineNum = 13;BA.debugLine="Private lblCountry As Label";
b4xmainpage._lblcountry = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblcountry",b4xmainpage._lblcountry);
 //BA.debugLineNum = 14;BA.debugLine="Private txtCapital As B4XFloatTextField";
b4xmainpage._txtcapital = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_txtcapital",b4xmainpage._txtcapital);
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