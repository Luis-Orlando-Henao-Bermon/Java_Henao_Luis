
package proyecto_dia1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Proyecto_Dia1{
    // se crea el metodo que muestre el menu de opciones y obtenga uuna opcion valida
    public static int Menu(){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n1. Mostrar todos los productos");
        System.out.println("2. Actualizar un producto");
        System.out.println("3. Agregar un producto");
        System.out.println("4. Eliminar un producto");
        System.out.println("5. Salir");
        System.out.println("Ingrese una opcion: ");

        int opcion=scan.nextInt();

        while (opcion<1||opcion>5) {
            System.out.println("Por favor ingresa un a opcion validad");
            opcion=scan.nextInt();
        }
        return opcion;
    }

    // Se crea el metodo para mostrar los productos
    public static void Mostrar_productos(ArrayList<HashMap<String, Object>> productos){
        for (int i = 0; i < productos.size(); i++) {
            int count=i+1;
            System.out.println("-----------//-----------/"+count+"/-----------//-----------");
            System.out.println("Nombre: " + productos.get(i).get("Nombre") + "\nValor: " + productos.get(i).get("Valor") + "\nCantidad: " + productos.get(i).get("Cantidad")+"\n");
        }
    }


    // Se crea el metodo para actualizar el nombre a un producto

    public static void Actualizar_nombre(ArrayList<HashMap<String, Object>> productos, int posicion, String nuevo_nombre){
        HashMap<String, Object> producto = productos.get(posicion-1);
        producto.put("Nombre", nuevo_nombre);
        productos.set(posicion-1, producto);
        System.out.println("Nombre actualizado con exito");
    }
    // Se crea el metodo para actualizar el valor a un producto

    public static void Actualizar_valor(ArrayList<HashMap<String, Object>> productos, int posicion, String nuevo_valor){
        HashMap<String, Object> producto = productos.get(posicion-1);
        producto.put("Valor", nuevo_valor);
        productos.set(posicion-1, producto);
        System.out.println("Valor actualizado con exito");
    }
    
    // Se crea el metodo para actualizar la cantidad a un producto

    public static void Actualizar_cantidad(ArrayList<HashMap<String, Object>> productos, int posicion, String nueva_cantidad){
        HashMap<String, Object> producto = productos.get(posicion-1);
        producto.put("Cantidad", nueva_cantidad);
        productos.set(posicion-1, producto);
        System.out.println("Cantidad actualizada con exito");
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //se crea una lista de diccionarios para poder guardar de mejor manera la informacion de los productos
        ArrayList<HashMap<String, Object>> lista =new ArrayList<>() ;

        //se crean los HashMap para poder guardar la informacion de los productos
        
        // Producto 1
        HashMap<String, Object> producto1 = new HashMap<>();
        producto1.put("Nombre", "Mouse");
        producto1.put("Valor", 50000);
        producto1.put("Cantidad", 15);
        lista.add(producto1);

        // Producto 2
        HashMap<String, Object> producto2 = new HashMap<>();
        producto2.put("Nombre", "Teclado");
        producto2.put("Valor", 80000);
        producto2.put("Cantidad", 10);
        lista.add(producto2);
        
        // Producto 3
        HashMap<String, Object> producto3 = new HashMap<>();
        producto3.put("Nombre", "Monitor");
        producto3.put("Valor", 300000);
        producto3.put("Cantidad", 5);
        lista.add(producto3);
        
        // Producto 4
        HashMap<String, Object> producto4 = new HashMap<>();
        producto4.put("Nombre", "Impresora");
        producto4.put("Valor", 200000);
        producto4.put("Cantidad", 8);
        lista.add(producto4);
        
        // Producto 5
        HashMap<String, Object> producto5 = new HashMap<>();
        producto5.put("Nombre", "Laptop");
        producto5.put("Valor", 1500000);
        producto5.put("Cantidad", 3);
        lista.add(producto5);

        
        int opcionMenu=Menu();
        
        Boolean finalizar=false ;
        
        while (finalizar==false){

            switch (opcionMenu) {
                case 1 -> {
                    // Se llama al metodo para mostrar los productos
                
                    Mostrar_productos(lista);
                    System.out.println("");
                    opcionMenu=Menu();
                }
                    
                case 2 -> {
                    Mostrar_productos(lista);
                    System.out.println("Ingrese el numero del producto que desea actualizar");
                    int productoActualizar=scan.nextInt();

                    System.out.println("¿Que desea actualizar?\n1. Nombre\n2. Valor\n3. Cantidad\nEscriba el numero de la opcion que desee");
                    int opcionActualizar=scan.nextInt();
                    scan.nextLine();
                    
                    switch (opcionActualizar) {
                        case 1 -> {
                            System.out.println("Ingrese el nuevo nombre del producto");
                            String nuevoNombre=scan.nextLine();
                            Actualizar_nombre(lista, productoActualizar, nuevoNombre);
                        }
                        case 2 -> {
                            System.out.println("Ingrese el nuevo valor del producto");
                            String nuevoValor=scan.nextLine();
                            Actualizar_valor(lista, productoActualizar, nuevoValor);
                        }
                        case 3 -> {
                            System.out.println("Ingrese La nueva cantidad del producto");
                            String nuevaCantidad=scan.nextLine();
                            Actualizar_cantidad(lista, productoActualizar, nuevaCantidad);
                        }
                        default -> System.out.println("Opcion invalida");
                    }
                    opcionMenu=Menu();
                }


                    
                case 3 -> {
                    System.out.println("Ingrese el nombre del nuevo producto");
                    String nuevoProductoNombre=scan.nextLine();

                    System.out.println("Ingrese el Valor del nuevo producto");
                    String nuevoProductoValor=scan.nextLine();

                    System.out.println("Ingrese la cantidad del nuevo producto");
                    String nuevoProductoCantidad=scan.nextLine();

                    HashMap<String, Object> productoNuevo = new HashMap<>();
                    productoNuevo.put("Nombre", nuevoProductoNombre);
                    productoNuevo.put("Valor", nuevoProductoValor);
                    productoNuevo.put("Cantidad",nuevoProductoCantidad);
                    lista.add(productoNuevo);
                    System.out.println("Producto agregado con exito");
                                
                    opcionMenu=Menu();
                }
                    
                case 4 -> {
                    System.out.println("Ingresa el numero del producto que deseas eliminar");
                    int opcionProductoEliminar=scan.nextInt();
                    lista.remove(opcionProductoEliminar-1);
                    System.out.println("Producto eliminado con exito");
                    opcionMenu=Menu();
                }
                    
                case 5 -> finalizar=true;

            }
            
        }
        scan.close();
    }
}