
package dia_18.Explicacion3;

public class main {
    public static void main(String[] args) {
        Thread t1= new PingPongSincronizado("H");
        Thread t2= new PingPongSincronizado("O");
        Thread t3= new PingPongSincronizado("L");
        Thread t4= new PingPongSincronizado("A");
        Thread t5= new PingPongSincronizado("S");
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
