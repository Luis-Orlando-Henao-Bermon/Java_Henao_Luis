/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia_11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Uniminuto Tibu
 */
public class Dia_11 {

    /**
     * @param args the command line arguments
     */
    
    //Ejercicio2
    /*public static String power(int n, int p){
        String resultado="";
        int elevado=1;
        
        if(n==0&&p==0){
            resultado="java.lang.Exception: n and p should not be zero.";
        }else if(n<0||p<0){
            resultado="java.lang.Exception: n or p should not be negative.";
        }
        else{
            for(int i=0;i<p;i++){
                elevado*=n;
            }
            resultado=elevado+"";
        }
        
        
        return resultado;
    }*/
    public static void main(String[] args) {
        
        
        
        //Ejercicio 1
        /*
        try {
            Scanner scan=new Scanner(System.in);
            int numeo1=scan.nextInt();
            int numeo2=scan.nextInt();
            int resultado=numeo1/numeo2;
            System.out.println(resultado);
            
        } catch (java.util.InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }catch(ArithmeticException i){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        */
        
        /*TreeSet<String> treeSet = new TreeSet<>();

        // Agregar elementos al TreeSet
        treeSet.add("Manzana");
        treeSet.add("Banana");
        treeSet.add("Naranja");
        treeSet.add("Pera");

        // Mostrar los elementos del TreeSet
        System.out.println("Elementos en TreeSet: " + treeSet);
        //1. Importar iterator y navegar con este iterador
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
           System.out.println(iterator.next());
        }
        System.out.println("");
        //2. con un for-each
        for (String elemento : treeSet) {
            System.out.println(elemento);
        }
        
        //obtener el tamaño  del conjunto
        int tamano=treeSet.size();
        
        System.out.println(tamano);
           
        //convertirlo en un string
        
        String resultado=treeSet.toString();
        
        System.out.println(resultado);
        
        //Mapas
        //son una estructura de datos que me permite guardar informacion en forma de clave valor muy parecido a los diccionarios
        
        Map<String, Integer> hashMap = new HashMap<>();

        // Asignar valores al mapa usando el método put()
        hashMap.put("Juan", 25);
        hashMap.put("María", 30);
        hashMap.put("Luis", 28);
        hashMap.put("Ana", 35);

        // Acceder y mostrar los valores del HashMap
        System.out.println("Edad de Juan: " + hashMap.get("Juan"));
        System.out.println("Edad de María: " + hashMap.get("María"));
        System.out.println("Edad de Luis: " + hashMap.get("Luis"));
        System.out.println("Edad de Ana: " + hashMap.get("Ana"));
        
        //Para iterar entre un mapa 
        //1. con iterator
        
        Iterator<Map.Entry<String, Integer>> iterator2 = hashMap.entrySet().iterator();
        
        while (iterator2.hasNext()) {
           Map.Entry<String, Integer> entry = iterator2.next();
           String clave = entry.getKey();
           Integer valor = entry.getValue();
           System.out.println("Nombre: " + clave + ", Edad: " + valor);
        }
        
        System.out.println("");
        //2. Con bucle for
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String clave = entry.getKey();
            Integer valor = entry.getValue();
            System.out.println("Nombre: " + clave + ", Edad: " + valor);
         }
        
        System.out.println("");
        Pais francia=Pais.FRANCIA;
        
        System.out.println(francia.name());  // Devuelve un String con el nombre de la constante (FRANCIA)
        System.out.println(francia.toString());    // Devuelve un String con el nombre de la constante (FRANCIA)
        System.out.println(francia.ordinal());    // Devuelve un entero con la posición del enum según está declarada (1).
        System.out.println(francia.values());    // Devuelve un array que contiene todos los valores del enum
        
         // Acceder a las constantes de la enumeración
       Pais miPais = Pais.ESPANA;

       // Obtener información del país
       String nombrePais = miPais.getNombre();
       String capitalPais = miPais.getCapital();

       // Imprimir información del país
       System.out.println("País: " + nombrePais);
       System.out.println("Capital: " + capitalPais);*/
    }
    
}
