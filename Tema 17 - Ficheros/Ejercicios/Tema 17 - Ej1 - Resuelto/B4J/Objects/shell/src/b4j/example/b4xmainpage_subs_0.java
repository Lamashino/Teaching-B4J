package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
int _i = 0;
RemoteObject _arr = null;
RemoteObject _strequipos = RemoteObject.createImmutable("");
RemoteObject _clave = RemoteObject.createImmutable("");
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 23;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="Root = Root1";
Debug.ShouldStop(8388608);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 25;BA.debugLine="Root.LoadLayout(\"MainPage\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 26;BA.debugLine="strCarpeta =  File.DirTemp  & \"tema17\\\"";
Debug.ShouldStop(33554432);
__ref.setField ("_strcarpeta" /*RemoteObject*/ ,RemoteObject.concat(b4xmainpage.__c.getField(false,"File").runMethod(true,"getDirTemp"),RemoteObject.createImmutable("tema17\\")));
 BA.debugLineNum = 27;BA.debugLine="Log(strCarpeta)";
Debug.ShouldStop(67108864);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(__ref.getField(true,"_strcarpeta" /*RemoteObject*/ )));
 BA.debugLineNum = 28;BA.debugLine="lstEquipos.Initialize";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lstequipos" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 29;BA.debugLine="cargarEquipos";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4j.example.b4xmainpage.class, "_cargarequipos" /*RemoteObject*/ );
 BA.debugLineNum = 33;BA.debugLine="mEquipos.Initialize";
Debug.ShouldStop(1);
__ref.getField(false,"_mequipos" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 34;BA.debugLine="For i = 0 To lstEquipos.Size - 1";
Debug.ShouldStop(2);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstequipos" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 35;BA.debugLine="Private arr() As String";
Debug.ShouldStop(4);
_arr = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("arr", _arr);
 BA.debugLineNum = 36;BA.debugLine="arr = lstEquipos.Get(i)";
Debug.ShouldStop(8);
_arr = (__ref.getField(false,"_lstequipos" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("arr", _arr);
 BA.debugLineNum = 37;BA.debugLine="mEquipos.Put(arr(0), arr(1))";
Debug.ShouldStop(16);
__ref.getField(false,"_mequipos" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_arr.getArrayElement(true,BA.numberCast(int.class, 0)))),(Object)((_arr.getArrayElement(true,BA.numberCast(int.class, 1)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 40;BA.debugLine="File.WriteMap(strCarpeta, nf, mEquipos)";
Debug.ShouldStop(128);
b4xmainpage.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(__ref.getField(true,"_strcarpeta" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_nf" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_mequipos" /*RemoteObject*/ )));
 BA.debugLineNum = 43;BA.debugLine="Private strEquipos As String";
Debug.ShouldStop(1024);
_strequipos = RemoteObject.createImmutable("");Debug.locals.put("strEquipos", _strequipos);
 BA.debugLineNum = 44;BA.debugLine="For Each clave  As  String In  mEquipos.Keys";
Debug.ShouldStop(2048);
{
final RemoteObject group15 = __ref.getField(false,"_mequipos" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen15 = group15.runMethod(true,"getSize").<Integer>get()
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_clave = BA.ObjectToString(group15.runMethod(false,"Get",index15));Debug.locals.put("clave", _clave);
Debug.locals.put("clave", _clave);
 BA.debugLineNum = 45;BA.debugLine="strEquipos = strEquipos & clave  & \" \" & mEquipo";
Debug.ShouldStop(4096);
_strequipos = RemoteObject.concat(_strequipos,_clave,RemoteObject.createImmutable(" "),__ref.getField(false,"_mequipos" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_clave))),b4xmainpage.__c.getField(true,"CRLF"));Debug.locals.put("strEquipos", _strequipos);
 }
}Debug.locals.put("clave", _clave);
;
 BA.debugLineNum = 49;BA.debugLine="File.WriteString(strCarpeta, \"equipos2.txt\", strE";
Debug.ShouldStop(65536);
b4xmainpage.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(__ref.getField(true,"_strcarpeta" /*RemoteObject*/ )),(Object)(BA.ObjectToString("equipos2.txt")),(Object)(_strequipos));
 BA.debugLineNum = 50;BA.debugLine="Log(strEquipos)";
Debug.ShouldStop(131072);
b4xmainpage.__c.runVoidMethod ("Log",(Object)(_strequipos));
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Button1_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "b4xmainpage","button1_click", __ref);}
 BA.debugLineNum = 67;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="xui.MsgboxAsync(\"¡Hola mundo!\", \"B4X\")";
Debug.ShouldStop(8);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¡Hola mundo!")),(Object)(RemoteObject.createImmutable("B4X")));
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargarequipos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("cargarEquipos (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("cargarequipos")) { return __ref.runUserSub(false, "b4xmainpage","cargarequipos", __ref);}
 BA.debugLineNum = 55;BA.debugLine="Private Sub cargarEquipos";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="lstEquipos.Add(Array As String (\"Arsenal\", \"Led b";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lstequipos" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("Arsenal"),RemoteObject.createImmutable("Led by Alfredo Di Stéfano and Ferenc Puskas, the Real Madrid team of the late '50s dominated world football. They won the European Cup (Champions League) five times in a row from 1956 to 1960. This culminated in the 1960 final when they beat Eintracht Frankfurt 7-3 in one of the greatest footballing displays of all time (see the video below).")}))));
 BA.debugLineNum = 57;BA.debugLine="lstEquipos.Add(Array As String (\"Milan\", \"The tre";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lstequipos" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("Milan"),RemoteObject.createImmutable("The treble-winning Manchester United team of 1998–99 won the Premier League, FA Cup, and Champions League in a single season. It included greats such as Paul Scholes, David Beckham, Ryan Giggs, Roy Keane, and Peter Schmeichal. Like many of Alex Ferguson's teams, they fought until the last whistle, and this was demonstrated in no greater way than the 1999 Champions League final. Against Bayern Munich, they came from behind to win with two late goals from Sheringham and Solskjær.")}))));
 BA.debugLineNum = 58;BA.debugLine="lstEquipos.Add(Array As String (\"Liverpool\",\"Ten";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lstequipos" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("Liverpool"),RemoteObject.createImmutable("Ten years after Manchester United's achievement, Barcelona won the first ever treble by a Spanish club. They beat United in the final of the Champions League 2-0, destroyed Real Madrid 6-2 to win La Liga, and also won the Copa Del Rey. This season saw the emergence of Lionel Messi as the best player in the world. Under the guidance of one of the world's best football managers, Pep Guardiola, Messi more than doubled his tally from the previous campaign. Barcelona's tiki-taka style of play ensured they also won the domestic and UEFA Super Cups and the FIFA Club World Cup in 2009, turning their treble into a 'sextuple'.")}))));
 BA.debugLineNum = 59;BA.debugLine="lstEquipos.Add(Array As String (\"Manchester Unite";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lstequipos" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("Manchester United"),RemoteObject.createImmutable("Boca has had some stellar teams over the years, particularly during the Diego Maradona era of the early 1980s. But few teams could match the success domestically or abroad of the 2003 squad. With a league title secured, Boca set its sights on the Copa Libertadores, the South American equivalent of the Champions League, ultimately winning the prize convincingly.")}))));
 BA.debugLineNum = 60;BA.debugLine="lstEquipos.Add(Array As String (\"Barcelona\",\"Ten";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lstequipos" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("Barcelona"),RemoteObject.createImmutable("Ten years after Manchester United's achievement, Barcelona won the first ever treble by a Spanish club. They beat United in the final of the Champions League 2-0, destroyed Real Madrid 6-2 to win La Liga, and also won the Copa Del Rey. This season saw the emergence of Lionel Messi as the best player in the world. Under the guidance of one of the world's best football managers, Pep Guardiola, Messi more than doubled his tally from the previous campaign. Barcelona's tiki-taka style of play ensured they also won the domestic and UEFA Super Cups and the FIFA Club World Cup in 2009, turning their treble into a 'sextuple'.")}))));
 BA.debugLineNum = 61;BA.debugLine="lstEquipos.Add(Array As String (\"Boca Juniors\",\"B";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lstequipos" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("Boca Juniors"),RemoteObject.createImmutable("Boca has had some stellar teams over the years, particularly during the Diego Maradona era of the early 1980s. But few teams could match the success domestically or abroad of the 2003 squad. With a league title secured, Boca set its sights on the Copa Libertadores, the South American equivalent of the Champions League, ultimately winning the prize convincingly. ")}))));
 BA.debugLineNum = 62;BA.debugLine="lstEquipos.Add(Array As String (\"Sao Paolo\",\"Few";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lstequipos" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("Sao Paolo"),RemoteObject.createImmutable("Few teams in the world could match the success found by Brazilian giants Sao Paulo in the early 1990s. Under legendary head coach Tele Santana, Sao Paulo reached the pinnacle of their powers during the 1993 season. ")}))));
 BA.debugLineNum = 63;BA.debugLine="lstEquipos.Add(Array As String (\"Dynamo Kiev\",\"Dy";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lstequipos" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("Dynamo Kiev"),RemoteObject.createImmutable("Dynamo Kiev have long been the dominant force in Ukranian football, but in the 1970s and 80s, they were the dominant force in all of Soviet football, ruling the league.")}))));
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Private lstEquipos As List";
b4xmainpage._lstequipos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstequipos",b4xmainpage._lstequipos);
 //BA.debugLineNum = 12;BA.debugLine="Private mEquipos As Map";
b4xmainpage._mequipos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_mequipos",b4xmainpage._mequipos);
 //BA.debugLineNum = 13;BA.debugLine="Private nf  As String = \"equipos.txt\"";
b4xmainpage._nf = BA.ObjectToString("equipos.txt");__ref.setField("_nf",b4xmainpage._nf);
 //BA.debugLineNum = 14;BA.debugLine="Private strCarpeta  As String";
b4xmainpage._strcarpeta = RemoteObject.createImmutable("");__ref.setField("_strcarpeta",b4xmainpage._strcarpeta);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(65536);
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}