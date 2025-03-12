
package dia_18.Explicacion3;

public class PingPongSincronizado extends Thread{
    
    private String word; // 2 usages
    public PingPongSincronizado(String s) {
        word = s;
    }

    public void run() {
        synchronized(getClass()){
            for (int i = 0; i < 3000; i++) {
                System.out.println(word);
                System.out.flush();
                getClass().notify();
                try {
                    getClass().wait();
                } catch (InterruptedException e) {
                }
                getClass().notify();
            }
            
        }
    }

    
}
