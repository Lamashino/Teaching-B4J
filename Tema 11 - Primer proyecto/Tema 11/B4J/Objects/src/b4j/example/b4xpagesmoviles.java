package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xpagesmoviles extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.b4xpagesmoviles", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xpagesmoviles.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.LabelWrapper _lblprecio1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblprecio2 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblprecio3 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblprecio4 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblprecio5 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblprecio6 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblprecio7 = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblprecio8 = null;
public int _intmovilclicked = 0;
public b4j.example.b4xpagemostrarmovil _pgmostrarmovil = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Private Sub B4XPage_Appear";
 //BA.debugLineNum = 40;BA.debugLine="insertValues";
_insertvalues();
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 32;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 34;BA.debugLine="Root.LoadLayout(\"frmMoviles\")";
_root.LoadLayout("frmMoviles",ba);
 //BA.debugLineNum = 35;BA.debugLine="pgMostrarMovil.Initialize";
_pgmostrarmovil._initialize /*Object*/ (ba);
 //BA.debugLineNum = 36;BA.debugLine="B4XPages.AddPage(\"pgMostrar\", pgMostrarMovil)";
_b4xpages._addpage /*String*/ ("pgMostrar",(Object)(_pgmostrarmovil));
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 5;BA.debugLine="Private lblMovil1 As Label";
_lblmovil1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private lblMovil2 As Label";
_lblmovil2 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private lblMovil3 As Label";
_lblmovil3 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private lblMovil4 As Label";
_lblmovil4 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private lblMovil5 As Label";
_lblmovil5 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private lblMovil6 As Label";
_lblmovil6 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private lblMovil7 As Label";
_lblmovil7 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private lblMovil8 As Label";
_lblmovil8 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private lblPrecio1 As Label";
_lblprecio1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private lblPrecio2 As Label";
_lblprecio2 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private lblPrecio3 As Label";
_lblprecio3 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private lblPrecio4 As Label";
_lblprecio4 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private lblPrecio5 As Label";
_lblprecio5 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private lblPrecio6 As Label";
_lblprecio6 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private lblPrecio7 As Label";
_lblprecio7 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private lblPrecio8 As Label";
_lblprecio8 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Public intMovilClicked As Int";
_intmovilclicked = 0;
 //BA.debugLineNum = 23;BA.debugLine="Public pgMostrarMovil As B4XPageMostrarMovil";
_pgmostrarmovil = new b4j.example.b4xpagemostrarmovil();
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public String  _insertvalues() throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Private Sub insertValues";
 //BA.debugLineNum = 44;BA.debugLine="lblMovil1.Text = B4XPages.MainPage.movil1.strNomb";
_lblmovil1.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil1 /*b4j.example.movil*/ ._strnombre /*String*/ );
 //BA.debugLineNum = 45;BA.debugLine="lblMovil2.Text = B4XPages.MainPage.movil2.strNomb";
_lblmovil2.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil2 /*b4j.example.movil*/ ._strnombre /*String*/ );
 //BA.debugLineNum = 46;BA.debugLine="lblMovil3.Text = B4XPages.MainPage.movil3.strNomb";
_lblmovil3.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil3 /*b4j.example.movil*/ ._strnombre /*String*/ );
 //BA.debugLineNum = 47;BA.debugLine="lblMovil4.Text = B4XPages.MainPage.movil4.strNomb";
_lblmovil4.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil4 /*b4j.example.movil*/ ._strnombre /*String*/ );
 //BA.debugLineNum = 48;BA.debugLine="lblMovil5.Text = B4XPages.MainPage.movil5.strNomb";
_lblmovil5.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil5 /*b4j.example.movil*/ ._strnombre /*String*/ );
 //BA.debugLineNum = 49;BA.debugLine="lblMovil6.Text = B4XPages.MainPage.movil6.strNomb";
_lblmovil6.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil6 /*b4j.example.movil*/ ._strnombre /*String*/ );
 //BA.debugLineNum = 50;BA.debugLine="lblMovil7.Text = B4XPages.MainPage.movil7.strNomb";
_lblmovil7.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil7 /*b4j.example.movil*/ ._strnombre /*String*/ );
 //BA.debugLineNum = 51;BA.debugLine="lblMovil8.Text = B4XPages.MainPage.movil8.strNomb";
_lblmovil8.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil8 /*b4j.example.movil*/ ._strnombre /*String*/ );
 //BA.debugLineNum = 52;BA.debugLine="lblPrecio1.Text = B4XPages.MainPage.movil1.fltPre";
_lblprecio1.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil1 /*b4j.example.movil*/ ._fltprecio /*float*/ )+" $");
 //BA.debugLineNum = 53;BA.debugLine="lblPrecio2.Text = B4XPages.MainPage.movil2.fltPre";
_lblprecio2.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil2 /*b4j.example.movil*/ ._fltprecio /*float*/ )+" $");
 //BA.debugLineNum = 54;BA.debugLine="lblPrecio3.Text = B4XPages.MainPage.movil3.fltPre";
_lblprecio3.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil3 /*b4j.example.movil*/ ._fltprecio /*float*/ )+" $");
 //BA.debugLineNum = 55;BA.debugLine="lblPrecio4.Text = B4XPages.MainPage.movil4.fltPre";
_lblprecio4.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil4 /*b4j.example.movil*/ ._fltprecio /*float*/ )+" $");
 //BA.debugLineNum = 56;BA.debugLine="lblPrecio5.Text = B4XPages.MainPage.movil5.fltPre";
_lblprecio5.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil5 /*b4j.example.movil*/ ._fltprecio /*float*/ )+" $");
 //BA.debugLineNum = 57;BA.debugLine="lblPrecio6.Text = B4XPages.MainPage.movil6.fltPre";
_lblprecio6.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil6 /*b4j.example.movil*/ ._fltprecio /*float*/ )+" $");
 //BA.debugLineNum = 58;BA.debugLine="lblPrecio7.Text = B4XPages.MainPage.movil7.fltPre";
_lblprecio7.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil7 /*b4j.example.movil*/ ._fltprecio /*float*/ )+" $");
 //BA.debugLineNum = 59;BA.debugLine="lblPrecio8.Text = B4XPages.MainPage.movil8.fltPre";
_lblprecio8.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil8 /*b4j.example.movil*/ ._fltprecio /*float*/ )+" $");
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _lblmovil1_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Private Sub lblMovil1_MouseClicked (EventData As M";
 //BA.debugLineNum = 63;BA.debugLine="intMovilClicked = 1";
_intmovilclicked = (int) (1);
 //BA.debugLineNum = 64;BA.debugLine="B4XPages.ShowPage(\"pgMostrar\")";
_b4xpages._showpage /*String*/ ("pgMostrar");
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public String  _lblmovil2_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Private Sub lblMovil2_MouseClicked (EventData As M";
 //BA.debugLineNum = 68;BA.debugLine="intMovilClicked = 2";
_intmovilclicked = (int) (2);
 //BA.debugLineNum = 69;BA.debugLine="B4XPages.ShowPage(\"pgMostrar\")";
_b4xpages._showpage /*String*/ ("pgMostrar");
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public String  _lblmovil3_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Private Sub lblMovil3_MouseClicked (EventData As M";
 //BA.debugLineNum = 73;BA.debugLine="intMovilClicked = 3";
_intmovilclicked = (int) (3);
 //BA.debugLineNum = 74;BA.debugLine="B4XPages.ShowPage(\"pgMostrar\")";
_b4xpages._showpage /*String*/ ("pgMostrar");
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public String  _lblmovil4_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Private Sub lblMovil4_MouseClicked (EventData As M";
 //BA.debugLineNum = 78;BA.debugLine="intMovilClicked = 4";
_intmovilclicked = (int) (4);
 //BA.debugLineNum = 79;BA.debugLine="B4XPages.ShowPage(\"pgMostrar\")";
_b4xpages._showpage /*String*/ ("pgMostrar");
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _lblmovil5_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Private Sub lblMovil5_MouseClicked (EventData As M";
 //BA.debugLineNum = 83;BA.debugLine="intMovilClicked = 5";
_intmovilclicked = (int) (5);
 //BA.debugLineNum = 84;BA.debugLine="B4XPages.ShowPage(\"pgMostrar\")";
_b4xpages._showpage /*String*/ ("pgMostrar");
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public String  _lblmovil6_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Private Sub lblMovil6_MouseClicked (EventData As M";
 //BA.debugLineNum = 88;BA.debugLine="intMovilClicked = 6";
_intmovilclicked = (int) (6);
 //BA.debugLineNum = 89;BA.debugLine="B4XPages.ShowPage(\"pgMostrar\")";
_b4xpages._showpage /*String*/ ("pgMostrar");
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _lblmovil7_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Private Sub lblMovil7_MouseClicked (EventData As M";
 //BA.debugLineNum = 93;BA.debugLine="intMovilClicked = 7";
_intmovilclicked = (int) (7);
 //BA.debugLineNum = 94;BA.debugLine="B4XPages.ShowPage(\"pgMostrar\")";
_b4xpages._showpage /*String*/ ("pgMostrar");
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public String  _lblmovil8_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Private Sub lblMovil8_MouseClicked (EventData As M";
 //BA.debugLineNum = 98;BA.debugLine="intMovilClicked = 8";
_intmovilclicked = (int) (8);
 //BA.debugLineNum = 99;BA.debugLine="B4XPages.ShowPage(\"pgMostrar\")";
_b4xpages._showpage /*String*/ ("pgMostrar");
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
