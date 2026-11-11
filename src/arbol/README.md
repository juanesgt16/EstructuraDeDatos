# Árbol binario de búsqueda (BST)

**Qué es:** estructura jerárquica de nodos. Cada nodo tiene máximo dos hijos: los menores van a la izquierda y los mayores a la derecha.

**Operaciones:** `insertar`, `contiene`, `eliminar`, `altura`, `tamano` y los tres recorridos.

| Recorrido | Orden | Uso típico |
|---|---|---|
| Inorden | izquierdo, raíz, derecho | obtener los datos ordenados |
| Preorden | raíz, izquierdo, derecho | copiar el árbol |
| Postorden | izquierdo, derecho, raíz | borrar el árbol |

**Cuándo usarlo:** búsquedas rápidas en datos ordenados, jerarquías como carpetas o menús.

## Archivos
- `ArbolBusqueda.java`: implementación propia.
- `PruebaArbol.java`: ejemplo de uso.
