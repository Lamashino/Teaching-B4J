
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class clscurso {
    public static RemoteObject myClass;
	public clscurso() {
	}
    public static PCBA staticBA = new PCBA(null, clscurso.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _strtema = RemoteObject.createImmutable("");
public static RemoteObject _strclase = RemoteObject.createImmutable("");
public static RemoteObject _strhoras = RemoteObject.createImmutable("");
public static RemoteObject _strprofesor = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"fx",_ref.getField(false, "_fx"),"strClase",_ref.getField(false, "_strclase"),"strHoras",_ref.getField(false, "_strhoras"),"strProfesor",_ref.getField(false, "_strprofesor"),"strTema",_ref.getField(false, "_strtema")};
}
}