package vector;

// Vector: un arreglo que crece solo cuando se llena.
public class VectorDinamico {
    private int[] datos = new int[3];   // empieza pequeño para ver cómo crece
    private int cantidad = 0;

    // Agrega al final; si no hay espacio, crea un arreglo del doble
    public void agregar(int valor) {
        if (cantidad == datos.length) {
            int[] nuevo = new int[datos.length * 2];
            for (int i = 0; i < cantidad; i++) {
                nuevo[i] = datos[i];
            }
            datos = nuevo;
        }
        datos[cantidad] = valor;
        cantidad++;
    }

    public int obtener(int posicion) {
        validar(posicion);
        return datos[posicion];
    }

    public void cambiar(int posicion, int valor) {
        validar(posicion);
        datos[posicion] = valor;
    }

    // Elimina una posición y corre los demás un lugar a la izquierda
    public int eliminar(int posicion) {
        validar(posicion);
        int eliminado = datos[posicion];
        for (int i = posicion; i < cantidad - 1; i++) {
            datos[i] = datos[i + 1];
        }
        cantidad--;
        return eliminado;
    }

    public int tamano() {
        return cantidad;
    }

    public int capacidad() {
        return datos.length;
    }

    private void validar(int posicion) {
        if (posicion < 0 || posicion >= cantidad) {
            throw new RuntimeException("Posición " + posicion + " fuera de rango");
        }
    }

    public void mostrar() {
        System.out.print("[");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(datos[i]);
            if (i < cantidad - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
