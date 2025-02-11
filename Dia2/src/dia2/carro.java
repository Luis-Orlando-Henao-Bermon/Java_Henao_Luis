/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia2;

//primera parte de una clase: Nombre
public class carro {
    // Atributos
    String marca;
    String modelo;
    int anyo;   
    String tipoCombustible;
    int caballosFuerza;
    int puertas;
    int asientos;
    int motor;
    String color;
    int cantLlantas;
    
    //Constructor
    
    public carro (String marca,String modelo, int anyo){
        this.marca=marca;
        this.modelo=modelo;
        this.anyo=anyo;
        this.caballosFuerza=140;
        this.puertas=5;
        this.asientos=5;
        this.motor=2800;
        this.color="negro";
        this.cantLlantas=4;
    }

    public carro(String marca, String modelo, int anyo, String tipoCombustible, int caballosFuerza, int puertas, int asientos, int motor, String color, int cantLlantas) {
        this.marca = marca;
        this.modelo = modelo;
        this.anyo = anyo;
        this.tipoCombustible = tipoCombustible;
        this.caballosFuerza = caballosFuerza;
        this.puertas = puertas;
        this.asientos = asientos;
        this.motor = motor;
        this.color = color;
        this.cantLlantas = cantLlantas;
    }

    public carro() {
    }
    
    @Override
    public String toString() {
        return "carro{" + "marca=" + marca + ", modelo=" + modelo + ", anyo=" + anyo + ", tipoCombustible=" + tipoCombustible + ", caballosFuerza=" + caballosFuerza + ", puertas=" + puertas + ", asientos=" + asientos + ", motor=" + motor + ", color=" + color + ", cantLlantas=" + cantLlantas + '}';
    }
    
    

        
    
}
