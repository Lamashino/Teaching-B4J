package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xpagegoldenretriever_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xpagegoldenretriever) ","b4xpagegoldenretriever",2,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xpagegoldenretriever","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 15;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="Root = Root1";
Debug.ShouldStop(32768);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 18;BA.debugLine="Root.LoadLayout(\"frmGolden\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("frmGolden")),__ref.getField(false, "ba"));
 BA.debugLineNum = 20;BA.debugLine="txtArInfos.Text = $\" 	El golden retriever o cobra";
Debug.ShouldStop(524288);
__ref.getField(false,"_txtarinfos" /*RemoteObject*/ ).runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	El golden retriever o cobrador dorado es una raza de perro que se desarrolló en el Reino Unido, más concretamente en Escocia, alrededor de 1850. Con sus características de perro cobrador, sabueso, bloodhound y spaniel de agua, es un hábil perro de caza con aptitudes para el rastreo. \n"),RemoteObject.createImmutable("	Posee una disposición amigable y una actitud que lo ha convertido en una de las razas familiares más populares —mediante registro— en los Estados Unidos, Argentina y en Canadá, el quinto más popular en Australia ​y la octava raza más popular en el Reino Unido.\n"),RemoteObject.createImmutable("	"))));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
b4xpagegoldenretriever._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xpagegoldenretriever._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xpagegoldenretriever._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xpagegoldenretriever._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private txtArInfos As TextArea";
b4xpagegoldenretriever._txtarinfos = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");__ref.setField("_txtarinfos",b4xpagegoldenretriever._txtarinfos);
 //BA.debugLineNum = 5;BA.debugLine="Private imgPic1 As ImageView";
b4xpagegoldenretriever._imgpic1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");__ref.setField("_imgpic1",b4xpagegoldenretriever._imgpic1);
 //BA.debugLineNum = 6;BA.debugLine="Private imgPic2 As ImageView";
b4xpagegoldenretriever._imgpic2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper");__ref.setField("_imgpic2",b4xpagegoldenretriever._imgpic2);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xpagegoldenretriever) ","b4xpagegoldenretriever",2,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xpagegoldenretriever","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="Return Me";
Debug.ShouldStop(1024);
if (true) return __ref;
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}