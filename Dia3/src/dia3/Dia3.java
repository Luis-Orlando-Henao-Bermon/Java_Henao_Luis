
package dia3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Dia3 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n=0;
        int n2=0;
        int suma=0;

        Boolean exit=true;
        while (exit==true){
            System.out.print("\033[H\033[2J"); 
            mostrarMenu();
            System.out.println("Ingrese una opcion");
            int opcion = scan.nextInt();
            scan.nextLine();
            System.out.print("\033[H\033[2J"); 
    
            switch (opcion) {
                case 0:
                    exit=false;
                    break;

                case 1: 
                
                    System.out.println("Ingresa el numero n");
                    n=scan.nextInt(); 
                    scan.nextLine();
                    System.out.print("\033[H\033[2J"); 

                    for (int i = 0; i < n; i++) {
                        System.out.print(i+1 + " ");
                    }
                    System.out.println(" ");

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();
                    break;

                case 2:  
                    System.out.println("Ingresa el numero n");
                    n=scan.nextInt(); 
                    scan.nextLine();
                    System.out.print("\033[H\033[2J"); 
                    
                    for (int i = n; i > 0; i--) {
                        System.out.print(i + " ");
                    }
                    System.out.println(" ");

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();
                    break;
                case 3:  
                    
                    System.out.println("Ingresa el numero del que quieres ver la tabla de multiplicar");
                    n=scan.nextInt(); 
                    scan.nextLine();
                    System.out.print("\033[H\033[2J"); 

                    for (int i = 0; i < 10; i++) {
                        System.out.println(""+n+" * "+(i+1)+" = "+n*(i+1));
                    }

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 4:  
                
                    System.out.println("Ingresa el numero del que quieres ver la tabla de multiplicar inversa");
                    n=scan.nextInt(); 
                    scan.nextLine();
                    System.out.print("\033[H\033[2J"); 
                    
                    for (int i = 10; i > 0; i--) {
                        System.out.println(""+n+" * "+(i)+" = "+n*(i));
                    }
                    
                    System.out.println("preciona enter para continuar");
                    scan.nextLine();
                    
                    break;
                case 5:  
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    for(char letra='a';letra<='z';letra++){
                        System.out.print(letra + " ");
                    }
                    System.out.println(" ");

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 6:  
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    for(char letra='z';letra>='a';letra--){
                        System.out.print(letra + " ");
                    }
                    System.out.println(" ");

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 7:  
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    for (int i = 2; i < 100; i+=2) {
                        System.out.print(i+" ");
                    }
                    System.out.println(" ");

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 8:  
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    for (int i = 1; i < 100; i+=2) {
                        System.out.print(i+" ");
                    }
                    System.out.println(" ");

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 9:  
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingresa n");
                    n=scan.nextInt();
                    scan.nextLine();
                    
                    for (int i = 1; i < n+1; i++) {
                        suma+=i;
                    }
                    System.out.println("La suma es: "+suma);

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 10: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingresa n");
                    n=scan.nextInt();
                    scan.nextLine();
                    suma=0;

                    for (int i = 2; i < n+1; i+=2) {
                        suma+=i;
                    }
                    System.out.println("La suma es: "+suma);

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 11: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingresa n");
                    n=scan.nextInt();
                    scan.nextLine();
                    suma=0;

                    for (int i = 1; i < n+1; i+=2) {
                        suma+=i;
                    }
                    System.out.println("La suma es: "+suma);

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 12: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    for (char i = 32; i < 126; i++) {
                        System.out.println("Caracter: \""+i+"\", Codigo ASCII:"+ (int) i);
                    }
                
                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 13: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingresa n");
                    n=scan.nextInt();
                    scan.nextLine();

                    long factorial=1;

                    for (int i = 1; i < n+1; i++) {
                        factorial*=i;
                    }
                    System.out.println("El factorial de "+n+" es: "+factorial);

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 14: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingresa el numeo del que quieres saber la potencia");
                    n=scan.nextInt();
                    System.out.println("Ingresa la potencia");
                    n2=scan.nextInt();
                    scan.nextLine();

                    int potencia=1;

                    for (int i = 2; i < n2+1; i++) {
                        potencia*=n;
                    }
                    System.out.println(potencia);

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 15: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingresa el digito");
                    n=scan.nextInt();
                    scan.nextLine();
                    StringBuilder invertido=new StringBuilder();

                    for(int i=String.valueOf(n).length();i>0;i--){

                        invertido.append(String.valueOf(n).charAt(i-1));

                    }

                    System.out.println( "El numero invertido es: "+invertido);
                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 16: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingresa el digito");
                    n=scan.nextInt();
                    scan.nextLine();
                    suma=0;

                    for (int i = 0; i < String.valueOf(n).length(); i++) {
                        char digitoS=String.valueOf(n).charAt(i);
                        int digitoI=digitoS -'0';
                        suma+=digitoI;
                    }

                    System.out.println("La suma de los digitos es: "+suma);

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 17: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingresa el numero a saber si es primo");
                    n=scan.nextInt();
                    scan.nextLine();
                    int contador=0;

                    for (int i = 1; i < n+1; i++) {
                        if (n%i==0) {
                            contador++;
                        }
                    }

                    if (contador==2) {
                        System.out.println("El numero es primo");
                    }
                    else{
                        System.out.println("El numero no es primo");
                    }

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 18: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingresa el primer numero");
                    n=scan.nextInt();
                    System.out.println("Ingresa el segundo numero numero");
                    n2=scan.nextInt();
                    scan.nextLine();

                    int a=n;
                    int b=n2;
                    
                    while (b != 0) {
                        int residuo = b;
                        b = a % b;
                        a = residuo;
                    }
                    System.out.println("El MCD de "+ n +" y "+n2+" es: "+a);

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 19: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingresa la cantidad de numeros que deseas ingresar");
                    n=scan.nextInt();
                    scan.nextLine();
                    
                    ArrayList<Integer> listaNumeros=new ArrayList<>();

                    for (int i = 0; i < n; i++) {
                        System.out.println("Ingresa el "+(i+1)+" numero");

                        n2=scan.nextInt();
                        listaNumeros.add(n2);
                    }

                    scan.nextLine();
                    int nNegativos=0,nPositivos=0,nCeros=0;

                    for (int i : listaNumeros) {
                        if (i>=1) {
                            nPositivos++;
                        }
                        else if (i<0) {
                            nNegativos++;
                        }
                        else{
                            nCeros++;
                        }
                    }
                    System.out.println("La cantidad de numeros positivos ingesados es: "+nPositivos);
                    System.out.println("La cantidad de numeros negativos ingesados es: "+nNegativos);
                    System.out.println("La cantidad de numeros cero ingesados es: "+nCeros);

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 20: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingresa la cantidad de numeros que deseas ingresar");
                    n=scan.nextInt();
                    scan.nextLine();
                    
                    ArrayList<Integer> listaNumerosMN=new ArrayList<>();

                    for (int i = 0; i < n; i++) {
                        System.out.println("Ingresa el "+(i+1)+" numero");

                        n2=scan.nextInt();
                        listaNumerosMN.add(n2);
                    }
                    scan.nextLine();
                    System.out.println("El numero mayor es: "+Collections.max(listaNumerosMN));
                    System.out.println("El numero menor es: "+Collections.min(listaNumerosMN));
                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 21: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    ArrayList<Integer> listaNumerosD9=new ArrayList<>();
                    suma=0;
                    
                    for (int i = 100; i < 201; i++) {
                        if (i%9==0) {
                            listaNumerosD9.add(i);
                            suma+=i;
                        }
                    }
                    System.out.print("Los numeros divisibles por 9 entre 100 y 200 son: ");
                    for (int i : listaNumerosD9) {
                        System.out.print(i+" ");
                    }
                    System.out.println(" ");
                    System.out.println("La suma de los numeros divisibles por 9 entre 100 y 200 es: " +suma);

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 22: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingresa el numero binario");
                    String s=scan.nextLine();
                    suma=0;
                    int cont=s.length();
                    
                    for (int i =0 ; i <s.length(); i++) {
                        n=s.charAt(i) -'0';
                        n2=1;
                        for (int j = 1; j < cont; j++) {
                            n2*=2;
                        }
                        cont--;
                        suma+=(n2*n);
                    }

                    System.out.println("El numero binario "+s+" en decimal es: "+suma);


                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 23: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingresa el numero para saber si es fuerte o no");
                    String fuerte=scan.nextLine();

                    suma=0;
                    
                    for (int i = 0; i < fuerte.length(); i++) {
                        n=fuerte.charAt(i) - '0';
                        int factorial1=1;
                        for (int e = 1; e < n+1; e++) {
                            factorial1*=e;
                        }
                        suma+=factorial1;
                    }
                    if (suma==Integer.parseInt(fuerte)) {
                        System.out.println("El numero "+fuerte+" es un numero fuerte");
                    }else System.out.println("El numero "+fuerte+" no es un numero fuerte");
                    

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 24: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingrece el numero hexadecimal que quiere pasar a decimal");
                    String hexADec=scan.nextLine();

                    System.out.println("El numero "+hexADec+" en decimal es: "+Integer.parseInt(hexADec, 16));

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 25: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingrece el numero hexadecimal que quiere pasar a octal");
                    String hexAOct=scan.nextLine();

                    System.out.println("El numero "+hexAOct+" en octal es: "+Integer.toOctalString(Integer.parseInt(hexAOct, 16)));


                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 26: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingrece el numero hexadecimal que quiere pasar a binario");
                    String hexABin=scan.nextLine();

                    System.out.println("El numero "+hexABin+" en binario es: "+Integer.toBinaryString(Integer.parseInt(hexABin, 16)));

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 27: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingrese el numero decimal que quiere pasar a hexadecimal");
                    int decAHex=scan.nextInt();
                    scan.nextLine();

                    System.out.println("El numero "+decAHex+" en hexadecimal es: " +Integer.toHexString(decAHex).toUpperCase());

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 28: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingrese el numero decimal que quiere pasar a octal");
                    int decAOct=scan.nextInt();
                    scan.nextLine();

                    System.out.println("El numero "+decAOct+" en octal es: " +Integer.toOctalString(decAOct));

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 29: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingrese el numero decimal que quiere pasar a binario");
                    int decABin=scan.nextInt();
                    scan.nextLine();

                    System.out.println("El numero "+decABin+" en binario es: " +Integer.toBinaryString(decABin));

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 30: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingrese el numero que quiere pasar de binario a octal");
                    String binAOct=scan.nextLine();


                    System.out.println("El numero "+binAOct+" en octal es: "+Integer.toOctalString(Integer.parseInt(binAOct,2)));

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 31: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingrese el numero que quiere pasar de binario a decimal");
                    String binADec=scan.nextLine();


                    System.out.println("El numero "+binADec+" en decimal es: "+Integer.parseInt(binADec,2));

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 32: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingrese el numero que quiere pasar de binario a hexadecimal");
                    String binAHex=scan.nextLine();


                    System.out.println("El numero "+binAHex+" en hexadecimal es: "+Integer.toHexString(Integer.parseInt(binAHex,2)).toUpperCase());

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 33: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingrese el numero que quiere pasar de octal a binario");
                    String octABin=scan.nextLine();


                    System.out.println("El numero "+octABin+" en binario es: "+Integer.toBinaryString(Integer.parseInt(octABin,8)));

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 34: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingrese el numero que quiere pasar de octal a decimal");
                    String octADec=scan.nextLine();


                    System.out.println("El numero "+octADec+" en decimal es: "+Integer.parseInt(octADec,8));

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 35: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingrese el numero que quiere pasar de octal a hexadecimal");
                    String octAHex=scan.nextLine();


                    System.out.println("El numero "+octAHex+" en hexadecimal es: "+Integer.toHexString(Integer.parseInt(octAHex,8)).toUpperCase());

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 36: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingrese el numero del que quieres saber el complemento a 1");
                    n=scan.nextInt();
                    scan.nextLine();

                    System.out.println("El complemento a 1 es: "+~n);

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 37: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingresa el binario del que quieres encontrar el complemento a 2");
                    String BinA2=scan.nextLine();

                    String complementoBin="";

                    for (int i = 0; i < BinA2.length(); i++) {
                        if (BinA2.charAt(i)=='0') {
                            complementoBin+='1';
                        }else complementoBin+='0';
                    }

                    int complementoD=Integer.parseInt(complementoBin,2)+1;
                    String complemetoBA2=Integer.toBinaryString(complementoD);

                    System.out.println("El complemento a 2 es: "+complemetoBA2);


                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 38: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingresa n");
                    n=scan.nextInt();
                    scan.nextLine();


                    ArrayList<Integer> listaFibo=new ArrayList<>();
                    listaFibo.add(0);
                    listaFibo.add(1);

                    System.out.print(0+ " "+1);

                    for (int i = 0; i < n-2; i++) {
                        suma=listaFibo.get(listaFibo.size()-1)+listaFibo.get(listaFibo.size()-2);
                        listaFibo.add(suma);
                        System.out.print(" "+suma);
                    }
                    System.out.println(" ");
                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 39: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingresa el numero para saber si es fuerte o no");
                    String fuerte2=scan.nextLine();

                    suma=0;
                    
                    for (int i = 0; i < fuerte2.length(); i++) {
                        n=fuerte2.charAt(i) - '0';
                        int factorial1=1;
                        for (int e = 1; e < n+1; e++) {
                            factorial1*=e;
                        }
                        suma+=factorial1;
                    }
                    if (suma==Integer.parseInt(fuerte2)) {
                        System.out.println("El numero "+fuerte2+" es un numero fuerte");
                    }else System.out.println("El numero "+fuerte2+" no es un numero fuerte");

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 40: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.print("Los numeros fuertes entre 1 y 100000 son: ");
                    for (int i = 0; i < 100000; i++) {
                        String vf=Integer.toString(i);
                        if (verificarNFuerte(vf)==true) {
                            System.out.print(i+" ");
                        }
                    }
                    System.out.println(" ");
                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 41: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Los numeros perfectos entre el 1 y el 10000 son: ");

                    for (int i = 1; i < 10000; i++) {
                        if (verificarNPerfecto(i)==true) {
                            System.out.print(i+" ");
                        }
                    }

                    System.out.println(" ");
                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 42: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingresa el numero que quieres saber si es perfecto o no");
                    n=scan.nextInt();
                    scan.nextLine();

                    System.out.println(verificarNPerfecto(n)?"Es un numero perfecto":"No es un numero perfecto");

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 43: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    for (int i = 1; i < 1000; i++) {
                        if (VerificarNArsmstrong(String.valueOf(i))==true) {
                            System.out.print(i+" ");
                        }
                    }
                    System.out.println();
                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 44: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingresa el numero que quieres verificar si pertenece a los Números de Armstrong");
                    String nVerificarArsm=scan.nextLine();

                    System.out.println((VerificarNArsmstrong(nVerificarArsm)?"El numero pertenece a los Números de Armstrong":"El numero no pertenece a los Números de Armstrong"));

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                case 45: 
                    
                    System.out.print("\033[H\033[2J"); 
                    
                    System.out.println("Ingresa el numero del que quieres saber los factores primos");
                    n=scan.nextInt();
                    scan.nextLine();

                    System.out.print("Los factores primos de "+n+" son: ");
                    for (int i = 1; i < n; i++) {
                        if (VerificarPrimo(i)==true && n%i==0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();

                    System.out.println("preciona enter para continuar");
                    scan.nextLine();

                    break;
                default: 
                    
                    
                    System.out.println("Error: Ingrese un número entre 1 y 45.");
            }
        }
        scan.close();
    }
    public static Boolean VerificarPrimo(int n){
        int contador=0;

        for (int i = 1; i < n+1; i++) {
            if (n%i==0) {
                contador++;
            }
        }

        if (contador==2) {
            return true;
        }
        else{
            return false;
        }
    }

    public static Boolean VerificarNArsmstrong(String numero){

        int suma=0;
        
        for (int i = 0; i < numero.length(); i++) {
            int potencia=1;
            for (int j = 1; j < numero.length()+1; j++) {
                potencia*=numero.charAt(i)-'0';
            }
            
            suma+=potencia;

        }

        return (suma==Integer.parseInt(numero)) ? true : false;
    }
    public static Boolean verificarNFuerte(String fuerte2){
        int suma=0;
                    
        for (int i = 0; i < fuerte2.length(); i++) {
            int n=fuerte2.charAt(i) - '0';
            int factorial1=1;
            for (int e = 1; e < n+1; e++) {
                factorial1*=e;
            }
            suma+=factorial1;
        }
        if (suma==Integer.parseInt(fuerte2)) {
            return true;
        }else return false;
    }

    public static Boolean verificarNPerfecto(int num){
        int suma=0;
        
        for (int i = 1; i < num; i++) {
            if (num%i==0) {
                suma+=i;
            }
        }
        return (suma==num) ? true : false;
    }
    public static void mostrarMenu() {
        System.out.println("===== MENÚ DE PROGRAMAS =====");
        System.out.println("1. Imprimir números naturales del 1 al n");
        System.out.println("2. Imprimir números naturales en orden inverso");
        System.out.println("3. Imprimir tablas de multiplicar");
        System.out.println("4. Imprimir tablas de multiplicar en orden inverso");
        System.out.println("5. Imprimir el alfabeto de 'a' a 'z'");
        System.out.println("6. Imprimir el alfabeto en orden inverso de 'Z' a 'A'");
        System.out.println("7. Imprimir todos los números pares entre 1 y 100");
        System.out.println("8. Imprimir todos los números impares entre 1 y 100");
        System.out.println("9. Sumar todos los números naturales entre 1 y n");
        System.out.println("10. Sumar todos los números pares entre 1 y n");
        System.out.println("11. Sumar todos los números impares entre 1 y n");
        System.out.println("12. Imprimir valores ASCII");
        System.out.println("13. Calcular el factorial de un número");
        System.out.println("14. Calcular una potencia");
        System.out.println("15. Invertir los dígitos de un número");
        System.out.println("16. Calcular la suma de los dígitos de un número");
        System.out.println("17. Verificar si un número es primo");
        System.out.println("18. Calcular el MCD de dos números");
        System.out.println("19. Contar positivos, negativos y ceros ingresados");
        System.out.println("20. Encontrar el número mayor y menor ingresado");
        System.out.println("21. Encontrar los números divisibles por 9 entre 100 y 200");
        System.out.println("22. Convertir binario a decimal (sin bucles)");
        System.out.println("23. Verificar si un número es un Número Fuerte");
        System.out.println("24. Convertir hexadecimal a decimal");
        System.out.println("25. Convertir hexadecimal a octal");
        System.out.println("26. Convertir hexadecimal a binario");
        System.out.println("27. Convertir decimal a hexadecimal");
        System.out.println("28. Convertir decimal a octal");
        System.out.println("29. Convertir decimal a binario");
        System.out.println("30. Convertir binario a octal");
        System.out.println("31. Convertir binario a decimal");
        System.out.println("32. Convertir binario a hexadecimal");
        System.out.println("33. Convertir octal a binario");
        System.out.println("34. Convertir octal a decimal");
        System.out.println("35. Convertir octal a hexadecimal");
        System.out.println("36. Encontrar el complemento a 1 de un número");
        System.out.println("37. Encontrar el complemento a 2 de un número binario");
        System.out.println("38. Imprimir la serie de Fibonacci hasta n términos");
        System.out.println("39. Verificar si un número es un Número Fuerte");
        System.out.println("40. Imprimir todos los Números Fuertes del 1 al 100000");
        System.out.println("41. Imprimir todos los Números Perfectos del 1 al 10000");
        System.out.println("42. Verificar si un número es un Número Perfecto");
        System.out.println("43. Imprimir todos los Números de Armstrong entre 1 y 1000");
        System.out.println("44. Verificar si un número es un Número de Armstrong");
        System.out.println("45. Imprimir los factores primos de un número");
        System.out.println("0. Salir");
    }
    
}
