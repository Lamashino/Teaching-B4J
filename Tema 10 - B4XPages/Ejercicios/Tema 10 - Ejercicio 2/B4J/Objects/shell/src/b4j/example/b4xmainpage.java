
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
public static RemoteObject _pg1 = RemoteObject.declareNull("b4j.example.b4xpageprimergrado");
public static RemoteObject _pg2 = RemoteObject.declareNull("b4j.example.b4xpagesegundogrado");
public static RemoteObject _pg3 = RemoteObject.declareNull("b4j.example.b4xpagetriangulo");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"pg1",_ref.getField(false, "_pg1"),"pg2",_ref.getField(false, "_pg2"),"pg3",_ref.getField(false, "_pg3"),"Root",_ref.getField(false, "_root"),"xui",_ref.getField(false, "_xui")};
}
}