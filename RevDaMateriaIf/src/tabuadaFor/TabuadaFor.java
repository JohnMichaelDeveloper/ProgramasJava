package tabuadaFor;
import java.util.Scanner;
public class TabuadaFor {

	public static void main(String[] args) {
		// Tabuada utilizando For estrutura de repetição
		
		int i;
		int valor = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um valor para criar uma tabuada: ");
		valor = teclado.nextInt();
		System.out.println();
		
		for(i = 1; i <= 10; i++) {
			System.out.println(valor + " X " + i + " = " + (valor * i));
			teclado.close();
		}
		
	}

}
