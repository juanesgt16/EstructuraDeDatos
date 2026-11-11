package grafo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/** Grafo no dirigido representado con listas de adyacencia. */
public class Grafo {
    private final Map<String, List<String>> adyacentes = new LinkedHashMap<>();

    public void agregarVertice(String vertice) {
        adyacentes.putIfAbsent(vertice, new ArrayList<>());
    }

    public void agregarArista(String a, String b) {
        agregarVertice(a);
        agregarVertice(b);
        adyacentes.get(a).add(b);
        adyacentes.get(b).add(a);
    }

    /** Recorrido en anchura: visita primero los vecinos más cercanos (usa una cola). */
    public List<String> anchura(String inicio) {
        List<String> orden = new ArrayList<>();
        Set<String> visitados = new HashSet<>();
        Deque<String> cola = new ArrayDeque<>();
        cola.add(inicio);
        visitados.add(inicio);
        while (!cola.isEmpty()) {
            String actual = cola.poll();
            orden.add(actual);
            for (String vecino : adyacentes.get(actual)) {
                if (visitados.add(vecino)) cola.add(vecino);
            }
        }
        return orden;
    }

    /** Recorrido en profundidad: se interna lo más posible antes de retroceder (usa una pila). */
    public List<String> profundidad(String inicio) {
        List<String> orden = new ArrayList<>();
        Set<String> visitados = new HashSet<>();
        Deque<String> pila = new ArrayDeque<>();
        pila.push(inicio);
        while (!pila.isEmpty()) {
            String actual = pila.pop();
            if (!visitados.add(actual)) continue;
            orden.add(actual);
            List<String> vecinos = adyacentes.get(actual);
            for (int i = vecinos.size() - 1; i >= 0; i--) {
                if (!visitados.contains(vecinos.get(i))) pila.push(vecinos.get(i));
            }
        }
        return orden;
    }

    @Override
    public String toString() { return adyacentes.toString(); }
}
