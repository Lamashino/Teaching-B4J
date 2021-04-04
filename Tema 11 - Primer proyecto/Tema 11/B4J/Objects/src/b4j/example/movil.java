package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class movil extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.movil", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.movil.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _strnombre = "";
public String _strpantalla = "";
public int _intcapacidad = 0;
public int _fltram = 0;
public String _strcpu = "";
public int _intcantidad = 0;
public String _stros = "";
public float _fltprecio = 0f;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 3;BA.debugLine="Public strNombre As String";
_strnombre = "";
 //BA.debugLineNum = 4;BA.debugLine="Public strPantalla As String";
_strpantalla = "";
 //BA.debugLineNum = 5;BA.debugLine="Public intCapacidad As Int";
_intcapacidad = 0;
 //BA.debugLineNum = 6;BA.debugLine="Public fltRAM As Int";
_fltram = 0;
 //BA.debugLineNum = 7;BA.debugLine="Public strCPU As String";
_strcpu = "";
 //BA.debugLineNum = 8;BA.debugLine="Public intCantidad As Int";
_intcantidad = 0;
 //BA.debugLineNum = 9;BA.debugLine="Public strOS As String";
_stros = "";
 //BA.debugLineNum = 10;BA.debugLine="Public fltPrecio As Float";
_fltprecio = 0f;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 15;BA.debugLine="strNombre = \"\"";
_strnombre = "";
 //BA.debugLineNum = 16;BA.debugLine="strPantalla  = \"\"";
_strpantalla = "";
 //BA.debugLineNum = 17;BA.debugLine="intCapacidad  = 0";
_intcapacidad = (int) (0);
 //BA.debugLineNum = 18;BA.debugLine="fltRAM  = 0";
_fltram = (int) (0);
 //BA.debugLineNum = 19;BA.debugLine="strCPU = \"\"";
_strcpu = "";
 //BA.debugLineNum = 20;BA.debugLine="intCantidad = 0";
_intcantidad = (int) (0);
 //BA.debugLineNum = 21;BA.debugLine="strOS = \"\"";
_stros = "";
 //BA.debugLineNum = 22;BA.debugLine="fltPrecio = 0";
_fltprecio = (float) (0);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _nuevomovil(String _nombre,String _pantalla,int _capacidad,int _ram,String _cpu,int _cantidad,String _os,float _precio) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Public Sub nuevoMovil(nombre As String, pantalla A";
 //BA.debugLineNum = 28;BA.debugLine="strNombre = nombre";
_strnombre = _nombre;
 //BA.debugLineNum = 29;BA.debugLine="strPantalla  = pantalla";
_strpantalla = _pantalla;
 //BA.debugLineNum = 30;BA.debugLine="intCapacidad  = capacidad";
_intcapacidad = _capacidad;
 //BA.debugLineNum = 31;BA.debugLine="fltRAM  = ram";
_fltram = _ram;
 //BA.debugLineNum = 32;BA.debugLine="strCPU = cpu";
_strcpu = _cpu;
 //BA.debugLineNum = 33;BA.debugLine="intCantidad = cantidad";
_intcantidad = _cantidad;
 //BA.debugLineNum = 34;BA.debugLine="strOS = OS";
_stros = _os;
 //BA.debugLineNum = 35;BA.debugLine="fltPrecio = precio";
_fltprecio = _precio;
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _vendermovil(int _cantidad) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Public Sub venderMovil(cantidad As Int)";
 //BA.debugLineNum = 40;BA.debugLine="intCantidad = intCantidad - cantidad";
_intcantidad = (int) (_intcantidad-_cantidad);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
