package exArray;
import java.util.Scanner;
public class ArmazenaValoresNoVetor {

	public static void main(String[] args) {
		// Neste exemplo o usu�rio dever� armazenar 7 n�meros reais no vetor e no final ser�o exibidos.
		
			Scanner teclado = new Scanner(System.in);
			int i;
			System.out.println("Informe a quantidade de valores que entrar� no vetor: ");
			i = teclado.nextInt();
			System.out.println("");
			double[] valores = new double[i];
			
			for(int x = 0; x < i; x++) {
				System.out.print("Informe " + (x + 1) + "� valor: ");
				valores[x] = teclado.nextDouble();
			}
			System.out.println("");
			System.out.println("== Valores armazenados no vetor ==");
			System.out.println("");
			
			for(int x = 0; x < i; x++) {
				System.out.println("Valor na posi��o " + x + " = " + valores[x]);
			}
			teclado.close();
			System.out.println("");
			System.out.println("Me siga no GitHub :)    JohnMichaelDeveloper");
	}

}
