package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xpagereturn_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xpagereturn) ","b4xpagereturn",5,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xpagereturn","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 19;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Root = Root1";
Debug.ShouldStop(524288);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 22;BA.debugLine="Root.LoadLayout(\"frmReturn\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("frmReturn")),__ref.getField(false, "ba"));
 BA.debugLineNum = 23;BA.debugLine="cmbEstudiante.SetItems(mostrarcmbEstudiante)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_cmbestudiante" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xcombobox.class, "_setitems" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.b4xpagereturn.class, "_mostrarcmbestudiante" /*RemoteObject*/ )));
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
public static RemoteObject  _btndevolver_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnDevolver_Click (b4xpagereturn) ","b4xpagereturn",5,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("btndevolver_click")) { return __ref.runUserSub(false, "b4xpagereturn","btndevolver_click", __ref);}
 BA.debugLineNum = 112;BA.debugLine="Private Sub btnDevolver_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="If idEstudianteElegido <> \"\" And idLibroElegido <";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_idestudianteelegido" /*RemoteObject*/ ),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",__ref.getField(true,"_idlibroelegido" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 114;BA.debugLine="devolverLibro";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.example.b4xpagereturn.class, "_devolverlibro" /*RemoteObject*/ );
 };
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _cargarlistalibros(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cargarListaLibros (b4xpagereturn) ","b4xpagereturn",5,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("cargarlistalibros")) { __ref.runUserSub(false, "b4xpagereturn","cargarlistalibros", __ref); return;}
ResumableSub_cargarListaLibros rsub = new ResumableSub_cargarListaLibros(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_cargarListaLibros extends BA.ResumableSub {
public ResumableSub_cargarListaLibros(b4j.example.b4xpagereturn parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xpagereturn parent;
RemoteObject _studentfile = RemoteObject.declareNull("b4j.example.keyvaluestore");
RemoteObject _stmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tplibro = RemoteObject.declareNull("b4j.example.b4xmainpage._libro");
RemoteObject _s1 = RemoteObject.createImmutable("");
RemoteObject _s2 = RemoteObject.createImmutable("");
RemoteObject _s3 = RemoteObject.createImmutable("");
RemoteObject _s4 = RemoteObject.createImmutable("");
RemoteObject _s5 = RemoteObject.createImmutable("");
RemoteObject _s6 = RemoteObject.createImmutable("");
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("cargarListaLibros (b4xpagereturn) ","b4xpagereturn",5,__ref.getField(false, "ba"),__ref,55);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 56;BA.debugLine="Private studentFile As KeyValueStore";
Debug.ShouldStop(8388608);
_studentfile = RemoteObject.createNew ("b4j.example.keyvaluestore");Debug.locals.put("studentFile", _studentfile);
 BA.debugLineNum = 57;BA.debugLine="Private stMAp As Map";
Debug.ShouldStop(16777216);
_stmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("stMAp", _stmap);
 BA.debugLineNum = 58;BA.debugLine="stMAp.Initialize";
Debug.ShouldStop(33554432);
_stmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 59;BA.debugLine="Log(\"comprueba la existencia de \" & idEstudianteE";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("comprueba la existencia de "),__ref.getField(true,"_idestudianteelegido" /*RemoteObject*/ ),RemoteObject.createImmutable(".dat "))));
 BA.debugLineNum = 60;BA.debugLine="If File.Exists(File.DirTemp, idEstudianteElegido";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 14;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(RemoteObject.concat(__ref.getField(true,"_idestudianteelegido" /*RemoteObject*/ ),RemoteObject.createImmutable(".dat")))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 61;BA.debugLine="studentFile.Initialize(File.DirTemp, idEstudiant";
Debug.ShouldStop(268435456);
_studentfile.runClassMethod (b4j.example.keyvaluestore.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(RemoteObject.concat(__ref.getField(true,"_idestudianteelegido" /*RemoteObject*/ ),RemoteObject.createImmutable(".dat"))));
 BA.debugLineNum = 62;BA.debugLine="Wait For (studentFile.GetMapAsync(studentFile.Li";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xpagereturn", "cargarlistalibros"), _studentfile.runClassMethod (b4j.example.keyvaluestore.class, "_getmapasync" /*RemoteObject*/ ,(Object)(_studentfile.runClassMethod (b4j.example.keyvaluestore.class, "_listkeys" /*RemoteObject*/ ))));
this.state = 15;
return;
case 15:
//C
this.state = 4;
_stmap = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("stMAp", _stmap);
;
 BA.debugLineNum = 63;BA.debugLine="Log(\"El fichero de estudiante existe\")";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("El fichero de estudiante existe")));
 BA.debugLineNum = 64;BA.debugLine="For Each tpLibro As Libro In B4XPages.MainPage.m";
Debug.ShouldStop(-2147483648);
if (true) break;

case 4:
//for
this.state = 11;
group9 = parent._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_mapalibros" /*RemoteObject*/ ).runMethod(false,"Values");
index9 = 0;
groupLen9 = group9.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("tpLibro", _tplibro);
this.state = 16;
if (true) break;

case 16:
//C
this.state = 11;
if (index9 < groupLen9) {
this.state = 6;
_tplibro = (group9.runMethod(false,"Get",index9));Debug.locals.put("tpLibro", _tplibro);}
if (true) break;

case 17:
//C
this.state = 16;
index9++;
Debug.locals.put("tpLibro", _tplibro);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 65;BA.debugLine="If stMAp.ContainsKey(tpLibro.ID) Then";
Debug.ShouldStop(1);
if (true) break;

case 7:
//if
this.state = 10;
if (_stmap.runMethod(true,"ContainsKey",(Object)((_tplibro.getField(true,"ID" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 66;BA.debugLine="Private s1, s2, s3, s4, s5, s6, str As String";
Debug.ShouldStop(2);
_s1 = RemoteObject.createImmutable("");Debug.locals.put("s1", _s1);
_s2 = RemoteObject.createImmutable("");Debug.locals.put("s2", _s2);
_s3 = RemoteObject.createImmutable("");Debug.locals.put("s3", _s3);
_s4 = RemoteObject.createImmutable("");Debug.locals.put("s4", _s4);
_s5 = RemoteObject.createImmutable("");Debug.locals.put("s5", _s5);
_s6 = RemoteObject.createImmutable("");Debug.locals.put("s6", _s6);
_str = RemoteObject.createImmutable("");Debug.locals.put("str", _str);
 BA.debugLineNum = 67;BA.debugLine="s1 = B4XPages.MainPage.pgLibros.anadirEspacios";
Debug.ShouldStop(4);
_s1 = parent._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pglibros" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpagebooks.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(_tplibro.getField(true,"ID" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("s1", _s1);
 BA.debugLineNum = 68;BA.debugLine="s2 = B4XPages.MainPage.pgLibros.anadirEspacios";
Debug.ShouldStop(8);
_s2 = parent._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pglibros" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpagebooks.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(_tplibro.getField(true,"Título" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("s2", _s2);
 BA.debugLineNum = 69;BA.debugLine="s3 = B4XPages.MainPage.pgLibros.anadirEspacios";
Debug.ShouldStop(16);
_s3 = parent._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pglibros" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpagebooks.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(_tplibro.getField(true,"Escritor" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("s3", _s3);
 BA.debugLineNum = 70;BA.debugLine="s4 = B4XPages.MainPage.pgLibros.anadirEspacios";
Debug.ShouldStop(32);
_s4 = parent._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pglibros" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpagebooks.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(_tplibro.getField(true,"Ano" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 4)));Debug.locals.put("s4", _s4);
 BA.debugLineNum = 71;BA.debugLine="s5 = B4XPages.MainPage.pgLibros.anadirEspacios";
Debug.ShouldStop(64);
_s5 = parent._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pglibros" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpagebooks.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(_tplibro.getField(true,"Editorial" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("s5", _s5);
 BA.debugLineNum = 72;BA.debugLine="s6 = B4XPages.MainPage.pgLibros.anadirEspacios";
Debug.ShouldStop(128);
_s6 = parent._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_pglibros" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xpagebooks.class, "_anadirespacios" /*RemoteObject*/ ,(Object)(BA.NumberToString(_tplibro.getField(true,"Estante" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, 6)));Debug.locals.put("s6", _s6);
 BA.debugLineNum = 74;BA.debugLine="str = $\"${s1}${s2}${s3}${s4}${s5}${s6}\"$";
Debug.ShouldStop(512);
_str = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s1))),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s2))),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s3))),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s4))),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s5))),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s6))),RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 BA.debugLineNum = 75;BA.debugLine="clvLibros.AddTextItem(str, tpLibro.ID)";
Debug.ShouldStop(1024);
__ref.getField(false,"_clvlibros" /*RemoteObject*/ ).runVoidMethod ("_addtextitem",(Object)((_str)),(Object)((_tplibro.getField(true,"ID" /*RemoteObject*/ ))));
 if (true) break;

case 10:
//C
this.state = 17;
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
Debug.locals.put("tpLibro", _tplibro);
;
 BA.debugLineNum = 78;BA.debugLine="studentFile.Close";
Debug.ShouldStop(8192);
_studentfile.runClassMethod (b4j.example.keyvaluestore.class, "_close" /*RemoteObject*/ );
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 80;BA.debugLine="clvLibros.Clear";
Debug.ShouldStop(32768);
__ref.getField(false,"_clvlibros" /*RemoteObject*/ ).runVoidMethod ("_clear");
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
public static void  _complete(RemoteObject __ref,RemoteObject _stmap) throws Exception{
}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
b4xpagereturn._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xpagereturn._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xpagereturn._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xpagereturn._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private btnDevolver As Button";
b4xpagereturn._btndevolver = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btndevolver",b4xpagereturn._btndevolver);
 //BA.debugLineNum = 6;BA.debugLine="Private cmbEstudiante As B4XComboBox";
b4xpagereturn._cmbestudiante = RemoteObject.createNew ("b4j.example.b4xcombobox");__ref.setField("_cmbestudiante",b4xpagereturn._cmbestudiante);
 //BA.debugLineNum = 7;BA.debugLine="Private clvLibros As CustomListView";
b4xpagereturn._clvlibros = RemoteObject.createNew ("b4j.example.customlistview");__ref.setField("_clvlibros",b4xpagereturn._clvlibros);
 //BA.debugLineNum = 8;BA.debugLine="Private libroElegido As Int = -1";
b4xpagereturn._libroelegido = BA.numberCast(int.class, -(double) (0 + 1));__ref.setField("_libroelegido",b4xpagereturn._libroelegido);
 //BA.debugLineNum = 9;BA.debugLine="Private idEstudianteElegido As String =  \"\"";
b4xpagereturn._idestudianteelegido = BA.ObjectToString("");__ref.setField("_idestudianteelegido",b4xpagereturn._idestudianteelegido);
 //BA.debugLineNum = 10;BA.debugLine="Private idLibroElegido As String  =  \"\"";
b4xpagereturn._idlibroelegido = BA.ObjectToString("");__ref.setField("_idlibroelegido",b4xpagereturn._idlibroelegido);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clvlibros_itemclick(RemoteObject __ref,RemoteObject _índice,RemoteObject _valor) throws Exception{
try {
		Debug.PushSubsStack("clvLibros_ItemClick (b4xpagereturn) ","b4xpagereturn",5,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("clvlibros_itemclick")) { return __ref.runUserSub(false, "b4xpagereturn","clvlibros_itemclick", __ref, _índice, _valor);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Índice", _índice);
Debug.locals.put("Valor", _valor);
 BA.debugLineNum = 88;BA.debugLine="Private Sub clvLibros_ItemClick (Índice As Int, Va";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="If libroElegido = -1 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_libroelegido" /*RemoteObject*/ ),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 90;BA.debugLine="Dim p As B4XView = clvLibros.GetPanel(Índice)";
Debug.ShouldStop(33554432);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_clvlibros" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_índice));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 91;BA.debugLine="p.GetView(0).Color = xui.Color_Blue";
Debug.ShouldStop(67108864);
_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue"));
 BA.debugLineNum = 92;BA.debugLine="libroElegido = Índice";
Debug.ShouldStop(134217728);
__ref.setField ("_libroelegido" /*RemoteObject*/ ,_índice);
 BA.debugLineNum = 93;BA.debugLine="idLibroElegido = clvLibros.GetValue(libroElegido";
Debug.ShouldStop(268435456);
__ref.setField ("_idlibroelegido" /*RemoteObject*/ ,BA.ObjectToString(__ref.getField(false,"_clvlibros" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(__ref.getField(true,"_libroelegido" /*RemoteObject*/ )))));
 }else {
 BA.debugLineNum = 95;BA.debugLine="Dim p As B4XView = clvLibros.GetPanel(libroElegi";
Debug.ShouldStop(1073741824);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_clvlibros" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(__ref.getField(true,"_libroelegido" /*RemoteObject*/ )));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 96;BA.debugLine="p.GetView(0).Color = xui.Color_White";
Debug.ShouldStop(-2147483648);
_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 97;BA.debugLine="If libroElegido = Índice  Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_libroelegido" /*RemoteObject*/ ),BA.numberCast(double.class, _índice))) { 
 BA.debugLineNum = 98;BA.debugLine="libroElegido = -1";
Debug.ShouldStop(2);
__ref.setField ("_libroelegido" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 99;BA.debugLine="idLibroElegido = \"\"";
Debug.ShouldStop(4);
__ref.setField ("_idlibroelegido" /*RemoteObject*/ ,BA.ObjectToString(""));
 }else {
 BA.debugLineNum = 101;BA.debugLine="Dim p As B4XView = clvLibros.GetPanel(Índice)";
Debug.ShouldStop(16);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_clvlibros" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(_índice));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 102;BA.debugLine="p.GetView(0).Color = xui.Color_Blue";
Debug.ShouldStop(32);
_p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue"));
 BA.debugLineNum = 103;BA.debugLine="libroElegido = Índice";
Debug.ShouldStop(64);
__ref.setField ("_libroelegido" /*RemoteObject*/ ,_índice);
 BA.debugLineNum = 104;BA.debugLine="idLibroElegido = clvLibros.GetValue(libroElegid";
Debug.ShouldStop(128);
__ref.setField ("_idlibroelegido" /*RemoteObject*/ ,BA.ObjectToString(__ref.getField(false,"_clvlibros" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(__ref.getField(true,"_libroelegido" /*RemoteObject*/ )))));
 };
 };
 BA.debugLineNum = 108;BA.debugLine="Log(libroElegido)";
Debug.ShouldStop(2048);
b4xpagereturn.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(__ref.getField(true,"_libroelegido" /*RemoteObject*/ ))));
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cmbestudiante_selectedindexchanged(RemoteObject __ref,RemoteObject _índice) throws Exception{
try {
		Debug.PushSubsStack("cmbEstudiante_SelectedIndexChanged (b4xpagereturn) ","b4xpagereturn",5,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("cmbestudiante_selectedindexchanged")) { return __ref.runUserSub(false, "b4xpagereturn","cmbestudiante_selectedindexchanged", __ref, _índice);}
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("Índice", _índice);
 BA.debugLineNum = 42;BA.debugLine="Private Sub cmbEstudiante_SelectedIndexChanged (Ín";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="idEstudianteElegido = \"\"";
Debug.ShouldStop(1024);
__ref.setField ("_idestudianteelegido" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 44;BA.debugLine="Private str As String = cmbEstudiante.GetItem(Índ";
Debug.ShouldStop(2048);
_str = __ref.getField(false,"_cmbestudiante" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xcombobox.class, "_getitem" /*RemoteObject*/ ,(Object)(_índice));Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 45;BA.debugLine="Private i As Int = 0";
Debug.ShouldStop(4096);
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 46;BA.debugLine="Do While str.CharAt(i) <> \" \"";
Debug.ShouldStop(8192);
while (RemoteObject.solveBoolean("!",_str.runMethod(true,"charAt",(Object)(_i)),BA.ObjectToChar(" "))) {
 BA.debugLineNum = 47;BA.debugLine="idEstudianteElegido = idEstudianteElegido & str.";
Debug.ShouldStop(16384);
__ref.setField ("_idestudianteelegido" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_idestudianteelegido" /*RemoteObject*/ ),_str.runMethod(true,"charAt",(Object)(_i))));
 BA.debugLineNum = 48;BA.debugLine="i = i + 1";
Debug.ShouldStop(32768);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
;
 BA.debugLineNum = 50;BA.debugLine="Log(idEstudianteElegido)";
Debug.ShouldStop(131072);
b4xpagereturn.__c.runVoidMethod ("Log",(Object)(__ref.getField(true,"_idestudianteelegido" /*RemoteObject*/ )));
 BA.debugLineNum = 51;BA.debugLine="cargarListaLibros";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.example.b4xpagereturn.class, "_cargarlistalibros" /*void*/ );
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _devolverlibro(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("devolverLibro (b4xpagereturn) ","b4xpagereturn",5,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("devolverlibro")) { return __ref.runUserSub(false, "b4xpagereturn","devolverlibro", __ref);}
RemoteObject _nombrefichest = RemoteObject.createImmutable("");
RemoteObject _fichestudiante = RemoteObject.declareNull("b4j.example.keyvaluestore");
 BA.debugLineNum = 119;BA.debugLine="Public Sub devolverLibro";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="Private nombreFichEst As String = idEstudianteEle";
Debug.ShouldStop(8388608);
_nombrefichest = RemoteObject.concat(__ref.getField(true,"_idestudianteelegido" /*RemoteObject*/ ),RemoteObject.createImmutable(".dat"));Debug.locals.put("nombreFichEst", _nombrefichest);Debug.locals.put("nombreFichEst", _nombrefichest);
 BA.debugLineNum = 121;BA.debugLine="Log(\"Nombre del fichero: \" & nombreFichEst)";
Debug.ShouldStop(16777216);
b4xpagereturn.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Nombre del fichero: "),_nombrefichest)));
 BA.debugLineNum = 122;BA.debugLine="Private fichEstudiante As KeyValueStore";
Debug.ShouldStop(33554432);
_fichestudiante = RemoteObject.createNew ("b4j.example.keyvaluestore");Debug.locals.put("fichEstudiante", _fichestudiante);
 BA.debugLineNum = 124;BA.debugLine="fichEstudiante.Initialize(File.DirTemp, nombreFic";
Debug.ShouldStop(134217728);
_fichestudiante.runClassMethod (b4j.example.keyvaluestore.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(b4xpagereturn.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(_nombrefichest));
 BA.debugLineNum = 125;BA.debugLine="fichEstudiante.Remove(idLibroElegido)";
Debug.ShouldStop(268435456);
_fichestudiante.runClassMethod (b4j.example.keyvaluestore.class, "_remove" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_idlibroelegido" /*RemoteObject*/ )));
 BA.debugLineNum = 126;BA.debugLine="clvLibros.RemoveAt(libroElegido)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_clvlibros" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(__ref.getField(true,"_libroelegido" /*RemoteObject*/ )));
 BA.debugLineNum = 127;BA.debugLine="clvLibros.Refresh";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_clvlibros" /*RemoteObject*/ ).runVoidMethod ("_refresh");
 BA.debugLineNum = 128;BA.debugLine="libroElegido = -1";
Debug.ShouldStop(-2147483648);
__ref.setField ("_libroelegido" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 129;BA.debugLine="If clvLibros.Size = 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_clvlibros" /*RemoteObject*/ ).runMethod(true,"_getsize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 130;BA.debugLine="fichEstudiante.Close";
Debug.ShouldStop(2);
_fichestudiante.runClassMethod (b4j.example.keyvaluestore.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 131;BA.debugLine="Log(\"Fichero vacío\")";
Debug.ShouldStop(4);
b4xpagereturn.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Fichero vacío")));
 BA.debugLineNum = 132;BA.debugLine="File.Delete(File.DirTemp, idEstudianteElegido &";
Debug.ShouldStop(8);
b4xpagereturn.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(b4xpagereturn.__c.getField(false,"File").runMethod(true,"getDirTemp")),(Object)(RemoteObject.concat(__ref.getField(true,"_idestudianteelegido" /*RemoteObject*/ ),RemoteObject.createImmutable(".dat"))));
 }else {
 BA.debugLineNum = 134;BA.debugLine="fichEstudiante.Close";
Debug.ShouldStop(32);
_fichestudiante.runClassMethod (b4j.example.keyvaluestore.class, "_close" /*RemoteObject*/ );
 };
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Initialize (b4xpagereturn) ","b4xpagereturn",5,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xpagereturn","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="Return Me";
Debug.ShouldStop(16384);
if (true) return __ref;
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("mostrarcmbEstudiante (b4xpagereturn) ","b4xpagereturn",5,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("mostrarcmbestudiante")) { return __ref.runUserSub(false, "b4xpagereturn","mostrarcmbestudiante", __ref);}
RemoteObject _nuevalista = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _clave = RemoteObject.createImmutable("");
RemoteObject _tp = RemoteObject.declareNull("b4j.example.b4xmainpage._estudiante");
 BA.debugLineNum = 27;BA.debugLine="Private Sub mostrarcmbEstudiante As List";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="Private nuevaLista As List";
Debug.ShouldStop(134217728);
_nuevalista = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("nuevaLista", _nuevalista);
 BA.debugLineNum = 29;BA.debugLine="nuevaLista.Initialize";
Debug.ShouldStop(268435456);
_nuevalista.runVoidMethod ("Initialize");
 BA.debugLineNum = 31;BA.debugLine="For Each clave As String In B4XPages.MainPage.map";
Debug.ShouldStop(1073741824);
{
final RemoteObject group3 = b4xpagereturn._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_mapaestudiantes" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_clave = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("clave", _clave);
Debug.locals.put("clave", _clave);
 BA.debugLineNum = 32;BA.debugLine="Dim tp As Estudiante";
Debug.ShouldStop(-2147483648);
_tp = RemoteObject.createNew ("b4j.example.b4xmainpage._estudiante");Debug.locals.put("tp", _tp);
 BA.debugLineNum = 33;BA.debugLine="tp = B4XPages.MainPage.mapaEstudiantes.Get(clave";
Debug.ShouldStop(1);
_tp = (b4xpagereturn._b4xpages.runMethod(false,"_mainpage" /*RemoteObject*/ ).getField(false,"_mapaestudiantes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_clave))));Debug.locals.put("tp", _tp);
 BA.debugLineNum = 35;BA.debugLine="nuevaLista.Add($\"${clave} ${tp.Nombre} ${tp.Apel";
Debug.ShouldStop(4);
_nuevalista.runVoidMethod ("Add",(Object)(((RemoteObject.concat(RemoteObject.createImmutable(""),b4xpagereturn.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clave))),RemoteObject.createImmutable(" "),b4xpagereturn.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tp.getField(true,"Nombre" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),b4xpagereturn.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tp.getField(true,"Apellidos" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),b4xpagereturn.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tp.getField(true,"Clase" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 36;BA.debugLine="Log($\"${clave} ${tp.Nombre} ${tp.Apellidos} ${tp";
Debug.ShouldStop(8);
b4xpagereturn.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),b4xpagereturn.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_clave))),RemoteObject.createImmutable(" "),b4xpagereturn.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tp.getField(true,"Nombre" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),b4xpagereturn.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tp.getField(true,"Apellidos" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),b4xpagereturn.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tp.getField(true,"Clase" /*RemoteObject*/ )))),RemoteObject.createImmutable("")))));
 }
}Debug.locals.put("clave", _clave);
;
 BA.debugLineNum = 38;BA.debugLine="Return nuevaLista";
Debug.ShouldStop(32);
if (true) return _nuevalista;
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}