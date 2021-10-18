package somaWile;

import java.util.Scanner;

public class SomaWile 
{

	public static void main(String[] args) 
	{ // O usuário irá digitar N valores e somá-los até a tecla zero for pressionada.

		Scanner entrada = new Scanner(System.in);
		int valor = 0;
		int soma = 0;
		
		System.out.println("Entre com um valor: ");
		valor = entrada.nextInt();
		
		while (valor != 0 ) 
		{
			soma = soma + valor;
			System.out.println("Entre com um valor: ");
			valor = entrada.nextInt();
		}
		System.out.println("A soma dos valores = " + soma);
		entrada.close();
	}

}
