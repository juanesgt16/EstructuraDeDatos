# Pila (Stack)

**Qué es:** colección donde el último elemento en entrar es el primero en salir (LIFO).

**Operaciones:** `push`, `pop`, `peek`, `estaVacia`, `tamano`.

**Cuándo usarla:** historial de navegación, deshacer cambios, validar paréntesis.

## Archivos
- `Pila.java`: implementación propia con un arreglo que crece solo.
- `PruebaPila.java`: ejemplo de uso (historial de navegación).
- `BalanceParentesis.java`: ejercicio que verifica si una cadena de paréntesis está balanceada.

## Ejercicio
Diseña un programa que verifique si una cadena de paréntesis está balanceada.

| Entrada | Resultado |
|---|---|
| `(())()` | Correcto |
| `(()` | Incorrecto |

**Idea:** se apila cada símbolo de apertura; al encontrar uno de cierre se desapila y se comprueba que coincida. Al final la pila debe quedar vacía.
