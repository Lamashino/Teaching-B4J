package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 34;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Root = Root1";
Debug.ShouldStop(4);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 36;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(8);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 37;BA.debugLine="B4XImageView1.Load(File.DirAssets, \"logo.png\")";
Debug.ShouldStop(16);
__ref.getField(false,"_b4ximageview1" /*RemoteObject*/ ).runClassMethod (b4j.example.b4ximageview.class, "_load" /*RemoteObject*/ ,(Object)(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("logo.png")));
 BA.debugLineNum = 38;BA.debugLine="B4XImageView1.mBackgroundColor = xui.Color_Transp";
Debug.ShouldStop(32);
__ref.getField(false,"_b4ximageview1" /*RemoteObject*/ ).setField ("_mbackgroundcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 39;BA.debugLine="B4XImageView1.ResizeMode = \"FILL_NO_DISTORTIONS\"";
Debug.ShouldStop(64);
__ref.getField(false,"_b4ximageview1" /*RemoteObject*/ ).runClassMethod (b4j.example.b4ximageview.class, "_setresizemode" /*RemoteObject*/ ,BA.ObjectToString("FILL_NO_DISTORTIONS"));
 BA.debugLineNum = 40;BA.debugLine="B4XImageView1.RoundedImage = True";
Debug.ShouldStop(128);
__ref.getField(false,"_b4ximageview1" /*RemoteObject*/ ).runClassMethod (b4j.example.b4ximageview.class, "_setroundedimage" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 41;BA.debugLine="dialog.Initialize (Root)";
Debug.ShouldStop(256);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ )));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xswitch1_valuechanged(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("B4XSwitch1_ValueChanged (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("b4xswitch1_valuechanged")) { return __ref.runUserSub(false, "b4xmainpage","b4xswitch1_valuechanged", __ref, _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 71;BA.debugLine="Private Sub B4XSwitch1_ValueChanged (Value As Bool";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="If Value Then";
Debug.ShouldStop(128);
if (_value.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 73;BA.debugLine="Label1.Text = \"On\"";
Debug.ShouldStop(256);
__ref.getField(false,"_label1" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("On"));
 }else {
 BA.debugLineNum = 75;BA.debugLine="Label1.Text = \"Off\"";
Debug.ShouldStop(1024);
__ref.getField(false,"_label1" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("Off"));
 };
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btncolor_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnColor_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,124);
if (RapidSub.canDelegate("btncolor_click")) { __ref.runUserSub(false, "b4xmainpage","btncolor_click", __ref); return;}
ResumableSub_btnColor_Click rsub = new ResumableSub_btnColor_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnColor_Click extends BA.ResumableSub {
public ResumableSub_btnColor_Click(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnColor_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,124);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 125;BA.debugLine="dialog.Title = \"Get Color\"";
Debug.ShouldStop(268435456);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Get Color")));
 BA.debugLineNum = 126;BA.debugLine="ColorTemplate.Initialize";
Debug.ShouldStop(536870912);
__ref.getField(false,"_colortemplate" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xcolortemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 127;BA.debugLine="Wait For (dialog.ShowTemplate(ColorTemplate, \"OK\"";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "btncolor_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_colortemplate" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 128;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 129;BA.debugLine="Root.Color = ColorTemplate.SelectedColor";
Debug.ShouldStop(1);
__ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(false,"_colortemplate" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xcolortemplate.class, "_getselectedcolor" /*RemoteObject*/ ));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static void  _btndate_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnDate_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("btndate_click")) { __ref.runUserSub(false, "b4xmainpage","btndate_click", __ref); return;}
ResumableSub_btnDate_Click rsub = new ResumableSub_btnDate_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnDate_Click extends BA.ResumableSub {
public ResumableSub_btnDate_Click(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnDate_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,111);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 112;BA.debugLine="dialog.Title = \"Get Date\"";
Debug.ShouldStop(32768);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Get Date")));
 BA.debugLineNum = 113;BA.debugLine="DateTemplate.Initialize";
Debug.ShouldStop(65536);
__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdatetemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 114;BA.debugLine="DateTemplate.MinYear = 2010";
Debug.ShouldStop(131072);
__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).setField ("_minyear" /*RemoteObject*/ ,BA.numberCast(int.class, 2010));
 BA.debugLineNum = 115;BA.debugLine="DateTemplate.MaxYear = 2030";
Debug.ShouldStop(262144);
__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).setField ("_maxyear" /*RemoteObject*/ ,BA.numberCast(int.class, 2030));
 BA.debugLineNum = 117;BA.debugLine="Wait For (dialog.ShowTemplate(DateTemplate, \"\", \"";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "btndate_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_datetemplate" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 118;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 119;BA.debugLine="btnDate.Text = DateTime.Date(DateTemplate.Date)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_btndate" /*RemoteObject*/ ).runMethod(true,"setText",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ ))));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _btnreadpoem_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnReadPoem_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("btnreadpoem_click")) { return __ref.runUserSub(false, "b4xmainpage","btnreadpoem_click", __ref);}
 BA.debugLineNum = 134;BA.debugLine="Private Sub btnReadPoem_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="LongTextTemplate.Initialize";
Debug.ShouldStop(64);
__ref.getField(false,"_longtexttemplate" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xlongtexttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 136;BA.debugLine="LongTextTemplate.Resize(500, 500)";
Debug.ShouldStop(128);
__ref.getField(false,"_longtexttemplate" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xlongtexttemplate.class, "_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(int.class, 500)));
 BA.debugLineNum = 137;BA.debugLine="LongTextTemplate.Text = $\" 	Tell Me, Muse, of tha";
Debug.ShouldStop(256);
__ref.getField(false,"_longtexttemplate" /*RemoteObject*/ ).setField ("_text" /*RemoteObject*/ ,((RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	Tell Me, Muse, of that man of many resources, \n"),RemoteObject.createImmutable("	who wandered far And wide, after sacking the holy \n"),RemoteObject.createImmutable("	citadel of Troy. Many the men whose cities he saw, \n"),RemoteObject.createImmutable("	whose ways he learned. Many the sorrows he suffered \n"),RemoteObject.createImmutable("	at sea, While trying To bring himself And his \n"),RemoteObject.createImmutable("	friends back alive. Yet despite his wishes he failed \n"),RemoteObject.createImmutable("	To save them, because of their own un-wisdom, \n"),RemoteObject.createImmutable("	foolishly eating the cattle of Helios, the Sun, \n"),RemoteObject.createImmutable("	so the god denied them their Return. Tell us of \n"),RemoteObject.createImmutable("	these things, beginning where you will, \n"),RemoteObject.createImmutable("	Goddess, Daughter of Zeus.\n"),RemoteObject.createImmutable("	\n"),RemoteObject.createImmutable("	So now all who escaped death in battle or by shipwreck \n"),RemoteObject.createImmutable("	had got safely home except Ulysses, and he, though \n"),RemoteObject.createImmutable("	he was longing to return to his wife and country, \n"),RemoteObject.createImmutable("	was detained by the goddess Calypso, who had got \n"),RemoteObject.createImmutable("	him into a large cave and wanted to marry him. \n"),RemoteObject.createImmutable("	But as years went by, there came a time when the\n"),RemoteObject.createImmutable("	gods settled that he should go back to Ithaca; \n"),RemoteObject.createImmutable("	even then, however, when he was among his own people, \n"),RemoteObject.createImmutable("	his troubles were not yet over; nevertheless all the \n"),RemoteObject.createImmutable("	gods had now begun to pity him except Neptune, who \n"),RemoteObject.createImmutable("	still persecuted him without ceasing and would \n"),RemoteObject.createImmutable("	not let him get home.\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	Now Neptune had gone off to the Ethiopians, who are \n"),RemoteObject.createImmutable("	at the world's end, and lie in two halves, the \n"),RemoteObject.createImmutable("	one looking West and the other East. He had gone \n"),RemoteObject.createImmutable("	there to accept a hecatomb of sheep and oxen, and \n"),RemoteObject.createImmutable("	was enjoying himself at his festival; but the other \n"),RemoteObject.createImmutable("	gods met in the house of Olympian Jove, and the \n"),RemoteObject.createImmutable("	sire of gods and men spoke first. At that moment he \n"),RemoteObject.createImmutable("	was thinking of Aegisthus, who had been killed by \n"),RemoteObject.createImmutable("	Agamemnon's son Orestes; so he said to the other gods:\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	\"See now, how men lay blame upon us gods for what is \n"),RemoteObject.createImmutable("	after all nothing but their own folly. Look at \n"),RemoteObject.createImmutable("	Aegisthus; he must needs make love to Agamemnon's \n"),RemoteObject.createImmutable("	wife unrighteously and then kill Agamemnon, though \n"),RemoteObject.createImmutable("	he knew it would be the death of him; for I sent \n"),RemoteObject.createImmutable("	Mercury to warn him not to do 	either of these \n"),RemoteObject.createImmutable("	things, inasmuch as Orestes would be \n"),RemoteObject.createImmutable("	sure to take his revenge when he grew up and wanted \n"),RemoteObject.createImmutable("	to return home. Mercury told him this in all good \n"),RemoteObject.createImmutable("	will but he would not listen, and now he has paid \n"),RemoteObject.createImmutable("	for everything in full.\" 	\n"),RemoteObject.createImmutable("	\n"),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 186;BA.debugLine="dialog.ShowTemplate(LongTextTemplate, \"OK\", \"\", \"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_longtexttemplate" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnshowpoem_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnShowPoem_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("btnshowpoem_click")) { return __ref.runUserSub(false, "b4xmainpage","btnshowpoem_click", __ref);}
 BA.debugLineNum = 47;BA.debugLine="Private Sub btnShowPoem_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="scrLblOdys.Text = \"Tell me, O Muse, of that many-";
Debug.ShouldStop(32768);
__ref.getField(false,"_scrlblodys" /*RemoteObject*/ ).runClassMethod (b4j.example.scrollinglabel.class, "_settext" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Tell me, O Muse, of that many-sided hero who "),RemoteObject.createImmutable("traveled far and wide after he had sacked the "),RemoteObject.createImmutable("famous town of Troy. Many cities did he visit, "),RemoteObject.createImmutable("And many were the people with whose customs And "),RemoteObject.createImmutable("thinking he was acquainted; many things "),RemoteObject.createImmutable("he suffered at sea While seeking To save his "),RemoteObject.createImmutable("own life And To achieve the safe homecoming "),RemoteObject.createImmutable("of his companions; but Do what he might he could Not "),RemoteObject.createImmutable("save his men, For they perished through their own sheer "),RemoteObject.createImmutable("recklessness in eating the cattle of the Sun-god Helios; "),RemoteObject.createImmutable("so the god prevented them from ever reaching home. Tell "),RemoteObject.createImmutable(" Me, As you have told those who came before Me, about "),RemoteObject.createImmutable("all these things, O daughter of Zeus, starting from "),RemoteObject.createImmutable("whatsoever point you choose.")));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "b4xmainpage","button1_click", __ref);}
 BA.debugLineNum = 80;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="xui.MsgboxAsync(\"The quick brown fox jumps over t";
Debug.ShouldStop(65536);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("The quick brown fox jumps over the lazy dog")),(Object)(RemoteObject.createImmutable("Simple message Box")));
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _button2_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("button2_click")) { __ref.runUserSub(false, "b4xmainpage","button2_click", __ref); return;}
ResumableSub_Button2_Click rsub = new ResumableSub_Button2_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Button2_Click extends BA.ResumableSub {
public ResumableSub_Button2_Click(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,85);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 86;BA.debugLine="Dim sf As Object = xui.Msgbox2Async(\"Delete file?";
Debug.ShouldStop(2097152);
_sf = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Delete file?")),(Object)(BA.ObjectToString("Title")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 87;BA.debugLine="Wait For (sf) Msgbox_Result (Result As Int)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "button2_click"), _sf);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 88;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 89;BA.debugLine="Log(\"Deleted!!!\")";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Deleted!!!")));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _msgbox_result(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static void  _button3_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button3_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("button3_click")) { __ref.runUserSub(false, "b4xmainpage","button3_click", __ref); return;}
ResumableSub_Button3_Click rsub = new ResumableSub_Button3_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Button3_Click extends BA.ResumableSub {
public ResumableSub_Button3_Click(b4j.example.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.b4xmainpage parent;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Button3_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,94);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 96;BA.debugLine="dialog.Title = \"My Custom Dialog\"";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("My Custom Dialog")));
 BA.debugLineNum = 98;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(2);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 99;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 350dip, 250dip)";
Debug.ShouldStop(4);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 350))))),(Object)(BA.numberCast(double.class, parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 250))))));
 BA.debugLineNum = 101;BA.debugLine="p.LoadLayout(\"frmInsStudent\")";
Debug.ShouldStop(16);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("frmInsStudent")),__ref.getField(false, "ba"));
 BA.debugLineNum = 102;BA.debugLine="dialog.PutAtTop = True 'put the dialog at the top";
Debug.ShouldStop(32);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_putattop" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 104;BA.debugLine="Wait For (dialog.ShowCustom(p, \"OK\", \"\", \"CANCEL\"";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "button3_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xdialog.class, "_showcustom" /*RemoteObject*/ ,(Object)(_p),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 105;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 106;BA.debugLine="Log(txtName.text & \" \" & txtSurname.text & \" \" &";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(__ref.getField(false,"_txtname" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ),RemoteObject.createImmutable(" "),__ref.getField(false,"_txtsurname" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ),RemoteObject.createImmutable(" "),__ref.getField(false,"_txtaddress" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xfloattextfield.class, "_gettext" /*RemoteObject*/ ))));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Private scrLblOdys As ScrollingLabel";
b4xmainpage._scrlblodys = RemoteObject.createNew ("b4j.example.scrollinglabel");__ref.setField("_scrlblodys",b4xmainpage._scrlblodys);
 //BA.debugLineNum = 12;BA.debugLine="Private RoundSlider1 As RoundSlider";
b4xmainpage._roundslider1 = RemoteObject.createNew ("b4j.example.roundslider");__ref.setField("_roundslider1",b4xmainpage._roundslider1);
 //BA.debugLineNum = 13;BA.debugLine="Private AnotherProgressBar1 As AnotherProgressBar";
b4xmainpage._anotherprogressbar1 = RemoteObject.createNew ("b4j.example.anotherprogressbar");__ref.setField("_anotherprogressbar1",b4xmainpage._anotherprogressbar1);
 //BA.debugLineNum = 14;BA.debugLine="Private Label1 As Label";
b4xmainpage._label1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_label1",b4xmainpage._label1);
 //BA.debugLineNum = 15;BA.debugLine="Private B4XImageView1 As B4XImageView";
b4xmainpage._b4ximageview1 = RemoteObject.createNew ("b4j.example.b4ximageview");__ref.setField("_b4ximageview1",b4xmainpage._b4ximageview1);
 //BA.debugLineNum = 17;BA.debugLine="Private dialog As B4XDialog";
b4xmainpage._dialog = RemoteObject.createNew ("b4j.example.b4xdialog");__ref.setField("_dialog",b4xmainpage._dialog);
 //BA.debugLineNum = 18;BA.debugLine="Private txtAddress As B4XFloatTextField";
b4xmainpage._txtaddress = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_txtaddress",b4xmainpage._txtaddress);
 //BA.debugLineNum = 19;BA.debugLine="Private txtName As B4XFloatTextField";
b4xmainpage._txtname = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_txtname",b4xmainpage._txtname);
 //BA.debugLineNum = 20;BA.debugLine="Private txtSurname As B4XFloatTextField";
b4xmainpage._txtsurname = RemoteObject.createNew ("b4j.example.b4xfloattextfield");__ref.setField("_txtsurname",b4xmainpage._txtsurname);
 //BA.debugLineNum = 22;BA.debugLine="Private DateTemplate As B4XDateTemplate";
b4xmainpage._datetemplate = RemoteObject.createNew ("b4j.example.b4xdatetemplate");__ref.setField("_datetemplate",b4xmainpage._datetemplate);
 //BA.debugLineNum = 23;BA.debugLine="Private btnDate As B4XView";
b4xmainpage._btndate = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btndate",b4xmainpage._btndate);
 //BA.debugLineNum = 25;BA.debugLine="Private ColorTemplate As B4XColorTemplate";
b4xmainpage._colortemplate = RemoteObject.createNew ("b4j.example.b4xcolortemplate");__ref.setField("_colortemplate",b4xmainpage._colortemplate);
 //BA.debugLineNum = 26;BA.debugLine="Private LongTextTemplate As B4XLongTextTemplate";
b4xmainpage._longtexttemplate = RemoteObject.createNew ("b4j.example.b4xlongtexttemplate");__ref.setField("_longtexttemplate",b4xmainpage._longtexttemplate);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 29;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _roundslider1_valuechanged(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("RoundSlider1_ValueChanged (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("roundslider1_valuechanged")) { return __ref.runUserSub(false, "b4xmainpage","roundslider1_valuechanged", __ref, _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 66;BA.debugLine="Private Sub RoundSlider1_ValueChanged (Value As In";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="AnotherProgressBar1.Value = Value";
Debug.ShouldStop(4);
__ref.getField(false,"_anotherprogressbar1" /*RemoteObject*/ ).runClassMethod (b4j.example.anotherprogressbar.class, "_setvalue" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}