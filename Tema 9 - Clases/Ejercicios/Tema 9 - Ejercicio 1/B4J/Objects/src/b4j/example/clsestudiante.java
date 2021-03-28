package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class clsestudiante extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.clsestudiante", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.clsestudiante.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _stridescolar = "";
public String _strnombre = "";
public String _strapellidos = "";
public String _strteléfono = "";
public String _strcorreo = "";
public String _strclase = "";
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _nuevoestudiante(b4j.example.clsestudiante __ref,String _idesc,String _nombre,String _apellidos,String _teléfono,String _correo,String _clase) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsestudiante";
if (Debug.shouldDelegate(ba, "nuevoestudiante", false))
	 {return ((String) Debug.delegate(ba, "nuevoestudiante", new Object[] {_idesc,_nombre,_apellidos,_teléfono,_correo,_clase}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub nuevoEstudiante(idEsc As String, Nombre";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="strIdEscolar = idEsc";
__ref._stridescolar /*String*/  = _idesc;
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="strNombre = Nombre";
__ref._strnombre /*String*/  = _nombre;
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="strApellidos = Apellidos";
__ref._strapellidos /*String*/  = _apellidos;
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="strTeléfono = Teléfono";
__ref._strteléfono /*String*/  = _teléfono;
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="strCorreo = correo";
__ref._strcorreo /*String*/  = _correo;
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="strClase = clase";
__ref._strclase /*String*/  = _clase;
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="End Sub";
return "";
}
public String  _mostrarestudiante(b4j.example.clsestudiante __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsestudiante";
if (Debug.shouldDelegate(ba, "mostrarestudiante", false))
	 {return ((String) Debug.delegate(ba, "mostrarestudiante", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub mostrarEstudiante				' Excplicar la cad";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Log ($\" 								 	Id. Escolar : ${strIdEscolar}";
__c.Log((" 								\n"+"	Id. Escolar : "+__c.SmartStringFormatter("",(Object)(__ref._stridescolar /*String*/ ))+" \n"+"	Nombre		: "+__c.SmartStringFormatter("",(Object)(__ref._strnombre /*String*/ ))+" \n"+"	Apellidos	: "+__c.SmartStringFormatter("",(Object)(__ref._strapellidos /*String*/ ))+"\n"+"	Teléfono	: "+__c.SmartStringFormatter("",(Object)(__ref._strteléfono /*String*/ ))+"\n"+"	Correo elec.: "+__c.SmartStringFormatter("",(Object)(__ref._strcorreo /*String*/ ))+"\n"+"	Clase		: "+__c.SmartStringFormatter("",(Object)(__ref._strclase /*String*/ ))+"\n"+"	"));
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.clsestudiante __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clsestudiante";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="strIdEscolar = \"\"";
__ref._stridescolar /*String*/  = "";
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="strNombre = \"\"";
__ref._strnombre /*String*/  = "";
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="strApellidos = \"\"";
__ref._strapellidos /*String*/  = "";
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="strTeléfono = \"\"";
__ref._strteléfono /*String*/  = "";
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="strCorreo = \"\"";
__ref._strcorreo /*String*/  = "";
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="strClase = \"\"";
__ref._strclase /*String*/  = "";
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="End Sub";
return "";
}
public String  _cambiarclase(b4j.example.clsestudiante __ref,String _class) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsestudiante";
if (Debug.shouldDelegate(ba, "cambiarclase", false))
	 {return ((String) Debug.delegate(ba, "cambiarclase", new Object[] {_class}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub cambiarClase(class As String)";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="strClase = class";
__ref._strclase /*String*/  = _class;
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return "";
}
public String  _cambiartelefono(b4j.example.clsestudiante __ref,String _phone) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsestudiante";
if (Debug.shouldDelegate(ba, "cambiartelefono", false))
	 {return ((String) Debug.delegate(ba, "cambiartelefono", new Object[] {_phone}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub cambiarTelefono(phone As String)";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="strTeléfono = phone";
__ref._strteléfono /*String*/  = _phone;
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.clsestudiante __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsestudiante";
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="Private strIdEscolar, strNombre, strApellidos, st";
_stridescolar = "";
_strnombre = "";
_strapellidos = "";
_strteléfono = "";
_strcorreo = "";
_strclase = "";
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="End Sub";
return "";
}
}