/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOLID.SRP;

/**
 *
 * @author Uniminuto Tibu
 */
public class Good {
    class Report {
        public void generateReport() {
        // Genera un informe
        }
    }
    
    class ReportSaver {
        public void saveToFile(String filename, Report report) {
            // Guarda el informe en un archivo
        }
    }
}
