package arbol;

// Árbol binario de búsqueda: menores a la izquierda, mayores a la derecha.
public class ArbolBusqueda {

    private class Nodo {
        int dato;
        Nodo izquierdo;
        Nodo derecho;

        Nodo(int dato) {
            this.dato = dato;
        }
    }

    private Nodo raiz;

    public void insertar(int valor) {
        raiz = insertar(raiz, valor);
    }

    // Baja por el árbol hasta encontrar el lugar vacío
    private Nodo insertar(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }
        if (valor < nodo.dato) {
            nodo.izquierdo = insertar(nodo.izquierdo, valor);
        } else if (valor > nodo.dato) {
            nodo.derecho = insertar(nodo.derecho, valor);
        }
        return nodo;
    }

    // Busca yendo a la izquierda o a la derecha según el valor
    public boolean buscar(int valor) {
        Nodo actual = raiz;
        while (actual != null) {
            if (valor == actual.dato) {
                return true;
            }
            if (valor < actual.dato) {
                actual = actual.izquierdo;
            } else {
                actual = actual.derecho;
            }
        }
        return false;
    }

    // El menor está siempre más a la izquierda
    public int minimo() {
        Nodo actual = raiz;
        while (actual.izquierdo != null) {
            actual = actual.izquierdo;
        }
        return actual.dato;
    }

    // El mayor está siempre más a la derecha
    public int maximo() {
        Nodo actual = raiz;
        while (actual.derecho != null) {
            actual = actual.derecho;
        }
        return actual.dato;
    }

    // Inorden: izquierdo, raíz, derecho (sale ordenado)
    public void inorden() {
        inorden(raiz);
        System.out.println();
    }

    private void inorden(Nodo nodo) {
        if (nodo != null) {
            inorden(nodo.izquierdo);
            System.out.print(nodo.dato + " ");
            inorden(nodo.derecho);
        }
    }

    // Preorden: raíz, izquierdo, derecho
    public void preorden() {
        preorden(raiz);
        System.out.println();
    }

    private void preorden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            preorden(nodo.izquierdo);
            preorden(nodo.derecho);
        }
    }

    // Postorden: izquierdo, derecho, raíz
    public void postorden() {
        postorden(raiz);
        System.out.println();
    }

    private void postorden(Nodo nodo) {
        if (nodo != null) {
            postorden(nodo.izquierdo);
            postorden(nodo.derecho);
            System.out.print(nodo.dato + " ");
        }
    }
}
