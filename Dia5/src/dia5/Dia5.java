
package dia5;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.Collections;


public class Dia5 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<Hospital> HospitalList = new ArrayList<>();
        
        Hospital hospital1=new Hospital(1, "Regional norte", "Carrera 1 diagonal 2");
        HospitalList.add(hospital1);
        Departamento departamento1=new Departamento(1, "Anestesia y Reanimación", "De operaciones");
        
        Empleado empleado1=new Empleado(1,1, "Doctor Anestesiólogo", "07-05-2010", 3000000, 1, "Juan", "Andres", "Mendoza", "Perez", "Carrera 24 via 12");
        
        Equipo_Medico equipoMedico1=new Equipo_Medico(1,1);
        
        Paciente paciente1=new Paciente(1, "07-03-2004", 1095568484, "Luis", "Orlando", "Henao", "Bermon", "Carreta42 #2-14");
        
        Pabellon pabellon1=new Pabellon(1, "Quirúrgico", 30);
        
        Ingresos ingreso1=new Ingresos(1, "21-02-2025", 1, 1, 1);
        
        System.out.println("---------Hospital---------");
        System.out.println(hospital1);
        System.out.println("---------Departamento---------");
        System.out.println(departamento1);
        System.out.println("---------Empleado---------");
        System.out.println(empleado1);
        System.out.println("---------Equipo medico---------");
        System.out.println(equipoMedico1);
        System.out.println("---------Paciente---------");
        System.out.println(paciente1);
        System.out.println("---------Pabellon---------");
        System.out.println(pabellon1);
        System.out.println("---------Ingreso---------");
        System.out.println(ingreso1);
        
        
        
        boolean boleanito=true;
        
        while (boleanito==true) {   
            limpiar(40);
            System.out.println("1. Añadir Hopital\n2. Eliminar hospital\n3. Actualizar hospital\n4. Ver hospitales\n5. Salir");
            int opcion=scan.nextInt();
            limpiar(40);
            scan.nextLine();
            switch (opcion) {
            
                case 1:
                    int id=HospitalList.get(HospitalList.size()-1).getId() + 1;

                    System.out.println("Ingresa el nombre del nuevo hospital");
                    String nombre=scan.nextLine();

                    System.out.println("Ingresa la direccion del hospital");
                    String Direccion=scan.nextLine();

                    Hospital newHospital=new Hospital(id, nombre, Direccion);
                    HospitalList.add(newHospital);
                    System.out.println("Preeciona enter para continuar");
                    scan.nextLine();

                    break;

                case 2:
                    MostrarHospital(HospitalList);
                    System.out.println("Ingresa el id del hospital que quieres eliminar");
                    int hEliminar=scan.nextInt();
                    scan.nextLine();
                    for (int i = 0; i < HospitalList.size(); i++) {
                        if (HospitalList.get(i).getId()==hEliminar) {
                            HospitalList.remove(i);
                        }
                    }
                    System.out.println("Preeciona enter para continuar");
                    scan.nextLine();
                    break;

                case 3:
                    System.out.println("Que deseas Actualizar\n1. Nombre\n2. Direccion");
                    
                    int opcActualizar=scan.nextInt();
                    scan.nextLine();
                    
                    MostrarHospital(HospitalList);
                    System.out.println("Ingresa el id del hospital que deseas actualizar");
                    
                    int idHActualizar=scan.nextInt();
                    scan.nextLine();
                    
                    int indexActualizar=0;
                    
                    for (Hospital hos : HospitalList) {
                        
                        if(hos.getId()==idHActualizar){
                            break;
                        }
                        indexActualizar++;
                    }
                    
                    
                    
                    if (opcActualizar==1) {
                        System.out.println("Ingresa el nuevo nombre");
                        String nombreA=scan.nextLine();
                        HospitalList.get(indexActualizar).setNombre(nombreA);
                    }
                    else if (opcActualizar==2) {
                        System.out.println("Ingresa la nueva direccion");
                        String direccionA=scan.nextLine();
                        HospitalList.get(indexActualizar).setDireccion(direccionA);
                    }
                    
                    System.out.println("Preeciona enter para continuar");
                    scan.nextLine();
                    
                    break;

                case 4:
                    MostrarHospital(HospitalList);
                    
                    System.out.println("Preeciona enter para continuar");
                    scan.nextLine();
                    
                    break;
                    
                case 5:
                    boleanito=false;
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                    
                    System.out.println("Preeciona enter para continuar");
                    scan.nextLine();
                    
                    break;
                    
            }
        
        }
        
    }
    
    public static void limpiar(int lineas)
    {
     for (int i=0; i < lineas; i++)
     {
      System.out.println();
     }
    }
    
    public static void MostrarHospital(ArrayList<Hospital> hospitalList){
        for (int i = 0; i< hospitalList.size()  ; i++) {
            System.out.println("-----------------------------");
            System.out.println(hospitalList.get(i));
            System.out.println();
        }
    }
}
