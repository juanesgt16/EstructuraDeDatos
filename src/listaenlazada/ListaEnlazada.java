package listaenlazada;

/** Lista enlazada simple: cada nodo guarda un dato y una referencia al siguiente. */
public class ListaEnlazada<T> {

    private static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;
        Nodo(T dato) { this.dato = dato; }
    }

    private Nodo<T> cabeza;
    private int tamano = 0;

    public void agregarAlInicio(T elemento) {
        Nodo<T> nuevo = new Nodo<>(elemento);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
        tamano++;
    }

    public void agregarAlFinal(T elemento) {
        Nodo<T> nuevo = new Nodo<>(elemento);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo<T> actual = cabeza;
            while (actual.siguiente != null) actual = actual.siguiente;
            actual.siguiente = nuevo;
        }
        tamano++;
    }

    public boolean contiene(T elemento) {
        for (Nodo<T> n = cabeza; n != null; n = n.siguiente) {
            if (n.dato.equals(elemento)) return true;
        }
        return false;
    }

    public boolean eliminar(T elemento) {
        if (cabeza == null) return false;
        if (cabeza.dato.equals(elemento)) {
            cabeza = cabeza.siguiente;
            tamano--;
            return true;
        }
        Nodo<T> actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.dato.equals(elemento)) {
                actual.siguiente = actual.siguiente.siguiente;
                tamano--;
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public int tamano() { return tamano; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Nodo<T> n = cabeza; n != null; n = n.siguiente) {
            sb.append(n.dato).append(n.siguiente != null ? " -> " : "");
        }
        return sb.length() == 0 ? "(vacía)" : sb.toString();
    }
}
