# PROTOCOLO INDIVIDUAL
Formato de entrega:
Única y exclusivamente entregar por en enlace de la actividad en SIMA-PESAD dentro de la fecha estipuladas
Documento PDF con el contenido del desarrollo y explicación de la actividad:
Presentación
Introducción
Objetivos
Justificación
Desarrollo
Enlace del repositorio público de GitHub
Enlace del video de sustentación explicando el código y probando la ejecución del programa, el vídeo debe mostrar en todo momento el rostro y voz del alumno que entrega la actividad

Investigar, estudiar, aprender y practicar los conceptos fundamentales sobre arreglos y matrices
A continuación usted debe dar respuesta a los siguientes puntos, desarrollando los ejemplos en lenguaje de programación Java
Creando un proyecto Java (Maven, Gradle o ANT) usando el IDE de su preferencia (Netbeans, Eclipse, IntelliJIDEA, VSC, etc) y usar GIT para crear un repositorio local y usar comando para ir haciendo:
git switch main
git pull
git switch -c rama-ejemplo1
git status
git add .
git commit -m “feat(ejemplo1): mensaje”
git push origin rama-ejemplo1
git switch main
git pull
git merge rama-ejemplo1
git push origin main

Se penalizarà con puntos negativos a los proyectos que se encuentren enviado a GITHUB de la siguiente manera:
Repositorios que no tengan commit por ejemplo
Repositorios con código subido por upload, con archivo .comprimido
Repositorios privados
1. Arreglos (Arrays)
   Fundamentos:
   Concepto de arreglo.
   Tipos de datos que puede almacenar.
   Diferencia entre tamaño fijo y dinámico según el lenguaje.
   Indexación y posiciones.
   Operaciones básicas: declaración, inicialización, recorrido, modificación.


Actividades:
Declaración y creación de un arreglo
Declarar un arreglo de 10 enteros en cada lenguaje dado
Inicializarlo con valores aleatorios.


Recorrido e mostrar
Recorrerlo usando bucle for clásico.
Recorrerlo usando un for-each o equivalente.


Modificación
Cambiar todos los valores impares por cero.
Multiplicar todos los valores por su índice.


Búsqueda
Implementar búsqueda lineal para encontrar un valor en el arreglo.


Comparativa
Los estudiantes explicarán la sintaxis y diferencias entre los lenguajes (estáticos vs dinámicos, tipado fuerte vs débil, etc.).



2. Matrices (Arrays bidimensionales)
   Fundamentos:
   Concepto de matriz.
   Representación en memoria (fila-columna).
   Declaración e inicialización.
   Recorridos por filas y columnas.
   Matrices irregulares


Actividades:
Declaración e inicialización
Crear una matriz 3x3 de enteros en lenguaje de programación (Java)
Inicializar con valores del 1 al 9.


Recorrido
Imprimir la matriz en forma de tabla.
Recorrerla por columnas.


Operaciones
Sumar todos los elementos.
Intercambiar la primera fila con la última.



De acuerdo a la lista publicada en la actividad, usted debe desarrollar un programa Java para el ejercicio que le fue asignado (al azar) aplicando Arreglos y/o Matrices.

1. Analizador de Calificaciones
   Leer N calificaciones (0–100), calcular:
   Promedio, mediana, moda.
   Porcentaje de aprobados y reprobados.


Mostrar un histograma de frecuencias usando texto.



2. Compresor Simple de Texto
   Dado un string, almacenar cada letra en un arreglo.
   Comprimirlo usando conteo de repeticiones (ej. aaabb → a3b2).
   También permitir descomprimir.



3. Juego del Ahorcado
   Usar un arreglo de caracteres para representar la palabra oculta.
   Controlar letras adivinadas y errores.
   Registrar puntajes de varios jugadores en un arreglo.



4. Sistema de Inventario con Historial
   Usar un arreglo de structs/objetos para productos.
   Cada producto tiene un arreglo interno con registro de entradas y salidas.
   Reportar existencias y movimientos.



5. Agenda Telefónica con Búsqueda Avanzada
   Guardar nombre, teléfono y correo en arreglos paralelos.
   Permitir búsquedas parciales (por prefijo del nombre o coincidencia parcial de correo).
   Exportar la lista a un archivo de texto.



6. Analizador de Archivos Numéricos
   Leer números desde un archivo y almacenarlos en un arreglo.
   Calcular estadísticas (mínimo, máximo, promedio).
   Ordenarlos y guardar el resultado en otro archivo.



7. Simulador de Ventas
   Un arreglo de productos con precios.
   Otro arreglo con cantidades vendidas.
   Calcular total por producto, total general y producto más vendido.



8. Generador de Contraseñas
   Usar arreglos de caracteres (mayúsculas, minúsculas, dígitos, símbolos).
   Generar contraseñas aleatorias con longitud variable.
   Validar que tengan al menos un carácter de cada tipo.



9. Conversor de Base Numérica
   Leer un número en base 10.
   Convertirlo a base 2, 8 y 16 almacenando los dígitos en un arreglo.
   Mostrar el resultado en formato string.



10. Analizador de Texto
    Leer un párrafo.
    Guardar palabras en un arreglo.
    Contar repeticiones y mostrar las 5 más frecuentes.
    Ignorar mayúsculas/minúsculas y signos de puntuación.



11. Sudoku Validator
    Dada una matriz 9x9 almacenada en un arreglo bidimensional:
    Verificar que cumpla las reglas de Sudoku.
    Detectar y marcar errores.



12. Simulador de Torneo
    Arreglo de equipos con puntajes.
    Simular enfrentamientos aleatorios.
    Actualizar resultados y mostrar tabla final de posiciones.



13. Historial de Temperaturas
    Guardar temperaturas diarias de un mes.
    Calcular promedio, días más fríos y más cálidos.
    Graficar (en texto) las temperaturas diarias como barras.



14. Analizador de Secuencias Numéricas
    Dado un arreglo de enteros:
    Detectar si está ordenado ascendente, descendente o desordenado.
    Detectar si forma una progresión aritmética o geométrica.



15. Búsqueda de Rutas en una Matriz
    Representar un mapa como matriz con celdas libres y obstáculos.
    Buscar un camino válido del inicio al final (DFS o BFS).
    Mostrar la ruta encontrada.



16. Juego de Conecta 4
    Matriz para el tablero.
    Jugadores alternan turnos.
    Verificar ganador al insertar fichas.



17. Simulador de Cajero Automático
    Arreglo de denominaciones y cantidades disponibles.
    Permitir depósitos, retiros y consulta de saldo.
    Validar disponibilidad de billetes.



18. Mezclador de Canciones
    Arreglo de canciones (título, artista, duración).
    Crear playlists aleatorias sin repetir canciones.
    Filtrar por duración o artista.



19. Analizador de Datos Climáticos
    Leer datos históricos (temperatura, humedad) de un arreglo bidimensional.
    Calcular promedio mensual y anual.
    Detectar anomalías (valores fuera de rango esperado).



20. Editor de Imágenes en Escala de Grises (Básico)
    Representar una imagen como matriz (valores 0–255).
    Implementar:
    Inversión de colores.
    Aclarar/oscurecer.
    Detección de bordes simple.

21. Control de Turnos en una Peluquería
    Arreglo de horarios disponibles.
    Registrar citas ocupadas.
    Mostrar horarios libres y ocupados.

22. Sistema de Parqueadero
    Arreglo que represente espacios (libre/ocupado).
    Registrar entrada y salida de vehículos.
    Contar espacios disponibles.

23. Simulador de Semáforo Inteligente
    Arreglo con estados (rojo, amarillo, verde).
    Cambiar estados automáticamente.
    Mostrar secuencia de funcionamiento.

24. Registro de Pedidos en una Cafetería
    Arreglo de pedidos del día.
    Contar cuántos pedidos hay por tipo.
    Mostrar el más solicitado.

25. Control de Uso de una Sala de Computo
    Arreglo de computadores (disponible/ocupado).
    Registrar uso por usuario.
    Mostrar equipos disponibles.

26. Sistema de Asignación de Asientos en Cine
    Matriz que represente la sala.
    Reservar y liberar asientos.
    Mostrar mapa actualizado.

27. Registro de Llamadas Telefónicas
    Arreglo con duración de llamadas.
    Calcular total de minutos usados.
    Identificar la llamada más larga.

28. Control de Entregas de Paquetes
    Arreglo de paquetes (entregado/no entregado).
    Marcar estado de entrega.
    Mostrar pendientes.

29. Sistema de Turnos en un Banco
    Arreglo de turnos generados.
    Llamar al siguiente turno.
    Mostrar turno actual y siguientes.

30. Registro de Uso de Transporte Público
    Arreglo con número de pasajeros por viaje.
    Calcular promedio de pasajeros.
    Identificar el viaje con mayor ocupación.



