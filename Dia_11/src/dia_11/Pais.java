/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_11;

/**
 *
 * @author Uniminuto Tibu
 */
public enum Pais {
    // Enumeradores
    // Un enumerador es una clase especial que restringe la creación de objetos a los valores específicamente
    // definidos en su implementación.
    ESPANA("España", "Madrid"),
    FRANCIA("Francia", "París"),
    ITALIA("Italia", "Roma"),
    ALEMANIA("Alemania", "Berlín"),
    REINO_UNIDO("Reino Unido", "Londres");

    // Variables de instancia para nombre y capital del país
    private String nombre;
    private String capital;

    // Constructor privado para inicializar las variables de instancia
    private Pais(String nombre, String capital) {
        this.nombre = nombre;
        this.capital = capital;
    }

    // Método para obtener el nombre del país
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la capital del país
    public String getCapital() {
        return capital;
    }    
}
