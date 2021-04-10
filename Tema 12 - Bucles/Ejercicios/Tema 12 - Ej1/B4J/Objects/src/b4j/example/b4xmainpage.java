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
public anywheresoftware.b4j.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _textfield1 = null;
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
public String  _button1_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {return ((String) Debug.delegate(ba, "button1_click", null));}
int _intsum = 0;
int _i = 0;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Private Sub Button1_Click";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Private intSum As Int = 0";
_intsum = (int) (0);
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="If TextField1.Text >= 1 And TextField1.Text <= 10";
if ((double)(Double.parseDouble(__ref._textfield1 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))>=1 && (double)(Double.parseDouble(__ref._textfield1 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))<=100) { 
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="For i = 1 To TextField1.Text";
{
final int step3 = 1;
final int limit3 = (int)(Double.parseDouble(__ref._textfield1 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
_i = (int) (1) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="intSum = intSum + i";
_intsum = (int) (_intsum+_i);
 }
};
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="Label2.Text = intSum";
__ref._label2 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_intsum));
 }else {
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="xui.MsgboxAsync(\"Values must be between 1 and 10";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Values must be between 1 and 100","Error");
 };
RDebugUtils.currentLine=655370;
 //BA.debugLineNum = 655370;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 458755;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Private Label2 As Label";
_label2 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Private TextField1 As TextField";
_textfield1 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="End Sub";
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