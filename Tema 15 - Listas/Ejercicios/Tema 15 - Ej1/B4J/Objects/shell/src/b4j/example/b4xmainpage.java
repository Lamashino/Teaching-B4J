
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
public static RemoteObject _lblcapital = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _txtcountry = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _países = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _txtinscap = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
public static RemoteObject _txtinscountry = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
public static RemoteObject _dialog = RemoteObject.declareNull("b4j.example.b4xdialog");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"dialog",_ref.getField(false, "_dialog"),"lblCapital",_ref.getField(false, "_lblcapital"),"Países",_ref.getField(false, "_países"),"Root",_ref.getField(false, "_root"),"txtCountry",_ref.getField(false, "_txtcountry"),"txtInsCap",_ref.getField(false, "_txtinscap"),"txtInsCountry",_ref.getField(false, "_txtinscountry"),"xui",_ref.getField(false, "_xui")};
}
}