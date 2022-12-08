package Ejercicio2;

import java.util.ArrayList;

public class ejercicio2 {

	public static void main(String[] args) {
		
		int numeros;
		ArrayList<Integer> listaNum = new ArrayList<Integer>();
		ArrayList<Integer> par = new ArrayList<Integer>();
		ArrayList<Integer> impar = new ArrayList<Integer>();
	    
	    for (int i=0; i<20; i++) {
	    	
	    	numeros = (int)(Math.random()*100+1);	 
	    	listaNum.add(numeros);
	    	
	    }
	    
     
	   
	    for (int i = 0; i <listaNum.size(); i++) {
	    	
	    	numeros= listaNum.get(i);
	    	
	    	if (numeros%2 == 0){
            par.add(numeros);
	    	}
	    	else { 
	    		impar.add(numeros);
	    	}
            
           }
	    System.out.println("Los numeros pares son: "+ par);
	    System.out.println("Los numeros impares son: "+ impar);
            
          }
	    
	
	    
	}
	

	   
	    	
	    	 
	   
		
	   
	    
	   

	

