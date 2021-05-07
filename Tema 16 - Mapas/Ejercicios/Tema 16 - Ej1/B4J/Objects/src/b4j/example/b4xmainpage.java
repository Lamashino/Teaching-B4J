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
public anywheresoftware.b4a.objects.collections.Map _países = null;
public anywheresoftware.b4a.objects.collections.Map _capitales = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblcountry = null;
public b4j.example.b4xfloattextfield _txtcapital = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_created(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
String _país = "";
String _capital = "";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Países.Initialize";
__ref._países /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Países.Put(\"Cuba\", \"La Habana\")";
__ref._países /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Cuba"),(Object)("La Habana"));
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="Países.Put(\"Chipre\", \"Nicosia\")";
__ref._países /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Chipre"),(Object)("Nicosia"));
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="Países.Put(\"Chequia\", \"Praga\")";
__ref._países /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Chequia"),(Object)("Praga"));
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="Países.Put(\"Egipto\", \"El Cairo\")";
__ref._países /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Egipto"),(Object)("El Cairo"));
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="Países.Put(\"Kenia\", \"Nairobi\")";
__ref._países /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Kenia"),(Object)("Nairobi"));
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="Países.Put(\"México\", \"Ciudad de México\")";
__ref._países /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("México"),(Object)("Ciudad de México"));
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="Países.Put(\"Perú\", \"Lima\")";
__ref._países /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Perú"),(Object)("Lima"));
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="Países.Put(\"Vietnam\", \"Hanoi\")";
__ref._países /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Vietnam"),(Object)("Hanoi"));
RDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="Países.Put(\"Portugal \", \"Lisboa\")";
__ref._países /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Portugal "),(Object)("Lisboa"));
RDebugUtils.currentLine=589841;
 //BA.debugLineNum = 589841;BA.debugLine="Países.Put(\"Japón\", \"Tokio\")";
__ref._países /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Japón"),(Object)("Tokio"));
RDebugUtils.currentLine=589842;
 //BA.debugLineNum = 589842;BA.debugLine="Países.Put(\"Barbados\", \"Bridgetown\")";
__ref._países /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Barbados"),(Object)("Bridgetown"));
RDebugUtils.currentLine=589843;
 //BA.debugLineNum = 589843;BA.debugLine="Países.Put(\"Fiji\", \"Suva\")";
__ref._países /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Fiji"),(Object)("Suva"));
RDebugUtils.currentLine=589847;
 //BA.debugLineNum = 589847;BA.debugLine="Log(\"Mostrar países y sus capitales\")";
__c.Log("Mostrar países y sus capitales");
RDebugUtils.currentLine=589848;
 //BA.debugLineNum = 589848;BA.debugLine="For Each país As String In Países.Keys";
{
final anywheresoftware.b4a.BA.IterableList group17 = __ref._países /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_país = BA.ObjectToString(group17.Get(index17));
RDebugUtils.currentLine=589849;
 //BA.debugLineNum = 589849;BA.debugLine="Log(país & \" \" & Países.Get(país))";
__c.Log(_país+" "+BA.ObjectToString(__ref._países /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_país))));
 }
};
RDebugUtils.currentLine=589854;
 //BA.debugLineNum = 589854;BA.debugLine="Capitales.Initialize";
__ref._capitales /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=589855;
 //BA.debugLineNum = 589855;BA.debugLine="For Each país As String In Países.Keys";
{
final anywheresoftware.b4a.BA.IterableList group21 = __ref._países /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen21 = group21.getSize()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_país = BA.ObjectToString(group21.Get(index21));
RDebugUtils.currentLine=589856;
 //BA.debugLineNum = 589856;BA.debugLine="Capitales.Put(Países.Get(país), país)";
__ref._capitales /*anywheresoftware.b4a.objects.collections.Map*/ .Put(__ref._países /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_país)),(Object)(_país));
 }
};
RDebugUtils.currentLine=589858;
 //BA.debugLineNum = 589858;BA.debugLine="Log(\"Mostrar capitales y sus países\")";
__c.Log("Mostrar capitales y sus países");
RDebugUtils.currentLine=589859;
 //BA.debugLineNum = 589859;BA.debugLine="For Each Capital As String In Capitales.Keys";
{
final anywheresoftware.b4a.BA.IterableList group25 = __ref._capitales /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen25 = group25.getSize()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_capital = BA.ObjectToString(group25.Get(index25));
RDebugUtils.currentLine=589860;
 //BA.debugLineNum = 589860;BA.debugLine="Log(Capital & \" \" & Capitales.Get(Capital))";
__c.Log(_capital+" "+BA.ObjectToString(__ref._capitales /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_capital))));
 }
};
RDebugUtils.currentLine=589863;
 //BA.debugLineNum = 589863;BA.debugLine="End Sub";
return "";
}
public String  _btnshow_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnshow_click", false))
	 {return ((String) Debug.delegate(ba, "btnshow_click", null));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Private Sub btnShow_Click";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="If Capitales.ContainsKey(txtCapital.Text) Then";
if (__ref._capitales /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(__ref._txtcapital /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null)))) { 
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="lblCountry.Text = Capitales.Get(txtCapital.Text)";
__ref._lblcountry /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.ObjectToString(__ref._capitales /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__ref._txtcapital /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null)))));
 }else {
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="lblCountry.Text = \"No conozco \" & txtCapital.tex";
__ref._lblcountry /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("No conozco "+__ref._txtcapital /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null));
 };
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 458755;BA.debugLine="Private Países As Map";
_países = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Private Capitales As Map";
_capitales = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Private lblCountry As Label";
_lblcountry = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Private txtCapital As B4XFloatTextField";
_txtcapital = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="End Sub";
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