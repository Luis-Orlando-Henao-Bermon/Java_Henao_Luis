package persona.Gestion;

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
    public static void cargarDatos(List<Persona> personas) {
        IPersonaDAO metodos = new PersonaBD();
        metodos.listaPersonas(personas);
    }

        // Crear
    public static void agregarPersona(Persona persona) {
        IPersonaDAO metodos = new PersonaBD();
        metodos.agregarPersona(persona);
    }

    // Leer
    public static void listarPersonas() {
        cargarDatos(personas);
        if (personas.isEmpty()) {
            System.out.println("No hay personas registradas.");
        } else {
            for (Persona p : personas) {
                System.out.println(p.getId() + " - " + p.getNombre() + " - " + p.getEdad() + " años");
            }
        }
    }

    // Actualizar
    public static void actualizarPersona(Persona persona, int id) {
        IPersonaDAO metodos = new PersonaBD();
        if (metodos.modificarPersona(persona, id)==false) {
            System.out.println("Persona con ID " + id + " no encontrada.");
        }
    }

    // Eliminar
    public static void eliminarPersona(int id) {
        IPersonaDAO metodos = new PersonaBD();
        metodos.EliminarPersona(id);
    }


    public static void main(String[] args) {

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
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    agregarPersona(new Persona(nombre, edad));
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
                    actualizarPersona(new Persona( nuevoNombre, nuevaEdad),idActualizar);
                    break;

                case 4:
                    System.out.print("ID de la persona a eliminar: ");
                    int idEliminar = sc.nextInt();
                    eliminarPersona(idEliminar);
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

