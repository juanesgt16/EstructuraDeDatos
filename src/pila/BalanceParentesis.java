package pila;

import java.util.Scanner;

/** Verifica si una cadena de paréntesis, corchetes y llaves está balanceada. */
public class BalanceParentesis {

    public static boolean estaBalanceada(String cadena) {
        Pila<Character> pila = new Pila<>();

        for (char c : cadena.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.estaVacia()) return false;
                if (!coinciden(pila.pop(), c)) return false;
            }
        }
        return pila.estaVacia();
    }

    private static boolean coinciden(char abre, char cierra) {
        return (abre == '(' && cierra == ')')
            || (abre == '[' && cierra == ']')
            || (abre == '{' && cierra == '}');
    }

    public static void main(String[] args) {
        String[] pruebas = {"(())()", "(()", "())", "{[()]}", "{[(])}", ""};
        for (String p : pruebas) {
            System.out.println("\"" + p + "\" -> "
                + (estaBalanceada(p) ? "Correcto" : "Incorrecto"));
        }

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Escribe una cadena: ");
            String cadena = sc.nextLine();
            System.out.println(estaBalanceada(cadena) ? "Correcto" : "Incorrecto");
        }
    }
}
