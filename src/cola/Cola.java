package cola;

/** Cola (FIFO) implementada con nodos enlazados. */
public class Cola<T> {

    private static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;
        Nodo(T dato) { this.dato = dato; }
    }

    private Nodo<T> frente;
    private Nodo<T> fin;
    private int tamano = 0;

    public void encolar(T elemento) {
        Nodo<T> nuevo = new Nodo<>(elemento);
        if (estaVacia()) {
            frente = nuevo;
        } else {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tamano++;
    }

    public T desencolar() {
        if (estaVacia()) throw new RuntimeException("La cola está vacía");
        T dato = frente.dato;
        frente = frente.siguiente;
        if (frente == null) fin = null;
        tamano--;
        return dato;
    }

    public T verFrente() {
        if (estaVacia()) throw new RuntimeException("La cola está vacía");
        return frente.dato;
    }

    public boolean estaVacia() { return tamano == 0; }
    public int tamano() { return tamano; }
}
