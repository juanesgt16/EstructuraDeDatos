package mapa;

public class PruebaMapa {
    public static void main(String[] args) {
        TablaHash<String, String> usuarios = new TablaHash<>();
        usuarios.poner("ana@correo.com", "Ana");
        usuarios.poner("luis@correo.com", "Luis");
        usuarios.poner("maria@correo.com", "María");

        System.out.println("Busca luis@correo.com -> " + usuarios.obtener("luis@correo.com"));
        System.out.println("¿Existe pedro@correo.com? " + usuarios.contieneClave("pedro@correo.com"));

        usuarios.poner("ana@correo.com", "Ana Gómez"); // actualiza el valor
        System.out.println("Actualizado -> " + usuarios.obtener("ana@correo.com"));

        usuarios.eliminar("luis@correo.com");
        System.out.println("Tamaño: " + usuarios.tamano());
        System.out.println("Claves: " + usuarios.claves());
    }
}
