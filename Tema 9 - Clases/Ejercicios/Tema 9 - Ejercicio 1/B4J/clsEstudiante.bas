B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
'	Registry Number
'	Name
'	Surname
'	Phone
'	Email
'	Class
	Private strIdEscolar, strNombre, strApellidos, strTeléfono, strCorreo, strClase As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	strIdEscolar = ""
	strNombre = ""
	strApellidos = ""
	strTeléfono = ""
	strCorreo = ""
	strClase = ""
End Sub


'	Nuevo Estudiante 
Public Sub nuevoEstudiante(idEsc As String, Nombre As String, Apellidos As String, Teléfono As String, correo As String, clase As String)
	strIdEscolar = idEsc
	strNombre = Nombre
	strApellidos = Apellidos
	strTeléfono = Teléfono
	strCorreo = correo
	strClase = clase
End Sub


'	Mostrar inforamción del estudiante
Public Sub mostrarEstudiante				' Excplicar la cadena $" "$
	Log ($" 								
	Id. Escolar : ${strIdEscolar} 
	Nombre		: ${strNombre} 
	Apellidos	: ${strApellidos}
	Teléfono	: ${strTeléfono}
	Correo elec.: ${strCorreo}
	Clase		: ${strClase}
	"$)
End Sub


'	Cambiar Clase
Public Sub cambiarClase(class As String)
	strClase = class
End Sub


'	Cambiar Teléfono (las tildes no se pueden usar en los nombres de los métodos)
Public Sub cambiarTelefono(phone As String)  
	strTeléfono = phone
End Sub

