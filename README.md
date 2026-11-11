# Estructuras de datos en Java

Repositorio de la materia con las estructuras de datos vistas en clase.
Cada estructura tiene su implementación propia, un programa de prueba y una explicación breve.

## Contenido

| Estructura | Carpeta | Estado |
|---|---|---|
| Pila | [src/pila](src/pila) | listo |
| Cola | [src/cola](src/cola) | listo |
| Lista enlazada | [src/listaenlazada](src/listaenlazada) | listo |
| Vector | src/vector | pendiente |
| Árboles | src/arbol | pendiente |

## Cómo ejecutar

Desde la raíz del repositorio:

```bash
javac -d out src/pila/*.java src/cola/*.java src/listaenlazada/*.java

java -cp out pila.PruebaPila
java -cp out pila.BalanceParentesis
java -cp out cola.PruebaCola
java -cp out listaenlazada.PruebaListaEnlazada
```

Requiere Java 17 o superior.

## Autor
Juan Esteban Gaviria Tamayo
