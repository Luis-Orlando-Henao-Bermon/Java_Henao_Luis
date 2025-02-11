
package dia2;

import java.util.ArrayList;

public class Dia2 {

    public static void main(String[] args) {
        // instancia la clase carro
        
        carro carrito1= new carro();
        carro carrito2=new carro("Audi","A4",2010);
        carro carrito3= new carro("Toyota","Tundra",2025,"Diesel",1000,2800,5,7,"negro petroleo",5);
        System.out.println(carrito1);
        System.out.println(carrito2);
        System.out.println(carrito3);
        
        //Asignar valores a un objeto
        
        carrito1.modelo="Twingo";
        carrito1.marca="Renault";
        
        System.out.println(carrito1.modelo);
        
        ArrayList<carro> listaCarro=new ArrayList<>();
        
        System.out.println(listaCarro);
        
        listaCarro.add(carrito1);
        listaCarro.add(carrito2);
        listaCarro.add(carrito3);
        System.out.println(listaCarro);
        System.out.println(listaCarro.get(2));
        
        
    }
    
}
