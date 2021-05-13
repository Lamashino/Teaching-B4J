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
public static class _cliente{
public boolean IsInitialized;
public String ID;
public String Nombre;
public String Apellidos;
public String Teléfono;
public void Initialize() {
IsInitialized = true;
ID = "";
Nombre = "";
Apellidos = "";
Teléfono = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.collections.List _clientes = null;
public b4j.example.customlistview _customlistview1 = null;
public b4j.example.b4xfloattextfield _txtnombre = null;
public b4j.example.b4xfloattextfield _txtid = null;
public b4j.example.b4xfloattextfield _txtapellidos = null;
public b4j.example.b4xfloattextfield _txtteléfono = null;
public b4j.example.b4xdialog _dialog = null;
public b4j.example.keyvaluestore _ficherokvs = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btncargarfichero = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _anadirespacios(b4j.example.b4xmainpage __ref,String _s1,int _pos) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "anadirespacios", false))
	 {return ((String) Debug.delegate(ba, "anadirespacios", new Object[] {_s1,_pos}));}
RDebugUtils.currentLine=36634624;
 //BA.debugLineNum = 36634624;BA.debugLine="Private Sub anadirEspacios(s1 As String, pos As In";
RDebugUtils.currentLine=36634625;
 //BA.debugLineNum = 36634625;BA.debugLine="If pos = 1 Then";
if (_pos==1) { 
RDebugUtils.currentLine=36634626;
 //BA.debugLineNum = 36634626;BA.debugLine="Do While s1.Length <= 8 Then";
while (_s1.length()<=8) {
RDebugUtils.currentLine=36634627;
 //BA.debugLineNum = 36634627;BA.debugLine="s1 = s1 & \" \"";
_s1 = _s1+" ";
 }
;
 }else 
{RDebugUtils.currentLine=36634629;
 //BA.debugLineNum = 36634629;BA.debugLine="else if pos = 2 Or pos = 3 Then";
if (_pos==2 || _pos==3) { 
RDebugUtils.currentLine=36634630;
 //BA.debugLineNum = 36634630;BA.debugLine="Do While s1.Length <= 20 Then";
while (_s1.length()<=20) {
RDebugUtils.currentLine=36634631;
 //BA.debugLineNum = 36634631;BA.debugLine="s1 = s1 & \" \"";
_s1 = _s1+" ";
 }
;
 }}
;
RDebugUtils.currentLine=36634634;
 //BA.debugLineNum = 36634634;BA.debugLine="Return s1";
if (true) return _s1;
RDebugUtils.currentLine=36634635;
 //BA.debugLineNum = 36634635;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4j.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
int _i = 0;
b4j.example.b4xmainpage._cliente _c = null;
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Root.LoadLayout(\"MainPage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPage",ba);
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Clientes.Initialize";
__ref._clientes /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="crearLista";
__ref._crearlista /*String*/ (null);
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="For i = 0 To Clientes.Size-1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._clientes /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="Private c As Cliente";
_c = new b4j.example.b4xmainpage._cliente();
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="c = Clientes.Get(i)";
_c = (b4j.example.b4xmainpage._cliente)(__ref._clientes /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="LogCliente(c)";
__ref._logcliente /*String*/ (null,_c);
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="Log(\"---------------------------\")";
__c.Log("---------------------------");
 }
};
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="End Sub";
return "";
}
public String  _crearlista(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "crearlista", false))
	 {return ((String) Debug.delegate(ba, "crearlista", null));}
b4j.example.b4xmainpage._cliente _cli = null;
RDebugUtils.currentLine=32112640;
 //BA.debugLineNum = 32112640;BA.debugLine="Private Sub crearLista";
RDebugUtils.currentLine=32112641;
 //BA.debugLineNum = 32112641;BA.debugLine="Private cli As Cliente";
_cli = new b4j.example.b4xmainpage._cliente();
RDebugUtils.currentLine=32112642;
 //BA.debugLineNum = 32112642;BA.debugLine="cli.Initialize";
_cli.Initialize();
RDebugUtils.currentLine=32112643;
 //BA.debugLineNum = 32112643;BA.debugLine="cli.ID = \"A3473\"";
_cli.ID /*String*/  = "A3473";
RDebugUtils.currentLine=32112644;
 //BA.debugLineNum = 32112644;BA.debugLine="cli.Nombre = \"John\"";
_cli.Nombre /*String*/  = "John";
RDebugUtils.currentLine=32112645;
 //BA.debugLineNum = 32112645;BA.debugLine="cli.Apellidos = \"Smith\"";
_cli.Apellidos /*String*/  = "Smith";
RDebugUtils.currentLine=32112646;
 //BA.debugLineNum = 32112646;BA.debugLine="cli.Teléfono = \"4563454\"";
_cli.Teléfono /*String*/  = "4563454";
RDebugUtils.currentLine=32112647;
 //BA.debugLineNum = 32112647;BA.debugLine="Clientes.Add(cli)";
__ref._clientes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cli));
RDebugUtils.currentLine=32112649;
 //BA.debugLineNum = 32112649;BA.debugLine="Private cli As Cliente";
_cli = new b4j.example.b4xmainpage._cliente();
RDebugUtils.currentLine=32112650;
 //BA.debugLineNum = 32112650;BA.debugLine="cli.Initialize";
_cli.Initialize();
RDebugUtils.currentLine=32112651;
 //BA.debugLineNum = 32112651;BA.debugLine="cli.ID = \"X51462\"";
_cli.ID /*String*/  = "X51462";
RDebugUtils.currentLine=32112652;
 //BA.debugLineNum = 32112652;BA.debugLine="cli.Nombre = \"Paraskevas\"";
_cli.Nombre /*String*/  = "Paraskevas";
RDebugUtils.currentLine=32112653;
 //BA.debugLineNum = 32112653;BA.debugLine="cli.Apellidos = \"Xatjixaralampos\"";
_cli.Apellidos /*String*/  = "Xatjixaralampos";
RDebugUtils.currentLine=32112654;
 //BA.debugLineNum = 32112654;BA.debugLine="cli.Teléfono = \"612978323\"";
_cli.Teléfono /*String*/  = "612978323";
RDebugUtils.currentLine=32112655;
 //BA.debugLineNum = 32112655;BA.debugLine="Clientes.Add(cli)";
__ref._clientes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cli));
RDebugUtils.currentLine=32112658;
 //BA.debugLineNum = 32112658;BA.debugLine="Private cli As Cliente";
_cli = new b4j.example.b4xmainpage._cliente();
RDebugUtils.currentLine=32112659;
 //BA.debugLineNum = 32112659;BA.debugLine="cli.Initialize";
_cli.Initialize();
RDebugUtils.currentLine=32112660;
 //BA.debugLineNum = 32112660;BA.debugLine="cli.ID = \"B1753\"";
_cli.ID /*String*/  = "B1753";
RDebugUtils.currentLine=32112661;
 //BA.debugLineNum = 32112661;BA.debugLine="cli.Nombre = \"Selim\"";
_cli.Nombre /*String*/  = "Selim";
RDebugUtils.currentLine=32112662;
 //BA.debugLineNum = 32112662;BA.debugLine="cli.Apellidos = \"Al Huarizmi\"";
_cli.Apellidos /*String*/  = "Al Huarizmi";
RDebugUtils.currentLine=32112663;
 //BA.debugLineNum = 32112663;BA.debugLine="cli.Teléfono = \"6532578\"";
_cli.Teléfono /*String*/  = "6532578";
RDebugUtils.currentLine=32112664;
 //BA.debugLineNum = 32112664;BA.debugLine="Clientes.Add(cli)";
__ref._clientes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cli));
RDebugUtils.currentLine=32112666;
 //BA.debugLineNum = 32112666;BA.debugLine="Private cli As Cliente";
_cli = new b4j.example.b4xmainpage._cliente();
RDebugUtils.currentLine=32112667;
 //BA.debugLineNum = 32112667;BA.debugLine="cli.Initialize";
_cli.Initialize();
RDebugUtils.currentLine=32112668;
 //BA.debugLineNum = 32112668;BA.debugLine="cli.ID = \"C6544\"";
_cli.ID /*String*/  = "C6544";
RDebugUtils.currentLine=32112669;
 //BA.debugLineNum = 32112669;BA.debugLine="cli.Nombre = \"Mateo\"";
_cli.Nombre /*String*/  = "Mateo";
RDebugUtils.currentLine=32112670;
 //BA.debugLineNum = 32112670;BA.debugLine="cli.Apellidos = \"Sandor\"";
_cli.Apellidos /*String*/  = "Sandor";
RDebugUtils.currentLine=32112671;
 //BA.debugLineNum = 32112671;BA.debugLine="cli.Teléfono = \"7345346\"";
_cli.Teléfono /*String*/  = "7345346";
RDebugUtils.currentLine=32112672;
 //BA.debugLineNum = 32112672;BA.debugLine="Clientes.Add(cli)";
__ref._clientes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cli));
RDebugUtils.currentLine=32112674;
 //BA.debugLineNum = 32112674;BA.debugLine="Private cli As Cliente";
_cli = new b4j.example.b4xmainpage._cliente();
RDebugUtils.currentLine=32112675;
 //BA.debugLineNum = 32112675;BA.debugLine="cli.Initialize";
_cli.Initialize();
RDebugUtils.currentLine=32112676;
 //BA.debugLineNum = 32112676;BA.debugLine="cli.ID = \"C6323\"";
_cli.ID /*String*/  = "C6323";
RDebugUtils.currentLine=32112677;
 //BA.debugLineNum = 32112677;BA.debugLine="cli.Nombre = \"Lucía\"";
_cli.Nombre /*String*/  = "Lucía";
RDebugUtils.currentLine=32112678;
 //BA.debugLineNum = 32112678;BA.debugLine="cli.Apellidos = \"Graham\"";
_cli.Apellidos /*String*/  = "Graham";
RDebugUtils.currentLine=32112679;
 //BA.debugLineNum = 32112679;BA.debugLine="cli.Teléfono = \"1231345\"";
_cli.Teléfono /*String*/  = "1231345";
RDebugUtils.currentLine=32112680;
 //BA.debugLineNum = 32112680;BA.debugLine="Clientes.Add(cli)";
__ref._clientes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cli));
RDebugUtils.currentLine=32112682;
 //BA.debugLineNum = 32112682;BA.debugLine="Private cli As Cliente";
_cli = new b4j.example.b4xmainpage._cliente();
RDebugUtils.currentLine=32112683;
 //BA.debugLineNum = 32112683;BA.debugLine="cli.Initialize";
_cli.Initialize();
RDebugUtils.currentLine=32112684;
 //BA.debugLineNum = 32112684;BA.debugLine="cli.ID = \"F1462\"";
_cli.ID /*String*/  = "F1462";
RDebugUtils.currentLine=32112685;
 //BA.debugLineNum = 32112685;BA.debugLine="cli.Nombre = \"Noam\"";
_cli.Nombre /*String*/  = "Noam";
RDebugUtils.currentLine=32112686;
 //BA.debugLineNum = 32112686;BA.debugLine="cli.Apellidos = \"Bell\"";
_cli.Apellidos /*String*/  = "Bell";
RDebugUtils.currentLine=32112687;
 //BA.debugLineNum = 32112687;BA.debugLine="cli.Teléfono = \"6978323\"";
_cli.Teléfono /*String*/  = "6978323";
RDebugUtils.currentLine=32112688;
 //BA.debugLineNum = 32112688;BA.debugLine="Clientes.Add(cli)";
__ref._clientes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cli));
RDebugUtils.currentLine=32112689;
 //BA.debugLineNum = 32112689;BA.debugLine="End Sub";
return "";
}
public String  _logcliente(b4j.example.b4xmainpage __ref,b4j.example.b4xmainpage._cliente _cli) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "logcliente", false))
	 {return ((String) Debug.delegate(ba, "logcliente", new Object[] {_cli}));}
RDebugUtils.currentLine=31457280;
 //BA.debugLineNum = 31457280;BA.debugLine="Private Sub LogCliente(cli As Cliente)";
RDebugUtils.currentLine=31457281;
 //BA.debugLineNum = 31457281;BA.debugLine="Log(cli.ID)";
__c.Log(_cli.ID /*String*/ );
RDebugUtils.currentLine=31457282;
 //BA.debugLineNum = 31457282;BA.debugLine="Log(cli.Nombre)";
__c.Log(_cli.Nombre /*String*/ );
RDebugUtils.currentLine=31457283;
 //BA.debugLineNum = 31457283;BA.debugLine="Log(cli.Apellidos)";
__c.Log(_cli.Apellidos /*String*/ );
RDebugUtils.currentLine=31457284;
 //BA.debugLineNum = 31457284;BA.debugLine="Log(cli.Teléfono)";
__c.Log(_cli.Teléfono /*String*/ );
RDebugUtils.currentLine=31457285;
 //BA.debugLineNum = 31457285;BA.debugLine="End Sub";
return "";
}
public void  _borrarregistro(b4j.example.b4xmainpage __ref,int _índice,Object _valor) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "borrarregistro", false))
	 {Debug.delegate(ba, "borrarregistro", new Object[] {_índice,_valor}); return;}
ResumableSub_borrarRegistro rsub = new ResumableSub_borrarRegistro(this,__ref,_índice,_valor);
rsub.resume(ba, null);
}
public static class ResumableSub_borrarRegistro extends BA.ResumableSub {
public ResumableSub_borrarRegistro(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref,int _índice,Object _valor) {
this.parent = parent;
this.__ref = __ref;
this._índice = _índice;
this._valor = _valor;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
int _índice;
Object _valor;
Object _dlg = null;
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
RDebugUtils.currentLine=37879809;
 //BA.debugLineNum = 37879809;BA.debugLine="Dim dlg As Object";
_dlg = new Object();
RDebugUtils.currentLine=37879810;
 //BA.debugLineNum = 37879810;BA.debugLine="dlg = xui.Msgbox2Async(\"¿Quieres borrar el Client";
_dlg = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Quieres borrar el Cliente?","Advertencia","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=37879811;
 //BA.debugLineNum = 37879811;BA.debugLine="Wait for (dlg) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "borrarregistro"), _dlg);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=37879812;
 //BA.debugLineNum = 37879812;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=37879813;
 //BA.debugLineNum = 37879813;BA.debugLine="CustomListView1.RemoveAt(índice)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._removeat(_índice);
RDebugUtils.currentLine=37879814;
 //BA.debugLineNum = 37879814;BA.debugLine="Clientes.RemoveAt(índice)";
__ref._clientes /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_índice);
RDebugUtils.currentLine=37879815;
 //BA.debugLineNum = 37879815;BA.debugLine="ficheroKVS.Remove(valor)";
__ref._ficherokvs /*b4j.example.keyvaluestore*/ ._remove /*String*/ (null,BA.ObjectToString(_valor));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=37879817;
 //BA.debugLineNum = 37879817;BA.debugLine="btnCargar_Click";
__ref._btncargar_click /*String*/ (null);
RDebugUtils.currentLine=37879818;
 //BA.debugLineNum = 37879818;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btncargar_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btncargar_click", false))
	 {return ((String) Debug.delegate(ba, "btncargar_click", null));}
int _i = 0;
b4j.example.b4xmainpage._cliente _c = null;
String _str = "";
String _s1 = "";
String _s2 = "";
String _s3 = "";
String _s4 = "";
RDebugUtils.currentLine=35192832;
 //BA.debugLineNum = 35192832;BA.debugLine="Private Sub btnCargar_Click";
RDebugUtils.currentLine=35192833;
 //BA.debugLineNum = 35192833;BA.debugLine="If CustomListView1.IsInitialized Then";
if (__ref._customlistview1 /*b4j.example.customlistview*/ .IsInitialized()) { 
RDebugUtils.currentLine=35192834;
 //BA.debugLineNum = 35192834;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4j.example.customlistview*/ ._clear();
 };
RDebugUtils.currentLine=35192836;
 //BA.debugLineNum = 35192836;BA.debugLine="For i = 0 To Clientes.Size-1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._clientes /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=35192837;
 //BA.debugLineNum = 35192837;BA.debugLine="Private c As Cliente";
_c = new b4j.example.b4xmainpage._cliente();
RDebugUtils.currentLine=35192838;
 //BA.debugLineNum = 35192838;BA.debugLine="Private str As String";
_str = "";
RDebugUtils.currentLine=35192839;
 //BA.debugLineNum = 35192839;BA.debugLine="c = Clientes.Get(i)";
_c = (b4j.example.b4xmainpage._cliente)(__ref._clientes /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=35192840;
 //BA.debugLineNum = 35192840;BA.debugLine="Private s1, s2, s3, s4 As String";
_s1 = "";
_s2 = "";
_s3 = "";
_s4 = "";
RDebugUtils.currentLine=35192841;
 //BA.debugLineNum = 35192841;BA.debugLine="s1 = anadirEspacios(c.ID, 1)";
_s1 = __ref._anadirespacios /*String*/ (null,_c.ID /*String*/ ,(int) (1));
RDebugUtils.currentLine=35192842;
 //BA.debugLineNum = 35192842;BA.debugLine="s2 = anadirEspacios(c.Nombre, 2)";
_s2 = __ref._anadirespacios /*String*/ (null,_c.Nombre /*String*/ ,(int) (2));
RDebugUtils.currentLine=35192843;
 //BA.debugLineNum = 35192843;BA.debugLine="s3 = anadirEspacios(c.Apellidos, 3)";
_s3 = __ref._anadirespacios /*String*/ (null,_c.Apellidos /*String*/ ,(int) (3));
RDebugUtils.currentLine=35192844;
 //BA.debugLineNum = 35192844;BA.debugLine="s4 = c.Teléfono";
_s4 = _c.Teléfono /*String*/ ;
RDebugUtils.currentLine=35192846;
 //BA.debugLineNum = 35192846;BA.debugLine="str = $\"${s1}${s2}${s3}${s4}\"$";
_str = (""+__c.SmartStringFormatter("",(Object)(_s1))+""+__c.SmartStringFormatter("",(Object)(_s2))+""+__c.SmartStringFormatter("",(Object)(_s3))+""+__c.SmartStringFormatter("",(Object)(_s4))+"");
RDebugUtils.currentLine=35192847;
 //BA.debugLineNum = 35192847;BA.debugLine="CustomListView1.AddTextItem(str, c.ID)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._addtextitem((Object)(_str),(Object)(_c.ID /*String*/ ));
 }
};
RDebugUtils.currentLine=35192849;
 //BA.debugLineNum = 35192849;BA.debugLine="End Sub";
return "";
}
public String  _btncargarfichero_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btncargarfichero_click", false))
	 {return ((String) Debug.delegate(ba, "btncargarfichero_click", null));}
RDebugUtils.currentLine=35651584;
 //BA.debugLineNum = 35651584;BA.debugLine="Private Sub btnCargarFichero_Click";
RDebugUtils.currentLine=35651585;
 //BA.debugLineNum = 35651585;BA.debugLine="cargarFichero";
__ref._cargarfichero /*String*/ (null);
RDebugUtils.currentLine=35651586;
 //BA.debugLineNum = 35651586;BA.debugLine="End Sub";
return "";
}
public String  _cargarfichero(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "cargarfichero", false))
	 {return ((String) Debug.delegate(ba, "cargarfichero", null));}
anywheresoftware.b4a.objects.collections.List _lstclaves = null;
int _i = 0;
b4j.example.b4xmainpage._cliente _cli = null;
RDebugUtils.currentLine=36503552;
 //BA.debugLineNum = 36503552;BA.debugLine="Private Sub cargarFichero";
RDebugUtils.currentLine=36503553;
 //BA.debugLineNum = 36503553;BA.debugLine="ficheroKVS.Initialize(File.DirTemp & \"tema18\", \"e";
__ref._ficherokvs /*b4j.example.keyvaluestore*/ ._initialize /*String*/ (null,ba,__c.File.getDirTemp()+"tema18","ej1.dat");
RDebugUtils.currentLine=36503554;
 //BA.debugLineNum = 36503554;BA.debugLine="Private lstClaves As List = ficheroKVS.ListKeys";
_lstclaves = new anywheresoftware.b4a.objects.collections.List();
_lstclaves = __ref._ficherokvs /*b4j.example.keyvaluestore*/ ._listkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=36503555;
 //BA.debugLineNum = 36503555;BA.debugLine="Clientes.Initialize";
__ref._clientes /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=36503556;
 //BA.debugLineNum = 36503556;BA.debugLine="For i = 0 To lstClaves.Size-1";
{
final int step4 = 1;
final int limit4 = (int) (_lstclaves.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=36503557;
 //BA.debugLineNum = 36503557;BA.debugLine="Private cli As Cliente";
_cli = new b4j.example.b4xmainpage._cliente();
RDebugUtils.currentLine=36503558;
 //BA.debugLineNum = 36503558;BA.debugLine="cli = ficheroKVS.Get(lstClaves.Get(i))";
_cli = (b4j.example.b4xmainpage._cliente)(__ref._ficherokvs /*b4j.example.keyvaluestore*/ ._get /*Object*/ (null,BA.ObjectToString(_lstclaves.Get(_i))));
RDebugUtils.currentLine=36503559;
 //BA.debugLineNum = 36503559;BA.debugLine="Clientes.Add(cli)";
__ref._clientes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cli));
 }
};
RDebugUtils.currentLine=36503561;
 //BA.debugLineNum = 36503561;BA.debugLine="btnCargar_Click";
__ref._btncargar_click /*String*/ (null);
RDebugUtils.currentLine=36503562;
 //BA.debugLineNum = 36503562;BA.debugLine="End Sub";
return "";
}
public String  _btnguardarfichero_click(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnguardarfichero_click", false))
	 {return ((String) Debug.delegate(ba, "btnguardarfichero_click", null));}
RDebugUtils.currentLine=33554432;
 //BA.debugLineNum = 33554432;BA.debugLine="Private Sub btnGuardarFichero_Click";
RDebugUtils.currentLine=33554433;
 //BA.debugLineNum = 33554433;BA.debugLine="guardarFichero";
__ref._guardarfichero /*String*/ (null);
RDebugUtils.currentLine=33554434;
 //BA.debugLineNum = 33554434;BA.debugLine="End Sub";
return "";
}
public String  _guardarfichero(b4j.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "guardarfichero", false))
	 {return ((String) Debug.delegate(ba, "guardarfichero", null));}
int _i = 0;
b4j.example.b4xmainpage._cliente _clientesalvado = null;
RDebugUtils.currentLine=34471936;
 //BA.debugLineNum = 34471936;BA.debugLine="Private Sub guardarFichero";
RDebugUtils.currentLine=34471937;
 //BA.debugLineNum = 34471937;BA.debugLine="File.MakeDir(File.DirTemp, \"tema18\")";
__c.File.MakeDir(__c.File.getDirTemp(),"tema18");
RDebugUtils.currentLine=34471938;
 //BA.debugLineNum = 34471938;BA.debugLine="ficheroKVS.Initialize(File.DirTemp & \"tema18\", \"e";
__ref._ficherokvs /*b4j.example.keyvaluestore*/ ._initialize /*String*/ (null,ba,__c.File.getDirTemp()+"tema18","ej1.dat");
RDebugUtils.currentLine=34471939;
 //BA.debugLineNum = 34471939;BA.debugLine="Log(File. DirTemp  & \"tema18\")";
__c.Log(__c.File.getDirTemp()+"tema18");
RDebugUtils.currentLine=34471940;
 //BA.debugLineNum = 34471940;BA.debugLine="For i = 0 To Clientes.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._clientes /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=34471941;
 //BA.debugLineNum = 34471941;BA.debugLine="Private clienteSalvado As Cliente";
_clientesalvado = new b4j.example.b4xmainpage._cliente();
RDebugUtils.currentLine=34471942;
 //BA.debugLineNum = 34471942;BA.debugLine="clienteSalvado = Clientes.Get(i)";
_clientesalvado = (b4j.example.b4xmainpage._cliente)(__ref._clientes /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=34471943;
 //BA.debugLineNum = 34471943;BA.debugLine="ficheroKVS.Put(clienteSalvado.ID, clienteSalvado";
__ref._ficherokvs /*b4j.example.keyvaluestore*/ ._put /*String*/ (null,_clientesalvado.ID /*String*/ ,(Object)(_clientesalvado));
 }
};
RDebugUtils.currentLine=34471945;
 //BA.debugLineNum = 34471945;BA.debugLine="End Sub";
return "";
}
public void  _btninsertar_click(b4j.example.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btninsertar_click", false))
	 {Debug.delegate(ba, "btninsertar_click", null); return;}
ResumableSub_btnInsertar_Click rsub = new ResumableSub_btnInsertar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnInsertar_Click extends BA.ResumableSub {
public ResumableSub_btnInsertar_Click(b4j.example.b4xmainpage parent,b4j.example.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.example.b4xmainpage __ref;
b4j.example.b4xmainpage parent;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _result = 0;
b4j.example.b4xmainpage._cliente _nuevocliente = null;

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
RDebugUtils.currentLine=36831233;
 //BA.debugLineNum = 36831233;BA.debugLine="dialog.Initialize(Root)";
__ref._dialog /*b4j.example.b4xdialog*/ ._initialize /*String*/ (null,ba,__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=36831234;
 //BA.debugLineNum = 36831234;BA.debugLine="dialog.Title = \"Insertar Cliente\"";
__ref._dialog /*b4j.example.b4xdialog*/ ._title /*Object*/  = (Object)("Insertar Cliente");
RDebugUtils.currentLine=36831236;
 //BA.debugLineNum = 36831236;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=36831237;
 //BA.debugLineNum = 36831237;BA.debugLine="p.SetLayoutAnimated(0,0,0, 350dip, 250dip)";
_p.SetLayoutAnimated((int) (0),0,0,parent.__c.DipToCurrent((int) (350)),parent.__c.DipToCurrent((int) (250)));
RDebugUtils.currentLine=36831239;
 //BA.debugLineNum = 36831239;BA.debugLine="p.LoadLayout(\"dlgInsertCustomer\")";
_p.LoadLayout("dlgInsertCustomer",ba);
RDebugUtils.currentLine=36831240;
 //BA.debugLineNum = 36831240;BA.debugLine="dialog.PutAtTop = True";
__ref._dialog /*b4j.example.b4xdialog*/ ._putattop /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=36831241;
 //BA.debugLineNum = 36831241;BA.debugLine="Wait For (dialog.ShowCustom(p, \"OK\", \"\", \"Cancel\"";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "btninsertar_click"), __ref._dialog /*b4j.example.b4xdialog*/ ._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("Cancel")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=36831242;
 //BA.debugLineNum = 36831242;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=36831243;
 //BA.debugLineNum = 36831243;BA.debugLine="Private nuevoCliente As Cliente";
_nuevocliente = new b4j.example.b4xmainpage._cliente();
RDebugUtils.currentLine=36831244;
 //BA.debugLineNum = 36831244;BA.debugLine="nuevoCliente.ID = txtID.Text";
_nuevocliente.ID /*String*/  = __ref._txtid /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null);
RDebugUtils.currentLine=36831245;
 //BA.debugLineNum = 36831245;BA.debugLine="nuevoCliente.Nombre = txtNombre.Text";
_nuevocliente.Nombre /*String*/  = __ref._txtnombre /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null);
RDebugUtils.currentLine=36831246;
 //BA.debugLineNum = 36831246;BA.debugLine="nuevoCliente.Apellidos = txtApellidos.Text";
_nuevocliente.Apellidos /*String*/  = __ref._txtapellidos /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null);
RDebugUtils.currentLine=36831247;
 //BA.debugLineNum = 36831247;BA.debugLine="nuevoCliente.Teléfono = txtTeléfono.Text";
_nuevocliente.Teléfono /*String*/  = __ref._txtteléfono /*b4j.example.b4xfloattextfield*/ ._gettext /*String*/ (null);
RDebugUtils.currentLine=36831248;
 //BA.debugLineNum = 36831248;BA.debugLine="Clientes.Add(nuevoCliente)";
__ref._clientes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_nuevocliente));
RDebugUtils.currentLine=36831249;
 //BA.debugLineNum = 36831249;BA.debugLine="btnCargar_Click";
__ref._btncargar_click /*String*/ (null);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=36831251;
 //BA.debugLineNum = 36831251;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 458755;BA.debugLine="Type Cliente(ID As String, Nombre As String, Apel";
;
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Private Clientes As List";
_clientes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Private CustomListView1 As CustomListView";
_customlistview1 = new b4j.example.customlistview();
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="Private txtNombre As B4XFloatTextField";
_txtnombre = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="Private txtID As B4XFloatTextField";
_txtid = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="Private txtApellidos As B4XFloatTextField";
_txtapellidos = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="Private txtTeléfono As B4XFloatTextField";
_txtteléfono = new b4j.example.b4xfloattextfield();
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="Private dialog As B4XDialog";
_dialog = new b4j.example.b4xdialog();
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="Private ficheroKVS  As KeyValueStore";
_ficherokvs = new b4j.example.keyvaluestore();
RDebugUtils.currentLine=458765;
 //BA.debugLineNum = 458765;BA.debugLine="Private btnCargarFichero As Button";
_btncargarfichero = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=458766;
 //BA.debugLineNum = 458766;BA.debugLine="End Sub";
return "";
}
public String  _customlistview1_itemclick(b4j.example.b4xmainpage __ref,int _índice,Object _valor) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "customlistview1_itemclick", false))
	 {return ((String) Debug.delegate(ba, "customlistview1_itemclick", new Object[] {_índice,_valor}));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub CustomListView1_ItemClick (Índice As I";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="borrarRegistro(Índice, Valor)";
__ref._borrarregistro /*void*/ (null,_índice,_valor);
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Log(Índice & \" \" & Valor)";
__c.Log(BA.NumberToString(_índice)+" "+BA.ObjectToString(_valor));
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="End Sub";
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