package exercicio;
import java.util.Scanner;
public class imc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dados = new Scanner(System.in);
		
		System.out.println("Digite o seu peso: ");
		float peso = dados.nextFloat(); // Variavel recebera o valor informado pelo usuário.
		System.out.println("Digite sua altura: ");
		float altura = dados.nextFloat(); // Variavel recebera o valor informado pelo usuário.
		
		dados.close();
		float imc = peso/(altura*altura);
		if(imc < 16) {
			System.out.printf("O seu peso é de " + imc + "Kg, considerado com Magreza Grave!");
		} else if (imc >= 16.1 && imc < 17){
			System.out.printf("O seu peso é de " + imc + "Kg, considerado com Magreza Leve!");
		} else if (imc >= 17.1 && imc < 18.5){
			System.out.printf("O seu peso é de " + imc + "Kg, considerado com Magreza Moderada!");
		} else if (imc >= 18.6 && imc < 25){
			System.out.printf("O seu peso é de " + imc + "Kg, considerado com Saudavel!");
		} else if (imc >= 25.1 && imc < 30){
			System.out.printf("O seu peso é de " + imc + "Kg, considerado com Sobrepeso!");
		} else if (imc >= 30.1 && imc < 35){
			System.out.printf("O seu peso é de " + imc + "Kg, considerado com Obesidade Grau I!");
		} else if (imc >= 35.1 && imc < 40){
			System.out.printf("O seu peso é de " + imc + "Kg, considerado com Obesidade Grau II(Severa)!");
		} else if (imc > 40){
			System.out.printf("O seu peso é de " + imc + "Kg, considerado com Obesidade Grau III(Mórbida)!");
		}
		
	}

}
