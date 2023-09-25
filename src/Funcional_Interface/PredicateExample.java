package Funcional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javaScript", "C", "go", "ruby");

        // Usar o Predicate com expressão lambda para filtrar números pares
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // Usar o predicado para filtrar números pares no Stream e armazená-los em outra lista
        palavras.stream()
                .filter(p -> p.length() > 5)
                .forEach(System.out::println);

        // Imprimir a lista de números pares

    }
}
