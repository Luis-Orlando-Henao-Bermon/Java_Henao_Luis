/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Dia_24 {

    public static void main(String[] args) {
        //Stream API es una característica de Java introducida en Java 8 
        //que permite procesar secuencias de datos de manera funcional y eficiente. 
        //Su objetivo es facilitar la manipulación de colecciones, como listas y conjuntos, 
        //mediante operaciones como filtrado, transformación, reducción y agrupamiento.
        
        //Stream.of()
        Stream<String> personas = Stream.of("Luis", "Paula", "Laura");
        personas.forEach(e->System.out.println(e));

        //A partir de un arreglo
         String[] lenguajes = {"Java", "Python", "JavaScript"};
        Stream<String> lenguajesStream = Arrays.stream(lenguajes);
        lenguajesStream.forEach(e->System.out.println(e ));

        //Stream.builder()
        Stream<String> stream = Stream.<String>builder()
                .add("Java")
                .add("Python")
                .add("JavaScript")
                .build();

        stream.forEach(e-> System.out.println(e));
        
        //A partir de una colección
        List<String> lenguajesColeccion = new ArrayList<>();
        lenguajesColeccion.add("Python");
        lenguajesColeccion.add("Java");
        lenguajesColeccion.add("JAvaScript");
        Stream<String> lenguajesStreamColecion = lenguajesColeccion.stream();
        lenguajesStreamColecion.forEach(System.out::println);

        //Operador map
        Stream <String> animales = Stream.of("Pato", "Gato", "Perro").map(animal ->{
            return animal.toUpperCase();
        });
        animales.forEach(e -> System.out.println(e));

        //Operador filter
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)  // Filtra por los numero que son pares
                .collect(Collectors.toList());

        System.out.println(pares);

        //Operador anyMatch
        List<String> nombres = List.of("Ana", "Pedro", "Luis");

        boolean existeLuis = nombres.stream()
                .anyMatch(n -> n.equals("Luis"));  // verifiaca si esxiste luis en la lista

        System.out.println(existeLuis);

        //Operador flatMap
        List<List<String>> listaDeListas = List.of(
                List.of("A", "B"),
                List.of("C", "D")
        );

        List<String> resultado = listaDeListas.stream()
                .flatMap(List::stream)  // Une todas las listas en un solo stream
                .collect(Collectors.toList());

        System.out.println(resultado);
    }
    
}
