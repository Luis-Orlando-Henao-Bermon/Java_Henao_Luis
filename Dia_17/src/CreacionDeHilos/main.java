/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CreacionDeHilos;

/**
 *
 * @author Uniminuto Tibu
 */
public class main {
    //Ejemplo creación de hilo extendiendo de Thread. 
    public static class MyThread extends Thread {

        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {

            System.out.println("Executing thread " + Thread.currentThread().getName());
        }

    }
    //Ejemplo creación de hilo extendiendo de Runnable.
    public static class MyRunnable implements Runnable {

        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(i+1 +". Hola desde el hilo id:" + Thread.currentThread().getId());
                try {
                    Thread.sleep(3000); // Espera 1 segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class MiHilo implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(i+1 +". Hola desde el hilo id:" + Thread.currentThread().getId());
                try {
                    Thread.sleep(3000); // Espera 1 segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        //Ejemplo creación de hilo extendiendo de Thread. 
        MyThread myThread = new MyThread("myThread");
        myThread.start();
        //------------------------------------------------
        
        
        //Ejemplo creación de hilo extendiendo de Runnable.
        Thread myThread2 = new Thread(new MyRunnable(), "myRunnable");
        myThread2.start();

        Thread miHilo=new Thread(new MiHilo(),"Hilo1");
        miHilo.start();
        
    }
}
