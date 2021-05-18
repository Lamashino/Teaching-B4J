
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xmainpage {
    public static RemoteObject myClass;
	public b4xmainpage() {
	}
    public static PCBA staticBA = new PCBA(null, b4xmainpage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _lblnumero = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _fltnumero1 = RemoteObject.createImmutable(0f);
public static RemoteObject _fltnumero2 = RemoteObject.createImmutable(0f);
public static RemoteObject _operacion = RemoteObject.createImmutable("");
public static RemoteObject _hecho = RemoteObject.createImmutable(false);
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"fltNumero1",_ref.getField(false, "_fltnumero1"),"fltNumero2",_ref.getField(false, "_fltnumero2"),"hecho",_ref.getField(false, "_hecho"),"lblNumero",_ref.getField(false, "_lblnumero"),"operacion",_ref.getField(false, "_operacion"),"Root",_ref.getField(false, "_root"),"xui",_ref.getField(false, "_xui")};
}
}