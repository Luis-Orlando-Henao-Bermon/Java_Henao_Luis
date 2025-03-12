
package dia_18.Ejercicio;

public class Carrera {
    
    public static void main(String[] args) {
        Thread deportista1= new Thread(new Deportista(), "Deportista 1");
        Thread deportista2= new Thread(new Deportista(), "Deportista 2");
        Thread deportista3= new Thread(new Deportista(), "Deportista 3");
        Thread deportista4= new Thread(new Deportista(), "Deportista 4");
        
        deportista1.start();
        deportista2.start();
        deportista3.start();
        deportista4.start();
        
    }
            
}
