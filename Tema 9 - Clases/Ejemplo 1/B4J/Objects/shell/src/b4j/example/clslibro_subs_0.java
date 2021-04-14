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
 BA.debugLineNum = 28;BA.debugLine="Public Sub cambiarLibro(str1 As String, str2 As St";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="strTitulo = str1";
Debug.ShouldStop(268435456);
__ref.setField ("_strtitulo" /*RemoteObject*/ ,_str1);
 BA.debugLineNum = 30;BA.debugLine="strEscritor = str2";
Debug.ShouldStop(536870912);
__ref.setField ("_strescritor" /*RemoteObject*/ ,_str2);
 BA.debugLineNum = 31;BA.debugLine="strAno = str3";
Debug.ShouldStop(1073741824);
__ref.setField ("_strano" /*RemoteObject*/ ,_str3);
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
 //BA.debugLineNum = 3;BA.debugLine="Private strEscritor, strTitulo, strAno, strEditor";
clslibro._strescritor = RemoteObject.createImmutable("");__ref.setField("_strescritor",clslibro._strescritor);
clslibro._strtitulo = RemoteObject.createImmutable("");__ref.setField("_strtitulo",clslibro._strtitulo);
clslibro._strano = RemoteObject.createImmutable("");__ref.setField("_strano",clslibro._strano);
clslibro._streditorial = RemoteObject.createImmutable("");__ref.setField("_streditorial",clslibro._streditorial);
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getano(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getAno (clslibro) ","clslibro",2,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("getano")) { return __ref.runUserSub(false, "clslibro","getano", __ref);}
 BA.debugLineNum = 52;BA.debugLine="Public Sub getAno() As String";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="Return strAno";
Debug.ShouldStop(1048576);
if (true) return __ref.getField(true,"_strano" /*RemoteObject*/ );
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _geteditorial(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getEditorial (clslibro) ","clslibro",2,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("geteditorial")) { return __ref.runUserSub(false, "clslibro","geteditorial", __ref);}
 BA.debugLineNum = 60;BA.debugLine="Public Sub getEditorial() As String";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="Return strEditorial";
Debug.ShouldStop(268435456);
if (true) return __ref.getField(true,"_streditorial" /*RemoteObject*/ );
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getescritor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getEscritor (clslibro) ","clslibro",2,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("getescritor")) { return __ref.runUserSub(false, "clslibro","getescritor", __ref);}
 BA.debugLineNum = 36;BA.debugLine="Public Sub getEscritor() As String";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Return strEscritor";
Debug.ShouldStop(16);
if (true) return __ref.getField(true,"_strescritor" /*RemoteObject*/ );
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
public static RemoteObject  _gettitulo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTitulo (clslibro) ","clslibro",2,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("gettitulo")) { return __ref.runUserSub(false, "clslibro","gettitulo", __ref);}
 BA.debugLineNum = 44;BA.debugLine="Public Sub getTitulo() As String";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="Return strTitulo";
Debug.ShouldStop(4096);
if (true) return __ref.getField(true,"_strtitulo" /*RemoteObject*/ );
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Initialize (clslibro) ","clslibro",2,__ref.getField(false, "ba"),__ref,7);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "clslibro","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(64);
 BA.debugLineNum = 8;BA.debugLine="strTitulo = \"\"";
Debug.ShouldStop(128);
__ref.setField ("_strtitulo" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 9;BA.debugLine="strEscritor = \"\"";
Debug.ShouldStop(256);
__ref.setField ("_strescritor" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 10;BA.debugLine="strAno = \"\"";
Debug.ShouldStop(512);
__ref.setField ("_strano" /*RemoteObject*/ ,BA.ObjectToString(""));
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
 BA.debugLineNum = 14;BA.debugLine="Public Sub insertarLibro(str1 As String, str2 As S";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="strTitulo = str1";
Debug.ShouldStop(16384);
__ref.setField ("_strtitulo" /*RemoteObject*/ ,_str1);
 BA.debugLineNum = 16;BA.debugLine="strEscritor = str2";
Debug.ShouldStop(32768);
__ref.setField ("_strescritor" /*RemoteObject*/ ,_str2);
 BA.debugLineNum = 17;BA.debugLine="strAno = str3";
Debug.ShouldStop(65536);
__ref.setField ("_strano" /*RemoteObject*/ ,_str3);
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
public static RemoteObject  _mostrarlibro(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("mostrarLibro (clslibro) ","clslibro",2,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("mostrarlibro")) { return __ref.runUserSub(false, "clslibro","mostrarlibro", __ref);}
 BA.debugLineNum = 21;BA.debugLine="Public Sub mostrarLibro";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Log(\"Título    : \" & strTitulo)";
Debug.ShouldStop(2097152);
clslibro.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Título    : "),__ref.getField(true,"_strtitulo" /*RemoteObject*/ ))));
 BA.debugLineNum = 23;BA.debugLine="Log(\"Escritor  : \" & strEscritor)";
Debug.ShouldStop(4194304);
clslibro.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Escritor  : "),__ref.getField(true,"_strescritor" /*RemoteObject*/ ))));
 BA.debugLineNum = 24;BA.debugLine="Log(\"Año       : \" & strAno)";
Debug.ShouldStop(8388608);
clslibro.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Año       : "),__ref.getField(true,"_strano" /*RemoteObject*/ ))));
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
public static RemoteObject  _setano(RemoteObject __ref,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("setAno (clslibro) ","clslibro",2,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("setano")) { return __ref.runUserSub(false, "clslibro","setano", __ref, _y);}
Debug.locals.put("y", _y);
 BA.debugLineNum = 56;BA.debugLine="Public Sub setAno(y As String)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="strAno = y";
Debug.ShouldStop(16777216);
__ref.setField ("_strano" /*RemoteObject*/ ,_y);
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setescritor(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("setEscritor (clslibro) ","clslibro",2,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("setescritor")) { return __ref.runUserSub(false, "clslibro","setescritor", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 40;BA.debugLine="Public Sub setEscritor(e As String)";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="strEscritor = e";
Debug.ShouldStop(256);
__ref.setField ("_strescritor" /*RemoteObject*/ ,_e);
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpublisher(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("setPublisher (clslibro) ","clslibro",2,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("setpublisher")) { return __ref.runUserSub(false, "clslibro","setpublisher", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 64;BA.debugLine="Public Sub setPublisher(p As String)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="strEditorial = p";
Debug.ShouldStop(1);
__ref.setField ("_streditorial" /*RemoteObject*/ ,_p);
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settitulo(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("setTitulo (clslibro) ","clslibro",2,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("settitulo")) { return __ref.runUserSub(false, "clslibro","settitulo", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 48;BA.debugLine="Public Sub setTitulo(t As String)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="strTitulo = t";
Debug.ShouldStop(65536);
__ref.setField ("_strtitulo" /*RemoteObject*/ ,_t);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
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