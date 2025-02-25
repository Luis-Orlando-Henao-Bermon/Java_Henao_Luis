
package dia_7;

public class Perro extends Animal{
    private String raza;
    private int edad;
    private String sexo;

    public Perro() {
    }

    public Perro(String nombre, String especie, String habitat, boolean tienePelos, int cantPatas) {
        super(nombre, especie, habitat, tienePelos, cantPatas);
    }

    public Perro(String nombre) {
        super(nombre);
    }
      
    public Perro(String raza, int edad, String sexo) {
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Perro(String raza, int edad, String sexo, String nombre, String especie, String habitat, boolean tienePelos, int cantPatas) {
        super(nombre, especie, habitat, tienePelos, cantPatas);
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro " + super.nombre+" dice guauuuuuuuuuuu!!"); 
    }
    
    
    public void moverCola(){
        System.out.println("El perrito "+super.nombre+" mueve la cola");
    }
    
}
