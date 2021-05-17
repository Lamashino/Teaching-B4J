
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xpagereturn {
    public static RemoteObject myClass;
	public b4xpagereturn() {
	}
    public static PCBA staticBA = new PCBA(null, b4xpagereturn.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _btndevolver = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _cmbestudiante = RemoteObject.declareNull("b4j.example.b4xcombobox");
public static RemoteObject _clvlibros = RemoteObject.declareNull("b4j.example.customlistview");
public static RemoteObject _libroelegido = RemoteObject.createImmutable(0);
public static RemoteObject _idestudianteelegido = RemoteObject.createImmutable("");
public static RemoteObject _idlibroelegido = RemoteObject.createImmutable("");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"btnDevolver",_ref.getField(false, "_btndevolver"),"clvLibros",_ref.getField(false, "_clvlibros"),"cmbEstudiante",_ref.getField(false, "_cmbestudiante"),"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"idEstudianteElegido",_ref.getField(false, "_idestudianteelegido"),"idLibroElegido",_ref.getField(false, "_idlibroelegido"),"libroElegido",_ref.getField(false, "_libroelegido"),"Root",_ref.getField(false, "_root"),"xui",_ref.getField(false, "_xui")};
}
}