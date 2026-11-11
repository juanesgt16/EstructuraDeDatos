package pila;

public class PruebaPila {
    public static void main(String[] args) {
        Pila<String> historial = new Pila<>();
        historial.push("Inicio");
        historial.push("Dashboard");
        historial.push("Reportes");

        System.out.println("Arriba: " + historial.peek());
        System.out.println("Sale: " + historial.pop());
        System.out.println("Sale: " + historial.pop());
        System.out.println("Tamaño: " + historial.tamano());
    }
}
