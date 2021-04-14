B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.9
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private strEscritor, strTitulo, strAno, strEditorial As String
End Sub

'Inicializa el objeto. Puedes añadir parámetros a este método si lo necesitas
Public Sub Initialize
	strTitulo = ""
	strEscritor = ""
	strAno = ""
	strEditorial = ""
End Sub

Public Sub insertarLibro(str1 As String, str2 As String, str3 As String, str4 As String)
	strTitulo = str1
	strEscritor = str2
	strAno = str3
	strEditorial = str4
End Sub

Public Sub mostrarLibro
	Log("Título    : " & strTitulo)
	Log("Escritor  : " & strEscritor)
	Log("Año       : " & strAno)
	Log("Editorial : " & strEditorial)
End Sub

Public Sub cambiarLibro(str1 As String, str2 As String, str3 As String, str4 As String)
	strTitulo = str1
	strEscritor = str2
	strAno = str3
	strEditorial = str4
End Sub


Public Sub getEscritor() As String
	Return strEscritor
End Sub

Public Sub setEscritor(e As String)
	strEscritor = e
End Sub

Public Sub getTitulo() As String
	Return strTitulo
End Sub

Public Sub setTitulo(t As String)
	strTitulo = t
End Sub

Public Sub getAno() As String
	Return strAno
End Sub

Public Sub setAno(y As String)
	strAno = y
End Sub

Public Sub getEditorial() As String
	Return strEditorial
End Sub

Public Sub setEditorial(e As String)
	strEditorial = e
End Sub


