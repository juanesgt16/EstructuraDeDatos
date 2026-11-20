package listaenlazada;

// Lista enlazada: cada nodo guarda un dato y apunta al siguiente.
public class ListaEnlazada {

    private class Nodo {
        String dato;
        Nodo siguiente;

        Nodo(String dato) {
            this.dato = dato;
        }
    }

    private Nodo cabeza;   // primer nodo de la lista
    private int cantidad = 0;

    // Agrega al inicio
    public void agregarAlInicio(String elemento) {
        Nodo nuevo = new Nodo(elemento);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
        cantidad++;
    }

    // Agrega al final: recorre hasta el último nodo
    public void agregarAlFinal(String elemento) {
        Nodo nuevo = new Nodo(elemento);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        cantidad++;
    }

    // Busca un elemento recorriendo la lista
    public boolean buscar(String elemento) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato.equals(elemento)) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    // Elimina la primera vez que aparece el elemento
    public boolean eliminar(String elemento) {
        if (cabeza == null) {
            return false;
        }
        if (cabeza.dato.equals(elemento)) {
            cabeza = cabeza.siguiente;
            cantidad--;
            return true;
        }
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.dato.equals(elemento)) {
                actual.siguiente = actual.siguiente.siguiente;
                cantidad--;
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public int tamano() {
        return cantidad;
    }

    // Muestra la lista: A -> B -> C
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("(lista vacía)");
            return;
        }
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) {
                System.out.print(" -> ");
            }
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
