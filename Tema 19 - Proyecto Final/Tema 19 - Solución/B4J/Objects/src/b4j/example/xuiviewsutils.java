package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class xuiviewsutils extends Object{
public static xuiviewsutils mostCurrent = new xuiviewsutils();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.xuiviewsutils", null);
		ba.loadHtSubs(xuiviewsutils.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.xuiviewsutils", ba);
		}
	}
    public static Class<?> getObject() {
		return xuiviewsutils.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static boolean _utilsinitialized = false;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static String  _performhapticfeedback(anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(ba, "performhapticfeedback", true))
	 {return ((String) Debug.delegate(ba, "performhapticfeedback", new Object[] {_view}));}
RDebugUtils.currentLine=32505856;
 //BA.debugLineNum = 32505856;BA.debugLine="Public Sub PerformHapticFeedback (View As B4XView)";
RDebugUtils.currentLine=32505857;
 //BA.debugLineNum = 32505857;BA.debugLine="Initialize";
_initialize();
RDebugUtils.currentLine=32505866;
 //BA.debugLineNum = 32505866;BA.debugLine="End Sub";
return "";
}
public static String  _settextorcsbuildertolabel(anywheresoftware.b4a.objects.B4XViewWrapper _xlbl,Object _text) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(ba, "settextorcsbuildertolabel", true))
	 {return ((String) Debug.delegate(ba, "settextorcsbuildertolabel", new Object[] {_xlbl,_text}));}
RDebugUtils.currentLine=32636928;
 //BA.debugLineNum = 32636928;BA.debugLine="Public Sub SetTextOrCSBuilderToLabel(xlbl As B4XVi";
RDebugUtils.currentLine=32636930;
 //BA.debugLineNum = 32636930;BA.debugLine="xlbl.Text = Text";
_xlbl.setText(BA.ObjectToString(_text));
RDebugUtils.currentLine=32636940;
 //BA.debugLineNum = 32636940;BA.debugLine="End Sub";
return "";
}
public static String  _addstubtoclvifneeded(b4j.example.customlistview _customlistview1,int _color) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(ba, "addstubtoclvifneeded", true))
	 {return ((String) Debug.delegate(ba, "addstubtoclvifneeded", new Object[] {_customlistview1,_color}));}
b4j.example.customlistview._clvitem _lastitem = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _height = 0;
RDebugUtils.currentLine=32571392;
 //BA.debugLineNum = 32571392;BA.debugLine="Public Sub AddStubToCLVIfNeeded(CustomListView1 As";
RDebugUtils.currentLine=32571393;
 //BA.debugLineNum = 32571393;BA.debugLine="If CustomListView1.Size = 0 Then Return";
if (_customlistview1._getsize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=32571394;
 //BA.debugLineNum = 32571394;BA.debugLine="Dim LastItem As CLVItem = CustomListView1.GetRawL";
_lastitem = _customlistview1._getrawlistitem((int) (_customlistview1._getsize()-1));
RDebugUtils.currentLine=32571395;
 //BA.debugLineNum = 32571395;BA.debugLine="If LastItem.Offset + LastItem.Panel.Height < Cust";
if (_lastitem.Offset+_lastitem.Panel.getHeight()<_customlistview1._asview().getHeight()) { 
RDebugUtils.currentLine=32571397;
 //BA.debugLineNum = 32571397;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"stub\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"stub");
RDebugUtils.currentLine=32571398;
 //BA.debugLineNum = 32571398;BA.debugLine="p.Color = Color";
_p.setColor(_color);
RDebugUtils.currentLine=32571399;
 //BA.debugLineNum = 32571399;BA.debugLine="Dim Height As Int = CustomListView1.AsView.Heigh";
_height = (int) (_customlistview1._asview().getHeight()-_lastitem.Offset-_lastitem.Panel.getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)));
RDebugUtils.currentLine=32571400;
 //BA.debugLineNum = 32571400;BA.debugLine="If xui.IsB4J Then Height = Height + 5";
if (_xui.getIsB4J()) { 
_height = (int) (_height+5);};
RDebugUtils.currentLine=32571401;
 //BA.debugLineNum = 32571401;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, CustomListView1.AsV";
_p.SetLayoutAnimated((int) (0),0,0,_customlistview1._asview().getWidth(),_height);
RDebugUtils.currentLine=32571402;
 //BA.debugLineNum = 32571402;BA.debugLine="CustomListView1.Add(p, \"\")";
_customlistview1._add(_p,(Object)(""));
RDebugUtils.currentLine=32571403;
 //BA.debugLineNum = 32571403;BA.debugLine="CustomListView1.sv.ScrollViewContentHeight = Cus";
_customlistview1._sv.setScrollViewContentHeight(_customlistview1._sv.getScrollViewContentHeight()-_customlistview1._getdividersize());
 };
RDebugUtils.currentLine=32571405;
 //BA.debugLineNum = 32571405;BA.debugLine="End Sub";
return "";
}
public static String  _setbitmapandfill(anywheresoftware.b4a.objects.B4XViewWrapper _imageview,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(ba, "setbitmapandfill", true))
	 {return ((String) Debug.delegate(ba, "setbitmapandfill", new Object[] {_imageview,_bmp}));}
anywheresoftware.b4j.objects.ImageViewWrapper _iiv = null;
RDebugUtils.currentLine=32702464;
 //BA.debugLineNum = 32702464;BA.debugLine="Public Sub SetBitmapAndFill (ImageView As B4XView,";
RDebugUtils.currentLine=32702465;
 //BA.debugLineNum = 32702465;BA.debugLine="ImageView.SetBitmap(Bmp)";
_imageview.SetBitmap((javafx.scene.image.Image)(_bmp.getObject()));
RDebugUtils.currentLine=32702466;
 //BA.debugLineNum = 32702466;BA.debugLine="Dim iiv As ImageView = ImageView";
_iiv = new anywheresoftware.b4j.objects.ImageViewWrapper();
_iiv = (anywheresoftware.b4j.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper(), (javafx.scene.image.ImageView)(_imageview.getObject()));
RDebugUtils.currentLine=32702470;
 //BA.debugLineNum = 32702470;BA.debugLine="iiv.PreserveRatio = False";
_iiv.setPreserveRatio(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=32702474;
 //BA.debugLineNum = 32702474;BA.debugLine="End Sub";
return "";
}
public static b4j.example.b4ximageview  _createb4ximageview() throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(ba, "createb4ximageview", true))
	 {return ((b4j.example.b4ximageview) Debug.delegate(ba, "createb4ximageview", null));}
b4j.example.b4ximageview _iv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
RDebugUtils.currentLine=32833536;
 //BA.debugLineNum = 32833536;BA.debugLine="Public Sub CreateB4XImageView As B4XImageView";
RDebugUtils.currentLine=32833537;
 //BA.debugLineNum = 32833537;BA.debugLine="Dim iv As B4XImageView";
_iv = new b4j.example.b4ximageview();
RDebugUtils.currentLine=32833538;
 //BA.debugLineNum = 32833538;BA.debugLine="iv.Initialize(Null, \"\")";
_iv._initialize /*String*/ (null,ba,anywheresoftware.b4a.keywords.Common.Null,"");
RDebugUtils.currentLine=32833539;
 //BA.debugLineNum = 32833539;BA.debugLine="Dim base As B4XView = xui.CreatePanel(\"\")";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
_base = _xui.CreatePanel(ba,"");
RDebugUtils.currentLine=32833540;
 //BA.debugLineNum = 32833540;BA.debugLine="base.SetLayoutAnimated(0, 0, 0, 100dip, 100dip)";
_base.SetLayoutAnimated((int) (0),0,0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
RDebugUtils.currentLine=32833541;
 //BA.debugLineNum = 32833541;BA.debugLine="iv.DesignerCreateView(base, Null, CreateMap(\"Roun";
_iv._designercreateview /*String*/ (null,(Object)(_base.getObject()),(anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(anywheresoftware.b4a.keywords.Common.Null)),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Round"),(Object)(anywheresoftware.b4a.keywords.Common.False),(Object)("ResizeMode"),(Object)("FIT"),(Object)("BackgroundColor"),(Object)(0xffaaaaaa),(Object)("CornersRadius"),(Object)(0)}));
RDebugUtils.currentLine=32833542;
 //BA.debugLineNum = 32833542;BA.debugLine="Return iv";
if (true) return _iv;
RDebugUtils.currentLine=32833543;
 //BA.debugLineNum = 32833543;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel() throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(ba, "createlabel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", null));}
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=32768000;
 //BA.debugLineNum = 32768000;BA.debugLine="Public Sub CreateLabel As B4XView";
RDebugUtils.currentLine=32768001;
 //BA.debugLineNum = 32768001;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=32768002;
 //BA.debugLineNum = 32768002;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=32768003;
 //BA.debugLineNum = 32768003;BA.debugLine="Return lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=32768004;
 //BA.debugLineNum = 32768004;BA.debugLine="End Sub";
return null;
}
public static String  _initialize() throws Exception{
RDebugUtils.currentModule="xuiviewsutils";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", null));}
RDebugUtils.currentLine=32440320;
 //BA.debugLineNum = 32440320;BA.debugLine="Private Sub Initialize";
RDebugUtils.currentLine=32440321;
 //BA.debugLineNum = 32440321;BA.debugLine="If UtilsInitialized Then Return";
if (_utilsinitialized) { 
if (true) return "";};
RDebugUtils.currentLine=32440322;
 //BA.debugLineNum = 32440322;BA.debugLine="UtilsInitialized = True";
_utilsinitialized = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=32440329;
 //BA.debugLineNum = 32440329;BA.debugLine="End Sub";
return "";
}
}