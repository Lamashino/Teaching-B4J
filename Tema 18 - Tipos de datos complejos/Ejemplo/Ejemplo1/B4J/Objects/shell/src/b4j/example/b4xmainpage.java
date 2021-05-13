
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
public static RemoteObject _estudiante1 = RemoteObject.declareNull("b4j.example.b4xmainpage._estudiante");
public static RemoteObject _estudiante2 = RemoteObject.declareNull("b4j.example.b4xmainpage._estudiante");
public static RemoteObject _listaestudiantes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _mapstudents = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _kvsfile = RemoteObject.declareNull("b4j.example.keyvaluestore");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Estudiante1",_ref.getField(false, "_estudiante1"),"Estudiante2",_ref.getField(false, "_estudiante2"),"kvsFile",_ref.getField(false, "_kvsfile"),"listaEstudiantes",_ref.getField(false, "_listaestudiantes"),"mapStudents",_ref.getField(false, "_mapstudents"),"Root",_ref.getField(false, "_root"),"xui",_ref.getField(false, "_xui")};
}
}