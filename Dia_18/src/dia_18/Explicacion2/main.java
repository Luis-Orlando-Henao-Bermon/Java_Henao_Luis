
package dia_18.Explicacion2;

public class main {
    
    public static void main(String[] args) {
        
        Counter h1=new Counter();
        Counter h2=new Counter();
        
        
        h1.start(); 
        h2.start();
        System.out.println("valor1: " +h1.value());
        System.out.println("valor2: " +h2.value());
        
        
    }
}
