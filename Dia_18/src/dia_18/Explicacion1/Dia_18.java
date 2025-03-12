
package dia_18.Explicacion1;

public class Dia_18 {//causa que se implemente Runnable

    public static void main(String[] args) {
        Thread t1= new PingPong("P");
        Thread t2= new PingPong("S");
        
        t1.start();
        t2.start();
    }
       
}
