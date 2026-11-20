package pila;

// Pila: el último que entra es el primero que sale (LIFO).
public class Pila {
    private String[] datos;   // aquí se guardan los elementos
    private int cantidad;     // cuántos hay guardados

    public Pila(int capacidad) {
        datos = new String[capacidad];
        cantidad = 0;
    }

    // Agrega un elemento arriba de la pila
    public void push(String elemento) {
        if (cantidad == datos.length) {
            throw new RuntimeException("La pila está llena");
        }
        datos[cantidad] = elemento;
        cantidad++;
    }

    // Quita y devuelve el elemento de arriba
    public String pop() {
        if (estaVacia()) {
            throw new RuntimeException("La pila está vacía");
        }
        cantidad--;
        return datos[cantidad];
    }

    // Mira el elemento de arriba sin quitarlo
    public String peek() {
        if (estaVacia()) {
            throw new RuntimeException("La pila está vacía");
        }
        return datos[cantidad - 1];
    }

    public boolean estaVacia() {
        return cantidad == 0;
    }

    public int tamano() {
        return cantidad;
    }
}
