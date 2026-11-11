# Mapa (tabla hash)

**Qué es:** guarda pares clave -> valor. Una función hash convierte la clave en una posición del arreglo, y por eso buscar es casi instantáneo. Si dos claves caen en la misma posición, se encadenan en una lista.

**Operaciones:** `poner`, `obtener`, `contieneClave`, `eliminar`, `claves`, `tamano`. La tabla se agranda sola cuando se llena al 75 %.

**Cuándo usarlo:** buscar un usuario por correo, contar repeticiones, diccionarios. En Java equivale a `HashMap`.

## Archivos
- `TablaHash.java`: implementación propia.
- `PruebaMapa.java`: ejemplo de uso (usuarios por correo).
