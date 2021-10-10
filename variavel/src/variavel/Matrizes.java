package variavel;

import java.util.Scanner;

public class Matrizes 
{

	public static void main(String[] args) 
	{
		
		/*
		 * int [] [] matriz; // declara matriz e o tipo matriz = new int [2] [2]; //
		 * determina o tamanho da tabela. //ou int [] [] matriz = new int [2] [2];
		 */
		
		int [] [] matriz = new int[3][3];
		Scanner entrada = new Scanner(System.in);
		System.out.println("Matriz M[3] [3]");
		for(int linha = 0; linha < 3; linha++)
		{
			for(int coluna = 0; coluna < 3; coluna++)
			{
				System.out.printf("Insira o elemento M [%d] [%d]: ", linha + 1, coluna +1);
				matriz[linha][coluna] = entrada.nextInt();
			}
		}
		System.out.println("\nA Matriz ficou: \n");
		for(int linha = 0; linha < 3; linha++)
		{
			for(int coluna = 0; coluna < 3; coluna++)
			{
				System.out.printf("\t %d \t", matriz[linha][coluna]);
			}
			System.out.println();
		}
	}

}
