package dia_22;

import java.util.Random;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        //Funciones Lambda
        //Las funciones en Java que son generalmente anónimas y se definen en línea donde se utilizan.
        //Estas funciones pueden recibir cero o más argumentos y devolver uno o ningún valor de retorno
        //Sintaxix
        //(parametro)->{Cuerpo de la funcion}

        /*
        Parámetros: Son los valores de entrada de la función. Operador ->: Separa los parámetros de la
        implementación. Cuerpo de la función: Es el código que se ejecutará.

        Las expresiones lambda solo funcionan con interfaces funcionales, es decir, interfaces que tienen un
        único método abstracto. Algunas interfaces funcionales predefinidas en java.util.function incluyen:

        Function<T, R> -> Recibe un argumento y devuelve un resultado.
        Consumer<T> -> Recibe un argumento y no devuelve nada.
        Supplier<T> -> No recibe argumentos, pero devuelve un resultado.
        Predicate<T> -> Recibe un argumento y devuelve true o false.

        Consumer es una interfaz funcional que representa una operación que acepta un solo argumento de
        entrada y no devuelve ningún resultado. La interfaz Consumer se utiliza comúnmente para realizar
        acciones o efectos secundarios sobre un objeto, como imprimirlo en la consola, agregarlo a una
        colección, o cualquier otra operación que no requiera devolver un valor.
         */
        // Creación de un Consumer<String> usando una expresión lambda
        Consumer<String> consumidor = saludo -> {
            // Se declara una variable local llamada lenguaje
            String lenguaje = "Java";

            // Se imprime el saludo concatenado con una cadena adicional
            System.out.println(saludo + " Bienvenid@ a " + lenguaje + "!");
        };

        // Se invoca el método accept del Consumer con un argumento "Hola Pepe"
        consumidor.accept("Hola Pepe");

        // Creación de un BiConsumer<String, String> usando una expresión lambda
        BiConsumer<String, String> consumidor2 = (nombre, saludo) -> {
            // Se declara una variable local llamada lenguaje
            String lenguaje = "Java";

            // Se imprime el saludo, nombre y una cadena adicional
            System.out.println(saludo + " " + nombre + " Bienvenid@ a " + lenguaje + "!");
        };

        // Se invoca el método accept del BiConsumer con dos argumentos "Pepe" y "Hola"
        consumidor2.accept("Pepe", "Hola");


        /*
         La interfaz funcional Supplier<T> pertenece al paquete java.util.function y se utiliza para representar
         un proveedor de resultados. Esta interfaz no toma ningún argumento y produce un resultado de tipo T. Es decir,
         se utiliza cuando se necesita generar o proporcionar un valor, pero no se tiene ningún argumento para hacerlo.
         Se puede pensar en ello como una fábrica que suministra datos.
         */
        // Supplier que suministra un número aleatorio entre 1 y 100
        Supplier<Integer> generadorAleatorio = () -> new Random().nextInt(100) + 1;

        // Obtener el resultado del Supplier
        int numeroAleatorio = generadorAleatorio.get();

        System.out.println("Número aleatorio: " + numeroAleatorio);

        //la interfaz funcional Function<T,Q> pertenece al paquete java.util.Function y se
        // utiliza para crear un metodo  no explicito, que reciba parametros y retorneun valor.

        Function<String, Integer> sizeOf = (String s) -> {
            return s.length();
        };
        String mensaje= "Holissss";
        int longitud = sizeOf.apply(mensaje);
        System.out.println("Longitud del mesaje: "+longitud);

        //la interfaz funcional Predicae<T> pertenece al paquete java.util.Function y se
        // utiliza para retornar un valor booleano: true o false

        Predicate<Integer> esPar = numero -> numero % 2 == 0;

        System.out.println("¿4 es par? : " + esPar.test(4));
        System.out.println("¿7 es par? : " + esPar.test(7));

    }
}