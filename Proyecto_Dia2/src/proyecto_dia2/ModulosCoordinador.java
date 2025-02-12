
package proyecto_dia2;

import java.util.ArrayList;
import java.util.Scanner;

public class ModulosCoordinador {

    public static void cambiarUserPassword(ArrayList<Camper> listaCampers,ArrayList<Trainer> listaTrainers,Coordinador coordinador) {
        
        System.out.println("------Usuarios------\n1. Camper\n2. Trainer\n3. Coordinador\nSelecciona el usuario para cambiarle la informacion: ");
        Scanner scan = new Scanner(System.in);
        
        int opcion = scan.nextInt();
        scan.nextLine();

        switch (opcion) {
            case 1:

                Modulos.mostrarCampers(listaCampers);

                System.out.println("Ingrese el id del camper para cambiarle la contraseña");
                int idCamperPass = scan.nextInt();
                scan.nextLine();
                System.out.println("Ingrese la nueva contraseña para el camper");
                String nuevaPass = scan.nextLine();
                for (int i = 0; i < listaCampers.size(); i++) {
                    if (listaCampers.get(i).id == idCamperPass) {
                        listaCampers.get(i).user.put("contrasena",nuevaPass) ;
                        System.out.println("Contraseña cambiada con exito");
                    }
                }
                
                break;
        
            case 2:
            
                Modulos.mostrarTrainers(listaTrainers);

                System.out.println("Ingrese el id del trainer para cambiarle la contraseña");
                int idTrainerPass = scan.nextInt();
                scan.nextLine();

                System.out.println("Ingrese la nueva contraseña para el trainer");
                String nuevaPassTrainer = scan.nextLine();

                for (int i = 0; i < listaTrainers.size(); i++) {
                    if (listaTrainers.get(i).id == idTrainerPass) {
                 
                        listaTrainers.get(i).user.put("contrasena",nuevaPassTrainer);
                        System.out.println("Contraseña cambiada con exito");
                        
                    }   
                }
                
                
                break;
                
            case 3:
                
                System.out.println("Ingrese la nueva contraseña para el coordinador");
                String nuevaPassCoordinador = scan.nextLine();

                coordinador.user.put("contrasena", nuevaPassCoordinador);                
                System.out.println("Contraseña cambiada con exito");
                
                break;
        
            default:
                break;
        }

        
    };
    
    public static void cambiarInfo(ArrayList<Camper> listaCampers,ArrayList<Trainer> listaTrainers,Coordinador coordinador,ArrayList<String> grupos){
        Scanner scan = new Scanner(System.in);

        System.out.println("------Usuarios------\n1. Camper\n2. Trainer\n3. Coordinador\nSelecciona el usuario para cambiarle la informacion: ");
        int usuarioCambiarInfo=scan.nextInt();
        scan.nextLine();
        switch (usuarioCambiarInfo) {
            case 1:
                
                Modulos.mostrarCampers(listaCampers);
        
                System.out.println("Ingrese el id del camper al que quires cambiarle la informacion");
                int idCamperCI = scan.nextInt();
                scan.nextLine();

                System.out.println("Datos por cambiar\n1. ID\n2. Numero de Identificacion\n3. Nombres\n4. Apellidos\n5. Direccion\n6. Acudiente\n7. Telefono Celular\n8. Telefono fijo\n9. Estado\n10. Fecha de inicio\n11. Fecha de cierre\n12. grupo\n13. Modulo actual\n14. Volver al menu anterior\nSeleccione un aopcion ");
                int opcionCambiarInfoC=scan.nextInt();
                scan.nextLine();
                
                switch (opcionCambiarInfoC) {
                    case 1:
                        System.out.println("Ingrese el nuevo id del camper");
                        int nuevoIdCamperCI = scan.nextInt();
                        scan.nextLine();

                        for (int i = 0; i < listaCampers.size(); i++) {
                            if (listaCampers.get(i).id==idCamperCI) {
                                listaCampers.get(i).id=nuevoIdCamperCI;
                            }
                        }
                        System.out.println("ID cambiado con exito");
                        break;

                    case 2:
                        System.out.println("Ingrese el nuevo numero de identificacion del camper");
                        int nuevaIdentificacionCamper = scan.nextInt();
                        scan.nextLine();

                        for (int i = 0; i < listaCampers.size(); i++) {
                            if (listaCampers.get(i).id==idCamperCI) {
                                listaCampers.get(i).numeroIdentificacion=nuevaIdentificacionCamper;
                            }
                        }
                        System.out.println("Numero de identificacion cambiado con exito");
                        break;

                    case 3:
                        System.out.println("Ingrese los nuevos nombres del camper");
                        String nuevoNombre = scan.nextLine();

                        for (int i = 0; i < listaCampers.size(); i++) {
                            if (listaCampers.get(i).id==idCamperCI) {
                                listaCampers.get(i).nombres=nuevoNombre;
                            }
                        }
                        System.out.println("Nombres cambiados con exito");
                        break;
                        
                    case 4:
                        System.out.println("Ingrese los nuevos apellidos del camper");
                        String nuevoApellido = scan.nextLine();

                        for (int i = 0; i < listaCampers.size(); i++) {
                            if (listaCampers.get(i).id==idCamperCI) {
                                listaCampers.get(i).apellidos=nuevoApellido;
                            }
                        }
                        System.out.println("Apellidos cambiados con exito");
                        break;

                    case 5:
                        System.out.println("Ingrese la nueva direccion del camper");
                        String nuevaDireccion = scan.nextLine();

                        for (int i = 0; i < listaCampers.size(); i++) {
                            if (listaCampers.get(i).id==idCamperCI) {
                                listaCampers.get(i).direccion=nuevaDireccion;
                            }
                        }
                        System.out.println("Direccion cambiada con exito");
                        break;
                        
                    case 6:
                        System.out.println("Ingrese el nuevo acudiente del camper");
                        String nuevoAcudiente = scan.nextLine();

                        for (int i = 0; i < listaCampers.size(); i++) {
                            if (listaCampers.get(i).id==idCamperCI) {
                                listaCampers.get(i).acudiente=nuevoAcudiente;
                            }
                        }
                        System.out.println("Acudiente cambiado con exito");
                        break;
                        
                    case 7:
                        System.out.println("Ingrese el nuevo telefono celular del camper");
                        int nuevoTCelular = scan.nextInt();
                        scan.nextLine();

                        for (int i = 0; i < listaCampers.size(); i++) {
                            if (listaCampers.get(i).id==idCamperCI) {
                                listaCampers.get(i).telefonoCelular=nuevoTCelular;
                            }
                        }
                        System.out.println("Telefono celular cambiado con exito");
                        break;
                        
                    case 8:
                        System.out.println("Ingrese el nuevo telefono fijo del camper");
                        int nuevoTFijo = scan.nextInt();
                        scan.nextLine();

                        for (int i = 0; i < listaCampers.size(); i++) {
                            if (listaCampers.get(i).id==idCamperCI) {
                                listaCampers.get(i).telefonoFijo=nuevoTFijo;
                            }
                        }
                        System.out.println("Telefono Fijo cambiado con exito");
                        break;
                        
                    
                    case 9:
                        System.out.println("------Tipos de Estados------");
                        for (int i = 0; i < listaCampers.get(0).tiposDeEstados.size(); i++) {
                            System.out.println(listaCampers.get(0).tiposDeEstados.get(i));
                        }
                        System.out.println("Ingrese el nuevo estado del camper (Por favor ingreselo tal como esta escrito en pantalla)");
                        String nuevoEstado = scan.nextLine();

                        for (int i = 0; i < listaCampers.size(); i++) {
                            if (listaCampers.get(i).id==idCamperCI) {
                                listaCampers.get(i).estado=nuevoEstado;
                            }
                        }
                        System.out.println("Estado cambiado con exito");
                        break;

                    case 10:
                        System.out.println("Ingrese la nueva fecha de inicio del camper en el siguiente formato: 'dd-mm-aaaa'");
                        String nuevaFechaI = scan.nextLine();

                        for (int i = 0; i < listaCampers.size(); i++) {
                            if (listaCampers.get(i).id==idCamperCI) {
                                listaCampers.get(i).fechaInicio=nuevaFechaI;
                            }
                        }
                        System.out.println("Fecha de inicio cambiada con exito");
                        break;
                        
                    case 11:
                        System.out.println("Ingrese la nueva fecha de cierre del camper en el siguiente formato: 'dd-mm-aaaa'");
                        String nuevaFechaC = scan.nextLine();

                        for (int i = 0; i < listaCampers.size(); i++) {
                            if (listaCampers.get(i).id==idCamperCI) {
                                listaCampers.get(i).fechaCierre=nuevaFechaC;
                            }
                        }
                        System.out.println("Fecha de cirre cambiada con exito");
                        break;
                        
                    case 12:
                        System.out.println("------Grupos------");
                        for (int i = 0; i < grupos.size(); i++) {
                            System.out.println(grupos.get(i));
                        }
                        System.out.println("Ingrese el nuevo grupo del camper por favor escribelo tal como aparece en pantalla");
                        String nuevoGrupo = scan.nextLine();

                        for (int i = 0; i < listaCampers.size(); i++) {
                            if (listaCampers.get(i).id==idCamperCI) {
                                listaCampers.get(i).grupo=nuevoGrupo;
                            }
                        }
                        System.out.println("Grupo cambiado con exito");
                        break;
                        
                    case 13:
                        System.out.println("------Grupos------");
                        for (int i = 0; i < grupos.size(); i++) {
                            System.out.println(grupos.get(i));
                        }
                        System.out.println("Ingrese el nuevo numero de modulo del camper");
                        int nuevoModulo = scan.nextInt();
                        scan.nextLine();

                        for (int i = 0; i < listaCampers.size(); i++) {
                            if (listaCampers.get(i).id==idCamperCI) {
                                listaCampers.get(i).moduloActual=nuevoModulo;
                            }
                        }
                        System.out.println("Modulo cambiado con exito");
                        break;
                        
                    default:
                    
                        System.out.println("Opcion invalida");
                        
                        break;


                }
                break;
        
            case 2:
                
                break;
        
            case 3:
                
                break;
        
            default:
                break;
        }





    }
}
