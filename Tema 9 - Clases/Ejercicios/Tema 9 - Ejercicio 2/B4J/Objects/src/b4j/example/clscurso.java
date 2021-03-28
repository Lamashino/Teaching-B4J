package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class clscurso extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.clscurso", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.clscurso.class).invoke(this, new Object[] {null});
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
public String _strtema = "";
public String _strclase = "";
public String _strhoras = "";
public String _strprofesor = "";
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _nuevocurso(b4j.example.clscurso __ref,String _nombre,String _clase,String _horas,String _prof) throws Exception{
__ref = this;
RDebugUtils.currentModule="clscurso";
if (Debug.shouldDelegate(ba, "nuevocurso", false))
	 {return ((String) Debug.delegate(ba, "nuevocurso", new Object[] {_nombre,_clase,_horas,_prof}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub nuevoCurso(nombre As String, clase As S";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="strTema = nombre";
__ref._strtema /*String*/  = _nombre;
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="strClase = clase";
__ref._strclase /*String*/  = _clase;
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="strHoras = horas";
__ref._strhoras /*String*/  = _horas;
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="strProfesor = prof";
__ref._strprofesor /*String*/  = _prof;
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="End Sub";
return "";
}
public String  _mostrarcurso(b4j.example.clscurso __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clscurso";
if (Debug.shouldDelegate(ba, "mostrarcurso", false))
	 {return ((String) Debug.delegate(ba, "mostrarcurso", null));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub mostrarCurso";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Log ( $\" 	Tema		: ${strTema} 	Clase		: ${strClase";
__c.Log(("\n"+"	Tema		: "+__c.SmartStringFormatter("",(Object)(__ref._strtema /*String*/ ))+"\n"+"	Clase		: "+__c.SmartStringFormatter("",(Object)(__ref._strclase /*String*/ ))+"\n"+"	Horas		: "+__c.SmartStringFormatter("",(Object)(__ref._strhoras /*String*/ ))+"\n"+"	Profesor	: "+__c.SmartStringFormatter("",(Object)(__ref._strprofesor /*String*/ ))+"\n"+"	"));
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.clscurso __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clscurso";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="strTema = \"\"";
__ref._strtema /*String*/  = "";
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="strClase = \"\"";
__ref._strclase /*String*/  = "";
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="strHoras = \"\"";
__ref._strhoras /*String*/  = "";
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="strProfesor = \"\"";
__ref._strprofesor /*String*/  = "";
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="End Sub";
return "";
}
public String  _cambiarhoras(b4j.example.clscurso __ref,String _horas) throws Exception{
__ref = this;
RDebugUtils.currentModule="clscurso";
if (Debug.shouldDelegate(ba, "cambiarhoras", false))
	 {return ((String) Debug.delegate(ba, "cambiarhoras", new Object[] {_horas}));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub cambiarHoras(horas As String)";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="strHoras = horas";
__ref._strhoras /*String*/  = _horas;
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="End Sub";
return "";
}
public String  _cambiarprofesor(b4j.example.clscurso __ref,String _prof) throws Exception{
__ref = this;
RDebugUtils.currentModule="clscurso";
if (Debug.shouldDelegate(ba, "cambiarprofesor", false))
	 {return ((String) Debug.delegate(ba, "cambiarprofesor", new Object[] {_prof}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub cambiarProfesor(prof As String)";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="strProfesor = prof";
__ref._strprofesor /*String*/  = _prof;
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.clscurso __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clscurso";
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="Public strTema, strClase, strHoras, strProfesor A";
_strtema = "";
_strclase = "";
_strhoras = "";
_strprofesor = "";
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="End Sub";
return "";
}
}