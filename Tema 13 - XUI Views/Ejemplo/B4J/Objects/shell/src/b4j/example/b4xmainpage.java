
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
public static RemoteObject _scrlblodys = RemoteObject.declareNull("b4j.example.scrollinglabel");
public static RemoteObject _roundslider1 = RemoteObject.declareNull("b4j.example.roundslider");
public static RemoteObject _anotherprogressbar1 = RemoteObject.declareNull("b4j.example.anotherprogressbar");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _b4ximageview1 = RemoteObject.declareNull("b4j.example.b4ximageview");
public static RemoteObject _dialog = RemoteObject.declareNull("b4j.example.b4xdialog");
public static RemoteObject _txtaddress = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
public static RemoteObject _txtname = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
public static RemoteObject _txtsurname = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
public static RemoteObject _datetemplate = RemoteObject.declareNull("b4j.example.b4xdatetemplate");
public static RemoteObject _btndate = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _colortemplate = RemoteObject.declareNull("b4j.example.b4xcolortemplate");
public static RemoteObject _longtexttemplate = RemoteObject.declareNull("b4j.example.b4xlongtexttemplate");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.b4xpages _b4xpages = null;
public static b4j.example.b4xcollections _b4xcollections = null;
public static b4j.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"AnotherProgressBar1",_ref.getField(false, "_anotherprogressbar1"),"B4XImageView1",_ref.getField(false, "_b4ximageview1"),"btnDate",_ref.getField(false, "_btndate"),"ColorTemplate",_ref.getField(false, "_colortemplate"),"CSSUtils",_ref.getField(false, "_cssutils"),"DateTemplate",_ref.getField(false, "_datetemplate"),"DateUtils",_ref.getField(false, "_dateutils"),"dialog",_ref.getField(false, "_dialog"),"Label1",_ref.getField(false, "_label1"),"LongTextTemplate",_ref.getField(false, "_longtexttemplate"),"Root",_ref.getField(false, "_root"),"RoundSlider1",_ref.getField(false, "_roundslider1"),"scrLblOdys",_ref.getField(false, "_scrlblodys"),"txtAddress",_ref.getField(false, "_txtaddress"),"txtName",_ref.getField(false, "_txtname"),"txtSurname",_ref.getField(false, "_txtsurname"),"xui",_ref.getField(false, "_xui")};
}
}