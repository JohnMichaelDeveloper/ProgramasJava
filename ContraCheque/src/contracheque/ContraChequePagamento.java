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
				System.out.print("Informe o nome do funcionário: ");
				nome = entrada.nextLine();
				System.out.print("Informe o total de horas trabalhada do funcionário: ");
				horas = entrada.nextInt();
				System.out.print("Informe o valor/hora de trabalho do funcionário (R$): ");
				valorHora = entrada.nextDouble();
				
				salario = valorHora * horas;
				
				System.out.println("");
				System.out.println("Funcionário: " + nome);
				System.out.printf("Recebera o valor aproximado: R$%.2f%n", salario);
				
		
		
			// fim
		entrada.close();
	}

}
