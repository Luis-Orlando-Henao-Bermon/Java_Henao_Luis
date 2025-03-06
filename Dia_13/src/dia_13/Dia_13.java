
package dia_13;

public class Dia_13 {
    
    public static void main(String[] args) {
        /*
        ## 1. Principios SOLID

        Mencione cuáles son los principios denominados SOLID y describa brevemente sus características.
        
        1. S – Single Responsibility Principle (SRP) - Principio de responsabilidad unica
        
            Una clase debe tener una única razón para cambiar
            es decir, debe encargarse de una sola responsabilidad.
        
        2. O – Open/Closed Principle (OCP) - Principio abierto/cerrado
        
            Las clases deben estar abiertas para la extensión, pero cerradas para la modificación.
        
        3. L – Liskov Substitution Principle (LSP) - Principio de sustitucion de Liskov
        
            Si S es una subclase de T, entonces los objetos de tipo T pueden ser reemplazados
            por objetos de tipo S sin alterar el comportamiento correcto del programa.
        
        4. I – Interface Segregation Principle (ISP) - Principio de segregacion de interface
        
            // Las interfaces deben ser específicas y no forzar a una clase a
            // implementar métodos que no necesita.
        
        5. D – Dependency Inversion Principle (DIP) - Principio de inversion de dependencias
        
            Los módulos de alto nivel no deben depender de módulos de bajo nivel. Ambos deben depender de abstracciones.
            Las abstracciones no deben depender de los detalles. Los detalles deben depender de las abstracciones.
        */
        
        /*
        ## 2. Evaluación de principios SOLID en un código existente

        ### Caso: Transferencias superiores a $50,000 requieren notificación

        En una organización, cuando se realizan transferencias superiores a los $50.000, se debe enviar un mail con información de dicha transferencia, notificando al auditor del área para que dé su aprobación.

        Evaluar qué principio SOLID no se está cumpliendo y proponer una solución que mantenga la correctitud de los tests.

        [Código completo](https://github.com/elagarrigue/AyDS-TP-SOLID/tree/master/src/ayds/tp1/ej2)

        ### Código original:

        ```java
        public class AuditTransfMonet {

            public void transferenciaRealizada(Transferencia transferencia) {
                if (this.esTransferenciaImportante(transferencia)) {
                    String auditor = this.obtenerDireccionMailAuditor();
                    String mensaje = this.componerMensajeAviso(transferencia);
                    ConexionMail conexionMail = null;

                    try {
                        conexionMail = this.abrirConexionMail();
                        conexionMail.enviar(new Mail().to(auditor).withBody(mensaje));
                    } finally {
                        if (conexionMail != null) conexionMail.cerrar();
                    }
                }
            }

            private boolean esTransferenciaImportante(Transferencia transferencia) {
                return transferencia.importe() > 50000;
            }

            private String obtenerDireccionMailAuditor() {
                return "mail-auditor";
            }

            private String componerMensajeAviso(Transferencia transferencia) {
                return "aviso-transferencia-importante";
            }

            private ConexionMail abrirConexionMail() {
                return ConexionMail.getInstance();
            }
        }
        ```
        */
    }
    
}
