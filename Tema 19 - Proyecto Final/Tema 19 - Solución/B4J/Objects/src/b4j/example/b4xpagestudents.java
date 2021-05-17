package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xpagestudents extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xpagestudents", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xpagestudents.class).invoke(this, new Object[] {null});
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
public b4j.example.customlistview _clvestudiantes = null;
public b4j.example.b4xdialog _diálogo = null;
public b4j.example.b4xfloattextfield _txtclase = null;
public b4j.example.b4xfloattextfield _txtnombre = null;
public b4j.example.b4xfloattextfield _txtid = null;
public b4j.example.b4xfloattextfield _txtapellidos = null;
public b4j.example.b4xfloattextfield _txttelefono = null;
public int _estudianteelegido = 0;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4j.example.b4xpagestudents __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xpagestudents";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return null;
}
public String  _anadirespacios(b4j.example.b4xpagestudents __ref,String _s1,int _pos) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagestudents";
if (Debug.shouldDelegate(ba, "anadirespacios", false))
	 {return ((String) Debug.delegate(ba, "anadirespacios", new Object[] {_s1,_pos}));}
RDebugUtils.currentLine=46530560;
 //BA.debugLineNum = 46530560;BA.debugLine="Private Sub anadirEspacios(s1 As String, pos As In";
RDebugUtils.currentLine=46530561;
 //BA.debugLineNum = 46530561;BA.debugLine="If pos = 1 Then";
if (_pos==1) { 
RDebugUtils.currentLine=46530562;
 //BA.debugLineNum = 46530562;BA.debugLine="Do While s1.Length <= 5";
while (_s1.length()<=5) {
RDebugUtils.currentLine=46530563;
 //BA.debugLineNum = 46530563;BA.debugLine="s1 = s1 & \" \"";
_s1 = _s1+" ";
 }
;
 }else 
{RDebugUtils.currentLine=46530565;
 //BA.debugLineNum = 46530565;BA.debugLine="else if pos = 2 Or pos = 3 Then";
if (_pos==2 || _pos==3) { 
RDebugUtils.currentLine=46530566;
 //BA.debugLineNum = 46530566;BA.debugLine="Do While s1.Length <= 20";
while (_s1.length()<=20) {
RDebugUtils.currentLine=46530567;
 //BA.debugLineNum = 46530567;BA.debugLine="s1 = s1 & \" \"";
_s1 = _s1+" ";
 }
;
 }else 
{RDebugUtils.currentLine=46530569;
 //BA.debugLineNum = 46530569;BA.debugLine="else if pos = 4 Then";
if (_pos==4) { 
RDebugUtils.currentLine=46530570;
 //BA.debugLineNum = 46530570;BA.debugLine="Do While s1.Length <= 3";
while (_s1.length()<=3) {
RDebugUtils.currentLine=46530571;
 //BA.debugLineNum = 46530571;BA.debugLine="s1 = s1 & \" \"";
_s1 = _s1+" ";
 }
;
 }else 
{RDebugUtils.currentLine=46530573;
 //BA.debugLineNum = 46530573;BA.debugLine="else if pos = 5 Then";
if (_pos==5) { 
RDebugUtils.currentLine=46530574;
 //BA.debugLineNum = 46530574;BA.debugLine="Do While s1.Length <= 12";
while (_s1.length()<=12) {
RDebugUtils.currentLine=46530575;
 //BA.debugLineNum = 46530575;BA.debugLine="s1 = s1 & \" \"";
_s1 = _s1+" ";
 }
;
 }}}}
;
RDebugUtils.currentLine=46530578;
 //BA.debugLineNum = 46530578;BA.debugLine="Return s1";
if (true) return _s1;
RDebugUtils.currentLine=46530579;
 //BA.debugLineNum = 46530579;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4j.example.b4xpagestudents __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagestudents";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="Root.LoadLayout(\"fmrStudents\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("fmrStudents",ba);
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="cargarLista";
__ref._cargarlista /*String*/ (null);
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="End Sub";
return "";
}
public String  _cargarlista(b4j.example.b4xpagestudents __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagestudents";
if (Debug.shouldDelegate(ba, "cargarlista", false))
	 {return ((String) Debug.delegate(ba, "cargarlista", null));}
b4j.example.b4xmainpage._estudiante _tpest = null;
String _s1 = "";
String _s2 = "";
String _s3 = "";
String _s4 = "";
String _s5 = "";
String _str = "";
RDebugUtils.currentLine=52035584;
 //BA.debugLineNum = 52035584;BA.debugLine="Private Sub cargarLista";
RDebugUtils.currentLine=52035585;
 //BA.debugLineNum = 52035585;BA.debugLine="For Each tpEst As Estudiante In B4XPages.MainPage";
{
final anywheresoftware.b4a.BA.IterableList group1 = _b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._mapaestudiantes /*anywheresoftware.b4a.objects.collections.Map*/ .Values();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_tpest = (b4j.example.b4xmainpage._estudiante)(group1.Get(index1));
RDebugUtils.currentLine=52035586;
 //BA.debugLineNum = 52035586;BA.debugLine="Private s1, s2, s3, s4, s5, str As String";
_s1 = "";
_s2 = "";
_s3 = "";
_s4 = "";
_s5 = "";
_str = "";
RDebugUtils.currentLine=52035587;
 //BA.debugLineNum = 52035587;BA.debugLine="s1 = anadirEspacios(tpEst.ID, 1)";
_s1 = __ref._anadirespacios /*String*/ (null,_tpest.ID /*String*/ ,(int) (1));
RDebugUtils.currentLine=52035588;
 //BA.debugLineNum = 52035588;BA.debugLine="s2 = anadirEspacios(tpEst.Nombre, 2)";
_s2 = __ref._anadirespacios /*String*/ (null,_tpest.Nombre /*String*/ ,(int) (2));
RDebugUtils.currentLine=52035589;
 //BA.debugLineNum = 52035589;BA.debugLine="s3 = anadirEspacios(tpEst.Apellidos, 3)";
_s3 = __ref._anadirespacios /*String*/ (null,_tpest.Apellidos /*String*/ ,(int) (3));
RDebugUtils.currentLine=52035590;
 //BA.debugLineNum = 52035590;BA.debugLine="s4 = anadirEspacios(tpEst.Clase, 4)";
_s4 = __ref._anadirespacios /*String*/ (null,_tpest.Clase /*String*/ ,(int) (4));
RDebugUtils.currentLine=52035591;
 //BA.debugLineNum = 52035591;BA.debugLine="s5 = anadirEspacios(tpEst.Telefono, 5)";
_s5 = __ref._anadirespacios /*String*/ (null,_tpest.Telefono /*String*/ ,(int) (5));
RDebugUtils.currentLine=52035593;
 //BA.debugLineNum = 52035593;BA.debugLine="str = $\"${s1}${s2}${s3}${s4}${s5}\"$";
_str = (""+__c.SmartStringFormatter("",(Object)(_s1))+""+__c.SmartStringFormatter("",(Object)(_s2))+""+__c.SmartStringFormatter("",(Object)(_s3))+""+__c.SmartStringFormatter("",(Object)(_s4))+""+__c.SmartStringFormatter("",(Object)(_s5))+"");
RDebugUtils.currentLine=52035594;
 //BA.debugLineNum = 52035594;BA.debugLine="clvEstudiantes.AddTextItem(str, tpEst.ID)";
__ref._clvestudiantes /*b4j.example.customlistview*/ ._addtextitem((Object)(_str),(Object)(_tpest.ID /*String*/ ));
 }
};
RDebugUtils.currentLine=52035596;
 //BA.debugLineNum = 52035596;BA.debugLine="End Sub";
return "";
}
public String  _btnborrar_click(b4j.example.b4xpagestudents __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagestudents";
if (Debug.shouldDelegate(ba, "btnborrar_click", false))
	 {return ((String) Debug.delegate(ba, "btnborrar_click", null));}
RDebugUtils.currentLine=50266112;
 //BA.debugLineNum = 50266112;BA.debugLine="Private Sub btnBorrar_Click";
RDebugUtils.currentLine=50266113;
 //BA.debugLineNum = 50266113;BA.debugLine="If estudianteElegido <> - 1 Then";
if (__ref._estudianteelegido /*int*/ !=-1) { 
RDebugUtils.currentLine=50266114;
 //BA.debugLineNum = 50266114;BA.debugLine="B4XPages.MainPage.mapaEstudiantes.Remove(clvEstu";
_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._mapaestudiantes /*anywheresoftware.b4a.objects.collections.Map*/ .Remove(__ref._clvestudiantes /*b4j.example.customlistview*/ ._getvalue(__ref._estudianteelegido /*int*/ ));
RDebugUtils.currentLine=50266115;
 //BA.debugLineNum = 50266115;BA.debugLine="clvEstudiantes.RemoveAt(estudianteElegido)";
__ref._clvestudiantes /*b4j.example.customlistview*/ ._removeat(__ref._estudianteelegido /*int*/ );
RDebugUtils.currentLine=50266116;
 //BA.debugLineNum = 50266116;BA.debugLine="estudianteElegido = -1";
__ref._estudianteelegido /*int*/  = (int) (-1);
RDebugUtils.currentLine=50266117;
 //BA.debugLineNum = 50266117;BA.debugLine="guardarFicheroEstudiantes";
__ref._guardarficheroestudiantes /*String*/ (null);
 };
RDebugUtils.currentLine=50266119;
 //BA.debugLineNum = 50266119;BA.debugLine="End Sub";
return "";
}
public String  _guardarficheroestudiantes(b4j.example.b4xpagestudents __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagestudents";
if (Debug.shouldDelegate(ba, "guardarficheroestudiantes", false))
	 {return ((String) Debug.delegate(ba, "guardarficheroestudiantes", null));}
String _str = "";
b4j.example.b4xmainpage._estudiante _tpest = null;
RDebugUtils.currentLine=50331648;
 //BA.debugLineNum = 50331648;BA.debugLine="Private Sub guardarFicheroEstudiantes";
RDebugUtils.currentLine=50331649;
 //BA.debugLineNum = 50331649;BA.debugLine="Private str As String";
_str = "";
RDebugUtils.currentLine=50331650;
 //BA.debugLineNum = 50331650;BA.debugLine="For Each tpEst As Estudiante In B4XPages.MainPage";
{
final anywheresoftware.b4a.BA.IterableList group2 = _b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._mapaestudiantes /*anywheresoftware.b4a.objects.collections.Map*/ .Values();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_tpest = (b4j.example.b4xmainpage._estudiante)(group2.Get(index2));
RDebugUtils.currentLine=50331651;
 //BA.debugLineNum = 50331651;BA.debugLine="str = str & $\"${tpEst.ID};${tpEst.Nombre};${tpEs";
_str = _str+(""+__c.SmartStringFormatter("",(Object)(_tpest.ID /*String*/ ))+";"+__c.SmartStringFormatter("",(Object)(_tpest.Nombre /*String*/ ))+";"+__c.SmartStringFormatter("",(Object)(_tpest.Apellidos /*String*/ ))+";"+__c.SmartStringFormatter("",(Object)(_tpest.Clase /*String*/ ))+";"+__c.SmartStringFormatter("",(Object)(_tpest.Telefono /*String*/ ))+""+__c.SmartStringFormatter("",(Object)(__c.CRLF))+"");
RDebugUtils.currentLine=50331652;
 //BA.debugLineNum = 50331652;BA.debugLine="File.WriteString(File.DirTemp, \"students.txt\", s";
__c.File.WriteString(__c.File.getDirTemp(),"students.txt",_str);
 }
};
RDebugUtils.currentLine=50331654;
 //BA.debugLineNum = 50331654;BA.debugLine="Log(\"Guardado en la carpeta: \" & File.DirTemp)";
__c.Log("Guardado en la carpeta: "+__c.File.getDirTemp());
RDebugUtils.currentLine=50331655;
 //BA.debugLineNum = 50331655;BA.debugLine="End Sub";
return "";
}
public String  _btninsertar_click(b4j.example.b4xpagestudents __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagestudents";
if (Debug.shouldDelegate(ba, "btninsertar_click", false))
	 {return ((String) Debug.delegate(ba, "btninsertar_click", null));}
RDebugUtils.currentLine=49479680;
 //BA.debugLineNum = 49479680;BA.debugLine="Private Sub btnInsertar_Click";
RDebugUtils.currentLine=49479681;
 //BA.debugLineNum = 49479681;BA.debugLine="InsertarEstudiante";
__ref._insertarestudiante /*void*/ (null);
RDebugUtils.currentLine=49479682;
 //BA.debugLineNum = 49479682;BA.debugLine="End Sub";
return "";
}
public void  _insertarestudiante(b4j.example.b4xpagestudents __ref) throws Exception{
RDebugUtils.currentModule="b4xpagestudents";
if (Debug.shouldDelegate(ba, "insertarestudiante", false))
	 {Debug.delegate(ba, "insertarestudiante", null); return;}
ResumableSub_InsertarEstudiante rsub = new ResumableSub_InsertarEstudiante(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_InsertarEstudiante extends BA.ResumableSub {
public ResumableSub_InsertarEstudiante(b4j.example.b4xpagestudents parent,b4j.example.b4xpagestudents __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xpagestudents __ref;
b4j.example.b4xpagestudents parent;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _resultado = 0;
b4j.example.b4xmainpage._estudiante _nuevoestudiante = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xpagestudents";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=51380225;
 //BA.debugLineNum = 51380225;BA.debugLine="diálogo.Initialize(Root)";
__ref._diálogo /*b4j.example.b4xdialog*/ ._initialize /*String*/ (null,ba,__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=51380226;
 //BA.debugLineNum = 51380226;BA.debugLine="diálogo.Title = \"Insertar Estudiante\"";
__ref._diálogo /*b4j.example.b4xdialog*/ ._title /*Object*/  = (Object)("Insertar Estudiante");
RDebugUtils.currentLine=51380228;
 //BA.debugLineNum = 51380228;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=51380229;
 //BA.debugLineNum = 51380229;BA.debugLine="p.SetLayoutAnimated(0,0,0, 350dip, 350dip)";
_p.SetLayoutAnimated((int) (0),0,0,parent.__c.DipToCurrent((int) (350)),parent.__c.DipToCurrent((int) (350)));
RDebugUtils.currentLine=51380231;
 //BA.debugLineNum = 51380231;BA.debugLine="p.LoadLayout(\"dlgStudents\")";
_p.LoadLayout("dlgStudents",ba);
RDebugUtils.currentLine=51380232;
 //BA.debugLineNum = 51380232;BA.debugLine="diálogo.PutAtTop = True";
__ref._diálogo /*b4j.example.b4xdialog*/ ._putattop /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=51380233;
 //BA.debugLineNum = 51380233;BA.debugLine="Wait For (diálogo.ShowCustom(p, \"OK\", \"\", \"Cancel";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xpagestudents", "insertarestudiante"), __ref._diálogo /*b4j.example.b4xdialog*/ ._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("Cancelar")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (int) result[1];
;
RDebugUtils.currentLine=51380234;
 //BA.debugLineNum = 51380234;BA.debugLine="If Resultado = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=51380235;
 //BA.debugLineNum = 51380235;BA.debugLine="Private nuevoEstudiante As Estudiante";
_nuevoestudiante = new b4j.example.b4xmainpage._estudiante();
RDebugUtils.currentLine=51380236;
 //BA.debugLineNum = 51380236;BA.debugLine="nuevoEstudiante.ID = txtID.Text";
_nuevoestudiante.ID /*String*/  = __ref._txtid /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null);
RDebugUtils.currentLine=51380237;
 //BA.debugLineNum = 51380237;BA.debugLine="nuevoEstudiante.Nombre = txtNombre.Text";
_nuevoestudiante.Nombre /*String*/  = __ref._txtnombre /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null);
RDebugUtils.currentLine=51380238;
 //BA.debugLineNum = 51380238;BA.debugLine="nuevoEstudiante.Apellidos = txtApellidos.Text";
_nuevoestudiante.Apellidos /*String*/  = __ref._txtapellidos /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null);
RDebugUtils.currentLine=51380239;
 //BA.debugLineNum = 51380239;BA.debugLine="nuevoEstudiante.Telefono = txtTelefono.Text";
_nuevoestudiante.Telefono /*String*/  = __ref._txttelefono /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null);
RDebugUtils.currentLine=51380240;
 //BA.debugLineNum = 51380240;BA.debugLine="nuevoEstudiante.Clase = txtClase.Text";
_nuevoestudiante.Clase /*String*/  = __ref._txtclase /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null);
RDebugUtils.currentLine=51380241;
 //BA.debugLineNum = 51380241;BA.debugLine="B4XPages.MainPage.mapaEstudiantes.Put(nuevoEstud";
parent._b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._mapaestudiantes /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_nuevoestudiante.ID /*String*/ ),(Object)(_nuevoestudiante));
RDebugUtils.currentLine=51380242;
 //BA.debugLineNum = 51380242;BA.debugLine="cargarLista";
__ref._cargarlista /*String*/ (null);
RDebugUtils.currentLine=51380243;
 //BA.debugLineNum = 51380243;BA.debugLine="guardarFicheroEstudiantes";
__ref._guardarficheroestudiantes /*String*/ (null);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=51380245;
 //BA.debugLineNum = 51380245;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.example.b4xpagestudents __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagestudents";
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="Private clvEstudiantes As CustomListView";
_clvestudiantes = new b4j.example.customlistview();
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="Private diálogo As B4XDialog";
_diálogo = new b4j.example.b4xdialog();
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="Private txtClase As B4XFloatTextField";
_txtclase = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="Private txtNombre As B4XFloatTextField";
_txtnombre = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="Private txtID As B4XFloatTextField";
_txtid = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="Private txtApellidos As B4XFloatTextField";
_txtapellidos = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="Private txtTelefono As B4XFloatTextField";
_txttelefono = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=1441802;
 //BA.debugLineNum = 1441802;BA.debugLine="Public estudianteElegido As Int  = -1";
_estudianteelegido = (int) (-1);
RDebugUtils.currentLine=1441803;
 //BA.debugLineNum = 1441803;BA.debugLine="End Sub";
return "";
}
public String  _clvestudiantes_itemclick(b4j.example.b4xpagestudents __ref,int _índice,Object _valor) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagestudents";
if (Debug.shouldDelegate(ba, "clvestudiantes_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvestudiantes_itemclick", new Object[] {_índice,_valor}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=49348608;
 //BA.debugLineNum = 49348608;BA.debugLine="Private Sub clvEstudiantes_ItemClick (Índice As In";
RDebugUtils.currentLine=49348609;
 //BA.debugLineNum = 49348609;BA.debugLine="If estudianteElegido = -1 Then";
if (__ref._estudianteelegido /*int*/ ==-1) { 
RDebugUtils.currentLine=49348610;
 //BA.debugLineNum = 49348610;BA.debugLine="Dim p As B4XView = clvEstudiantes.GetPanel(Índic";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._clvestudiantes /*b4j.example.customlistview*/ ._getpanel(_índice);
RDebugUtils.currentLine=49348611;
 //BA.debugLineNum = 49348611;BA.debugLine="p.GetView(0).Color = xui.Color_Blue";
_p.GetView((int) (0)).setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
RDebugUtils.currentLine=49348612;
 //BA.debugLineNum = 49348612;BA.debugLine="estudianteElegido = Índice";
__ref._estudianteelegido /*int*/  = _índice;
 }else {
RDebugUtils.currentLine=49348614;
 //BA.debugLineNum = 49348614;BA.debugLine="Dim p As B4XView = clvEstudiantes.GetPanel(estud";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._clvestudiantes /*b4j.example.customlistview*/ ._getpanel(__ref._estudianteelegido /*int*/ );
RDebugUtils.currentLine=49348615;
 //BA.debugLineNum = 49348615;BA.debugLine="p.GetView(0).Color = xui.Color_White";
_p.GetView((int) (0)).setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=49348616;
 //BA.debugLineNum = 49348616;BA.debugLine="If estudianteElegido = Índice  Then";
if (__ref._estudianteelegido /*int*/ ==_índice) { 
RDebugUtils.currentLine=49348617;
 //BA.debugLineNum = 49348617;BA.debugLine="estudianteElegido = -1";
__ref._estudianteelegido /*int*/  = (int) (-1);
 }else {
RDebugUtils.currentLine=49348619;
 //BA.debugLineNum = 49348619;BA.debugLine="Dim p As B4XView = clvEstudiantes.GetPanel(Índi";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._clvestudiantes /*b4j.example.customlistview*/ ._getpanel(_índice);
RDebugUtils.currentLine=49348620;
 //BA.debugLineNum = 49348620;BA.debugLine="p.GetView(0).Color = xui.Color_Blue";
_p.GetView((int) (0)).setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
RDebugUtils.currentLine=49348621;
 //BA.debugLineNum = 49348621;BA.debugLine="estudianteElegido = Índice";
__ref._estudianteelegido /*int*/  = _índice;
 };
 };
RDebugUtils.currentLine=49348624;
 //BA.debugLineNum = 49348624;BA.debugLine="End Sub";
return "";
}
}