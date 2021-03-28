package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class clsordenador extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.clsordenador", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.clsordenador.class).invoke(this, new Object[] {null});
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
public String _strtipo = "";
public String _strmodelo = "";
public String _strcpu = "";
public float _fltprecio = 0f;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _nuevoordenador(b4j.example.clsordenador __ref,String _tp,String _modelo,String _cpu,float _precio) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsordenador";
if (Debug.shouldDelegate(ba, "nuevoordenador", false))
	 {return ((String) Debug.delegate(ba, "nuevoordenador", new Object[] {_tp,_modelo,_cpu,_precio}));}
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Public Sub nuevoOrdenador(tp As String , modelo As";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="strTipo = tp";
__ref._strtipo /*String*/  = _tp;
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="strModelo = modelo";
__ref._strmodelo /*String*/  = _modelo;
RDebugUtils.currentLine=11010051;
 //BA.debugLineNum = 11010051;BA.debugLine="strCpu = cpu";
__ref._strcpu /*String*/  = _cpu;
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="fltPrecio = precio";
__ref._fltprecio /*float*/  = _precio;
RDebugUtils.currentLine=11010053;
 //BA.debugLineNum = 11010053;BA.debugLine="End Sub";
return "";
}
public String  _mostrarordenador(b4j.example.clsordenador __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsordenador";
if (Debug.shouldDelegate(ba, "mostrarordenador", false))
	 {return ((String) Debug.delegate(ba, "mostrarordenador", null));}
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Public Sub mostrarOrdenador";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Log(\"Tipo 		: \" & strTipo)";
__c.Log("Tipo 		: "+__ref._strtipo /*String*/ );
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="Log(\"Modelo		: \" & strModelo)";
__c.Log("Modelo		: "+__ref._strmodelo /*String*/ );
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="Log(\"CPU		: \" & strCpu)";
__c.Log("CPU		: "+__ref._strcpu /*String*/ );
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="Log(\"Precio		: \" & fltPrecio)";
__c.Log("Precio		: "+BA.NumberToString(__ref._fltprecio /*float*/ ));
RDebugUtils.currentLine=9633797;
 //BA.debugLineNum = 9633797;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.clsordenador __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clsordenador";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="strTipo = \"\"";
__ref._strtipo /*String*/  = "";
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="strModelo = \"\"";
__ref._strmodelo /*String*/  = "";
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="strCpu = \"\"";
__ref._strcpu /*String*/  = "";
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="fltPrecio = 0";
__ref._fltprecio /*float*/  = (float) (0);
RDebugUtils.currentLine=8192005;
 //BA.debugLineNum = 8192005;BA.debugLine="End Sub";
return "";
}
public String  _cambiarcpu(b4j.example.clsordenador __ref,String _cpu) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsordenador";
if (Debug.shouldDelegate(ba, "cambiarcpu", false))
	 {return ((String) Debug.delegate(ba, "cambiarcpu", new Object[] {_cpu}));}
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="public Sub cambiarCPU(cpu As String)";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="strCpu = cpu";
__ref._strcpu /*String*/  = _cpu;
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="End Sub";
return "";
}
public String  _cambiarprecio(b4j.example.clsordenador __ref,float _precio) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsordenador";
if (Debug.shouldDelegate(ba, "cambiarprecio", false))
	 {return ((String) Debug.delegate(ba, "cambiarprecio", new Object[] {_precio}));}
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="public Sub cambiarPrecio(precio As Float)";
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="fltPrecio = precio";
__ref._fltprecio /*float*/  = _precio;
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.clsordenador __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsordenador";
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="Public strTipo, strModelo, strCpu As String";
_strtipo = "";
_strmodelo = "";
_strcpu = "";
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="Public fltPrecio As Float";
_fltprecio = 0f;
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="End Sub";
return "";
}
}