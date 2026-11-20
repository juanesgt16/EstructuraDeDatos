package cola;

// Cola: el primero que entra es el primero que sale (FIFO).
public class Cola {

    // Cada nodo guarda un dato y apunta al siguiente
    private class Nodo {
        String dato;
        Nodo siguiente;

        Nodo(String dato) {
            this.dato = dato;
        }
    }

    private Nodo frente;   // primero de la cola
    private Nodo fin;      // último de la cola
    private int cantidad = 0;

    // Agrega al final de la cola
    public void encolar(String elemento) {
        Nodo nuevo = new Nodo(elemento);
        if (estaVacia()) {
            frente = nuevo;
        } else {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        cantidad++;
    }

    // Saca y devuelve el primero de la cola
    public String desencolar() {
        if (estaVacia()) {
            throw new RuntimeException("La cola está vacía");
        }
        String dato = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null;
        }
        cantidad--;
        return dato;
    }

    // Mira el primero sin sacarlo
    public String verFrente() {
        if (estaVacia()) {
            throw new RuntimeException("La cola está vacía");
        }
        return frente.dato;
    }

    public boolean estaVacia() {
        return cantidad == 0;
    }

    public int tamano() {
        return cantidad;
    }
}
