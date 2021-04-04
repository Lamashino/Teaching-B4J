package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xpagemostrarmovil extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.b4xpagemostrarmovil", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xpagemostrarmovil.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblcpu = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblnombre = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblcapacidad = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblos = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblram = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblpantalla = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblcantidad = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltotal = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtcantidad = null;
public b4j.example.b4xpagevender _pgvender = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Private Sub B4XPage_Appear";
 //BA.debugLineNum = 32;BA.debugLine="cargarValores";
_cargarvalores();
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 24;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 26;BA.debugLine="Root.LoadLayout(\"frmMostrarMovil\")";
_root.LoadLayout("frmMostrarMovil",ba);
 //BA.debugLineNum = 27;BA.debugLine="pgVender.Initialize";
_pgvender._initialize /*Object*/ (ba);
 //BA.debugLineNum = 28;BA.debugLine="B4XPages.AddPage(\"pgVender\", pgVender)";
_b4xpages._addpage /*String*/ ("pgVender",(Object)(_pgvender));
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _btnvender_click() throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Private Sub btnVender_Click";
 //BA.debugLineNum = 126;BA.debugLine="If txtCantidad.Text <= lblCantidad.Text Then";
if ((double)(Double.parseDouble(_txtcantidad.getText()))<=(double)(Double.parseDouble(_lblcantidad.getText()))) { 
 //BA.debugLineNum = 127;BA.debugLine="B4XPages.ShowPage(\"pgVender\")";
_b4xpages._showpage /*String*/ ("pgVender");
 }else {
 //BA.debugLineNum = 129;BA.debugLine="xui.MsgboxAsync(\"Error: stock insuficiente en al";
_xui.MsgboxAsync(ba,"Error: stock insuficiente en almacén","");
 };
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public String  _btnvolver_click() throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Private Sub btnVolver_Click";
 //BA.debugLineNum = 134;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public String  _cargarvalores() throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Private Sub cargarValores";
 //BA.debugLineNum = 41;BA.debugLine="If B4XPages.MainPage.pgMoviles.intMovilClicked =";
if (_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgmoviles /*b4j.example.b4xpagesmoviles*/ ._intmovilclicked /*int*/ ==1) { 
 //BA.debugLineNum = 42;BA.debugLine="lblCPU.Text = B4XPages.MainPage.movil1.strCPU";
_lblcpu.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil1 /*b4j.example.movil*/ ._strcpu /*String*/ );
 //BA.debugLineNum = 43;BA.debugLine="lblNombre.Text = B4XPages.MainPage.movil1.strN";
_lblnombre.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil1 /*b4j.example.movil*/ ._strnombre /*String*/ );
 //BA.debugLineNum = 44;BA.debugLine="lblCapacidad.Text = B4XPages.MainPage.movil1.i";
_lblcapacidad.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil1 /*b4j.example.movil*/ ._intcapacidad /*int*/ ));
 //BA.debugLineNum = 45;BA.debugLine="lblOS.Text = B4XPages.MainPage.movil1.strOS";
_lblos.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil1 /*b4j.example.movil*/ ._stros /*String*/ );
 //BA.debugLineNum = 46;BA.debugLine="lblRam.Text = B4XPages.MainPage.movil1.fltRAM";
_lblram.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil1 /*b4j.example.movil*/ ._fltram /*int*/ ));
 //BA.debugLineNum = 47;BA.debugLine="lblPantalla.Text = B4XPages.MainPage.movil1.strP";
_lblpantalla.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil1 /*b4j.example.movil*/ ._strpantalla /*String*/ );
 //BA.debugLineNum = 48;BA.debugLine="lblCantidad.Text = B4XPages.MainPage.movil1.intC";
_lblcantidad.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil1 /*b4j.example.movil*/ ._intcantidad /*int*/ ));
 //BA.debugLineNum = 49;BA.debugLine="lblTotal.Text = B4XPages.MainPage.movil1.fltPrec";
_lbltotal.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil1 /*b4j.example.movil*/ ._fltprecio /*float*/ ));
 //BA.debugLineNum = 50;BA.debugLine="txtCantidad.Text = 1";
_txtcantidad.setText(BA.NumberToString(1));
 }else if(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgmoviles /*b4j.example.b4xpagesmoviles*/ ._intmovilclicked /*int*/ ==2) { 
 //BA.debugLineNum = 52;BA.debugLine="lblCPU.Text = B4XPages.MainPage.movil2.strCPU";
_lblcpu.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil2 /*b4j.example.movil*/ ._strcpu /*String*/ );
 //BA.debugLineNum = 53;BA.debugLine="lblNombre.Text = B4XPages.MainPage.movil2.strNom";
_lblnombre.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil2 /*b4j.example.movil*/ ._strnombre /*String*/ );
 //BA.debugLineNum = 54;BA.debugLine="lblCapacidad.Text = B4XPages.MainPage.movil2.int";
_lblcapacidad.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil2 /*b4j.example.movil*/ ._intcapacidad /*int*/ ));
 //BA.debugLineNum = 55;BA.debugLine="lblOS.Text = B4XPages.MainPage.movil2.strOS";
_lblos.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil2 /*b4j.example.movil*/ ._stros /*String*/ );
 //BA.debugLineNum = 56;BA.debugLine="lblRam.Text = B4XPages.MainPage.movil2.fltRAM";
_lblram.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil2 /*b4j.example.movil*/ ._fltram /*int*/ ));
 //BA.debugLineNum = 57;BA.debugLine="lblPantalla.Text = B4XPages.MainPage.movil2.strP";
_lblpantalla.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil2 /*b4j.example.movil*/ ._strpantalla /*String*/ );
 //BA.debugLineNum = 58;BA.debugLine="lblCantidad.Text = B4XPages.MainPage.movil2.intC";
_lblcantidad.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil2 /*b4j.example.movil*/ ._intcantidad /*int*/ ));
 //BA.debugLineNum = 59;BA.debugLine="lblTotal.Text = B4XPages.MainPage.movil2.fltPrec";
_lbltotal.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil2 /*b4j.example.movil*/ ._fltprecio /*float*/ ));
 //BA.debugLineNum = 60;BA.debugLine="txtCantidad.Text = 1";
_txtcantidad.setText(BA.NumberToString(1));
 }else if(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgmoviles /*b4j.example.b4xpagesmoviles*/ ._intmovilclicked /*int*/ ==3) { 
 //BA.debugLineNum = 62;BA.debugLine="lblCPU.Text = B4XPages.MainPage.movil3.strCPU";
_lblcpu.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil3 /*b4j.example.movil*/ ._strcpu /*String*/ );
 //BA.debugLineNum = 63;BA.debugLine="lblNombre.Text = B4XPages.MainPage.movil3.strNom";
_lblnombre.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil3 /*b4j.example.movil*/ ._strnombre /*String*/ );
 //BA.debugLineNum = 64;BA.debugLine="lblCapacidad.Text = B4XPages.MainPage.movil3.int";
_lblcapacidad.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil3 /*b4j.example.movil*/ ._intcapacidad /*int*/ ));
 //BA.debugLineNum = 65;BA.debugLine="lblOS.Text = B4XPages.MainPage.movil3.strOS";
_lblos.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil3 /*b4j.example.movil*/ ._stros /*String*/ );
 //BA.debugLineNum = 66;BA.debugLine="lblRam.Text = B4XPages.MainPage.movil3.fltRAM";
_lblram.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil3 /*b4j.example.movil*/ ._fltram /*int*/ ));
 //BA.debugLineNum = 67;BA.debugLine="lblPantalla.Text = B4XPages.MainPage.movil3.strP";
_lblpantalla.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil3 /*b4j.example.movil*/ ._strpantalla /*String*/ );
 //BA.debugLineNum = 68;BA.debugLine="lblCantidad.Text = B4XPages.MainPage.movil3.intC";
_lblcantidad.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil3 /*b4j.example.movil*/ ._intcantidad /*int*/ ));
 //BA.debugLineNum = 69;BA.debugLine="lblTotal.Text = B4XPages.MainPage.movil3.fltPrec";
_lbltotal.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil3 /*b4j.example.movil*/ ._fltprecio /*float*/ ));
 //BA.debugLineNum = 70;BA.debugLine="txtCantidad.Text = 1";
_txtcantidad.setText(BA.NumberToString(1));
 }else if(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgmoviles /*b4j.example.b4xpagesmoviles*/ ._intmovilclicked /*int*/ ==4) { 
 //BA.debugLineNum = 72;BA.debugLine="lblCPU.Text = B4XPages.MainPage.movil4.strCPU";
_lblcpu.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil4 /*b4j.example.movil*/ ._strcpu /*String*/ );
 //BA.debugLineNum = 73;BA.debugLine="lblNombre.Text = B4XPages.MainPage.movil4.strNom";
_lblnombre.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil4 /*b4j.example.movil*/ ._strnombre /*String*/ );
 //BA.debugLineNum = 74;BA.debugLine="lblCapacidad.Text = B4XPages.MainPage.movil4.int";
_lblcapacidad.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil4 /*b4j.example.movil*/ ._intcapacidad /*int*/ ));
 //BA.debugLineNum = 75;BA.debugLine="lblOS.Text = B4XPages.MainPage.movil4.strOS";
_lblos.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil4 /*b4j.example.movil*/ ._stros /*String*/ );
 //BA.debugLineNum = 76;BA.debugLine="lblRam.Text = B4XPages.MainPage.movil4.fltRAM";
_lblram.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil4 /*b4j.example.movil*/ ._fltram /*int*/ ));
 //BA.debugLineNum = 77;BA.debugLine="lblPantalla.Text = B4XPages.MainPage.movil4.strP";
_lblpantalla.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil4 /*b4j.example.movil*/ ._strpantalla /*String*/ );
 //BA.debugLineNum = 78;BA.debugLine="lblCantidad.Text = B4XPages.MainPage.movil4.intC";
_lblcantidad.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil4 /*b4j.example.movil*/ ._intcantidad /*int*/ ));
 //BA.debugLineNum = 79;BA.debugLine="lblTotal.Text = B4XPages.MainPage.movil4.fltPrec";
_lbltotal.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil4 /*b4j.example.movil*/ ._fltprecio /*float*/ ));
 //BA.debugLineNum = 80;BA.debugLine="txtCantidad.Text = 1";
_txtcantidad.setText(BA.NumberToString(1));
 }else if(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgmoviles /*b4j.example.b4xpagesmoviles*/ ._intmovilclicked /*int*/ ==5) { 
 //BA.debugLineNum = 82;BA.debugLine="lblCPU.Text = B4XPages.MainPage.movil5.strCPU";
_lblcpu.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil5 /*b4j.example.movil*/ ._strcpu /*String*/ );
 //BA.debugLineNum = 83;BA.debugLine="lblNombre.Text = B4XPages.MainPage.movil5.strNom";
_lblnombre.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil5 /*b4j.example.movil*/ ._strnombre /*String*/ );
 //BA.debugLineNum = 84;BA.debugLine="lblCapacidad.Text = B4XPages.MainPage.movil5.int";
_lblcapacidad.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil5 /*b4j.example.movil*/ ._intcapacidad /*int*/ ));
 //BA.debugLineNum = 85;BA.debugLine="lblOS.Text = B4XPages.MainPage.movil5.strOS";
_lblos.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil5 /*b4j.example.movil*/ ._stros /*String*/ );
 //BA.debugLineNum = 86;BA.debugLine="lblRam.Text = B4XPages.MainPage.movil5.fltRAM";
_lblram.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil5 /*b4j.example.movil*/ ._fltram /*int*/ ));
 //BA.debugLineNum = 87;BA.debugLine="lblPantalla.Text = B4XPages.MainPage.movil5.strP";
_lblpantalla.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil5 /*b4j.example.movil*/ ._strpantalla /*String*/ );
 //BA.debugLineNum = 88;BA.debugLine="lblCantidad.Text = B4XPages.MainPage.movil5.intC";
_lblcantidad.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil5 /*b4j.example.movil*/ ._intcantidad /*int*/ ));
 //BA.debugLineNum = 89;BA.debugLine="lblTotal.Text = B4XPages.MainPage.movil5.fltPrec";
_lbltotal.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil5 /*b4j.example.movil*/ ._fltprecio /*float*/ ));
 //BA.debugLineNum = 90;BA.debugLine="txtCantidad.Text = 1";
_txtcantidad.setText(BA.NumberToString(1));
 }else if(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgmoviles /*b4j.example.b4xpagesmoviles*/ ._intmovilclicked /*int*/ ==6) { 
 //BA.debugLineNum = 92;BA.debugLine="lblCPU.Text = B4XPages.MainPage.movil6.strCPU";
_lblcpu.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil6 /*b4j.example.movil*/ ._strcpu /*String*/ );
 //BA.debugLineNum = 93;BA.debugLine="lblNombre.Text = B4XPages.MainPage.movil6.strNom";
_lblnombre.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil6 /*b4j.example.movil*/ ._strnombre /*String*/ );
 //BA.debugLineNum = 94;BA.debugLine="lblCapacidad.Text = B4XPages.MainPage.movil6.int";
_lblcapacidad.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil6 /*b4j.example.movil*/ ._intcapacidad /*int*/ ));
 //BA.debugLineNum = 95;BA.debugLine="lblOS.Text = B4XPages.MainPage.movil6.strOS";
_lblos.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil6 /*b4j.example.movil*/ ._stros /*String*/ );
 //BA.debugLineNum = 96;BA.debugLine="lblRam.Text = B4XPages.MainPage.movil6.fltRAM";
_lblram.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil6 /*b4j.example.movil*/ ._fltram /*int*/ ));
 //BA.debugLineNum = 97;BA.debugLine="lblPantalla.Text = B4XPages.MainPage.movil6.strP";
_lblpantalla.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil6 /*b4j.example.movil*/ ._strpantalla /*String*/ );
 //BA.debugLineNum = 98;BA.debugLine="lblCantidad.Text = B4XPages.MainPage.movil6.intC";
_lblcantidad.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil6 /*b4j.example.movil*/ ._intcantidad /*int*/ ));
 //BA.debugLineNum = 99;BA.debugLine="lblTotal.Text = B4XPages.MainPage.movil6.fltPrec";
_lbltotal.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil6 /*b4j.example.movil*/ ._fltprecio /*float*/ ));
 //BA.debugLineNum = 100;BA.debugLine="txtCantidad.Text = 1";
_txtcantidad.setText(BA.NumberToString(1));
 }else if(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgmoviles /*b4j.example.b4xpagesmoviles*/ ._intmovilclicked /*int*/ ==7) { 
 //BA.debugLineNum = 102;BA.debugLine="lblCPU.Text = B4XPages.MainPage.movil7.strCPU";
_lblcpu.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil7 /*b4j.example.movil*/ ._strcpu /*String*/ );
 //BA.debugLineNum = 103;BA.debugLine="lblNombre.Text = B4XPages.MainPage.movil7.strNom";
_lblnombre.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil7 /*b4j.example.movil*/ ._strnombre /*String*/ );
 //BA.debugLineNum = 104;BA.debugLine="lblCapacidad.Text = B4XPages.MainPage.movil7.int";
_lblcapacidad.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil7 /*b4j.example.movil*/ ._intcapacidad /*int*/ ));
 //BA.debugLineNum = 105;BA.debugLine="lblOS.Text = B4XPages.MainPage.movil7.strOS";
_lblos.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil7 /*b4j.example.movil*/ ._stros /*String*/ );
 //BA.debugLineNum = 106;BA.debugLine="lblRam.Text = B4XPages.MainPage.movil7.fltRAM";
_lblram.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil7 /*b4j.example.movil*/ ._fltram /*int*/ ));
 //BA.debugLineNum = 107;BA.debugLine="lblPantalla.Text = B4XPages.MainPage.movil7.strP";
_lblpantalla.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil7 /*b4j.example.movil*/ ._strpantalla /*String*/ );
 //BA.debugLineNum = 108;BA.debugLine="lblCantidad.Text = B4XPages.MainPage.movil7.intC";
_lblcantidad.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil7 /*b4j.example.movil*/ ._intcantidad /*int*/ ));
 //BA.debugLineNum = 109;BA.debugLine="lblTotal.Text = B4XPages.MainPage.movil7.fltPrec";
_lbltotal.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil7 /*b4j.example.movil*/ ._fltprecio /*float*/ ));
 //BA.debugLineNum = 110;BA.debugLine="txtCantidad.Text = 1";
_txtcantidad.setText(BA.NumberToString(1));
 }else if(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._pgmoviles /*b4j.example.b4xpagesmoviles*/ ._intmovilclicked /*int*/ ==8) { 
 //BA.debugLineNum = 112;BA.debugLine="lblCPU.Text = B4XPages.MainPage.movil8.strCPU";
_lblcpu.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil8 /*b4j.example.movil*/ ._strcpu /*String*/ );
 //BA.debugLineNum = 113;BA.debugLine="lblNombre.Text = B4XPages.MainPage.movil8.strNom";
_lblnombre.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil8 /*b4j.example.movil*/ ._strnombre /*String*/ );
 //BA.debugLineNum = 114;BA.debugLine="lblCapacidad.Text = B4XPages.MainPage.movil8.int";
_lblcapacidad.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil8 /*b4j.example.movil*/ ._intcapacidad /*int*/ ));
 //BA.debugLineNum = 115;BA.debugLine="lblOS.Text = B4XPages.MainPage.movil8.strOS";
_lblos.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil8 /*b4j.example.movil*/ ._stros /*String*/ );
 //BA.debugLineNum = 116;BA.debugLine="lblRam.Text = B4XPages.MainPage.movil8.fltRAM";
_lblram.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil8 /*b4j.example.movil*/ ._fltram /*int*/ ));
 //BA.debugLineNum = 117;BA.debugLine="lblPantalla.Text = B4XPages.MainPage.movil8.strP";
_lblpantalla.setText(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil8 /*b4j.example.movil*/ ._strpantalla /*String*/ );
 //BA.debugLineNum = 118;BA.debugLine="lblCantidad.Text = B4XPages.MainPage.movil8.intC";
_lblcantidad.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil8 /*b4j.example.movil*/ ._intcantidad /*int*/ ));
 //BA.debugLineNum = 119;BA.debugLine="lblTotal.Text = B4XPages.MainPage.movil8.fltPrec";
_lbltotal.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil8 /*b4j.example.movil*/ ._fltprecio /*float*/ ));
 //BA.debugLineNum = 120;BA.debugLine="txtCantidad.Text = 1";
_txtcantidad.setText(BA.NumberToString(1));
 };
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private lblCPU As Label";
_lblcpu = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Public  lblNombre As Label		' Necesitamos esta in";
_lblnombre = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private lblCapacidad As Label";
_lblcapacidad = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private lblOS As Label";
_lblos = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private lblRam As Label";
_lblram = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private lblPantalla As Label";
_lblpantalla = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private lblCantidad As Label";
_lblcantidad = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Public  lblTotal As Label		' Necesitamos esta inf";
_lbltotal = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Public  txtCantidad As TextField ' Necesitamos es";
_txtcantidad = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Public pgVender As B4XPageVender";
_pgvender = new b4j.example.b4xpagevender();
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public String  _txtcantidad_textchanged(String _viejo,String _nuevo) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Private Sub txtCantidad_TextChanged (Viejo As Stri";
 //BA.debugLineNum = 138;BA.debugLine="If Nuevo <> \"\" Then";
if ((_nuevo).equals("") == false) { 
 //BA.debugLineNum = 139;BA.debugLine="lblTotal.Text = B4XPages.MainPage.movil8.fltPrec";
_lbltotal.setText(BA.NumberToString(_b4xpages._mainpage /*b4j.example.b4xmainpage*/ ()._movil8 /*b4j.example.movil*/ ._fltprecio /*float*/ *(double)(Double.parseDouble(_nuevo))));
 }else {
 //BA.debugLineNum = 141;BA.debugLine="lblTotal.Text = 0";
_lbltotal.setText(BA.NumberToString(0));
 };
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
