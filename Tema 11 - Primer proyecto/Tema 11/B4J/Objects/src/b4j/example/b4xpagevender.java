package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xpagevender extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.b4xpagevender", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xpagevender.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblnombre = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblcantidad = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltotal = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtdireccion = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnombre = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtapellidos = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Private Sub B4XPage_Appear";
 //BA.debugLineNum = 28;BA.debugLine="cargarValores";
_cargarvalores();
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 21;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 23;BA.debugLine="Root.LoadLayout(\"frmVender\")";
_root.LoadLayout("frmVender",ba);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _btnvender_click() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Private Sub btnVender_Click";
 //BA.debugLineNum = 40;BA.debugLine="If B4XPages.MainPage.pgMoviles.intMovilClicked =";
if (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgmoviles /*b4j.example.b4xpagesmoviles*/ ._intmovilclicked /*int*/ ==1) { 
 //BA.debugLineNum = 41;BA.debugLine="B4XPages.MainPage.movil1.intCantidad = B4XPages.";
_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil1 /*b4j.example.movil*/ ._intcantidad /*int*/  = (int) (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil1 /*b4j.example.movil*/ ._intcantidad /*int*/ -(double)(Double.parseDouble(_lblcantidad.getText())));
 }else if(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgmoviles /*b4j.example.b4xpagesmoviles*/ ._intmovilclicked /*int*/ ==2) { 
 //BA.debugLineNum = 43;BA.debugLine="B4XPages.MainPage.movil2.intCantidad = B4XPages.";
_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil2 /*b4j.example.movil*/ ._intcantidad /*int*/  = (int) (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil2 /*b4j.example.movil*/ ._intcantidad /*int*/ -(double)(Double.parseDouble(_lblcantidad.getText())));
 }else if(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgmoviles /*b4j.example.b4xpagesmoviles*/ ._intmovilclicked /*int*/ ==3) { 
 //BA.debugLineNum = 45;BA.debugLine="B4XPages.MainPage.movil3.intCantidad = B4XPages.";
_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil3 /*b4j.example.movil*/ ._intcantidad /*int*/  = (int) (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil3 /*b4j.example.movil*/ ._intcantidad /*int*/ -(double)(Double.parseDouble(_lblcantidad.getText())));
 }else if(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgmoviles /*b4j.example.b4xpagesmoviles*/ ._intmovilclicked /*int*/ ==4) { 
 //BA.debugLineNum = 47;BA.debugLine="B4XPages.MainPage.movil4.intCantidad = B4XPages.";
_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil4 /*b4j.example.movil*/ ._intcantidad /*int*/  = (int) (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil4 /*b4j.example.movil*/ ._intcantidad /*int*/ -(double)(Double.parseDouble(_lblcantidad.getText())));
 }else if(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgmoviles /*b4j.example.b4xpagesmoviles*/ ._intmovilclicked /*int*/ ==5) { 
 //BA.debugLineNum = 49;BA.debugLine="B4XPages.MainPage.movil5.intCantidad = B4XPages.";
_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil5 /*b4j.example.movil*/ ._intcantidad /*int*/  = (int) (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil5 /*b4j.example.movil*/ ._intcantidad /*int*/ -(double)(Double.parseDouble(_lblcantidad.getText())));
 }else if(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgmoviles /*b4j.example.b4xpagesmoviles*/ ._intmovilclicked /*int*/ ==6) { 
 //BA.debugLineNum = 51;BA.debugLine="B4XPages.MainPage.movil6.intCantidad = B4XPages.";
_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil6 /*b4j.example.movil*/ ._intcantidad /*int*/  = (int) (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil6 /*b4j.example.movil*/ ._intcantidad /*int*/ -(double)(Double.parseDouble(_lblcantidad.getText())));
 }else if(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgmoviles /*b4j.example.b4xpagesmoviles*/ ._intmovilclicked /*int*/ ==7) { 
 //BA.debugLineNum = 53;BA.debugLine="B4XPages.MainPage.movil7.intCantidad = B4XPages.";
_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil7 /*b4j.example.movil*/ ._intcantidad /*int*/  = (int) (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil7 /*b4j.example.movil*/ ._intcantidad /*int*/ -(double)(Double.parseDouble(_lblcantidad.getText())));
 }else if(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgmoviles /*b4j.example.b4xpagesmoviles*/ ._intmovilclicked /*int*/ ==8) { 
 //BA.debugLineNum = 55;BA.debugLine="B4XPages.MainPage.movil8.intCantidad = B4XPages.";
_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil8 /*b4j.example.movil*/ ._intcantidad /*int*/  = (int) (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil8 /*b4j.example.movil*/ ._intcantidad /*int*/ -(double)(Double.parseDouble(_lblcantidad.getText())));
 };
 //BA.debugLineNum = 58;BA.debugLine="B4XPages.MainPage.fltIngresosTotales = B4XPages.M";
_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._fltingresostotales /*float*/  = (float) (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._fltingresostotales /*float*/ +(double)(Double.parseDouble(_lbltotal.getText())));
 //BA.debugLineNum = 59;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"MainPage";
_b4xpages._showpageandremovepreviouspages /*String*/ ("MainPage");
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _btnvolver_click() throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Private Sub btnVolver_Click";
 //BA.debugLineNum = 64;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public String  _cargarvalores() throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Private Sub cargarValores";
 //BA.debugLineNum = 33;BA.debugLine="lblNombre.Text = B4XPages.MainPage.pgMoviles.pgMo";
_lblnombre.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgmoviles /*b4j.example.b4xpagesmoviles*/ ._pgmostrarmovil /*b4j.example.b4xpagemostrarmovil*/ ._lblnombre /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText());
 //BA.debugLineNum = 34;BA.debugLine="lblCantidad.Text = B4XPages.MainPage.pgMoviles.pg";
_lblcantidad.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgmoviles /*b4j.example.b4xpagesmoviles*/ ._pgmostrarmovil /*b4j.example.b4xpagemostrarmovil*/ ._txtcantidad /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
 //BA.debugLineNum = 35;BA.debugLine="lblTotal.Text = B4XPages.MainPage.pgMoviles.pgMos";
_lbltotal.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgmoviles /*b4j.example.b4xpagesmoviles*/ ._pgmostrarmovil /*b4j.example.b4xpagemostrarmovil*/ ._lbltotal /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText());
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private lblNombre As Label";
_lblnombre = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private lblCantidad As Label";
_lblcantidad = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private lblTotal As Label";
_lbltotal = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private txtDireccion As TextField";
_txtdireccion = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private txtNombre As TextField";
_txtnombre = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private txtApellidos As TextField";
_txtapellidos = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
