
package Singleton;

// Singleton
// Garantiza que solo haya una instancia de una clase en todo el programa.
public class main {
    static class Singleton {
        private static Singleton instancia;

        private Singleton() {} // Constructor privado

        public static Singleton getInstance() {
            if (instancia == null) {
                instancia = new Singleton();
            }
            return instancia;
        }

        public void mostrarMensaje() {
            System.out.println("Instancia Única de Singleton");
        }
    }
    // Uso
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton1.mostrarMensaje();

        System.out.println(singleton1 == singleton2); // true, misma instancia
    }
}



/*public class main {
    
    El Patrón de Diseño Creacional Singleton es un patrón que garantiza que una clase tenga una única
    instancia en todo el programa y proporciona un punto de acceso global a ella.
     
    static class Singleton {
        private static Singleton instance; // Única instancia

        private Singleton() {} // Constructor privado

        public static Singleton getInstance() {
            if (instance == null) {  // Se crea solo una vez
                instance = new Singleton();
            }
            return instance;
        }
    }

}*/
