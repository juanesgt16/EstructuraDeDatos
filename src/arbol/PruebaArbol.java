package arbol;

public class PruebaArbol {
    public static void main(String[] args) {
        ArbolBusqueda<Integer> arbol = new ArbolBusqueda<>();
        for (int n : new int[]{50, 30, 70, 20, 40, 60, 80}) {
            arbol.insertar(n);
        }

        System.out.println("Inorden (ordenado): " + arbol.inorden());
        System.out.println("Preorden:           " + arbol.preorden());
        System.out.println("Postorden:          " + arbol.postorden());
        System.out.println("Altura: " + arbol.altura() + ", tamaño: " + arbol.tamano());
        System.out.println("¿Contiene 60? " + arbol.contiene(60));
        System.out.println("¿Contiene 65? " + arbol.contiene(65));

        arbol.eliminar(30);
        System.out.println("Tras eliminar 30: " + arbol.inorden());
    }
}
