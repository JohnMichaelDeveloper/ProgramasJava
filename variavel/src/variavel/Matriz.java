package variavel;

import java.util.Scanner;

public class Matriz {
	
	/*Exercício - Fazer um programa para preencher com valores numéricos uma matriz 3 x 3 e que em seguida
	  exiba na tela os elementos que fazem parte da diagonal principal. 
	  
	  Diagonal Principal: 1, 2 e 5. São estes os números a serem exibidos. Claro que o usuário poderá 
	  digitar outros números. */
	
	//Ex:
		/* | 1 | 8 | 9 |*/
		/* | 3 | 2 | 6 |*/
		/* | 0 | 4 | 5 |*/

	public static void main(String[] args) {

		int[][] matriz = new int[3][3];
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Preencha a Matriz");

		for (int linha = 0; linha < 3; linha++) {
			
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("Insira o elemento linha [%d] coluna [%d]: ", linha + 1, coluna + 1);
				matriz[linha][coluna] = entrada.nextInt();
			}
			
		}
		System.out.println("\nA Matriz ficou: \n");
		
		for (int linha = 0; linha < 3; linha++) {
			
			for (int coluna = 0; coluna < 3; coluna++) {
				
				if ((linha == 0) && (coluna == 0)) {
					System.out.printf("\n %d \n", matriz[linha][coluna]);
				} else if ((linha == 1) && (coluna == 1)) {
					System.out.printf("\t %d \t", matriz[linha][coluna]);
				} else if ((linha == 2) && (coluna == 2)) {
					System.out.println("");
					System.out.printf("\t");
					System.out.printf("\t %d \t", matriz[linha][coluna], "\n");
				}
			}
			System.out.println();
		}
		entrada.close();
	} 

}
