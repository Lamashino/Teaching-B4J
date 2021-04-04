B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Public strNombre As String
	Public strPantalla As String
	Public intCapacidad As Int
	Public fltRAM As Int 
	Public strCPU As String
	Public intCantidad As Int 
	Public strOS As String
	Public fltPrecio As Float 
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	 strNombre = ""
	 strPantalla  = ""
	 intCapacidad  = 0
	 fltRAM  = 0
	 strCPU = "" 
	 intCantidad = 0
	 strOS = ""
	 fltPrecio = 0
End Sub


Public Sub nuevoMovil(nombre As String, pantalla As String, capacidad As Int, ram As Int, _
					cpu As String, cantidad As Int, OS As String, precio As Float) 
	strNombre = nombre
	strPantalla  = pantalla
	intCapacidad  = capacidad
	fltRAM  = ram
	strCPU = cpu
	intCantidad = cantidad
	strOS = OS
	fltPrecio = precio
End Sub 


Public Sub venderMovil(cantidad As Int) 
	intCantidad = intCantidad - cantidad
End Sub
