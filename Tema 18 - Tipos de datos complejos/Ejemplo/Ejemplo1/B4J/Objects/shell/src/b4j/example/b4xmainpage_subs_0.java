package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
int _i = 0;
RemoteObject _est = RemoteObject.declareNull("b4j.example.b4xmainpage._estudiante");
RemoteObject _estudiante3 = RemoteObject.declareNull("b4j.example.b4xmainpage._estudiante");
RemoteObject _claves = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 22;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Root = Root1";
Debug.ShouldStop(4194304);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 24;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 25;BA.debugLine="Estudiante1.ID = \"FS23534X21\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_estudiante1" /*RemoteObject*/ ).setField ("ID" /*RemoteObject*/ ,BA.ObjectToString("FS23534X21"));
 BA.debugLineNum = 26;BA.debugLine="Estudiante1.Apellidos = \"Ioannidis\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_estudiante1" /*RemoteObject*/ ).setField ("Apellidos" /*RemoteObject*/ ,BA.ObjectToString("Ioannidis"));
 BA.debugLineNum = 27;BA.debugLine="Estudiante1.Nombre = \"Alkinoos\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_estudiante1" /*RemoteObject*/ ).setField ("Nombre" /*RemoteObject*/ ,BA.ObjectToString("Alkinoos"));
 BA.debugLineNum = 28;BA.debugLine="Estudiante1.Dirección = \"Atenas, Grecia\"";
Debug.ShouldStop(134217728);
__ref.getField(false,"_estudiante1" /*RemoteObject*/ ).setField ("Dirección" /*RemoteObject*/ ,BA.ObjectToString("Atenas, Grecia"));
 BA.debugLineNum = 29;BA.debugLine="Estudiante1.Teléfono = \"+303465854234\"";
Debug.ShouldStop(268435456);
__ref.getField(false,"_estudiante1" /*RemoteObject*/ ).setField ("Teléfono" /*RemoteObject*/ ,BA.ObjectToString("+303465854234"));
 BA.debugLineNum = 31;BA.debugLine="Log(Estudiante1)";
Debug.ShouldStop(1073741824);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(__ref.getField(false,"_estudiante1" /*RemoteObject*/ ))));
 BA.debugLineNum = 33;BA.debugLine="listaEstudiantes.Initialize";
Debug.ShouldStop(1);
__ref.getField(false,"_listaestudiantes" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 34;BA.debugLine="listaEstudiantes.Add(Estudiante1)";
Debug.ShouldStop(2);
__ref.getField(false,"_listaestudiantes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.getField(false,"_estudiante1" /*RemoteObject*/ ))));
 BA.debugLineNum = 36;BA.debugLine="For i = 0 To listaEstudiantes.Size-1";
Debug.ShouldStop(8);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_listaestudiantes" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 37;BA.debugLine="Private est As Estudiante";
Debug.ShouldStop(16);
_est = RemoteObject.createNew ("b4j.example.b4xmainpage._estudiante");Debug.locals.put("est", _est);
 BA.debugLineNum = 38;BA.debugLine="est = listaEstudiantes.Get(i)";
Debug.ShouldStop(32);
_est = (__ref.getField(false,"_listaestudiantes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("est", _est);
 BA.debugLineNum = 39;BA.debugLine="LogEstudiante(est)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_logestudiante" /*RemoteObject*/ ,(Object)(_est));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 42;BA.debugLine="mapStudents.Initialize";
Debug.ShouldStop(512);
__ref.getField(false,"_mapstudents" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 43;BA.debugLine="mapStudents.Put(Estudiante1.ID, Estudiante1)";
Debug.ShouldStop(1024);
__ref.getField(false,"_mapstudents" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((__ref.getField(false,"_estudiante1" /*RemoteObject*/ ).getField(true,"ID" /*RemoteObject*/ ))),(Object)((__ref.getField(false,"_estudiante1" /*RemoteObject*/ ))));
 BA.debugLineNum = 45;BA.debugLine="File.MakeDir(File.DirTemp, \"tema18\")";
Debug.ShouldStop(4096);
b4xmainpage.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(RemoteObject.createImmutable("tema18")));
 BA.debugLineNum = 46;BA.debugLine="kvsFile.Initialize(File.DirTemp & \"tema18\", \"kvsD";
Debug.ShouldStop(8192);
__ref.getField(false,"_kvsfile" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirTemp"),RemoteObject.createImmutable("tema18"))),(Object)(RemoteObject.createImmutable("kvsData.dat")));
 BA.debugLineNum = 47;BA.debugLine="Log(File.DirTemp & \"tema18\")";
Debug.ShouldStop(16384);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirTemp"),RemoteObject.createImmutable("tema18"))));
 BA.debugLineNum = 49;BA.debugLine="kvsFile.Put(Estudiante1.ID, Estudiante1)";
Debug.ShouldStop(65536);
__ref.getField(false,"_kvsfile" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_estudiante1" /*RemoteObject*/ ).getField(true,"ID" /*RemoteObject*/ )),(Object)((__ref.getField(false,"_estudiante1" /*RemoteObject*/ ))));
 BA.debugLineNum = 50;BA.debugLine="kvsFile.PutMapAsync(mapStudents)";
Debug.ShouldStop(131072);
__ref.getField(false,"_kvsfile" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_putmapasync" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mapstudents" /*RemoteObject*/ )));
 BA.debugLineNum = 52;BA.debugLine="Private Estudiante3 As Estudiante";
Debug.ShouldStop(524288);
_estudiante3 = RemoteObject.createNew ("b4j.example.b4xmainpage._estudiante");Debug.locals.put("Estudiante3", _estudiante3);
 BA.debugLineNum = 53;BA.debugLine="If kvsFile.ContainsKey(\"FS23534X21\") Then";
Debug.ShouldStop(1048576);
if (__ref.getField(false,"_kvsfile" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_containskey" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("FS23534X21"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 54;BA.debugLine="Estudiante3 = kvsFile.Get(\"FS23534X21\")";
Debug.ShouldStop(2097152);
_estudiante3 = (__ref.getField(false,"_kvsfile" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_get" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("FS23534X21"))));Debug.locals.put("Estudiante3", _estudiante3);
 }else {
 BA.debugLineNum = 56;BA.debugLine="Log(\"Clave de ID errónea\")";
Debug.ShouldStop(8388608);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Clave de ID errónea")));
 };
 BA.debugLineNum = 59;BA.debugLine="Log(\"Mostrar claves\")";
Debug.ShouldStop(67108864);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Mostrar claves")));
 BA.debugLineNum = 60;BA.debugLine="Private claves As List = kvsFile.ListKeys";
Debug.ShouldStop(134217728);
_claves = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_claves = __ref.getField(false,"_kvsfile" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_listkeys" /*RemoteObject*/ );Debug.locals.put("claves", _claves);Debug.locals.put("claves", _claves);
 BA.debugLineNum = 61;BA.debugLine="For i = 0 To claves.Size-1";
Debug.ShouldStop(268435456);
{
final int step31 = 1;
final int limit31 = RemoteObject.solve(new RemoteObject[] {_claves.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31) ;_i = ((int)(0 + _i + step31))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 62;BA.debugLine="Log(claves.Get(i))";
Debug.ShouldStop(536870912);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_claves.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 66;BA.debugLine="LogEstudiante(Estudiante3)";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_logestudiante" /*RemoteObject*/ ,(Object)(_estudiante3));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 10;BA.debugLine="Type Estudiante(ID As String, Apellidos As String";
;
 //BA.debugLineNum = 11;BA.debugLine="Public Estudiante1 As Estudiante";
b4xmainpage._estudiante1 = RemoteObject.createNew ("b4j.example.b4xmainpage._estudiante");__ref.setField("_estudiante1",b4xmainpage._estudiante1);
 //BA.debugLineNum = 12;BA.debugLine="Public Estudiante2 As Estudiante";
b4xmainpage._estudiante2 = RemoteObject.createNew ("b4j.example.b4xmainpage._estudiante");__ref.setField("_estudiante2",b4xmainpage._estudiante2);
 //BA.debugLineNum = 13;BA.debugLine="Private listaEstudiantes As List";
b4xmainpage._listaestudiantes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_listaestudiantes",b4xmainpage._listaestudiantes);
 //BA.debugLineNum = 14;BA.debugLine="Private mapStudents As Map";
b4xmainpage._mapstudents = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_mapstudents",b4xmainpage._mapstudents);
 //BA.debugLineNum = 15;BA.debugLine="Private kvsFile As KeyValueStore";
b4xmainpage._kvsfile = RemoteObject.createNew ("b4j.example.keyvaluestore");__ref.setField("_kvsfile",b4xmainpage._kvsfile);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(131072);
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
public static RemoteObject  _logestudiante(RemoteObject __ref,RemoteObject _est) throws Exception{
try {
		Debug.PushSubsStack("LogEstudiante (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("logestudiante")) { return __ref.runUserSub(false, "b4xmainpage","logestudiante", __ref, _est);}
Debug.locals.put("est", _est);
 BA.debugLineNum = 70;BA.debugLine="Private Sub LogEstudiante(est As Estudiante)";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="Log(est.Nombre)";
Debug.ShouldStop(64);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(_est.getField(true,"Nombre" /*RemoteObject*/ )));
 BA.debugLineNum = 72;BA.debugLine="Log(est.Apellidos)";
Debug.ShouldStop(128);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(_est.getField(true,"Apellidos" /*RemoteObject*/ )));
 BA.debugLineNum = 73;BA.debugLine="Log(est.Dirección)";
Debug.ShouldStop(256);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(_est.getField(true,"Dirección" /*RemoteObject*/ )));
 BA.debugLineNum = 74;BA.debugLine="Log(est.Teléfono)";
Debug.ShouldStop(512);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(_est.getField(true,"Teléfono" /*RemoteObject*/ )));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}