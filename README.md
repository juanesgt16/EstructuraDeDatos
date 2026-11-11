# Estructuras de datos en Java

Repositorio de la materia con las estructuras de datos vistas en clase.
Cada estructura tiene su implementación propia, un programa de prueba y una explicación breve.

## Contenido

| Estructura | Tipo | Carpeta |
|---|---|---|
| Pila | lineal | [src/pila](src/pila) |
| Cola | lineal | [src/cola](src/cola) |
| Lista enlazada | lineal | [src/listaenlazada](src/listaenlazada) |
| Vector | lineal | [src/vector](src/vector) |
| Árbol binario de búsqueda | no lineal | [src/arbol](src/arbol) |
| Mapa (tabla hash) | no lineal | [src/mapa](src/mapa) |
| Conjunto | no lineal | [src/conjunto](src/conjunto) |
| Grafo | no lineal | [src/grafo](src/grafo) |

## Cómo ejecutar

Desde la raíz del repositorio (requiere Java 17 o superior):

```bash
javac -encoding UTF-8 -d out src/*/*.java

java -cp out pila.PruebaPila
java -cp out pila.BalanceParentesis
java -cp out cola.PruebaCola
java -cp out listaenlazada.PruebaListaEnlazada
java -cp out vector.PruebaVector
java -cp out arbol.PruebaArbol
java -cp out mapa.PruebaMapa
java -cp out conjunto.PruebaConjunto
java -cp out grafo.PruebaGrafo
```

## Autor
Juan Esteban Gaviria Tamayo
