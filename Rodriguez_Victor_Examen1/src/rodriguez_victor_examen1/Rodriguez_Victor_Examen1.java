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
            
            if(op<1 || op > 5){
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
                    break;
                case 3:
                    System.out.println("-----Piedra, Papel o Tijera-----");
                    break;
                case 4:
                    System.out.println("-----Adivinar-----");
                    break;
                case 5:
                    System.out.println("Hasta luego...");
                    break;
            }
        }while(op != 5);
        
    }
    
}
