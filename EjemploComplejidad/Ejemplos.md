## Ejemplos Notaciones


1. O(1) – Constante
   * Definicion:La complejidad constante, denotada como
en la notación Big O, es una medida de eficiencia donde el tiempo de ejecución o el espacio de memoria de un algoritmo sigue siendo el mismo, independientemente del tamaño de los datos de entrada. Es el escenario ideal, indicando que el algoritmo tarda igual procesando un elemento que un millón.
   * Ejemplo:[Complejidad Constante](./src/Ejemplos/ComplejidadConstante.java).
2. O(n) – Lineal
   * Definicion:La complejidad lineal, representada como
en la notación Big-O, indica que el tiempo de ejecución o espacio de memoria de un algoritmo crece en proporción directa al tamaño de los datos de entrada (
). Si la entrada se duplica, el tiempo de procesamiento también se duplica aproximadamente. Es eficiente para conjuntos de datos pequeños/medianos, pero puede volverse lenta con grandes volúmenes.
   * Ejemplo:[Complejidad Lineal](./src/Ejemplos/ComplejidadLineal.java).
3. O(n²) – Cuadrática
   * Definicion:La complejidad cuadrática, denotada como
, indica que el tiempo o espacio de ejecución de un algoritmo aumenta proporcionalmente al cuadrado del tamaño de los datos de entrada (
). Es ineficiente para grandes volúmenes de datos, ya que al duplicar la entrada, el tiempo de procesamiento se cuadruplica. 
   * Ejemplo:[Complejidad Cuadrática](./src/Ejemplos/ComplejidadCuadratica.java).
4. O(log n) – Logarítmica
   * Definicion:La complejidad logarítmica, denotada como
, indica que el tiempo de ejecución de un algoritmo aumenta de forma muy lenta a medida que crece el tamaño de entrada (
), ya que cada operación reduce el problema a la mitad. Es altamente eficiente, superada solo por el tiempo constante, y común en algoritmos de tipo "divide y vencerás". 
   * Ejemplo:[Complejidad Logarítmica](./src/Ejemplos/ComplejidadLogaritmica.java).
5. O(n log n) – N log N
   * Definicion:La complejidad
, conocida como complejidad logarítmica lineal o cuasi-lineal, indica que el tiempo de ejecución de un algoritmo aumenta de forma proporcional a
multiplicado por el logaritmo de
. Es la eficiencia típica de algoritmos de ordenación avanzados (como Mergesort o Quicksort), siendo mucho más rápidos que los cuadráticos (
)
   * Ejemplo:Ejemplo:[Complejidad N log N](./src/Ejemplos/ComplejidadLogaritmicaN.java).

   