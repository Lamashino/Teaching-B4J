package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xmainpage", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _libro{
public boolean IsInitialized;
public String ID;
public String Título;
public String Escritor;
public String Ano;
public String Editorial;
public int Estante;
public void Initialize() {
IsInitialized = true;
ID = "";
Título = "";
Escritor = "";
Ano = "";
Editorial = "";
Estante = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _estudiante{
public boolean IsInitialized;
public String ID;
public String Nombre;
public String Apellidos;
public String Clase;
public String Telefono;
public int Prestado;
public void Initialize() {
IsInitialized = true;
ID = "";
Nombre = "";
Apellidos = "";
Clase = "";
Telefono = "";
Prestado = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4j.example.b4xpagestudents _pgestudiantes = null;
public b4j.example.b4xpagebooks _pglibros = null;
public b4j.example.b4xpageborrow _pgprestar = null;
public b4j.example.b4xpagereturn _pgdevolver = null;
public anywheresoftware.b4a.objects.collections.List _lstestudiantes = null;
public anywheresoftware.b4a.objects.collections.List _lstlibros = null;
public anywheresoftware.b4a.objects.collections.Map _mapaestudiantes = null;
public anywheresoftware.b4a.objects.collections.Map _mapalibros = null;
public String _fichestudiantes = "";
public String _fichlibros = "";
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_created(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="pgEstudiantes.Initialize";
__ref._pgestudiantes /*b4j.example.b4xpagestudents*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="B4XPages.AddPage(\"pgEstudiantes\", pgEstudiantes)";
_b4xpages._addpage /*String*/ ("pgEstudiantes",(Object)(__ref._pgestudiantes /*b4j.example.b4xpagestudents*/ ));
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="pgLibros.Initialize";
__ref._pglibros /*b4j.example.b4xpagebooks*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="B4XPages.AddPage(\"pgLibros\", pgLibros)";
_b4xpages._addpage /*String*/ ("pgLibros",(Object)(__ref._pglibros /*b4j.example.b4xpagebooks*/ ));
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="pgPrestar.Initialize";
__ref._pgprestar /*b4j.example.b4xpageborrow*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="B4XPages.AddPage(\"pgPrestar\", pgPrestar)";
_b4xpages._addpage /*String*/ ("pgPrestar",(Object)(__ref._pgprestar /*b4j.example.b4xpageborrow*/ ));
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="pgDevolver.Initialize";
__ref._pgdevolver /*b4j.example.b4xpagereturn*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="B4XPages.AddPage(\"pgDevolver\", pgDevolver)";
_b4xpages._addpage /*String*/ ("pgDevolver",(Object)(__ref._pgdevolver /*b4j.example.b4xpagereturn*/ ));
RDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="lstEstudiantes = CargarEstudiantes";
__ref._lstestudiantes /*anywheresoftware.b4a.objects.collections.List*/  = __ref._cargarestudiantes /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="mapaEstudiantes = lstEstudiantesAMapa(lstEstudian";
__ref._mapaestudiantes /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._lstestudiantesamapa /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._lstestudiantes /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="lstLibros = CargarLibros";
__ref._lstlibros /*anywheresoftware.b4a.objects.collections.List*/  = __ref._cargarlibros /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=589841;
 //BA.debugLineNum = 589841;BA.debugLine="mapaLibros = lstLibrosToMap(lstLibros)";
__ref._mapalibros /*anywheresoftware.b4a.objects.collections.Map*/  = __ref._lstlibrostomap /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._lstlibros /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=589842;
 //BA.debugLineNum = 589842;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _cargarestudiantes(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "cargarestudiantes", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "cargarestudiantes", null));}
anywheresoftware.b4a.objects.collections.List _listadevuelta = null;
String[] _estud = null;
int _i = 0;
int _j = 0;
RDebugUtils.currentLine=35913728;
 //BA.debugLineNum = 35913728;BA.debugLine="Private Sub CargarEstudiantes As List";
RDebugUtils.currentLine=35913729;
 //BA.debugLineNum = 35913729;BA.debugLine="Private listaDevuelta As List";
_listadevuelta = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35913730;
 //BA.debugLineNum = 35913730;BA.debugLine="listaDevuelta.Initialize";
_listadevuelta.Initialize();
RDebugUtils.currentLine=35913731;
 //BA.debugLineNum = 35913731;BA.debugLine="Private estud(5) As String";
_estud = new String[(int) (5)];
java.util.Arrays.fill(_estud,"");
RDebugUtils.currentLine=35913733;
 //BA.debugLineNum = 35913733;BA.debugLine="Private i As Int = 0";
_i = (int) (0);
RDebugUtils.currentLine=35913734;
 //BA.debugLineNum = 35913734;BA.debugLine="For j = 0 To fichEstudiantes.Length-1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._fichestudiantes /*String*/ .length()-1);
_j = (int) (0) ;
for (;_j <= limit5 ;_j = _j + step5 ) {
RDebugUtils.currentLine=35913735;
 //BA.debugLineNum = 35913735;BA.debugLine="If fichEstudiantes.CharAt(j) <> \";\" And fichEstu";
if (__ref._fichestudiantes /*String*/ .charAt(_j)!=BA.ObjectToChar(";") && __ref._fichestudiantes /*String*/ .charAt(_j)!=BA.ObjectToChar(__c.CRLF)) { 
RDebugUtils.currentLine=35913736;
 //BA.debugLineNum = 35913736;BA.debugLine="estud(i) = estud(i) & fichEstudiantes.CharAt(j)";
_estud[_i] = _estud[_i]+BA.ObjectToString(__ref._fichestudiantes /*String*/ .charAt(_j));
 }else 
{RDebugUtils.currentLine=35913737;
 //BA.debugLineNum = 35913737;BA.debugLine="Else if fichEstudiantes.CharAt(j) = \";\" Then";
if (__ref._fichestudiantes /*String*/ .charAt(_j)==BA.ObjectToChar(";")) { 
RDebugUtils.currentLine=35913738;
 //BA.debugLineNum = 35913738;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }else 
{RDebugUtils.currentLine=35913739;
 //BA.debugLineNum = 35913739;BA.debugLine="else if fichEstudiantes.CharAt(j) = CRLF Then";
if (__ref._fichestudiantes /*String*/ .charAt(_j)==BA.ObjectToChar(__c.CRLF)) { 
RDebugUtils.currentLine=35913740;
 //BA.debugLineNum = 35913740;BA.debugLine="i = 0";
_i = (int) (0);
RDebugUtils.currentLine=35913741;
 //BA.debugLineNum = 35913741;BA.debugLine="listaDevuelta.Add(estud)";
_listadevuelta.Add((Object)(_estud));
RDebugUtils.currentLine=35913742;
 //BA.debugLineNum = 35913742;BA.debugLine="Dim estud(5) As String";
_estud = new String[(int) (5)];
java.util.Arrays.fill(_estud,"");
 }}}
;
 }
};
RDebugUtils.currentLine=35913745;
 //BA.debugLineNum = 35913745;BA.debugLine="Return listaDevuelta";
if (true) return _listadevuelta;
RDebugUtils.currentLine=35913746;
 //BA.debugLineNum = 35913746;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _lstestudiantesamapa(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "lstestudiantesamapa", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "lstestudiantesamapa", new Object[] {_lst}));}
anywheresoftware.b4a.objects.collections.Map _mestudiante = null;
int _i = 0;
String[] _estud = null;
b4j.example.b4xmainpage._estudiante _est = null;
RDebugUtils.currentLine=40370176;
 //BA.debugLineNum = 40370176;BA.debugLine="Private Sub lstEstudiantesAMapa(lst As List) As Ma";
RDebugUtils.currentLine=40370177;
 //BA.debugLineNum = 40370177;BA.debugLine="Log(\"================\" & lst.Size & \" ===========";
__c.Log("================"+BA.NumberToString(_lst.getSize())+" ==================");
RDebugUtils.currentLine=40370178;
 //BA.debugLineNum = 40370178;BA.debugLine="Private mEstudiante As Map";
_mestudiante = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=40370179;
 //BA.debugLineNum = 40370179;BA.debugLine="mEstudiante.initialize";
_mestudiante.Initialize();
RDebugUtils.currentLine=40370180;
 //BA.debugLineNum = 40370180;BA.debugLine="For i = 0 To lst.Size-1";
{
final int step4 = 1;
final int limit4 = (int) (_lst.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=40370181;
 //BA.debugLineNum = 40370181;BA.debugLine="Private estud(5) As String";
_estud = new String[(int) (5)];
java.util.Arrays.fill(_estud,"");
RDebugUtils.currentLine=40370182;
 //BA.debugLineNum = 40370182;BA.debugLine="estud = lst.Get(i)";
_estud = (String[])(_lst.Get(_i));
RDebugUtils.currentLine=40370183;
 //BA.debugLineNum = 40370183;BA.debugLine="Private est As Estudiante";
_est = new b4j.example.b4xmainpage._estudiante();
RDebugUtils.currentLine=40370184;
 //BA.debugLineNum = 40370184;BA.debugLine="est.Initialize";
_est.Initialize();
RDebugUtils.currentLine=40370185;
 //BA.debugLineNum = 40370185;BA.debugLine="est.ID = estud(0)";
_est.ID /*String*/  = _estud[(int) (0)];
RDebugUtils.currentLine=40370186;
 //BA.debugLineNum = 40370186;BA.debugLine="est.Nombre = estud(1)";
_est.Nombre /*String*/  = _estud[(int) (1)];
RDebugUtils.currentLine=40370187;
 //BA.debugLineNum = 40370187;BA.debugLine="est.Apellidos = estud(2)";
_est.Apellidos /*String*/  = _estud[(int) (2)];
RDebugUtils.currentLine=40370188;
 //BA.debugLineNum = 40370188;BA.debugLine="est.Clase = estud(3)";
_est.Clase /*String*/  = _estud[(int) (3)];
RDebugUtils.currentLine=40370189;
 //BA.debugLineNum = 40370189;BA.debugLine="est.Telefono = estud(4)";
_est.Telefono /*String*/  = _estud[(int) (4)];
RDebugUtils.currentLine=40370190;
 //BA.debugLineNum = 40370190;BA.debugLine="est.Prestado = 0";
_est.Prestado /*int*/  = (int) (0);
RDebugUtils.currentLine=40370191;
 //BA.debugLineNum = 40370191;BA.debugLine="mEstudiante.Put(estud(0), est)";
_mestudiante.Put((Object)(_estud[(int) (0)]),(Object)(_est));
 }
};
RDebugUtils.currentLine=40370193;
 //BA.debugLineNum = 40370193;BA.debugLine="Return mEstudiante";
if (true) return _mestudiante;
RDebugUtils.currentLine=40370194;
 //BA.debugLineNum = 40370194;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _cargarlibros(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "cargarlibros", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "cargarlibros", null));}
anywheresoftware.b4a.objects.collections.List _listadevuelta = null;
String[] _libro = null;
int _i = 0;
int _j = 0;
RDebugUtils.currentLine=35979264;
 //BA.debugLineNum = 35979264;BA.debugLine="Private Sub CargarLibros As List";
RDebugUtils.currentLine=35979265;
 //BA.debugLineNum = 35979265;BA.debugLine="Private listaDevuelta As List";
_listadevuelta = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35979266;
 //BA.debugLineNum = 35979266;BA.debugLine="listaDevuelta.Initialize";
_listadevuelta.Initialize();
RDebugUtils.currentLine=35979267;
 //BA.debugLineNum = 35979267;BA.debugLine="Dim libro(6) As String";
_libro = new String[(int) (6)];
java.util.Arrays.fill(_libro,"");
RDebugUtils.currentLine=35979269;
 //BA.debugLineNum = 35979269;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
RDebugUtils.currentLine=35979270;
 //BA.debugLineNum = 35979270;BA.debugLine="For j = 0 To fichLibros.Length-1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._fichlibros /*String*/ .length()-1);
_j = (int) (0) ;
for (;_j <= limit5 ;_j = _j + step5 ) {
RDebugUtils.currentLine=35979271;
 //BA.debugLineNum = 35979271;BA.debugLine="If fichLibros.CharAt(j) <> \";\" And fichLibros.Ch";
if (__ref._fichlibros /*String*/ .charAt(_j)!=BA.ObjectToChar(";") && __ref._fichlibros /*String*/ .charAt(_j)!=BA.ObjectToChar(__c.CRLF)) { 
RDebugUtils.currentLine=35979272;
 //BA.debugLineNum = 35979272;BA.debugLine="libro(i) = libro(i) & fichLibros.CharAt(j)";
_libro[_i] = _libro[_i]+BA.ObjectToString(__ref._fichlibros /*String*/ .charAt(_j));
 }else 
{RDebugUtils.currentLine=35979273;
 //BA.debugLineNum = 35979273;BA.debugLine="Else if fichLibros.CharAt(j) = \";\" Then";
if (__ref._fichlibros /*String*/ .charAt(_j)==BA.ObjectToChar(";")) { 
RDebugUtils.currentLine=35979274;
 //BA.debugLineNum = 35979274;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }else 
{RDebugUtils.currentLine=35979275;
 //BA.debugLineNum = 35979275;BA.debugLine="else if fichLibros.CharAt(j) = CRLF Then";
if (__ref._fichlibros /*String*/ .charAt(_j)==BA.ObjectToChar(__c.CRLF)) { 
RDebugUtils.currentLine=35979276;
 //BA.debugLineNum = 35979276;BA.debugLine="i = 0";
_i = (int) (0);
RDebugUtils.currentLine=35979277;
 //BA.debugLineNum = 35979277;BA.debugLine="listaDevuelta.Add(libro)";
_listadevuelta.Add((Object)(_libro));
RDebugUtils.currentLine=35979278;
 //BA.debugLineNum = 35979278;BA.debugLine="Dim libro(6) As String";
_libro = new String[(int) (6)];
java.util.Arrays.fill(_libro,"");
 }}}
;
 }
};
RDebugUtils.currentLine=35979281;
 //BA.debugLineNum = 35979281;BA.debugLine="Return listaDevuelta";
if (true) return _listadevuelta;
RDebugUtils.currentLine=35979282;
 //BA.debugLineNum = 35979282;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _lstlibrostomap(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "lstlibrostomap", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "lstlibrostomap", new Object[] {_lst}));}
anywheresoftware.b4a.objects.collections.Map _mlibro = null;
int _i = 0;
String[] _arlibro = null;
b4j.example.b4xmainpage._libro _lib = null;
RDebugUtils.currentLine=35848192;
 //BA.debugLineNum = 35848192;BA.debugLine="Private Sub lstLibrosToMap(lst As List) As Map";
RDebugUtils.currentLine=35848193;
 //BA.debugLineNum = 35848193;BA.debugLine="Private mLibro As Map";
_mlibro = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=35848194;
 //BA.debugLineNum = 35848194;BA.debugLine="mLibro.initialize";
_mlibro.Initialize();
RDebugUtils.currentLine=35848195;
 //BA.debugLineNum = 35848195;BA.debugLine="For i = 0 To lst.Size-1";
{
final int step3 = 1;
final int limit3 = (int) (_lst.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=35848196;
 //BA.debugLineNum = 35848196;BA.debugLine="Private arLibro(6) As String";
_arlibro = new String[(int) (6)];
java.util.Arrays.fill(_arlibro,"");
RDebugUtils.currentLine=35848197;
 //BA.debugLineNum = 35848197;BA.debugLine="arLibro = lst.Get(i)";
_arlibro = (String[])(_lst.Get(_i));
RDebugUtils.currentLine=35848198;
 //BA.debugLineNum = 35848198;BA.debugLine="Private  lib As Libro";
_lib = new b4j.example.b4xmainpage._libro();
RDebugUtils.currentLine=35848199;
 //BA.debugLineNum = 35848199;BA.debugLine="lib.Initialize";
_lib.Initialize();
RDebugUtils.currentLine=35848200;
 //BA.debugLineNum = 35848200;BA.debugLine="lib.ID = arLibro(0)";
_lib.ID /*String*/  = _arlibro[(int) (0)];
RDebugUtils.currentLine=35848201;
 //BA.debugLineNum = 35848201;BA.debugLine="lib.Título = arLibro(1)";
_lib.Título /*String*/  = _arlibro[(int) (1)];
RDebugUtils.currentLine=35848202;
 //BA.debugLineNum = 35848202;BA.debugLine="lib.Escritor = arLibro(2)";
_lib.Escritor /*String*/  = _arlibro[(int) (2)];
RDebugUtils.currentLine=35848203;
 //BA.debugLineNum = 35848203;BA.debugLine="lib.Ano = arLibro(3)";
_lib.Ano /*String*/  = _arlibro[(int) (3)];
RDebugUtils.currentLine=35848204;
 //BA.debugLineNum = 35848204;BA.debugLine="lib.Editorial = arLibro(4)";
_lib.Editorial /*String*/  = _arlibro[(int) (4)];
RDebugUtils.currentLine=35848205;
 //BA.debugLineNum = 35848205;BA.debugLine="lib.Estante = arLibro(5)";
_lib.Estante /*int*/  = (int)(Double.parseDouble(_arlibro[(int) (5)]));
RDebugUtils.currentLine=35848206;
 //BA.debugLineNum = 35848206;BA.debugLine="mLibro.Put(arLibro(0), lib)";
_mlibro.Put((Object)(_arlibro[(int) (0)]),(Object)(_lib));
 }
};
RDebugUtils.currentLine=35848208;
 //BA.debugLineNum = 35848208;BA.debugLine="Return mLibro";
if (true) return _mlibro;
RDebugUtils.currentLine=35848209;
 //BA.debugLineNum = 35848209;BA.debugLine="End Sub";
return null;
}
public String  _btndevolver_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btndevolver_click", false))
	 {return ((String) Debug.delegate(ba, "btndevolver_click", null));}
RDebugUtils.currentLine=46399488;
 //BA.debugLineNum = 46399488;BA.debugLine="Private Sub btnDevolver_Click";
RDebugUtils.currentLine=46399489;
 //BA.debugLineNum = 46399489;BA.debugLine="B4XPages.ShowPage(\"pgDevolver\")";
_b4xpages._showpage /*String*/ ("pgDevolver");
RDebugUtils.currentLine=46399490;
 //BA.debugLineNum = 46399490;BA.debugLine="End Sub";
return "";
}
public String  _btnestudiantes_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnestudiantes_click", false))
	 {return ((String) Debug.delegate(ba, "btnestudiantes_click", null));}
RDebugUtils.currentLine=44302336;
 //BA.debugLineNum = 44302336;BA.debugLine="Private Sub btnEstudiantes_Click";
RDebugUtils.currentLine=44302337;
 //BA.debugLineNum = 44302337;BA.debugLine="B4XPages.ShowPage(\"pgEstudiantes\")";
_b4xpages._showpage /*String*/ ("pgEstudiantes");
RDebugUtils.currentLine=44302338;
 //BA.debugLineNum = 44302338;BA.debugLine="End Sub";
return "";
}
public String  _btnlibros_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnlibros_click", false))
	 {return ((String) Debug.delegate(ba, "btnlibros_click", null));}
RDebugUtils.currentLine=45547520;
 //BA.debugLineNum = 45547520;BA.debugLine="Private Sub btnLibros_Click";
RDebugUtils.currentLine=45547521;
 //BA.debugLineNum = 45547521;BA.debugLine="B4XPages.ShowPage(\"pgLibros\")";
_b4xpages._showpage /*String*/ ("pgLibros");
RDebugUtils.currentLine=45547522;
 //BA.debugLineNum = 45547522;BA.debugLine="End Sub";
return "";
}
public String  _btnprestar_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnprestar_click", false))
	 {return ((String) Debug.delegate(ba, "btnprestar_click", null));}
RDebugUtils.currentLine=45023232;
 //BA.debugLineNum = 45023232;BA.debugLine="Private Sub btnPrestar_Click";
RDebugUtils.currentLine=45023233;
 //BA.debugLineNum = 45023233;BA.debugLine="B4XPages.ShowPage(\"pgPrestar\")";
_b4xpages._showpage /*String*/ ("pgPrestar");
RDebugUtils.currentLine=45023234;
 //BA.debugLineNum = 45023234;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="Public pgEstudiantes As B4XPageStudents";
_pgestudiantes = new b4j.example.b4xpagestudents();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Public pgLibros As B4XPageBooks";
_pglibros = new b4j.example.b4xpagebooks();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Public pgPrestar As B4XPageBorrow";
_pgprestar = new b4j.example.b4xpageborrow();
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Public pgDevolver As B4XPageReturn";
_pgdevolver = new b4j.example.b4xpagereturn();
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="Public lstEstudiantes, lstLibros As List";
_lstestudiantes = new anywheresoftware.b4a.objects.collections.List();
_lstlibros = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="Public mapaEstudiantes As Map";
_mapaestudiantes = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="Public mapaLibros As Map";
_mapalibros = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="Type Libro(ID As String, Título As String, Escrit";
;
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="Type Estudiante(ID As String, Nombre As String, A";
;
RDebugUtils.currentLine=458766;
 //BA.debugLineNum = 458766;BA.debugLine="Public fichEstudiantes As String";
_fichestudiantes = "";
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="Public fichLibros As String";
_fichlibros = "";
RDebugUtils.currentLine=458768;
 //BA.debugLineNum = 458768;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="fichEstudiantes  = File.ReadString(File.DirAssets";
__ref._fichestudiantes /*String*/  = __c.File.ReadString(__c.File.getDirAssets(),"students.txt");
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="fichLibros  = File.ReadString(File.DirAssets, \"bo";
__ref._fichlibros /*String*/  = __c.File.ReadString(__c.File.getDirAssets(),"books.txt");
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="End Sub";
return "";
}
public String  _mostrarestudiantes(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "mostrarestudiantes", false))
	 {return ((String) Debug.delegate(ba, "mostrarestudiantes", new Object[] {_lst}));}
int _i = 0;
String[] _estud = null;
RDebugUtils.currentLine=37879808;
 //BA.debugLineNum = 37879808;BA.debugLine="Private Sub MostrarEstudiantes(lst As List)";
RDebugUtils.currentLine=37879809;
 //BA.debugLineNum = 37879809;BA.debugLine="Log(\"================\" & lst.Size & \" ===========";
__c.Log("================"+BA.NumberToString(_lst.getSize())+" ==================");
RDebugUtils.currentLine=37879810;
 //BA.debugLineNum = 37879810;BA.debugLine="For i = 0 To lst.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (_lst.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=37879811;
 //BA.debugLineNum = 37879811;BA.debugLine="Dim estud(5) As String";
_estud = new String[(int) (5)];
java.util.Arrays.fill(_estud,"");
RDebugUtils.currentLine=37879812;
 //BA.debugLineNum = 37879812;BA.debugLine="estud = lst.Get(i)";
_estud = (String[])(_lst.Get(_i));
RDebugUtils.currentLine=37879813;
 //BA.debugLineNum = 37879813;BA.debugLine="Log(\"-------------------------------------------";
__c.Log("--------------------------------------------------------");
RDebugUtils.currentLine=37879814;
 //BA.debugLineNum = 37879814;BA.debugLine="Log($\"${estud(0)} ${estud(1)} ${estud(2)} ${estu";
__c.Log((""+__c.SmartStringFormatter("",(Object)(_estud[(int) (0)]))+" "+__c.SmartStringFormatter("",(Object)(_estud[(int) (1)]))+" "+__c.SmartStringFormatter("",(Object)(_estud[(int) (2)]))+" "+__c.SmartStringFormatter("",(Object)(_estud[(int) (3)]))+" "+__c.SmartStringFormatter("",(Object)(_estud[(int) (4)]))+""));
 }
};
RDebugUtils.currentLine=37879816;
 //BA.debugLineNum = 37879816;BA.debugLine="Log(\"============================================";
__c.Log("====================================================");
RDebugUtils.currentLine=37879817;
 //BA.debugLineNum = 37879817;BA.debugLine="End Sub";
return "";
}
public String  _mostrarlibros(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "mostrarlibros", false))
	 {return ((String) Debug.delegate(ba, "mostrarlibros", new Object[] {_lst}));}
int _i = 0;
String[] _lib = null;
RDebugUtils.currentLine=42991616;
 //BA.debugLineNum = 42991616;BA.debugLine="Private Sub MostrarLibros(lst As List)";
RDebugUtils.currentLine=42991617;
 //BA.debugLineNum = 42991617;BA.debugLine="Log(\"================\" & lst.Size & \" ===========";
__c.Log("================"+BA.NumberToString(_lst.getSize())+" ==================");
RDebugUtils.currentLine=42991618;
 //BA.debugLineNum = 42991618;BA.debugLine="For i = 0 To lst.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (_lst.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=42991619;
 //BA.debugLineNum = 42991619;BA.debugLine="Dim lib(6) As String";
_lib = new String[(int) (6)];
java.util.Arrays.fill(_lib,"");
RDebugUtils.currentLine=42991620;
 //BA.debugLineNum = 42991620;BA.debugLine="lib = lst.Get(i)";
_lib = (String[])(_lst.Get(_i));
RDebugUtils.currentLine=42991621;
 //BA.debugLineNum = 42991621;BA.debugLine="Log(\"-------------------------------------------";
__c.Log("--------------------------------------------------------");
RDebugUtils.currentLine=42991622;
 //BA.debugLineNum = 42991622;BA.debugLine="Log($\"${lib(0)} ${lib(1)} ${lib(2)} ${lib(3)} ${";
__c.Log((""+__c.SmartStringFormatter("",(Object)(_lib[(int) (0)]))+" "+__c.SmartStringFormatter("",(Object)(_lib[(int) (1)]))+" "+__c.SmartStringFormatter("",(Object)(_lib[(int) (2)]))+" "+__c.SmartStringFormatter("",(Object)(_lib[(int) (3)]))+" "+__c.SmartStringFormatter("",(Object)(_lib[(int) (4)]))+" "+__c.SmartStringFormatter("",(Object)(_lib[(int) (5)]))+""));
 }
};
RDebugUtils.currentLine=42991624;
 //BA.debugLineNum = 42991624;BA.debugLine="Log(\"============================================";
__c.Log("====================================================");
RDebugUtils.currentLine=42991625;
 //BA.debugLineNum = 42991625;BA.debugLine="End Sub";
return "";
}
public String  _mostrarmapaestudiantes(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "mostrarmapaestudiantes", false))
	 {return ((String) Debug.delegate(ba, "mostrarmapaestudiantes", null));}
String _clave = "";
b4j.example.b4xmainpage._estudiante _tp = null;
RDebugUtils.currentLine=39649280;
 //BA.debugLineNum = 39649280;BA.debugLine="Public Sub MostrarMapaEstudiantes";
RDebugUtils.currentLine=39649281;
 //BA.debugLineNum = 39649281;BA.debugLine="For Each clave As String In mapaEstudiantes.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._mapaestudiantes /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_clave = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=39649282;
 //BA.debugLineNum = 39649282;BA.debugLine="Dim tp As Estudiante";
_tp = new b4j.example.b4xmainpage._estudiante();
RDebugUtils.currentLine=39649283;
 //BA.debugLineNum = 39649283;BA.debugLine="tp = mapaEstudiantes.Get(clave)";
_tp = (b4j.example.b4xmainpage._estudiante)(__ref._mapaestudiantes /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_clave)));
RDebugUtils.currentLine=39649284;
 //BA.debugLineNum = 39649284;BA.debugLine="Log($\"${clave} ${tp.Nombre} ${tp.Apellidos} ${tp";
__c.Log((""+__c.SmartStringFormatter("",(Object)(_clave))+" "+__c.SmartStringFormatter("",(Object)(_tp.Nombre /*String*/ ))+" "+__c.SmartStringFormatter("",(Object)(_tp.Apellidos /*String*/ ))+" "+__c.SmartStringFormatter("",(Object)(_tp.Clase /*String*/ ))+" "+__c.SmartStringFormatter("",(Object)(_tp.Telefono /*String*/ ))+" "+__c.SmartStringFormatter("",(Object)(_tp.Prestado /*int*/ ))+""));
 }
};
RDebugUtils.currentLine=39649286;
 //BA.debugLineNum = 39649286;BA.debugLine="End Sub";
return "";
}
public String  _mostrarmapalibros(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "mostrarmapalibros", false))
	 {return ((String) Debug.delegate(ba, "mostrarmapalibros", null));}
String _clave = "";
b4j.example.b4xmainpage._libro _lib = null;
RDebugUtils.currentLine=41484288;
 //BA.debugLineNum = 41484288;BA.debugLine="Public Sub MostrarMapaLibros";
RDebugUtils.currentLine=41484289;
 //BA.debugLineNum = 41484289;BA.debugLine="For Each clave As String In mapaLibros.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._mapalibros /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_clave = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=41484290;
 //BA.debugLineNum = 41484290;BA.debugLine="Dim lib As Libro";
_lib = new b4j.example.b4xmainpage._libro();
RDebugUtils.currentLine=41484291;
 //BA.debugLineNum = 41484291;BA.debugLine="lib = mapaLibros.Get(clave)";
_lib = (b4j.example.b4xmainpage._libro)(__ref._mapalibros /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_clave)));
RDebugUtils.currentLine=41484292;
 //BA.debugLineNum = 41484292;BA.debugLine="Log($\"${clave} ${lib.Título} ${lib.Escritor} ${l";
__c.Log((""+__c.SmartStringFormatter("",(Object)(_clave))+" "+__c.SmartStringFormatter("",(Object)(_lib.Título /*String*/ ))+" "+__c.SmartStringFormatter("",(Object)(_lib.Escritor /*String*/ ))+" "+__c.SmartStringFormatter("",(Object)(_lib.Ano /*String*/ ))+" "+__c.SmartStringFormatter("",(Object)(_lib.Editorial /*String*/ ))+" "+__c.SmartStringFormatter("",(Object)(_lib.Estante /*int*/ ))+""));
 }
};
RDebugUtils.currentLine=41484294;
 //BA.debugLineNum = 41484294;BA.debugLine="End Sub";
return "";
}
}