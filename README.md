# Teoría de la Complejidad

## Integrantes
- Stephan Cedillo  
- Alfonso Auquilla  
- Andrés Zúñiga  
- Christopher Carrangui  
- Oliver Valdiviezo  

---

## ¿Qué es?

La teoría de la complejidad es una rama de la informática que estudia los recursos necesarios para resolver un problema mediante un algoritmo, principalmente el **tiempo de ejecución** y el **uso de memoria**.

Se basa en modelos matemáticos y conceptos provenientes del cálculo y del análisis de algoritmos.

---

## Eficiencia de algoritmos

### Coste temporal
Es la medida de cuánto tiempo tarda un algoritmo en ejecutarse dependiendo del tamaño de la entrada.

---

### Coste espacial
Representa la cantidad de memoria que necesita un algoritmo para ejecutarse.

Se expresa mediante notación Big O. Por ejemplo, una complejidad espacial **O(1)** indica que el uso de memoria es constante.

---

## Factores de tiempo de ejecución

### Factores propios
Son los factores relacionados directamente con la lógica del algoritmo, como:
- Estructuras de control (bucles, condiciones)
- Tipo de algoritmo

Estos no dependen de la máquina donde se ejecuta el programa.

---

### Factores circunstanciales
Son factores externos que afectan el tiempo de ejecución, como:
- Hardware de la computadora
- Lenguaje de programación
- Compilador
- Carga del sistema

Estos factores se miden en tiempo real (segundos, milisegundos, etc.).

---

### Análisis teórico
Permite estudiar el comportamiento de un algoritmo sin necesidad de ejecutarlo.

Se basa en el uso de matemáticas para estimar su eficiencia en función del tamaño de la entrada.

---

### Análisis experimental
Consiste en ejecutar el algoritmo en diferentes condiciones para medir su rendimiento real.

Permite comparar algoritmos y validar el análisis teórico.

---

## Notación de Complejidad

### ¿Qué es la notación Big O?

La notación Big O es una herramienta que permite describir el comportamiento de un algoritmo en términos de tiempo o espacio a medida que crece el tamaño de la entrada.

- **O (Big O)** → peor caso  
- **Ω (Omega)** → mejor caso  
- **Θ (Theta)** → caso promedio (aproximado)  

---

## Tipos de casos

###  Mejor caso
Representa el escenario más favorable.  
Ejemplo: encontrar un elemento en la primera posición de una lista.

---

### Peor caso
Representa el escenario más desfavorable.  
Ejemplo: recorrer toda la lista para encontrar un elemento.

---

### Caso promedio
Es un valor intermedio entre el mejor y el peor caso.

---

## Ejemplos

Puedes ver los ejemplos en Java aquí:  
[Ejemplos de Complejidad](./EjemploComplejidad/Ejemplos.md)

---

## Conclusiones

### ¿Qué complejidad es más costosa y por qué?
La complejidad más costosa es **O(n²)**, ya que el número de operaciones crece muy rápidamente al aumentar el tamaño de los datos.

---

### ¿Qué aprendieron del análisis?
Aprendimos a evaluar la eficiencia de los algoritmos y a entender cómo su rendimiento cambia según el tamaño de entrada.

---

### ¿Qué les sorprendió más?
Que pequeños cambios en la estructura del algoritmo pueden afectar significativamente su rendimiento.

---

### Reflexión final
El análisis de la complejidad es fundamental para desarrollar programas eficientes, especialmente cuando se trabaja con grandes volúmenes de datos.