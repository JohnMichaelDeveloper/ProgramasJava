package contracheque;

import java.util.Scanner;

public class ContraChequePagamento 
{

	public static void main(String[] args) 
	{
		
		Scanner entrada = new Scanner(System.in); 
		
			
		
			// var
			
			int horas;
			double valorHora, salario;
			String nome;
			// inicio
				System.out.print("Informe o nome do funcion�rio: ");
				nome = entrada.nextLine();
				System.out.print("Informe o total de horas trabalhada do funcion�rio: ");
				horas = entrada.nextInt();
				System.out.print("Informe o valor/hora de trabalho do funcion�rio (R$): ");
				valorHora = entrada.nextDouble();
				
				salario = valorHora * horas;
				
				System.out.println("");
				System.out.println("Funcion�rio: " + nome);
				System.out.printf("Recebera o valor aproximado: R$%.2f%n", salario);
				
		
		
			// fim
		entrada.close();
	}

}
