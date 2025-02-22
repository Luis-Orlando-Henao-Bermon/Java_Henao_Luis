
package dia5;


public class Dia5 {

    public static void main(String[] args) {
        Hospital hospital1=new Hospital(1, "Regional norte", "Carrera 1 diagonal 2");
        
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
    }
    
}
