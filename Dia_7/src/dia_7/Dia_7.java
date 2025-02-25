
package dia_7;

public class Dia_7 {

    public static void main(String[] args) {
        
        Perro perro1=new Perro("Lucas");
        perro1.hacerSonido();
        perro1.moverCola();
        
        Animal miAnimal =new Perro("Firulais");
        
        miAnimal.hacerSonido();
        
        if (miAnimal instanceof Perro) {
            Perro miPerro=(Perro) miAnimal;
            miPerro.moverCola();
        }
    }
    
}
