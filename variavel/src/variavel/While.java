package variavel;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		/*
		 * int numero = 1; while (numero < 10 ) { System.out.println("O n�mero �: " +
		 * numero); numero = numero + 1; }
		 */

		
		
		
		
		Scanner valor = new Scanner(System.in);
		int numero = 0;
			
		while (numero != 10) 
		{
				
			System.out.println("Digite um n�mero: ");
			numero = valor.nextInt();
						
			if(numero ==10)
				System.out.println("Voc� acertou!");
			else
				System.out.println("Voc� errou!");
	    }
		valor.close();
	}

}
