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
public anywheresoftware.b4j.objects.LabelWrapper _lblnumero = null;
public float _fltnumero1 = 0f;
public float _fltnumero2 = 0f;
public String _operacion = "";
public boolean _hecho = false;
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
 //BA.debugLineNum = 589827;BA.debugLine="lblNumero.Text = \"\"";
__ref._lblnumero /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("");
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="hecho = False";
__ref._hecho /*boolean*/  = __c.False;
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="End Sub";
return "";
}
public String  _btnborrar_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnborrar_click", false))
	 {return ((String) Debug.delegate(ba, "btnborrar_click", null));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Private Sub btnBorrar_Click";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="lblNumero.Text = 0";
__ref._lblnumero /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="fltNumero1 = 0";
__ref._fltnumero1 /*float*/  = (float) (0);
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="fltNumero2 = 0";
__ref._fltnumero2 /*float*/  = (float) (0);
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="End Sub";
return "";
}
public String  _btnig_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnig_click", false))
	 {return ((String) Debug.delegate(ba, "btnig_click", null));}
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Private Sub btnIg_Click";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="fltNumero2 =  lblNumero.Text";
__ref._fltnumero2 /*float*/  = (float)(Double.parseDouble(__ref._lblnumero /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText()));
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="If operacion = \"+\" Then";
if ((__ref._operacion /*String*/ ).equals("+")) { 
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="lblNumero.Text = fltNumero1 + fltNumero2";
__ref._lblnumero /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(__ref._fltnumero1 /*float*/ +__ref._fltnumero2 /*float*/ ));
 }else 
{RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="else If operacion = \"-\" Then";
if ((__ref._operacion /*String*/ ).equals("-")) { 
RDebugUtils.currentLine=8847365;
 //BA.debugLineNum = 8847365;BA.debugLine="lblNumero.Text = fltNumero1 - fltNumero2";
__ref._lblnumero /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(__ref._fltnumero1 /*float*/ -__ref._fltnumero2 /*float*/ ));
 }else 
{RDebugUtils.currentLine=8847366;
 //BA.debugLineNum = 8847366;BA.debugLine="else If operacion = \"*\" Then";
if ((__ref._operacion /*String*/ ).equals("*")) { 
RDebugUtils.currentLine=8847367;
 //BA.debugLineNum = 8847367;BA.debugLine="lblNumero.Text = fltNumero1 * fltNumero2";
__ref._lblnumero /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(__ref._fltnumero1 /*float*/ *__ref._fltnumero2 /*float*/ ));
 }else 
{RDebugUtils.currentLine=8847368;
 //BA.debugLineNum = 8847368;BA.debugLine="else If operacion = \"/\" Then";
if ((__ref._operacion /*String*/ ).equals("/")) { 
RDebugUtils.currentLine=8847369;
 //BA.debugLineNum = 8847369;BA.debugLine="lblNumero.Text = fltNumero1 / fltNumero2";
__ref._lblnumero /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(__ref._fltnumero1 /*float*/ /(double)__ref._fltnumero2 /*float*/ ));
 }}}}
;
RDebugUtils.currentLine=8847371;
 //BA.debugLineNum = 8847371;BA.debugLine="fltNumero1 = lblNumero.Text";
__ref._fltnumero1 /*float*/  = (float)(Double.parseDouble(__ref._lblnumero /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText()));
RDebugUtils.currentLine=8847372;
 //BA.debugLineNum = 8847372;BA.debugLine="hecho = True";
__ref._hecho /*boolean*/  = __c.True;
RDebugUtils.currentLine=8847373;
 //BA.debugLineNum = 8847373;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 458755;BA.debugLine="Private lblNumero As Label";
_lblnumero = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Private fltNumero1, fltNumero2 As Float";
_fltnumero1 = 0f;
_fltnumero2 = 0f;
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Private operacion As String";
_operacion = "";
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Private hecho As Boolean";
_hecho = false;
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
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="End Sub";
return "";
}
public String  _numero_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "numero_click", false))
	 {return ((String) Debug.delegate(ba, "numero_click", null));}
anywheresoftware.b4j.objects.ButtonWrapper _b = null;
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Private Sub Numero_Click";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="Dim b As Button";
_b = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="b = Sender";
_b = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="Log(b.Tag)";
__c.Log(BA.ObjectToString(_b.getTag()));
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="If hecho Then";
if (__ref._hecho /*boolean*/ ) { 
RDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="lblNumero.Text = 0";
__ref._lblnumero /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=9240582;
 //BA.debugLineNum = 9240582;BA.debugLine="hecho = False";
__ref._hecho /*boolean*/  = __c.False;
 };
RDebugUtils.currentLine=9240584;
 //BA.debugLineNum = 9240584;BA.debugLine="lblNumero.Text = lblNumero.Text & b.Tag";
__ref._lblnumero /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(__ref._lblnumero /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText()+BA.ObjectToString(_b.getTag()));
RDebugUtils.currentLine=9240585;
 //BA.debugLineNum = 9240585;BA.debugLine="End Sub";
return "";
}
public String  _operacion_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "operacion_click", false))
	 {return ((String) Debug.delegate(ba, "operacion_click", null));}
anywheresoftware.b4j.objects.ButtonWrapper _b = null;
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Private Sub operacion_Click";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="Dim b As Button";
_b = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="b = Sender";
_b = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="operacion = b.Tag";
__ref._operacion /*String*/  = BA.ObjectToString(_b.getTag());
RDebugUtils.currentLine=9830404;
 //BA.debugLineNum = 9830404;BA.debugLine="fltNumero1 = lblNumero.Text";
__ref._fltnumero1 /*float*/  = (float)(Double.parseDouble(__ref._lblnumero /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText()));
RDebugUtils.currentLine=9830405;
 //BA.debugLineNum = 9830405;BA.debugLine="lblNumero.Text = 0";
__ref._lblnumero /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=9830406;
 //BA.debugLineNum = 9830406;BA.debugLine="End Sub";
return "";
}
}