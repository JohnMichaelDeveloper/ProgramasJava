package consdecombustivel;

import java.util.Scanner;

public class ConsDeCombustivel {

	public static void main(String[] args) {

		/* var */
		double horas, velmedia, distancia, consumo;
		

		/* inicio */
		Scanner teclado = new Scanner(System.in);

		System.out.println("Programa de c�lculo da quantidade de litros de combustivel consumido por veiculos ");
		System.out.println();
		System.out.print("Por favor, digite o tempo que voc� gastou em sua viagem (horas): ");
		horas = teclado.nextDouble();
		System.out.print("Informe sua velocidade m�dia em que voc� fez o percuso (Km/h): ");
		velmedia = teclado.nextDouble();
		distancia = horas * velmedia;
		consumo = distancia / 12;
		
		System.out.println();
		System.out.printf("Velocidade m�dia = " + velmedia + "horas\n");
		System.out.printf("Tempo gasto = " + horas + "horas\n");
		System.out.printf("Distancia percorrida = " + distancia + "Km\n");
		System.out.printf("Quantidade de combustivel utilizado em litros foi: %.2f ", consumo);

		/* Fim */
		teclado.close();

	}

}
