package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clscurso_subs_0 {


public static RemoteObject  _cambiarhoras(RemoteObject __ref,RemoteObject _horas) throws Exception{
try {
		Debug.PushSubsStack("cambiarHoras (clscurso) ","clscurso",2,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("cambiarhoras")) { return __ref.runUserSub(false, "clscurso","cambiarhoras", __ref, _horas);}
Debug.locals.put("horas", _horas);
 BA.debugLineNum = 28;BA.debugLine="Public Sub cambiarHoras(horas As String)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="strHoras = horas";
Debug.ShouldStop(268435456);
__ref.setField ("_strhoras" /*RemoteObject*/ ,_horas);
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
public static RemoteObject  _cambiarprofesor(RemoteObject __ref,RemoteObject _prof) throws Exception{
try {
		Debug.PushSubsStack("cambiarProfesor (clscurso) ","clscurso",2,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("cambiarprofesor")) { return __ref.runUserSub(false, "clscurso","cambiarprofesor", __ref, _prof);}
Debug.locals.put("prof", _prof);
 BA.debugLineNum = 33;BA.debugLine="Public Sub cambiarProfesor(prof As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="strProfesor = prof";
Debug.ShouldStop(2);
__ref.setField ("_strprofesor" /*RemoteObject*/ ,_prof);
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
clscurso._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",clscurso._fx);
 //BA.debugLineNum = 7;BA.debugLine="Public strTema, strClase, strHoras, strProfesor A";
clscurso._strtema = RemoteObject.createImmutable("");__ref.setField("_strtema",clscurso._strtema);
clscurso._strclase = RemoteObject.createImmutable("");__ref.setField("_strclase",clscurso._strclase);
clscurso._strhoras = RemoteObject.createImmutable("");__ref.setField("_strhoras",clscurso._strhoras);
clscurso._strprofesor = RemoteObject.createImmutable("");__ref.setField("_strprofesor",clscurso._strprofesor);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clscurso) ","clscurso",2,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "clscurso","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="strTema = \"\"";
Debug.ShouldStop(2048);
__ref.setField ("_strtema" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 13;BA.debugLine="strClase = \"\"";
Debug.ShouldStop(4096);
__ref.setField ("_strclase" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 14;BA.debugLine="strHoras = \"\"";
Debug.ShouldStop(8192);
__ref.setField ("_strhoras" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 15;BA.debugLine="strProfesor = \"\"";
Debug.ShouldStop(16384);
__ref.setField ("_strprofesor" /*RemoteObject*/ ,BA.ObjectToString(""));
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
public static RemoteObject  _mostrarcurso(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("mostrarCurso (clscurso) ","clscurso",2,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("mostrarcurso")) { return __ref.runUserSub(false, "clscurso","mostrarcurso", __ref);}
 BA.debugLineNum = 38;BA.debugLine="Public Sub mostrarCurso";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Log ( $\" 	Tema		: ${strTema} 	Clase		: ${strClase";
Debug.ShouldStop(64);
clscurso.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	Tema		: "),clscurso.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_strtema" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	Clase		: "),clscurso.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_strclase" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	Horas		: "),clscurso.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_strhoras" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	Profesor	: "),clscurso.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_strprofesor" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	")))));
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
public static RemoteObject  _nuevocurso(RemoteObject __ref,RemoteObject _nombre,RemoteObject _clase,RemoteObject _horas,RemoteObject _prof) throws Exception{
try {
		Debug.PushSubsStack("nuevoCurso (clscurso) ","clscurso",2,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("nuevocurso")) { return __ref.runUserSub(false, "clscurso","nuevocurso", __ref, _nombre, _clase, _horas, _prof);}
Debug.locals.put("nombre", _nombre);
Debug.locals.put("clase", _clase);
Debug.locals.put("horas", _horas);
Debug.locals.put("prof", _prof);
 BA.debugLineNum = 19;BA.debugLine="Public Sub nuevoCurso(nombre As String, clase As S";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="strTema = nombre";
Debug.ShouldStop(524288);
__ref.setField ("_strtema" /*RemoteObject*/ ,_nombre);
 BA.debugLineNum = 21;BA.debugLine="strClase = clase";
Debug.ShouldStop(1048576);
__ref.setField ("_strclase" /*RemoteObject*/ ,_clase);
 BA.debugLineNum = 22;BA.debugLine="strHoras = horas";
Debug.ShouldStop(2097152);
__ref.setField ("_strhoras" /*RemoteObject*/ ,_horas);
 BA.debugLineNum = 23;BA.debugLine="strProfesor = prof";
Debug.ShouldStop(4194304);
__ref.setField ("_strprofesor" /*RemoteObject*/ ,_prof);
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
}