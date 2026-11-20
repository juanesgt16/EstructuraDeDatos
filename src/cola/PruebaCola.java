package cola;

public class PruebaCola {
    public static void main(String[] args) {

        // Ejemplo 1: turnos de atención
        System.out.println("--- Ejemplo 1: turnos de atención ---");
        Cola turnos = new Cola();
        turnos.encolar("Ana");
        turnos.encolar("Luis");
        turnos.encolar("María");
        System.out.println("Sigue: " + turnos.verFrente());
        while (!turnos.estaVacia()) {
            System.out.println("Atendiendo a " + turnos.desencolar());
        }

        // Ejemplo 2: documentos para imprimir
        System.out.println("\n--- Ejemplo 2: cola de impresión ---");
        Cola impresora = new Cola();
        impresora.encolar("informe.pdf");
        impresora.encolar("notas.docx");
        System.out.println("Documentos en espera: " + impresora.tamano());
        System.out.println("Imprimiendo " + impresora.desencolar());
        System.out.println("Documentos en espera: " + impresora.tamano());

        // Ejemplo 3: cola vacía
        System.out.println("\n--- Ejemplo 3: cola vacía ---");
        Cola vacia = new Cola();
        System.out.println("¿Está vacía? " + vacia.estaVacia());
        try {
            vacia.desencolar();
        } catch (RuntimeException e) {
            System.out.println("Error controlado: " + e.getMessage());
        }
    }
}
