package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _anadirespacios(RemoteObject __ref,RemoteObject _s1,RemoteObject _pos) throws Exception{
try {
		Debug.PushSubsStack("anadirEspacios (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("anadirespacios")) { return __ref.runUserSub(false, "b4xmainpage","anadirespacios", __ref, _s1, _pos);}
Debug.locals.put("s1", _s1);
Debug.locals.put("pos", _pos);
 BA.debugLineNum = 69;BA.debugLine="Private Sub anadirEspacios(s1 As String, pos As In";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="If pos = 1 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_pos,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 71;BA.debugLine="Do While s1.Length <= 8 Then";
Debug.ShouldStop(64);
while (RemoteObject.solveBoolean("k",_s1.runMethod(true,"length"),BA.numberCast(double.class, 8))) {
 BA.debugLineNum = 72;BA.debugLine="s1 = s1 & \" \"";
Debug.ShouldStop(128);
_s1 = RemoteObject.concat(_s1,RemoteObject.createImmutable(" "));Debug.locals.put("s1", _s1);
 }
;
 }else 
{ BA.debugLineNum = 74;BA.debugLine="else if pos = 2 Or pos = 3 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_pos,BA.numberCast(double.class, 2)) || RemoteObject.solveBoolean("=",_pos,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 75;BA.debugLine="Do While s1.Length <= 20 Then";
Debug.ShouldStop(1024);
while (RemoteObject.solveBoolean("k",_s1.runMethod(true,"length"),BA.numberCast(double.class, 20))) {
 BA.debugLineNum = 76;BA.debugLine="s1 = s1 & \" \"";
Debug.ShouldStop(2048);
_s1 = RemoteObject.concat(_s1,RemoteObject.createImmutable(" "));Debug.locals.put("s1", _s1);
 }
;
 }}
;
 BA.debugLineNum = 79;BA.debugLine="Return s1";
Debug.ShouldStop(16384);
if (true) return _s1;
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
int _i = 0;
RemoteObject _c = RemoteObject.declareNull("b4j.example.b4xmainpage._cliente");
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 29;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Root = Root1";
Debug.ShouldStop(536870912);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 31;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 32;BA.debugLine="Clientes.Initialize";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_clientes" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 33;BA.debugLine="crearLista";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_crearlista" /*RemoteObject*/ );
 BA.debugLineNum = 36;BA.debugLine="For i = 0 To Clientes.Size-1";
Debug.ShouldStop(8);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clientes" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 37;BA.debugLine="Private c As Cliente";
Debug.ShouldStop(16);
_c = RemoteObject.createNew ("b4j.example.b4xmainpage._cliente");Debug.locals.put("c", _c);
 BA.debugLineNum = 38;BA.debugLine="c = Clientes.Get(i)";
Debug.ShouldStop(32);
_c = (__ref.getField(false,"_clientes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("c", _c);
 BA.debugLineNum = 39;BA.debugLine="LogCliente(c)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_logcliente" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 40;BA.debugLine="Log(\"---------------------------\")";
Debug.ShouldStop(128);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("---------------------------")));
 }
}Debug.locals.put("i", _i);
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
public static void  _borrarregistro(RemoteObject __ref,RemoteObject _índice,RemoteObject _valor) throws Exception{
try {
		Debug.PushSubsStack("borrarRegistro (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("borrarregistro")) { __ref.runUserSub(false, "b4xmainpage","borrarregistro", __ref, _índice, _valor); return;}
ResumableSub_borrarRegistro rsub = new ResumableSub_borrarRegistro(null,__ref,_índice,_valor);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_borrarRegistro extends BA.ResumableSub {
public ResumableSub_borrarRegistro(b4j.example.b4xmainpage parent,RemoteObject __ref,RemoteObject _índice,RemoteObject _valor) {
this.parent = parent;
this.__ref = __ref;
this._índice = _índice;
this._valor = _valor;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _índice;
RemoteObject _valor;
RemoteObject _dlg = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("borrarRegistro (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,98);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("índice", _índice);
Debug.locals.put("valor", _valor);
 BA.debugLineNum = 99;BA.debugLine="Dim dlg As Object";
Debug.ShouldStop(4);
_dlg = RemoteObject.createNew ("Object");Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 100;BA.debugLine="dlg = xui.Msgbox2Async(\"¿Quieres borrar el Client";
Debug.ShouldStop(8);
_dlg = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Quieres borrar el Cliente?")),(Object)(BA.ObjectToString("Advertencia")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 101;BA.debugLine="Wait for (dlg) Msgbox_Result (Result As Int)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "borrarregistro"), _dlg);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 102;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(32);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 103;BA.debugLine="CustomListView1.RemoveAt(índice)";
Debug.ShouldStop(64);
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(_índice));
 BA.debugLineNum = 104;BA.debugLine="Clientes.RemoveAt(índice)";
Debug.ShouldStop(128);
__ref.getField(false,"_clientes" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_índice));
 BA.debugLineNum = 105;BA.debugLine="ficheroKVS.Remove(valor)";
Debug.ShouldStop(256);
__ref.getField(false,"_ficherokvs" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_remove" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_valor)));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 107;BA.debugLine="btnCargar_Click";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_btncargar_click" /*RemoteObject*/ );
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
public static void  _msgbox_result(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _btncargar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnCargar_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("btncargar_click")) { return __ref.runUserSub(false, "b4xmainpage","btncargar_click", __ref);}
int _i = 0;
RemoteObject _c = RemoteObject.declareNull("b4j.example.b4xmainpage._cliente");
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _s1 = RemoteObject.createImmutable("");
RemoteObject _s2 = RemoteObject.createImmutable("");
RemoteObject _s3 = RemoteObject.createImmutable("");
RemoteObject _s4 = RemoteObject.createImmutable("");
 BA.debugLineNum = 47;BA.debugLine="Private Sub btnCargar_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="If CustomListView1.IsInitialized Then";
Debug.ShouldStop(32768);
if (__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 49;BA.debugLine="CustomListView1.Clear";
Debug.ShouldStop(65536);
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_clear");
 };
 BA.debugLineNum = 51;BA.debugLine="For i = 0 To Clientes.Size-1";
Debug.ShouldStop(262144);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clientes" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 52;BA.debugLine="Private c As Cliente";
Debug.ShouldStop(524288);
_c = RemoteObject.createNew ("b4j.example.b4xmainpage._cliente");Debug.locals.put("c", _c);
 BA.debugLineNum = 53;BA.debugLine="Private str As String";
Debug.ShouldStop(1048576);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 54;BA.debugLine="c = Clientes.Get(i)";
Debug.ShouldStop(2097152);
_c = (__ref.getField(false,"_clientes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("c", _c);
 BA.debugLineNum = 55;BA.debugLine="Private s1, s2, s3, s4 As String";
Debug.ShouldStop(4194304);
_s1 = RemoteObject.createImmutable("");Debug.locals.put("s1", _s1);
_s2 = RemoteObject.createImmutable("");Debug.locals.put("s2", _s2);
_s3 = RemoteObject.createImmutable("");Debug.locals.put("s3", _s3);
_s4 = RemoteObject.createImmutable("");Debug.locals.put("s4", _s4);
 BA.debugLineNum = 56;BA.debugLine="s1 = anadirEspacios(c.ID, 1)";
Debug.ShouldStop(8388608);
_s1 = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(_c.getField(true,"ID" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("s1", _s1);
 BA.debugLineNum = 57;BA.debugLine="s2 = anadirEspacios(c.Nombre, 2)";
Debug.ShouldStop(16777216);
_s2 = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(_c.getField(true,"Nombre" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("s2", _s2);
 BA.debugLineNum = 58;BA.debugLine="s3 = anadirEspacios(c.Apellidos, 3)";
Debug.ShouldStop(33554432);
_s3 = __ref.runClassMethod (b4j.example.b4xmainpage.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(_c.getField(true,"Apellidos" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("s3", _s3);
 BA.debugLineNum = 59;BA.debugLine="s4 = c.Teléfono";
Debug.ShouldStop(67108864);
_s4 = _c.getField(true,"Teléfono" /*RemoteObject*/ );Debug.locals.put("s4", _s4);
 BA.debugLineNum = 61;BA.debugLine="str = $\"${s1}${s2}${s3}${s4}\"$";
Debug.ShouldStop(268435456);
_str = (RemoteObject.concat(RemoteObject.createImmutable(""),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s1))),RemoteObject.createImmutable(""),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s2))),RemoteObject.createImmutable(""),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s3))),RemoteObject.createImmutable(""),b4xmainpage.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s4))),RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 BA.debugLineNum = 62;BA.debugLine="CustomListView1.AddTextItem(str, c.ID)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_customlistview1" /*RemoteObject*/ ).runVoidMethod ("_addtextitem",(Object)((_str)),(Object)((_c.getField(true,"ID" /*RemoteObject*/ ))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncargarfichero_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnCargarFichero_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,202);
if (RapidSub.canDelegate("btncargarfichero_click")) { return __ref.runUserSub(false, "b4xmainpage","btncargarfichero_click", __ref);}
 BA.debugLineNum = 202;BA.debugLine="Private Sub btnCargarFichero_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 203;BA.debugLine="cargarFichero";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_cargarfichero" /*RemoteObject*/ );
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnguardarfichero_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnGuardarFichero_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,185);
if (RapidSub.canDelegate("btnguardarfichero_click")) { return __ref.runUserSub(false, "b4xmainpage","btnguardarfichero_click", __ref);}
 BA.debugLineNum = 185;BA.debugLine="Private Sub btnGuardarFichero_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 186;BA.debugLine="guardarFichero";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_guardarfichero" /*RemoteObject*/ );
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btninsertar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnInsertar_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("btninsertar_click")) { __ref.runUserSub(false, "b4xmainpage","btninsertar_click", __ref); return;}
ResumableSub_btnInsertar_Click rsub = new ResumableSub_btnInsertar_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnInsertar_Click extends BA.ResumableSub {
public ResumableSub_btnInsertar_Click(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _nuevocliente = RemoteObject.declareNull("b4j.example.b4xmainpage._cliente");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnInsertar_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,111);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 112;BA.debugLine="dialog.Initialize(Root)";
Debug.ShouldStop(32768);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ )));
 BA.debugLineNum = 113;BA.debugLine="dialog.Title = \"Insertar Cliente\"";
Debug.ShouldStop(65536);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Insertar Cliente")));
 BA.debugLineNum = 115;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(262144);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 116;BA.debugLine="p.SetLayoutAnimated(0,0,0, 350dip, 250dip)";
Debug.ShouldStop(524288);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 350))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 250))))));
 BA.debugLineNum = 118;BA.debugLine="p.LoadLayout(\"dlgInsertCustomer\")";
Debug.ShouldStop(2097152);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("dlgInsertCustomer")),__ref.getField(false, "ba"));
 BA.debugLineNum = 119;BA.debugLine="dialog.PutAtTop = True";
Debug.ShouldStop(4194304);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 120;BA.debugLine="Wait For (dialog.ShowCustom(p, \"OK\", \"\", \"Cancel\"";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "btninsertar_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancel")))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 121;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 122;BA.debugLine="Private nuevoCliente As Cliente";
Debug.ShouldStop(33554432);
_nuevocliente = RemoteObject.createNew ("b4j.example.b4xmainpage._cliente");Debug.locals.put("nuevoCliente", _nuevocliente);
 BA.debugLineNum = 123;BA.debugLine="nuevoCliente.ID = txtID.Text";
Debug.ShouldStop(67108864);
_nuevocliente.setField ("ID" /*RemoteObject*/ ,__ref.getField(false,"_txtid" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ));
 BA.debugLineNum = 124;BA.debugLine="nuevoCliente.Nombre = txtNombre.Text";
Debug.ShouldStop(134217728);
_nuevocliente.setField ("Nombre" /*RemoteObject*/ ,__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ));
 BA.debugLineNum = 125;BA.debugLine="nuevoCliente.Apellidos = txtApellidos.Text";
Debug.ShouldStop(268435456);
_nuevocliente.setField ("Apellidos" /*RemoteObject*/ ,__ref.getField(false,"_txtapellidos" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ));
 BA.debugLineNum = 126;BA.debugLine="nuevoCliente.Teléfono = txtTeléfono.Text";
Debug.ShouldStop(536870912);
_nuevocliente.setField ("Teléfono" /*RemoteObject*/ ,__ref.getField(false,"_txtteléfono" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ));
 BA.debugLineNum = 127;BA.debugLine="Clientes.Add(nuevoCliente)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_clientes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_nuevocliente)));
 BA.debugLineNum = 128;BA.debugLine="btnCargar_Click";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_btncargar_click" /*RemoteObject*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
public static void  _complete(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _cargarfichero(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cargarFichero (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,207);
if (RapidSub.canDelegate("cargarfichero")) { return __ref.runUserSub(false, "b4xmainpage","cargarfichero", __ref);}
RemoteObject _lstclaves = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _cli = RemoteObject.declareNull("b4j.example.b4xmainpage._cliente");
 BA.debugLineNum = 207;BA.debugLine="Private Sub cargarFichero";
Debug.ShouldStop(16384);
 BA.debugLineNum = 208;BA.debugLine="ficheroKVS.Initialize(File.DirTemp & \"tema18\", \"e";
Debug.ShouldStop(32768);
__ref.getField(false,"_ficherokvs" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirTemp"),RemoteObject.createImmutable("tema18"))),(Object)(RemoteObject.createImmutable("ej1.dat")));
 BA.debugLineNum = 209;BA.debugLine="Private lstClaves As List = ficheroKVS.ListKeys";
Debug.ShouldStop(65536);
_lstclaves = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstclaves = __ref.getField(false,"_ficherokvs" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_listkeys" /*RemoteObject*/ );Debug.locals.put("lstClaves", _lstclaves);Debug.locals.put("lstClaves", _lstclaves);
 BA.debugLineNum = 210;BA.debugLine="Clientes.Initialize";
Debug.ShouldStop(131072);
__ref.getField(false,"_clientes" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 211;BA.debugLine="For i = 0 To lstClaves.Size-1";
Debug.ShouldStop(262144);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_lstclaves.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 212;BA.debugLine="Private cli As Cliente";
Debug.ShouldStop(524288);
_cli = RemoteObject.createNew ("b4j.example.b4xmainpage._cliente");Debug.locals.put("cli", _cli);
 BA.debugLineNum = 213;BA.debugLine="cli = ficheroKVS.Get(lstClaves.Get(i))";
Debug.ShouldStop(1048576);
_cli = (__ref.getField(false,"_ficherokvs" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_get" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_lstclaves.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))))));Debug.locals.put("cli", _cli);
 BA.debugLineNum = 214;BA.debugLine="Clientes.Add(cli)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_clientes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cli)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 216;BA.debugLine="btnCargar_Click";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_btncargar_click" /*RemoteObject*/ );
 BA.debugLineNum = 217;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Type Cliente(ID As String, Nombre As String, Apel";
;
 //BA.debugLineNum = 12;BA.debugLine="Private Clientes As List";
b4xmainpage._clientes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_clientes",b4xmainpage._clientes);
 //BA.debugLineNum = 13;BA.debugLine="Private CustomListView1 As CustomListView";
b4xmainpage._customlistview1 = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_customlistview1",b4xmainpage._customlistview1);
 //BA.debugLineNum = 14;BA.debugLine="Private txtNombre As B4XFloatTextField";
b4xmainpage._txtnombre = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_txtnombre",b4xmainpage._txtnombre);
 //BA.debugLineNum = 15;BA.debugLine="Private txtID As B4XFloatTextField";
b4xmainpage._txtid = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_txtid",b4xmainpage._txtid);
 //BA.debugLineNum = 16;BA.debugLine="Private txtApellidos As B4XFloatTextField";
b4xmainpage._txtapellidos = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_txtapellidos",b4xmainpage._txtapellidos);
 //BA.debugLineNum = 17;BA.debugLine="Private txtTeléfono As B4XFloatTextField";
b4xmainpage._txtteléfono = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_txtteléfono",b4xmainpage._txtteléfono);
 //BA.debugLineNum = 18;BA.debugLine="Private dialog As B4XDialog";
b4xmainpage._dialog = RemoteObject.createNew ("b4j.example.b4xdialog");__ref.setField("_dialog",b4xmainpage._dialog);
 //BA.debugLineNum = 20;BA.debugLine="Private ficheroKVS  As KeyValueStore";
b4xmainpage._ficherokvs = RemoteObject.createNew ("b4j.example.keyvaluestore");__ref.setField("_ficherokvs",b4xmainpage._ficherokvs);
 //BA.debugLineNum = 21;BA.debugLine="Private btnCargarFichero As Button";
b4xmainpage._btncargarfichero = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btncargarfichero",b4xmainpage._btncargarfichero);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _crearlista(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("crearLista (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("crearlista")) { return __ref.runUserSub(false, "b4xmainpage","crearlista", __ref);}
RemoteObject _cli = RemoteObject.declareNull("b4j.example.b4xmainpage._cliente");
 BA.debugLineNum = 133;BA.debugLine="Private Sub crearLista";
Debug.ShouldStop(16);
 BA.debugLineNum = 134;BA.debugLine="Private cli As Cliente";
Debug.ShouldStop(32);
_cli = RemoteObject.createNew ("b4j.example.b4xmainpage._cliente");Debug.locals.put("cli", _cli);
 BA.debugLineNum = 135;BA.debugLine="cli.Initialize";
Debug.ShouldStop(64);
_cli.runVoidMethod ("Initialize");
 BA.debugLineNum = 136;BA.debugLine="cli.ID = \"A3473\"";
Debug.ShouldStop(128);
_cli.setField ("ID" /*RemoteObject*/ ,BA.ObjectToString("A3473"));
 BA.debugLineNum = 137;BA.debugLine="cli.Nombre = \"John\"";
Debug.ShouldStop(256);
_cli.setField ("Nombre" /*RemoteObject*/ ,BA.ObjectToString("John"));
 BA.debugLineNum = 138;BA.debugLine="cli.Apellidos = \"Smith\"";
Debug.ShouldStop(512);
_cli.setField ("Apellidos" /*RemoteObject*/ ,BA.ObjectToString("Smith"));
 BA.debugLineNum = 139;BA.debugLine="cli.Teléfono = \"4563454\"";
Debug.ShouldStop(1024);
_cli.setField ("Teléfono" /*RemoteObject*/ ,BA.ObjectToString("4563454"));
 BA.debugLineNum = 140;BA.debugLine="Clientes.Add(cli)";
Debug.ShouldStop(2048);
__ref.getField(false,"_clientes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cli)));
 BA.debugLineNum = 142;BA.debugLine="Private cli As Cliente";
Debug.ShouldStop(8192);
_cli = RemoteObject.createNew ("b4j.example.b4xmainpage._cliente");Debug.locals.put("cli", _cli);
 BA.debugLineNum = 143;BA.debugLine="cli.Initialize";
Debug.ShouldStop(16384);
_cli.runVoidMethod ("Initialize");
 BA.debugLineNum = 144;BA.debugLine="cli.ID = \"X51462\"";
Debug.ShouldStop(32768);
_cli.setField ("ID" /*RemoteObject*/ ,BA.ObjectToString("X51462"));
 BA.debugLineNum = 145;BA.debugLine="cli.Nombre = \"Paraskevas\"";
Debug.ShouldStop(65536);
_cli.setField ("Nombre" /*RemoteObject*/ ,BA.ObjectToString("Paraskevas"));
 BA.debugLineNum = 146;BA.debugLine="cli.Apellidos = \"Xatjixaralampos\"";
Debug.ShouldStop(131072);
_cli.setField ("Apellidos" /*RemoteObject*/ ,BA.ObjectToString("Xatjixaralampos"));
 BA.debugLineNum = 147;BA.debugLine="cli.Teléfono = \"612978323\"";
Debug.ShouldStop(262144);
_cli.setField ("Teléfono" /*RemoteObject*/ ,BA.ObjectToString("612978323"));
 BA.debugLineNum = 148;BA.debugLine="Clientes.Add(cli)";
Debug.ShouldStop(524288);
__ref.getField(false,"_clientes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cli)));
 BA.debugLineNum = 151;BA.debugLine="Private cli As Cliente";
Debug.ShouldStop(4194304);
_cli = RemoteObject.createNew ("b4j.example.b4xmainpage._cliente");Debug.locals.put("cli", _cli);
 BA.debugLineNum = 152;BA.debugLine="cli.Initialize";
Debug.ShouldStop(8388608);
_cli.runVoidMethod ("Initialize");
 BA.debugLineNum = 153;BA.debugLine="cli.ID = \"B1753\"";
Debug.ShouldStop(16777216);
_cli.setField ("ID" /*RemoteObject*/ ,BA.ObjectToString("B1753"));
 BA.debugLineNum = 154;BA.debugLine="cli.Nombre = \"Selim\"";
Debug.ShouldStop(33554432);
_cli.setField ("Nombre" /*RemoteObject*/ ,BA.ObjectToString("Selim"));
 BA.debugLineNum = 155;BA.debugLine="cli.Apellidos = \"Al Huarizmi\"";
Debug.ShouldStop(67108864);
_cli.setField ("Apellidos" /*RemoteObject*/ ,BA.ObjectToString("Al Huarizmi"));
 BA.debugLineNum = 156;BA.debugLine="cli.Teléfono = \"6532578\"";
Debug.ShouldStop(134217728);
_cli.setField ("Teléfono" /*RemoteObject*/ ,BA.ObjectToString("6532578"));
 BA.debugLineNum = 157;BA.debugLine="Clientes.Add(cli)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_clientes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cli)));
 BA.debugLineNum = 159;BA.debugLine="Private cli As Cliente";
Debug.ShouldStop(1073741824);
_cli = RemoteObject.createNew ("b4j.example.b4xmainpage._cliente");Debug.locals.put("cli", _cli);
 BA.debugLineNum = 160;BA.debugLine="cli.Initialize";
Debug.ShouldStop(-2147483648);
_cli.runVoidMethod ("Initialize");
 BA.debugLineNum = 161;BA.debugLine="cli.ID = \"C6544\"";
Debug.ShouldStop(1);
_cli.setField ("ID" /*RemoteObject*/ ,BA.ObjectToString("C6544"));
 BA.debugLineNum = 162;BA.debugLine="cli.Nombre = \"Mateo\"";
Debug.ShouldStop(2);
_cli.setField ("Nombre" /*RemoteObject*/ ,BA.ObjectToString("Mateo"));
 BA.debugLineNum = 163;BA.debugLine="cli.Apellidos = \"Sandor\"";
Debug.ShouldStop(4);
_cli.setField ("Apellidos" /*RemoteObject*/ ,BA.ObjectToString("Sandor"));
 BA.debugLineNum = 164;BA.debugLine="cli.Teléfono = \"7345346\"";
Debug.ShouldStop(8);
_cli.setField ("Teléfono" /*RemoteObject*/ ,BA.ObjectToString("7345346"));
 BA.debugLineNum = 165;BA.debugLine="Clientes.Add(cli)";
Debug.ShouldStop(16);
__ref.getField(false,"_clientes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cli)));
 BA.debugLineNum = 167;BA.debugLine="Private cli As Cliente";
Debug.ShouldStop(64);
_cli = RemoteObject.createNew ("b4j.example.b4xmainpage._cliente");Debug.locals.put("cli", _cli);
 BA.debugLineNum = 168;BA.debugLine="cli.Initialize";
Debug.ShouldStop(128);
_cli.runVoidMethod ("Initialize");
 BA.debugLineNum = 169;BA.debugLine="cli.ID = \"C6323\"";
Debug.ShouldStop(256);
_cli.setField ("ID" /*RemoteObject*/ ,BA.ObjectToString("C6323"));
 BA.debugLineNum = 170;BA.debugLine="cli.Nombre = \"Lucía\"";
Debug.ShouldStop(512);
_cli.setField ("Nombre" /*RemoteObject*/ ,BA.ObjectToString("Lucía"));
 BA.debugLineNum = 171;BA.debugLine="cli.Apellidos = \"Graham\"";
Debug.ShouldStop(1024);
_cli.setField ("Apellidos" /*RemoteObject*/ ,BA.ObjectToString("Graham"));
 BA.debugLineNum = 172;BA.debugLine="cli.Teléfono = \"1231345\"";
Debug.ShouldStop(2048);
_cli.setField ("Teléfono" /*RemoteObject*/ ,BA.ObjectToString("1231345"));
 BA.debugLineNum = 173;BA.debugLine="Clientes.Add(cli)";
Debug.ShouldStop(4096);
__ref.getField(false,"_clientes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cli)));
 BA.debugLineNum = 175;BA.debugLine="Private cli As Cliente";
Debug.ShouldStop(16384);
_cli = RemoteObject.createNew ("b4j.example.b4xmainpage._cliente");Debug.locals.put("cli", _cli);
 BA.debugLineNum = 176;BA.debugLine="cli.Initialize";
Debug.ShouldStop(32768);
_cli.runVoidMethod ("Initialize");
 BA.debugLineNum = 177;BA.debugLine="cli.ID = \"F1462\"";
Debug.ShouldStop(65536);
_cli.setField ("ID" /*RemoteObject*/ ,BA.ObjectToString("F1462"));
 BA.debugLineNum = 178;BA.debugLine="cli.Nombre = \"Noam\"";
Debug.ShouldStop(131072);
_cli.setField ("Nombre" /*RemoteObject*/ ,BA.ObjectToString("Noam"));
 BA.debugLineNum = 179;BA.debugLine="cli.Apellidos = \"Bell\"";
Debug.ShouldStop(262144);
_cli.setField ("Apellidos" /*RemoteObject*/ ,BA.ObjectToString("Bell"));
 BA.debugLineNum = 180;BA.debugLine="cli.Teléfono = \"6978323\"";
Debug.ShouldStop(524288);
_cli.setField ("Teléfono" /*RemoteObject*/ ,BA.ObjectToString("6978323"));
 BA.debugLineNum = 181;BA.debugLine="Clientes.Add(cli)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_clientes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cli)));
 BA.debugLineNum = 182;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _customlistview1_itemclick(RemoteObject __ref,RemoteObject _índice,RemoteObject _valor) throws Exception{
try {
		Debug.PushSubsStack("CustomListView1_ItemClick (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("customlistview1_itemclick")) { return __ref.runUserSub(false, "b4xmainpage","customlistview1_itemclick", __ref, _índice, _valor);}
Debug.locals.put("Índice", _índice);
Debug.locals.put("Valor", _valor);
 BA.debugLineNum = 91;BA.debugLine="Private Sub CustomListView1_ItemClick (Índice As I";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="borrarRegistro(Índice, Valor)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_borrarregistro" /*void*/ ,(Object)(_índice),(Object)(_valor));
 BA.debugLineNum = 93;BA.debugLine="Log(Índice & \" \" & Valor)";
Debug.ShouldStop(268435456);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(_índice,RemoteObject.createImmutable(" "),_valor)));
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
public static RemoteObject  _guardarfichero(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("guardarFichero (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("guardarfichero")) { return __ref.runUserSub(false, "b4xmainpage","guardarfichero", __ref);}
int _i = 0;
RemoteObject _clientesalvado = RemoteObject.declareNull("b4j.example.b4xmainpage._cliente");
 BA.debugLineNum = 190;BA.debugLine="Private Sub guardarFichero";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 191;BA.debugLine="File.MakeDir(File.DirTemp, \"tema18\")";
Debug.ShouldStop(1073741824);
b4xmainpage.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(RemoteObject.createImmutable("tema18")));
 BA.debugLineNum = 192;BA.debugLine="ficheroKVS.Initialize(File.DirTemp & \"tema18\", \"e";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_ficherokvs" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.concat(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirTemp"),RemoteObject.createImmutable("tema18"))),(Object)(RemoteObject.createImmutable("ej1.dat")));
 BA.debugLineNum = 193;BA.debugLine="Log(File. DirTemp  & \"tema18\")";
Debug.ShouldStop(1);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirTemp"),RemoteObject.createImmutable("tema18"))));
 BA.debugLineNum = 194;BA.debugLine="For i = 0 To Clientes.Size - 1";
Debug.ShouldStop(2);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_clientes" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 195;BA.debugLine="Private clienteSalvado As Cliente";
Debug.ShouldStop(4);
_clientesalvado = RemoteObject.createNew ("b4j.example.b4xmainpage._cliente");Debug.locals.put("clienteSalvado", _clientesalvado);
 BA.debugLineNum = 196;BA.debugLine="clienteSalvado = Clientes.Get(i)";
Debug.ShouldStop(8);
_clientesalvado = (__ref.getField(false,"_clientes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("clienteSalvado", _clientesalvado);
 BA.debugLineNum = 197;BA.debugLine="ficheroKVS.Put(clienteSalvado.ID, clienteSalvado";
Debug.ShouldStop(16);
__ref.getField(false,"_ficherokvs" /*RemoteObject*/ ).runClassMethod (b4j.example.keyvaluestore.class, "_put" /*RemoteObject*/ ,(Object)(_clientesalvado.getField(true,"ID" /*RemoteObject*/ )),(Object)((_clientesalvado)));
 }
}Debug.locals.put("i", _i);
;
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(8388608);
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
public static RemoteObject  _logcliente(RemoteObject __ref,RemoteObject _cli) throws Exception{
try {
		Debug.PushSubsStack("LogCliente (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("logcliente")) { return __ref.runUserSub(false, "b4xmainpage","logcliente", __ref, _cli);}
Debug.locals.put("cli", _cli);
 BA.debugLineNum = 83;BA.debugLine="Private Sub LogCliente(cli As Cliente)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="Log(cli.ID)";
Debug.ShouldStop(524288);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(_cli.getField(true,"ID" /*RemoteObject*/ )));
 BA.debugLineNum = 85;BA.debugLine="Log(cli.Nombre)";
Debug.ShouldStop(1048576);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(_cli.getField(true,"Nombre" /*RemoteObject*/ )));
 BA.debugLineNum = 86;BA.debugLine="Log(cli.Apellidos)";
Debug.ShouldStop(2097152);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(_cli.getField(true,"Apellidos" /*RemoteObject*/ )));
 BA.debugLineNum = 87;BA.debugLine="Log(cli.Teléfono)";
Debug.ShouldStop(4194304);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(_cli.getField(true,"Teléfono" /*RemoteObject*/ )));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
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