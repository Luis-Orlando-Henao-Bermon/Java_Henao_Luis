
package Singleton;

public class main {
    /*
    El Patrón de Diseño Creacional Singleton es un patrón que garantiza que una clase tenga una única
    instancia en todo el programa y proporciona un punto de acceso global a ella.
     */
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

}
