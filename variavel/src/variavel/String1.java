package variavel;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {

		/* Arrays */

		/*
		 * String[] carros = { "Volvo", "BMW", "Ford", "Mazda" };
		 * 
		 * System.out.println(carros[0]); System.out.println(carros[1]);
		 * System.out.println(carros[2]); System.out.println(carros[3]);
		 * 
		 * carros[0] = "Ferrari";
		 * 
		 * System.out.println(carros[0]); System.out.println(carros[1]);
		 * System.out.println(carros[2]); System.out.println(carros[3]);
		 */
		
		
		String[] carros = new String[5];
		Scanner teclado = new Scanner(System.in);
			System.out.println("Insira " + carros.length + " fabricantes de veiculos: ");
			for( int i = 0; i < carros.length; i++)
			{
				carros[i] = teclado.next();
			}
		teclado.close();
		for( int i = 0; i < carros.length; i++)
		{
			System.out.println("Carros " + (i + 1) + " = " + carros[i]);
		}
	}

}
