package dia_18.Ejercicio;

import java.time.Duration;
import java.lang.Math;

public class Deportista implements Runnable{
    
    public void run(){
        synchronized (getClass()) {
            int range=11-9+1;
            int milisegundos=(int)((Math.random()*range)+9)*1000;

            System.out.println(Thread.currentThread().getName()+" tomo el testigo");
            getClass().notifyAll();
            try {
                Thread.sleep(milisegundos);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" entrego el testigo en "+milisegundos/1000+" segundos");
            
            try {
                getClass().wait();
            } catch (InterruptedException e) {
                
            }
            getClass().notifyAll();
            
        }
        
        
    }
}
