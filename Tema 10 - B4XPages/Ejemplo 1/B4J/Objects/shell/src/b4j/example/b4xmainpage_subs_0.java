package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 17;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="Root = Root1";
Debug.ShouldStop(131072);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 19;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 20;BA.debugLine="page1.Initialize";
Debug.ShouldStop(524288);
__ref.getField(false,"_page1" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpage1.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 21;BA.debugLine="B4XPages.AddPage(\"mi primera página\", page1)";
Debug.ShouldStop(1048576);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("mi primera página")),(Object)((__ref.getField(false,"_page1" /*RemoteObject*/ ))));
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Button1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "b4xmainpage","button1_click", __ref);}
 BA.debugLineNum = 24;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 26;BA.debugLine="B4XPages.ShowPage(\"mi primera página\")";
Debug.ShouldStop(33554432);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("mi primera página")));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 10;BA.debugLine="Private page1 As B4XPage1";
b4xmainpage._page1 = RemoteObject.createNew ("b4j.example.b4xpage1");__ref.setField("_page1",b4xmainpage._page1);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4096);
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}