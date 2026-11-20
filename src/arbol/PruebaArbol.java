package arbol;

public class PruebaArbol {
    public static void main(String[] args) {

        // Ejemplo 1: insertar y recorrer
        System.out.println("--- Ejemplo 1: recorridos ---");
        ArbolBusqueda arbol = new ArbolBusqueda();
        int[] numeros = {50, 30, 70, 20, 40, 60, 80};
        for (int n : numeros) {
            arbol.insertar(n);
        }
        System.out.print("Inorden (ordenado): ");
        arbol.inorden();
        System.out.print("Preorden:           ");
        arbol.preorden();
        System.out.print("Postorden:          ");
        arbol.postorden();

        // Ejemplo 2: buscar
        System.out.println("\n--- Ejemplo 2: buscar ---");
        System.out.println("¿Está el 60? " + arbol.buscar(60));
        System.out.println("¿Está el 65? " + arbol.buscar(65));

        // Ejemplo 3: menor y mayor de otro árbol
        System.out.println("\n--- Ejemplo 3: menor y mayor ---");
        ArbolBusqueda edades = new ArbolBusqueda();
        edades.insertar(25);
        edades.insertar(18);
        edades.insertar(42);
        edades.insertar(31);
        System.out.println("Edad menor: " + edades.minimo());
        System.out.println("Edad mayor: " + edades.maximo());
    }
}
