
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
public static RemoteObject _pgestudiantes = RemoteObject.declareNull("b4j.example.b4xpagestudents");
public static RemoteObject _pglibros = RemoteObject.declareNull("b4j.example.b4xpagebooks");
public static RemoteObject _pgprestar = RemoteObject.declareNull("b4j.example.b4xpageborrow");
public static RemoteObject _pgdevolver = RemoteObject.declareNull("b4j.example.b4xpagereturn");
public static RemoteObject _lstestudiantes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lstlibros = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _mapaestudiantes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _mapalibros = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _fichestudiantes = RemoteObject.createImmutable("");
public static RemoteObject _fichlibros = RemoteObject.createImmutable("");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"fichEstudiantes",_ref.getField(false, "_fichestudiantes"),"fichLibros",_ref.getField(false, "_fichlibros"),"lstEstudiantes",_ref.getField(false, "_lstestudiantes"),"lstLibros",_ref.getField(false, "_lstlibros"),"mapaEstudiantes",_ref.getField(false, "_mapaestudiantes"),"mapaLibros",_ref.getField(false, "_mapalibros"),"pgDevolver",_ref.getField(false, "_pgdevolver"),"pgEstudiantes",_ref.getField(false, "_pgestudiantes"),"pgLibros",_ref.getField(false, "_pglibros"),"pgPrestar",_ref.getField(false, "_pgprestar"),"Root",_ref.getField(false, "_root"),"xui",_ref.getField(false, "_xui")};
}
}