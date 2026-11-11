package vector;

public class PruebaVector {
    public static void main(String[] args) {
        VectorDinamico<Integer> notas = new VectorDinamico<>();
        for (int n : new int[]{40, 35, 48, 30, 45}) {
            notas.agregar(n);
        }
        System.out.println("Notas: " + notas);
        System.out.println("Tamaño: " + notas.tamano() + ", capacidad: " + notas.capacidad());

        notas.establecer(1, 50);
        System.out.println("Posición 1: " + notas.obtener(1));
        System.out.println("Elimina la posición 0: " + notas.eliminar(0));
        System.out.println("Notas: " + notas);
    }
}
