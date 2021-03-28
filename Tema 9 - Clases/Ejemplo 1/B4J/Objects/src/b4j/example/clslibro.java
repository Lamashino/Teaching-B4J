package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class clslibro extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.clslibro", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.clslibro.class).invoke(this, new Object[] {null});
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
public String _strescritor = "";
public String _strtítulo = "";
public String _straño = "";
public String _streditorial = "";
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _initialize(b4j.example.clslibro __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clslibro";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="strTítulo = \"\"";
__ref._strtítulo /*String*/  = "";
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="strEscritor = \"\"";
__ref._strescritor /*String*/  = "";
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="strAño = \"\"";
__ref._straño /*String*/  = "";
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="strEditorial = \"\"";
__ref._streditorial /*String*/  = "";
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="End Sub";
return "";
}
public String  _insertarlibro(b4j.example.clslibro __ref,String _str1,String _str2,String _str3,String _str4) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslibro";
if (Debug.shouldDelegate(ba, "insertarlibro", false))
	 {return ((String) Debug.delegate(ba, "insertarlibro", new Object[] {_str1,_str2,_str3,_str4}));}
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Public Sub insertarLibro(str1, str2, str3, str4 As";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="strTítulo = str1";
__ref._strtítulo /*String*/  = _str1;
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="strEscritor = str2";
__ref._strescritor /*String*/  = _str2;
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="strAño = str3";
__ref._straño /*String*/  = _str3;
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="strEditorial = str4";
__ref._streditorial /*String*/  = _str4;
RDebugUtils.currentLine=9306117;
 //BA.debugLineNum = 9306117;BA.debugLine="End Sub";
return "";
}
public String  _loglibro(b4j.example.clslibro __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslibro";
if (Debug.shouldDelegate(ba, "loglibro", false))
	 {return ((String) Debug.delegate(ba, "loglibro", null));}
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Public Sub logLibro";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="Log(\"Título    : \" & strTítulo)";
__c.Log("Título    : "+__ref._strtítulo /*String*/ );
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="Log(\"Escritor  : \" & strEscritor)";
__c.Log("Escritor  : "+__ref._strescritor /*String*/ );
RDebugUtils.currentLine=11010051;
 //BA.debugLineNum = 11010051;BA.debugLine="Log(\"Año       : \" & strAño)";
__c.Log("Año       : "+__ref._straño /*String*/ );
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="Log(\"Editorial : \" & strEditorial)";
__c.Log("Editorial : "+__ref._streditorial /*String*/ );
RDebugUtils.currentLine=11010053;
 //BA.debugLineNum = 11010053;BA.debugLine="End Sub";
return "";
}
public String  _cambiarlibro(b4j.example.clslibro __ref,String _str1,String _str2,String _str3,String _str4) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslibro";
if (Debug.shouldDelegate(ba, "cambiarlibro", false))
	 {return ((String) Debug.delegate(ba, "cambiarlibro", new Object[] {_str1,_str2,_str3,_str4}));}
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Public Sub cambiarLibro(str1, str2, str3, str4 As";
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="strTítulo = str1";
__ref._strtítulo /*String*/  = _str1;
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="strEscritor = str2";
__ref._strescritor /*String*/  = _str2;
RDebugUtils.currentLine=10485763;
 //BA.debugLineNum = 10485763;BA.debugLine="strAño = str3";
__ref._straño /*String*/  = _str3;
RDebugUtils.currentLine=10485764;
 //BA.debugLineNum = 10485764;BA.debugLine="strEditorial = str4";
__ref._streditorial /*String*/  = _str4;
RDebugUtils.currentLine=10485765;
 //BA.debugLineNum = 10485765;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.clslibro __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslibro";
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="Public strEscritor, strTítulo, strAño, strEditori";
_strescritor = "";
_strtítulo = "";
_straño = "";
_streditorial = "";
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="End Sub";
return "";
}
}