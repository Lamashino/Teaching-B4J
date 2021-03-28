
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class clsestudiante {
    public static RemoteObject myClass;
	public clsestudiante() {
	}
    public static PCBA staticBA = new PCBA(null, clsestudiante.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _stridescolar = RemoteObject.createImmutable("");
public static RemoteObject _strnombre = RemoteObject.createImmutable("");
public static RemoteObject _strapellidos = RemoteObject.createImmutable("");
public static RemoteObject _strteléfono = RemoteObject.createImmutable("");
public static RemoteObject _strcorreo = RemoteObject.createImmutable("");
public static RemoteObject _strclase = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"fx",_ref.getField(false, "_fx"),"strApellidos",_ref.getField(false, "_strapellidos"),"strClase",_ref.getField(false, "_strclase"),"strCorreo",_ref.getField(false, "_strcorreo"),"strIdEscolar",_ref.getField(false, "_stridescolar"),"strNombre",_ref.getField(false, "_strnombre"),"strTeléfono",_ref.getField(false, "_strteléfono")};
}
}