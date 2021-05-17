package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xpagereturn extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xpagereturn", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xpagereturn.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btndevolver = null;
public b4j.example.b4xcombobox _cmbestudiante = null;
public b4j.example.customlistview _clvlibros = null;
public int _libroelegido = 0;
public String _idestudianteelegido = "";
public String _idlibroelegido = "";
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4j.example.b4xpagereturn __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xpagereturn";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4j.example.b4xpagereturn __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagereturn";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="Root.LoadLayout(\"frmReturn\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("frmReturn",ba);
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="cmbEstudiante.SetItems(mostrarcmbEstudiante)";
__ref._cmbestudiante /*b4j.example.b4xcombobox*/ ._setitems /*String*/ (null,__ref._mostrarcmbestudiante /*anywheresoftware.b4a.objects.collections.List*/ (null));
RDebugUtils.currentLine=3473413;
 //BA.debugLineNum = 3473413;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _mostrarcmbestudiante(b4j.example.b4xpagereturn __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagereturn";
if (Debug.shouldDelegate(ba, "mostrarcmbestudiante", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "mostrarcmbestudiante", null));}
anywheresoftware.b4a.objects.collections.List _nuevalista = null;
String _clave = "";
b4j.example.b4xmainpage._estudiante _tp = null;
RDebugUtils.currentLine=57802752;
 //BA.debugLineNum = 57802752;BA.debugLine="Private Sub mostrarcmbEstudiante As List";
RDebugUtils.currentLine=57802753;
 //BA.debugLineNum = 57802753;BA.debugLine="Private nuevaLista As List";
_nuevalista = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=57802754;
 //BA.debugLineNum = 57802754;BA.debugLine="nuevaLista.Initialize";
_nuevalista.Initialize();
RDebugUtils.currentLine=57802756;
 //BA.debugLineNum = 57802756;BA.debugLine="For Each clave As String In B4XPages.MainPage.map";
{
final anywheresoftware.b4a.BA.IterableList group3 = _b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._mapaestudiantes /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_clave = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=57802757;
 //BA.debugLineNum = 57802757;BA.debugLine="Dim tp As Estudiante";
_tp = new b4j.example.b4xmainpage._estudiante();
RDebugUtils.currentLine=57802758;
 //BA.debugLineNum = 57802758;BA.debugLine="tp = B4XPages.MainPage.mapaEstudiantes.Get(clave";
_tp = (b4j.example.b4xmainpage._estudiante)(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._mapaestudiantes /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_clave)));
RDebugUtils.currentLine=57802760;
 //BA.debugLineNum = 57802760;BA.debugLine="nuevaLista.Add($\"${clave} ${tp.Nombre} ${tp.Apel";
_nuevalista.Add((Object)((""+__c.SmartStringFormatter("",(Object)(_clave))+" "+__c.SmartStringFormatter("",(Object)(_tp.Nombre /*String*/ ))+" "+__c.SmartStringFormatter("",(Object)(_tp.Apellidos /*String*/ ))+" "+__c.SmartStringFormatter("",(Object)(_tp.Clase /*String*/ ))+"")));
RDebugUtils.currentLine=57802761;
 //BA.debugLineNum = 57802761;BA.debugLine="Log($\"${clave} ${tp.Nombre} ${tp.Apellidos} ${tp";
__c.Log((""+__c.SmartStringFormatter("",(Object)(_clave))+" "+__c.SmartStringFormatter("",(Object)(_tp.Nombre /*String*/ ))+" "+__c.SmartStringFormatter("",(Object)(_tp.Apellidos /*String*/ ))+" "+__c.SmartStringFormatter("",(Object)(_tp.Clase /*String*/ ))+""));
 }
};
RDebugUtils.currentLine=57802763;
 //BA.debugLineNum = 57802763;BA.debugLine="Return nuevaLista";
if (true) return _nuevalista;
RDebugUtils.currentLine=57802764;
 //BA.debugLineNum = 57802764;BA.debugLine="End Sub";
return null;
}
public String  _btndevolver_click(b4j.example.b4xpagereturn __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagereturn";
if (Debug.shouldDelegate(ba, "btndevolver_click", false))
	 {return ((String) Debug.delegate(ba, "btndevolver_click", null));}
RDebugUtils.currentLine=34209792;
 //BA.debugLineNum = 34209792;BA.debugLine="Private Sub btnDevolver_Click";
RDebugUtils.currentLine=34209793;
 //BA.debugLineNum = 34209793;BA.debugLine="If idEstudianteElegido <> \"\" And idLibroElegido <";
if ((__ref._idestudianteelegido /*String*/ ).equals("") == false && (__ref._idlibroelegido /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=34209794;
 //BA.debugLineNum = 34209794;BA.debugLine="devolverLibro";
__ref._devolverlibro /*String*/ (null);
 };
RDebugUtils.currentLine=34209796;
 //BA.debugLineNum = 34209796;BA.debugLine="End Sub";
return "";
}
public String  _devolverlibro(b4j.example.b4xpagereturn __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagereturn";
if (Debug.shouldDelegate(ba, "devolverlibro", false))
	 {return ((String) Debug.delegate(ba, "devolverlibro", null));}
String _nombrefichest = "";
b4j.example.keyvaluestore _fichestudiante = null;
RDebugUtils.currentLine=35651584;
 //BA.debugLineNum = 35651584;BA.debugLine="Public Sub devolverLibro";
RDebugUtils.currentLine=35651585;
 //BA.debugLineNum = 35651585;BA.debugLine="Private nombreFichEst As String = idEstudianteEle";
_nombrefichest = __ref._idestudianteelegido /*String*/ +".dat";
RDebugUtils.currentLine=35651586;
 //BA.debugLineNum = 35651586;BA.debugLine="Log(\"Nombre del fichero: \" & nombreFichEst)";
__c.Log("Nombre del fichero: "+_nombrefichest);
RDebugUtils.currentLine=35651587;
 //BA.debugLineNum = 35651587;BA.debugLine="Private fichEstudiante As KeyValueStore";
_fichestudiante = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=35651589;
 //BA.debugLineNum = 35651589;BA.debugLine="fichEstudiante.Initialize(File.DirTemp, nombreFic";
_fichestudiante._initialize /*String*/ (null,ba,__c.File.getDirTemp(),_nombrefichest);
RDebugUtils.currentLine=35651590;
 //BA.debugLineNum = 35651590;BA.debugLine="fichEstudiante.Remove(idLibroElegido)";
_fichestudiante._remove /*String*/ (null,__ref._idlibroelegido /*String*/ );
RDebugUtils.currentLine=35651591;
 //BA.debugLineNum = 35651591;BA.debugLine="clvLibros.RemoveAt(libroElegido)";
__ref._clvlibros /*b4j.example.customlistview*/ ._removeat(__ref._libroelegido /*int*/ );
RDebugUtils.currentLine=35651592;
 //BA.debugLineNum = 35651592;BA.debugLine="clvLibros.Refresh";
__ref._clvlibros /*b4j.example.customlistview*/ ._refresh();
RDebugUtils.currentLine=35651593;
 //BA.debugLineNum = 35651593;BA.debugLine="libroElegido = -1";
__ref._libroelegido /*int*/  = (int) (-1);
RDebugUtils.currentLine=35651594;
 //BA.debugLineNum = 35651594;BA.debugLine="If clvLibros.Size = 0 Then";
if (__ref._clvlibros /*b4j.example.customlistview*/ ._getsize()==0) { 
RDebugUtils.currentLine=35651595;
 //BA.debugLineNum = 35651595;BA.debugLine="fichEstudiante.Close";
_fichestudiante._close /*String*/ (null);
RDebugUtils.currentLine=35651596;
 //BA.debugLineNum = 35651596;BA.debugLine="Log(\"Fichero vacío\")";
__c.Log("Fichero vacío");
RDebugUtils.currentLine=35651597;
 //BA.debugLineNum = 35651597;BA.debugLine="File.Delete(File.DirTemp, idEstudianteElegido &";
__c.File.Delete(__c.File.getDirTemp(),__ref._idestudianteelegido /*String*/ +".dat");
 }else {
RDebugUtils.currentLine=35651599;
 //BA.debugLineNum = 35651599;BA.debugLine="fichEstudiante.Close";
_fichestudiante._close /*String*/ (null);
 };
RDebugUtils.currentLine=35651602;
 //BA.debugLineNum = 35651602;BA.debugLine="End Sub";
return "";
}
public void  _cargarlistalibros(b4j.example.b4xpagereturn __ref) throws Exception{
RDebugUtils.currentModule="b4xpagereturn";
if (Debug.shouldDelegate(ba, "cargarlistalibros", false))
	 {Debug.delegate(ba, "cargarlistalibros", null); return;}
ResumableSub_cargarListaLibros rsub = new ResumableSub_cargarListaLibros(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_cargarListaLibros extends BA.ResumableSub {
public ResumableSub_cargarListaLibros(b4j.example.b4xpagereturn parent,b4j.example.b4xpagereturn __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xpagereturn __ref;
b4j.example.b4xpagereturn parent;
b4j.example.keyvaluestore _studentfile = null;
anywheresoftware.b4a.objects.collections.Map _stmap = null;
b4j.example.b4xmainpage._libro _tplibro = null;
String _s1 = "";
String _s2 = "";
String _s3 = "";
String _s4 = "";
String _s5 = "";
String _s6 = "";
String _str = "";
anywheresoftware.b4a.BA.IterableList group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xpagereturn";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=35717121;
 //BA.debugLineNum = 35717121;BA.debugLine="Private studentFile As KeyValueStore";
_studentfile = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=35717122;
 //BA.debugLineNum = 35717122;BA.debugLine="Private stMAp As Map";
_stmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=35717123;
 //BA.debugLineNum = 35717123;BA.debugLine="stMAp.Initialize";
_stmap.Initialize();
RDebugUtils.currentLine=35717124;
 //BA.debugLineNum = 35717124;BA.debugLine="Log(\"comprueba la existencia de \" & idEstudianteE";
parent.__c.Log("comprueba la existencia de "+__ref._idestudianteelegido /*String*/ +".dat ");
RDebugUtils.currentLine=35717125;
 //BA.debugLineNum = 35717125;BA.debugLine="If File.Exists(File.DirTemp, idEstudianteElegido";
if (true) break;

case 1:
//if
this.state = 14;
if (parent.__c.File.Exists(parent.__c.File.getDirTemp(),__ref._idestudianteelegido /*String*/ +".dat")) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=35717126;
 //BA.debugLineNum = 35717126;BA.debugLine="studentFile.Initialize(File.DirTemp, idEstudiant";
_studentfile._initialize /*String*/ (null,ba,parent.__c.File.getDirTemp(),__ref._idestudianteelegido /*String*/ +".dat");
RDebugUtils.currentLine=35717127;
 //BA.debugLineNum = 35717127;BA.debugLine="Wait For (studentFile.GetMapAsync(studentFile.Li";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xpagereturn", "cargarlistalibros"), _studentfile._getmapasync /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_studentfile._listkeys /*anywheresoftware.b4a.objects.collections.List*/ (null)));
this.state = 15;
return;
case 15:
//C
this.state = 4;
_stmap = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=35717128;
 //BA.debugLineNum = 35717128;BA.debugLine="Log(\"El fichero de estudiante existe\")";
parent.__c.Log("El fichero de estudiante existe");
RDebugUtils.currentLine=35717129;
 //BA.debugLineNum = 35717129;BA.debugLine="For Each tpLibro As Libro In B4XPages.MainPage.m";
if (true) break;

case 4:
//for
this.state = 11;
group9 = parent._b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._mapalibros /*anywheresoftware.b4a.objects.collections.Map*/ .Values();
index9 = 0;
groupLen9 = group9.getSize();
this.state = 16;
if (true) break;

case 16:
//C
this.state = 11;
if (index9 < groupLen9) {
this.state = 6;
_tplibro = (b4j.example.b4xmainpage._libro)(group9.Get(index9));}
if (true) break;

case 17:
//C
this.state = 16;
index9++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=35717130;
 //BA.debugLineNum = 35717130;BA.debugLine="If stMAp.ContainsKey(tpLibro.ID) Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_stmap.ContainsKey((Object)(_tplibro.ID /*String*/ ))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=35717131;
 //BA.debugLineNum = 35717131;BA.debugLine="Private s1, s2, s3, s4, s5, s6, str As String";
_s1 = "";
_s2 = "";
_s3 = "";
_s4 = "";
_s5 = "";
_s6 = "";
_str = "";
RDebugUtils.currentLine=35717132;
 //BA.debugLineNum = 35717132;BA.debugLine="s1 = B4XPages.MainPage.pgLibros.anadirEspacios";
_s1 = parent._b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pglibros /*b4j.example.b4xpagebooks*/ ._anadirespacios /*String*/ (null,_tplibro.ID /*String*/ ,(int) (1));
RDebugUtils.currentLine=35717133;
 //BA.debugLineNum = 35717133;BA.debugLine="s2 = B4XPages.MainPage.pgLibros.anadirEspacios";
_s2 = parent._b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pglibros /*b4j.example.b4xpagebooks*/ ._anadirespacios /*String*/ (null,_tplibro.Título /*String*/ ,(int) (2));
RDebugUtils.currentLine=35717134;
 //BA.debugLineNum = 35717134;BA.debugLine="s3 = B4XPages.MainPage.pgLibros.anadirEspacios";
_s3 = parent._b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pglibros /*b4j.example.b4xpagebooks*/ ._anadirespacios /*String*/ (null,_tplibro.Escritor /*String*/ ,(int) (3));
RDebugUtils.currentLine=35717135;
 //BA.debugLineNum = 35717135;BA.debugLine="s4 = B4XPages.MainPage.pgLibros.anadirEspacios";
_s4 = parent._b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pglibros /*b4j.example.b4xpagebooks*/ ._anadirespacios /*String*/ (null,_tplibro.Ano /*String*/ ,(int) (4));
RDebugUtils.currentLine=35717136;
 //BA.debugLineNum = 35717136;BA.debugLine="s5 = B4XPages.MainPage.pgLibros.anadirEspacios";
_s5 = parent._b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pglibros /*b4j.example.b4xpagebooks*/ ._anadirespacios /*String*/ (null,_tplibro.Editorial /*String*/ ,(int) (5));
RDebugUtils.currentLine=35717137;
 //BA.debugLineNum = 35717137;BA.debugLine="s6 = B4XPages.MainPage.pgLibros.anadirEspacios";
_s6 = parent._b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pglibros /*b4j.example.b4xpagebooks*/ ._anadirespacios /*String*/ (null,BA.NumberToString(_tplibro.Estante /*int*/ ),(int) (6));
RDebugUtils.currentLine=35717139;
 //BA.debugLineNum = 35717139;BA.debugLine="str = $\"${s1}${s2}${s3}${s4}${s5}${s6}\"$";
_str = (""+parent.__c.SmartStringFormatter("",(Object)(_s1))+""+parent.__c.SmartStringFormatter("",(Object)(_s2))+""+parent.__c.SmartStringFormatter("",(Object)(_s3))+""+parent.__c.SmartStringFormatter("",(Object)(_s4))+""+parent.__c.SmartStringFormatter("",(Object)(_s5))+""+parent.__c.SmartStringFormatter("",(Object)(_s6))+"");
RDebugUtils.currentLine=35717140;
 //BA.debugLineNum = 35717140;BA.debugLine="clvLibros.AddTextItem(str, tpLibro.ID)";
__ref._clvlibros /*b4j.example.customlistview*/ ._addtextitem((Object)(_str),(Object)(_tplibro.ID /*String*/ ));
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
;
RDebugUtils.currentLine=35717143;
 //BA.debugLineNum = 35717143;BA.debugLine="studentFile.Close";
_studentfile._close /*String*/ (null);
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=35717145;
 //BA.debugLineNum = 35717145;BA.debugLine="clvLibros.Clear";
__ref._clvlibros /*b4j.example.customlistview*/ ._clear();
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=35717147;
 //BA.debugLineNum = 35717147;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.example.b4xpagereturn __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagereturn";
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="Private btnDevolver As Button";
_btndevolver = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="Private cmbEstudiante As B4XComboBox";
_cmbestudiante = new b4j.example.b4xcombobox();
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="Private clvLibros As CustomListView";
_clvlibros = new b4j.example.customlistview();
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="Private libroElegido As Int = -1";
_libroelegido = (int) (-1);
RDebugUtils.currentLine=3342344;
 //BA.debugLineNum = 3342344;BA.debugLine="Private idEstudianteElegido As String =  \"\"";
_idestudianteelegido = "";
RDebugUtils.currentLine=3342345;
 //BA.debugLineNum = 3342345;BA.debugLine="Private idLibroElegido As String  =  \"\"";
_idlibroelegido = "";
RDebugUtils.currentLine=3342346;
 //BA.debugLineNum = 3342346;BA.debugLine="End Sub";
return "";
}
public String  _clvlibros_itemclick(b4j.example.b4xpagereturn __ref,int _índice,Object _valor) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagereturn";
if (Debug.shouldDelegate(ba, "clvlibros_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvlibros_itemclick", new Object[] {_índice,_valor}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=56688640;
 //BA.debugLineNum = 56688640;BA.debugLine="Private Sub clvLibros_ItemClick (Índice As Int, Va";
RDebugUtils.currentLine=56688641;
 //BA.debugLineNum = 56688641;BA.debugLine="If libroElegido = -1 Then";
if (__ref._libroelegido /*int*/ ==-1) { 
RDebugUtils.currentLine=56688642;
 //BA.debugLineNum = 56688642;BA.debugLine="Dim p As B4XView = clvLibros.GetPanel(Índice)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._clvlibros /*b4j.example.customlistview*/ ._getpanel(_índice);
RDebugUtils.currentLine=56688643;
 //BA.debugLineNum = 56688643;BA.debugLine="p.GetView(0).Color = xui.Color_Blue";
_p.GetView((int) (0)).setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
RDebugUtils.currentLine=56688644;
 //BA.debugLineNum = 56688644;BA.debugLine="libroElegido = Índice";
__ref._libroelegido /*int*/  = _índice;
RDebugUtils.currentLine=56688645;
 //BA.debugLineNum = 56688645;BA.debugLine="idLibroElegido = clvLibros.GetValue(libroElegido";
__ref._idlibroelegido /*String*/  = BA.ObjectToString(__ref._clvlibros /*b4j.example.customlistview*/ ._getvalue(__ref._libroelegido /*int*/ ));
 }else {
RDebugUtils.currentLine=56688647;
 //BA.debugLineNum = 56688647;BA.debugLine="Dim p As B4XView = clvLibros.GetPanel(libroElegi";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._clvlibros /*b4j.example.customlistview*/ ._getpanel(__ref._libroelegido /*int*/ );
RDebugUtils.currentLine=56688648;
 //BA.debugLineNum = 56688648;BA.debugLine="p.GetView(0).Color = xui.Color_White";
_p.GetView((int) (0)).setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=56688649;
 //BA.debugLineNum = 56688649;BA.debugLine="If libroElegido = Índice  Then";
if (__ref._libroelegido /*int*/ ==_índice) { 
RDebugUtils.currentLine=56688650;
 //BA.debugLineNum = 56688650;BA.debugLine="libroElegido = -1";
__ref._libroelegido /*int*/  = (int) (-1);
RDebugUtils.currentLine=56688651;
 //BA.debugLineNum = 56688651;BA.debugLine="idLibroElegido = \"\"";
__ref._idlibroelegido /*String*/  = "";
 }else {
RDebugUtils.currentLine=56688653;
 //BA.debugLineNum = 56688653;BA.debugLine="Dim p As B4XView = clvLibros.GetPanel(Índice)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._clvlibros /*b4j.example.customlistview*/ ._getpanel(_índice);
RDebugUtils.currentLine=56688654;
 //BA.debugLineNum = 56688654;BA.debugLine="p.GetView(0).Color = xui.Color_Blue";
_p.GetView((int) (0)).setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
RDebugUtils.currentLine=56688655;
 //BA.debugLineNum = 56688655;BA.debugLine="libroElegido = Índice";
__ref._libroelegido /*int*/  = _índice;
RDebugUtils.currentLine=56688656;
 //BA.debugLineNum = 56688656;BA.debugLine="idLibroElegido = clvLibros.GetValue(libroElegid";
__ref._idlibroelegido /*String*/  = BA.ObjectToString(__ref._clvlibros /*b4j.example.customlistview*/ ._getvalue(__ref._libroelegido /*int*/ ));
 };
 };
RDebugUtils.currentLine=56688660;
 //BA.debugLineNum = 56688660;BA.debugLine="Log(libroElegido)";
__c.Log(BA.NumberToString(__ref._libroelegido /*int*/ ));
RDebugUtils.currentLine=56688661;
 //BA.debugLineNum = 56688661;BA.debugLine="End Sub";
return "";
}
public String  _cmbestudiante_selectedindexchanged(b4j.example.b4xpagereturn __ref,int _índice) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagereturn";
if (Debug.shouldDelegate(ba, "cmbestudiante_selectedindexchanged", false))
	 {return ((String) Debug.delegate(ba, "cmbestudiante_selectedindexchanged", new Object[] {_índice}));}
String _str = "";
int _i = 0;
RDebugUtils.currentLine=58851328;
 //BA.debugLineNum = 58851328;BA.debugLine="Private Sub cmbEstudiante_SelectedIndexChanged (Ín";
RDebugUtils.currentLine=58851329;
 //BA.debugLineNum = 58851329;BA.debugLine="idEstudianteElegido = \"\"";
__ref._idestudianteelegido /*String*/  = "";
RDebugUtils.currentLine=58851330;
 //BA.debugLineNum = 58851330;BA.debugLine="Private str As String = cmbEstudiante.GetItem(Índ";
_str = __ref._cmbestudiante /*b4j.example.b4xcombobox*/ ._getitem /*String*/ (null,_índice);
RDebugUtils.currentLine=58851331;
 //BA.debugLineNum = 58851331;BA.debugLine="Private i As Int = 0";
_i = (int) (0);
RDebugUtils.currentLine=58851332;
 //BA.debugLineNum = 58851332;BA.debugLine="Do While str.CharAt(i) <> \" \"";
while (_str.charAt(_i)!=BA.ObjectToChar(" ")) {
RDebugUtils.currentLine=58851333;
 //BA.debugLineNum = 58851333;BA.debugLine="idEstudianteElegido = idEstudianteElegido & str.";
__ref._idestudianteelegido /*String*/  = __ref._idestudianteelegido /*String*/ +BA.ObjectToString(_str.charAt(_i));
RDebugUtils.currentLine=58851334;
 //BA.debugLineNum = 58851334;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
RDebugUtils.currentLine=58851336;
 //BA.debugLineNum = 58851336;BA.debugLine="Log(idEstudianteElegido)";
__c.Log(__ref._idestudianteelegido /*String*/ );
RDebugUtils.currentLine=58851337;
 //BA.debugLineNum = 58851337;BA.debugLine="cargarListaLibros";
__ref._cargarlistalibros /*void*/ (null);
RDebugUtils.currentLine=58851338;
 //BA.debugLineNum = 58851338;BA.debugLine="End Sub";
return "";
}
}