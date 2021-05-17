package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xpageborrow_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xpageborrow) ","b4xpageborrow",4,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xpageborrow","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 18;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Root = Root1";
Debug.ShouldStop(262144);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 21;BA.debugLine="Root.LoadLayout(\"frmBorrow\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("frmBorrow")),__ref.getField(false, "ba"));
 BA.debugLineNum = 22;BA.debugLine="cmbEstudiante.SetItems(mostrarcmbEstudiante)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_cmbestudiante" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xcombobox.class, "_setitems" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xpageborrow.class, "_mostrarcmbestudiante" /*RemoteObject*/ )));
 BA.debugLineNum = 23;BA.debugLine="cargarListaLibros";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.example.b4xpageborrow.class, "_cargarlistalibros" /*RemoteObject*/ );
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
public static RemoteObject  _btnprestar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnPrestar_Click (b4xpageborrow) ","b4xpageborrow",4,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("btnprestar_click")) { return __ref.runUserSub(false, "b4xpageborrow","btnprestar_click", __ref);}
 BA.debugLineNum = 95;BA.debugLine="Private Sub btnPrestar_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="If idLibroElegido <> \"\" And idEstudianteElegido <";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_idlibroelegido" /*RemoteObject*/ ),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",__ref.getField(true,"_idestudianteelegido" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 97;BA.debugLine="prestarLibro";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.b4xpageborrow.class, "_prestarlibro" /*void*/ );
 };
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargarlistalibros(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cargarListaLibros (b4xpageborrow) ","b4xpageborrow",4,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("cargarlistalibros")) { return __ref.runUserSub(false, "b4xpageborrow","cargarlistalibros", __ref);}
RemoteObject _tplibro = RemoteObject.declareNull("b4j.example.b4xmainpage._libro");
RemoteObject _s1 = RemoteObject.createImmutable("");
RemoteObject _s2 = RemoteObject.createImmutable("");
RemoteObject _s3 = RemoteObject.createImmutable("");
RemoteObject _s4 = RemoteObject.createImmutable("");
RemoteObject _s5 = RemoteObject.createImmutable("");
RemoteObject _s6 = RemoteObject.createImmutable("");
RemoteObject _str = RemoteObject.createImmutable("");
 BA.debugLineNum = 28;BA.debugLine="Private Sub cargarListaLibros";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="For Each tpLibro As Libro In B4XPages.MainPage.ma";
Debug.ShouldStop(268435456);
{
final RemoteObject group1 = b4xpageborrow._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_mapalibros" /*RemoteObject*/ ).runMethod(false,"Values");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_tplibro = (group1.runMethod(false,"Get",index1));Debug.locals.put("tpLibro", _tplibro);
Debug.locals.put("tpLibro", _tplibro);
 BA.debugLineNum = 30;BA.debugLine="Private s1, s2, s3, s4, s5, s6, str As String";
Debug.ShouldStop(536870912);
_s1 = RemoteObject.createImmutable("");Debug.locals.put("s1", _s1);
_s2 = RemoteObject.createImmutable("");Debug.locals.put("s2", _s2);
_s3 = RemoteObject.createImmutable("");Debug.locals.put("s3", _s3);
_s4 = RemoteObject.createImmutable("");Debug.locals.put("s4", _s4);
_s5 = RemoteObject.createImmutable("");Debug.locals.put("s5", _s5);
_s6 = RemoteObject.createImmutable("");Debug.locals.put("s6", _s6);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 31;BA.debugLine="s1 = B4XPages.MainPage.pgLibros.anadirEspacios(t";
Debug.ShouldStop(1073741824);
_s1 = b4xpageborrow._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pglibros" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpagebooks.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(_tplibro.getField(true,"ID" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("s1", _s1);
 BA.debugLineNum = 32;BA.debugLine="s2 = B4XPages.MainPage.pgLibros.anadirEspacios(t";
Debug.ShouldStop(-2147483648);
_s2 = b4xpageborrow._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pglibros" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpagebooks.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(_tplibro.getField(true,"Título" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("s2", _s2);
 BA.debugLineNum = 33;BA.debugLine="s3 = B4XPages.MainPage.pgLibros.anadirEspacios(t";
Debug.ShouldStop(1);
_s3 = b4xpageborrow._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pglibros" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpagebooks.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(_tplibro.getField(true,"Escritor" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("s3", _s3);
 BA.debugLineNum = 34;BA.debugLine="s4 = B4XPages.MainPage.pgLibros.anadirEspacios(t";
Debug.ShouldStop(2);
_s4 = b4xpageborrow._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pglibros" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpagebooks.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(_tplibro.getField(true,"Ano" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 4)));Debug.locals.put("s4", _s4);
 BA.debugLineNum = 35;BA.debugLine="s5 = B4XPages.MainPage.pgLibros.anadirEspacios(t";
Debug.ShouldStop(4);
_s5 = b4xpageborrow._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pglibros" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpagebooks.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(_tplibro.getField(true,"Editorial" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("s5", _s5);
 BA.debugLineNum = 36;BA.debugLine="s6 = B4XPages.MainPage.pgLibros.anadirEspacios(t";
Debug.ShouldStop(8);
_s6 = b4xpageborrow._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pglibros" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpagebooks.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(BA.NumberToString(_tplibro.getField(true,"Estante" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 6)));Debug.locals.put("s6", _s6);
 BA.debugLineNum = 38;BA.debugLine="str = $\"${s1}${s2}${s3}${s4}${s5}${s6}\"$";
Debug.ShouldStop(32);
_str = (RemoteObject.concat(RemoteObject.createImmutable(""),b4xpageborrow.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s1))),RemoteObject.createImmutable(""),b4xpageborrow.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s2))),RemoteObject.createImmutable(""),b4xpageborrow.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s3))),RemoteObject.createImmutable(""),b4xpageborrow.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s4))),RemoteObject.createImmutable(""),b4xpageborrow.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s5))),RemoteObject.createImmutable(""),b4xpageborrow.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s6))),RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 BA.debugLineNum = 39;BA.debugLine="clvLibros.AddTextItem(str, tpLibro.ID)";
Debug.ShouldStop(64);
__ref.getField(false,"_clvlibros" /*RemoteObject*/ ).runVoidMethod ("_addtextitem",(Object)((_str)),(Object)((_tplibro.getField(true,"ID" /*RemoteObject*/ ))));
 }
}Debug.locals.put("tpLibro", _tplibro);
;
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
b4xpageborrow._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xpageborrow._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xpageborrow._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xpageborrow._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private btnPrestar As Button";
b4xpageborrow._btnprestar = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnprestar",b4xpageborrow._btnprestar);
 //BA.debugLineNum = 5;BA.debugLine="Private cmbEstudiante As B4XComboBox";
b4xpageborrow._cmbestudiante = RemoteObject.createNew ("b4j.example.b4xcombobox");__ref.setField("_cmbestudiante",b4xpageborrow._cmbestudiante);
 //BA.debugLineNum = 6;BA.debugLine="Private clvLibros As CustomListView";
b4xpageborrow._clvlibros = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_clvlibros",b4xpageborrow._clvlibros);
 //BA.debugLineNum = 7;BA.debugLine="Private libroElegido As Int = -1";
b4xpageborrow._libroelegido = BA.numberCast(int.class, -(double) (0 + 1));__ref.setField("_libroelegido",b4xpageborrow._libroelegido);
 //BA.debugLineNum = 8;BA.debugLine="Private idEstudianteElegido As String =  \"\"";
b4xpageborrow._idestudianteelegido = BA.ObjectToString("");__ref.setField("_idestudianteelegido",b4xpageborrow._idestudianteelegido);
 //BA.debugLineNum = 9;BA.debugLine="Private idLibroElegido As String  =  \"\"";
b4xpageborrow._idlibroelegido = BA.ObjectToString("");__ref.setField("_idlibroelegido",b4xpageborrow._idlibroelegido);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clvlibros_itemclick(RemoteObject __ref,RemoteObject _índice,RemoteObject _valor) throws Exception{
try {
		Debug.PushSubsStack("clvLibros_ItemClick (b4xpageborrow) ","b4xpageborrow",4,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("clvlibros_itemclick")) { return __ref.runUserSub(false, "b4xpageborrow","clvlibros_itemclick", __ref, _índice, _valor);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Índice", _índice);
Debug.locals.put("Valor", _valor);
 BA.debugLineNum = 71;BA.debugLine="Private Sub clvLibros_ItemClick (Índice As Int, Va";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="If libroElegido = -1 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_libroelegido" /*RemoteObject*/ ),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 73;BA.debugLine="Dim p As B4XView = clvLibros.GetPanel(Índice)";
Debug.ShouldStop(256);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_clvlibros" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_índice));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 74;BA.debugLine="p.GetView(0).Color = xui.Color_Blue";
Debug.ShouldStop(512);
_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue"));
 BA.debugLineNum = 75;BA.debugLine="libroElegido = Índice";
Debug.ShouldStop(1024);
__ref.setField ("_libroelegido" /*RemoteObject*/ ,_índice);
 BA.debugLineNum = 76;BA.debugLine="idLibroElegido = clvLibros.GetValue(libroElegido";
Debug.ShouldStop(2048);
__ref.setField ("_idlibroelegido" /*RemoteObject*/ ,BA.ObjectToString(__ref.getField(false,"_clvlibros" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(__ref.getField(true,"_libroelegido" /*RemoteObject*/ )))));
 }else {
 BA.debugLineNum = 78;BA.debugLine="Dim p As B4XView = clvLibros.GetPanel(libroElegi";
Debug.ShouldStop(8192);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_clvlibros" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(__ref.getField(true,"_libroelegido" /*RemoteObject*/ )));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 79;BA.debugLine="p.GetView(0).Color = xui.Color_White";
Debug.ShouldStop(16384);
_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 80;BA.debugLine="If libroElegido = Índice  Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_libroelegido" /*RemoteObject*/ ),BA.numberCast(double.class, _índice))) { 
 BA.debugLineNum = 81;BA.debugLine="libroElegido = -1";
Debug.ShouldStop(65536);
__ref.setField ("_libroelegido" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 82;BA.debugLine="idLibroElegido = \"\"";
Debug.ShouldStop(131072);
__ref.setField ("_idlibroelegido" /*RemoteObject*/ ,BA.ObjectToString(""));
 }else {
 BA.debugLineNum = 84;BA.debugLine="Dim p As B4XView = clvLibros.GetPanel(Índice)";
Debug.ShouldStop(524288);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_clvlibros" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_índice));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 85;BA.debugLine="p.GetView(0).Color = xui.Color_Blue";
Debug.ShouldStop(1048576);
_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue"));
 BA.debugLineNum = 86;BA.debugLine="libroElegido = Índice";
Debug.ShouldStop(2097152);
__ref.setField ("_libroelegido" /*RemoteObject*/ ,_índice);
 BA.debugLineNum = 87;BA.debugLine="idLibroElegido = clvLibros.GetValue(libroElegid";
Debug.ShouldStop(4194304);
__ref.setField ("_idlibroelegido" /*RemoteObject*/ ,BA.ObjectToString(__ref.getField(false,"_clvlibros" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(__ref.getField(true,"_libroelegido" /*RemoteObject*/ )))));
 };
 };
 BA.debugLineNum = 91;BA.debugLine="Log(libroElegido)";
Debug.ShouldStop(67108864);
b4xpageborrow.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(__ref.getField(true,"_libroelegido" /*RemoteObject*/ ))));
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
public static RemoteObject  _cmbestudiante_selectedindexchanged(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("cmbEstudiante_SelectedIndexChanged (b4xpageborrow) ","b4xpageborrow",4,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("cmbestudiante_selectedindexchanged")) { return __ref.runUserSub(false, "b4xpageborrow","cmbestudiante_selectedindexchanged", __ref, _index);}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("Index", _index);
 BA.debugLineNum = 57;BA.debugLine="Private Sub cmbEstudiante_SelectedIndexChanged (In";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="idEstudianteElegido = \"\"";
Debug.ShouldStop(33554432);
__ref.setField ("_idestudianteelegido" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 59;BA.debugLine="Private str As String = cmbEstudiante.GetItem(Ind";
Debug.ShouldStop(67108864);
_str = __ref.getField(false,"_cmbestudiante" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xcombobox.class, "_getitem" /*RemoteObject*/ ,(Object)(_index));Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 60;BA.debugLine="Private i As Int = 0";
Debug.ShouldStop(134217728);
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 61;BA.debugLine="Do While str.CharAt(i) <> \" \"";
Debug.ShouldStop(268435456);
while (RemoteObject.solveBoolean("!",_str.runMethod(true,"charAt",(Object)(_i)),BA.ObjectToChar(" "))) {
 BA.debugLineNum = 62;BA.debugLine="idEstudianteElegido = idEstudianteElegido & str.";
Debug.ShouldStop(536870912);
__ref.setField ("_idestudianteelegido" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_idestudianteelegido" /*RemoteObject*/ ),_str.runMethod(true,"charAt",(Object)(_i))));
 BA.debugLineNum = 63;BA.debugLine="i = i + 1";
Debug.ShouldStop(1073741824);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
;
 BA.debugLineNum = 65;BA.debugLine="Log(idEstudianteElegido)";
Debug.ShouldStop(1);
b4xpageborrow.__c.runVoidMethod ("Log",(Object)(__ref.getField(true,"_idestudianteelegido" /*RemoteObject*/ )));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xpageborrow) ","b4xpageborrow",4,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xpageborrow","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="Return Me";
Debug.ShouldStop(8192);
if (true) return __ref;
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mostrarcmbestudiante(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("mostrarcmbEstudiante (b4xpageborrow) ","b4xpageborrow",4,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("mostrarcmbestudiante")) { return __ref.runUserSub(false, "b4xpageborrow","mostrarcmbestudiante", __ref);}
RemoteObject _nuevalista = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _clave = RemoteObject.createImmutable("");
RemoteObject _tp = RemoteObject.declareNull("b4j.example.b4xmainpage._estudiante");
 BA.debugLineNum = 44;BA.debugLine="Private Sub mostrarcmbEstudiante As List";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="Private nuevaLista As List";
Debug.ShouldStop(4096);
_nuevalista = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("nuevaLista", _nuevalista);
 BA.debugLineNum = 46;BA.debugLine="nuevaLista.Initialize";
Debug.ShouldStop(8192);
_nuevalista.runVoidMethod ("Initialize");
 BA.debugLineNum = 47;BA.debugLine="For Each clave As String In B4XPages.MainPage.map";
Debug.ShouldStop(16384);
{
final RemoteObject group3 = b4xpageborrow._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_mapaestudiantes" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_clave = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("clave", _clave);
Debug.locals.put("clave", _clave);
 BA.debugLineNum = 48;BA.debugLine="Dim tp As Estudiante";
Debug.ShouldStop(32768);
_tp = RemoteObject.createNew ("b4j.example.b4xmainpage._estudiante");Debug.locals.put("tp", _tp);
 BA.debugLineNum = 49;BA.debugLine="tp = B4XPages.MainPage.mapaEstudiantes.Get(clave";
Debug.ShouldStop(65536);
_tp = (b4xpageborrow._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_mapaestudiantes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_clave))));Debug.locals.put("tp", _tp);
 BA.debugLineNum = 50;BA.debugLine="nuevaLista.Add($\"${clave} ${tp.Nombre} ${tp.Apel";
Debug.ShouldStop(131072);
_nuevalista.runVoidMethod ("Add",(Object)(((RemoteObject.concat(RemoteObject.createImmutable(""),b4xpageborrow.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clave))),RemoteObject.createImmutable(" "),b4xpageborrow.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tp.getField(true,"Nombre" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),b4xpageborrow.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tp.getField(true,"Apellidos" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),b4xpageborrow.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tp.getField(true,"Clase" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 51;BA.debugLine="Log($\"${clave} ${tp.Nombre} ${tp.Apellidos} ${tp";
Debug.ShouldStop(262144);
b4xpageborrow.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),b4xpageborrow.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clave))),RemoteObject.createImmutable(" "),b4xpageborrow.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tp.getField(true,"Nombre" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),b4xpageborrow.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tp.getField(true,"Apellidos" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),b4xpageborrow.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tp.getField(true,"Clase" /*RemoteObject*/ )))),RemoteObject.createImmutable("")))));
 }
}Debug.locals.put("clave", _clave);
;
 BA.debugLineNum = 53;BA.debugLine="Return nuevaLista";
Debug.ShouldStop(1048576);
if (true) return _nuevalista;
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _prestarlibro(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("prestarLibro (b4xpageborrow) ","b4xpageborrow",4,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("prestarlibro")) { __ref.runUserSub(false, "b4xpageborrow","prestarlibro", __ref); return;}
ResumableSub_prestarLibro rsub = new ResumableSub_prestarLibro(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_prestarLibro extends BA.ResumableSub {
public ResumableSub_prestarLibro(b4j.example.b4xpageborrow parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xpageborrow parent;
RemoteObject _mapaest = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nombrefichest = RemoteObject.createImmutable("");
RemoteObject _fichestudiante = RemoteObject.declareNull("b4j.example.keyvaluestore");
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _exito = RemoteObject.createImmutable(false);
RemoteObject group13;
int index13;
int groupLen13;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("prestarLibro (b4xpageborrow) ","b4xpageborrow",4,__ref.getField(false, "ba"),__ref,103);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 105;BA.debugLine="Private mapaEst As Map";
Debug.ShouldStop(256);
_mapaest = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapaEst", _mapaest);
 BA.debugLineNum = 106;BA.debugLine="mapaEst.Initialize";
Debug.ShouldStop(512);
_mapaest.runVoidMethod ("Initialize");
 BA.debugLineNum = 108;BA.debugLine="Private nombreFichEst As String = idEstudianteEle";
Debug.ShouldStop(2048);
_nombrefichest = RemoteObject.concat(__ref.getField(true,"_idestudianteelegido" /*RemoteObject*/ ),RemoteObject.createImmutable(".dat"));Debug.locals.put("nombreFichEst", _nombrefichest);Debug.locals.put("nombreFichEst", _nombrefichest);
 BA.debugLineNum = 109;BA.debugLine="Log(\"Nombre del fichero: \" & nombreFichEst)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Nombre del fichero: "),_nombrefichest)));
 BA.debugLineNum = 110;BA.debugLine="Private fichEstudiante As KeyValueStore";
Debug.ShouldStop(8192);
_fichestudiante = RemoteObject.createNew ("b4j.example.keyvaluestore");Debug.locals.put("fichEstudiante", _fichestudiante);
 BA.debugLineNum = 112;BA.debugLine="If File.Exists(File.DirTemp, nombreFichEst) Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(_nombrefichest)).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 113;BA.debugLine="fichEstudiante.Initialize(File.DirTemp, nombreFi";
Debug.ShouldStop(65536);
_fichestudiante.runClassMethod (b4j.example.keyvaluestore.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(_nombrefichest));
 BA.debugLineNum = 115;BA.debugLine="Wait For (fichEstudiante.GetMapAsync(fichEstudia";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xpageborrow", "prestarlibro"), _fichestudiante.runClassMethod (b4j.example.keyvaluestore.class, "_getmapasync" /*RemoteObject*/ ,(Object)(_fichestudiante.runClassMethod (b4j.example.keyvaluestore.class, "_listkeys" /*RemoteObject*/ ))));
this.state = 11;
return;
case 11:
//C
this.state = 6;
_mapaest = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mapaEst", _mapaest);
;
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 117;BA.debugLine="fichEstudiante.Initialize(File.DirTemp, nombreFi";
Debug.ShouldStop(1048576);
_fichestudiante.runClassMethod (b4j.example.keyvaluestore.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(_nombrefichest));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 121;BA.debugLine="mapaEst.Put(idLibroElegido, DateTime.Date(DateTim";
Debug.ShouldStop(16777216);
_mapaest.runVoidMethod ("Put",(Object)((__ref.getField(true,"_idlibroelegido" /*RemoteObject*/ ))),(Object)((parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow"))))));
 BA.debugLineNum = 122;BA.debugLine="For Each key As String In mapaEst.Keys";
Debug.ShouldStop(33554432);
if (true) break;

case 7:
//for
this.state = 10;
group13 = _mapaest.runMethod(false,"Keys");
index13 = 0;
groupLen13 = group13.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("key", _key);
this.state = 12;
if (true) break;

case 12:
//C
this.state = 10;
if (index13 < groupLen13) {
this.state = 9;
_key = BA.ObjectToString(group13.runMethod(false,"Get",index13));Debug.locals.put("key", _key);}
if (true) break;

case 13:
//C
this.state = 12;
index13++;
Debug.locals.put("key", _key);
if (true) break;

case 9:
//C
this.state = 13;
 BA.debugLineNum = 123;BA.debugLine="Log (key & \" \" & mapaEst.Get(key))";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(_key,RemoteObject.createImmutable(" "),_mapaest.runMethod(false,"Get",(Object)((_key))))));
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
Debug.locals.put("key", _key);
;
 BA.debugLineNum = 126;BA.debugLine="Wait For (fichEstudiante.PutMapAsync(mapaEst)) Co";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xpageborrow", "prestarlibro"), _fichestudiante.runClassMethod (b4j.example.keyvaluestore.class, "_putmapasync" /*RemoteObject*/ ,(Object)(_mapaest)));
this.state = 14;
return;
case 14:
//C
this.state = -1;
_exito = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Exito", _exito);
;
 BA.debugLineNum = 127;BA.debugLine="fichEstudiante.Close";
Debug.ShouldStop(1073741824);
_fichestudiante.runClassMethod (b4j.example.keyvaluestore.class, "_close" /*RemoteObject*/ );
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
public static void  _complete(RemoteObject __ref,RemoteObject _mapaest) throws Exception{
}
}