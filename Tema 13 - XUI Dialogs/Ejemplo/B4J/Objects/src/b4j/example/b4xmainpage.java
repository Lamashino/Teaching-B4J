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
public b4j.example.scrollinglabel _scrlblodys = null;
public b4j.example.roundslider _roundslider1 = null;
public b4j.example.anotherprogressbar _anotherprogressbar1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public b4j.example.b4ximageview _b4ximageview1 = null;
public b4j.example.b4xdialog _dialog = null;
public b4j.example.b4xfloattextfield _txtaddress = null;
public b4j.example.b4xfloattextfield _txtname = null;
public b4j.example.b4xfloattextfield _txtsurname = null;
public b4j.example.b4xdatetemplate _datetemplate = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btndate = null;
public b4j.example.b4xcolortemplate _colortemplate = null;
public b4j.example.b4xlongtexttemplate _longtexttemplate = null;
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
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="B4XImageView1.Load(File.DirAssets, \"logo.png\")";
__ref._b4ximageview1 /*b4j.example.b4ximageview*/ ._load /*String*/ (null,__c.File.getDirAssets(),"logo.png");
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="B4XImageView1.mBackgroundColor = xui.Color_Transp";
__ref._b4ximageview1 /*b4j.example.b4ximageview*/ ._mbackgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent;
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="B4XImageView1.ResizeMode = \"FILL_NO_DISTORTIONS\"";
__ref._b4ximageview1 /*b4j.example.b4ximageview*/ ._setresizemode /*String*/ (null,"FILL_NO_DISTORTIONS");
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="B4XImageView1.RoundedImage = True";
__ref._b4ximageview1 /*b4j.example.b4ximageview*/ ._setroundedimage /*boolean*/ (null,__c.True);
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="dialog.Initialize (Root)";
__ref._dialog /*b4j.example.b4xdialog*/ ._initialize /*String*/ (null,ba,__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="End Sub";
return "";
}
public String  _b4xswitch1_valuechanged(b4j.example.b4xmainpage __ref,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xswitch1_valuechanged", false))
	 {return ((String) Debug.delegate(ba, "b4xswitch1_valuechanged", new Object[] {_value}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub B4XSwitch1_ValueChanged (Value As Bool";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="If Value Then";
if (_value) { 
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="Label1.Text = \"On\"";
__ref._label1 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("On");
 }else {
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="Label1.Text = \"Off\"";
__ref._label1 /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText("Off");
 };
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="End Sub";
return "";
}
public void  _btncolor_click(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btncolor_click", false))
	 {Debug.delegate(ba, "btncolor_click", null); return;}
ResumableSub_btnColor_Click rsub = new ResumableSub_btnColor_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnColor_Click extends BA.ResumableSub {
public ResumableSub_btnColor_Click(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
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
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="dialog.Title = \"Get Color\"";
__ref._dialog /*b4j.example.b4xdialog*/ ._title /*Object*/  = (Object)("Get Color");
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="ColorTemplate.Initialize";
__ref._colortemplate /*b4j.example.b4xcolortemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="Wait For (dialog.ShowTemplate(ColorTemplate, \"OK\"";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "btncolor_click"), __ref._dialog /*b4j.example.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._colortemplate /*b4j.example.b4xcolortemplate*/ ),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="Root.Color = ColorTemplate.SelectedColor";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._colortemplate /*b4j.example.b4xcolortemplate*/ ._getselectedcolor /*int*/ (null));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btndate_click(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btndate_click", false))
	 {Debug.delegate(ba, "btndate_click", null); return;}
ResumableSub_btnDate_Click rsub = new ResumableSub_btnDate_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnDate_Click extends BA.ResumableSub {
public ResumableSub_btnDate_Click(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
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
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="dialog.Title = \"Get Date\"";
__ref._dialog /*b4j.example.b4xdialog*/ ._title /*Object*/  = (Object)("Get Date");
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="DateTemplate.Initialize";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="DateTemplate.MinYear = 2010";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._minyear /*int*/  = (int) (2010);
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="DateTemplate.MaxYear = 2030";
__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._maxyear /*int*/  = (int) (2030);
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="Wait For (dialog.ShowTemplate(DateTemplate, \"\", \"";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "btndate_click"), __ref._dialog /*b4j.example.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="btnDate.Text = DateTime.Date(DateTemplate.Date)";
__ref._btndate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(parent.__c.DateTime.Date(__ref._datetemplate /*b4j.example.b4xdatetemplate*/ ._getdate /*long*/ (null)));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnreadpoem_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnreadpoem_click", false))
	 {return ((String) Debug.delegate(ba, "btnreadpoem_click", null));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub btnReadPoem_Click";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="LongTextTemplate.Initialize";
__ref._longtexttemplate /*b4j.example.b4xlongtexttemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="LongTextTemplate.Resize(500, 500)";
__ref._longtexttemplate /*b4j.example.b4xlongtexttemplate*/ ._resize /*String*/ (null,(int) (500),(int) (500));
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="LongTextTemplate.Text = $\" 	Tell Me, Muse, of tha";
__ref._longtexttemplate /*b4j.example.b4xlongtexttemplate*/ ._text /*Object*/  = (Object)(("\n"+"	Tell Me, Muse, of that man of many resources, \n"+"	who wandered far And wide, after sacking the holy \n"+"	citadel of Troy. Many the men whose cities he saw, \n"+"	whose ways he learned. Many the sorrows he suffered \n"+"	at sea, While trying To bring himself And his \n"+"	friends back alive. Yet despite his wishes he failed \n"+"	To save them, because of their own un-wisdom, \n"+"	foolishly eating the cattle of Helios, the Sun, \n"+"	so the god denied them their Return. Tell us of \n"+"	these things, beginning where you will, \n"+"	Goddess, Daughter of Zeus.\n"+"	\n"+"	So now all who escaped death in battle or by shipwreck \n"+"	had got safely home except Ulysses, and he, though \n"+"	he was longing to return to his wife and country, \n"+"	was detained by the goddess Calypso, who had got \n"+"	him into a large cave and wanted to marry him. \n"+"	But as years went by, there came a time when the\n"+"	gods settled that he should go back to Ithaca; \n"+"	even then, however, when he was among his own people, \n"+"	his troubles were not yet over; nevertheless all the \n"+"	gods had now begun to pity him except Neptune, who \n"+"	still persecuted him without ceasing and would \n"+"	not let him get home.\n"+"\n"+"	Now Neptune had gone off to the Ethiopians, who are \n"+"	at the world's end, and lie in two halves, the \n"+"	one looking West and the other East. He had gone \n"+"	there to accept a hecatomb of sheep and oxen, and \n"+"	was enjoying himself at his festival; but the other \n"+"	gods met in the house of Olympian Jove, and the \n"+"	sire of gods and men spoke first. At that moment he \n"+"	was thinking of Aegisthus, who had been killed by \n"+"	Agamemnon's son Orestes; so he said to the other gods:\n"+"\n"+"	\"See now, how men lay blame upon us gods for what is \n"+"	after all nothing but their own folly. Look at \n"+"	Aegisthus; he must needs make love to Agamemnon's \n"+"	wife unrighteously and then kill Agamemnon, though \n"+"	he knew it would be the death of him; for I sent \n"+"	Mercury to warn him not to do 	either of these \n"+"	things, inasmuch as Orestes would be \n"+"	sure to take his revenge when he grew up and wanted \n"+"	to return home. Mercury told him this in all good \n"+"	will but he would not listen, and now he has paid \n"+"	for everything in full.\" 	\n"+"	\n"+""));
RDebugUtils.currentLine=1179700;
 //BA.debugLineNum = 1179700;BA.debugLine="dialog.ShowTemplate(LongTextTemplate, \"OK\", \"\", \"";
__ref._dialog /*b4j.example.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._longtexttemplate /*b4j.example.b4xlongtexttemplate*/ ),(Object)("OK"),(Object)(""),(Object)(""));
RDebugUtils.currentLine=1179701;
 //BA.debugLineNum = 1179701;BA.debugLine="End Sub";
return "";
}
public String  _btnshowpoem_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnshowpoem_click", false))
	 {return ((String) Debug.delegate(ba, "btnshowpoem_click", null));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Private Sub btnShowPoem_Click";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="scrLblOdys.Text = \"Tell me, O Muse, of that many-";
__ref._scrlblodys /*b4j.example.scrollinglabel*/ ._settext /*String*/ (null,"Tell me, O Muse, of that many-sided hero who "+"traveled far and wide after he had sacked the "+"famous town of Troy. Many cities did he visit, "+"And many were the people with whose customs And "+"thinking he was acquainted; many things "+"he suffered at sea While seeking To save his "+"own life And To achieve the safe homecoming "+"of his companions; but Do what he might he could Not "+"save his men, For they perished through their own sheer "+"recklessness in eating the cattle of the Sun-god Helios; "+"so the god prevented them from ever reaching home. Tell "+" Me, As you have told those who came before Me, about "+"all these things, O daughter of Zeus, starting from "+"whatsoever point you choose.");
RDebugUtils.currentLine=655375;
 //BA.debugLineNum = 655375;BA.debugLine="End Sub";
return "";
}
public String  _button1_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {return ((String) Debug.delegate(ba, "button1_click", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub Button1_Click";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="xui.MsgboxAsync(\"The quick brown fox jumps over t";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"The quick brown fox jumps over the lazy dog","Simple message Box");
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="End Sub";
return "";
}
public void  _button2_click(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "button2_click", false))
	 {Debug.delegate(ba, "button2_click", null); return;}
ResumableSub_Button2_Click rsub = new ResumableSub_Button2_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Button2_Click extends BA.ResumableSub {
public ResumableSub_Button2_Click(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
Object _sf = null;
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
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"Delete file?";
_sf = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"Delete file?","Title","Yes","Cancel","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Wait For (sf) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "button2_click"), _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Log(\"Deleted!!!\")";
parent.__c.Log("Deleted!!!");
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _button3_click(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "button3_click", false))
	 {Debug.delegate(ba, "button3_click", null); return;}
ResumableSub_Button3_Click rsub = new ResumableSub_Button3_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Button3_Click extends BA.ResumableSub {
public ResumableSub_Button3_Click(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
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
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="dialog.Title = \"My Custom Dialog\"";
__ref._dialog /*b4j.example.b4xdialog*/ ._title /*Object*/  = (Object)("My Custom Dialog");
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 350dip, 250dip)";
_p.SetLayoutAnimated((int) (0),0,0,parent.__c.DipToCurrent((int) (350)),parent.__c.DipToCurrent((int) (250)));
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="p.LoadLayout(\"frmInsStudent\")";
_p.LoadLayout("frmInsStudent",ba);
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="dialog.PutAtTop = True 'put the dialog at the top";
__ref._dialog /*b4j.example.b4xdialog*/ ._putattop /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="Wait For (dialog.ShowCustom(p, \"OK\", \"\", \"CANCEL\"";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "button3_click"), __ref._dialog /*b4j.example.b4xdialog*/ ._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="Log(txtName.text & \" \" & txtSurname.text & \" \" &";
parent.__c.Log(__ref._txtname /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null)+" "+__ref._txtsurname /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null)+" "+__ref._txtaddress /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
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
 //BA.debugLineNum = 458755;BA.debugLine="Private scrLblOdys As ScrollingLabel";
_scrlblodys = new b4j.example.scrollinglabel();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Private RoundSlider1 As RoundSlider";
_roundslider1 = new b4j.example.roundslider();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Private AnotherProgressBar1 As AnotherProgressBar";
_anotherprogressbar1 = new b4j.example.anotherprogressbar();
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="Private B4XImageView1 As B4XImageView";
_b4ximageview1 = new b4j.example.b4ximageview();
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="Private dialog As B4XDialog";
_dialog = new b4j.example.b4xdialog();
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="Private txtAddress As B4XFloatTextField";
_txtaddress = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="Private txtName As B4XFloatTextField";
_txtname = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="Private txtSurname As B4XFloatTextField";
_txtsurname = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=458766;
 //BA.debugLineNum = 458766;BA.debugLine="Private DateTemplate As B4XDateTemplate";
_datetemplate = new b4j.example.b4xdatetemplate();
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="Private btnDate As B4XView";
_btndate = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=458769;
 //BA.debugLineNum = 458769;BA.debugLine="Private ColorTemplate As B4XColorTemplate";
_colortemplate = new b4j.example.b4xcolortemplate();
RDebugUtils.currentLine=458770;
 //BA.debugLineNum = 458770;BA.debugLine="Private LongTextTemplate As B4XLongTextTemplate";
_longtexttemplate = new b4j.example.b4xlongtexttemplate();
RDebugUtils.currentLine=458771;
 //BA.debugLineNum = 458771;BA.debugLine="End Sub";
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
public String  _roundslider1_valuechanged(b4j.example.b4xmainpage __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "roundslider1_valuechanged", false))
	 {return ((String) Debug.delegate(ba, "roundslider1_valuechanged", new Object[] {_value}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub RoundSlider1_ValueChanged (Value As In";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="AnotherProgressBar1.Value = Value";
__ref._anotherprogressbar1 /*b4j.example.anotherprogressbar*/ ._setvalue /*int*/ (null,_value);
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
}