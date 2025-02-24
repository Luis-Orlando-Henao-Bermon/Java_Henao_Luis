
package dia6;

public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto() {
    }
    
    public Producto(String codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        
        if (cantidad>=0) {
            this.cantidad = cantidad;
            System.out.println("Cantidad agregada con exito!!");
        }
        else{
            System.out.println("Error: La cantidad no puede ser negativa");
        }
        
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        
        if (precio>0) {
            this.precio = precio;
            
            System.out.println("Precio agregado con exito");
        }
        else{
            System.out.println("Error: debes ingresar un precio mayor a \"0\"");
        }
               
    }
    public void actualizarStock(int cantidad){
        if (cantidad>=0) {
            this.cantidad+=cantidad;
        }
        else{
            if (cantidad<=this.cantidad) {
                this.cantidad+=cantidad;
            }
            else{
                System.out.println("Error: Stock insuficiente.");
            }
        }
    }

    @Override
    public String toString() {
        return "Codigo del producto: " + codigo + "\nNombre: " + nombre + "\nCantidad: " + cantidad + "\nPrecio: " + precio;
    }
    
    
    
    
}
