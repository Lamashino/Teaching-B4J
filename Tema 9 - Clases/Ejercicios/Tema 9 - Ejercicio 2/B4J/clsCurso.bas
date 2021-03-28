B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
'	a.	Tema
'	b.	Clase
'	c.	Horas
'	d.	Profesor
	Public strTema, strClase, strHoras, strProfesor As String 
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	strTema = ""
	strClase = ""
	strHoras = ""
	strProfesor = ""
End Sub

'New Lesson
Public Sub nuevoCurso(nombre As String, clase As String, horas As String, prof As String)
	strTema = nombre
	strClase = clase
	strHoras = horas
	strProfesor = prof
End Sub


'Change hours
Public Sub cambiarHoras(horas As String)
	strHoras = horas
End Sub

'Change Professor
Public Sub cambiarProfesor(prof As String)
	strProfesor = prof
End Sub

'Show Lesson
Public Sub mostrarCurso
	Log ( $"
	Tema		: ${strTema}
	Clase		: ${strClase}
	Horas		: ${strHoras}
	Profesor	: ${strProfesor}
	"$)
End Sub
