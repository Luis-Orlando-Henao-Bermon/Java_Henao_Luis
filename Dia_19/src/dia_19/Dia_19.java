
package dia_19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Dia_19 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
        //leer un archivo
        javax.swing.JFileChooser j = new javax.swing.JFileChooser();
        j.showOpenDialog(j);
        String path = j.getSelectedFile().getAbsolutePath();
        File archivo = new File(path);
        
        FileReader reader=  new FileReader(archivo);
        
        
        BufferedReader buffer =new BufferedReader(reader);
        
        String linea;
        while ((linea = buffer.readLine()) != null) {
            System.out.println(linea);
        }
        //escribir en un archivo
        FileWriter writer =new FileWriter(archivo,true);
        
        PrintWriter pw =new PrintWriter(writer);
        
        pw.println("Hola desde java al archivo \nyo estoy bien");
         writer.close();
         
        while ((linea = buffer.readLine()) != null) {
            System.out.println(linea);
        }
        
        //borrado de un archivo
        j.showOpenDialog(j);
        String path2 = j.getSelectedFile().getAbsolutePath();
        File archivoB = new File(path2);
        archivoB.delete();
    }
    
}
