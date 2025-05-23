/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rodriguez_victor_examen1;

import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author sandr
 */
public class Rodriguez_Victor_Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lea = new Scanner(System.in);
        Random rand = new Random();
        lea.useDelimiter("\n");

        
        int op = 0;
        
        do{
            System.out.println("-----MENU-----"); 
            System.out.println("1) Piramide");
            System.out.println("2) Clave");
            System.out.println("3) Piedra, papel o tijera");
            System.out.println("4) Adivinar");
            System.out.println("5) Salir");
            System.out.println("------------------");
            System.out.print("Ingrese una opcion: ");
            op = lea.nextInt();
            
            if(op < 1 || op > 5){
                System.out.println("Opcion no valida!!!");
            }
            switch(op){
                case 1:
                    System.out.println("-----Piramide-----");
                    System.out.print("Ingrese una cantidad de filas: ");
                    int numeroFilas = lea.nextInt();
                    lea.nextLine(); 

                    int numero = 1;
                    for (int filas = 1; filas <= numeroFilas; filas++) {
                        int sumaLinea = 0;
                        for (int espacio = 0; espacio < filas; espacio++) {
                            System.out.print(numero + " ");
                            sumaLinea += numero;
                            numero += 2;
                        }
                        System.out.println("= " + sumaLinea);
                    }
                    break;
                case 2:
                    System.out.println("-----Clave-----");
                    System.out.print("Ingresa el mensaje a cifrar/descifrar: ");
                    String mensaje = lea.next();

        String resultado = "";

        for (int i = 0; i < mensaje.length(); i++) {
            char c = mensaje.charAt(i);

            
            if (c >= 'a' && c <= 'z') {
                char invertida = (char) ('z' - (c - 'a'));
                resultado += invertida;
            }
            
            else if (c >= 'A' && c <= 'Z') {
                char invertida = (char) ('Z' - (c - 'A'));
                resultado += invertida;
            }
            
            else {
                resultado += c;
            }
        }

        System.out.println("Mensaje cifrado/descifrado: " + resultado);

                    break;
                case 3:
                    
                
                    boolean condicion = false;
                    do{
                        
                        System.out.println("-----Piedra, Papel o Tijera-----");
                        int numero2 = rand.nextInt(3) + 1;
                        int numeroSeleccion = 0;
                        System.out.print("Ingrese su nombre: ");
                        String usuario = lea.next();
                        System.out.print("Por favor ingrese su seleccion (Piedra/Papel/Tijeras): ");
                        String seleccion = lea.next();
                        
                        seleccion = seleccion.toLowerCase();
                        
                        if(seleccion.equals("piedra")){
                            numeroSeleccion = 1;
                        }else if(seleccion.equals("papel")){
                            numeroSeleccion = 2;
                        }else if(seleccion.equals("tijeras")){
                            numeroSeleccion= 3;
                        }
                        
                        if(numero2 == 1){
                            System.out.println("CPU: Piedra");
                        }
                        if(numero2 == 2){
                            System.out.println("CPU: Papel");
                        }
                        if(numero2 == 3){
                            System.out.println("CPU: Tijera");
                        }
                        
                        if(numeroSeleccion == 1){
                            System.out.println(usuario+" : Piedra");
                        }
                        if(numeroSeleccion == 2){
                            System.out.println(usuario+" : Papel");
                        }
                        if(numeroSeleccion == 3){
                            System.out.println(usuario+" : Tijera");
                        }
                        
                        if(numeroSeleccion == numero2){
                            System.out.println("EMPATE!!!");
                        }else if(numeroSeleccion == 1 && numero2 == 2){
                            System.out.println("Ganador: CPU");
                        }else if(numeroSeleccion == 1 && numero2 == 3){
                            System.out.println("Ganador: "+usuario);
                        }else if(numeroSeleccion == 2 && numero2 == 1){
                            System.out.println("Ganador: "+usuario);
                        }else if(numeroSeleccion == 2 && numero2 == 3){
                            System.out.println("Ganador: CPU");
                        }else if(numeroSeleccion==3 && numero2 == 1){
                            System.out.println("Ganador: CPU");
                        }else if(numeroSeleccion == 3 && numero2 == 2){
                            System.out.println("Ganador: "+usuario);
                        }
                        System.out.print("Desea volver a jugar?(Si/No): ");
                        String sn = lea.next();
                        sn = sn.toLowerCase();
                        if(sn.equals("no")){
                            condicion = true;
                        }
                    }while(condicion != true);
                
                            
                    break;

                case 4:
                    System.out.println("-----Adivinar-----");
                                        int numeroSecreto = rand.nextInt(100) + 1; 
        int intentos = 10;
        boolean acertado = false;

        System.out.println("Se eligio un numero entre 1 y 100. Tiene 10 intentos para adivinarlo");

        for (int i = 1; i <= intentos; i++) {
            System.out.print("Intento " + i + ": Ingresa un numero: ");
            int numeroUsuario = lea.nextInt();

            if (numeroUsuario == numeroSecreto) {
                System.out.println("Felicidades! Adivinaste el numero en " + i + " intentos");
                acertado = true;
                break;
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("El numero secreto es mayor");
            } else {
                System.out.println("El numero secreto es menor");
            }
        }

        if (!acertado) {
            System.out.println("Se acabaron los intentos El número correcto era: " + numeroSecreto);
        }
                    break;
                case 5:
                    System.out.println("Hasta luego...");
                    break;
            }
        }while(op != 5);
        
    }
    
}
