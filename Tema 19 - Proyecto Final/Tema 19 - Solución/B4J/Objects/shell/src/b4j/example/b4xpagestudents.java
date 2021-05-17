
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xpagestudents {
    public static RemoteObject myClass;
	public b4xpagestudents() {
	}
    public static PCBA staticBA = new PCBA(null, b4xpagestudents.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _clvestudiantes = RemoteObject.declareNull("b4j.example.customlistview");
public static RemoteObject _diálogo = RemoteObject.declareNull("b4j.example.b4xdialog");
public static RemoteObject _txtclase = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
public static RemoteObject _txtnombre = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
public static RemoteObject _txtid = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
public static RemoteObject _txtapellidos = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
public static RemoteObject _txttelefono = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
public static RemoteObject _estudianteelegido = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"clvEstudiantes",_ref.getField(false, "_clvestudiantes"),"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"diálogo",_ref.getField(false, "_diálogo"),"estudianteElegido",_ref.getField(false, "_estudianteelegido"),"Root",_ref.getField(false, "_root"),"txtApellidos",_ref.getField(false, "_txtapellidos"),"txtClase",_ref.getField(false, "_txtclase"),"txtID",_ref.getField(false, "_txtid"),"txtNombre",_ref.getField(false, "_txtnombre"),"txtTelefono",_ref.getField(false, "_txttelefono"),"xui",_ref.getField(false, "_xui")};
}
}