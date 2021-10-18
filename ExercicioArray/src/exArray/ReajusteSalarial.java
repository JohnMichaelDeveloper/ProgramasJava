package exArray;

import java.util.Scanner;

public class ReajusteSalarial {

	public static void main(String[] args) {
		// Neste exemplo, devem ser armazenados o nome e salário de 5 funcionários.
		// após o cadastro dessas informações deverá ser digitado o índice de reajuste
		// salarial
		// para todos os funcionários.

		// ----------------------------------------------------------------------------------------------------

		Scanner entrada = new Scanner(System.in);
		int i;

		// ----------------------------------------------------------------------------------------------------

		System.out.println("Quantos Funcionários possui na empresa?");
		i = entrada.nextInt();
		System.out.println();

		// ----------------------------------------------------------------------------------------------------

		int TAM = i;
		String[] nome = new String[TAM];
		double[] salario = new double[TAM];
		double reajuste;

		// ----------------------------------------------------------------------------------------------------

		for (int x = 0; x < TAM; x++) {
			System.out.println("Nome do " + (x + 1) + "º Funcionário: ");
			nome[x] = entrada.next();
			System.out.println("Salário: R$");
			salario[x] = entrada.nextDouble();
		}
		System.out.println();
		System.out.println(" == Informe o valor do Reajuste (%) == ");
		reajuste = entrada.nextDouble();
		System.out.println();
		System.out.println(" == Informações Atualizadas == ");
		System.out.println();

		// ----------------------------------------------------------------------------------------------------

		for (int x = 0; x < TAM; x++) {
			System.out.println(
					"NOME: " + nome[x] + " - SALARIO COM REAJUSTE: R$" + (salario[x] += (reajuste * salario[x] / 100)));
		}
		entrada.close();
		System.out.println("");
		System.out.println("Me siga no GitHub :)    JohnMichaelDeveloper");
	}

}
