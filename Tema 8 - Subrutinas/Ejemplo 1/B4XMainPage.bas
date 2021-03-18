B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private intSum As Int
End Sub

Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	Private intA, intB As Int 
	intA = 10
	intB = 30
		
	MuestraSuma1(intA, intB)
	Log(intSum)
	
	Log(Suma(intA, intB))
End Sub

Private Sub MuestraSuma1(a As Int, b As Int)
	intSum = a + b
	Log(intSum)
End Sub

private Sub Suma(a As Int, b As Int) As Int
	Return(a+b)
End Sub