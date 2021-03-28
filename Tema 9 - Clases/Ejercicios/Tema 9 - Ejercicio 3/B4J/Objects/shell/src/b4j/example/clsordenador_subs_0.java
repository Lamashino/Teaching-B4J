package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clsordenador_subs_0 {


public static RemoteObject  _cambiarcpu(RemoteObject __ref,RemoteObject _cpu) throws Exception{
try {
		Debug.PushSubsStack("cambiarCPU (clsordenador) ","clsordenador",2,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("cambiarcpu")) { return __ref.runUserSub(false, "clsordenador","cambiarcpu", __ref, _cpu);}
Debug.locals.put("cpu", _cpu);
 BA.debugLineNum = 31;BA.debugLine="public Sub cambiarCPU(cpu As String)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="strCpu = cpu";
Debug.ShouldStop(-2147483648);
__ref.setField ("_strcpu" /*RemoteObject*/ ,_cpu);
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
public static RemoteObject  _cambiarprecio(RemoteObject __ref,RemoteObject _precio) throws Exception{
try {
		Debug.PushSubsStack("cambiarPrecio (clsordenador) ","clsordenador",2,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("cambiarprecio")) { return __ref.runUserSub(false, "clsordenador","cambiarprecio", __ref, _precio);}
Debug.locals.put("precio", _precio);
 BA.debugLineNum = 35;BA.debugLine="public Sub cambiarPrecio(precio As Float)";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="fltPrecio = precio";
Debug.ShouldStop(8);
__ref.setField ("_fltprecio" /*RemoteObject*/ ,_precio);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
clsordenador._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",clsordenador._fx);
 //BA.debugLineNum = 3;BA.debugLine="Public strTipo, strModelo, strCpu As String";
clsordenador._strtipo = RemoteObject.createImmutable("");__ref.setField("_strtipo",clsordenador._strtipo);
clsordenador._strmodelo = RemoteObject.createImmutable("");__ref.setField("_strmodelo",clsordenador._strmodelo);
clsordenador._strcpu = RemoteObject.createImmutable("");__ref.setField("_strcpu",clsordenador._strcpu);
 //BA.debugLineNum = 4;BA.debugLine="Public fltPrecio As Float";
clsordenador._fltprecio = RemoteObject.createImmutable(0f);__ref.setField("_fltprecio",clsordenador._fltprecio);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clsordenador) ","clsordenador",2,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "clsordenador","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 9;BA.debugLine="strTipo = \"\"";
Debug.ShouldStop(256);
__ref.setField ("_strtipo" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 10;BA.debugLine="strModelo = \"\"";
Debug.ShouldStop(512);
__ref.setField ("_strmodelo" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 11;BA.debugLine="strCpu = \"\"";
Debug.ShouldStop(1024);
__ref.setField ("_strcpu" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 12;BA.debugLine="fltPrecio = 0";
Debug.ShouldStop(2048);
__ref.setField ("_fltprecio" /*RemoteObject*/ ,BA.numberCast(float.class, 0));
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mostrarordenador(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("mostrarOrdenador (clsordenador) ","clsordenador",2,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("mostrarordenador")) { return __ref.runUserSub(false, "clsordenador","mostrarordenador", __ref);}
 BA.debugLineNum = 23;BA.debugLine="Public Sub mostrarOrdenador";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="Log(\"Tipo 		: \" & strTipo)";
Debug.ShouldStop(8388608);
clsordenador.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Tipo 		: "),__ref.getField(true,"_strtipo" /*RemoteObject*/ ))));
 BA.debugLineNum = 25;BA.debugLine="Log(\"Modelo		: \" & strModelo)";
Debug.ShouldStop(16777216);
clsordenador.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Modelo		: "),__ref.getField(true,"_strmodelo" /*RemoteObject*/ ))));
 BA.debugLineNum = 26;BA.debugLine="Log(\"CPU		: \" & strCpu)";
Debug.ShouldStop(33554432);
clsordenador.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("CPU		: "),__ref.getField(true,"_strcpu" /*RemoteObject*/ ))));
 BA.debugLineNum = 27;BA.debugLine="Log(\"Precio		: \" & fltPrecio)";
Debug.ShouldStop(67108864);
clsordenador.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Precio		: "),__ref.getField(true,"_fltprecio" /*RemoteObject*/ ))));
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nuevoordenador(RemoteObject __ref,RemoteObject _tp,RemoteObject _modelo,RemoteObject _cpu,RemoteObject _precio) throws Exception{
try {
		Debug.PushSubsStack("nuevoOrdenador (clsordenador) ","clsordenador",2,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("nuevoordenador")) { return __ref.runUserSub(false, "clsordenador","nuevoordenador", __ref, _tp, _modelo, _cpu, _precio);}
Debug.locals.put("tp", _tp);
Debug.locals.put("modelo", _modelo);
Debug.locals.put("cpu", _cpu);
Debug.locals.put("precio", _precio);
 BA.debugLineNum = 15;BA.debugLine="Public Sub nuevoOrdenador(tp As String , modelo As";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="strTipo = tp";
Debug.ShouldStop(32768);
__ref.setField ("_strtipo" /*RemoteObject*/ ,_tp);
 BA.debugLineNum = 17;BA.debugLine="strModelo = modelo";
Debug.ShouldStop(65536);
__ref.setField ("_strmodelo" /*RemoteObject*/ ,_modelo);
 BA.debugLineNum = 18;BA.debugLine="strCpu = cpu";
Debug.ShouldStop(131072);
__ref.setField ("_strcpu" /*RemoteObject*/ ,_cpu);
 BA.debugLineNum = 19;BA.debugLine="fltPrecio = precio";
Debug.ShouldStop(262144);
__ref.setField ("_fltprecio" /*RemoteObject*/ ,_precio);
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
}