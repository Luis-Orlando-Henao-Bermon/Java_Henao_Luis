
package dia6;

public class CuentaAhorroTest {
    public static void main(String[] args) {
        CuentaAhorro ahorro1=new CuentaAhorro(13, "HGY2T3R4D", 1000000);
        System.out.println(ahorro1);
        System.out.println("");
        
        ahorro1.Depositar(2000000);
        System.out.println(ahorro1);
        System.out.println("");
        
        ahorro1.retirar(1500000);
        System.out.println(ahorro1);
        System.out.println("");
        
        ahorro1.aplicarInteres();
        System.out.println("");
        System.out.println(ahorro1);
    }
}
