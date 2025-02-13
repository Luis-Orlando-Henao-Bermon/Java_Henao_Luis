
package proyecto_dia3;

public class Cliente {
    int ID;
    String Nombre;
    String Apellido;
    String Correo;
    String Telefono;

    public Cliente(int ID, String Nombre, String Apellido, String Correo, String Telefono) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Telefono = Telefono;
    }

    @Override
    public String toString() {
        return "ID: " + ID + "\nNombre: " + Nombre + "\nApellido: " + Apellido + "\nCorreo: " + Correo + "\nTelefono: " + Telefono + "\n";
    }

        
    
    
}
