package conjunto;

import java.util.List;
import mapa.TablaHash;

/** Conjunto: colección sin elementos repetidos, construida sobre la tabla hash. */
public class Conjunto<T> {
    private final TablaHash<T, Boolean> tabla = new TablaHash<>();

    public boolean agregar(T elemento) {
        if (tabla.contieneClave(elemento)) return false; // ya estaba
        tabla.poner(elemento, true);
        return true;
    }

    public boolean contiene(T elemento) { return tabla.contieneClave(elemento); }
    public boolean eliminar(T elemento) { return tabla.eliminar(elemento); }
    public int tamano() { return tabla.tamano(); }
    public List<T> elementos() { return tabla.claves(); }

    public Conjunto<T> union(Conjunto<T> otro) {
        Conjunto<T> resultado = new Conjunto<>();
        for (T e : elementos()) resultado.agregar(e);
        for (T e : otro.elementos()) resultado.agregar(e);
        return resultado;
    }

    public Conjunto<T> interseccion(Conjunto<T> otro) {
        Conjunto<T> resultado = new Conjunto<>();
        for (T e : elementos()) {
            if (otro.contiene(e)) resultado.agregar(e);
        }
        return resultado;
    }

    @Override
    public String toString() { return elementos().toString(); }
}
