package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xpageingresos extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.b4xpageingresos", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xpageingresos.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblingresos = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Appear";
 //BA.debugLineNum = 21;BA.debugLine="cargarDatos";
_cargardatos();
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 15;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 17;BA.debugLine="Root.LoadLayout(\"frmIngresos\")";
_root.LoadLayout("frmIngresos",ba);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _cargardatos() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Private Sub cargarDatos";
 //BA.debugLineNum = 25;BA.debugLine="lblIngresos.Text =  B4XPages.MainPage.fltIngresos";
_lblingresos.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._fltingresostotales /*float*/ ));
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 5;BA.debugLine="Private lblIngresos As Label";
_lblingresos = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 10;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
