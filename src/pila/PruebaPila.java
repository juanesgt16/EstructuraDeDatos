package pila;

public class PruebaPila {
    public static void main(String[] args) {

        // Ejemplo 1: historial de navegación (botón "atrás")
        System.out.println("--- Ejemplo 1: historial de navegación ---");
        Pila historial = new Pila(10);
        historial.push("Inicio");
        historial.push("Dashboard");
        historial.push("Reportes");
        System.out.println("Página actual: " + historial.peek());
        System.out.println("Atrás -> sale " + historial.pop());
        System.out.println("Atrás -> sale " + historial.pop());
        System.out.println("Quedó en: " + historial.peek());

        // Ejemplo 2: invertir una palabra
        System.out.println("\n--- Ejemplo 2: invertir una palabra ---");
        String palabra = "SAFEMIND";
        Pila letras = new Pila(20);
        for (int i = 0; i < palabra.length(); i++) {
            letras.push(String.valueOf(palabra.charAt(i)));
        }
        String invertida = "";
        while (!letras.estaVacia()) {
            invertida = invertida + letras.pop();
        }
        System.out.println(palabra + " al revés es " + invertida);

        // Ejemplo 3: pila vacía y pila llena
        System.out.println("\n--- Ejemplo 3: pila vacía y pila llena ---");
        Pila pequena = new Pila(2);
        System.out.println("¿Está vacía? " + pequena.estaVacia());
        pequena.push("A");
        pequena.push("B");
        try {
            pequena.push("C");
        } catch (RuntimeException e) {
            System.out.println("Error controlado: " + e.getMessage());
        }
        System.out.println("Tamaño: " + pequena.tamano());
    }
}
