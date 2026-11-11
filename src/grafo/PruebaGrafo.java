package grafo;

public class PruebaGrafo {
    public static void main(String[] args) {
        Grafo g = new Grafo();
        g.agregarArista("Medellín", "Bello");
        g.agregarArista("Medellín", "Itagüí");
        g.agregarArista("Bello", "Copacabana");
        g.agregarArista("Itagüí", "Sabaneta");
        g.agregarArista("Copacabana", "Girardota");

        System.out.println("Conexiones: " + g);
        System.out.println("Anchura desde Medellín:     " + g.anchura("Medellín"));
        System.out.println("Profundidad desde Medellín: " + g.profundidad("Medellín"));
    }
}
