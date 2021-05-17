package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xpagestudents_subs_0 {


public static RemoteObject  _anadirespacios(RemoteObject __ref,RemoteObject _s1,RemoteObject _pos) throws Exception{
try {
		Debug.PushSubsStack("anadirEspacios (b4xpagestudents) ","b4xpagestudents",2,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("anadirespacios")) { return __ref.runUserSub(false, "b4xpagestudents","anadirespacios", __ref, _s1, _pos);}
Debug.locals.put("s1", _s1);
Debug.locals.put("pos", _pos);
 BA.debugLineNum = 46;BA.debugLine="Private Sub anadirEspacios(s1 As String, pos As In";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="If pos = 1 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_pos,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 48;BA.debugLine="Do While s1.Length <= 5";
Debug.ShouldStop(32768);
while (RemoteObject.solveBoolean("k",_s1.runMethod(true,"length"),BA.numberCast(double.class, 5))) {
 BA.debugLineNum = 49;BA.debugLine="s1 = s1 & \" \"";
Debug.ShouldStop(65536);
_s1 = RemoteObject.concat(_s1,RemoteObject.createImmutable(" "));Debug.locals.put("s1", _s1);
 }
;
 }else 
{ BA.debugLineNum = 51;BA.debugLine="else if pos = 2 Or pos = 3 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_pos,BA.numberCast(double.class, 2)) || RemoteObject.solveBoolean("=",_pos,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 52;BA.debugLine="Do While s1.Length <= 20";
Debug.ShouldStop(524288);
while (RemoteObject.solveBoolean("k",_s1.runMethod(true,"length"),BA.numberCast(double.class, 20))) {
 BA.debugLineNum = 53;BA.debugLine="s1 = s1 & \" \"";
Debug.ShouldStop(1048576);
_s1 = RemoteObject.concat(_s1,RemoteObject.createImmutable(" "));Debug.locals.put("s1", _s1);
 }
;
 }else 
{ BA.debugLineNum = 55;BA.debugLine="else if pos = 4 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_pos,BA.numberCast(double.class, 4))) { 
 BA.debugLineNum = 56;BA.debugLine="Do While s1.Length <= 3";
Debug.ShouldStop(8388608);
while (RemoteObject.solveBoolean("k",_s1.runMethod(true,"length"),BA.numberCast(double.class, 3))) {
 BA.debugLineNum = 57;BA.debugLine="s1 = s1 & \" \"";
Debug.ShouldStop(16777216);
_s1 = RemoteObject.concat(_s1,RemoteObject.createImmutable(" "));Debug.locals.put("s1", _s1);
 }
;
 }else 
{ BA.debugLineNum = 59;BA.debugLine="else if pos = 5 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_pos,BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 60;BA.debugLine="Do While s1.Length <= 12";
Debug.ShouldStop(134217728);
while (RemoteObject.solveBoolean("k",_s1.runMethod(true,"length"),BA.numberCast(double.class, 12))) {
 BA.debugLineNum = 61;BA.debugLine="s1 = s1 & \" \"";
Debug.ShouldStop(268435456);
_s1 = RemoteObject.concat(_s1,RemoteObject.createImmutable(" "));Debug.locals.put("s1", _s1);
 }
;
 }}}}
;
 BA.debugLineNum = 64;BA.debugLine="Return s1";
Debug.ShouldStop(-2147483648);
if (true) return _s1;
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("B4XPage_Created (b4xpagestudents) ","b4xpagestudents",2,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xpagestudents","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Root = Root1";
Debug.ShouldStop(1048576);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 22;BA.debugLine="Root.LoadLayout(\"fmrStudents\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("fmrStudents")),__ref.getField(false, "ba"));
 BA.debugLineNum = 23;BA.debugLine="cargarLista";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.b4xpagestudents.class, "_cargarlista" /*RemoteObject*/ );
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
public static RemoteObject  _btnborrar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnBorrar_Click (b4xpagestudents) ","b4xpagestudents",2,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("btnborrar_click")) { return __ref.runUserSub(false, "b4xpagestudents","btnborrar_click", __ref);}
 BA.debugLineNum = 96;BA.debugLine="Private Sub btnBorrar_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="If estudianteElegido <> - 1 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_estudianteelegido" /*RemoteObject*/ ),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 98;BA.debugLine="B4XPages.MainPage.mapaEstudiantes.Remove(clvEstu";
Debug.ShouldStop(2);
b4xpagestudents._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_mapaestudiantes" /*RemoteObject*/ ).runVoidMethod ("Remove",(Object)(__ref.getField(false,"_clvestudiantes" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(__ref.getField(true,"_estudianteelegido" /*RemoteObject*/ )))));
 BA.debugLineNum = 99;BA.debugLine="clvEstudiantes.RemoveAt(estudianteElegido)";
Debug.ShouldStop(4);
__ref.getField(false,"_clvestudiantes" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(__ref.getField(true,"_estudianteelegido" /*RemoteObject*/ )));
 BA.debugLineNum = 100;BA.debugLine="estudianteElegido = -1";
Debug.ShouldStop(8);
__ref.setField ("_estudianteelegido" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 101;BA.debugLine="guardarFicheroEstudiantes";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.b4xpagestudents.class, "_guardarficheroestudiantes" /*RemoteObject*/ );
 };
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
public static RemoteObject  _btninsertar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnInsertar_Click (b4xpagestudents) ","b4xpagestudents",2,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("btninsertar_click")) { return __ref.runUserSub(false, "b4xpagestudents","btninsertar_click", __ref);}
 BA.debugLineNum = 90;BA.debugLine="Private Sub btnInsertar_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="InsertarEstudiante";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.example.b4xpagestudents.class, "_insertarestudiante" /*void*/ );
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargarlista(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cargarLista (b4xpagestudents) ","b4xpagestudents",2,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("cargarlista")) { return __ref.runUserSub(false, "b4xpagestudents","cargarlista", __ref);}
RemoteObject _tpest = RemoteObject.declareNull("b4j.example.b4xmainpage._estudiante");
RemoteObject _s1 = RemoteObject.createImmutable("");
RemoteObject _s2 = RemoteObject.createImmutable("");
RemoteObject _s3 = RemoteObject.createImmutable("");
RemoteObject _s4 = RemoteObject.createImmutable("");
RemoteObject _s5 = RemoteObject.createImmutable("");
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 28;BA.debugLine="Private Sub cargarLista";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="For Each tpEst As Estudiante In B4XPages.MainPage";
Debug.ShouldStop(268435456);
{
final RemoteObject group1 = b4xpagestudents._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_mapaestudiantes" /*RemoteObject*/ ).runMethod(false,"Values");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_tpest = (group1.runMethod(false,"Get",index1));Debug.locals.put("tpEst", _tpest);
Debug.locals.put("tpEst", _tpest);
 BA.debugLineNum = 30;BA.debugLine="Private s1, s2, s3, s4, s5, str As String";
Debug.ShouldStop(536870912);
_s1 = RemoteObject.createImmutable("");Debug.locals.put("s1", _s1);
_s2 = RemoteObject.createImmutable("");Debug.locals.put("s2", _s2);
_s3 = RemoteObject.createImmutable("");Debug.locals.put("s3", _s3);
_s4 = RemoteObject.createImmutable("");Debug.locals.put("s4", _s4);
_s5 = RemoteObject.createImmutable("");Debug.locals.put("s5", _s5);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 31;BA.debugLine="s1 = anadirEspacios(tpEst.ID, 1)";
Debug.ShouldStop(1073741824);
_s1 = __ref.runClassMethod (b4j.example.b4xpagestudents.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(_tpest.getField(true,"ID" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("s1", _s1);
 BA.debugLineNum = 32;BA.debugLine="s2 = anadirEspacios(tpEst.Nombre, 2)";
Debug.ShouldStop(-2147483648);
_s2 = __ref.runClassMethod (b4j.example.b4xpagestudents.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(_tpest.getField(true,"Nombre" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("s2", _s2);
 BA.debugLineNum = 33;BA.debugLine="s3 = anadirEspacios(tpEst.Apellidos, 3)";
Debug.ShouldStop(1);
_s3 = __ref.runClassMethod (b4j.example.b4xpagestudents.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(_tpest.getField(true,"Apellidos" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("s3", _s3);
 BA.debugLineNum = 34;BA.debugLine="s4 = anadirEspacios(tpEst.Clase, 4)";
Debug.ShouldStop(2);
_s4 = __ref.runClassMethod (b4j.example.b4xpagestudents.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(_tpest.getField(true,"Clase" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 4)));Debug.locals.put("s4", _s4);
 BA.debugLineNum = 35;BA.debugLine="s5 = anadirEspacios(tpEst.Telefono, 5)";
Debug.ShouldStop(4);
_s5 = __ref.runClassMethod (b4j.example.b4xpagestudents.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(_tpest.getField(true,"Telefono" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("s5", _s5);
 BA.debugLineNum = 37;BA.debugLine="str = $\"${s1}${s2}${s3}${s4}${s5}\"$";
Debug.ShouldStop(16);
_str = (RemoteObject.concat(RemoteObject.createImmutable(""),b4xpagestudents.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s1))),RemoteObject.createImmutable(""),b4xpagestudents.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s2))),RemoteObject.createImmutable(""),b4xpagestudents.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s3))),RemoteObject.createImmutable(""),b4xpagestudents.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s4))),RemoteObject.createImmutable(""),b4xpagestudents.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s5))),RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 BA.debugLineNum = 38;BA.debugLine="clvEstudiantes.AddTextItem(str, tpEst.ID)";
Debug.ShouldStop(32);
__ref.getField(false,"_clvestudiantes" /*RemoteObject*/ ).runVoidMethod ("_addtextitem",(Object)((_str)),(Object)((_tpest.getField(true,"ID" /*RemoteObject*/ ))));
 }
}Debug.locals.put("tpEst", _tpest);
;
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
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
b4xpagestudents._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xpagestudents._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xpagestudents._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xpagestudents._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private clvEstudiantes As CustomListView";
b4xpagestudents._clvestudiantes = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_clvestudiantes",b4xpagestudents._clvestudiantes);
 //BA.debugLineNum = 5;BA.debugLine="Private diálogo As B4XDialog";
b4xpagestudents._diálogo = RemoteObject.createNew ("b4j.example.b4xdialog");__ref.setField("_diálogo",b4xpagestudents._diálogo);
 //BA.debugLineNum = 6;BA.debugLine="Private txtClase As B4XFloatTextField";
b4xpagestudents._txtclase = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_txtclase",b4xpagestudents._txtclase);
 //BA.debugLineNum = 7;BA.debugLine="Private txtNombre As B4XFloatTextField";
b4xpagestudents._txtnombre = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_txtnombre",b4xpagestudents._txtnombre);
 //BA.debugLineNum = 8;BA.debugLine="Private txtID As B4XFloatTextField";
b4xpagestudents._txtid = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_txtid",b4xpagestudents._txtid);
 //BA.debugLineNum = 9;BA.debugLine="Private txtApellidos As B4XFloatTextField";
b4xpagestudents._txtapellidos = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_txtapellidos",b4xpagestudents._txtapellidos);
 //BA.debugLineNum = 10;BA.debugLine="Private txtTelefono As B4XFloatTextField";
b4xpagestudents._txttelefono = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_txttelefono",b4xpagestudents._txttelefono);
 //BA.debugLineNum = 11;BA.debugLine="Public estudianteElegido As Int  = -1";
b4xpagestudents._estudianteelegido = BA.numberCast(int.class, -(double) (0 + 1));__ref.setField("_estudianteelegido",b4xpagestudents._estudianteelegido);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clvestudiantes_itemclick(RemoteObject __ref,RemoteObject _índice,RemoteObject _valor) throws Exception{
try {
		Debug.PushSubsStack("clvEstudiantes_ItemClick (b4xpagestudents) ","b4xpagestudents",2,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("clvestudiantes_itemclick")) { return __ref.runUserSub(false, "b4xpagestudents","clvestudiantes_itemclick", __ref, _índice, _valor);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Índice", _índice);
Debug.locals.put("Valor", _valor);
 BA.debugLineNum = 71;BA.debugLine="Private Sub clvEstudiantes_ItemClick (Índice As In";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="If estudianteElegido = -1 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_estudianteelegido" /*RemoteObject*/ ),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 73;BA.debugLine="Dim p As B4XView = clvEstudiantes.GetPanel(Índic";
Debug.ShouldStop(256);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_clvestudiantes" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_índice));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 74;BA.debugLine="p.GetView(0).Color = xui.Color_Blue";
Debug.ShouldStop(512);
_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue"));
 BA.debugLineNum = 75;BA.debugLine="estudianteElegido = Índice";
Debug.ShouldStop(1024);
__ref.setField ("_estudianteelegido" /*RemoteObject*/ ,_índice);
 }else {
 BA.debugLineNum = 77;BA.debugLine="Dim p As B4XView = clvEstudiantes.GetPanel(estud";
Debug.ShouldStop(4096);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_clvestudiantes" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(__ref.getField(true,"_estudianteelegido" /*RemoteObject*/ )));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 78;BA.debugLine="p.GetView(0).Color = xui.Color_White";
Debug.ShouldStop(8192);
_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 79;BA.debugLine="If estudianteElegido = Índice  Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_estudianteelegido" /*RemoteObject*/ ),BA.numberCast(double.class, _índice))) { 
 BA.debugLineNum = 80;BA.debugLine="estudianteElegido = -1";
Debug.ShouldStop(32768);
__ref.setField ("_estudianteelegido" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 }else {
 BA.debugLineNum = 82;BA.debugLine="Dim p As B4XView = clvEstudiantes.GetPanel(Índi";
Debug.ShouldStop(131072);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_clvestudiantes" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_índice));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 83;BA.debugLine="p.GetView(0).Color = xui.Color_Blue";
Debug.ShouldStop(262144);
_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue"));
 BA.debugLineNum = 84;BA.debugLine="estudianteElegido = Índice";
Debug.ShouldStop(524288);
__ref.setField ("_estudianteelegido" /*RemoteObject*/ ,_índice);
 };
 };
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _guardarficheroestudiantes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("guardarFicheroEstudiantes (b4xpagestudents) ","b4xpagestudents",2,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("guardarficheroestudiantes")) { return __ref.runUserSub(false, "b4xpagestudents","guardarficheroestudiantes", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _tpest = RemoteObject.declareNull("b4j.example.b4xmainpage._estudiante");
 BA.debugLineNum = 131;BA.debugLine="Private Sub guardarFicheroEstudiantes";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="Private str As String";
Debug.ShouldStop(8);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 133;BA.debugLine="For Each tpEst As Estudiante In B4XPages.MainPage";
Debug.ShouldStop(16);
{
final RemoteObject group2 = b4xpagestudents._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_mapaestudiantes" /*RemoteObject*/ ).runMethod(false,"Values");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_tpest = (group2.runMethod(false,"Get",index2));Debug.locals.put("tpEst", _tpest);
Debug.locals.put("tpEst", _tpest);
 BA.debugLineNum = 134;BA.debugLine="str = str & $\"${tpEst.ID};${tpEst.Nombre};${tpEs";
Debug.ShouldStop(32);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(""),b4xpagestudents.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tpest.getField(true,"ID" /*RemoteObject*/ )))),RemoteObject.createImmutable(";"),b4xpagestudents.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tpest.getField(true,"Nombre" /*RemoteObject*/ )))),RemoteObject.createImmutable(";"),b4xpagestudents.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tpest.getField(true,"Apellidos" /*RemoteObject*/ )))),RemoteObject.createImmutable(";"),b4xpagestudents.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tpest.getField(true,"Clase" /*RemoteObject*/ )))),RemoteObject.createImmutable(";"),b4xpagestudents.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tpest.getField(true,"Telefono" /*RemoteObject*/ )))),RemoteObject.createImmutable(""),b4xpagestudents.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((b4xpagestudents.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(""))));Debug.locals.put("str", _str);
 BA.debugLineNum = 135;BA.debugLine="File.WriteString(File.DirTemp, \"students.txt\", s";
Debug.ShouldStop(64);
b4xpagestudents.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(b4xpagestudents.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(BA.ObjectToString("students.txt")),(Object)(_str));
 }
}Debug.locals.put("tpEst", _tpest);
;
 BA.debugLineNum = 137;BA.debugLine="Log(\"Guardado en la carpeta: \" & File.DirTemp)";
Debug.ShouldStop(256);
b4xpagestudents.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Guardado en la carpeta: "),b4xpagestudents.__c.getField(false,"File").runMethod(true,"getDirTemp"))));
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("Initialize (b4xpagestudents) ","b4xpagestudents",2,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xpagestudents","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="Return Me";
Debug.ShouldStop(32768);
if (true) return __ref;
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _insertarestudiante(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InsertarEstudiante (b4xpagestudents) ","b4xpagestudents",2,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("insertarestudiante")) { __ref.runUserSub(false, "b4xpagestudents","insertarestudiante", __ref); return;}
ResumableSub_InsertarEstudiante rsub = new ResumableSub_InsertarEstudiante(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_InsertarEstudiante extends BA.ResumableSub {
public ResumableSub_InsertarEstudiante(b4j.example.b4xpagestudents parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xpagestudents parent;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _resultado = RemoteObject.createImmutable(0);
RemoteObject _nuevoestudiante = RemoteObject.declareNull("b4j.example.b4xmainpage._estudiante");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InsertarEstudiante (b4xpagestudents) ","b4xpagestudents",2,__ref.getField(false, "ba"),__ref,107);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 108;BA.debugLine="diálogo.Initialize(Root)";
Debug.ShouldStop(2048);
__ref.getField(false,"_diálogo" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ )));
 BA.debugLineNum = 109;BA.debugLine="diálogo.Title = \"Insertar Estudiante\"";
Debug.ShouldStop(4096);
__ref.getField(false,"_diálogo" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Insertar Estudiante")));
 BA.debugLineNum = 111;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(16384);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 112;BA.debugLine="p.SetLayoutAnimated(0,0,0, 350dip, 350dip)";
Debug.ShouldStop(32768);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 350))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 350))))));
 BA.debugLineNum = 114;BA.debugLine="p.LoadLayout(\"dlgStudents\")";
Debug.ShouldStop(131072);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("dlgStudents")),__ref.getField(false, "ba"));
 BA.debugLineNum = 115;BA.debugLine="diálogo.PutAtTop = True";
Debug.ShouldStop(262144);
__ref.getField(false,"_diálogo" /*RemoteObject*/ ).setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 116;BA.debugLine="Wait For (diálogo.ShowCustom(p, \"OK\", \"\", \"Cancel";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xpagestudents", "insertarestudiante"), __ref.getField(false,"_diálogo" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar")))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 117;BA.debugLine="If Resultado = xui.DialogResponse_Positive Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_resultado,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 118;BA.debugLine="Private nuevoEstudiante As Estudiante";
Debug.ShouldStop(2097152);
_nuevoestudiante = RemoteObject.createNew ("b4j.example.b4xmainpage._estudiante");Debug.locals.put("nuevoEstudiante", _nuevoestudiante);
 BA.debugLineNum = 119;BA.debugLine="nuevoEstudiante.ID = txtID.Text";
Debug.ShouldStop(4194304);
_nuevoestudiante.setField ("ID" /*RemoteObject*/ ,__ref.getField(false,"_txtid" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ));
 BA.debugLineNum = 120;BA.debugLine="nuevoEstudiante.Nombre = txtNombre.Text";
Debug.ShouldStop(8388608);
_nuevoestudiante.setField ("Nombre" /*RemoteObject*/ ,__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ));
 BA.debugLineNum = 121;BA.debugLine="nuevoEstudiante.Apellidos = txtApellidos.Text";
Debug.ShouldStop(16777216);
_nuevoestudiante.setField ("Apellidos" /*RemoteObject*/ ,__ref.getField(false,"_txtapellidos" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ));
 BA.debugLineNum = 122;BA.debugLine="nuevoEstudiante.Telefono = txtTelefono.Text";
Debug.ShouldStop(33554432);
_nuevoestudiante.setField ("Telefono" /*RemoteObject*/ ,__ref.getField(false,"_txttelefono" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ));
 BA.debugLineNum = 123;BA.debugLine="nuevoEstudiante.Clase = txtClase.Text";
Debug.ShouldStop(67108864);
_nuevoestudiante.setField ("Clase" /*RemoteObject*/ ,__ref.getField(false,"_txtclase" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ));
 BA.debugLineNum = 124;BA.debugLine="B4XPages.MainPage.mapaEstudiantes.Put(nuevoEstud";
Debug.ShouldStop(134217728);
parent._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_mapaestudiantes" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_nuevoestudiante.getField(true,"ID" /*RemoteObject*/ ))),(Object)((_nuevoestudiante)));
 BA.debugLineNum = 125;BA.debugLine="cargarLista";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.b4xpagestudents.class, "_cargarlista" /*RemoteObject*/ );
 BA.debugLineNum = 126;BA.debugLine="guardarFicheroEstudiantes";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.example.b4xpagestudents.class, "_guardarficheroestudiantes" /*RemoteObject*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject __ref,RemoteObject _resultado) throws Exception{
}
}