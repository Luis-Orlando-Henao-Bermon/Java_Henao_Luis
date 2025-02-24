
package dia6;

public class CuentaAhorro extends CuentaBancaria{
    private double tasaInteres;

    public CuentaAhorro(double tasaInteres, String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
        this.tasaInteres = tasaInteres;
    }
    
    public void aplicarInteres(){
        double interes=(super.getSaldo()*tasaInteres)/100;
        super.setSaldo(super.getSaldo()+interes);
        
        System.out.println("El nuevo saldo es: "+super.getSaldo());
    }

    @Override
    public String toString() {
        return "Numero de cuenta: "+super.getNumeroCuenta()+"\nSaldo: "+super.getSaldo() + "\nTasa de Interes: " + tasaInteres + '%';
    }
    
    
}
