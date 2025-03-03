/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia_11;

/**
 *
 * @author Uniminuto Tibu
 */
public class TryCatch {
    // Manejo de excepciones (try-catch)
    // En Java, el bloque try-catch se usa para manejar excepciones, con el
    // fin de evitar que un error detenga abruptamente la ejecución
    // del programa.
    public static void main(String[] args) {
        try {
            int numero1=10;
            int numero2=0;
            int resultad=numero1/numero2;
            System.out.println(resultad);
        } catch (ArithmeticException e) {
            
            System.out.println("No se te olvide que no puedes dividir por cero  "+e.getMessage());
            
        }finally{
            System.out.println("Fin del programa");
        }
    }

}
