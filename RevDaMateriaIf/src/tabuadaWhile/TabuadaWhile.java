package tabuadaWhile;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int valor;
		int i = 1;
		System.out.println("Entre com um valor para tabuada: ");
		valor = entrada.nextInt();
		
		while(i <= 10) {
			System.out.println(valor + " X " + " = " + (valor * i));
			i++;
		}
		entrada.close();
	}

}
