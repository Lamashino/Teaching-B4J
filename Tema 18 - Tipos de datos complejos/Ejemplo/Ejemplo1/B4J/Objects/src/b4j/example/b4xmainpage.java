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
public static class _estudiante{
public boolean IsInitialized;
public String ID;
public String Apellidos;
public String Nombre;
public String Dirección;
public String Teléfono;
public void Initialize() {
IsInitialized = true;
ID = "";
Apellidos = "";
Nombre = "";
Dirección = "";
Teléfono = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4j.example.b4xmainpage._estudiante _estudiante1 = null;
public b4j.example.b4xmainpage._estudiante _estudiante2 = null;
public anywheresoftware.b4a.objects.collections.List _listaestudiantes = null;
public anywheresoftware.b4a.objects.collections.Map _mapstudents = null;
public b4j.example.keyvaluestore _kvsfile = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _b4xpage_created(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
int _i = 0;
b4j.example.b4xmainpage._estudiante _est = null;
b4j.example.b4xmainpage._estudiante _estudiante3 = null;
anywheresoftware.b4a.objects.collections.List _claves = null;
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Estudiante1.ID = \"FS23534X21\"";
__ref._estudiante1 /*b4j.example.b4xmainpage._estudiante*/ .ID /*String*/  = "FS23534X21";
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Estudiante1.Apellidos = \"Ioannidis\"";
__ref._estudiante1 /*b4j.example.b4xmainpage._estudiante*/ .Apellidos /*String*/  = "Ioannidis";
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Estudiante1.Nombre = \"Alkinoos\"";
__ref._estudiante1 /*b4j.example.b4xmainpage._estudiante*/ .Nombre /*String*/  = "Alkinoos";
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="Estudiante1.Dirección = \"Atenas, Grecia\"";
__ref._estudiante1 /*b4j.example.b4xmainpage._estudiante*/ .Dirección /*String*/  = "Atenas, Grecia";
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="Estudiante1.Teléfono = \"+303465854234\"";
__ref._estudiante1 /*b4j.example.b4xmainpage._estudiante*/ .Teléfono /*String*/  = "+303465854234";
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="Log(Estudiante1)";
__c.Log(BA.ObjectToString(__ref._estudiante1 /*b4j.example.b4xmainpage._estudiante*/ ));
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="listaEstudiantes.Initialize";
__ref._listaestudiantes /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="listaEstudiantes.Add(Estudiante1)";
__ref._listaestudiantes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._estudiante1 /*b4j.example.b4xmainpage._estudiante*/ ));
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="For i = 0 To listaEstudiantes.Size-1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._listaestudiantes /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=589839;
 //BA.debugLineNum = 589839;BA.debugLine="Private est As Estudiante";
_est = new b4j.example.b4xmainpage._estudiante();
RDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="est = listaEstudiantes.Get(i)";
_est = (b4j.example.b4xmainpage._estudiante)(__ref._listaestudiantes /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=589841;
 //BA.debugLineNum = 589841;BA.debugLine="LogEstudiante(est)";
__ref._logestudiante /*String*/ (null,_est);
 }
};
RDebugUtils.currentLine=589844;
 //BA.debugLineNum = 589844;BA.debugLine="mapStudents.Initialize";
__ref._mapstudents /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=589845;
 //BA.debugLineNum = 589845;BA.debugLine="mapStudents.Put(Estudiante1.ID, Estudiante1)";
__ref._mapstudents /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._estudiante1 /*b4j.example.b4xmainpage._estudiante*/ .ID /*String*/ ),(Object)(__ref._estudiante1 /*b4j.example.b4xmainpage._estudiante*/ ));
RDebugUtils.currentLine=589847;
 //BA.debugLineNum = 589847;BA.debugLine="File.MakeDir(File.DirTemp, \"tema18\")";
__c.File.MakeDir(__c.File.getDirTemp(),"tema18");
RDebugUtils.currentLine=589848;
 //BA.debugLineNum = 589848;BA.debugLine="kvsFile.Initialize(File.DirTemp & \"tema18\", \"kvsD";
__ref._kvsfile /*b4j.example.keyvaluestore*/ ._initialize /*String*/ (null,ba,__c.File.getDirTemp()+"tema18","kvsData.dat");
RDebugUtils.currentLine=589849;
 //BA.debugLineNum = 589849;BA.debugLine="Log(File.DirTemp & \"tema18\")";
__c.Log(__c.File.getDirTemp()+"tema18");
RDebugUtils.currentLine=589851;
 //BA.debugLineNum = 589851;BA.debugLine="kvsFile.Put(Estudiante1.ID, Estudiante1)";
__ref._kvsfile /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,__ref._estudiante1 /*b4j.example.b4xmainpage._estudiante*/ .ID /*String*/ ,(Object)(__ref._estudiante1 /*b4j.example.b4xmainpage._estudiante*/ ));
RDebugUtils.currentLine=589852;
 //BA.debugLineNum = 589852;BA.debugLine="kvsFile.PutMapAsync(mapStudents)";
__ref._kvsfile /*b4j.example.keyvaluestore*/ ._putmapasync /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._mapstudents /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=589854;
 //BA.debugLineNum = 589854;BA.debugLine="Private Estudiante3 As Estudiante";
_estudiante3 = new b4j.example.b4xmainpage._estudiante();
RDebugUtils.currentLine=589855;
 //BA.debugLineNum = 589855;BA.debugLine="If kvsFile.ContainsKey(\"FS23534X21\") Then";
if (__ref._kvsfile /*b4j.example.keyvaluestore*/ ._containskey /*boolean*/ (null,"FS23534X21")) { 
RDebugUtils.currentLine=589856;
 //BA.debugLineNum = 589856;BA.debugLine="Estudiante3 = kvsFile.Get(\"FS23534X21\")";
_estudiante3 = (b4j.example.b4xmainpage._estudiante)(__ref._kvsfile /*b4j.example.keyvaluestore*/ ._get /*Object*/ (null,"FS23534X21"));
 }else {
RDebugUtils.currentLine=589858;
 //BA.debugLineNum = 589858;BA.debugLine="Log(\"Clave de ID errónea\")";
__c.Log("Clave de ID errónea");
 };
RDebugUtils.currentLine=589861;
 //BA.debugLineNum = 589861;BA.debugLine="Log(\"Mostrar claves\")";
__c.Log("Mostrar claves");
RDebugUtils.currentLine=589862;
 //BA.debugLineNum = 589862;BA.debugLine="Private claves As List = kvsFile.ListKeys";
_claves = new anywheresoftware.b4a.objects.collections.List();
_claves = __ref._kvsfile /*b4j.example.keyvaluestore*/ ._listkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=589863;
 //BA.debugLineNum = 589863;BA.debugLine="For i = 0 To claves.Size-1";
{
final int step31 = 1;
final int limit31 = (int) (_claves.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit31 ;_i = _i + step31 ) {
RDebugUtils.currentLine=589864;
 //BA.debugLineNum = 589864;BA.debugLine="Log(claves.Get(i))";
__c.Log(BA.ObjectToString(_claves.Get(_i)));
 }
};
RDebugUtils.currentLine=589868;
 //BA.debugLineNum = 589868;BA.debugLine="LogEstudiante(Estudiante3)";
__ref._logestudiante /*String*/ (null,_estudiante3);
RDebugUtils.currentLine=589870;
 //BA.debugLineNum = 589870;BA.debugLine="End Sub";
return "";
}
public String  _logestudiante(b4j.example.b4xmainpage __ref,b4j.example.b4xmainpage._estudiante _est) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "logestudiante", false))
	 {return ((String) Debug.delegate(ba, "logestudiante", new Object[] {_est}));}
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Private Sub LogEstudiante(est As Estudiante)";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="Log(est.Nombre)";
__c.Log(_est.Nombre /*String*/ );
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="Log(est.Apellidos)";
__c.Log(_est.Apellidos /*String*/ );
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="Log(est.Dirección)";
__c.Log(_est.Dirección /*String*/ );
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="Log(est.Teléfono)";
__c.Log(_est.Teléfono /*String*/ );
RDebugUtils.currentLine=9764869;
 //BA.debugLineNum = 9764869;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 458755;BA.debugLine="Type Estudiante(ID As String, Apellidos As String";
;
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Public Estudiante1 As Estudiante";
_estudiante1 = new b4j.example.b4xmainpage._estudiante();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Public Estudiante2 As Estudiante";
_estudiante2 = new b4j.example.b4xmainpage._estudiante();
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Private listaEstudiantes As List";
_listaestudiantes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="Private mapStudents As Map";
_mapstudents = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="Private kvsFile As KeyValueStore";
_kvsfile = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 524289;BA.debugLine="End Sub";
return "";
}
}