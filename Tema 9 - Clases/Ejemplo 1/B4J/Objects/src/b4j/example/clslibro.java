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
public String _strtitulo = "";
public String _strano = "";
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
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="strTitulo = \"\"";
__ref._strtitulo /*String*/  = "";
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="strEscritor = \"\"";
__ref._strescritor /*String*/  = "";
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="strAno = \"\"";
__ref._strano /*String*/  = "";
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="strEditorial = \"\"";
__ref._streditorial /*String*/  = "";
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="End Sub";
return "";
}
public String  _insertarlibro(b4j.example.clslibro __ref,String _str1,String _str2,String _str3,String _str4) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslibro";
if (Debug.shouldDelegate(ba, "insertarlibro", false))
	 {return ((String) Debug.delegate(ba, "insertarlibro", new Object[] {_str1,_str2,_str3,_str4}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub insertarLibro(str1 As String, str2 As S";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="strTitulo = str1";
__ref._strtitulo /*String*/  = _str1;
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="strEscritor = str2";
__ref._strescritor /*String*/  = _str2;
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="strAno = str3";
__ref._strano /*String*/  = _str3;
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="strEditorial = str4";
__ref._streditorial /*String*/  = _str4;
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="End Sub";
return "";
}
public String  _mostrarlibro(b4j.example.clslibro __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslibro";
if (Debug.shouldDelegate(ba, "mostrarlibro", false))
	 {return ((String) Debug.delegate(ba, "mostrarlibro", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub mostrarLibro";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Log(\"Título    : \" & strTitulo)";
__c.Log("Título    : "+__ref._strtitulo /*String*/ );
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Log(\"Escritor  : \" & strEscritor)";
__c.Log("Escritor  : "+__ref._strescritor /*String*/ );
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Log(\"Año       : \" & strAno)";
__c.Log("Año       : "+__ref._strano /*String*/ );
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="Log(\"Editorial : \" & strEditorial)";
__c.Log("Editorial : "+__ref._streditorial /*String*/ );
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="End Sub";
return "";
}
public String  _setescritor(b4j.example.clslibro __ref,String _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslibro";
if (Debug.shouldDelegate(ba, "setescritor", false))
	 {return ((String) Debug.delegate(ba, "setescritor", new Object[] {_e}));}
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Public Sub setEscritor(e As String)";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="strEscritor = e";
__ref._strescritor /*String*/  = _e;
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="End Sub";
return "";
}
public String  _getescritor(b4j.example.clslibro __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslibro";
if (Debug.shouldDelegate(ba, "getescritor", false))
	 {return ((String) Debug.delegate(ba, "getescritor", null));}
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Public Sub getEscritor() As String";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="Return strEscritor";
if (true) return __ref._strescritor /*String*/ ;
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="End Sub";
return "";
}
public String  _cambiarlibro(b4j.example.clslibro __ref,String _str1,String _str2,String _str3,String _str4) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslibro";
if (Debug.shouldDelegate(ba, "cambiarlibro", false))
	 {return ((String) Debug.delegate(ba, "cambiarlibro", new Object[] {_str1,_str2,_str3,_str4}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub cambiarLibro(str1 As String, str2 As St";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="strTitulo = str1";
__ref._strtitulo /*String*/  = _str1;
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="strEscritor = str2";
__ref._strescritor /*String*/  = _str2;
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="strAno = str3";
__ref._strano /*String*/  = _str3;
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="strEditorial = str4";
__ref._streditorial /*String*/  = _str4;
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.clslibro __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslibro";
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="Private strEscritor, strTitulo, strAno, strEditor";
_strescritor = "";
_strtitulo = "";
_strano = "";
_streditorial = "";
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="End Sub";
return "";
}
public String  _getano(b4j.example.clslibro __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslibro";
if (Debug.shouldDelegate(ba, "getano", false))
	 {return ((String) Debug.delegate(ba, "getano", null));}
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Public Sub getAno() As String";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="Return strAno";
if (true) return __ref._strano /*String*/ ;
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="End Sub";
return "";
}
public String  _geteditorial(b4j.example.clslibro __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslibro";
if (Debug.shouldDelegate(ba, "geteditorial", false))
	 {return ((String) Debug.delegate(ba, "geteditorial", null));}
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Public Sub getEditorial() As String";
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="Return strEditorial";
if (true) return __ref._streditorial /*String*/ ;
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="End Sub";
return "";
}
public String  _gettitulo(b4j.example.clslibro __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslibro";
if (Debug.shouldDelegate(ba, "gettitulo", false))
	 {return ((String) Debug.delegate(ba, "gettitulo", null));}
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Public Sub getTitulo() As String";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="Return strTitulo";
if (true) return __ref._strtitulo /*String*/ ;
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="End Sub";
return "";
}
public String  _setano(b4j.example.clslibro __ref,String _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslibro";
if (Debug.shouldDelegate(ba, "setano", false))
	 {return ((String) Debug.delegate(ba, "setano", new Object[] {_y}));}
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Public Sub setAno(y As String)";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="strAno = y";
__ref._strano /*String*/  = _y;
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="End Sub";
return "";
}
public String  _setpublisher(b4j.example.clslibro __ref,String _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslibro";
if (Debug.shouldDelegate(ba, "setpublisher", false))
	 {return ((String) Debug.delegate(ba, "setpublisher", new Object[] {_p}));}
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Public Sub setPublisher(p As String)";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="strEditorial = p";
__ref._streditorial /*String*/  = _p;
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="End Sub";
return "";
}
public String  _settitulo(b4j.example.clslibro __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslibro";
if (Debug.shouldDelegate(ba, "settitulo", false))
	 {return ((String) Debug.delegate(ba, "settitulo", new Object[] {_t}));}
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Public Sub setTitulo(t As String)";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="strTitulo = t";
__ref._strtitulo /*String*/  = _t;
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="End Sub";
return "";
}
}