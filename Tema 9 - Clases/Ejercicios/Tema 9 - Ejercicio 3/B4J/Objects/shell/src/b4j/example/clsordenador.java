
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class clsordenador {
    public static RemoteObject myClass;
	public clsordenador() {
	}
    public static PCBA staticBA = new PCBA(null, clsordenador.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _strtipo = RemoteObject.createImmutable("");
public static RemoteObject _strmodelo = RemoteObject.createImmutable("");
public static RemoteObject _strcpu = RemoteObject.createImmutable("");
public static RemoteObject _fltprecio = RemoteObject.createImmutable(0f);
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"fltPrecio",_ref.getField(false, "_fltprecio"),"fx",_ref.getField(false, "_fx"),"strCpu",_ref.getField(false, "_strcpu"),"strModelo",_ref.getField(false, "_strmodelo"),"strTipo",_ref.getField(false, "_strtipo")};
}
}