package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4jtextflow extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4jtextflow", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4jtextflow.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4a.objects.collections.List _texts = null;
public anywheresoftware.b4j.object.JavaObject _lastitem = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4j.example.b4jtextflow __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=32964608;
 //BA.debugLineNum = 32964608;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=32964609;
 //BA.debugLineNum = 32964609;BA.debugLine="Reset";
__ref._reset /*b4j.example.b4jtextflow*/ (null);
RDebugUtils.currentLine=32964610;
 //BA.debugLineNum = 32964610;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4jtextflow  _reset(b4j.example.b4jtextflow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "reset", true))
	 {return ((b4j.example.b4jtextflow) Debug.delegate(ba, "reset", null));}
RDebugUtils.currentLine=33030144;
 //BA.debugLineNum = 33030144;BA.debugLine="Public Sub Reset As B4JTextFlow";
RDebugUtils.currentLine=33030145;
 //BA.debugLineNum = 33030145;BA.debugLine="texts.Initialize";
__ref._texts /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=33030146;
 //BA.debugLineNum = 33030146;BA.debugLine="Return Me";
if (true) return (b4j.example.b4jtextflow)(this);
RDebugUtils.currentLine=33030147;
 //BA.debugLineNum = 33030147;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4jtextflow  _append(b4j.example.b4jtextflow __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "append", true))
	 {return ((b4j.example.b4jtextflow) Debug.delegate(ba, "append", new Object[] {_text}));}
RDebugUtils.currentLine=33095680;
 //BA.debugLineNum = 33095680;BA.debugLine="Public Sub Append(text As String) As B4JTextFlow";
RDebugUtils.currentLine=33095681;
 //BA.debugLineNum = 33095681;BA.debugLine="Dim lastItem As JavaObject";
_lastitem = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=33095682;
 //BA.debugLineNum = 33095682;BA.debugLine="lastItem.InitializeNewInstance(\"javafx.scene.text";
__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .InitializeNewInstance("javafx.scene.text.Text",new Object[]{(Object)(_text)});
RDebugUtils.currentLine=33095683;
 //BA.debugLineNum = 33095683;BA.debugLine="texts.Add(lastItem)";
__ref._texts /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .getObject()));
RDebugUtils.currentLine=33095684;
 //BA.debugLineNum = 33095684;BA.debugLine="Return Me";
if (true) return (b4j.example.b4jtextflow)(this);
RDebugUtils.currentLine=33095685;
 //BA.debugLineNum = 33095685;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4jtextflow  _setcolor(b4j.example.b4jtextflow __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "setcolor", true))
	 {return ((b4j.example.b4jtextflow) Debug.delegate(ba, "setcolor", new Object[] {_color}));}
RDebugUtils.currentLine=33226752;
 //BA.debugLineNum = 33226752;BA.debugLine="Public Sub SetColor(Color As Int) As B4JTextFlow";
RDebugUtils.currentLine=33226753;
 //BA.debugLineNum = 33226753;BA.debugLine="lastItem.RunMethod(\"setFill\", Array(fx.Colors.Fro";
__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setFill",new Object[]{(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(_color))});
RDebugUtils.currentLine=33226754;
 //BA.debugLineNum = 33226754;BA.debugLine="Return Me";
if (true) return (b4j.example.b4jtextflow)(this);
RDebugUtils.currentLine=33226755;
 //BA.debugLineNum = 33226755;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _createtextflow(b4j.example.b4jtextflow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "createtextflow", true))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "createtextflow", null));}
anywheresoftware.b4j.object.JavaObject _tf = null;
RDebugUtils.currentLine=33423360;
 //BA.debugLineNum = 33423360;BA.debugLine="Public Sub CreateTextFlow As Pane";
RDebugUtils.currentLine=33423361;
 //BA.debugLineNum = 33423361;BA.debugLine="Dim tf As JavaObject";
_tf = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=33423362;
 //BA.debugLineNum = 33423362;BA.debugLine="tf.InitializeNewInstance(\"javafx.scene.text.TextF";
_tf.InitializeNewInstance("javafx.scene.text.TextFlow",(Object[])(__c.Null));
RDebugUtils.currentLine=33423363;
 //BA.debugLineNum = 33423363;BA.debugLine="tf.RunMethod(\"setTextAlignment\", Array(\"CENTER\"))";
_tf.RunMethod("setTextAlignment",new Object[]{(Object)("CENTER")});
RDebugUtils.currentLine=33423364;
 //BA.debugLineNum = 33423364;BA.debugLine="tf.RunMethodJO(\"getChildren\", Null).RunMethod(\"ad";
_tf.RunMethodJO("getChildren",(Object[])(__c.Null)).RunMethod("addAll",new Object[]{(Object)(__ref._texts /*anywheresoftware.b4a.objects.collections.List*/ .getObject())});
RDebugUtils.currentLine=33423365;
 //BA.debugLineNum = 33423365;BA.debugLine="Return tf";
if (true) return (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_tf.getObject()));
RDebugUtils.currentLine=33423366;
 //BA.debugLineNum = 33423366;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4jtextflow  _setfont(b4j.example.b4jtextflow __ref,anywheresoftware.b4j.objects.JFX.FontWrapper _font) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "setfont", true))
	 {return ((b4j.example.b4jtextflow) Debug.delegate(ba, "setfont", new Object[] {_font}));}
RDebugUtils.currentLine=33161216;
 //BA.debugLineNum = 33161216;BA.debugLine="Public Sub SetFont(Font As Font) As B4JTextFlow";
RDebugUtils.currentLine=33161217;
 //BA.debugLineNum = 33161217;BA.debugLine="lastItem.RunMethod(\"setFont\", Array(Font))";
__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setFont",new Object[]{(Object)(_font.getObject())});
RDebugUtils.currentLine=33161218;
 //BA.debugLineNum = 33161218;BA.debugLine="Return Me";
if (true) return (b4j.example.b4jtextflow)(this);
RDebugUtils.currentLine=33161219;
 //BA.debugLineNum = 33161219;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.b4jtextflow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
RDebugUtils.currentLine=32899072;
 //BA.debugLineNum = 32899072;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=32899073;
 //BA.debugLineNum = 32899073;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=32899074;
 //BA.debugLineNum = 32899074;BA.debugLine="Private texts As List";
_texts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=32899075;
 //BA.debugLineNum = 32899075;BA.debugLine="Private lastItem As JavaObject";
_lastitem = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=32899076;
 //BA.debugLineNum = 32899076;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4jtextflow  _setstrikethrough(b4j.example.b4jtextflow __ref,boolean _strikethrough) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "setstrikethrough", true))
	 {return ((b4j.example.b4jtextflow) Debug.delegate(ba, "setstrikethrough", new Object[] {_strikethrough}));}
RDebugUtils.currentLine=33357824;
 //BA.debugLineNum = 33357824;BA.debugLine="Public Sub SetStrikethrough(Strikethrough As Boole";
RDebugUtils.currentLine=33357825;
 //BA.debugLineNum = 33357825;BA.debugLine="lastItem.RunMethod(\"setStrikethrough\", Array(Stri";
__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setStrikethrough",new Object[]{(Object)(_strikethrough)});
RDebugUtils.currentLine=33357826;
 //BA.debugLineNum = 33357826;BA.debugLine="Return Me";
if (true) return (b4j.example.b4jtextflow)(this);
RDebugUtils.currentLine=33357827;
 //BA.debugLineNum = 33357827;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4jtextflow  _setunderline(b4j.example.b4jtextflow __ref,boolean _underline) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "setunderline", true))
	 {return ((b4j.example.b4jtextflow) Debug.delegate(ba, "setunderline", new Object[] {_underline}));}
RDebugUtils.currentLine=33292288;
 //BA.debugLineNum = 33292288;BA.debugLine="Public Sub SetUnderline(Underline As Boolean) As B";
RDebugUtils.currentLine=33292289;
 //BA.debugLineNum = 33292289;BA.debugLine="lastItem.RunMethod(\"setUnderline\", Array(Underlin";
__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setUnderline",new Object[]{(Object)(_underline)});
RDebugUtils.currentLine=33292290;
 //BA.debugLineNum = 33292290;BA.debugLine="Return Me";
if (true) return (b4j.example.b4jtextflow)(this);
RDebugUtils.currentLine=33292291;
 //BA.debugLineNum = 33292291;BA.debugLine="End Sub";
return null;
}
}