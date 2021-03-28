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
	strTitle = ""
	strWriter = ""
	strAño = ""
	strEditorial = ""
End Sub

Public Sub insertBook(str1, str2, str3, str4 As String)
	strTitle = str1
	strWriter = str2
	strAño = str3
	strEditorial = str4
End Sub

Public Sub logBook
	Log("Title : " & strTitle)
	Log("Writer: " & strWriter)
	Log("Year  : " & strAño)
	Log("Publisher: " & strEditorial)
End Sub

Public Sub changeBook(str1, str2, str3, str4 As String)
	strTitle = str1
	strWriter = str2
	strYear = str3
	strEditorial = str4
End Sub

