package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xpagetotal extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xpagetotal", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xpagetotal.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.LabelWrapper _lblquantity = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltotal = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public Object  _initialize(b4j.example.b4xpagetotal __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xpagetotal";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_appear(b4j.example.b4xpagetotal __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagetotal";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_appear", null));}
float _total = 0f;
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Private Sub B4XPage_Appear";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Private total As Float";
_total = 0f;
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="total =  B4XPages.MainPage.txtPC1.text * B4XPages";
_total = (float) ((double)(Double.parseDouble(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._txtpc1 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))*(double)(Double.parseDouble(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._lblpc1 /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText()))+(double)(Double.parseDouble(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._txtpc2 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))*(double)(Double.parseDouble(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._lblpc2 /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText()))+(double)(Double.parseDouble(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._txtpc3 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))*(double)(Double.parseDouble(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._lblpc3 /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText()))+(double)(Double.parseDouble(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._txtpc4 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))*(double)(Double.parseDouble(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._lblpc4 /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText())));
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="lblQuantity.Text = B4XPages.MainPage.txtPC1.text";
__ref._lblquantity /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString((double)(Double.parseDouble(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._txtpc1 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))+(double)(Double.parseDouble(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._txtpc2 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))+(double)(Double.parseDouble(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._txtpc3 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))+(double)(Double.parseDouble(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._txtpc4 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))));
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="lblTotal.Text = total";
__ref._lbltotal /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(_total));
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4j.example.b4xpagetotal __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagetotal";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Root.LoadLayout(\"frmTotal\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("frmTotal",ba);
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.b4xpagetotal __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagetotal";
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="Private lblQuantity As Label";
_lblquantity = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="Private lblTotal As Label";
_lbltotal = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="End Sub";
return "";
}
}