
package proyecto_dia2;

public class Menus {

    public static void menuCamper(String nombre) {
        System.out.println("/////////////////////////////////////////////////");
        System.out.println("-------------- Bienvenido " + nombre + " ----------------------------");
        System.out.println("          1). Reportes.");
        System.out.println("          2). Cambiar usuarios y contraseñas.");
        System.out.println("          3). Cambiar información.");
        System.out.println("          4). Salir.");
        System.out.println("    -------------------------------------------------");
        System.out.println("    /////////////////////////////////////////////////");
    }

    public static void menuCamperOpc1() {
        System.out.println("""
            ---------------------REPORTES---------------------
                  1). Mostrar datos del Camper.
                  2). Riesgo del camper.
                  3). Ruta del camper.
                  4). Trainer del camper.
                  5). Módulo en el que se encuentra el camper.
                  6). Salir.
            --------------------------------------------------
            """);
    }

    public static void menuCamperOpc3() {
        System.out.println("""
            ----------------- Cambiar información ------------------
                  1). Cambiar dirección.
                  2). Cambiar teléfono móvil.
                  3). Cambiar teléfono fijo.
                  4). Salir.
            --------------------------------------------------------
            """);
    }

    public static void menuTrainer(String nombre) {
        System.out.println("//////////////////////////////////////////////////");
        System.out.println("----------- BIENVENIDO " + nombre + " --------------------");
        System.out.println("          1). Cambiar usuario y contraseña.");
        System.out.println("          2). Ruta de entrenamiento.");
        System.out.println("          3). Cambiar información.");
        System.out.println("          4). Salir.");
        System.out.println("    ---------------------------------------------------");
        System.out.println("    ///////////////////////////////////////////////////");
    }

    public static void menuTrainerOpc3() {
        System.out.println("""
            ----------------- Cambiar información ---------------
                  1). Cambiar dirección.
                  2). Cambiar teléfono móvil.
                  3). Cambiar teléfono fijo.
                  4). Salir.
            -----------------------------------------------------
            """);
    }

    public static void menuCoordinador() {
        System.out.println("//////////////////////////////////////////////////////////////////////");
        System.out.println("    ---------------- Bienvenido  ----------------------------");
        System.out.println("          1). Cambiar información de todo el sistema educativo.");
        System.out.println("          2). Ver Informacion de usuarios"); 
        System.out.println("          3). Crear nuevos usuarios.");
        System.out.println("          4). Eliminar usuarios.");
        System.out.println("          5). Salir.");
        System.out.println("    -----------------------------------------------------------------------");
        System.out.println("    ///////////////////////////////////////////////////////////////////////");
    }

    public static void menuCoordinadorOpc6() {
        System.out.println("""
            ---------------------------------    Reporte   ----------------------------------------------------
                  1). Listar los campers que se encuentren en estado inscrito.
                  2). Listar los campers que aprobaron el examen final.
                  3). Listar los trainers que se encuentran trabajando en Campusland.
                  4). Listar los campers que se encuentran en bajo rendimiento.
                  5). Listar los campers y trainers que se encuentren asociados a una ruta de entretenimiento.
                  6). Mostrar cuántos campers perdieron y aprobaron cada módulo.
                  7). Volver al menú anterior.
            ----------------------------------------------------------------------------------------------------
            """);
    }
}
