package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clslibro_subs_0 {


public static RemoteObject  _cambiarlibro(RemoteObject __ref,RemoteObject _str1,RemoteObject _str2,RemoteObject _str3,RemoteObject _str4) throws Exception{
try {
		Debug.PushSubsStack("cambiarLibro (clslibro) ","clslibro",2,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("cambiarlibro")) { return __ref.runUserSub(false, "clslibro","cambiarlibro", __ref, _str1, _str2, _str3, _str4);}
Debug.locals.put("str1", _str1);
Debug.locals.put("str2", _str2);
Debug.locals.put("str3", _str3);
Debug.locals.put("str4", _str4);
 BA.debugLineNum = 28;BA.debugLine="Public Sub cambiarLibro(str1, str2, str3, str4 As";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="strTítulo = str1";
Debug.ShouldStop(268435456);
__ref.setField ("_strtítulo" /*RemoteObject*/ ,_str1);
 BA.debugLineNum = 30;BA.debugLine="strEscritor = str2";
Debug.ShouldStop(536870912);
__ref.setField ("_strescritor" /*RemoteObject*/ ,_str2);
 BA.debugLineNum = 31;BA.debugLine="strAño = str3";
Debug.ShouldStop(1073741824);
__ref.setField ("_straño" /*RemoteObject*/ ,_str3);
 BA.debugLineNum = 32;BA.debugLine="strEditorial = str4";
Debug.ShouldStop(-2147483648);
__ref.setField ("_streditorial" /*RemoteObject*/ ,_str4);
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
clslibro._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",clslibro._fx);
 //BA.debugLineNum = 3;BA.debugLine="Public strEscritor, strTítulo, strAño, strEditori";
clslibro._strescritor = RemoteObject.createImmutable("");__ref.setField("_strescritor",clslibro._strescritor);
clslibro._strtítulo = RemoteObject.createImmutable("");__ref.setField("_strtítulo",clslibro._strtítulo);
clslibro._straño = RemoteObject.createImmutable("");__ref.setField("_straño",clslibro._straño);
clslibro._streditorial = RemoteObject.createImmutable("");__ref.setField("_streditorial",clslibro._streditorial);
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clslibro) ","clslibro",2,__ref.getField(false, "ba"),__ref,7);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "clslibro","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(64);
 BA.debugLineNum = 8;BA.debugLine="strTítulo = \"\"";
Debug.ShouldStop(128);
__ref.setField ("_strtítulo" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 9;BA.debugLine="strEscritor = \"\"";
Debug.ShouldStop(256);
__ref.setField ("_strescritor" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 10;BA.debugLine="strAño = \"\"";
Debug.ShouldStop(512);
__ref.setField ("_straño" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 11;BA.debugLine="strEditorial = \"\"";
Debug.ShouldStop(1024);
__ref.setField ("_streditorial" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertarlibro(RemoteObject __ref,RemoteObject _str1,RemoteObject _str2,RemoteObject _str3,RemoteObject _str4) throws Exception{
try {
		Debug.PushSubsStack("insertarLibro (clslibro) ","clslibro",2,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("insertarlibro")) { return __ref.runUserSub(false, "clslibro","insertarlibro", __ref, _str1, _str2, _str3, _str4);}
Debug.locals.put("str1", _str1);
Debug.locals.put("str2", _str2);
Debug.locals.put("str3", _str3);
Debug.locals.put("str4", _str4);
 BA.debugLineNum = 14;BA.debugLine="Public Sub insertarLibro(str1, str2, str3, str4 As";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="strTítulo = str1";
Debug.ShouldStop(16384);
__ref.setField ("_strtítulo" /*RemoteObject*/ ,_str1);
 BA.debugLineNum = 16;BA.debugLine="strEscritor = str2";
Debug.ShouldStop(32768);
__ref.setField ("_strescritor" /*RemoteObject*/ ,_str2);
 BA.debugLineNum = 17;BA.debugLine="strAño = str3";
Debug.ShouldStop(65536);
__ref.setField ("_straño" /*RemoteObject*/ ,_str3);
 BA.debugLineNum = 18;BA.debugLine="strEditorial = str4";
Debug.ShouldStop(131072);
__ref.setField ("_streditorial" /*RemoteObject*/ ,_str4);
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
public static RemoteObject  _loglibro(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("logLibro (clslibro) ","clslibro",2,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("loglibro")) { return __ref.runUserSub(false, "clslibro","loglibro", __ref);}
 BA.debugLineNum = 21;BA.debugLine="Public Sub logLibro";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Log(\"Título    : \" & strTítulo)";
Debug.ShouldStop(2097152);
clslibro.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Título    : "),__ref.getField(true,"_strtítulo" /*RemoteObject*/ ))));
 BA.debugLineNum = 23;BA.debugLine="Log(\"Escritor  : \" & strEscritor)";
Debug.ShouldStop(4194304);
clslibro.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Escritor  : "),__ref.getField(true,"_strescritor" /*RemoteObject*/ ))));
 BA.debugLineNum = 24;BA.debugLine="Log(\"Año       : \" & strAño)";
Debug.ShouldStop(8388608);
clslibro.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Año       : "),__ref.getField(true,"_straño" /*RemoteObject*/ ))));
 BA.debugLineNum = 25;BA.debugLine="Log(\"Editorial : \" & strEditorial)";
Debug.ShouldStop(16777216);
clslibro.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Editorial : "),__ref.getField(true,"_streditorial" /*RemoteObject*/ ))));
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
}