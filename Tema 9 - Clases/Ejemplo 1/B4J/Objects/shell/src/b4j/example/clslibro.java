
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class clslibro {
    public static RemoteObject myClass;
	public clslibro() {
	}
    public static PCBA staticBA = new PCBA(null, clslibro.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _strescritor = RemoteObject.createImmutable("");
public static RemoteObject _strtitulo = RemoteObject.createImmutable("");
public static RemoteObject _strano = RemoteObject.createImmutable("");
public static RemoteObject _streditorial = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"fx",_ref.getField(false, "_fx"),"strAno",_ref.getField(false, "_strano"),"strEditorial",_ref.getField(false, "_streditorial"),"strEscritor",_ref.getField(false, "_strescritor"),"strTitulo",_ref.getField(false, "_strtitulo")};
}
}