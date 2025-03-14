package dia_20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CRUD {
    private static String archivo ="./src/dia_20/data.txt";
    private static List<Persona> personas = new ArrayList<>();
    private static List<Producto> productos = new ArrayList<>();

    public static void cargarDatos() {
        personas.clear();
        productos.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.startsWith("P,")){
                    personas.add(Persona.fromString(linea)); 
                } else if (linea.startsWith("Pr,")) {
                    productos.add(Producto.fromString(linea));
                }
            }
        } catch (IOException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo.");
        }
    }

    // Guardar datos en el archivo
    public static void guardarDatos() {
        try (FileWriter writer = new FileWriter(archivo)) {
            for (Persona p : personas) {
                writer.write(p.toString() + "\n");
            }for (Producto p : productos) {
                writer.write(p.toString() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error al guardar datos: " + e.getMessage());
        }
    }

    // Crear
    public static void agregarPersona(int id, String nombre, int edad) {
        personas.add(new Persona(id, nombre, edad));
        guardarDatos();
    }
    public static void agregarProducto(int id, String nombre, double precio) {
        productos.add(new Producto(id, nombre, precio));
        guardarDatos();
    }

    // Leer
    public static void listarPersonas() {
        if (personas.isEmpty()) {
            System.out.println("No hay personas registradas.");
        } else {
            for (Persona p : personas) {
                System.out.println(p.getId() + " - " + p.getNombre() + " - " + p.getEdad() + " años");
            }
        }
    }

    public static void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            for (Producto p : productos) {
                System.out.println(p.getId() + " - " + p.getNombre() + " - " + p.getPrecio() + "$");
            }
        }
    }

    // Actualizar
    public static void actualizarPersona(int id, String nuevoNombre, int nuevaEdad) {
        for (Persona p : personas) {
            if (p.getId() == id) {
                p.setNombre(nuevoNombre);
                p.setEdad(nuevaEdad);
                guardarDatos();
                return;
            }
        }
        System.out.println("Persona con ID " + id + " no encontrada.");
    }

    public static void actualizarProducto(int id, double nuevoPrecio) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                p.setPrecio(nuevoPrecio);
                guardarDatos();
                return;
            }
        }
        System.out.println("Producto con ID " + id + " no encontrado.");
    }

    // Eliminar
    public static void eliminarPersona(int id) {
        personas.removeIf(p -> p.getId() == id);
        guardarDatos();
    }

    public static void eliminarProducto(int id) {
        productos.removeIf(p -> p.getId() == id);
        guardarDatos();
    }

    public static void main(String[] args) {
        cargarDatos();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- CRUD Personas ---");
            System.out.println("1. Agregar Persona");
            System.out.println("2. Listar Personas");
            System.out.println("3. Actualizar Persona");
            System.out.println("4. Eliminar Persona");
            System.out.println("5. Agregar Producto");
            System.out.println("6. Listar Productos");
            System.out.println("7. Actualizar Producto");
            System.out.println("8. Eliminar Producto");
            System.out.println("9. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    agregarPersona(id, nombre, edad);
                    guardarDatos();
                    break;

                case 2:
                    listarPersonas();
                    break;

                case 3:
                    System.out.print("ID de la persona a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = sc.nextLine();
                    System.out.print("Nueva edad: ");
                    int nuevaEdad = sc.nextInt();
                    actualizarPersona(idActualizar, nuevoNombre, nuevaEdad);
                    guardarDatos();
                    break;

                case 4:
                    System.out.print("ID de la persona a eliminar: ");
                    int idEliminar = sc.nextInt();
                    eliminarPersona(idEliminar);
                    guardarDatos();
                    break;

                case 5:
                    System.out.print("ID: ");
                    int idP = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer
                    System.out.print("Nombre: ");
                    String nombreP = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    agregarProducto(idP, nombreP, precio);
                    guardarDatos();
                    break;

                case 6:
                    listarProductos();
                    break;

                case 7:
                    System.out.print("ID de la producto a actualizar: ");
                    int idActualizarP = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nuevo precio: ");
                    double nuevoPrecio= sc.nextDouble();
                    sc.nextLine();
                    actualizarProducto(idActualizarP, nuevoPrecio);
                    guardarDatos();
                    break;

                case 8:
                    System.out.print("ID de la persona a eliminar: ");
                    int idEliminarP = sc.nextInt();
                    sc.nextLine();
                    eliminarProducto(idEliminarP);
                    guardarDatos();
                    break;

                case 9:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 9);

        sc.close();

    }

}
