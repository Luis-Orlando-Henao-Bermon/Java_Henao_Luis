/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia6;

import java.text.DecimalFormat;

/**
 *
 * @author Uniminuto Tibu
 */
public class Dia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*CuentaBancaria cienta1=new CuentaBancaria("AYS78ASD97", 1000000000);
        
        DecimalFormat formato = new DecimalFormat("#,###,###");
        
        System.out.println(formato.format(cienta1.getSaldo()));
        
        cienta1.Depositar(2500000);
        System.out.println(cienta1.getSaldo());
        cienta1.retirar(9000000);
        
        System.out.println(cienta1.getSaldo());*/
        
        Empleado empleado1=new Empleado("Luis", 1, 1000000);
        
        System.out.println(empleado1.getNombre());
        empleado1.setNombre("jose");
        System.out.println(empleado1.getSalario());
        empleado1.setSalario(2000000);
        
        empleado1.MostrarInformacion();
        
    }
    
}
