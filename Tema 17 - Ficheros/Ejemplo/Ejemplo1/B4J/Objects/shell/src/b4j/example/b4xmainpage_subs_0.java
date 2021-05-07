package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
RemoteObject _strcarpeta = RemoteObject.createImmutable("");
RemoteObject _msj = RemoteObject.createImmutable("");
RemoteObject _strcontenidofichero = RemoteObject.createImmutable("");
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 19;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Root = Root1";
Debug.ShouldStop(524288);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 21;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 23;BA.debugLine="Log(File.DirApp)";
Debug.ShouldStop(4194304);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirApp")));
 BA.debugLineNum = 24;BA.debugLine="Log(File.DirAssets)";
Debug.ShouldStop(8388608);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirAssets")));
 BA.debugLineNum = 25;BA.debugLine="Log(File.DirTemp)";
Debug.ShouldStop(16777216);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirTemp")));
 BA.debugLineNum = 26;BA.debugLine="Log(File.DirData(\"Ejemplo1\"))";
Debug.ShouldStop(33554432);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"DirData",(Object)(RemoteObject.createImmutable("Ejemplo1")))));
 BA.debugLineNum = 28;BA.debugLine="Private strCarpeta As String = File.DirTemp & \"te";
Debug.ShouldStop(134217728);
_strcarpeta = RemoteObject.concat(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirTemp"),RemoteObject.createImmutable("tema17\\"));Debug.locals.put("strCarpeta", _strcarpeta);Debug.locals.put("strCarpeta", _strcarpeta);
 BA.debugLineNum = 29;BA.debugLine="Log(strCarpeta)";
Debug.ShouldStop(268435456);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(_strcarpeta));
 BA.debugLineNum = 30;BA.debugLine="File.MakeDir(File.DirTemp, \"tema17\")";
Debug.ShouldStop(536870912);
b4xmainpage.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(RemoteObject.createImmutable("tema17")));
 BA.debugLineNum = 32;BA.debugLine="If File.Exists(strCarpeta, nf) Then";
Debug.ShouldStop(-2147483648);
if (b4xmainpage.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_strcarpeta),(Object)(__ref.getField(true,"_nf" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 33;BA.debugLine="Log(\"El fichero \" & nf & \" ya existe\")";
Debug.ShouldStop(1);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("El fichero "),__ref.getField(true,"_nf" /*RemoteObject*/ ),RemoteObject.createImmutable(" ya existe"))));
 }else {
 BA.debugLineNum = 35;BA.debugLine="Log(\"No existe el fichero \" & nf)";
Debug.ShouldStop(4);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("No existe el fichero "),__ref.getField(true,"_nf" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 38;BA.debugLine="File.OpenOutput(strCarpeta, nf, True)";
Debug.ShouldStop(32);
b4xmainpage.__c.getField(false,"File").runVoidMethod ("OpenOutput",(Object)(_strcarpeta),(Object)(__ref.getField(true,"_nf" /*RemoteObject*/ )),(Object)(b4xmainpage.__c.getField(true,"True")));
 BA.debugLineNum = 40;BA.debugLine="Private msj As String = \"Hola Mundo 2\"";
Debug.ShouldStop(128);
_msj = BA.ObjectToString("Hola Mundo 2");Debug.locals.put("msj", _msj);Debug.locals.put("msj", _msj);
 BA.debugLineNum = 41;BA.debugLine="File.WriteString(strCarpeta, nf, msj)";
Debug.ShouldStop(256);
b4xmainpage.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(_strcarpeta),(Object)(__ref.getField(true,"_nf" /*RemoteObject*/ )),(Object)(_msj));
 BA.debugLineNum = 43;BA.debugLine="Private msj As String = $\" 	If you can keep your";
Debug.ShouldStop(1024);
_msj = (RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	If you can keep your head when all about you   \n"),RemoteObject.createImmutable("    Are losing theirs and blaming it on you,   \n"),RemoteObject.createImmutable("	If you can trust yourself when all men doubt you,\n"),RemoteObject.createImmutable("    But make allowance for their doubting too;   \n"),RemoteObject.createImmutable("	If you can wait and not be tired by waiting,\n"),RemoteObject.createImmutable("    Or being lied about, don’t deal in lies,\n"),RemoteObject.createImmutable("	Or being hated, don’t give way to hating,\n"),RemoteObject.createImmutable("    And yet don’t look too good, nor talk too wise:\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	If you can dream—and not make dreams your master;   \n"),RemoteObject.createImmutable("    If you can think—and not make thoughts your aim;   \n"),RemoteObject.createImmutable("	If you can meet with Triumph and Disaster\n"),RemoteObject.createImmutable("    And treat those two impostors just the same;   \n"),RemoteObject.createImmutable("	If you can bear to hear the truth you’ve spoken\n"),RemoteObject.createImmutable("    Twisted by knaves to make a trap for fools,\n"),RemoteObject.createImmutable("	Or watch the things you gave your life to, broken,\n"),RemoteObject.createImmutable("    And stoop and build ’em up with worn-out tools:\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	If you can make one heap of all your winnings\n"),RemoteObject.createImmutable("    And risk it on one turn of pitch-and-toss,\n"),RemoteObject.createImmutable("	And lose, and start again at your beginnings\n"),RemoteObject.createImmutable("    And never breathe a word about your loss;\n"),RemoteObject.createImmutable("	If you can force your heart and nerve and sinew\n"),RemoteObject.createImmutable("    To serve your turn long after they are gone,   \n"),RemoteObject.createImmutable("	And so hold on when there is nothing in you\n"),RemoteObject.createImmutable("    Except the Will which says to them: ‘Hold on!’\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	If you can talk with crowds and keep your virtue,   \n"),RemoteObject.createImmutable("    Or walk with Kings—nor lose the common touch,\n"),RemoteObject.createImmutable("	If neither foes nor loving friends can hurt you,\n"),RemoteObject.createImmutable("    If all men count with you, but none too much;\n"),RemoteObject.createImmutable("	If you can fill the unforgiving minute\n"),RemoteObject.createImmutable("    With sixty seconds’ worth of distance run,   \n"),RemoteObject.createImmutable("	Yours is the Earth and everything that’s in it,   \n"),RemoteObject.createImmutable("    And—which is more—you’ll be a Man, my son!\n"),RemoteObject.createImmutable("	\n"),RemoteObject.createImmutable("	")));Debug.locals.put("msj", _msj);Debug.locals.put("msj", _msj);
 BA.debugLineNum = 81;BA.debugLine="File.WriteString(strCarpeta, nf, msj)";
Debug.ShouldStop(65536);
b4xmainpage.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(_strcarpeta),(Object)(__ref.getField(true,"_nf" /*RemoteObject*/ )),(Object)(_msj));
 BA.debugLineNum = 85;BA.debugLine="Private strContenidoFichero As String";
Debug.ShouldStop(1048576);
_strcontenidofichero = RemoteObject.createImmutable("");Debug.locals.put("strContenidoFichero", _strcontenidofichero);
 BA.debugLineNum = 86;BA.debugLine="strContenidoFichero = File.ReadString(strCarpeta,";
Debug.ShouldStop(2097152);
_strcontenidofichero = b4xmainpage.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(_strcarpeta),(Object)(__ref.getField(true,"_nf" /*RemoteObject*/ )));Debug.locals.put("strContenidoFichero", _strcontenidofichero);
 BA.debugLineNum = 87;BA.debugLine="Log(\"El fichero contiene\")";
Debug.ShouldStop(4194304);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("El fichero contiene")));
 BA.debugLineNum = 88;BA.debugLine="Log(strContenidoFichero)";
Debug.ShouldStop(8388608);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(_strcontenidofichero));
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Button1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "b4xmainpage","button1_click", __ref);}
 BA.debugLineNum = 98;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="xui.MsgboxAsync(\"¡Hola Mundo!\", \"B4X\")";
Debug.ShouldStop(4);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¡Hola Mundo!")),(Object)(RemoteObject.createImmutable("B4X")));
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
 //BA.debugLineNum = 10;BA.debugLine="Private nf As String = \"lesson17_data.txt\"";
b4xmainpage._nf = BA.ObjectToString("lesson17_data.txt");__ref.setField("_nf",b4xmainpage._nf);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(8192);
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}