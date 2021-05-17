package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xpagebooks_subs_0 {


public static RemoteObject  _anadirespacios(RemoteObject __ref,RemoteObject _s1,RemoteObject _pos) throws Exception{
try {
		Debug.PushSubsStack("anadirEspacios (b4xpagebooks) ","b4xpagebooks",3,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("anadirespacios")) { return __ref.runUserSub(false, "b4xpagebooks","anadirespacios", __ref, _s1, _pos);}
Debug.locals.put("s1", _s1);
Debug.locals.put("pos", _pos);
 BA.debugLineNum = 49;BA.debugLine="Public Sub anadirEspacios(s1 As String, pos As Int";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="If pos = 1 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_pos,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 51;BA.debugLine="Do While s1.Length <= 4";
Debug.ShouldStop(262144);
while (RemoteObject.solveBoolean("k",_s1.runMethod(true,"length"),BA.numberCast(double.class, 4))) {
 BA.debugLineNum = 52;BA.debugLine="s1 = s1 & \" \"";
Debug.ShouldStop(524288);
_s1 = RemoteObject.concat(_s1,RemoteObject.createImmutable(" "));Debug.locals.put("s1", _s1);
 }
;
 }else 
{ BA.debugLineNum = 54;BA.debugLine="else if pos = 2 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_pos,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 55;BA.debugLine="Do While s1.Length <= 40";
Debug.ShouldStop(4194304);
while (RemoteObject.solveBoolean("k",_s1.runMethod(true,"length"),BA.numberCast(double.class, 40))) {
 BA.debugLineNum = 56;BA.debugLine="s1 = s1 & \" \"";
Debug.ShouldStop(8388608);
_s1 = RemoteObject.concat(_s1,RemoteObject.createImmutable(" "));Debug.locals.put("s1", _s1);
 }
;
 }else 
{ BA.debugLineNum = 58;BA.debugLine="else if pos = 3 Or pos = 5 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_pos,BA.numberCast(double.class, 3)) || RemoteObject.solveBoolean("=",_pos,BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 59;BA.debugLine="Do While s1.Length <= 22";
Debug.ShouldStop(67108864);
while (RemoteObject.solveBoolean("k",_s1.runMethod(true,"length"),BA.numberCast(double.class, 22))) {
 BA.debugLineNum = 60;BA.debugLine="s1 = s1 & \" \"";
Debug.ShouldStop(134217728);
_s1 = RemoteObject.concat(_s1,RemoteObject.createImmutable(" "));Debug.locals.put("s1", _s1);
 }
;
 }else 
{ BA.debugLineNum = 62;BA.debugLine="else if pos = 4 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_pos,BA.numberCast(double.class, 4))) { 
 BA.debugLineNum = 63;BA.debugLine="Do While s1.Length <= 6";
Debug.ShouldStop(1073741824);
while (RemoteObject.solveBoolean("k",_s1.runMethod(true,"length"),BA.numberCast(double.class, 6))) {
 BA.debugLineNum = 64;BA.debugLine="s1 = s1 & \" \"";
Debug.ShouldStop(-2147483648);
_s1 = RemoteObject.concat(_s1,RemoteObject.createImmutable(" "));Debug.locals.put("s1", _s1);
 }
;
 }else 
{ BA.debugLineNum = 66;BA.debugLine="else if pos = 6 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_pos,BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 67;BA.debugLine="Do While s1.Length <= 3";
Debug.ShouldStop(4);
while (RemoteObject.solveBoolean("k",_s1.runMethod(true,"length"),BA.numberCast(double.class, 3))) {
 BA.debugLineNum = 68;BA.debugLine="s1 = s1 & \" \"";
Debug.ShouldStop(8);
_s1 = RemoteObject.concat(_s1,RemoteObject.createImmutable(" "));Debug.locals.put("s1", _s1);
 }
;
 }}}}}
;
 BA.debugLineNum = 71;BA.debugLine="Return s1";
Debug.ShouldStop(64);
if (true) return _s1;
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("B4XPage_Created (b4xpagebooks) ","b4xpagebooks",3,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xpagebooks","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 21;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Root = Root1";
Debug.ShouldStop(2097152);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 23;BA.debugLine="Root.LoadLayout(\"frmBooks\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("frmBooks")),__ref.getField(false, "ba"));
 BA.debugLineNum = 25;BA.debugLine="cargarLista";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.b4xpagebooks.class, "_cargarlista" /*RemoteObject*/ );
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
public static RemoteObject  _btnborrar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnBorrar_Click (b4xpagebooks) ","b4xpagebooks",3,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("btnborrar_click")) { return __ref.runUserSub(false, "b4xpagebooks","btnborrar_click", __ref);}
 BA.debugLineNum = 98;BA.debugLine="Private Sub btnBorrar_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="If libroElegido <> - 1 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_libroelegido" /*RemoteObject*/ ),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 100;BA.debugLine="B4XPages.MainPage.mapaLibros.Remove(clvLibros.Ge";
Debug.ShouldStop(8);
b4xpagebooks._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_mapalibros" /*RemoteObject*/ ).runVoidMethod ("Remove",(Object)(__ref.getField(false,"_clvlibros" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(__ref.getField(true,"_libroelegido" /*RemoteObject*/ )))));
 BA.debugLineNum = 101;BA.debugLine="clvLibros.RemoveAt(libroElegido)";
Debug.ShouldStop(16);
__ref.getField(false,"_clvlibros" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(__ref.getField(true,"_libroelegido" /*RemoteObject*/ )));
 BA.debugLineNum = 102;BA.debugLine="libroElegido = -1";
Debug.ShouldStop(32);
__ref.setField ("_libroelegido" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 103;BA.debugLine="GuardarFicheroLibros";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.b4xpagebooks.class, "_guardarficherolibros" /*RemoteObject*/ );
 };
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("btnInsertar_Click (b4xpagebooks) ","b4xpagebooks",3,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("btninsertar_click")) { return __ref.runUserSub(false, "b4xpagebooks","btninsertar_click", __ref);}
 BA.debugLineNum = 108;BA.debugLine="Private Sub btnInsertar_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 109;BA.debugLine="InsertarLibro";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.example.b4xpagebooks.class, "_insertarlibro" /*void*/ );
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("cargarLista (b4xpagebooks) ","b4xpagebooks",3,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("cargarlista")) { return __ref.runUserSub(false, "b4xpagebooks","cargarlista", __ref);}
RemoteObject _tplibro = RemoteObject.declareNull("b4j.example.b4xmainpage._libro");
RemoteObject _s1 = RemoteObject.createImmutable("");
RemoteObject _s2 = RemoteObject.createImmutable("");
RemoteObject _s3 = RemoteObject.createImmutable("");
RemoteObject _s4 = RemoteObject.createImmutable("");
RemoteObject _s5 = RemoteObject.createImmutable("");
RemoteObject _s6 = RemoteObject.createImmutable("");
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 30;BA.debugLine="Private Sub cargarLista";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="For Each tpLibro As Libro In B4XPages.MainPage.ma";
Debug.ShouldStop(1073741824);
{
final RemoteObject group1 = b4xpagebooks._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_mapalibros" /*RemoteObject*/ ).runMethod(false,"Values");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_tplibro = (group1.runMethod(false,"Get",index1));Debug.locals.put("tpLibro", _tplibro);
Debug.locals.put("tpLibro", _tplibro);
 BA.debugLineNum = 32;BA.debugLine="Private s1, s2, s3, s4, s5, s6, str As String";
Debug.ShouldStop(-2147483648);
_s1 = RemoteObject.createImmutable("");Debug.locals.put("s1", _s1);
_s2 = RemoteObject.createImmutable("");Debug.locals.put("s2", _s2);
_s3 = RemoteObject.createImmutable("");Debug.locals.put("s3", _s3);
_s4 = RemoteObject.createImmutable("");Debug.locals.put("s4", _s4);
_s5 = RemoteObject.createImmutable("");Debug.locals.put("s5", _s5);
_s6 = RemoteObject.createImmutable("");Debug.locals.put("s6", _s6);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 33;BA.debugLine="s1 = anadirEspacios(tpLibro.ID, 1)";
Debug.ShouldStop(1);
_s1 = __ref.runClassMethod (b4j.example.b4xpagebooks.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(_tplibro.getField(true,"ID" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("s1", _s1);
 BA.debugLineNum = 34;BA.debugLine="s2 = anadirEspacios(tpLibro.Título, 2)";
Debug.ShouldStop(2);
_s2 = __ref.runClassMethod (b4j.example.b4xpagebooks.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(_tplibro.getField(true,"Título" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("s2", _s2);
 BA.debugLineNum = 35;BA.debugLine="s3 = anadirEspacios(tpLibro.Escritor, 3)";
Debug.ShouldStop(4);
_s3 = __ref.runClassMethod (b4j.example.b4xpagebooks.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(_tplibro.getField(true,"Escritor" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("s3", _s3);
 BA.debugLineNum = 36;BA.debugLine="s4 = anadirEspacios(tpLibro.Ano, 4)";
Debug.ShouldStop(8);
_s4 = __ref.runClassMethod (b4j.example.b4xpagebooks.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(_tplibro.getField(true,"Ano" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 4)));Debug.locals.put("s4", _s4);
 BA.debugLineNum = 37;BA.debugLine="s5 = anadirEspacios(tpLibro.Editorial, 5)";
Debug.ShouldStop(16);
_s5 = __ref.runClassMethod (b4j.example.b4xpagebooks.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(_tplibro.getField(true,"Editorial" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("s5", _s5);
 BA.debugLineNum = 38;BA.debugLine="s6 = anadirEspacios(tpLibro.Estante, 6)";
Debug.ShouldStop(32);
_s6 = __ref.runClassMethod (b4j.example.b4xpagebooks.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(BA.NumberToString(_tplibro.getField(true,"Estante" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 6)));Debug.locals.put("s6", _s6);
 BA.debugLineNum = 40;BA.debugLine="str = $\"${s1}${s2}${s3}${s4}${s5}${s6}\"$";
Debug.ShouldStop(128);
_str = (RemoteObject.concat(RemoteObject.createImmutable(""),b4xpagebooks.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s1))),RemoteObject.createImmutable(""),b4xpagebooks.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s2))),RemoteObject.createImmutable(""),b4xpagebooks.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s3))),RemoteObject.createImmutable(""),b4xpagebooks.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s4))),RemoteObject.createImmutable(""),b4xpagebooks.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s5))),RemoteObject.createImmutable(""),b4xpagebooks.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s6))),RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 BA.debugLineNum = 41;BA.debugLine="clvLibros.AddTextItem(str, tpLibro.ID)";
Debug.ShouldStop(256);
__ref.getField(false,"_clvlibros" /*RemoteObject*/ ).runVoidMethod ("_addtextitem",(Object)((_str)),(Object)((_tplibro.getField(true,"ID" /*RemoteObject*/ ))));
 }
}Debug.locals.put("tpLibro", _tplibro);
;
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
b4xpagebooks._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xpagebooks._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xpagebooks._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xpagebooks._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private clvLibros As CustomListView";
b4xpagebooks._clvlibros = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_clvlibros",b4xpagebooks._clvlibros);
 //BA.debugLineNum = 5;BA.debugLine="Private diálogo As B4XDialog";
b4xpagebooks._diálogo = RemoteObject.createNew ("b4j.example.b4xdialog");__ref.setField("_diálogo",b4xpagebooks._diálogo);
 //BA.debugLineNum = 6;BA.debugLine="Private txtID As B4XFloatTextField";
b4xpagebooks._txtid = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_txtid",b4xpagebooks._txtid);
 //BA.debugLineNum = 7;BA.debugLine="Private txtEditorial As B4XFloatTextField";
b4xpagebooks._txteditorial = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_txteditorial",b4xpagebooks._txteditorial);
 //BA.debugLineNum = 8;BA.debugLine="Private txtEstante As B4XFloatTextField";
b4xpagebooks._txtestante = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_txtestante",b4xpagebooks._txtestante);
 //BA.debugLineNum = 9;BA.debugLine="Private txtTitulo As B4XFloatTextField";
b4xpagebooks._txttitulo = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_txttitulo",b4xpagebooks._txttitulo);
 //BA.debugLineNum = 10;BA.debugLine="Private txtEscritor As B4XFloatTextField";
b4xpagebooks._txtescritor = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_txtescritor",b4xpagebooks._txtescritor);
 //BA.debugLineNum = 11;BA.debugLine="Private txtAno As B4XFloatTextField";
b4xpagebooks._txtano = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_txtano",b4xpagebooks._txtano);
 //BA.debugLineNum = 12;BA.debugLine="Public libroElegido As Int";
b4xpagebooks._libroelegido = RemoteObject.createImmutable(0);__ref.setField("_libroelegido",b4xpagebooks._libroelegido);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clvlibros_itemclick(RemoteObject __ref,RemoteObject _índice,RemoteObject _valor) throws Exception{
try {
		Debug.PushSubsStack("clvLibros_ItemClick (b4xpagebooks) ","b4xpagebooks",3,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("clvlibros_itemclick")) { return __ref.runUserSub(false, "b4xpagebooks","clvlibros_itemclick", __ref, _índice, _valor);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Índice", _índice);
Debug.locals.put("Valor", _valor);
 BA.debugLineNum = 78;BA.debugLine="Private Sub clvLibros_ItemClick (Índice As Int, Va";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="If libroElegido = -1 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_libroelegido" /*RemoteObject*/ ),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 80;BA.debugLine="Dim p As B4XView = clvLibros.GetPanel(Índice)";
Debug.ShouldStop(32768);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_clvlibros" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_índice));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 81;BA.debugLine="p.GetView(0).Color = xui.Color_Blue";
Debug.ShouldStop(65536);
_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue"));
 BA.debugLineNum = 82;BA.debugLine="libroElegido = Índice";
Debug.ShouldStop(131072);
__ref.setField ("_libroelegido" /*RemoteObject*/ ,_índice);
 }else {
 BA.debugLineNum = 84;BA.debugLine="Dim p As B4XView = clvLibros.GetPanel(libroElegi";
Debug.ShouldStop(524288);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_clvlibros" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(__ref.getField(true,"_libroelegido" /*RemoteObject*/ )));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 85;BA.debugLine="p.GetView(0).Color = xui.Color_White";
Debug.ShouldStop(1048576);
_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 86;BA.debugLine="If libroElegido = Índice  Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_libroelegido" /*RemoteObject*/ ),BA.numberCast(double.class, _índice))) { 
 BA.debugLineNum = 87;BA.debugLine="libroElegido = -1";
Debug.ShouldStop(4194304);
__ref.setField ("_libroelegido" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 }else {
 BA.debugLineNum = 89;BA.debugLine="Dim p As B4XView = clvLibros.GetPanel(Índice)";
Debug.ShouldStop(16777216);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_clvlibros" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_índice));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 90;BA.debugLine="p.GetView(0).Color = xui.Color_Blue";
Debug.ShouldStop(33554432);
_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue"));
 BA.debugLineNum = 91;BA.debugLine="libroElegido = Índice";
Debug.ShouldStop(67108864);
__ref.setField ("_libroelegido" /*RemoteObject*/ ,_índice);
 };
 };
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
public static RemoteObject  _guardarficherolibros(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GuardarFicheroLibros (b4xpagebooks) ","b4xpagebooks",3,__ref.getField(false, "ba"),__ref,138);
if (RapidSub.canDelegate("guardarficherolibros")) { return __ref.runUserSub(false, "b4xpagebooks","guardarficherolibros", __ref);}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _tplibro = RemoteObject.declareNull("b4j.example.b4xmainpage._libro");
 BA.debugLineNum = 138;BA.debugLine="Private Sub GuardarFicheroLibros";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="Private str As String";
Debug.ShouldStop(1024);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 140;BA.debugLine="For Each tpLibro As Libro In B4XPages.MainPage.ma";
Debug.ShouldStop(2048);
{
final RemoteObject group2 = b4xpagebooks._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_mapalibros" /*RemoteObject*/ ).runMethod(false,"Values");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_tplibro = (group2.runMethod(false,"Get",index2));Debug.locals.put("tpLibro", _tplibro);
Debug.locals.put("tpLibro", _tplibro);
 BA.debugLineNum = 141;BA.debugLine="str = str & $\"${tpLibro.ID};${tpLibro.Título};${";
Debug.ShouldStop(4096);
_str = RemoteObject.concat(_str,(RemoteObject.concat(RemoteObject.createImmutable(""),b4xpagebooks.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tplibro.getField(true,"ID" /*RemoteObject*/ )))),RemoteObject.createImmutable(";"),b4xpagebooks.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tplibro.getField(true,"Título" /*RemoteObject*/ )))),RemoteObject.createImmutable(";"),b4xpagebooks.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tplibro.getField(true,"Escritor" /*RemoteObject*/ )))),RemoteObject.createImmutable(";"),b4xpagebooks.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tplibro.getField(true,"Ano" /*RemoteObject*/ )))),RemoteObject.createImmutable(";"),b4xpagebooks.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tplibro.getField(true,"Editorial" /*RemoteObject*/ )))),RemoteObject.createImmutable(";"),b4xpagebooks.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tplibro.getField(true,"Estante" /*RemoteObject*/ )))),RemoteObject.createImmutable(""),b4xpagebooks.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((b4xpagebooks.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(""))));Debug.locals.put("str", _str);
 }
}Debug.locals.put("tpLibro", _tplibro);
;
 BA.debugLineNum = 143;BA.debugLine="File.WriteString(File.DirTemp, \"books.txt\", str)";
Debug.ShouldStop(16384);
b4xpagebooks.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(b4xpagebooks.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(BA.ObjectToString("books.txt")),(Object)(_str));
 BA.debugLineNum = 144;BA.debugLine="Log(\"Guardado en la carpeta: \" & File.DirTemp)";
Debug.ShouldStop(32768);
b4xpagebooks.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Guardado en la carpeta: "),b4xpagebooks.__c.getField(false,"File").runMethod(true,"getDirTemp"))));
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Initialize (b4xpagebooks) ","b4xpagebooks",3,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xpagebooks","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="Return Me";
Debug.ShouldStop(65536);
if (true) return __ref;
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _insertarlibro(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InsertarLibro (b4xpagebooks) ","b4xpagebooks",3,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("insertarlibro")) { __ref.runUserSub(false, "b4xpagebooks","insertarlibro", __ref); return;}
ResumableSub_InsertarLibro rsub = new ResumableSub_InsertarLibro(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_InsertarLibro extends BA.ResumableSub {
public ResumableSub_InsertarLibro(b4j.example.b4xpagebooks parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xpagebooks parent;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _resultado = RemoteObject.createImmutable(0);
RemoteObject _nuevolibro = RemoteObject.declareNull("b4j.example.b4xmainpage._libro");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InsertarLibro (b4xpagebooks) ","b4xpagebooks",3,__ref.getField(false, "ba"),__ref,113);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 114;BA.debugLine="diálogo.Initialize(Root)";
Debug.ShouldStop(131072);
__ref.getField(false,"_diálogo" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ )));
 BA.debugLineNum = 115;BA.debugLine="diálogo.Title = \"Insertar Libro\"";
Debug.ShouldStop(262144);
__ref.getField(false,"_diálogo" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Insertar Libro")));
 BA.debugLineNum = 117;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(1048576);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 118;BA.debugLine="p.SetLayoutAnimated(0,0,0, 350dip, 350dip)";
Debug.ShouldStop(2097152);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 350))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 350))))));
 BA.debugLineNum = 120;BA.debugLine="p.LoadLayout(\"dlgBooks\")";
Debug.ShouldStop(8388608);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("dlgBooks")),__ref.getField(false, "ba"));
 BA.debugLineNum = 121;BA.debugLine="diálogo.PutAtTop = True";
Debug.ShouldStop(16777216);
__ref.getField(false,"_diálogo" /*RemoteObject*/ ).setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 122;BA.debugLine="Wait For (diálogo.ShowCustom(p, \"OK\", \"\", \"Cancel";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xpagebooks", "insertarlibro"), __ref.getField(false,"_diálogo" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar")))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Resultado", _resultado);
;
 BA.debugLineNum = 123;BA.debugLine="If Resultado = xui.DialogResponse_Positive Then";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 124;BA.debugLine="Private nuevoLibro As Libro";
Debug.ShouldStop(134217728);
_nuevolibro = RemoteObject.createNew ("b4j.example.b4xmainpage._libro");Debug.locals.put("nuevoLibro", _nuevolibro);
 BA.debugLineNum = 125;BA.debugLine="nuevoLibro.ID = txtID.Text";
Debug.ShouldStop(268435456);
_nuevolibro.setField ("ID" /*RemoteObject*/ ,__ref.getField(false,"_txtid" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ));
 BA.debugLineNum = 126;BA.debugLine="nuevoLibro.Título = txtTitulo.Text";
Debug.ShouldStop(536870912);
_nuevolibro.setField ("Título" /*RemoteObject*/ ,__ref.getField(false,"_txttitulo" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ));
 BA.debugLineNum = 127;BA.debugLine="nuevoLibro.Escritor = txtEscritor.Text";
Debug.ShouldStop(1073741824);
_nuevolibro.setField ("Escritor" /*RemoteObject*/ ,__ref.getField(false,"_txtescritor" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ));
 BA.debugLineNum = 128;BA.debugLine="nuevoLibro.Ano = txtAno.Text";
Debug.ShouldStop(-2147483648);
_nuevolibro.setField ("Ano" /*RemoteObject*/ ,__ref.getField(false,"_txtano" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ));
 BA.debugLineNum = 129;BA.debugLine="nuevoLibro.Editorial = txtEditorial.Text";
Debug.ShouldStop(1);
_nuevolibro.setField ("Editorial" /*RemoteObject*/ ,__ref.getField(false,"_txteditorial" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ));
 BA.debugLineNum = 130;BA.debugLine="nuevoLibro.Estante = txtEstante.Text";
Debug.ShouldStop(2);
_nuevolibro.setField ("Estante" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(false,"_txtestante" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ )));
 BA.debugLineNum = 131;BA.debugLine="B4XPages.MainPage.mapaLibros.Put(nuevoLibro.ID,";
Debug.ShouldStop(4);
parent._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_mapalibros" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_nuevolibro.getField(true,"ID" /*RemoteObject*/ ))),(Object)((_nuevolibro)));
 BA.debugLineNum = 132;BA.debugLine="cargarLista";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.b4xpagebooks.class, "_cargarlista" /*RemoteObject*/ );
 BA.debugLineNum = 133;BA.debugLine="GuardarFicheroLibros";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.example.b4xpagebooks.class, "_guardarficherolibros" /*RemoteObject*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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