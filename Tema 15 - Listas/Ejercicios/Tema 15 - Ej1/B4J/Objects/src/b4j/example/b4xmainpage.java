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
public anywheresoftware.b4j.objects.LabelWrapper _lblcapital = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtcountry = null;
public anywheresoftware.b4a.objects.collections.List _países = null;
public b4j.example.b4xfloattextfield _txtinscap = null;
public b4j.example.b4xfloattextfield _txtinscountry = null;
public b4j.example.b4xdialog _dialog = null;
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
int _i = 0;
String[] _cntr = null;
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="dialog.Initialize(Root)";
__ref._dialog /*b4j.example.b4xdialog*/ ._initialize /*String*/ (null,ba,__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Países.Initialize";
__ref._países /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="Países.Add(Array As String(\"Cuba\", \"La Habana\"))";
__ref._países /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new String[]{"Cuba","La Habana"}));
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="Países.Add(Array As String(\"Chipre\", \"Nicosia\"))";
__ref._países /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new String[]{"Chipre","Nicosia"}));
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="Países.Add(Array As String(\"Chequia\", \"Praga\"))";
__ref._países /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new String[]{"Chequia","Praga"}));
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="Países.Add(Array As String(\"Egipto\", \"El Cairo\"))";
__ref._países /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new String[]{"Egipto","El Cairo"}));
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="Países.Add(Array As String(\"Kenia\", \"Nairobi\"))";
__ref._países /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new String[]{"Kenia","Nairobi"}));
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="Países.Add(Array As String(\"México\", \"Ciudad de M";
__ref._países /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new String[]{"México","Ciudad de México"}));
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="Países.Add(Array As String(\"Perú\", \"Lima\"))";
__ref._países /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new String[]{"Perú","Lima"}));
RDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="Países.Add(Array As String(\"Vietnam\", \"Hanoi\"))";
__ref._países /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new String[]{"Vietnam","Hanoi"}));
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="Países.Add(Array As String(\"Portugal\", \"Lisboa\"))";
__ref._países /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new String[]{"Portugal","Lisboa"}));
RDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="showList(Países)";
__ref._showlist /*String*/ (null,__ref._países /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=589843;
 //BA.debugLineNum = 589843;BA.debugLine="For i = 0 To Países.Size - 1";
{
final int step15 = 1;
final int limit15 = (int) (__ref._países /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=589844;
 //BA.debugLineNum = 589844;BA.debugLine="Private cntr() As String";
_cntr = new String[(int) (0)];
java.util.Arrays.fill(_cntr,"");
RDebugUtils.currentLine=589845;
 //BA.debugLineNum = 589845;BA.debugLine="cntr = Países.Get(i)";
_cntr = (String[])(__ref._países /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=589846;
 //BA.debugLineNum = 589846;BA.debugLine="If cntr(0).StartsWith(\"P\") Then";
if (_cntr[(int) (0)].startsWith("P")) { 
RDebugUtils.currentLine=589847;
 //BA.debugLineNum = 589847;BA.debugLine="Log	(cntr(0) & \" \" & cntr(1))";
__c.Log(_cntr[(int) (0)]+" "+_cntr[(int) (1)]);
 };
 }
};
RDebugUtils.currentLine=589850;
 //BA.debugLineNum = 589850;BA.debugLine="End Sub";
return "";
}
public String  _showlist(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.collections.List _a) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "showlist", false))
	 {return ((String) Debug.delegate(ba, "showlist", new Object[] {_a}));}
int _i = 0;
String[] _cntr = null;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Private Sub showList(A As List)";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="For i = 0 To A.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_a.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="Private cntr() As String";
_cntr = new String[(int) (0)];
java.util.Arrays.fill(_cntr,"");
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="cntr = A.Get(i)";
_cntr = (String[])(_a.Get(_i));
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="Log(cntr(0) & \" \" & cntr(1))";
__c.Log(_cntr[(int) (0)]+" "+_cntr[(int) (1)]);
 }
};
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="End Sub";
return "";
}
public void  _btnnewcountry_click(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnnewcountry_click", false))
	 {Debug.delegate(ba, "btnnewcountry_click", null); return;}
ResumableSub_btnNewCountry_Click rsub = new ResumableSub_btnNewCountry_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnNewCountry_Click extends BA.ResumableSub {
public ResumableSub_btnNewCountry_Click(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="dialog.Title = \"Insertar País\"";
__ref._dialog /*b4j.example.b4xdialog*/ ._title /*Object*/  = (Object)("Insertar País");
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 300dip, 200dip)";
_p.SetLayoutAnimated((int) (0),0,0,parent.__c.DipToCurrent((int) (300)),parent.__c.DipToCurrent((int) (200)));
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="p.LoadLayout(\"frmNewCountry\")";
_p.LoadLayout("frmNewCountry",ba);
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="dialog.PutAtTop = True 'Poner el diálogo en prime";
__ref._dialog /*b4j.example.b4xdialog*/ ._putattop /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="Wait For (dialog.ShowCustom(p, \"Vale\", \"\", \"Cance";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "btnnewcountry_click"), __ref._dialog /*b4j.example.b4xdialog*/ ._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("Vale"),(Object)(""),(Object)("Cancelar")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=786442;
 //BA.debugLineNum = 786442;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="Log(txtInsCountry.text & \" \" & txtInsCap.text)";
parent.__c.Log(__ref._txtinscountry /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null)+" "+__ref._txtinscap /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null));
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="Países.Add(Array As String(txtInsCountry.Text, t";
__ref._países /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new String[]{__ref._txtinscountry /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null),__ref._txtinscap /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null)}));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=786446;
 //BA.debugLineNum = 786446;BA.debugLine="showList(Países)";
__ref._showlist /*String*/ (null,__ref._países /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=786447;
 //BA.debugLineNum = 786447;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _button1_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {return ((String) Debug.delegate(ba, "button1_click", null));}
int _i = 0;
String[] _cntr = null;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub Button1_Click";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="For i = 0 To Países.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._países /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Private cntr() As String";
_cntr = new String[(int) (0)];
java.util.Arrays.fill(_cntr,"");
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="cntr = Países.Get(i)";
_cntr = (String[])(__ref._países /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="If cntr(0).CompareTo(txtCountry.Text) = 0 Then";
if (_cntr[(int) (0)].compareTo(__ref._txtcountry /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())==0) { 
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="lblCapital.Text = cntr(1)";
__ref._lblcapital /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_cntr[(int) (1)]);
 };
 }
};
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 458755;BA.debugLine="Private lblCapital As Label";
_lblcapital = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Private txtCountry As TextField";
_txtcountry = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Private Países As List";
_países = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="Private txtInsCap As B4XFloatTextField";
_txtinscap = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="Private txtInsCountry As B4XFloatTextField";
_txtinscountry = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="Private dialog As B4XDialog";
_dialog = new b4j.example.b4xdialog();
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="End Sub";
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