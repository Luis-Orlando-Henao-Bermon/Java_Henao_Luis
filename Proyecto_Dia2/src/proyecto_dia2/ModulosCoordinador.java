
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
    
    public static void cambiarInfo(ArrayList<Camper> listaCampers,ArrayList<Trainer> listaTrainers,ArrayList<Coordinador> coordinador,ArrayList<String> grupos){
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
                
                Modulos.mostrarTrainers(listaTrainers);
                
                System.out.println("Ingrese el id del trainer al que quieres cambiar la informacion");
                int idCambioTrainer=scan.nextInt();
                scan.nextLine();
                
                System.out.println("-----Informacion que se puede cambiar-----\n1. ID\n2. Numero de identificacion\n3. Nombres\n4. Apellidos\n5. Direccion\n6. Telefono Celular\n7. Telefono Fijo\n8. Ruta\n9. Volver al menu anterior ");
                System.out.println("Ingresa el numero de la opcion que quieres cambiar del tainer");
                int opcCambioInfoT=scan.nextInt();
                scan.nextLine();
                
                switch (opcCambioInfoT){
                    
                    case 1:
                        System.out.println("Ingrese el nuevo id del trainer");
                        int nuevoIdTrainer=scan.nextInt();
                        scan.nextLine();
                        
                        for (int i=0;i<listaTrainers.size();i++){
                            if (listaTrainers.get(i).id==idCambioTrainer){
                                
                                listaTrainers.get(i).id=nuevoIdTrainer;
                                
                            }
                        }
                        System.out.println("Id cambiado con exito");
                        break;
                        
                    case 2:
                        System.out.println("Ingrese el nuevo numero de identificacion del trainer");
                        int nuevoNITrainer=scan.nextInt();
                        scan.nextLine();
                        
                        for (int i=0;i<listaTrainers.size();i++){
                            if (listaTrainers.get(i).id==idCambioTrainer){
                                
                                listaTrainers.get(i).numeroIdentificacion=nuevoNITrainer;
                                
                            }
                        }
                        System.out.println("Numero de identificacion cambiado con exito");
                        break;
                        
                    case 3:
                        System.out.println("Ingrese el nuevo nombre del trainer");
                        String nuevoNombrerTainer=scan.nextLine();
                        
                        for (int i=0;i<listaTrainers.size();i++){
                            if (listaTrainers.get(i).id==idCambioTrainer){
                                
                                listaTrainers.get(i).nombres=nuevoNombrerTainer;
                                
                            }
                        }
                        System.out.println("Nombre cambiado con exito");
                        break;
                        
                    case 4:
                        System.out.println("Ingrese el nuevo apellido del trainer");
                        String nuevoApellidoTrainer=scan.nextLine();
                        scan.nextLine();
                        
                        for (int i=0;i<listaTrainers.size();i++){
                            if (listaTrainers.get(i).id==idCambioTrainer){
                                
                                listaTrainers.get(i).apellidos=nuevoApellidoTrainer;
                                
                            }
                        }
                        System.out.println("Apellido cambiado con exito");
                        break;
                        
                    case 5:
                        System.out.println("Ingrese la nueva direccion del trainer");
                        String nuevoDireccionTrainer=scan.nextLine();
                        
                        for (int i=0;i<listaTrainers.size();i++){
                            if (listaTrainers.get(i).id==idCambioTrainer){
                                
                                listaTrainers.get(i).direccion=nuevoDireccionTrainer;
                                
                            }
                        }
                        System.out.println("Direccion cambiada con exito");
                        break;
                        
                    case 6:
                        System.out.println("Ingrese el nuevo telefono celular del trainer");
                        int nuevoTelefonoCTrainer=scan.nextInt();
                        
                        for (int i=0;i<listaTrainers.size();i++){
                            if (listaTrainers.get(i).id==idCambioTrainer){
                                
                                listaTrainers.get(i).telefonoCelular=nuevoTelefonoCTrainer;
                                
                            }
                        }
                        System.out.println("Telefono celular cambiado con exito");
                        break;
                        
                    case 7:
                        System.out.println("Ingrese el nuevo telefono fijo del trainer");
                        int nuevoTelefonoFTrainer=scan.nextInt();
                        
                        for (int i=0;i<listaTrainers.size();i++){
                            if (listaTrainers.get(i).id==idCambioTrainer){
                                
                                listaTrainers.get(i).telefonoFijo=nuevoTelefonoFTrainer;
                                
                            }
                        }
                        System.out.println("Telefono fijo cambiado con exito");
                        break;
                        
                    case 8:
                        System.out.println("Ingrese la nueva ruta del trainer");
                        int nuevaRutaTrainer=scan.nextInt();
                        
                        for (int i=0;i<listaTrainers.size();i++){
                            if (listaTrainers.get(i).id==idCambioTrainer){
                                
                                listaTrainers.get(i).telefonoFijo=nuevaRutaTrainer;
                                
                            }
                        }
                        System.out.println("Telefono fijo cambiado con exito");
                        break;
                    
                    case 9:
                        
                        
                        break;
                    
                    default:
                        
                        System.out.println("Opcion invalida");
                        
                        break;
                        
                }
                
                break;
        
            case 3:
                Modulos.mostrarCoordinadores(coordinador);
                
                System.out.println("Ingrese el id del cordinador al que quiere cambiar informacion");
                int idCambioC=scan.nextInt();
                scan.nextLine();
                
                System.out.println("----Informacion que se puede cambiar-----\n1. ID\n2. Numero de identificacion\n3. Nombres\n4. Apellidos\n5. Direccion\n6. Telefono Celular\n7. Telefono Fijo\n8. Volver al menu anterior \"");
                int opcCambiarCoordinador=scan.nextInt();
                scan.nextLine();
                
                switch(opcCambiarCoordinador){
                    case 1:
                        for (int i = 0; i < coordinador.size(); i++) {
                            if (coordinador.get(i).id==idCambioC){
                            
                                System.out.println("Ingrese el nuevo id del coordinador");
                                int nuevoIdCoordinador=scan.nextInt();
                                scan.nextLine();
                                coordinador.get(i).id=nuevoIdCoordinador;
                                
                                System.out.println("ID cambiado con exito");
                            }
                            
                        }
                        
                        break;
                        
                    case 2:

                        for (int i = 0; i < coordinador.size(); i++) {
                            if (coordinador.get(i).id==idCambioC){
                            
                                System.out.println("Ingrese el nuevo numero de identificacion del coordinador");
                                int nuevoNICoordinador=scan.nextInt();
                                scan.nextLine();
                                
                                coordinador.get(i).numeroIdentificacion=nuevoNICoordinador;
                                
                                System.out.println("Numero de identificacion cambiado con exito");
                            }
                            
                        }
                        
                        
                        break;
                        
                    case 3:

                        for (int i = 0; i < coordinador.size(); i++) {
                            if (coordinador.get(i).id==idCambioC){

                                System.out.println("Ingrese el nuevo nombre del coordinador");
                                String nuevoNombreCoordinador=scan.nextLine();

                                coordinador.get(i).nombres=nuevoNombreCoordinador;

                                System.out.println("Nombre cambiado con exito");

                            }

                        }
                        
                        break;
                        
                    case 4:
                        
                        for (int i = 0; i < coordinador.size(); i++) {
                            if (coordinador.get(i).id==idCambioC){
                            
                                System.out.println("Ingrese el nuevo apellido del coordinador");
                                String nuevoApellidoCoordinador=scan.nextLine();
                                
                                coordinador.get(i).apellidos=nuevoApellidoCoordinador;
                                
                                System.out.println("Apellido cambiado con exito");
                            }
                            
                        }

                        
                        break;
                    case 5:

                        for (int i = 0; i < coordinador.size(); i++) {
                            if (coordinador.get(i).id==idCambioC){
                                
                                System.out.println("Ingrese la nueva direccion del coordinador");
                                String nuevaDireccionCoordinador=scan.nextLine();
                                
                                coordinador.get(i).direccion=nuevaDireccionCoordinador;
                                
                                System.out.println("Direccion cambiada con exito");
                            }
                            
                        }
                        
                        
                        break;
                        
                    case 6:

                        for (int i = 0; i < coordinador.size(); i++) {
                            if (coordinador.get(i).id==idCambioC){
                            
                                System.out.println("Ingrese el nuevo telefono celular del coordinador");
                                int nuevoTelefonoCCoordinador=scan.nextInt();
                                scan.nextLine();
                                
                                coordinador.get(i).telefonoCelular=nuevoTelefonoCCoordinador;
                                
                                System.out.println("Telefono celular cambiado con exito");
                            }
                            
                        }

                        
                        
                        break;
                       
                    case 7:

                        for (int i = 0; i < coordinador.size(); i++) {
                            if (coordinador.get(i).id==idCambioC){
                            
                                System.out.println("Ingrese el nuevo telefono fijo del coordinador");
                                int nuevoTelefonoFCoordinador=scan.nextInt();
                                scan.nextLine();
                                
                                coordinador.get(i).telefonoFijo=nuevoTelefonoFCoordinador;
                                
                                System.out.println("Telefono fijo cambiado con exito");
                            }
                            
                        }
                        
                        
                        break;
                        
                    case 8:
                        break;
                    
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }
                
                break;
        
            default:
                break;
        }





    }

    public static void CrearUsuarios(ArrayList<Camper> listaCampers,ArrayList<Trainer> listaTrainers,ArrayList<Coordinador> coordinador,ArrayList<String> grupos){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("-----Tipos de usuarios-----\n1. Campers\n2.Trainers\n3Coordinadores");
                    System.out.println("Ingrese el numero del tipo de usuario que quiere ver\n");
                    int opcCrearUSer=scan.nextInt();
                    
                    switch (opcCrearUSer) {
                        case 1:
                            
                            System.out.println("Ingrese el login del nuevo camper");
                            String LoginN=scan.nextLine();
                            
                            System.out.println("Ingresa la contraseña del nuevo camper");
                            String contrasenaN=scan.nextLine();
                            
                            System.out.println("Ingresa el id del nuevo camper");
                            int idN =scan.nextInt();
                            scan.nextLine();
                            
                            System.out.println("Ingresa el numero de identificacion del nuevo camper");
                            int numeroIdentificacionN =scan.nextInt();
                            scan.nextLine();
                            
                            System.out.println("Ingresa los nombres del nuevo camper");
                            String nombresN=scan.nextLine();
                            
                            System.out.println("Ingresa los apellidos del nuevo camper");
                            String apellidosN=scan.nextLine();
                            
                            System.out.println("Ingresa la direccion del nuevo camper");
                            String direccionN=scan.nextLine();
                            
                            System.out.println("Ingresa los nombres del acudiente del nuevo camper");
                            String nombresAcudienteN=scan.nextLine();
                            
                            System.out.println("Ingresa el numero de telefono celular del nuevo camper");
                            int telefonoCN =scan.nextInt();
                            scan.nextLine();
                            
                            System.out.println("Ingresa el numero de telefono fijo del nuevo camper");
                            int telefonoFN =scan.nextInt();
                            scan.nextLine();
                            
                            System.out.println("Ingresa el estado del nuevo camper");
                            String estadoN=scan.nextLine();
                            
                            System.out.println("Ingresa la fecha de inicio del nuevo camper");
                            String fechaInicioN=scan.nextLine();
                            
                            System.out.println("Ingresa la fecha de cierre del nuevo camper");
                            String fechaCierreN=scan.nextLine();
                            
                            System.out.println("-----Grupos-----");
                            for (int i = 0; i < grupos.size(); i++) {
                                System.out.println(grupos.get(i));
                            }
                            System.out.println("Ingresa el grupo del nuevo camper");
                            String grupoN=scan.nextLine();
                            
                            System.out.println("Ingresa la ruta del nuevo camper");
                            String rutaN=scan.nextLine();
                            
                            System.out.println("Ingresa el trainer del nuevo camper");
                            String trainerN=scan.nextLine();
                            
                            Camper camper1 = new Camper(LoginN, contrasenaN, idN, numeroIdentificacionN, nombresN, apellidosN,direccionN, nombresAcudienteN, telefonoCN, telefonoFN, estadoN,
                                    fechaInicioN, fechaCierreN, grupoN, rutaN, 1, trainerN);
                            listaCampers.add(camper1);
                            
                            break;
                            
                        case 2:
                            System.out.println("Ingrese el login del nuevo trainer");
                            String LoginNT=scan.nextLine();
                            
                            System.out.println("Ingresa la contraseña del nuevo trainer");
                            String contrasenaNT=scan.nextLine();
                            
                            System.out.println("Ingresa el id del nuevo trainer");
                            int idNT =scan.nextInt();
                            scan.nextLine();
                            
                            System.out.println("Ingresa el numero de identificacion del nuevo trainer");
                            int numeroIdentificacionNT =scan.nextInt();
                            scan.nextLine();
                            
                            System.out.println("Ingresa los nombres del nuevo trainer");
                            String nombresNT=scan.nextLine();
                            
                            System.out.println("Ingresa los apellidos del nuevo trainer");
                            String apellidosNT=scan.nextLine();
                            
                            System.out.println("Ingresa la direccion del nuevo trainer");
                            String direccionNT=scan.nextLine();
                            
                            System.out.println("Ingresa el numero de telefono celular del nuevo trainer");
                            int telefonoCNT =scan.nextInt();
                            scan.nextLine();
                            
                            System.out.println("Ingresa el numero de telefono fijo del nuevo trainer");
                            int telefonoFNT =scan.nextInt();
                            scan.nextLine();
                            
                            System.out.println("Ingresa la ruta del nuevo trainer");
                            String rutaNT=scan.nextLine();
                            
                            Trainer trainer1 = new Trainer(LoginNT, contrasenaNT, idNT, numeroIdentificacionNT,
                                    nombresNT, apellidosNT,direccionNT, telefonoCNT,
                                    telefonoFNT, rutaNT);
                            listaTrainers.add(trainer1);
                            
                            
                            break;
                            
                        case 3:
                            
                            System.out.println("Ingrese el login del nuevo trainer");
                            String LoginNC=scan.nextLine();
                            
                            System.out.println("Ingresa la contraseña del nuevo trainer");
                            String contrasenaNC=scan.nextLine();
                            
                            System.out.println("Ingresa el id del nuevo coordinador");
                            int idNC =scan.nextInt();
                            scan.nextLine();
                            
                            System.out.println("Ingresa el numero de identificacion del nuevo coordinador");
                            int numeroIdentificacionNC =scan.nextInt();
                            scan.nextLine();
                            
                            System.out.println("Ingresa los nombres del nuevo coordinador");
                            String nombresNC=scan.nextLine();
                            
                            System.out.println("Ingresa los apellidos del nuevo coordinador");
                            String apellidosNC=scan.nextLine();
                            
                            System.out.println("Ingresa la direccion del nuevo coordinador");
                            String direccionNC=scan.nextLine();
                            
                            System.out.println("Ingresa el numero de telefono celular del nuevo coordinador");
                            int telefonoCNC =scan.nextInt();
                            scan.nextLine();
                            
                            System.out.println("Ingresa el numero de telefono fijo del nuevo coordinador");
                            int telefonoFNC =scan.nextInt();
                            scan.nextLine();
                            
                            Coordinador coordinador1 = new Coordinador(LoginNC, contrasenaNC, idNC, numeroIdentificacionNC,
                                    nombresNC, apellidosNC, direccionNC, telefonoCNC,
                                    telefonoFNC);
                            
                            coordinador.add(coordinador1);
                            break;
                        default:
                            System.out.println("Opcion invalida");
                            break;
                    }
        
    }
    
    public static void EliminarCamper(ArrayList<Camper> listaCampers){
        
        Scanner scan =new Scanner(System.in);
        
        Modulos.mostrarCampers(listaCampers);
        
        System.out.println("Ingresa el id del camper que desees eliminar");
        int camperEliminar=scan.nextInt();
        ArrayList<Camper> listaNueva=new ArrayList<>();
        
        for (int i = 0; i < listaCampers.size(); i++) {
            if(listaCampers.get(i).id!=camperEliminar){
                listaNueva.add(listaCampers.get(i));
            }
        }
        listaCampers=listaNueva;
        
    }
}



