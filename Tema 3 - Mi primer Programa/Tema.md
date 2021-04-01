**Programando con B4X**

Tema 3 -- Mi primer Programa

Version 1.0, marzo 2021

Autor original: [Prokopis Leon](https://github.com/pliroforikos)

Traducido al español por [José Miguel
López](https://github.com/Lamashino)

![](media\media\image1.png){width="0.9166666666666666in"
height="0.3229166666666667in"}

# Tema 3 -- Mi primer Programa

![](media\media\image8.png){width="0.8263888888888888in"
height="0.46111111111111114in"}

## 

## ![](media\media\image10.png){width="0.4088834208223972in" height="0.3552723097112861in"}Hola Mundo

Haz un programa que dibuje una línea recta con la ayuda de la tortuga en
la pantalla de la computadora.

Instrucciones recomendadas para el profesor

El objetivo del ejercicio anterior es familiarizar a los estudiantes en
la creación de un proyecto con B4J y tener el primer contacto con un
entorno de programación. Las siguientes instrucciones no limitan en modo
alguno al profesor a adaptar su curso a las condiciones educativas
particulares.![](media\media\image11.png){width="4.1305555555555555in"
height="0.6763888888888889in"}

+-------------+--------------------------+--------------------------+
| **Función** | **Descripción**          |                          |
+=============+==========================+==========================+
| **1**       | Cómo crear tu primer     | *Menú Archivo -\> Nuevo  |
|             | proyecto con B4J         | -\> B4Xturtle*           |
|             |                          |                          |
|             |                          | *Carpeta del proyecto*   |
|             |                          |                          |
|             |                          | *Nombre del proyecto*    |
|             |                          |                          |
|             |                          | Explique a los           |
|             |                          | estudiantes la           |
|             |                          | importancia de los       |
|             |                          | nombres correctos en     |
|             |                          | cada proyecto que crean  |
|             |                          | y el valor del           |
|             |                          | almacenamiento correcto  |
|             |                          | en carpetas de una       |
|             |                          | manera estructurada      |
+-------------+--------------------------+--------------------------+
| **2**       | Ejecutar un Proyecto     | *Menú Proyecto -\>       |
|             |                          | Compilar y Ejecutar*     |
|             |                          |                          |
|             |                          | Explique qué significa   |
|             |                          | compilar y cómo          |
|             |                          | reconocer errores de     |
|             |                          | sintaxis en el registro. |
|             |                          | No es necesario que      |
|             |                          | proporcione mucha        |
|             |                          | información sobre la     |
|             |                          | compilación. Solo lo     |
|             |                          | básico para ejecutar un  |
|             |                          | proyecto.                |
+-------------+--------------------------+--------------------------+
| **3**       | \#Region Project         | Cambie los valores en    |
|             | Attributes               | *MainFormWidth* y        |
|             |                          | *MainFormHeight* para    |
|             |                          | hacer una aplicación de  |
|             |                          | diferente tamaño.        |
+-------------+--------------------------+--------------------------+
| **4**       | Sub Turtle_Start         | *¿Qué significa Sub?*    |
|             |                          |                          |
|             |                          | Una pequeña cantidad de  |
|             |                          | código que está          |
|             |                          | realizando una           |
|             |                          | determinada actividad.   |
+-------------+--------------------------+--------------------------+
| **5**       | Métodos Turtle           | ¿Qué es Turtle?          |
|             |                          |                          |
|             |                          | ¿Qué hace .MoveForward?  |
|             |                          |                          |
|             |                          | ¿Cómo podemos encontrar  |
|             |                          | más comandos?            |
|             |                          |                          |
|             |                          | (Dígales a los           |
|             |                          | estudiantes que escriban |
|             |                          | "Turtle". Para ver la    |
|             |                          | lista de métodos.        |
+-------------+--------------------------+--------------------------+
| **6**       | Errores                  | Cómo identificar un      |
|             |                          | error en la pantalla de  |
|             |                          | registro (Log)           |
+-------------+--------------------------+--------------------------+

## Ejercicios 

1.  Usa la tortuga y los métodos ***MoveForward**, **TurnLeft**,
    **TurnRight*** para dibujar un cuadrado del tamaño que quieras.

2.  Usando los comandos anteriores y ***PenUp**, **PenDown*** y
    ***Move*** dibuja 3 cuadrados como la imagen de abajo.

3.  Usando los comandos anteriores, haz el dibujo que quieras. Dale un
    nombre a tu dibujo y explica cómo lo hiciste.
