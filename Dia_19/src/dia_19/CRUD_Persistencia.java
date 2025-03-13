package dia_19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CRUD_Persistencia {
    private static final String ARCHIVO = "./src/dia_19/persona.txt";
    private static List<Persona> personas = new ArrayList<>();

    // Cargar datos desde el archivo
    public static void cargarDatos() {
        personas.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                personas.add(Persona.fromString(linea));
            }
        } catch (IOException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo.");
        }
    }

    // Guardar datos en el archivo
    public static void guardarDatos() {
        try (FileWriter writer = new FileWriter(ARCHIVO)) {
            for (Persona p : personas) {
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

    // Eliminar
    public static void eliminarPersona(int id) {
        personas.removeIf(p -> p.getId() == id);
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
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

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
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        sc.close();
    }
}

