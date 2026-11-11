# Conjunto (Set)

**Qué es:** colección que no permite elementos repetidos. Aquí está construida sobre la tabla hash de `src/mapa`: cada elemento es una clave.

**Operaciones:** `agregar`, `contiene`, `eliminar`, `union`, `interseccion`, `tamano`.

**Cuándo usarlo:** quitar duplicados, comprobar pertenencia (correos únicos, etiquetas). En Java equivale a `HashSet`.

## Archivos
- `Conjunto.java`: implementación propia (usa `mapa.TablaHash`).
- `PruebaConjunto.java`: ejemplo de uso con unión e intersección.
