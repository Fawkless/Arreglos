package Ejercicio3;

import java.util.ArrayList;

public class ejercicio3 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> numerosPrimos = new ArrayList<Integer>();
		
		
	

       	for (int i=1; i<1000; i++) {	
       		
       		int a=0;
       	for (int n = 1; n <1000; n++) {
				
				if(i%n==0) 
					a++;			
			
		   }
			
       	
		if (a==2)
			numerosPrimos.add(i);
		
	
		}
       	numerosPrimos.add(0, 1);
      	System.out.println(numerosPrimos);
		}
		
			
		}

		
		
	
	    
		

