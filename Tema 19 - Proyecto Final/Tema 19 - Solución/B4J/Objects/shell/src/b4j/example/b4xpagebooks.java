
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xpagebooks {
    public static RemoteObject myClass;
	public b4xpagebooks() {
	}
    public static PCBA staticBA = new PCBA(null, b4xpagebooks.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _clvlibros = RemoteObject.declareNull("b4j.example.customlistview");
public static RemoteObject _diálogo = RemoteObject.declareNull("b4j.example.b4xdialog");
public static RemoteObject _txtid = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
public static RemoteObject _txteditorial = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
public static RemoteObject _txtestante = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
public static RemoteObject _txttitulo = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
public static RemoteObject _txtescritor = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
public static RemoteObject _txtano = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
public static RemoteObject _libroelegido = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"clvLibros",_ref.getField(false, "_clvlibros"),"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"diálogo",_ref.getField(false, "_diálogo"),"libroElegido",_ref.getField(false, "_libroelegido"),"Root",_ref.getField(false, "_root"),"txtAno",_ref.getField(false, "_txtano"),"txtEditorial",_ref.getField(false, "_txteditorial"),"txtEscritor",_ref.getField(false, "_txtescritor"),"txtEstante",_ref.getField(false, "_txtestante"),"txtID",_ref.getField(false, "_txtid"),"txtTitulo",_ref.getField(false, "_txttitulo"),"xui",_ref.getField(false, "_xui")};
}
}