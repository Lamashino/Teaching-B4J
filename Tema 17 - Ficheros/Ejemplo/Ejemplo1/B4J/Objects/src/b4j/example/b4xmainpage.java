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
public String _nf = "";
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _b4xpage_created(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
String _strcarpeta = "";
String _msj = "";
String _strcontenidofichero = "";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Log(File.DirApp)";
__c.Log(__c.File.getDirApp());
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Log(File.DirAssets)";
__c.Log(__c.File.getDirAssets());
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="Log(File.DirTemp)";
__c.Log(__c.File.getDirTemp());
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="Log(File.DirData(\"Ejemplo1\"))";
__c.Log(__c.File.DirData("Ejemplo1"));
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="Private strCarpeta As String = File.DirTemp & \"te";
_strcarpeta = __c.File.getDirTemp()+"tema17\\";
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="Log(strCarpeta)";
__c.Log(_strcarpeta);
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="File.MakeDir(File.DirTemp, \"tema17\")";
__c.File.MakeDir(__c.File.getDirTemp(),"tema17");
RDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="If File.Exists(strCarpeta, nf) Then";
if (__c.File.Exists(_strcarpeta,__ref._nf /*String*/ )) { 
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="Log(\"El fichero \" & nf & \" ya existe\")";
__c.Log("El fichero "+__ref._nf /*String*/ +" ya existe");
 }else {
RDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="Log(\"No existe el fichero \" & nf)";
__c.Log("No existe el fichero "+__ref._nf /*String*/ );
 };
RDebugUtils.currentLine=589843;
 //BA.debugLineNum = 589843;BA.debugLine="File.OpenOutput(strCarpeta, nf, True)";
__c.File.OpenOutput(_strcarpeta,__ref._nf /*String*/ ,__c.True);
RDebugUtils.currentLine=589845;
 //BA.debugLineNum = 589845;BA.debugLine="Private msj As String = \"Hola Mundo 2\"";
_msj = "Hola Mundo 2";
RDebugUtils.currentLine=589846;
 //BA.debugLineNum = 589846;BA.debugLine="File.WriteString(strCarpeta, nf, msj)";
__c.File.WriteString(_strcarpeta,__ref._nf /*String*/ ,_msj);
RDebugUtils.currentLine=589848;
 //BA.debugLineNum = 589848;BA.debugLine="Private msj As String = $\" 	If you can keep your";
_msj = ("\n"+"	If you can keep your head when all about you   \n"+"    Are losing theirs and blaming it on you,   \n"+"	If you can trust yourself when all men doubt you,\n"+"    But make allowance for their doubting too;   \n"+"	If you can wait and not be tired by waiting,\n"+"    Or being lied about, don’t deal in lies,\n"+"	Or being hated, don’t give way to hating,\n"+"    And yet don’t look too good, nor talk too wise:\n"+"\n"+"	If you can dream—and not make dreams your master;   \n"+"    If you can think—and not make thoughts your aim;   \n"+"	If you can meet with Triumph and Disaster\n"+"    And treat those two impostors just the same;   \n"+"	If you can bear to hear the truth you’ve spoken\n"+"    Twisted by knaves to make a trap for fools,\n"+"	Or watch the things you gave your life to, broken,\n"+"    And stoop and build ’em up with worn-out tools:\n"+"\n"+"	If you can make one heap of all your winnings\n"+"    And risk it on one turn of pitch-and-toss,\n"+"	And lose, and start again at your beginnings\n"+"    And never breathe a word about your loss;\n"+"	If you can force your heart and nerve and sinew\n"+"    To serve your turn long after they are gone,   \n"+"	And so hold on when there is nothing in you\n"+"    Except the Will which says to them: ‘Hold on!’\n"+"\n"+"	If you can talk with crowds and keep your virtue,   \n"+"    Or walk with Kings—nor lose the common touch,\n"+"	If neither foes nor loving friends can hurt you,\n"+"    If all men count with you, but none too much;\n"+"	If you can fill the unforgiving minute\n"+"    With sixty seconds’ worth of distance run,   \n"+"	Yours is the Earth and everything that’s in it,   \n"+"    And—which is more—you’ll be a Man, my son!\n"+"	\n"+"	");
RDebugUtils.currentLine=589886;
 //BA.debugLineNum = 589886;BA.debugLine="File.WriteString(strCarpeta, nf, msj)";
__c.File.WriteString(_strcarpeta,__ref._nf /*String*/ ,_msj);
RDebugUtils.currentLine=589890;
 //BA.debugLineNum = 589890;BA.debugLine="Private strContenidoFichero As String";
_strcontenidofichero = "";
RDebugUtils.currentLine=589891;
 //BA.debugLineNum = 589891;BA.debugLine="strContenidoFichero = File.ReadString(strCarpeta,";
_strcontenidofichero = __c.File.ReadString(_strcarpeta,__ref._nf /*String*/ );
RDebugUtils.currentLine=589892;
 //BA.debugLineNum = 589892;BA.debugLine="Log(\"El fichero contiene\")";
__c.Log("El fichero contiene");
RDebugUtils.currentLine=589893;
 //BA.debugLineNum = 589893;BA.debugLine="Log(strContenidoFichero)";
__c.Log(_strcontenidofichero);
RDebugUtils.currentLine=589899;
 //BA.debugLineNum = 589899;BA.debugLine="End Sub";
return "";
}
public String  _button1_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {return ((String) Debug.delegate(ba, "button1_click", null));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Private Sub Button1_Click";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="xui.MsgboxAsync(\"¡Hola Mundo!\", \"B4X\")";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"¡Hola Mundo!","B4X");
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 458755;BA.debugLine="Private nf As String = \"lesson17_data.txt\"";
_nf = "lesson17_data.txt";
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="End Sub";
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