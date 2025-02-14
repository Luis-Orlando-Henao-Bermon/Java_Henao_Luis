
package proyecto_dia4;

public class Proyecto_Dia4 {

    public static void main(String[] args) {
        
        Persona persona1=new Persona();
        
        Persona persona2=new Persona("Luis","Henao",20);
        
        Estudiante estudiante1 =new Estudiante(11,"Laura","Salamanca",15);
        
        System.out.println(persona1.getNombre());
        
        persona1.setNombre("Jose");
        
        System.out.println(persona1.getNombre());
        System.out.println(estudiante1.getGrado());
        
        System.out.println(persona2);
        persona2.setEdad(21);
        
        System.out.println(persona2);
        
        System.out.println(estudiante1);
    }
    
}
