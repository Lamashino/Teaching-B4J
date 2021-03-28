package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clsestudiante_subs_0 {


public static RemoteObject  _cambiarclase(RemoteObject __ref,RemoteObject _class) throws Exception{
try {
		Debug.PushSubsStack("cambiarClase (clsestudiante) ","clsestudiante",2,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("cambiarclase")) { return __ref.runUserSub(false, "clsestudiante","cambiarclase", __ref, _class);}
Debug.locals.put("class", _class);
 BA.debugLineNum = 48;BA.debugLine="Public Sub cambiarClase(class As String)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="strClase = class";
Debug.ShouldStop(65536);
__ref.setField ("_strclase" /*RemoteObject*/ ,_class);
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
public static RemoteObject  _cambiartelefono(RemoteObject __ref,RemoteObject _phone) throws Exception{
try {
		Debug.PushSubsStack("cambiarTelefono (clsestudiante) ","clsestudiante",2,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("cambiartelefono")) { return __ref.runUserSub(false, "clsestudiante","cambiartelefono", __ref, _phone);}
Debug.locals.put("phone", _phone);
 BA.debugLineNum = 54;BA.debugLine="Public Sub cambiarTelefono(phone As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="strTeléfono = phone";
Debug.ShouldStop(4194304);
__ref.setField ("_strteléfono" /*RemoteObject*/ ,_phone);
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
clsestudiante._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",clsestudiante._fx);
 //BA.debugLineNum = 9;BA.debugLine="Private strIdEscolar, strNombre, strApellidos, st";
clsestudiante._stridescolar = RemoteObject.createImmutable("");__ref.setField("_stridescolar",clsestudiante._stridescolar);
clsestudiante._strnombre = RemoteObject.createImmutable("");__ref.setField("_strnombre",clsestudiante._strnombre);
clsestudiante._strapellidos = RemoteObject.createImmutable("");__ref.setField("_strapellidos",clsestudiante._strapellidos);
clsestudiante._strteléfono = RemoteObject.createImmutable("");__ref.setField("_strteléfono",clsestudiante._strteléfono);
clsestudiante._strcorreo = RemoteObject.createImmutable("");__ref.setField("_strcorreo",clsestudiante._strcorreo);
clsestudiante._strclase = RemoteObject.createImmutable("");__ref.setField("_strclase",clsestudiante._strclase);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clsestudiante) ","clsestudiante",2,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "clsestudiante","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="strIdEscolar = \"\"";
Debug.ShouldStop(8192);
__ref.setField ("_stridescolar" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 15;BA.debugLine="strNombre = \"\"";
Debug.ShouldStop(16384);
__ref.setField ("_strnombre" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 16;BA.debugLine="strApellidos = \"\"";
Debug.ShouldStop(32768);
__ref.setField ("_strapellidos" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 17;BA.debugLine="strTeléfono = \"\"";
Debug.ShouldStop(65536);
__ref.setField ("_strteléfono" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 18;BA.debugLine="strCorreo = \"\"";
Debug.ShouldStop(131072);
__ref.setField ("_strcorreo" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 19;BA.debugLine="strClase = \"\"";
Debug.ShouldStop(262144);
__ref.setField ("_strclase" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mostrarestudiante(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("mostrarEstudiante (clsestudiante) ","clsestudiante",2,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("mostrarestudiante")) { return __ref.runUserSub(false, "clsestudiante","mostrarestudiante", __ref);}
 BA.debugLineNum = 35;BA.debugLine="Public Sub mostrarEstudiante				' Excplicar la cad";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Log ($\" 								 	Id. Escolar : ${strIdEscolar}";
Debug.ShouldStop(8);
clsestudiante.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" 								\n"),RemoteObject.createImmutable("	Id. Escolar : "),clsestudiante.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_stridescolar" /*RemoteObject*/ )))),RemoteObject.createImmutable(" \n"),RemoteObject.createImmutable("	Nombre		: "),clsestudiante.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_strnombre" /*RemoteObject*/ )))),RemoteObject.createImmutable(" \n"),RemoteObject.createImmutable("	Apellidos	: "),clsestudiante.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_strapellidos" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	Teléfono	: "),clsestudiante.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_strteléfono" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	Correo elec.: "),clsestudiante.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_strcorreo" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	Clase		: "),clsestudiante.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_strclase" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	")))));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nuevoestudiante(RemoteObject __ref,RemoteObject _idesc,RemoteObject _nombre,RemoteObject _apellidos,RemoteObject _teléfono,RemoteObject _correo,RemoteObject _clase) throws Exception{
try {
		Debug.PushSubsStack("nuevoEstudiante (clsestudiante) ","clsestudiante",2,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("nuevoestudiante")) { return __ref.runUserSub(false, "clsestudiante","nuevoestudiante", __ref, _idesc, _nombre, _apellidos, _teléfono, _correo, _clase);}
Debug.locals.put("idEsc", _idesc);
Debug.locals.put("Nombre", _nombre);
Debug.locals.put("Apellidos", _apellidos);
Debug.locals.put("Teléfono", _teléfono);
Debug.locals.put("correo", _correo);
Debug.locals.put("clase", _clase);
 BA.debugLineNum = 24;BA.debugLine="Public Sub nuevoEstudiante(idEsc As String, Nombre";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="strIdEscolar = idEsc";
Debug.ShouldStop(16777216);
__ref.setField ("_stridescolar" /*RemoteObject*/ ,_idesc);
 BA.debugLineNum = 26;BA.debugLine="strNombre = Nombre";
Debug.ShouldStop(33554432);
__ref.setField ("_strnombre" /*RemoteObject*/ ,_nombre);
 BA.debugLineNum = 27;BA.debugLine="strApellidos = Apellidos";
Debug.ShouldStop(67108864);
__ref.setField ("_strapellidos" /*RemoteObject*/ ,_apellidos);
 BA.debugLineNum = 28;BA.debugLine="strTeléfono = Teléfono";
Debug.ShouldStop(134217728);
__ref.setField ("_strteléfono" /*RemoteObject*/ ,_teléfono);
 BA.debugLineNum = 29;BA.debugLine="strCorreo = correo";
Debug.ShouldStop(268435456);
__ref.setField ("_strcorreo" /*RemoteObject*/ ,_correo);
 BA.debugLineNum = 30;BA.debugLine="strClase = clase";
Debug.ShouldStop(536870912);
__ref.setField ("_strclase" /*RemoteObject*/ ,_clase);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}