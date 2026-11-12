# Grafo

**Qué es:** conjunto de vértices (nodos) conectados por aristas. Esta versión es no dirigida y usa listas de adyacencia: cada vértice guarda la lista de sus vecinos.

**Operaciones:** `agregarVertice`, `agregarArista`, `anchura` (BFS) y `profundidad` (DFS).

| Recorrido | Usa | Visita |
|---|---|---|
| Anchura (BFS) | cola | primero los vecinos más cercanos |
| Profundidad (DFS) | pila | se interna lo más posible y luego retrocede |

**Cuándo usarlo:** mapas y rutas, redes sociales, dependencias entre tareas.


