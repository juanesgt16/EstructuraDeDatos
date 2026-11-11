package cola;

public class PruebaCola {
    public static void main(String[] args) {
        Cola<String> turnos = new Cola<>();
        turnos.encolar("Ana");
        turnos.encolar("Luis");
        turnos.encolar("María");

        System.out.println("Siguiente en ser atendido: " + turnos.verFrente());
        while (!turnos.estaVacia()) {
            System.out.println("Atendiendo a: " + turnos.desencolar());
        }
        System.out.println("Turnos pendientes: " + turnos.tamano());
    }
}
