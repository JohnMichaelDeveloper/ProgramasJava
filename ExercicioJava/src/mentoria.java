import java.util.Scanner;
import java.lang.Math;

public class mentoria {

	public static void main(String[] args) {
		/*
		Fazer um programa para que o usuário informe
		uma temperatura em graus Celsius e transforme
		em graus Fahrenheit. Exibir o resultado da conversão.
		Formula; F = (9 * C + 160) / 5
		*/

		double celsius;
		double fahrenheit;
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("informe a temperatura em Celsius (°C): ");
		celsius = teclado.nextDouble();
		
		teclado.close();
		
		fahrenheit = (9 * celsius + 160) / 5;
		fahrenheit = Math.round(fahrenheit);
		
		System.out.printf("A temperatura em Fahrenheit é: %.0f", fahrenheit);
		
	}

}
