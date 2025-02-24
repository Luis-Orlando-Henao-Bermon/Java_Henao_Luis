
package dia6;

public class InventarioTest {
    public static void main(String[] args) {
        Producto p1=new Producto("JAT245", "Iphone13", 15, 3000000);
        Producto p2=new Producto("GTUS846", "Xiaomi redmi note 11", 50, 1500000);
        Producto p3=new Producto("A7S6D8AS", "Audifonos diadema", 20, 50000);
        
        //venta de producto 1
        
        p1.actualizarStock(-3);
        
        System.out.println(p1);
        
        //  reposicicion de stock en producto 1
        System.out.println("");
        
        p1.actualizarStock(20);
        System.out.println(p1);
        
        
    }
}
