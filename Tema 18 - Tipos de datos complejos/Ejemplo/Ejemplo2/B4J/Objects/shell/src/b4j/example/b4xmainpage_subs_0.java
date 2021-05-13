package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xcombobox1_selectedindexchanged(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("B4XComboBox1_SelectedIndexChanged (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("b4xcombobox1_selectedindexchanged")) { return __ref.runUserSub(false, "b4xmainpage","b4xcombobox1_selectedindexchanged", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 47;BA.debugLine="Private Sub B4XComboBox1_SelectedIndexChanged (Ind";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="lblCmbDate.Text = Index";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblcmbdate" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(_index));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
int _i = 0;
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 24;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="Root = Root1";
Debug.ShouldStop(16777216);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 26;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 27;BA.debugLine="lstItems.Initialize";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lstitems" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 28;BA.debugLine="lstItems.AddAll(Array As String(\"Lunes\", \"Martes\"";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lstitems" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(b4xmainpage.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {7},new Object[] {BA.ObjectToString("Lunes"),BA.ObjectToString("Martes"),BA.ObjectToString("Miércoles"),BA.ObjectToString("Jueves"),BA.ObjectToString("Viernes"),BA.ObjectToString("Sábado"),RemoteObject.createImmutable("Domingo")})))));
 BA.debugLineNum = 30;BA.debugLine="B4XComboBox1.SetItems(lstItems)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_b4xcombobox1" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xcombobox.class, "_setitems" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lstitems" /*RemoteObject*/ )));
 BA.debugLineNum = 31;BA.debugLine="For i = 0 To lstItems.Size-1";
Debug.ShouldStop(1073741824);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstitems" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 32;BA.debugLine="CustomListView1.AddTextItem(lstItems.Get(i), i)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_addtextitem",(Object)(__ref.getField(false,"_lstitems" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),(Object)(RemoteObject.createImmutable((_i))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Button1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "b4xmainpage","button1_click", __ref);}
 BA.debugLineNum = 38;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="xui.MsgboxAsync(\"¡Hola Mundo!\", \"B4X\")";
Debug.ShouldStop(64);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¡Hola Mundo!")),(Object)(RemoteObject.createImmutable("B4X")));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Private lstItems As List";
b4xmainpage._lstitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstitems",b4xmainpage._lstitems);
 //BA.debugLineNum = 13;BA.debugLine="Private B4XComboBox1 As B4XComboBox";
b4xmainpage._b4xcombobox1 = RemoteObject.createNew ("b4j.example.b4xcombobox");__ref.setField("_b4xcombobox1",b4xmainpage._b4xcombobox1);
 //BA.debugLineNum = 14;BA.debugLine="Private CustomListView1 As CustomListView";
b4xmainpage._customlistview1 = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_customlistview1",b4xmainpage._customlistview1);
 //BA.debugLineNum = 15;BA.debugLine="Private lblDate As Label";
b4xmainpage._lbldate = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbldate",b4xmainpage._lbldate);
 //BA.debugLineNum = 16;BA.debugLine="Private lblCmbDate As Label";
b4xmainpage._lblcmbdate = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblcmbdate",b4xmainpage._lblcmbdate);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _customlistview1_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CustomListView1_ItemClick (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("customlistview1_itemclick")) { return __ref.runUserSub(false, "b4xmainpage","customlistview1_itemclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 43;BA.debugLine="Private Sub CustomListView1_ItemClick (Index As In";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="lblDate.Text = Value";
Debug.ShouldStop(2048);
__ref.getField(false,"_lbldate" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(_value));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(262144);
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}