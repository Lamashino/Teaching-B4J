B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Public strTipo, strModelo, strCpu As String 
	Public fltPrecio As Float 
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	strTipo = ""
	strModelo = ""
	strCpu = ""
	fltPrecio = 0
End Sub

Public Sub nuevoOrdenador(tp As String , modelo As String , cpu As String , precio As Float)
	strTipo = tp
	strModelo = modelo
	strCpu = cpu 
	fltPrecio = precio
End Sub 


Public Sub mostrarOrdenador
	Log("Tipo 		: " & strTipo)
	Log("Modelo		: " & strModelo)
	Log("CPU		: " & strCpu)
	Log("Precio		: " & fltPrecio)
End Sub


public Sub cambiarCPU(cpu As String)
	strCpu = cpu
End Sub

public Sub cambiarPrecio(precio As Float)
	fltPrecio = precio
End Sub
