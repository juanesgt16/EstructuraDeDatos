package grafo;

// Grafo no dirigido: vértices (nodos) conectados por aristas.
// Se guarda con una matriz: conexion[i][j] es true si i y j están conectados.
public class Grafo {
    private String[] vertices;        // nombres de los vértices
    private boolean[][] conexion;     // matriz de conexiones
    private int cantidad = 0;         // cuántos vértices hay

    public Grafo(int maximo) {
        vertices = new String[maximo];
        conexion = new boolean[maximo][maximo];
    }

    public void agregarVertice(String nombre) {
        if (cantidad == vertices.length) {
            throw new RuntimeException("El grafo está lleno");
        }
        vertices[cantidad] = nombre;
        cantidad++;
    }

    // Conecta dos vértices en ambos sentidos
    public void agregarArista(String a, String b) {
        int i = posicion(a);
        int j = posicion(b);
        conexion[i][j] = true;
        conexion[j][i] = true;
    }

    public boolean estanConectados(String a, String b) {
        return conexion[posicion(a)][posicion(b)];
    }

    // Muestra los vecinos de un vértice
    public void mostrarVecinos(String nombre) {
        int i = posicion(nombre);
        System.out.print(nombre + " está conectado con:");
        for (int j = 0; j < cantidad; j++) {
            if (conexion[i][j]) {
                System.out.print(" " + vertices[j]);
            }
        }
        System.out.println();
    }

    // Recorrido en anchura: primero los vecinos cercanos, luego los más lejanos (usa una cola)
    public void anchura(String inicio) {
        boolean[] visitado = new boolean[cantidad];
        int[] cola = new int[cantidad];
        int frente = 0;
        int fin = 0;

        int i = posicion(inicio);
        visitado[i] = true;
        cola[fin] = i;
        fin++;

        while (frente < fin) {
            int actual = cola[frente];
            frente++;
            System.out.print(vertices[actual] + " ");
            for (int j = 0; j < cantidad; j++) {
                if (conexion[actual][j] && !visitado[j]) {
                    visitado[j] = true;
                    cola[fin] = j;
                    fin++;
                }
            }
        }
        System.out.println();
    }

    // Recorrido en profundidad: se interna lo más posible y luego retrocede
    public void profundidad(String inicio) {
        boolean[] visitado = new boolean[cantidad];
        profundidad(posicion(inicio), visitado);
        System.out.println();
    }

    private void profundidad(int actual, boolean[] visitado) {
        visitado[actual] = true;
        System.out.print(vertices[actual] + " ");
        for (int j = 0; j < cantidad; j++) {
            if (conexion[actual][j] && !visitado[j]) {
                profundidad(j, visitado);
            }
        }
    }

    // Busca en qué posición está un vértice
    private int posicion(String nombre) {
        for (int i = 0; i < cantidad; i++) {
            if (vertices[i].equals(nombre)) {
                return i;
            }
        }
        throw new RuntimeException("No existe el vértice " + nombre);
    }
}
