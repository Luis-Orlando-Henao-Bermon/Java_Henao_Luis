
package dia6;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria() {
    }
       
    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void Depositar(double cantidad){
        if (cantidad>0) {
            saldo=saldo+cantidad;
            System.out.println("Saldo agregado con exito :yay:");
        }
        else{
            System.out.println("La cantidad a depositar debe ser positiva :sadfeis:");
        }
    }
    
    
    public void retirar(double cantidad){
        if (cantidad>0 && cantidad<=saldo) {
            saldo-=cantidad;
            System.out.println("Su retiro fue realizado!!! :happyfeis:");
        }
        else if (cantidad>saldo){
            System.out.println("No tiene fondos suficientes");
        }
        else{
            System.out.println("Por favor ingresa una cantidad positiva");
        }
    }
}
