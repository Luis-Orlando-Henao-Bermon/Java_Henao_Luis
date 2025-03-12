
package dia_18.Explicacion2;


public class Counter extends Thread{
    private int c=0;
    
    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }

    public synchronized void run(){
        
        for(int i =0;i<10000000;i++){
            this.increment();
            this.decrement();
        }
    }
    
    
}
