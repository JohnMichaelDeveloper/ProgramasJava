package tentativaErro;

import java.util.Scanner;

public class ErroNumerico {
	
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

	}

}
