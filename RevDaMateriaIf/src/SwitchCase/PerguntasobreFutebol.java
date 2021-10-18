package SwitchCase;
import java.util.Scanner;

public class PerguntasobreFutebol {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		System.out.println("Qual ano o Brasil foi Tetra na Copa do Mundo de Futebol?");
		int num = dados.nextInt();
		dados.close();
		
		switch(num) {
		case 1985:
			System.out.println("Você errou, tente novamente!");
			break;
		case 1994:
			System.out.println("Você acertou, Parabéns!");
			break;
		case 2002:
			System.out.println("Você errou, tente novamente!");
			break;
		case 1987:
			System.out.println("Você errou, tente novamente!");
			break;
			
		default:
			System.out.println("Número inválido!");
		}
	}

}
