package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xpageborrow extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xpageborrow", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xpageborrow.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.ButtonWrapper _btnprestar = null;
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
public Object  _initialize(b4j.example.b4xpageborrow __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xpageborrow";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4j.example.b4xpageborrow __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpageborrow";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="Root.LoadLayout(\"frmBorrow\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("frmBorrow",ba);
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="cmbEstudiante.SetItems(mostrarcmbEstudiante)";
__ref._cmbestudiante /*b4j.example.b4xcombobox*/ ._setitems /*String*/ (null,__ref._mostrarcmbestudiante /*anywheresoftware.b4a.objects.collections.List*/ (null));
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="cargarListaLibros";
__ref._cargarlistalibros /*String*/ (null);
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _mostrarcmbestudiante(b4j.example.b4xpageborrow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpageborrow";
if (Debug.shouldDelegate(ba, "mostrarcmbestudiante", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "mostrarcmbestudiante", null));}
anywheresoftware.b4a.objects.collections.List _nuevalista = null;
String _clave = "";
b4j.example.b4xmainpage._estudiante _tp = null;
RDebugUtils.currentLine=55377920;
 //BA.debugLineNum = 55377920;BA.debugLine="Private Sub mostrarcmbEstudiante As List";
RDebugUtils.currentLine=55377921;
 //BA.debugLineNum = 55377921;BA.debugLine="Private nuevaLista As List";
_nuevalista = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=55377922;
 //BA.debugLineNum = 55377922;BA.debugLine="nuevaLista.Initialize";
_nuevalista.Initialize();
RDebugUtils.currentLine=55377923;
 //BA.debugLineNum = 55377923;BA.debugLine="For Each clave As String In B4XPages.MainPage.map";
{
final anywheresoftware.b4a.BA.IterableList group3 = _b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._mapaestudiantes /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_clave = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=55377924;
 //BA.debugLineNum = 55377924;BA.debugLine="Dim tp As Estudiante";
_tp = new b4j.example.b4xmainpage._estudiante();
RDebugUtils.currentLine=55377925;
 //BA.debugLineNum = 55377925;BA.debugLine="tp = B4XPages.MainPage.mapaEstudiantes.Get(clave";
_tp = (b4j.example.b4xmainpage._estudiante)(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._mapaestudiantes /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_clave)));
RDebugUtils.currentLine=55377926;
 //BA.debugLineNum = 55377926;BA.debugLine="nuevaLista.Add($\"${clave} ${tp.Nombre} ${tp.Apel";
_nuevalista.Add((Object)((""+__c.SmartStringFormatter("",(Object)(_clave))+" "+__c.SmartStringFormatter("",(Object)(_tp.Nombre /*String*/ ))+" "+__c.SmartStringFormatter("",(Object)(_tp.Apellidos /*String*/ ))+" "+__c.SmartStringFormatter("",(Object)(_tp.Clase /*String*/ ))+"")));
RDebugUtils.currentLine=55377927;
 //BA.debugLineNum = 55377927;BA.debugLine="Log($\"${clave} ${tp.Nombre} ${tp.Apellidos} ${tp";
__c.Log((""+__c.SmartStringFormatter("",(Object)(_clave))+" "+__c.SmartStringFormatter("",(Object)(_tp.Nombre /*String*/ ))+" "+__c.SmartStringFormatter("",(Object)(_tp.Apellidos /*String*/ ))+" "+__c.SmartStringFormatter("",(Object)(_tp.Clase /*String*/ ))+""));
 }
};
RDebugUtils.currentLine=55377929;
 //BA.debugLineNum = 55377929;BA.debugLine="Return nuevaLista";
if (true) return _nuevalista;
RDebugUtils.currentLine=55377930;
 //BA.debugLineNum = 55377930;BA.debugLine="End Sub";
return null;
}
public String  _cargarlistalibros(b4j.example.b4xpageborrow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpageborrow";
if (Debug.shouldDelegate(ba, "cargarlistalibros", false))
	 {return ((String) Debug.delegate(ba, "cargarlistalibros", null));}
b4j.example.b4xmainpage._libro _tplibro = null;
String _s1 = "";
String _s2 = "";
String _s3 = "";
String _s4 = "";
String _s5 = "";
String _s6 = "";
String _str = "";
RDebugUtils.currentLine=59965440;
 //BA.debugLineNum = 59965440;BA.debugLine="Private Sub cargarListaLibros";
RDebugUtils.currentLine=59965441;
 //BA.debugLineNum = 59965441;BA.debugLine="For Each tpLibro As Libro In B4XPages.MainPage.ma";
{
final anywheresoftware.b4a.BA.IterableList group1 = _b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._mapalibros /*anywheresoftware.b4a.objects.collections.Map*/ .Values();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_tplibro = (b4j.example.b4xmainpage._libro)(group1.Get(index1));
RDebugUtils.currentLine=59965442;
 //BA.debugLineNum = 59965442;BA.debugLine="Private s1, s2, s3, s4, s5, s6, str As String";
_s1 = "";
_s2 = "";
_s3 = "";
_s4 = "";
_s5 = "";
_s6 = "";
_str = "";
RDebugUtils.currentLine=59965443;
 //BA.debugLineNum = 59965443;BA.debugLine="s1 = B4XPages.MainPage.pgLibros.anadirEspacios(t";
_s1 = _b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pglibros /*b4j.example.b4xpagebooks*/ ._anadirespacios /*String*/ (null,_tplibro.ID /*String*/ ,(int) (1));
RDebugUtils.currentLine=59965444;
 //BA.debugLineNum = 59965444;BA.debugLine="s2 = B4XPages.MainPage.pgLibros.anadirEspacios(t";
_s2 = _b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pglibros /*b4j.example.b4xpagebooks*/ ._anadirespacios /*String*/ (null,_tplibro.Título /*String*/ ,(int) (2));
RDebugUtils.currentLine=59965445;
 //BA.debugLineNum = 59965445;BA.debugLine="s3 = B4XPages.MainPage.pgLibros.anadirEspacios(t";
_s3 = _b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pglibros /*b4j.example.b4xpagebooks*/ ._anadirespacios /*String*/ (null,_tplibro.Escritor /*String*/ ,(int) (3));
RDebugUtils.currentLine=59965446;
 //BA.debugLineNum = 59965446;BA.debugLine="s4 = B4XPages.MainPage.pgLibros.anadirEspacios(t";
_s4 = _b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pglibros /*b4j.example.b4xpagebooks*/ ._anadirespacios /*String*/ (null,_tplibro.Ano /*String*/ ,(int) (4));
RDebugUtils.currentLine=59965447;
 //BA.debugLineNum = 59965447;BA.debugLine="s5 = B4XPages.MainPage.pgLibros.anadirEspacios(t";
_s5 = _b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pglibros /*b4j.example.b4xpagebooks*/ ._anadirespacios /*String*/ (null,_tplibro.Editorial /*String*/ ,(int) (5));
RDebugUtils.currentLine=59965448;
 //BA.debugLineNum = 59965448;BA.debugLine="s6 = B4XPages.MainPage.pgLibros.anadirEspacios(t";
_s6 = _b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pglibros /*b4j.example.b4xpagebooks*/ ._anadirespacios /*String*/ (null,BA.NumberToString(_tplibro.Estante /*int*/ ),(int) (6));
RDebugUtils.currentLine=59965450;
 //BA.debugLineNum = 59965450;BA.debugLine="str = $\"${s1}${s2}${s3}${s4}${s5}${s6}\"$";
_str = (""+__c.SmartStringFormatter("",(Object)(_s1))+""+__c.SmartStringFormatter("",(Object)(_s2))+""+__c.SmartStringFormatter("",(Object)(_s3))+""+__c.SmartStringFormatter("",(Object)(_s4))+""+__c.SmartStringFormatter("",(Object)(_s5))+""+__c.SmartStringFormatter("",(Object)(_s6))+"");
RDebugUtils.currentLine=59965451;
 //BA.debugLineNum = 59965451;BA.debugLine="clvLibros.AddTextItem(str, tpLibro.ID)";
__ref._clvlibros /*b4j.example.customlistview*/ ._addtextitem((Object)(_str),(Object)(_tplibro.ID /*String*/ ));
 }
};
RDebugUtils.currentLine=59965453;
 //BA.debugLineNum = 59965453;BA.debugLine="End Sub";
return "";
}
public String  _btnprestar_click(b4j.example.b4xpageborrow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpageborrow";
if (Debug.shouldDelegate(ba, "btnprestar_click", false))
	 {return ((String) Debug.delegate(ba, "btnprestar_click", null));}
RDebugUtils.currentLine=55181312;
 //BA.debugLineNum = 55181312;BA.debugLine="Private Sub btnPrestar_Click";
RDebugUtils.currentLine=55181313;
 //BA.debugLineNum = 55181313;BA.debugLine="If idLibroElegido <> \"\" And idEstudianteElegido <";
if ((__ref._idlibroelegido /*String*/ ).equals("") == false && (__ref._idestudianteelegido /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=55181314;
 //BA.debugLineNum = 55181314;BA.debugLine="prestarLibro";
__ref._prestarlibro /*void*/ (null);
 };
RDebugUtils.currentLine=55181316;
 //BA.debugLineNum = 55181316;BA.debugLine="End Sub";
return "";
}
public void  _prestarlibro(b4j.example.b4xpageborrow __ref) throws Exception{
RDebugUtils.currentModule="b4xpageborrow";
if (Debug.shouldDelegate(ba, "prestarlibro", false))
	 {Debug.delegate(ba, "prestarlibro", null); return;}
ResumableSub_prestarLibro rsub = new ResumableSub_prestarLibro(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_prestarLibro extends BA.ResumableSub {
public ResumableSub_prestarLibro(b4j.example.b4xpageborrow parent,b4j.example.b4xpageborrow __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xpageborrow __ref;
b4j.example.b4xpageborrow parent;
anywheresoftware.b4a.objects.collections.Map _mapaest = null;
String _nombrefichest = "";
b4j.example.keyvaluestore _fichestudiante = null;
String _key = "";
boolean _exito = false;
anywheresoftware.b4a.BA.IterableList group13;
int index13;
int groupLen13;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xpageborrow";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=55246850;
 //BA.debugLineNum = 55246850;BA.debugLine="Private mapaEst As Map";
_mapaest = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=55246851;
 //BA.debugLineNum = 55246851;BA.debugLine="mapaEst.Initialize";
_mapaest.Initialize();
RDebugUtils.currentLine=55246853;
 //BA.debugLineNum = 55246853;BA.debugLine="Private nombreFichEst As String = idEstudianteEle";
_nombrefichest = __ref._idestudianteelegido /*String*/ +".dat";
RDebugUtils.currentLine=55246854;
 //BA.debugLineNum = 55246854;BA.debugLine="Log(\"Nombre del fichero: \" & nombreFichEst)";
parent.__c.Log("Nombre del fichero: "+_nombrefichest);
RDebugUtils.currentLine=55246855;
 //BA.debugLineNum = 55246855;BA.debugLine="Private fichEstudiante As KeyValueStore";
_fichestudiante = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=55246857;
 //BA.debugLineNum = 55246857;BA.debugLine="If File.Exists(File.DirTemp, nombreFichEst) Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.File.Exists(parent.__c.File.getDirTemp(),_nombrefichest)) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=55246858;
 //BA.debugLineNum = 55246858;BA.debugLine="fichEstudiante.Initialize(File.DirTemp, nombreFi";
_fichestudiante._initialize /*String*/ (null,ba,parent.__c.File.getDirTemp(),_nombrefichest);
RDebugUtils.currentLine=55246860;
 //BA.debugLineNum = 55246860;BA.debugLine="Wait For (fichEstudiante.GetMapAsync(fichEstudia";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xpageborrow", "prestarlibro"), _fichestudiante._getmapasync /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_fichestudiante._listkeys /*anywheresoftware.b4a.objects.collections.List*/ (null)));
this.state = 11;
return;
case 11:
//C
this.state = 6;
_mapaest = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=55246862;
 //BA.debugLineNum = 55246862;BA.debugLine="fichEstudiante.Initialize(File.DirTemp, nombreFi";
_fichestudiante._initialize /*String*/ (null,ba,parent.__c.File.getDirTemp(),_nombrefichest);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=55246866;
 //BA.debugLineNum = 55246866;BA.debugLine="mapaEst.Put(idLibroElegido, DateTime.Date(DateTim";
_mapaest.Put((Object)(__ref._idlibroelegido /*String*/ ),(Object)(parent.__c.DateTime.Date(parent.__c.DateTime.getNow())));
RDebugUtils.currentLine=55246867;
 //BA.debugLineNum = 55246867;BA.debugLine="For Each key As String In mapaEst.Keys";
if (true) break;

case 7:
//for
this.state = 10;
group13 = _mapaest.Keys();
index13 = 0;
groupLen13 = group13.getSize();
this.state = 12;
if (true) break;

case 12:
//C
this.state = 10;
if (index13 < groupLen13) {
this.state = 9;
_key = BA.ObjectToString(group13.Get(index13));}
if (true) break;

case 13:
//C
this.state = 12;
index13++;
if (true) break;

case 9:
//C
this.state = 13;
RDebugUtils.currentLine=55246868;
 //BA.debugLineNum = 55246868;BA.debugLine="Log (key & \" \" & mapaEst.Get(key))";
parent.__c.Log(_key+" "+BA.ObjectToString(_mapaest.Get((Object)(_key))));
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=55246871;
 //BA.debugLineNum = 55246871;BA.debugLine="Wait For (fichEstudiante.PutMapAsync(mapaEst)) Co";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xpageborrow", "prestarlibro"), _fichestudiante._putmapasync /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_mapaest));
this.state = 14;
return;
case 14:
//C
this.state = -1;
_exito = (boolean) result[1];
;
RDebugUtils.currentLine=55246872;
 //BA.debugLineNum = 55246872;BA.debugLine="fichEstudiante.Close";
_fichestudiante._close /*String*/ (null);
RDebugUtils.currentLine=55246873;
 //BA.debugLineNum = 55246873;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.example.b4xpageborrow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpageborrow";
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="Private btnPrestar As Button";
_btnprestar = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="Private cmbEstudiante As B4XComboBox";
_cmbestudiante = new b4j.example.b4xcombobox();
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="Private clvLibros As CustomListView";
_clvlibros = new b4j.example.customlistview();
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="Private libroElegido As Int = -1";
_libroelegido = (int) (-1);
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="Private idEstudianteElegido As String =  \"\"";
_idestudianteelegido = "";
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="Private idLibroElegido As String  =  \"\"";
_idlibroelegido = "";
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="End Sub";
return "";
}
public String  _clvlibros_itemclick(b4j.example.b4xpageborrow __ref,int _índice,Object _valor) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpageborrow";
if (Debug.shouldDelegate(ba, "clvlibros_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvlibros_itemclick", new Object[] {_índice,_valor}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=54394880;
 //BA.debugLineNum = 54394880;BA.debugLine="Private Sub clvLibros_ItemClick (Índice As Int, Va";
RDebugUtils.currentLine=54394881;
 //BA.debugLineNum = 54394881;BA.debugLine="If libroElegido = -1 Then";
if (__ref._libroelegido /*int*/ ==-1) { 
RDebugUtils.currentLine=54394882;
 //BA.debugLineNum = 54394882;BA.debugLine="Dim p As B4XView = clvLibros.GetPanel(Índice)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._clvlibros /*b4j.example.customlistview*/ ._getpanel(_índice);
RDebugUtils.currentLine=54394883;
 //BA.debugLineNum = 54394883;BA.debugLine="p.GetView(0).Color = xui.Color_Blue";
_p.GetView((int) (0)).setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
RDebugUtils.currentLine=54394884;
 //BA.debugLineNum = 54394884;BA.debugLine="libroElegido = Índice";
__ref._libroelegido /*int*/  = _índice;
RDebugUtils.currentLine=54394885;
 //BA.debugLineNum = 54394885;BA.debugLine="idLibroElegido = clvLibros.GetValue(libroElegido";
__ref._idlibroelegido /*String*/  = BA.ObjectToString(__ref._clvlibros /*b4j.example.customlistview*/ ._getvalue(__ref._libroelegido /*int*/ ));
 }else {
RDebugUtils.currentLine=54394887;
 //BA.debugLineNum = 54394887;BA.debugLine="Dim p As B4XView = clvLibros.GetPanel(libroElegi";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._clvlibros /*b4j.example.customlistview*/ ._getpanel(__ref._libroelegido /*int*/ );
RDebugUtils.currentLine=54394888;
 //BA.debugLineNum = 54394888;BA.debugLine="p.GetView(0).Color = xui.Color_White";
_p.GetView((int) (0)).setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=54394889;
 //BA.debugLineNum = 54394889;BA.debugLine="If libroElegido = Índice  Then";
if (__ref._libroelegido /*int*/ ==_índice) { 
RDebugUtils.currentLine=54394890;
 //BA.debugLineNum = 54394890;BA.debugLine="libroElegido = -1";
__ref._libroelegido /*int*/  = (int) (-1);
RDebugUtils.currentLine=54394891;
 //BA.debugLineNum = 54394891;BA.debugLine="idLibroElegido = \"\"";
__ref._idlibroelegido /*String*/  = "";
 }else {
RDebugUtils.currentLine=54394893;
 //BA.debugLineNum = 54394893;BA.debugLine="Dim p As B4XView = clvLibros.GetPanel(Índice)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._clvlibros /*b4j.example.customlistview*/ ._getpanel(_índice);
RDebugUtils.currentLine=54394894;
 //BA.debugLineNum = 54394894;BA.debugLine="p.GetView(0).Color = xui.Color_Blue";
_p.GetView((int) (0)).setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
RDebugUtils.currentLine=54394895;
 //BA.debugLineNum = 54394895;BA.debugLine="libroElegido = Índice";
__ref._libroelegido /*int*/  = _índice;
RDebugUtils.currentLine=54394896;
 //BA.debugLineNum = 54394896;BA.debugLine="idLibroElegido = clvLibros.GetValue(libroElegid";
__ref._idlibroelegido /*String*/  = BA.ObjectToString(__ref._clvlibros /*b4j.example.customlistview*/ ._getvalue(__ref._libroelegido /*int*/ ));
 };
 };
RDebugUtils.currentLine=54394900;
 //BA.debugLineNum = 54394900;BA.debugLine="Log(libroElegido)";
__c.Log(BA.NumberToString(__ref._libroelegido /*int*/ ));
RDebugUtils.currentLine=54394901;
 //BA.debugLineNum = 54394901;BA.debugLine="End Sub";
return "";
}
public String  _cmbestudiante_selectedindexchanged(b4j.example.b4xpageborrow __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpageborrow";
if (Debug.shouldDelegate(ba, "cmbestudiante_selectedindexchanged", false))
	 {return ((String) Debug.delegate(ba, "cmbestudiante_selectedindexchanged", new Object[] {_index}));}
String _str = "";
int _i = 0;
RDebugUtils.currentLine=55967744;
 //BA.debugLineNum = 55967744;BA.debugLine="Private Sub cmbEstudiante_SelectedIndexChanged (In";
RDebugUtils.currentLine=55967745;
 //BA.debugLineNum = 55967745;BA.debugLine="idEstudianteElegido = \"\"";
__ref._idestudianteelegido /*String*/  = "";
RDebugUtils.currentLine=55967746;
 //BA.debugLineNum = 55967746;BA.debugLine="Private str As String = cmbEstudiante.GetItem(Ind";
_str = __ref._cmbestudiante /*b4j.example.b4xcombobox*/ ._getitem /*String*/ (null,_index);
RDebugUtils.currentLine=55967747;
 //BA.debugLineNum = 55967747;BA.debugLine="Private i As Int = 0";
_i = (int) (0);
RDebugUtils.currentLine=55967748;
 //BA.debugLineNum = 55967748;BA.debugLine="Do While str.CharAt(i) <> \" \"";
while (_str.charAt(_i)!=BA.ObjectToChar(" ")) {
RDebugUtils.currentLine=55967749;
 //BA.debugLineNum = 55967749;BA.debugLine="idEstudianteElegido = idEstudianteElegido & str.";
__ref._idestudianteelegido /*String*/  = __ref._idestudianteelegido /*String*/ +BA.ObjectToString(_str.charAt(_i));
RDebugUtils.currentLine=55967750;
 //BA.debugLineNum = 55967750;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
RDebugUtils.currentLine=55967752;
 //BA.debugLineNum = 55967752;BA.debugLine="Log(idEstudianteElegido)";
__c.Log(__ref._idestudianteelegido /*String*/ );
RDebugUtils.currentLine=55967753;
 //BA.debugLineNum = 55967753;BA.debugLine="End Sub";
return "";
}
}