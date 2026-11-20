package vector;

public class PruebaVector {
    public static void main(String[] args) {

        // Ejemplo 1: agregar y ver cómo crece
        System.out.println("--- Ejemplo 1: agregar y crecer ---");
        VectorDinamico notas = new VectorDinamico();
        System.out.println("Capacidad inicial: " + notas.capacidad());
        notas.agregar(40);
        notas.agregar(35);
        notas.agregar(48);
        notas.agregar(30);   // aquí se llena y duplica la capacidad
        notas.mostrar();
        System.out.println("Tamaño: " + notas.tamano() + ", capacidad: " + notas.capacidad());

        // Ejemplo 2: consultar y cambiar por posición
        System.out.println("\n--- Ejemplo 2: obtener y cambiar ---");
        System.out.println("Posición 2: " + notas.obtener(2));
        notas.cambiar(2, 50);
        notas.mostrar();

        // Ejemplo 3: eliminar y calcular el promedio
        System.out.println("\n--- Ejemplo 3: eliminar y promedio ---");
        System.out.println("Elimina la posición 0: " + notas.eliminar(0));
        notas.mostrar();
        int suma = 0;
        for (int i = 0; i < notas.tamano(); i++) {
            suma = suma + notas.obtener(i);
        }
        System.out.println("Promedio: " + (double) suma / notas.tamano());
    }
}
