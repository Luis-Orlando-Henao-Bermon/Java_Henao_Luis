
package dia_7;

import java.util.ArrayList;
import java.util.Scanner;

public class Dia_7 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        /*
        Perro perro1=new Perro("Lucas");
        perro1.hacerSonido();
        perro1.moverCola();
        
        Animal miAnimal =new Perro("Firulais");
        
        miAnimal.hacerSonido();
        
        if (miAnimal instanceof Perro) {
            Perro miPerro=(Perro) miAnimal;
            miPerro.moverCola();
        }*/
        
        
        Coche coche1=new Coche(4, "Renault", "Sandero");
        Motocicleta moto1=new Motocicleta("Manillar recto", "Susuki", "Gn - 125");
        
        System.out.println("------------Coche------------");
        coche1.mostrarDetalles();
        System.out.println("");
        System.out.println("------------Motocicleta------------");
        moto1.mostrarDetalles();
        
        ArrayList<Empleado> listaEmpleados= new ArrayList<>();
        
        EmpleadoFijo em1=new EmpleadoFijo("Samuel lopez", 1800000);
        listaEmpleados.add(em1);
        EmpleadoFijo em2 = new EmpleadoFijo("Carla Rodríguez", 2200000);
        listaEmpleados.add(em2);
        
        EmpleadoFijo em3 = new EmpleadoFijo("Javier Méndez", 1950000);
        listaEmpleados.add(em3);

        EmpleadoFijo em4 = new EmpleadoFijo("Andrea Castillo", 2500000);
        listaEmpleados.add(em4);

        EmpleadoFijo em5 = new EmpleadoFijo("Luis Fernández", 2100000);
        listaEmpleados.add(em5);
        
        EmpleadoPorHoras em6=new EmpleadoPorHoras(50, "Jose Mendoza", 1500000);
        listaEmpleados.add(em6);
        
        EmpleadoPorHoras em7 = new EmpleadoPorHoras(40, "María Pérez", 1400000);
        listaEmpleados.add(em7);

        EmpleadoPorHoras em8 = new EmpleadoPorHoras(55, "Carlos Ramírez", 1600000);
        listaEmpleados.add(em8);

        EmpleadoPorHoras em9 = new EmpleadoPorHoras(35, "Ana Torres", 1300000);
        listaEmpleados.add(em9);

        EmpleadoPorHoras em10 = new EmpleadoPorHoras(60, "Fernando Gómez", 1750000);
        listaEmpleados.add(em10);
        
        
        boolean boleanito=true;
        while (boleanito==true) {            
            System.out.println("------Menu------\n1. Agragregar empleado fijo\n2. Agregar empleado por horas\n3. Mostrar informacion de los empleados con la bonificaion\n4. Salir");
            int opcion=scan.nextInt();
            scan.nextLine();
            
            switch(opcion){
                case 1:
                    
                    System.out.println("Ingrese el nombre del empleado");
                    String nombre=scan.nextLine();
                    
                    System.out.println("Ingrese el salario del empleado");
                    double salario=scan.nextDouble();
                    scan.nextLine();
                    
                    EmpleadoFijo empleadoAdd = new EmpleadoFijo(nombre,salario);
                    listaEmpleados.add(empleadoAdd);
                    
                    
                    break;
                
                case 2:
                    
                    System.out.println("Ingrese el nombre del empleado");
                    String nombreH=scan.nextLine();
                    
                    System.out.println("Ingrese el salario del empleado");
                    double salarioH=scan.nextDouble();
                    scan.nextLine();
                    
                    System.out.println("Ingresa las horas trabajadas del empleado");
                    int horasTrabajadas=scan.nextInt();
                    scan.nextLine();
                    
                    EmpleadoPorHoras emmpleadoPorHorasAdd = new EmpleadoPorHoras(horasTrabajadas,nombreH,salarioH);
                    
                    listaEmpleados.add(emmpleadoPorHorasAdd);
                    
                    break;
                    
                case 3:
                    
                    for (Empleado em : listaEmpleados) {
                        System.out.println("----------------------");
                        em.mostrarInformacion();
                        em.calcularBonificacion();
                        System.out.println("");
                    }
                    
                    break;    
                
                case 4:
                    
                    boleanito=false;
                    
                    break;    
                
                default:
                    System.out.println("Error: Por favor ingresa un a opcion invalida");
                    break;
            }
        }
    }
    
}
