package Ejercicio1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
	
		Scanner datos = new Scanner(System.in);


        int[] numero = new int[5];
        int indice = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un numero ");
            numero[i] = datos.nextInt();

        }

        for (int i:numero){

            
            System.out.println("[" + indice + "] = " + i);
            indice++;
        }

      }
    
 }
	