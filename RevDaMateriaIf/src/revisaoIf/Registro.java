package revisaoIf;

import java.util.Scanner;

public class Registro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

		int numeroDias;
		int i;
		
		System.out.println("Digite o registro");
		numeroDias = entrada.nextInt();
		
		System.out.println("Qual o ultimo registro");
		i = entrada.nextInt();
		
		System.out.printf((numeroDias <= i)? "O registro nº " + numeroDias + ", já se encontra no banco de dados. " : "Novo registro nº " + (++numeroDias) + ", criado em seu banco de dados." );
		
		entrada.close();
	}
	

}
