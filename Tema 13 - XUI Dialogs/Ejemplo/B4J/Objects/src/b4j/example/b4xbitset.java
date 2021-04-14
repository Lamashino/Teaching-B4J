package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xbitset extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4xbitset", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4xbitset.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public int[] _data = null;
public int _msize = 0;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.b4xpages _b4xpages = null;
public b4j.example.b4xcollections _b4xcollections = null;
public b4j.example.xuiviewsutils _xuiviewsutils = null;
public String  _class_globals(b4j.example.b4xbitset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbitset";
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="Private data() As Int";
_data = new int[(int) (0)];
;
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="Private mSize As Int";
_msize = 0;
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4j.example.b4xbitset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbitset";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="Dim data(Bit.ShiftRight(mSize, 5) + 1) As Int";
_data = new int[(int) (__c.Bit.ShiftRight(__ref._msize /*int*/ ,(int) (5))+1)];
;
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="End Sub";
return "";
}
public boolean  _get(b4j.example.b4xbitset __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbitset";
if (Debug.shouldDelegate(ba, "get", true))
	 {return ((Boolean) Debug.delegate(ba, "get", new Object[] {_index}));}
int _dindex = 0;
int _offset = 0;
int _blockvalue = 0;
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Public Sub Get(Index As Int) As Boolean";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Dim dindex As Int = Bit.ShiftRight(Index, 5)";
_dindex = __c.Bit.ShiftRight(_index,(int) (5));
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Dim offset As Int = Bit.And(0x0000001f, Index)";
_offset = __c.Bit.And((int) (0x0000001f),_index);
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="Dim BlockValue As Int = data(dindex)";
_blockvalue = __ref._data /*int[]*/ [_dindex];
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="Return Bit.And(BlockValue, Bit.ShiftLeft(1, offse";
if (true) return __c.Bit.And(_blockvalue,__c.Bit.ShiftLeft((int) (1),_offset))!=0;
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="End Sub";
return false;
}
public int  _getsize(b4j.example.b4xbitset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbitset";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Return mSize";
if (true) return __ref._msize /*int*/ ;
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4j.example.b4xbitset __ref,anywheresoftware.b4a.BA _ba,int _size) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xbitset";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_size}));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub Initialize (Size As Int)";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="mSize = Size";
__ref._msize /*int*/  = _size;
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Clear";
__ref._clear /*String*/ (null);
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="End Sub";
return "";
}
public String  _set(b4j.example.b4xbitset __ref,int _index,boolean _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbitset";
if (Debug.shouldDelegate(ba, "set", true))
	 {return ((String) Debug.delegate(ba, "set", new Object[] {_index,_value}));}
int _dindex = 0;
int _offset = 0;
int _blockvalue = 0;
int _newblockvalue = 0;
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub Set(Index As Int, Value As Boolean)";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Dim dindex As Int = Bit.ShiftRight(Index, 5)";
_dindex = __c.Bit.ShiftRight(_index,(int) (5));
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="Dim offset As Int = Bit.And(0x0000001f, Index)";
_offset = __c.Bit.And((int) (0x0000001f),_index);
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="Dim BlockValue As Int = data(dindex)";
_blockvalue = __ref._data /*int[]*/ [_dindex];
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="Dim NewBlockValue As Int";
_newblockvalue = 0;
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="If Value Then";
if (_value) { 
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="NewBlockValue = Bit.Or(BlockValue, Bit.ShiftLeft";
_newblockvalue = __c.Bit.Or(_blockvalue,__c.Bit.ShiftLeft((int) (1),_offset));
 }else {
RDebugUtils.currentLine=2293772;
 //BA.debugLineNum = 2293772;BA.debugLine="NewBlockValue = Bit.And(BlockValue, Bit.Not(Bit.";
_newblockvalue = __c.Bit.And(_blockvalue,__c.Bit.Not(__c.Bit.ShiftLeft((int) (1),_offset)));
 };
RDebugUtils.currentLine=2293777;
 //BA.debugLineNum = 2293777;BA.debugLine="data(dindex) = NewBlockValue";
__ref._data /*int[]*/ [_dindex] = _newblockvalue;
RDebugUtils.currentLine=2293779;
 //BA.debugLineNum = 2293779;BA.debugLine="End Sub";
return "";
}
}