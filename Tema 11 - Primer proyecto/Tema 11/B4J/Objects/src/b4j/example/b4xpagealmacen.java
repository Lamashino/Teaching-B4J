package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xpagealmacen extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.b4xpagealmacen", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xpagealmacen.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblmovil1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblmovil2 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblmovil3 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblmovil4 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblmovil5 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblmovil6 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblmovil7 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblmovil8 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblc1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblc2 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblc3 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblc4 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblc5 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblc6 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblc7 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblc8 = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Private Sub B4XPage_Appear";
 //BA.debugLineNum = 35;BA.debugLine="cargarDatos";
_cargardatos();
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 29;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 31;BA.debugLine="Root.LoadLayout(\"frmAlmacen\")";
_root.LoadLayout("frmAlmacen",ba);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public String  _cargardatos() throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Private Sub cargarDatos";
 //BA.debugLineNum = 39;BA.debugLine="lblMovil1.Text = B4XPages.MainPage.movil1.strNomb";
_lblmovil1.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil1 /*b4j.example.movil*/ ._strnombre /*String*/ );
 //BA.debugLineNum = 40;BA.debugLine="lblMovil2.Text = B4XPages.MainPage.movil2.strNomb";
_lblmovil2.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil2 /*b4j.example.movil*/ ._strnombre /*String*/ );
 //BA.debugLineNum = 41;BA.debugLine="lblMovil3.Text = B4XPages.MainPage.movil3.strNomb";
_lblmovil3.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil3 /*b4j.example.movil*/ ._strnombre /*String*/ );
 //BA.debugLineNum = 42;BA.debugLine="lblMovil4.Text = B4XPages.MainPage.movil4.strNomb";
_lblmovil4.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil4 /*b4j.example.movil*/ ._strnombre /*String*/ );
 //BA.debugLineNum = 43;BA.debugLine="lblMovil5.Text = B4XPages.MainPage.movil5.strNomb";
_lblmovil5.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil5 /*b4j.example.movil*/ ._strnombre /*String*/ );
 //BA.debugLineNum = 44;BA.debugLine="lblMovil6.Text = B4XPages.MainPage.movil6.strNomb";
_lblmovil6.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil6 /*b4j.example.movil*/ ._strnombre /*String*/ );
 //BA.debugLineNum = 45;BA.debugLine="lblMovil7.Text = B4XPages.MainPage.movil7.strNomb";
_lblmovil7.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil7 /*b4j.example.movil*/ ._strnombre /*String*/ );
 //BA.debugLineNum = 46;BA.debugLine="lblMovil8.Text = B4XPages.MainPage.movil8.strNomb";
_lblmovil8.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil8 /*b4j.example.movil*/ ._strnombre /*String*/ );
 //BA.debugLineNum = 47;BA.debugLine="lblC1.Text = B4XPages.MainPage.movil1.intCantidad";
_lblc1.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil1 /*b4j.example.movil*/ ._intcantidad /*int*/ ));
 //BA.debugLineNum = 48;BA.debugLine="lblC2.Text = B4XPages.MainPage.movil2.intCantidad";
_lblc2.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil2 /*b4j.example.movil*/ ._intcantidad /*int*/ ));
 //BA.debugLineNum = 49;BA.debugLine="lblC3.Text = B4XPages.MainPage.movil3.intCantidad";
_lblc3.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil3 /*b4j.example.movil*/ ._intcantidad /*int*/ ));
 //BA.debugLineNum = 50;BA.debugLine="lblC4.Text = B4XPages.MainPage.movil4.intCantidad";
_lblc4.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil4 /*b4j.example.movil*/ ._intcantidad /*int*/ ));
 //BA.debugLineNum = 51;BA.debugLine="lblC5.Text = B4XPages.MainPage.movil5.intCantidad";
_lblc5.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil5 /*b4j.example.movil*/ ._intcantidad /*int*/ ));
 //BA.debugLineNum = 52;BA.debugLine="lblC6.Text = B4XPages.MainPage.movil6.intCantidad";
_lblc6.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil6 /*b4j.example.movil*/ ._intcantidad /*int*/ ));
 //BA.debugLineNum = 53;BA.debugLine="lblC7.Text = B4XPages.MainPage.movil7.intCantidad";
_lblc7.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil7 /*b4j.example.movil*/ ._intcantidad /*int*/ ));
 //BA.debugLineNum = 54;BA.debugLine="lblC8.Text = B4XPages.MainPage.movil8.intCantidad";
_lblc8.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil8 /*b4j.example.movil*/ ._intcantidad /*int*/ ));
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private lblMovil1 As Label";
_lblmovil1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private lblMovil2 As Label";
_lblmovil2 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private lblMovil3 As Label";
_lblmovil3 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private lblMovil4 As Label";
_lblmovil4 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private lblMovil5 As Label";
_lblmovil5 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private lblMovil6 As Label";
_lblmovil6 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private lblMovil7 As Label";
_lblmovil7 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private lblMovil8 As Label";
_lblmovil8 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private lblC1 As Label";
_lblc1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private lblC2 As Label";
_lblc2 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private lblC3 As Label";
_lblc3 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private lblC4 As Label";
_lblc4 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private lblC5 As Label";
_lblc5 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private lblC6 As Label";
_lblc6 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private lblC7 As Label";
_lblc7 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private lblC8 As Label";
_lblc8 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 23;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
