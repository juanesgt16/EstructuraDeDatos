package listaenlazada;

public class PruebaListaEnlazada {
    public static void main(String[] args) {
        ListaEnlazada<String> tareas = new ListaEnlazada<>();
        tareas.agregarAlFinal("Estudiar pilas");
        tareas.agregarAlFinal("Estudiar colas");
        tareas.agregarAlInicio("Leer el enunciado");

        System.out.println(tareas);
        System.out.println("¿Contiene 'Estudiar colas'? " + tareas.contiene("Estudiar colas"));

        tareas.eliminar("Estudiar pilas");
        System.out.println(tareas);
        System.out.println("Tamaño: " + tareas.tamano());
    }
}
