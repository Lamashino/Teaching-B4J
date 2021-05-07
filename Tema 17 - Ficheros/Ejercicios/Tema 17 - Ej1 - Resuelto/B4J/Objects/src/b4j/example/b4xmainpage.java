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
public anywheresoftware.b4a.objects.collections.List _lstequipos = null;
public anywheresoftware.b4a.objects.collections.Map _mequipos = null;
public String _nf = "";
public String _strcarpeta = "";
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _b4xpage_created(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
int _i = 0;
String[] _arr = null;
String _strequipos = "";
String _clave = "";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="strCarpeta =  File.DirTemp  & \"tema17\\\"";
__ref._strcarpeta /*String*/  = __c.File.getDirTemp()+"tema17\\";
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Log(strCarpeta)";
__c.Log(__ref._strcarpeta /*String*/ );
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="lstEquipos.Initialize";
__ref._lstequipos /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="cargarEquipos";
__ref._cargarequipos /*String*/ (null);
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="mEquipos.Initialize";
__ref._mequipos /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="For i = 0 To lstEquipos.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (__ref._lstequipos /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="Private arr() As String";
_arr = new String[(int) (0)];
java.util.Arrays.fill(_arr,"");
RDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="arr = lstEquipos.Get(i)";
_arr = (String[])(__ref._lstequipos /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="mEquipos.Put(arr(0), arr(1))";
__ref._mequipos /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_arr[(int) (0)]),(Object)(_arr[(int) (1)]));
 }
};
RDebugUtils.currentLine=589841;
 //BA.debugLineNum = 589841;BA.debugLine="File.WriteMap(strCarpeta, nf, mEquipos)";
__c.File.WriteMap(__ref._strcarpeta /*String*/ ,__ref._nf /*String*/ ,__ref._mequipos /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=589844;
 //BA.debugLineNum = 589844;BA.debugLine="Private strEquipos As String";
_strequipos = "";
RDebugUtils.currentLine=589845;
 //BA.debugLineNum = 589845;BA.debugLine="For Each clave  As  String In  mEquipos.Keys";
{
final anywheresoftware.b4a.BA.IterableList group15 = __ref._mequipos /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen15 = group15.getSize()
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_clave = BA.ObjectToString(group15.Get(index15));
RDebugUtils.currentLine=589846;
 //BA.debugLineNum = 589846;BA.debugLine="strEquipos = strEquipos & clave  & \" \" & mEquipo";
_strequipos = _strequipos+_clave+" "+BA.ObjectToString(__ref._mequipos /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_clave)))+__c.CRLF;
 }
};
RDebugUtils.currentLine=589850;
 //BA.debugLineNum = 589850;BA.debugLine="File.WriteString(strCarpeta, \"equipos2.txt\", strE";
__c.File.WriteString(__ref._strcarpeta /*String*/ ,"equipos2.txt",_strequipos);
RDebugUtils.currentLine=589851;
 //BA.debugLineNum = 589851;BA.debugLine="Log(strEquipos)";
__c.Log(_strequipos);
RDebugUtils.currentLine=589853;
 //BA.debugLineNum = 589853;BA.debugLine="End Sub";
return "";
}
public String  _cargarequipos(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "cargarequipos", false))
	 {return ((String) Debug.delegate(ba, "cargarequipos", null));}
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Private Sub cargarEquipos";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="lstEquipos.Add(Array As String (\"Arsenal\", \"Led b";
__ref._lstequipos /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new String[]{"Arsenal","Led by Alfredo Di Stéfano and Ferenc Puskas, the Real Madrid team of the late '50s dominated world football. They won the European Cup (Champions League) five times in a row from 1956 to 1960. This culminated in the 1960 final when they beat Eintracht Frankfurt 7-3 in one of the greatest footballing displays of all time (see the video below)."}));
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="lstEquipos.Add(Array As String (\"Milan\", \"The tre";
__ref._lstequipos /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new String[]{"Milan","The treble-winning Manchester United team of 1998–99 won the Premier League, FA Cup, and Champions League in a single season. It included greats such as Paul Scholes, David Beckham, Ryan Giggs, Roy Keane, and Peter Schmeichal. Like many of Alex Ferguson's teams, they fought until the last whistle, and this was demonstrated in no greater way than the 1999 Champions League final. Against Bayern Munich, they came from behind to win with two late goals from Sheringham and Solskjær."}));
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="lstEquipos.Add(Array As String (\"Liverpool\",\"Ten";
__ref._lstequipos /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new String[]{"Liverpool","Ten years after Manchester United's achievement, Barcelona won the first ever treble by a Spanish club. They beat United in the final of the Champions League 2-0, destroyed Real Madrid 6-2 to win La Liga, and also won the Copa Del Rey. This season saw the emergence of Lionel Messi as the best player in the world. Under the guidance of one of the world's best football managers, Pep Guardiola, Messi more than doubled his tally from the previous campaign. Barcelona's tiki-taka style of play ensured they also won the domestic and UEFA Super Cups and the FIFA Club World Cup in 2009, turning their treble into a 'sextuple'."}));
RDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="lstEquipos.Add(Array As String (\"Manchester Unite";
__ref._lstequipos /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new String[]{"Manchester United","Boca has had some stellar teams over the years, particularly during the Diego Maradona era of the early 1980s. But few teams could match the success domestically or abroad of the 2003 squad. With a league title secured, Boca set its sights on the Copa Libertadores, the South American equivalent of the Champions League, ultimately winning the prize convincingly."}));
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="lstEquipos.Add(Array As String (\"Barcelona\",\"Ten";
__ref._lstequipos /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new String[]{"Barcelona","Ten years after Manchester United's achievement, Barcelona won the first ever treble by a Spanish club. They beat United in the final of the Champions League 2-0, destroyed Real Madrid 6-2 to win La Liga, and also won the Copa Del Rey. This season saw the emergence of Lionel Messi as the best player in the world. Under the guidance of one of the world's best football managers, Pep Guardiola, Messi more than doubled his tally from the previous campaign. Barcelona's tiki-taka style of play ensured they also won the domestic and UEFA Super Cups and the FIFA Club World Cup in 2009, turning their treble into a 'sextuple'."}));
RDebugUtils.currentLine=7864326;
 //BA.debugLineNum = 7864326;BA.debugLine="lstEquipos.Add(Array As String (\"Boca Juniors\",\"B";
__ref._lstequipos /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new String[]{"Boca Juniors","Boca has had some stellar teams over the years, particularly during the Diego Maradona era of the early 1980s. But few teams could match the success domestically or abroad of the 2003 squad. With a league title secured, Boca set its sights on the Copa Libertadores, the South American equivalent of the Champions League, ultimately winning the prize convincingly. "}));
RDebugUtils.currentLine=7864327;
 //BA.debugLineNum = 7864327;BA.debugLine="lstEquipos.Add(Array As String (\"Sao Paolo\",\"Few";
__ref._lstequipos /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new String[]{"Sao Paolo","Few teams in the world could match the success found by Brazilian giants Sao Paulo in the early 1990s. Under legendary head coach Tele Santana, Sao Paulo reached the pinnacle of their powers during the 1993 season. "}));
RDebugUtils.currentLine=7864328;
 //BA.debugLineNum = 7864328;BA.debugLine="lstEquipos.Add(Array As String (\"Dynamo Kiev\",\"Dy";
__ref._lstequipos /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new String[]{"Dynamo Kiev","Dynamo Kiev have long been the dominant force in Ukranian football, but in the 1970s and 80s, they were the dominant force in all of Soviet football, ruling the league."}));
RDebugUtils.currentLine=7864329;
 //BA.debugLineNum = 7864329;BA.debugLine="End Sub";
return "";
}
public String  _button1_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {return ((String) Debug.delegate(ba, "button1_click", null));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub Button1_Click";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="xui.MsgboxAsync(\"¡Hola mundo!\", \"B4X\")";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"¡Hola mundo!","B4X");
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 458755;BA.debugLine="Private lstEquipos As List";
_lstequipos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Private mEquipos As Map";
_mequipos = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Private nf  As String = \"equipos.txt\"";
_nf = "equipos.txt";
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Private strCarpeta  As String";
_strcarpeta = "";
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