B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Public strEscritor, strTítulo, strAño, strEditorial As String
End Sub

'Inicializa el objeto. Puedes añadir parámetros a este método si lo necesitas
Public Sub Initialize
	strTítulo = ""
	strEscritor = ""
	strAño = ""
	strEditorial = ""
End Sub

Public Sub insertarLibro(str1, str2, str3, str4 As String)
	strTítulo = str1
	strEscritor = str2
	strAño = str3
	strEditorial = str4
End Sub

Public Sub mostrarLibro
	Log("Título    : " & strTítulo)
	Log("Escritor  : " & strEscritor)
	Log("Año       : " & strAño)
	Log("Editorial : " & strEditorial)
End Sub

Public Sub cambiarLibro(str1, str2, str3, str4 As String)
	strTítulo = str1
	strEscritor = str2
	strAño = str3
	strEditorial = str4
End Sub

