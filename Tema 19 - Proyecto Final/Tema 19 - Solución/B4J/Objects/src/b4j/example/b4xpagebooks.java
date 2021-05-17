package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xpagebooks extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xpagebooks", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xpagebooks.class).invoke(this, new Object[] {null});
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
public b4j.example.customlistview _clvlibros = null;
public b4j.example.b4xdialog _diálogo = null;
public b4j.example.b4xfloattextfield _txtid = null;
public b4j.example.b4xfloattextfield _txteditorial = null;
public b4j.example.b4xfloattextfield _txtestante = null;
public b4j.example.b4xfloattextfield _txttitulo = null;
public b4j.example.b4xfloattextfield _txtescritor = null;
public b4j.example.b4xfloattextfield _txtano = null;
public int _libroelegido = 0;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4j.example.b4xpagebooks __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xpagebooks";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return null;
}
public String  _anadirespacios(b4j.example.b4xpagebooks __ref,String _s1,int _pos) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagebooks";
if (Debug.shouldDelegate(ba, "anadirespacios", false))
	 {return ((String) Debug.delegate(ba, "anadirespacios", new Object[] {_s1,_pos}));}
RDebugUtils.currentLine=48103424;
 //BA.debugLineNum = 48103424;BA.debugLine="Public Sub anadirEspacios(s1 As String, pos As Int";
RDebugUtils.currentLine=48103425;
 //BA.debugLineNum = 48103425;BA.debugLine="If pos = 1 Then";
if (_pos==1) { 
RDebugUtils.currentLine=48103426;
 //BA.debugLineNum = 48103426;BA.debugLine="Do While s1.Length <= 4";
while (_s1.length()<=4) {
RDebugUtils.currentLine=48103427;
 //BA.debugLineNum = 48103427;BA.debugLine="s1 = s1 & \" \"";
_s1 = _s1+" ";
 }
;
 }else 
{RDebugUtils.currentLine=48103429;
 //BA.debugLineNum = 48103429;BA.debugLine="else if pos = 2 Then";
if (_pos==2) { 
RDebugUtils.currentLine=48103430;
 //BA.debugLineNum = 48103430;BA.debugLine="Do While s1.Length <= 40";
while (_s1.length()<=40) {
RDebugUtils.currentLine=48103431;
 //BA.debugLineNum = 48103431;BA.debugLine="s1 = s1 & \" \"";
_s1 = _s1+" ";
 }
;
 }else 
{RDebugUtils.currentLine=48103433;
 //BA.debugLineNum = 48103433;BA.debugLine="else if pos = 3 Or pos = 5 Then";
if (_pos==3 || _pos==5) { 
RDebugUtils.currentLine=48103434;
 //BA.debugLineNum = 48103434;BA.debugLine="Do While s1.Length <= 22";
while (_s1.length()<=22) {
RDebugUtils.currentLine=48103435;
 //BA.debugLineNum = 48103435;BA.debugLine="s1 = s1 & \" \"";
_s1 = _s1+" ";
 }
;
 }else 
{RDebugUtils.currentLine=48103437;
 //BA.debugLineNum = 48103437;BA.debugLine="else if pos = 4 Then";
if (_pos==4) { 
RDebugUtils.currentLine=48103438;
 //BA.debugLineNum = 48103438;BA.debugLine="Do While s1.Length <= 6";
while (_s1.length()<=6) {
RDebugUtils.currentLine=48103439;
 //BA.debugLineNum = 48103439;BA.debugLine="s1 = s1 & \" \"";
_s1 = _s1+" ";
 }
;
 }else 
{RDebugUtils.currentLine=48103441;
 //BA.debugLineNum = 48103441;BA.debugLine="else if pos = 6 Then";
if (_pos==6) { 
RDebugUtils.currentLine=48103442;
 //BA.debugLineNum = 48103442;BA.debugLine="Do While s1.Length <= 3";
while (_s1.length()<=3) {
RDebugUtils.currentLine=48103443;
 //BA.debugLineNum = 48103443;BA.debugLine="s1 = s1 & \" \"";
_s1 = _s1+" ";
 }
;
 }}}}}
;
RDebugUtils.currentLine=48103446;
 //BA.debugLineNum = 48103446;BA.debugLine="Return s1";
if (true) return _s1;
RDebugUtils.currentLine=48103447;
 //BA.debugLineNum = 48103447;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4j.example.b4xpagebooks __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagebooks";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Root.LoadLayout(\"frmBooks\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("frmBooks",ba);
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="cargarLista";
__ref._cargarlista /*String*/ (null);
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="End Sub";
return "";
}
public String  _cargarlista(b4j.example.b4xpagebooks __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagebooks";
if (Debug.shouldDelegate(ba, "cargarlista", false))
	 {return ((String) Debug.delegate(ba, "cargarlista", null));}
b4j.example.b4xmainpage._libro _tplibro = null;
String _s1 = "";
String _s2 = "";
String _s3 = "";
String _s4 = "";
String _s5 = "";
String _s6 = "";
String _str = "";
RDebugUtils.currentLine=47251456;
 //BA.debugLineNum = 47251456;BA.debugLine="Private Sub cargarLista";
RDebugUtils.currentLine=47251457;
 //BA.debugLineNum = 47251457;BA.debugLine="For Each tpLibro As Libro In B4XPages.MainPage.ma";
{
final anywheresoftware.b4a.BA.IterableList group1 = _b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._mapalibros /*anywheresoftware.b4a.objects.collections.Map*/ .Values();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_tplibro = (b4j.example.b4xmainpage._libro)(group1.Get(index1));
RDebugUtils.currentLine=47251458;
 //BA.debugLineNum = 47251458;BA.debugLine="Private s1, s2, s3, s4, s5, s6, str As String";
_s1 = "";
_s2 = "";
_s3 = "";
_s4 = "";
_s5 = "";
_s6 = "";
_str = "";
RDebugUtils.currentLine=47251459;
 //BA.debugLineNum = 47251459;BA.debugLine="s1 = anadirEspacios(tpLibro.ID, 1)";
_s1 = __ref._anadirespacios /*String*/ (null,_tplibro.ID /*String*/ ,(int) (1));
RDebugUtils.currentLine=47251460;
 //BA.debugLineNum = 47251460;BA.debugLine="s2 = anadirEspacios(tpLibro.Título, 2)";
_s2 = __ref._anadirespacios /*String*/ (null,_tplibro.Título /*String*/ ,(int) (2));
RDebugUtils.currentLine=47251461;
 //BA.debugLineNum = 47251461;BA.debugLine="s3 = anadirEspacios(tpLibro.Escritor, 3)";
_s3 = __ref._anadirespacios /*String*/ (null,_tplibro.Escritor /*String*/ ,(int) (3));
RDebugUtils.currentLine=47251462;
 //BA.debugLineNum = 47251462;BA.debugLine="s4 = anadirEspacios(tpLibro.Ano, 4)";
_s4 = __ref._anadirespacios /*String*/ (null,_tplibro.Ano /*String*/ ,(int) (4));
RDebugUtils.currentLine=47251463;
 //BA.debugLineNum = 47251463;BA.debugLine="s5 = anadirEspacios(tpLibro.Editorial, 5)";
_s5 = __ref._anadirespacios /*String*/ (null,_tplibro.Editorial /*String*/ ,(int) (5));
RDebugUtils.currentLine=47251464;
 //BA.debugLineNum = 47251464;BA.debugLine="s6 = anadirEspacios(tpLibro.Estante, 6)";
_s6 = __ref._anadirespacios /*String*/ (null,BA.NumberToString(_tplibro.Estante /*int*/ ),(int) (6));
RDebugUtils.currentLine=47251466;
 //BA.debugLineNum = 47251466;BA.debugLine="str = $\"${s1}${s2}${s3}${s4}${s5}${s6}\"$";
_str = (""+__c.SmartStringFormatter("",(Object)(_s1))+""+__c.SmartStringFormatter("",(Object)(_s2))+""+__c.SmartStringFormatter("",(Object)(_s3))+""+__c.SmartStringFormatter("",(Object)(_s4))+""+__c.SmartStringFormatter("",(Object)(_s5))+""+__c.SmartStringFormatter("",(Object)(_s6))+"");
RDebugUtils.currentLine=47251467;
 //BA.debugLineNum = 47251467;BA.debugLine="clvLibros.AddTextItem(str, tpLibro.ID)";
__ref._clvlibros /*b4j.example.customlistview*/ ._addtextitem((Object)(_str),(Object)(_tplibro.ID /*String*/ ));
 }
};
RDebugUtils.currentLine=47251469;
 //BA.debugLineNum = 47251469;BA.debugLine="End Sub";
return "";
}
public String  _btnborrar_click(b4j.example.b4xpagebooks __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagebooks";
if (Debug.shouldDelegate(ba, "btnborrar_click", false))
	 {return ((String) Debug.delegate(ba, "btnborrar_click", null));}
RDebugUtils.currentLine=52953088;
 //BA.debugLineNum = 52953088;BA.debugLine="Private Sub btnBorrar_Click";
RDebugUtils.currentLine=52953089;
 //BA.debugLineNum = 52953089;BA.debugLine="If libroElegido <> - 1 Then";
if (__ref._libroelegido /*int*/ !=-1) { 
RDebugUtils.currentLine=52953090;
 //BA.debugLineNum = 52953090;BA.debugLine="B4XPages.MainPage.mapaLibros.Remove(clvLibros.Ge";
_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._mapalibros /*anywheresoftware.b4a.objects.collections.Map*/ .Remove(__ref._clvlibros /*b4j.example.customlistview*/ ._getvalue(__ref._libroelegido /*int*/ ));
RDebugUtils.currentLine=52953091;
 //BA.debugLineNum = 52953091;BA.debugLine="clvLibros.RemoveAt(libroElegido)";
__ref._clvlibros /*b4j.example.customlistview*/ ._removeat(__ref._libroelegido /*int*/ );
RDebugUtils.currentLine=52953092;
 //BA.debugLineNum = 52953092;BA.debugLine="libroElegido = -1";
__ref._libroelegido /*int*/  = (int) (-1);
RDebugUtils.currentLine=52953093;
 //BA.debugLineNum = 52953093;BA.debugLine="GuardarFicheroLibros";
__ref._guardarficherolibros /*String*/ (null);
 };
RDebugUtils.currentLine=52953095;
 //BA.debugLineNum = 52953095;BA.debugLine="End Sub";
return "";
}
public String  _guardarficherolibros(b4j.example.b4xpagebooks __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagebooks";
if (Debug.shouldDelegate(ba, "guardarficherolibros", false))
	 {return ((String) Debug.delegate(ba, "guardarficherolibros", null));}
String _str = "";
b4j.example.b4xmainpage._libro _tplibro = null;
RDebugUtils.currentLine=46596096;
 //BA.debugLineNum = 46596096;BA.debugLine="Private Sub GuardarFicheroLibros";
RDebugUtils.currentLine=46596097;
 //BA.debugLineNum = 46596097;BA.debugLine="Private str As String";
_str = "";
RDebugUtils.currentLine=46596098;
 //BA.debugLineNum = 46596098;BA.debugLine="For Each tpLibro As Libro In B4XPages.MainPage.ma";
{
final anywheresoftware.b4a.BA.IterableList group2 = _b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._mapalibros /*anywheresoftware.b4a.objects.collections.Map*/ .Values();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_tplibro = (b4j.example.b4xmainpage._libro)(group2.Get(index2));
RDebugUtils.currentLine=46596099;
 //BA.debugLineNum = 46596099;BA.debugLine="str = str & $\"${tpLibro.ID};${tpLibro.Título};${";
_str = _str+(""+__c.SmartStringFormatter("",(Object)(_tplibro.ID /*String*/ ))+";"+__c.SmartStringFormatter("",(Object)(_tplibro.Título /*String*/ ))+";"+__c.SmartStringFormatter("",(Object)(_tplibro.Escritor /*String*/ ))+";"+__c.SmartStringFormatter("",(Object)(_tplibro.Ano /*String*/ ))+";"+__c.SmartStringFormatter("",(Object)(_tplibro.Editorial /*String*/ ))+";"+__c.SmartStringFormatter("",(Object)(_tplibro.Estante /*int*/ ))+""+__c.SmartStringFormatter("",(Object)(__c.CRLF))+"");
 }
};
RDebugUtils.currentLine=46596101;
 //BA.debugLineNum = 46596101;BA.debugLine="File.WriteString(File.DirTemp, \"books.txt\", str)";
__c.File.WriteString(__c.File.getDirTemp(),"books.txt",_str);
RDebugUtils.currentLine=46596102;
 //BA.debugLineNum = 46596102;BA.debugLine="Log(\"Guardado en la carpeta: \" & File.DirTemp)";
__c.Log("Guardado en la carpeta: "+__c.File.getDirTemp());
RDebugUtils.currentLine=46596103;
 //BA.debugLineNum = 46596103;BA.debugLine="End Sub";
return "";
}
public String  _btninsertar_click(b4j.example.b4xpagebooks __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagebooks";
if (Debug.shouldDelegate(ba, "btninsertar_click", false))
	 {return ((String) Debug.delegate(ba, "btninsertar_click", null));}
RDebugUtils.currentLine=52166656;
 //BA.debugLineNum = 52166656;BA.debugLine="Private Sub btnInsertar_Click";
RDebugUtils.currentLine=52166657;
 //BA.debugLineNum = 52166657;BA.debugLine="InsertarLibro";
__ref._insertarlibro /*void*/ (null);
RDebugUtils.currentLine=52166658;
 //BA.debugLineNum = 52166658;BA.debugLine="End Sub";
return "";
}
public void  _insertarlibro(b4j.example.b4xpagebooks __ref) throws Exception{
RDebugUtils.currentModule="b4xpagebooks";
if (Debug.shouldDelegate(ba, "insertarlibro", false))
	 {Debug.delegate(ba, "insertarlibro", null); return;}
ResumableSub_InsertarLibro rsub = new ResumableSub_InsertarLibro(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_InsertarLibro extends BA.ResumableSub {
public ResumableSub_InsertarLibro(b4j.example.b4xpagebooks parent,b4j.example.b4xpagebooks __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xpagebooks __ref;
b4j.example.b4xpagebooks parent;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _resultado = 0;
b4j.example.b4xmainpage._libro _nuevolibro = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xpagebooks";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=53018625;
 //BA.debugLineNum = 53018625;BA.debugLine="diálogo.Initialize(Root)";
__ref._diálogo /*b4j.example.b4xdialog*/ ._initialize /*String*/ (null,ba,__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=53018626;
 //BA.debugLineNum = 53018626;BA.debugLine="diálogo.Title = \"Insertar Libro\"";
__ref._diálogo /*b4j.example.b4xdialog*/ ._title /*Object*/  = (Object)("Insertar Libro");
RDebugUtils.currentLine=53018628;
 //BA.debugLineNum = 53018628;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=53018629;
 //BA.debugLineNum = 53018629;BA.debugLine="p.SetLayoutAnimated(0,0,0, 350dip, 350dip)";
_p.SetLayoutAnimated((int) (0),0,0,parent.__c.DipToCurrent((int) (350)),parent.__c.DipToCurrent((int) (350)));
RDebugUtils.currentLine=53018631;
 //BA.debugLineNum = 53018631;BA.debugLine="p.LoadLayout(\"dlgBooks\")";
_p.LoadLayout("dlgBooks",ba);
RDebugUtils.currentLine=53018632;
 //BA.debugLineNum = 53018632;BA.debugLine="diálogo.PutAtTop = True";
__ref._diálogo /*b4j.example.b4xdialog*/ ._putattop /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=53018633;
 //BA.debugLineNum = 53018633;BA.debugLine="Wait For (diálogo.ShowCustom(p, \"OK\", \"\", \"Cancel";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xpagebooks", "insertarlibro"), __ref._diálogo /*b4j.example.b4xdialog*/ ._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("Cancelar")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (int) result[1];
;
RDebugUtils.currentLine=53018634;
 //BA.debugLineNum = 53018634;BA.debugLine="If Resultado = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=53018635;
 //BA.debugLineNum = 53018635;BA.debugLine="Private nuevoLibro As Libro";
_nuevolibro = new b4j.example.b4xmainpage._libro();
RDebugUtils.currentLine=53018636;
 //BA.debugLineNum = 53018636;BA.debugLine="nuevoLibro.ID = txtID.Text";
_nuevolibro.ID /*String*/  = __ref._txtid /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null);
RDebugUtils.currentLine=53018637;
 //BA.debugLineNum = 53018637;BA.debugLine="nuevoLibro.Título = txtTitulo.Text";
_nuevolibro.Título /*String*/  = __ref._txttitulo /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null);
RDebugUtils.currentLine=53018638;
 //BA.debugLineNum = 53018638;BA.debugLine="nuevoLibro.Escritor = txtEscritor.Text";
_nuevolibro.Escritor /*String*/  = __ref._txtescritor /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null);
RDebugUtils.currentLine=53018639;
 //BA.debugLineNum = 53018639;BA.debugLine="nuevoLibro.Ano = txtAno.Text";
_nuevolibro.Ano /*String*/  = __ref._txtano /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null);
RDebugUtils.currentLine=53018640;
 //BA.debugLineNum = 53018640;BA.debugLine="nuevoLibro.Editorial = txtEditorial.Text";
_nuevolibro.Editorial /*String*/  = __ref._txteditorial /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null);
RDebugUtils.currentLine=53018641;
 //BA.debugLineNum = 53018641;BA.debugLine="nuevoLibro.Estante = txtEstante.Text";
_nuevolibro.Estante /*int*/  = (int)(Double.parseDouble(__ref._txtestante /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null)));
RDebugUtils.currentLine=53018642;
 //BA.debugLineNum = 53018642;BA.debugLine="B4XPages.MainPage.mapaLibros.Put(nuevoLibro.ID,";
parent._b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._mapalibros /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_nuevolibro.ID /*String*/ ),(Object)(_nuevolibro));
RDebugUtils.currentLine=53018643;
 //BA.debugLineNum = 53018643;BA.debugLine="cargarLista";
__ref._cargarlista /*String*/ (null);
RDebugUtils.currentLine=53018644;
 //BA.debugLineNum = 53018644;BA.debugLine="GuardarFicheroLibros";
__ref._guardarficherolibros /*String*/ (null);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=53018646;
 //BA.debugLineNum = 53018646;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.example.b4xpagebooks __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagebooks";
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="Private clvLibros As CustomListView";
_clvlibros = new b4j.example.customlistview();
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="Private diálogo As B4XDialog";
_diálogo = new b4j.example.b4xdialog();
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="Private txtID As B4XFloatTextField";
_txtid = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="Private txtEditorial As B4XFloatTextField";
_txteditorial = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="Private txtEstante As B4XFloatTextField";
_txtestante = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="Private txtTitulo As B4XFloatTextField";
_txttitulo = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="Private txtEscritor As B4XFloatTextField";
_txtescritor = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=2097162;
 //BA.debugLineNum = 2097162;BA.debugLine="Private txtAno As B4XFloatTextField";
_txtano = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="Public libroElegido As Int";
_libroelegido = 0;
RDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="End Sub";
return "";
}
public String  _clvlibros_itemclick(b4j.example.b4xpagebooks __ref,int _índice,Object _valor) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagebooks";
if (Debug.shouldDelegate(ba, "clvlibros_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvlibros_itemclick", new Object[] {_índice,_valor}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=53739520;
 //BA.debugLineNum = 53739520;BA.debugLine="Private Sub clvLibros_ItemClick (Índice As Int, Va";
RDebugUtils.currentLine=53739521;
 //BA.debugLineNum = 53739521;BA.debugLine="If libroElegido = -1 Then";
if (__ref._libroelegido /*int*/ ==-1) { 
RDebugUtils.currentLine=53739522;
 //BA.debugLineNum = 53739522;BA.debugLine="Dim p As B4XView = clvLibros.GetPanel(Índice)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._clvlibros /*b4j.example.customlistview*/ ._getpanel(_índice);
RDebugUtils.currentLine=53739523;
 //BA.debugLineNum = 53739523;BA.debugLine="p.GetView(0).Color = xui.Color_Blue";
_p.GetView((int) (0)).setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
RDebugUtils.currentLine=53739524;
 //BA.debugLineNum = 53739524;BA.debugLine="libroElegido = Índice";
__ref._libroelegido /*int*/  = _índice;
 }else {
RDebugUtils.currentLine=53739526;
 //BA.debugLineNum = 53739526;BA.debugLine="Dim p As B4XView = clvLibros.GetPanel(libroElegi";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._clvlibros /*b4j.example.customlistview*/ ._getpanel(__ref._libroelegido /*int*/ );
RDebugUtils.currentLine=53739527;
 //BA.debugLineNum = 53739527;BA.debugLine="p.GetView(0).Color = xui.Color_White";
_p.GetView((int) (0)).setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=53739528;
 //BA.debugLineNum = 53739528;BA.debugLine="If libroElegido = Índice  Then";
if (__ref._libroelegido /*int*/ ==_índice) { 
RDebugUtils.currentLine=53739529;
 //BA.debugLineNum = 53739529;BA.debugLine="libroElegido = -1";
__ref._libroelegido /*int*/  = (int) (-1);
 }else {
RDebugUtils.currentLine=53739531;
 //BA.debugLineNum = 53739531;BA.debugLine="Dim p As B4XView = clvLibros.GetPanel(Índice)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._clvlibros /*b4j.example.customlistview*/ ._getpanel(_índice);
RDebugUtils.currentLine=53739532;
 //BA.debugLineNum = 53739532;BA.debugLine="p.GetView(0).Color = xui.Color_Blue";
_p.GetView((int) (0)).setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
RDebugUtils.currentLine=53739533;
 //BA.debugLineNum = 53739533;BA.debugLine="libroElegido = Índice";
__ref._libroelegido /*int*/  = _índice;
 };
 };
RDebugUtils.currentLine=53739536;
 //BA.debugLineNum = 53739536;BA.debugLine="End Sub";
return "";
}
}