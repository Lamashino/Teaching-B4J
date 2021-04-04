package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.b4xmainpage", this);
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4j.example.movil _movil1 = null;
public b4j.example.movil _movil2 = null;
public b4j.example.movil _movil3 = null;
public b4j.example.movil _movil4 = null;
public b4j.example.movil _movil5 = null;
public b4j.example.movil _movil6 = null;
public b4j.example.movil _movil7 = null;
public b4j.example.movil _movil8 = null;
public b4j.example.b4xpagesmoviles _pgmoviles = null;
public b4j.example.b4xpagealmacen _pgalmacen = null;
public b4j.example.b4xpageingresos _pgingresos = null;
public float _fltingresostotales = 0f;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 24;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 25;BA.debugLine="Root.LoadLayout(\"MainPage\")";
_root.LoadLayout("MainPage",ba);
 //BA.debugLineNum = 26;BA.debugLine="fltIngresosTotales = 0 		' Al principio, hemos ga";
_fltingresostotales = (float) (0);
 //BA.debugLineNum = 27;BA.debugLine="pgMoviles.Initialize";
_pgmoviles._initialize /*Object*/ (ba);
 //BA.debugLineNum = 28;BA.debugLine="B4XPages.AddPage(\"pgMoviles\", pgMoviles)";
_b4xpages._addpage /*String*/ ("pgMoviles",(Object)(_pgmoviles));
 //BA.debugLineNum = 29;BA.debugLine="pgAlmacen.Initialize";
_pgalmacen._initialize /*Object*/ (ba);
 //BA.debugLineNum = 30;BA.debugLine="B4XPages.AddPage(\"pgAlmacen\", pgAlmacen)";
_b4xpages._addpage /*String*/ ("pgAlmacen",(Object)(_pgalmacen));
 //BA.debugLineNum = 31;BA.debugLine="pgIngresos.Initialize";
_pgingresos._initialize /*Object*/ (ba);
 //BA.debugLineNum = 32;BA.debugLine="B4XPages.AddPage(\"pgIngresos\", pgIngresos)";
_b4xpages._addpage /*String*/ ("pgIngresos",(Object)(_pgingresos));
 //BA.debugLineNum = 34;BA.debugLine="insertarMoviles";
_insertarmoviles();
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _btnalmacen_click() throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Private Sub btnAlmacen_Click";
 //BA.debugLineNum = 59;BA.debugLine="B4XPages.ShowPage(\"pgAlmacen\")";
_b4xpages._showpage /*String*/ ("pgAlmacen");
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _btncomprar_click() throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Private Sub btnComprar_Click";
 //BA.debugLineNum = 67;BA.debugLine="B4XPages.ShowPage(\"pgMoviles\")";
_b4xpages._showpage /*String*/ ("pgMoviles");
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _btningresos_click() throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Private Sub btnIngresos_Click";
 //BA.debugLineNum = 63;BA.debugLine="B4XPages.ShowPage(\"pgIngresos\")";
_b4xpages._showpage /*String*/ ("pgIngresos");
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 10;BA.debugLine="Public  movil1, movil2, movil3, movil4 As Movil";
_movil1 = new b4j.example.movil();
_movil2 = new b4j.example.movil();
_movil3 = new b4j.example.movil();
_movil4 = new b4j.example.movil();
 //BA.debugLineNum = 11;BA.debugLine="Public  movil5, movil6, movil7, movil8 As Movil";
_movil5 = new b4j.example.movil();
_movil6 = new b4j.example.movil();
_movil7 = new b4j.example.movil();
_movil8 = new b4j.example.movil();
 //BA.debugLineNum = 12;BA.debugLine="Public  pgMoviles As B4XPagesMoviles";
_pgmoviles = new b4j.example.b4xpagesmoviles();
 //BA.debugLineNum = 13;BA.debugLine="Private pgAlmacen As B4XPageAlmacen";
_pgalmacen = new b4j.example.b4xpagealmacen();
 //BA.debugLineNum = 14;BA.debugLine="Private pgIngresos As B4XPageIngresos";
_pgingresos = new b4j.example.b4xpageingresos();
 //BA.debugLineNum = 15;BA.debugLine="Public  fltIngresosTotales As Float 		'Variable p";
_fltingresostotales = 0f;
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public String  _insertarmoviles() throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Private Sub insertarMoviles";
 //BA.debugLineNum = 39;BA.debugLine="movil1.Initialize";
_movil1._initialize /*String*/ (ba);
 //BA.debugLineNum = 40;BA.debugLine="movil1.nuevoMovil(\"Yallomi\", \"6.53\", 64, 4,  \"Med";
_movil1._nuevomovil /*String*/ ("Yallomi","6.53",(int) (64),(int) (4),"Mediatek",(int) (12),"Android",(float) (150));
 //BA.debugLineNum = 41;BA.debugLine="movil2.Initialize";
_movil2._initialize /*String*/ (ba);
 //BA.debugLineNum = 42;BA.debugLine="movil2.nuevoMovil(\"Smith\", \"6.67\", 64, 4, \"Qualco";
_movil2._nuevomovil /*String*/ ("Smith","6.67",(int) (64),(int) (4),"Qualcomm",(int) (4),"Android",(float) (220));
 //BA.debugLineNum = 43;BA.debugLine="movil3.Initialize";
_movil3._initialize /*String*/ (ba);
 //BA.debugLineNum = 44;BA.debugLine="movil3.nuevoMovil(\"Taurus\", \"6.1\", 128, 4, \"Bioni";
_movil3._nuevomovil /*String*/ ("Taurus","6.1",(int) (128),(int) (4),"Bionic",(int) (7),"IOS",(float) (780));
 //BA.debugLineNum = 45;BA.debugLine="movil4.Initialize";
_movil4._initialize /*String*/ (ba);
 //BA.debugLineNum = 46;BA.debugLine="movil4.nuevoMovil(\"Talisman\", \"5.8\", 64, 4, \"Medi";
_movil4._nuevomovil /*String*/ ("Talisman","5.8",(int) (64),(int) (4),"Mediatek",(int) (12),"Android",(float) (150));
 //BA.debugLineNum = 47;BA.debugLine="movil5.Initialize";
_movil5._initialize /*String*/ (ba);
 //BA.debugLineNum = 48;BA.debugLine="movil5.nuevoMovil(\"Cranberry\", \"5.8\", 32, 3, \"Med";
_movil5._nuevomovil /*String*/ ("Cranberry","5.8",(int) (32),(int) (3),"Mediatek",(int) (16),"Android",(float) (130));
 //BA.debugLineNum = 49;BA.debugLine="movil6.Initialize";
_movil6._initialize /*String*/ (ba);
 //BA.debugLineNum = 50;BA.debugLine="movil6.nuevoMovil(\"OzOn\", \"5.8\", 32, 2, \"Mediatek";
_movil6._nuevomovil /*String*/ ("OzOn","5.8",(int) (32),(int) (2),"Mediatek",(int) (16),"Android",(float) (90));
 //BA.debugLineNum = 51;BA.debugLine="movil7.Initialize";
_movil7._initialize /*String*/ (ba);
 //BA.debugLineNum = 52;BA.debugLine="movil7.nuevoMovil(\"H2O\", \"5.8\", 64, 3, \"Qualcomm\"";
_movil7._nuevomovil /*String*/ ("H2O","5.8",(int) (64),(int) (3),"Qualcomm",(int) (2),"Android",(float) (170));
 //BA.debugLineNum = 53;BA.debugLine="movil8.Initialize";
_movil8._initialize /*String*/ (ba);
 //BA.debugLineNum = 54;BA.debugLine="movil8.nuevoMovil(\"Zeus\", \"6.67\", 128, 6, \"Qualco";
_movil8._nuevomovil /*String*/ ("Zeus","6.67",(int) (128),(int) (6),"Qualcomm",(int) (4),"Android",(float) (650));
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
