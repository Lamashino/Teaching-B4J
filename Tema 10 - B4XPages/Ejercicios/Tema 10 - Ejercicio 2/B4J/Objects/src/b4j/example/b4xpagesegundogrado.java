package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xpagesegundogrado extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xpagesegundogrado", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xpagesegundogrado.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txta = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtb = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtc = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtd = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtx1 = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtx2 = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _initialize(b4j.example.b4xpagesegundogrado __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xpagesegundogrado";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4j.example.b4xpagesegundogrado __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesegundogrado";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="Root.LoadLayout(\"frmSecondary\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("frmSecondary",ba);
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="txtA.Text = \"\"";
__ref._txta /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="txtB.Text = \"\"";
__ref._txtb /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=9175045;
 //BA.debugLineNum = 9175045;BA.debugLine="txtC.Text = \"\"";
__ref._txtc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=9175046;
 //BA.debugLineNum = 9175046;BA.debugLine="End Sub";
return "";
}
public String  _btncalculate_click(b4j.example.b4xpagesegundogrado __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesegundogrado";
if (Debug.shouldDelegate(ba, "btncalculate_click", false))
	 {return ((String) Debug.delegate(ba, "btncalculate_click", null));}
float _d = 0f;
float _a = 0f;
float _b = 0f;
float _c = 0f;
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Private Sub btnCalculate_Click";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="Private D, a, b, c As Float";
_d = 0f;
_a = 0f;
_b = 0f;
_c = 0f;
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="If txtA.Text <> \"\" And txtB.Text <> \"\" And txtC.T";
if ((__ref._txta /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") == false && (__ref._txtb /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") == false && (__ref._txtc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") == false) { 
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="a = txtA.Text";
_a = (float)(Double.parseDouble(__ref._txta /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="b = txtB.Text";
_b = (float)(Double.parseDouble(__ref._txtb /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=9240582;
 //BA.debugLineNum = 9240582;BA.debugLine="c = txtC.Text";
_c = (float)(Double.parseDouble(__ref._txtc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=9240584;
 //BA.debugLineNum = 9240584;BA.debugLine="D = calcD(a, b, c)";
_d = __ref._calcd /*float*/ (null,_a,_b,_c);
RDebugUtils.currentLine=9240585;
 //BA.debugLineNum = 9240585;BA.debugLine="txtD.Text = D";
__ref._txtd /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(_d));
RDebugUtils.currentLine=9240587;
 //BA.debugLineNum = 9240587;BA.debugLine="If D < 0 Then";
if (_d<0) { 
RDebugUtils.currentLine=9240588;
 //BA.debugLineNum = 9240588;BA.debugLine="xui.MsgboxAsync(\"La ecuación puede resolverse p";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"La ecuación puede resolverse porque Δ < 0","");
 }else 
{RDebugUtils.currentLine=9240589;
 //BA.debugLineNum = 9240589;BA.debugLine="Else if D = 0 Then";
if (_d==0) { 
RDebugUtils.currentLine=9240590;
 //BA.debugLineNum = 9240590;BA.debugLine="txtX1.Text = -b/(2*a)";
__ref._txtx1 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(-_b/(double)(2*_a)));
 }else {
RDebugUtils.currentLine=9240592;
 //BA.debugLineNum = 9240592;BA.debugLine="txtX1.Text = (-b + Sqrt(D) ) / (2*a)";
__ref._txtx1 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString((-_b+__c.Sqrt(_d))/(double)(2*_a)));
RDebugUtils.currentLine=9240593;
 //BA.debugLineNum = 9240593;BA.debugLine="txtX2.Text = (-b - Sqrt(D) ) / (2*a)";
__ref._txtx2 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString((-_b-__c.Sqrt(_d))/(double)(2*_a)));
 }}
;
 }else {
RDebugUtils.currentLine=9240596;
 //BA.debugLineNum = 9240596;BA.debugLine="xui.MsgboxAsync(\"Debes introducir los valores pa";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Debes introducir los valores para a, b y c","");
 };
RDebugUtils.currentLine=9240599;
 //BA.debugLineNum = 9240599;BA.debugLine="End Sub";
return "";
}
public float  _calcd(b4j.example.b4xpagesegundogrado __ref,float _a,float _b,float _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesegundogrado";
if (Debug.shouldDelegate(ba, "calcd", false))
	 {return ((Float) Debug.delegate(ba, "calcd", new Object[] {_a,_b,_c}));}
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Private Sub calcD(a As Float, b As Float, c  As Fl";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="Return (  b*b - 4 * a * c )";
if (true) return (float) ((_b*_b-4*_a*_c));
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="End Sub";
return 0f;
}
public String  _class_globals(b4j.example.b4xpagesegundogrado __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesegundogrado";
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="Private txtA As TextField";
_txta = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="Private txtB As TextField";
_txtb = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=9043973;
 //BA.debugLineNum = 9043973;BA.debugLine="Private txtC As TextField";
_txtc = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=9043974;
 //BA.debugLineNum = 9043974;BA.debugLine="Private txtD As TextField";
_txtd = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=9043975;
 //BA.debugLineNum = 9043975;BA.debugLine="Private txtX1 As TextField";
_txtx1 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=9043976;
 //BA.debugLineNum = 9043976;BA.debugLine="Private txtX2 As TextField";
_txtx2 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=9043977;
 //BA.debugLineNum = 9043977;BA.debugLine="End Sub";
return "";
}
}