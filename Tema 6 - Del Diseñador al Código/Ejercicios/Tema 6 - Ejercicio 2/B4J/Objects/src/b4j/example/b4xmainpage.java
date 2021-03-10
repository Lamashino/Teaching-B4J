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
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtedfísica = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfísicaquímica = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtgeohistoria = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtinformática = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtinglés = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtlengua = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtmatemáticas = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtmedia = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtmúsica = null;
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
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="txtEdFísica.Text = 0";
__ref._txtedfísica /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="txtFísicaQuímica.Text = 0";
__ref._txtfísicaquímica /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="txtGeoHistoria.Text = 0";
__ref._txtgeohistoria /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="txtInformática.Text = 0";
__ref._txtinformática /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="txtInglés.Text = 0";
__ref._txtinglés /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="txtLengua.Text = 0";
__ref._txtlengua /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="txtMatemáticas.Text = 0";
__ref._txtmatemáticas /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="txtMúsica.Text = 0";
__ref._txtmúsica /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="txtMedia.Text = 0";
__ref._txtmedia /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="End Sub";
return "";
}
public String  _btncalcular_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btncalcular_click", false))
	 {return ((String) Debug.delegate(ba, "btncalcular_click", null));}
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Private Sub btnCalcular_Click";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="If (txtFísicaQuímica.Text >= 0 And txtFísicaQuími";
if (((double)(Double.parseDouble(__ref._txtfísicaquímica /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))>=0 && (double)(Double.parseDouble(__ref._txtfísicaquímica /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))<=10)) { 
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="If ( txtEdFísica.Text >= 0 And txtEdFísica.Text";
if (((double)(Double.parseDouble(__ref._txtedfísica /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))>=0 && (double)(Double.parseDouble(__ref._txtedfísica /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))<=10)) { 
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="If ( txtGeoHistoria.text >= 0 And txtGeoHistori";
if (((double)(Double.parseDouble(__ref._txtgeohistoria /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))>=0 && (double)(Double.parseDouble(__ref._txtgeohistoria /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))<=10)) { 
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="If ( txtInformática.text >= 0 And txtInformáti";
if (((double)(Double.parseDouble(__ref._txtinformática /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))>=0 && (double)(Double.parseDouble(__ref._txtinformática /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))<=10)) { 
RDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="If (txtInglés.text >= 0 And txtInglés.text <=";
if (((double)(Double.parseDouble(__ref._txtinglés /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))>=0 && (double)(Double.parseDouble(__ref._txtinglés /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))<=10)) { 
RDebugUtils.currentLine=7798790;
 //BA.debugLineNum = 7798790;BA.debugLine="If (txtLengua.text >= 0 And txtLengua.Text <";
if (((double)(Double.parseDouble(__ref._txtlengua /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))>=0 && (double)(Double.parseDouble(__ref._txtlengua /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))<=10)) { 
RDebugUtils.currentLine=7798791;
 //BA.debugLineNum = 7798791;BA.debugLine="If  (txtMatemáticas.text >= 0 And txtMatemá";
if (((double)(Double.parseDouble(__ref._txtmatemáticas /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))>=0 && (double)(Double.parseDouble(__ref._txtmatemáticas /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))<=10)) { 
RDebugUtils.currentLine=7798792;
 //BA.debugLineNum = 7798792;BA.debugLine="If (txtMúsica.text >= 0 And txtMúsica.Text";
if (((double)(Double.parseDouble(__ref._txtmúsica /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))>=0 && (double)(Double.parseDouble(__ref._txtmúsica /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))<=10)) { 
RDebugUtils.currentLine=7798794;
 //BA.debugLineNum = 7798794;BA.debugLine="txtMedia.Text = (txtFísicaQuímica.Text +";
__ref._txtmedia /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(((double)(Double.parseDouble(__ref._txtfísicaquímica /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))+(double)(Double.parseDouble(__ref._txtedfísica /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))+(double)(Double.parseDouble(__ref._txtgeohistoria /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))+(double)(Double.parseDouble(__ref._txtinformática /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))+(double)(Double.parseDouble(__ref._txtinglés /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))+(double)(Double.parseDouble(__ref._txtlengua /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))+(double)(Double.parseDouble(__ref._txtmatemáticas /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))+(double)(Double.parseDouble(__ref._txtmúsica /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())))/(double)8));
 }else {
RDebugUtils.currentLine=7798798;
 //BA.debugLineNum = 7798798;BA.debugLine="xui.MsgboxAsync(\"Música debe estar entre";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Música debe estar entre 0 y 10","");
 };
 }else {
RDebugUtils.currentLine=7798801;
 //BA.debugLineNum = 7798801;BA.debugLine="xui.MsgboxAsync(\"Matemáticas debe estar en";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Matemáticas debe estar entre 0 y 10","");
 };
 }else {
RDebugUtils.currentLine=7798804;
 //BA.debugLineNum = 7798804;BA.debugLine="xui.MsgboxAsync(\"Lengua debe estar entre 0";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Lengua debe estar entre 0 y 10","");
 };
 }else {
RDebugUtils.currentLine=7798807;
 //BA.debugLineNum = 7798807;BA.debugLine="xui.MsgboxAsync(\"Inglés debe estar entre 0 y";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Inglés debe estar entre 0 y 10","");
 };
 }else {
RDebugUtils.currentLine=7798810;
 //BA.debugLineNum = 7798810;BA.debugLine="xui.MsgboxAsync(\"Informática debe estar entre";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Informática debe estar entre 0 y 10","");
 };
 }else {
RDebugUtils.currentLine=7798813;
 //BA.debugLineNum = 7798813;BA.debugLine="xui.MsgboxAsync(\"Geografía e Historia debe est";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Geografía e Historia debe estar entre 0 y 10","");
 };
 }else {
RDebugUtils.currentLine=7798816;
 //BA.debugLineNum = 7798816;BA.debugLine="xui.MsgboxAsync(\"Educación Física debe estar en";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Educación Física debe estar entre 0 y 10","");
 };
 }else {
RDebugUtils.currentLine=7798819;
 //BA.debugLineNum = 7798819;BA.debugLine="xui.MsgboxAsync(\"Física y Química debe estar ent";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Física y Química debe estar entre 0 y 10","");
 };
RDebugUtils.currentLine=7798821;
 //BA.debugLineNum = 7798821;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 458755;BA.debugLine="Private txtEdFísica As TextField";
_txtedfísica = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Private txtFísicaQuímica As TextField";
_txtfísicaquímica = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Private txtGeoHistoria As TextField";
_txtgeohistoria = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Private txtInformática As TextField";
_txtinformática = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="Private txtInglés As TextField";
_txtinglés = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="Private txtLengua As TextField";
_txtlengua = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="Private txtMatemáticas As TextField";
_txtmatemáticas = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="Private txtMedia As TextField";
_txtmedia = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="Private txtMúsica As TextField";
_txtmúsica = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="End Sub";
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