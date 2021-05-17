package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 32;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="Root = Root1";
Debug.ShouldStop(1);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 34;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(2);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 35;BA.debugLine="pgEstudiantes.Initialize";
Debug.ShouldStop(4);
__ref.getField(false,"_pgestudiantes" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpagestudents.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 36;BA.debugLine="B4XPages.AddPage(\"pgEstudiantes\", pgEstudiantes)";
Debug.ShouldStop(8);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("pgEstudiantes")),(Object)((__ref.getField(false,"_pgestudiantes" /*RemoteObject*/ ))));
 BA.debugLineNum = 37;BA.debugLine="pgLibros.Initialize";
Debug.ShouldStop(16);
__ref.getField(false,"_pglibros" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpagebooks.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 38;BA.debugLine="B4XPages.AddPage(\"pgLibros\", pgLibros)";
Debug.ShouldStop(32);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("pgLibros")),(Object)((__ref.getField(false,"_pglibros" /*RemoteObject*/ ))));
 BA.debugLineNum = 39;BA.debugLine="pgPrestar.Initialize";
Debug.ShouldStop(64);
__ref.getField(false,"_pgprestar" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpageborrow.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 40;BA.debugLine="B4XPages.AddPage(\"pgPrestar\", pgPrestar)";
Debug.ShouldStop(128);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("pgPrestar")),(Object)((__ref.getField(false,"_pgprestar" /*RemoteObject*/ ))));
 BA.debugLineNum = 41;BA.debugLine="pgDevolver.Initialize";
Debug.ShouldStop(256);
__ref.getField(false,"_pgdevolver" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpagereturn.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 42;BA.debugLine="B4XPages.AddPage(\"pgDevolver\", pgDevolver)";
Debug.ShouldStop(512);
b4xmainpage._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("pgDevolver")),(Object)((__ref.getField(false,"_pgdevolver" /*RemoteObject*/ ))));
 BA.debugLineNum = 45;BA.debugLine="lstEstudiantes = CargarEstudiantes";
Debug.ShouldStop(4096);
__ref.setField ("_lstestudiantes" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xmainpage.class, "_cargarestudiantes" /*RemoteObject*/ ));
 BA.debugLineNum = 46;BA.debugLine="mapaEstudiantes = lstEstudiantesAMapa(lstEstudian";
Debug.ShouldStop(8192);
__ref.setField ("_mapaestudiantes" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xmainpage.class, "_lstestudiantesamapa" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lstestudiantes" /*RemoteObject*/ ))));
 BA.debugLineNum = 48;BA.debugLine="lstLibros = CargarLibros";
Debug.ShouldStop(32768);
__ref.setField ("_lstlibros" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xmainpage.class, "_cargarlibros" /*RemoteObject*/ ));
 BA.debugLineNum = 49;BA.debugLine="mapaLibros = lstLibrosToMap(lstLibros)";
Debug.ShouldStop(65536);
__ref.setField ("_mapalibros" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.b4xmainpage.class, "_lstlibrostomap" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lstlibros" /*RemoteObject*/ ))));
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
public static RemoteObject  _btndevolver_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnDevolver_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,197);
if (RapidSub.canDelegate("btndevolver_click")) { return __ref.runUserSub(false, "b4xmainpage","btndevolver_click", __ref);}
 BA.debugLineNum = 197;BA.debugLine="Private Sub btnDevolver_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 198;BA.debugLine="B4XPages.ShowPage(\"pgDevolver\")";
Debug.ShouldStop(32);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pgDevolver")));
 BA.debugLineNum = 199;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnestudiantes_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnEstudiantes_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("btnestudiantes_click")) { return __ref.runUserSub(false, "b4xmainpage","btnestudiantes_click", __ref);}
 BA.debugLineNum = 182;BA.debugLine="Private Sub btnEstudiantes_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 183;BA.debugLine="B4XPages.ShowPage(\"pgEstudiantes\")";
Debug.ShouldStop(4194304);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pgEstudiantes")));
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlibros_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnLibros_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,192);
if (RapidSub.canDelegate("btnlibros_click")) { return __ref.runUserSub(false, "b4xmainpage","btnlibros_click", __ref);}
 BA.debugLineNum = 192;BA.debugLine="Private Sub btnLibros_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 193;BA.debugLine="B4XPages.ShowPage(\"pgLibros\")";
Debug.ShouldStop(1);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pgLibros")));
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnprestar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnPrestar_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,187);
if (RapidSub.canDelegate("btnprestar_click")) { return __ref.runUserSub(false, "b4xmainpage","btnprestar_click", __ref);}
 BA.debugLineNum = 187;BA.debugLine="Private Sub btnPrestar_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 188;BA.debugLine="B4XPages.ShowPage(\"pgPrestar\")";
Debug.ShouldStop(134217728);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pgPrestar")));
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargarestudiantes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargarEstudiantes (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("cargarestudiantes")) { return __ref.runUserSub(false, "b4xmainpage","cargarestudiantes", __ref);}
RemoteObject _listadevuelta = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _estud = null;
RemoteObject _i = RemoteObject.createImmutable(0);
int _j = 0;
 BA.debugLineNum = 54;BA.debugLine="Private Sub CargarEstudiantes As List";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Private listaDevuelta As List";
Debug.ShouldStop(4194304);
_listadevuelta = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listaDevuelta", _listadevuelta);
 BA.debugLineNum = 56;BA.debugLine="listaDevuelta.Initialize";
Debug.ShouldStop(8388608);
_listadevuelta.runVoidMethod ("Initialize");
 BA.debugLineNum = 57;BA.debugLine="Private estud(5) As String";
Debug.ShouldStop(16777216);
_estud = RemoteObject.createNewArray ("String", new int[] {5}, new Object[]{});Debug.locals.put("estud", _estud);
 BA.debugLineNum = 59;BA.debugLine="Private i As Int = 0";
Debug.ShouldStop(67108864);
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 60;BA.debugLine="For j = 0 To fichEstudiantes.Length-1";
Debug.ShouldStop(134217728);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fichestudiantes" /*RemoteObject*/ ).runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step5 > 0 && _j <= limit5) || (step5 < 0 && _j >= limit5) ;_j = ((int)(0 + _j + step5))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 61;BA.debugLine="If fichEstudiantes.CharAt(j) <> \";\" And fichEstu";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_fichestudiantes" /*RemoteObject*/ ).runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _j))),BA.ObjectToChar(";")) && RemoteObject.solveBoolean("!",__ref.getField(true,"_fichestudiantes" /*RemoteObject*/ ).runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _j))),BA.ObjectToChar(b4xmainpage.__c.getField(true,"CRLF")))) { 
 BA.debugLineNum = 62;BA.debugLine="estud(i) = estud(i) & fichEstudiantes.CharAt(j)";
Debug.ShouldStop(536870912);
_estud.setArrayElement (RemoteObject.concat(_estud.getArrayElement(true,_i),__ref.getField(true,"_fichestudiantes" /*RemoteObject*/ ).runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _j)))),_i);
 }else 
{ BA.debugLineNum = 63;BA.debugLine="Else if fichEstudiantes.CharAt(j) = \";\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_fichestudiantes" /*RemoteObject*/ ).runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _j))),BA.ObjectToChar(";"))) { 
 BA.debugLineNum = 64;BA.debugLine="i = i + 1";
Debug.ShouldStop(-2147483648);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }else 
{ BA.debugLineNum = 65;BA.debugLine="else if fichEstudiantes.CharAt(j) = CRLF Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_fichestudiantes" /*RemoteObject*/ ).runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _j))),BA.ObjectToChar(b4xmainpage.__c.getField(true,"CRLF")))) { 
 BA.debugLineNum = 66;BA.debugLine="i = 0";
Debug.ShouldStop(2);
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);
 BA.debugLineNum = 67;BA.debugLine="listaDevuelta.Add(estud)";
Debug.ShouldStop(4);
_listadevuelta.runVoidMethod ("Add",(Object)((_estud)));
 BA.debugLineNum = 68;BA.debugLine="Dim estud(5) As String";
Debug.ShouldStop(8);
_estud = RemoteObject.createNewArray ("String", new int[] {5}, new Object[]{});Debug.locals.put("estud", _estud);
 }}}
;
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 71;BA.debugLine="Return listaDevuelta";
Debug.ShouldStop(64);
if (true) return _listadevuelta;
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargarlibros(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargarLibros (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("cargarlibros")) { return __ref.runUserSub(false, "b4xmainpage","cargarlibros", __ref);}
RemoteObject _listadevuelta = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _libro = null;
RemoteObject _i = RemoteObject.createImmutable(0);
int _j = 0;
 BA.debugLineNum = 119;BA.debugLine="Private Sub CargarLibros As List";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="Private listaDevuelta As List";
Debug.ShouldStop(8388608);
_listadevuelta = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listaDevuelta", _listadevuelta);
 BA.debugLineNum = 121;BA.debugLine="listaDevuelta.Initialize";
Debug.ShouldStop(16777216);
_listadevuelta.runVoidMethod ("Initialize");
 BA.debugLineNum = 122;BA.debugLine="Dim libro(6) As String";
Debug.ShouldStop(33554432);
_libro = RemoteObject.createNewArray ("String", new int[] {6}, new Object[]{});Debug.locals.put("libro", _libro);
 BA.debugLineNum = 124;BA.debugLine="Dim i As Int = 0";
Debug.ShouldStop(134217728);
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 125;BA.debugLine="For j = 0 To fichLibros.Length-1";
Debug.ShouldStop(268435456);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fichlibros" /*RemoteObject*/ ).runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step5 > 0 && _j <= limit5) || (step5 < 0 && _j >= limit5) ;_j = ((int)(0 + _j + step5))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 126;BA.debugLine="If fichLibros.CharAt(j) <> \";\" And fichLibros.Ch";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_fichlibros" /*RemoteObject*/ ).runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _j))),BA.ObjectToChar(";")) && RemoteObject.solveBoolean("!",__ref.getField(true,"_fichlibros" /*RemoteObject*/ ).runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _j))),BA.ObjectToChar(b4xmainpage.__c.getField(true,"CRLF")))) { 
 BA.debugLineNum = 127;BA.debugLine="libro(i) = libro(i) & fichLibros.CharAt(j)";
Debug.ShouldStop(1073741824);
_libro.setArrayElement (RemoteObject.concat(_libro.getArrayElement(true,_i),__ref.getField(true,"_fichlibros" /*RemoteObject*/ ).runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _j)))),_i);
 }else 
{ BA.debugLineNum = 128;BA.debugLine="Else if fichLibros.CharAt(j) = \";\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_fichlibros" /*RemoteObject*/ ).runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _j))),BA.ObjectToChar(";"))) { 
 BA.debugLineNum = 129;BA.debugLine="i = i + 1";
Debug.ShouldStop(1);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }else 
{ BA.debugLineNum = 130;BA.debugLine="else if fichLibros.CharAt(j) = CRLF Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_fichlibros" /*RemoteObject*/ ).runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _j))),BA.ObjectToChar(b4xmainpage.__c.getField(true,"CRLF")))) { 
 BA.debugLineNum = 131;BA.debugLine="i = 0";
Debug.ShouldStop(4);
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);
 BA.debugLineNum = 132;BA.debugLine="listaDevuelta.Add(libro)";
Debug.ShouldStop(8);
_listadevuelta.runVoidMethod ("Add",(Object)((_libro)));
 BA.debugLineNum = 133;BA.debugLine="Dim libro(6) As String";
Debug.ShouldStop(16);
_libro = RemoteObject.createNewArray ("String", new int[] {6}, new Object[]{});Debug.locals.put("libro", _libro);
 }}}
;
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 136;BA.debugLine="Return listaDevuelta";
Debug.ShouldStop(128);
if (true) return _listadevuelta;
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
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
 //BA.debugLineNum = 10;BA.debugLine="Public pgEstudiantes As B4XPageStudents";
b4xmainpage._pgestudiantes = RemoteObject.createNew ("b4j.example.b4xpagestudents");__ref.setField("_pgestudiantes",b4xmainpage._pgestudiantes);
 //BA.debugLineNum = 11;BA.debugLine="Public pgLibros As B4XPageBooks";
b4xmainpage._pglibros = RemoteObject.createNew ("b4j.example.b4xpagebooks");__ref.setField("_pglibros",b4xmainpage._pglibros);
 //BA.debugLineNum = 12;BA.debugLine="Public pgPrestar As B4XPageBorrow";
b4xmainpage._pgprestar = RemoteObject.createNew ("b4j.example.b4xpageborrow");__ref.setField("_pgprestar",b4xmainpage._pgprestar);
 //BA.debugLineNum = 13;BA.debugLine="Public pgDevolver As B4XPageReturn";
b4xmainpage._pgdevolver = RemoteObject.createNew ("b4j.example.b4xpagereturn");__ref.setField("_pgdevolver",b4xmainpage._pgdevolver);
 //BA.debugLineNum = 14;BA.debugLine="Public lstEstudiantes, lstLibros As List";
b4xmainpage._lstestudiantes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstestudiantes",b4xmainpage._lstestudiantes);
b4xmainpage._lstlibros = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstlibros",b4xmainpage._lstlibros);
 //BA.debugLineNum = 15;BA.debugLine="Public mapaEstudiantes As Map";
b4xmainpage._mapaestudiantes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_mapaestudiantes",b4xmainpage._mapaestudiantes);
 //BA.debugLineNum = 16;BA.debugLine="Public mapaLibros As Map";
b4xmainpage._mapalibros = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_mapalibros",b4xmainpage._mapalibros);
 //BA.debugLineNum = 17;BA.debugLine="Type Libro(ID As String, Título As String, Escrit";
;
 //BA.debugLineNum = 19;BA.debugLine="Type Estudiante(ID As String, Nombre As String, A";
;
 //BA.debugLineNum = 21;BA.debugLine="Public fichEstudiantes As String";
b4xmainpage._fichestudiantes = RemoteObject.createImmutable("");__ref.setField("_fichestudiantes",b4xmainpage._fichestudiantes);
 //BA.debugLineNum = 22;BA.debugLine="Public fichLibros As String";
b4xmainpage._fichlibros = RemoteObject.createImmutable("");__ref.setField("_fichlibros",b4xmainpage._fichlibros);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 26;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="fichEstudiantes  = File.ReadString(File.DirAssets";
Debug.ShouldStop(67108864);
__ref.setField ("_fichestudiantes" /*RemoteObject*/ ,b4xmainpage.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("students.txt"))));
 BA.debugLineNum = 28;BA.debugLine="fichLibros  = File.ReadString(File.DirAssets, \"bo";
Debug.ShouldStop(134217728);
__ref.setField ("_fichlibros" /*RemoteObject*/ ,b4xmainpage.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("books.txt"))));
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lstestudiantesamapa(RemoteObject __ref,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("lstEstudiantesAMapa (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("lstestudiantesamapa")) { return __ref.runUserSub(false, "b4xmainpage","lstestudiantesamapa", __ref, _lst);}
RemoteObject _mestudiante = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _estud = null;
RemoteObject _est = RemoteObject.declareNull("b4j.example.b4xmainpage._estudiante");
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 76;BA.debugLine="Private Sub lstEstudiantesAMapa(lst As List) As Ma";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="Log(\"================\" & lst.Size & \" ===========";
Debug.ShouldStop(4096);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("================"),_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(" =================="))));
 BA.debugLineNum = 78;BA.debugLine="Private mEstudiante As Map";
Debug.ShouldStop(8192);
_mestudiante = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mEstudiante", _mestudiante);
 BA.debugLineNum = 79;BA.debugLine="mEstudiante.initialize";
Debug.ShouldStop(16384);
_mestudiante.runVoidMethod ("Initialize");
 BA.debugLineNum = 80;BA.debugLine="For i = 0 To lst.Size-1";
Debug.ShouldStop(32768);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 81;BA.debugLine="Private estud(5) As String";
Debug.ShouldStop(65536);
_estud = RemoteObject.createNewArray ("String", new int[] {5}, new Object[]{});Debug.locals.put("estud", _estud);
 BA.debugLineNum = 82;BA.debugLine="estud = lst.Get(i)";
Debug.ShouldStop(131072);
_estud = (_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("estud", _estud);
 BA.debugLineNum = 83;BA.debugLine="Private est As Estudiante";
Debug.ShouldStop(262144);
_est = RemoteObject.createNew ("b4j.example.b4xmainpage._estudiante");Debug.locals.put("est", _est);
 BA.debugLineNum = 84;BA.debugLine="est.Initialize";
Debug.ShouldStop(524288);
_est.runVoidMethod ("Initialize");
 BA.debugLineNum = 85;BA.debugLine="est.ID = estud(0)";
Debug.ShouldStop(1048576);
_est.setField ("ID" /*RemoteObject*/ ,_estud.getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 86;BA.debugLine="est.Nombre = estud(1)";
Debug.ShouldStop(2097152);
_est.setField ("Nombre" /*RemoteObject*/ ,_estud.getArrayElement(true,BA.numberCast(int.class, 1)));
 BA.debugLineNum = 87;BA.debugLine="est.Apellidos = estud(2)";
Debug.ShouldStop(4194304);
_est.setField ("Apellidos" /*RemoteObject*/ ,_estud.getArrayElement(true,BA.numberCast(int.class, 2)));
 BA.debugLineNum = 88;BA.debugLine="est.Clase = estud(3)";
Debug.ShouldStop(8388608);
_est.setField ("Clase" /*RemoteObject*/ ,_estud.getArrayElement(true,BA.numberCast(int.class, 3)));
 BA.debugLineNum = 89;BA.debugLine="est.Telefono = estud(4)";
Debug.ShouldStop(16777216);
_est.setField ("Telefono" /*RemoteObject*/ ,_estud.getArrayElement(true,BA.numberCast(int.class, 4)));
 BA.debugLineNum = 90;BA.debugLine="est.Prestado = 0";
Debug.ShouldStop(33554432);
_est.setField ("Prestado" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 91;BA.debugLine="mEstudiante.Put(estud(0), est)";
Debug.ShouldStop(67108864);
_mestudiante.runVoidMethod ("Put",(Object)((_estud.getArrayElement(true,BA.numberCast(int.class, 0)))),(Object)((_est)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 93;BA.debugLine="Return mEstudiante";
Debug.ShouldStop(268435456);
if (true) return _mestudiante;
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lstlibrostomap(RemoteObject __ref,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("lstLibrosToMap (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,141);
if (RapidSub.canDelegate("lstlibrostomap")) { return __ref.runUserSub(false, "b4xmainpage","lstlibrostomap", __ref, _lst);}
RemoteObject _mlibro = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _arlibro = null;
RemoteObject _lib = RemoteObject.declareNull("b4j.example.b4xmainpage._libro");
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 141;BA.debugLine="Private Sub lstLibrosToMap(lst As List) As Map";
Debug.ShouldStop(4096);
 BA.debugLineNum = 142;BA.debugLine="Private mLibro As Map";
Debug.ShouldStop(8192);
_mlibro = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mLibro", _mlibro);
 BA.debugLineNum = 143;BA.debugLine="mLibro.initialize";
Debug.ShouldStop(16384);
_mlibro.runVoidMethod ("Initialize");
 BA.debugLineNum = 144;BA.debugLine="For i = 0 To lst.Size-1";
Debug.ShouldStop(32768);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 145;BA.debugLine="Private arLibro(6) As String";
Debug.ShouldStop(65536);
_arlibro = RemoteObject.createNewArray ("String", new int[] {6}, new Object[]{});Debug.locals.put("arLibro", _arlibro);
 BA.debugLineNum = 146;BA.debugLine="arLibro = lst.Get(i)";
Debug.ShouldStop(131072);
_arlibro = (_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("arLibro", _arlibro);
 BA.debugLineNum = 147;BA.debugLine="Private  lib As Libro";
Debug.ShouldStop(262144);
_lib = RemoteObject.createNew ("b4j.example.b4xmainpage._libro");Debug.locals.put("lib", _lib);
 BA.debugLineNum = 148;BA.debugLine="lib.Initialize";
Debug.ShouldStop(524288);
_lib.runVoidMethod ("Initialize");
 BA.debugLineNum = 149;BA.debugLine="lib.ID = arLibro(0)";
Debug.ShouldStop(1048576);
_lib.setField ("ID" /*RemoteObject*/ ,_arlibro.getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 150;BA.debugLine="lib.Título = arLibro(1)";
Debug.ShouldStop(2097152);
_lib.setField ("Título" /*RemoteObject*/ ,_arlibro.getArrayElement(true,BA.numberCast(int.class, 1)));
 BA.debugLineNum = 151;BA.debugLine="lib.Escritor = arLibro(2)";
Debug.ShouldStop(4194304);
_lib.setField ("Escritor" /*RemoteObject*/ ,_arlibro.getArrayElement(true,BA.numberCast(int.class, 2)));
 BA.debugLineNum = 152;BA.debugLine="lib.Ano = arLibro(3)";
Debug.ShouldStop(8388608);
_lib.setField ("Ano" /*RemoteObject*/ ,_arlibro.getArrayElement(true,BA.numberCast(int.class, 3)));
 BA.debugLineNum = 153;BA.debugLine="lib.Editorial = arLibro(4)";
Debug.ShouldStop(16777216);
_lib.setField ("Editorial" /*RemoteObject*/ ,_arlibro.getArrayElement(true,BA.numberCast(int.class, 4)));
 BA.debugLineNum = 154;BA.debugLine="lib.Estante = arLibro(5)";
Debug.ShouldStop(33554432);
_lib.setField ("Estante" /*RemoteObject*/ ,BA.numberCast(int.class, _arlibro.getArrayElement(true,BA.numberCast(int.class, 5))));
 BA.debugLineNum = 155;BA.debugLine="mLibro.Put(arLibro(0), lib)";
Debug.ShouldStop(67108864);
_mlibro.runVoidMethod ("Put",(Object)((_arlibro.getArrayElement(true,BA.numberCast(int.class, 0)))),(Object)((_lib)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 157;BA.debugLine="Return mLibro";
Debug.ShouldStop(268435456);
if (true) return _mlibro;
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mostrarestudiantes(RemoteObject __ref,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("MostrarEstudiantes (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("mostrarestudiantes")) { return __ref.runUserSub(false, "b4xmainpage","mostrarestudiantes", __ref, _lst);}
int _i = 0;
RemoteObject _estud = null;
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 106;BA.debugLine="Private Sub MostrarEstudiantes(lst As List)";
Debug.ShouldStop(512);
 BA.debugLineNum = 107;BA.debugLine="Log(\"================\" & lst.Size & \" ===========";
Debug.ShouldStop(1024);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("================"),_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(" =================="))));
 BA.debugLineNum = 108;BA.debugLine="For i = 0 To lst.Size-1";
Debug.ShouldStop(2048);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 109;BA.debugLine="Dim estud(5) As String";
Debug.ShouldStop(4096);
_estud = RemoteObject.createNewArray ("String", new int[] {5}, new Object[]{});Debug.locals.put("estud", _estud);
 BA.debugLineNum = 110;BA.debugLine="estud = lst.Get(i)";
Debug.ShouldStop(8192);
_estud = (_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("estud", _estud);
 BA.debugLineNum = 111;BA.debugLine="Log(\"-------------------------------------------";
Debug.ShouldStop(16384);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("--------------------------------------------------------")));
 BA.debugLineNum = 112;BA.debugLine="Log($\"${estud(0)} ${estud(1)} ${estud(2)} ${estu";
Debug.ShouldStop(32768);
b4xmainpage.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_estud.getArrayElement(true,BA.numberCast(int.class, 0))))),RemoteObject.createImmutable(" "),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_estud.getArrayElement(true,BA.numberCast(int.class, 1))))),RemoteObject.createImmutable(" "),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_estud.getArrayElement(true,BA.numberCast(int.class, 2))))),RemoteObject.createImmutable(" "),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_estud.getArrayElement(true,BA.numberCast(int.class, 3))))),RemoteObject.createImmutable(" "),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_estud.getArrayElement(true,BA.numberCast(int.class, 4))))),RemoteObject.createImmutable("")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 114;BA.debugLine="Log(\"============================================";
Debug.ShouldStop(131072);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("====================================================")));
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mostrarlibros(RemoteObject __ref,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("MostrarLibros (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("mostrarlibros")) { return __ref.runUserSub(false, "b4xmainpage","mostrarlibros", __ref, _lst);}
int _i = 0;
RemoteObject _lib = null;
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 170;BA.debugLine="Private Sub MostrarLibros(lst As List)";
Debug.ShouldStop(512);
 BA.debugLineNum = 171;BA.debugLine="Log(\"================\" & lst.Size & \" ===========";
Debug.ShouldStop(1024);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("================"),_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(" =================="))));
 BA.debugLineNum = 172;BA.debugLine="For i = 0 To lst.Size-1";
Debug.ShouldStop(2048);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 173;BA.debugLine="Dim lib(6) As String";
Debug.ShouldStop(4096);
_lib = RemoteObject.createNewArray ("String", new int[] {6}, new Object[]{});Debug.locals.put("lib", _lib);
 BA.debugLineNum = 174;BA.debugLine="lib = lst.Get(i)";
Debug.ShouldStop(8192);
_lib = (_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("lib", _lib);
 BA.debugLineNum = 175;BA.debugLine="Log(\"-------------------------------------------";
Debug.ShouldStop(16384);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("--------------------------------------------------------")));
 BA.debugLineNum = 176;BA.debugLine="Log($\"${lib(0)} ${lib(1)} ${lib(2)} ${lib(3)} ${";
Debug.ShouldStop(32768);
b4xmainpage.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lib.getArrayElement(true,BA.numberCast(int.class, 0))))),RemoteObject.createImmutable(" "),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lib.getArrayElement(true,BA.numberCast(int.class, 1))))),RemoteObject.createImmutable(" "),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lib.getArrayElement(true,BA.numberCast(int.class, 2))))),RemoteObject.createImmutable(" "),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lib.getArrayElement(true,BA.numberCast(int.class, 3))))),RemoteObject.createImmutable(" "),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lib.getArrayElement(true,BA.numberCast(int.class, 4))))),RemoteObject.createImmutable(" "),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lib.getArrayElement(true,BA.numberCast(int.class, 5))))),RemoteObject.createImmutable("")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 178;BA.debugLine="Log(\"============================================";
Debug.ShouldStop(131072);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("====================================================")));
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mostrarmapaestudiantes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MostrarMapaEstudiantes (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("mostrarmapaestudiantes")) { return __ref.runUserSub(false, "b4xmainpage","mostrarmapaestudiantes", __ref);}
RemoteObject _clave = RemoteObject.createImmutable("");
RemoteObject _tp = RemoteObject.declareNull("b4j.example.b4xmainpage._estudiante");
 BA.debugLineNum = 97;BA.debugLine="Public Sub MostrarMapaEstudiantes";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="For Each clave As String In mapaEstudiantes.Keys";
Debug.ShouldStop(2);
{
final RemoteObject group1 = __ref.getField(false,"_mapaestudiantes" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_clave = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("clave", _clave);
Debug.locals.put("clave", _clave);
 BA.debugLineNum = 99;BA.debugLine="Dim tp As Estudiante";
Debug.ShouldStop(4);
_tp = RemoteObject.createNew ("b4j.example.b4xmainpage._estudiante");Debug.locals.put("tp", _tp);
 BA.debugLineNum = 100;BA.debugLine="tp = mapaEstudiantes.Get(clave)";
Debug.ShouldStop(8);
_tp = (__ref.getField(false,"_mapaestudiantes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_clave))));Debug.locals.put("tp", _tp);
 BA.debugLineNum = 101;BA.debugLine="Log($\"${clave} ${tp.Nombre} ${tp.Apellidos} ${tp";
Debug.ShouldStop(16);
b4xmainpage.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clave))),RemoteObject.createImmutable(" "),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tp.getField(true,"Nombre" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tp.getField(true,"Apellidos" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tp.getField(true,"Clase" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tp.getField(true,"Telefono" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tp.getField(true,"Prestado" /*RemoteObject*/ )))),RemoteObject.createImmutable("")))));
 }
}Debug.locals.put("clave", _clave);
;
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mostrarmapalibros(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MostrarMapaLibros (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,161);
if (RapidSub.canDelegate("mostrarmapalibros")) { return __ref.runUserSub(false, "b4xmainpage","mostrarmapalibros", __ref);}
RemoteObject _clave = RemoteObject.createImmutable("");
RemoteObject _lib = RemoteObject.declareNull("b4j.example.b4xmainpage._libro");
 BA.debugLineNum = 161;BA.debugLine="Public Sub MostrarMapaLibros";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="For Each clave As String In mapaLibros.Keys";
Debug.ShouldStop(2);
{
final RemoteObject group1 = __ref.getField(false,"_mapalibros" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_clave = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("clave", _clave);
Debug.locals.put("clave", _clave);
 BA.debugLineNum = 163;BA.debugLine="Dim lib As Libro";
Debug.ShouldStop(4);
_lib = RemoteObject.createNew ("b4j.example.b4xmainpage._libro");Debug.locals.put("lib", _lib);
 BA.debugLineNum = 164;BA.debugLine="lib = mapaLibros.Get(clave)";
Debug.ShouldStop(8);
_lib = (__ref.getField(false,"_mapalibros" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_clave))));Debug.locals.put("lib", _lib);
 BA.debugLineNum = 165;BA.debugLine="Log($\"${clave} ${lib.Título} ${lib.Escritor} ${l";
Debug.ShouldStop(16);
b4xmainpage.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clave))),RemoteObject.createImmutable(" "),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lib.getField(true,"Título" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lib.getField(true,"Escritor" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lib.getField(true,"Ano" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lib.getField(true,"Editorial" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lib.getField(true,"Estante" /*RemoteObject*/ )))),RemoteObject.createImmutable("")))));
 }
}Debug.locals.put("clave", _clave);
;
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}