package exercicioFor;
import java.util.Scanner;
public class valor {

	public static void main(String[] args) {
		
		
		int valor = 0;
		int soma = 0;
		int i;
		Scanner somatoria = new Scanner(System.in);
		System.out.println("Digite 10 valores para somar: ");
		for(i = 1; i <= 10; i++) {
			valor = somatoria.nextInt();
			soma = soma + valor;
			somatoria.close();
		}
		System.out.println("A soma dos valores = " + soma);
		
	}
	
}
