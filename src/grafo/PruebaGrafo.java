package grafo;

public class PruebaGrafo {
    public static void main(String[] args) {

        // Ejemplo 1: crear el grafo y ver conexiones
        System.out.println("--- Ejemplo 1: conexiones entre municipios ---");
        Grafo mapa = new Grafo(10);
        mapa.agregarVertice("Medellín");
        mapa.agregarVertice("Bello");
        mapa.agregarVertice("Itagüí");
        mapa.agregarVertice("Copacabana");
        mapa.agregarVertice("Sabaneta");

        mapa.agregarArista("Medellín", "Bello");
        mapa.agregarArista("Medellín", "Itagüí");
        mapa.agregarArista("Bello", "Copacabana");
        mapa.agregarArista("Itagüí", "Sabaneta");

        mapa.mostrarVecinos("Medellín");
        mapa.mostrarVecinos("Bello");

        // Ejemplo 2: recorridos
        System.out.println("\n--- Ejemplo 2: recorridos desde Medellín ---");
        System.out.print("Anchura:     ");
        mapa.anchura("Medellín");
        System.out.print("Profundidad: ");
        mapa.profundidad("Medellín");

        // Ejemplo 3: preguntar si dos vértices están conectados
        System.out.println("\n--- Ejemplo 3: ¿están conectados? ---");
        System.out.println("Medellín y Bello: " + mapa.estanConectados("Medellín", "Bello"));
        System.out.println("Bello y Sabaneta: " + mapa.estanConectados("Bello", "Sabaneta"));
    }
}
