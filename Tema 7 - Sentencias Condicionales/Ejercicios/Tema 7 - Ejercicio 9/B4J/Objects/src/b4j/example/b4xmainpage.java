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
public anywheresoftware.b4j.objects.ButtonWrapper _btncomprobar = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnmax = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblmensaje = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtprimerintento = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtsegundointento = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txttercerintento = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtcuartointento = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtquintointento = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtsextointento = null;
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
 //BA.debugLineNum = 589827;BA.debugLine="txtCuartoIntento.Visible = False";
__ref._txtcuartointento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="txtQuintoIntento.Visible = False";
__ref._txtquintointento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="txtSextoIntento.Visible = False";
__ref._txtsextointento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="btnMax.Visible = False";
__ref._btnmax /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="End Sub";
return "";
}
public String  _btncomprobar_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btncomprobar_click", false))
	 {return ((String) Debug.delegate(ba, "btncomprobar_click", null));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Private Sub btnComprobar_Click";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="If txtPrimerIntento.Text > 7.5 Or txtSegundoInten";
if ((double)(Double.parseDouble(__ref._txtprimerintento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))>7.5 || (double)(Double.parseDouble(__ref._txtsegundointento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))>7.5 || (double)(Double.parseDouble(__ref._txttercerintento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))>7.5) { 
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="txtCuartoIntento.Visible = True";
__ref._txtcuartointento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="txtQuintoIntento.Visible = True";
__ref._txtquintointento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="txtSextoIntento.Visible = True";
__ref._txtsextointento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=8650757;
 //BA.debugLineNum = 8650757;BA.debugLine="btnMax.Visible = True";
__ref._btnmax /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=8650759;
 //BA.debugLineNum = 8650759;BA.debugLine="lblMensaje.Text = \"Descalificado\"";
__ref._lblmensaje /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("Descalificado");
 };
RDebugUtils.currentLine=8650762;
 //BA.debugLineNum = 8650762;BA.debugLine="End Sub";
return "";
}
public String  _btnmax_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnmax_click", false))
	 {return ((String) Debug.delegate(ba, "btnmax_click", null));}
float _max1 = 0f;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub btnMax_Click";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Private MAX1 As Float";
_max1 = 0f;
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="MAX1 = txtPrimerIntento.Text";
_max1 = (float)(Double.parseDouble(__ref._txtprimerintento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="If MAX1 < txtSegundoIntento.Text Then";
if (_max1<(double)(Double.parseDouble(__ref._txtsegundointento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))) { 
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="MAX1 = txtSegundoIntento.text";
_max1 = (float)(Double.parseDouble(__ref._txtsegundointento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
 };
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="If MAX1 < txtTercerIntento.Text Then";
if (_max1<(double)(Double.parseDouble(__ref._txttercerintento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))) { 
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="MAX1 = txtTercerIntento.text";
_max1 = (float)(Double.parseDouble(__ref._txttercerintento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
 };
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="If MAX1 < txtCuartoIntento.Text Then";
if (_max1<(double)(Double.parseDouble(__ref._txtcuartointento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))) { 
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="MAX1 = txtCuartoIntento.text";
_max1 = (float)(Double.parseDouble(__ref._txtcuartointento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
 };
RDebugUtils.currentLine=720909;
 //BA.debugLineNum = 720909;BA.debugLine="If MAX1 < txtQuintoIntento.Text Then";
if (_max1<(double)(Double.parseDouble(__ref._txtquintointento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))) { 
RDebugUtils.currentLine=720910;
 //BA.debugLineNum = 720910;BA.debugLine="MAX1 = txtQuintoIntento.text";
_max1 = (float)(Double.parseDouble(__ref._txtquintointento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
 };
RDebugUtils.currentLine=720912;
 //BA.debugLineNum = 720912;BA.debugLine="If MAX1 < txtSextoIntento.Text Then";
if (_max1<(double)(Double.parseDouble(__ref._txtsextointento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))) { 
RDebugUtils.currentLine=720913;
 //BA.debugLineNum = 720913;BA.debugLine="MAX1 = txtSextoIntento.text";
_max1 = (float)(Double.parseDouble(__ref._txtsextointento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
 };
RDebugUtils.currentLine=720916;
 //BA.debugLineNum = 720916;BA.debugLine="lblMensaje.Text = \"Mejor intento = \" & MAX1";
__ref._lblmensaje /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("Mejor intento = "+BA.NumberToString(_max1));
RDebugUtils.currentLine=720918;
 //BA.debugLineNum = 720918;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 458755;BA.debugLine="Private btnComprobar As Button";
_btncomprobar = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Private btnMax As Button";
_btnmax = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Private lblMensaje As Label";
_lblmensaje = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Private txtPrimerIntento As TextField";
_txtprimerintento = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="Private txtSegundoIntento As TextField";
_txtsegundointento = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="Private txtTercerIntento As TextField";
_txttercerintento = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="Private txtCuartoIntento As TextField";
_txtcuartointento = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="Private txtQuintoIntento As TextField";
_txtquintointento = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="Private txtSextoIntento As TextField";
_txtsextointento = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
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
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="End Sub";
return "";
}
}