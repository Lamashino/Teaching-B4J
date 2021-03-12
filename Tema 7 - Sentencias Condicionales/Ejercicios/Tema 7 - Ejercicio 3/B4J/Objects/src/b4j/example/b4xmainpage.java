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
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btncalc = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtcoste = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtcomida = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtcantidad = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
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
 //BA.debugLineNum = 589827;BA.debugLine="End Sub";
return "";
}
public String  _btncalc_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btncalc_click", false))
	 {return ((String) Debug.delegate(ba, "btncalc_click", null));}
float _fltcoste = 0f;
String _meal = "";
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Private Sub btnCalc_Click";
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="Private fltCoste As Float";
_fltcoste = 0f;
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="Private meal As String";
_meal = "";
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="If txtComida.text = \"Salchicha\" Then";
if ((__ref._txtcomida /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("Salchicha")) { 
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="fltCoste = txtCantidad.Text * 1.5";
_fltcoste = (float) ((double)(Double.parseDouble(__ref._txtcantidad /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))*1.5);
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="meal = \"Salchicha\"";
_meal = "Salchicha";
 }else 
{RDebugUtils.currentLine=655370;
 //BA.debugLineNum = 655370;BA.debugLine="else if txtComida.text = \"Pizza\" Then";
if ((__ref._txtcomida /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("Pizza")) { 
RDebugUtils.currentLine=655371;
 //BA.debugLineNum = 655371;BA.debugLine="fltCoste = txtCantidad.Text * 3";
_fltcoste = (float) ((double)(Double.parseDouble(__ref._txtcantidad /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))*3);
RDebugUtils.currentLine=655372;
 //BA.debugLineNum = 655372;BA.debugLine="meal = \"Pizza\"";
_meal = "Pizza";
 }else 
{RDebugUtils.currentLine=655373;
 //BA.debugLineNum = 655373;BA.debugLine="else if txtComida.text = \"Hamburguesa\" Then";
if ((__ref._txtcomida /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("Hamburguesa")) { 
RDebugUtils.currentLine=655374;
 //BA.debugLineNum = 655374;BA.debugLine="fltCoste = txtCantidad.Text * 5";
_fltcoste = (float) ((double)(Double.parseDouble(__ref._txtcantidad /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))*5);
RDebugUtils.currentLine=655375;
 //BA.debugLineNum = 655375;BA.debugLine="meal = \"Hamburguesa\"";
_meal = "Hamburguesa";
 }}}
;
RDebugUtils.currentLine=655377;
 //BA.debugLineNum = 655377;BA.debugLine="txtCoste.Text = txtCantidad.Text & \" x \" & meal &";
__ref._txtcoste /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._txtcantidad /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()+" x "+_meal+" "+BA.NumberToString(_fltcoste)+" $");
RDebugUtils.currentLine=655378;
 //BA.debugLineNum = 655378;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 458755;BA.debugLine="Private btnCalc As Button";
_btncalc = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Private txtCoste As TextField";
_txtcoste = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Private txtComida As TextField";
_txtcomida = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Private txtCantidad As TextField";
_txtcantidad = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="End Sub";
return "";
}
}