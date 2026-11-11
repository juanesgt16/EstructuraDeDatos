package pila;

import java.util.Arrays;

/** Pila (LIFO) implementada con un arreglo que crece solo. */
public class Pila<T> {
    private Object[] datos = new Object[10];
    private int tamano = 0;

    public void push(T elemento) {
        if (tamano == datos.length) {
            datos = Arrays.copyOf(datos, datos.length * 2);
        }
        datos[tamano++] = elemento;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (estaVacia()) throw new RuntimeException("La pila está vacía");
        T elemento = (T) datos[--tamano];
        datos[tamano] = null;
        return elemento;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (estaVacia()) throw new RuntimeException("La pila está vacía");
        return (T) datos[tamano - 1];
    }

    public boolean estaVacia() { return tamano == 0; }
    public int tamano() { return tamano; }
}
