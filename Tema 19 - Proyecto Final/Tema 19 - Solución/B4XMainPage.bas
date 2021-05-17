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
	Public pgEstudiantes As B4XPageStudents
	Public pgLibros As B4XPageBooks
	Public pgPrestar As B4XPageBorrow
	Public pgDevolver As B4XPageReturn
	Public lstEstudiantes, lstLibros As List
	Public mapaEstudiantes As Map
	Public mapaLibros As Map 
	Type Libro(ID As String, Título As String, Escritor As String, _
			  Ano As String, Editorial As String, Estante As Int)
	Type Estudiante(ID As String, Nombre As String, Apellidos As String, _
				 Clase As String, Telefono As String, Prestado As Int)
	Public fichEstudiantes As String 
	Public fichLibros As String
End Sub


Public Sub Initialize
	fichEstudiantes  = File.ReadString(File.DirAssets, "students.txt")
	fichLibros  = File.ReadString(File.DirAssets, "books.txt")
End Sub


Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	pgEstudiantes.Initialize
	B4XPages.AddPage("pgEstudiantes", pgEstudiantes) 
	pgLibros.Initialize
	B4XPages.AddPage("pgLibros", pgLibros)
	pgPrestar.Initialize
	B4XPages.AddPage("pgPrestar", pgPrestar)
	pgDevolver.Initialize
	B4XPages.AddPage("pgDevolver", pgDevolver) 
	
	'Cargar los estudiantes a un mapa público
	lstEstudiantes = CargarEstudiantes
	mapaEstudiantes = lstEstudiantesAMapa(lstEstudiantes)
	'Cargar libros a un mapa público
	lstLibros = CargarLibros
	mapaLibros = lstLibrosToMap(lstLibros)
End Sub

' Cargar todo el fichero en una cadena y procesarla carácter a carácter para
' separar sus campos según el separador ";"
Private Sub CargarEstudiantes As List
	Private listaDevuelta As List 
	listaDevuelta.Initialize
	Private estud(5) As String
	
	Private i As Int = 0
	For j = 0 To fichEstudiantes.Length-1
		If fichEstudiantes.CharAt(j) <> ";" And fichEstudiantes.CharAt(j) <> CRLF Then
			estud(i) = estud(i) & fichEstudiantes.CharAt(j)
		Else if fichEstudiantes.CharAt(j) = ";" Then
			i = i + 1
		else if fichEstudiantes.CharAt(j) = CRLF Then
			i = 0 
			listaDevuelta.Add(estud)
			Dim estud(5) As String
		End If 
	Next 	
	Return listaDevuelta
End Sub

' Obtener una lista de Estudiantes y devolver un mapa que use como clave
' el ID del estudiantes y de valor todos los campos del tipo Estudiante
Private Sub lstEstudiantesAMapa(lst As List) As Map 
	Log("================" & lst.Size & " ==================")
	Private mEstudiante As Map
	mEstudiante.initialize
	For i = 0 To lst.Size-1
		Private estud(5) As String
		estud = lst.Get(i)
		Private est As Estudiante
		est.Initialize
		est.ID = estud(0)
		est.Nombre = estud(1)
		est.Apellidos = estud(2)
		est.Clase = estud(3)
		est.Telefono = estud(4)
		est.Prestado = 0
		mEstudiante.Put(estud(0), est)
	Next
	Return mEstudiante
End Sub


Public Sub MostrarMapaEstudiantes
	For Each clave As String In mapaEstudiantes.Keys
		Dim tp As Estudiante
		tp = mapaEstudiantes.Get(clave)
		Log($"${clave} ${tp.Nombre} ${tp.Apellidos} ${tp.Clase} ${tp.Telefono} ${tp.Prestado}"$ )
	Next
End Sub


Private Sub MostrarEstudiantes(lst As List)
	Log("================" & lst.Size & " ==================")
	For i = 0 To lst.Size-1
		Dim estud(5) As String
		estud = lst.Get(i)
		Log("--------------------------------------------------------")
		Log($"${estud(0)} ${estud(1)} ${estud(2)} ${estud(3)} ${estud(4)}"$)
	Next
	Log("====================================================")
End Sub

' Cargar todo el fichero en un cadena e ir carácter a carácter para separar los campos
' identificando el separador ";"
Private Sub CargarLibros As List
	Private listaDevuelta As List 
	listaDevuelta.Initialize
	Dim libro(6) As String
	
	Dim i As Int = 0
	For j = 0 To fichLibros.Length-1
		If fichLibros.CharAt(j) <> ";" And fichLibros.CharAt(j) <> CRLF Then
			libro(i) = libro(i) & fichLibros.CharAt(j)
		Else if fichLibros.CharAt(j) = ";" Then
			i = i + 1
		else if fichLibros.CharAt(j) = CRLF Then
			i = 0
			listaDevuelta.Add(libro)
			Dim libro(6) As String
		End If
	Next
	Return listaDevuelta
End Sub

' Obtener una lista de los libros y devolver un mapa usando como clave
' el ID del libro y como valor los campos del tipo Libro
Private Sub lstLibrosToMap(lst As List) As Map
	Private mLibro As Map
	mLibro.initialize
	For i = 0 To lst.Size-1
		Private arLibro(6) As String
		arLibro = lst.Get(i)
		Private  lib As Libro
		lib.Initialize
		lib.ID = arLibro(0)
		lib.Título = arLibro(1)
		lib.Escritor = arLibro(2)
		lib.Ano = arLibro(3)
		lib.Editorial = arLibro(4)
		lib.Estante = arLibro(5)
		mLibro.Put(arLibro(0), lib)
	Next
	Return mLibro
End Sub


Public Sub MostrarMapaLibros 
	For Each clave As String In mapaLibros.Keys
		Dim lib As Libro
		lib = mapaLibros.Get(clave)
		Log($"${clave} ${lib.Título} ${lib.Escritor} ${lib.Ano} ${lib.Editorial} ${lib.Estante}"$ )
	Next
End Sub


Private Sub MostrarLibros(lst As List)
	Log("================" & lst.Size & " ==================")
	For i = 0 To lst.Size-1
		Dim lib(6) As String
		lib = lst.Get(i)
		Log("--------------------------------------------------------")
		Log($"${lib(0)} ${lib(1)} ${lib(2)} ${lib(3)} ${lib(4)} ${lib(5)}"$)
	Next
	Log("====================================================")
End Sub


Private Sub btnEstudiantes_Click
	B4XPages.ShowPage("pgEstudiantes")
End Sub


Private Sub btnPrestar_Click
	B4XPages.ShowPage("pgPrestar")
End Sub


Private Sub btnLibros_Click
	B4XPages.ShowPage("pgLibros")
End Sub


Private Sub btnDevolver_Click
	B4XPages.ShowPage("pgDevolver")
End Sub
