package listaenlazada;

public class PruebaListaEnlazada {
    public static void main(String[] args) {

        // Ejemplo 1: agregar al final
        System.out.println("--- Ejemplo 1: agregar al final ---");
        ListaEnlazada tareas = new ListaEnlazada();
        tareas.agregarAlFinal("Estudiar pilas");
        tareas.agregarAlFinal("Estudiar colas");
        tareas.agregarAlFinal("Estudiar árboles");
        tareas.mostrar();
        System.out.println("Tamaño: " + tareas.tamano());

        // Ejemplo 2: agregar al inicio
        System.out.println("\n--- Ejemplo 2: agregar al inicio ---");
        tareas.agregarAlInicio("Leer el enunciado");
        tareas.mostrar();

        // Ejemplo 3: buscar y eliminar
        System.out.println("\n--- Ejemplo 3: buscar y eliminar ---");
        System.out.println("¿Está 'Estudiar colas'? " + tareas.buscar("Estudiar colas"));
        System.out.println("¿Está 'Dormir'? " + tareas.buscar("Dormir"));
        tareas.eliminar("Estudiar pilas");
        tareas.mostrar();
        System.out.println("Tamaño: " + tareas.tamano());
    }
}
