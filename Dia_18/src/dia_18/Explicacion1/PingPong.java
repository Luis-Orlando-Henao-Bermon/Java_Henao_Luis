
package dia_18.Explicacion1;

public class PingPong extends Thread{
    
    private String word; // 2 usages
    public PingPong(String s) {
        word = s;
    }

    public void run() {
        for (int i = 0; i < 3000; i++) {
            System.out.println(word);
            System.out.flush();
        }
    }

    
}
