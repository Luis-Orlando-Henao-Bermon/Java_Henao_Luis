
package dia_7;

public class Animal {
    
    protected String nombre;
    protected String especie;
    protected String habitat;
    protected boolean tienePelos;
    protected int cantPatas;

    public Animal() {
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }
   
    public Animal(String nombre, String especie, String habitat, boolean tienePelos, int cantPatas) {
        this.nombre = nombre;
        this.especie = especie;
        this.habitat = habitat;
        this.tienePelos = tienePelos;
        this.cantPatas = cantPatas;
    }
    
    //Metodo para todos los animales
    public void hacerSonido(){
        System.out.println("El animalito hace un sonido");
    }
    
        
}
