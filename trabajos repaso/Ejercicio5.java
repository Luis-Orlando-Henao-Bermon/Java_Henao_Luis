import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto: ");
        int precio = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el tipo de cliente (A/B/C): ");
        String tCliente = scanner.nextLine();

        double precioFinal;

        if ((tCliente.equals("a")) ||(tCliente.equals("A"))) {
            precioFinal=precio-(precio*(30.00/100));
            System.out.println("El precio final con descuento es: "+precioFinal);
        }
        else if ((tCliente.equals("b"))|| (tCliente.equals("B"))) {
            System.out.println(precio);
            precioFinal=precio-(precio*(20.00/100));
            System.out.println("El precio final con descuento es: "+precioFinal);
        }
        else if ((tCliente.equals("c"))|| (tCliente.equals("C"))) {
            precioFinal=precio-(precio*(10.00/100));
            System.out.println("El precio final con descuento es: "+precioFinal);
        }
        else {
            System.out.println("Error: El tipo de cliente ingresado no existe");
        }
        scanner.close();
    }
}