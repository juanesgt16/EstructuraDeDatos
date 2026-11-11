package conjunto;

public class PruebaConjunto {
    public static void main(String[] args) {
        Conjunto<String> a = new Conjunto<>();
        a.agregar("Java");
        a.agregar("Python");
        a.agregar("Java"); // repetido: no se agrega

        Conjunto<String> b = new Conjunto<>();
        b.agregar("Python");
        b.agregar("SQL");

        System.out.println("A: " + a + " (tamaño " + a.tamano() + ")");
        System.out.println("B: " + b);
        System.out.println("Unión: " + a.union(b));
        System.out.println("Intersección: " + a.interseccion(b));
        System.out.println("¿A contiene SQL? " + a.contiene("SQL"));
    }
}
