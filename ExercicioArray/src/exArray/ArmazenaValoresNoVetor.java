package exArray;
import java.util.Scanner;
public class ArmazenaValoresNoVetor {

	public static void main(String[] args) {
		// Neste exemplo o usuário deverá armazenar 7 números reais no vetor e no final serão exibidos.
		
			Scanner teclado = new Scanner(System.in);
			int i;
			System.out.println("Informe a quantidade de valores que entrará no vetor: ");
			i = teclado.nextInt();
			System.out.println("");
			double[] valores = new double[i];
			
			for(int x = 0; x < i; x++) {
				System.out.print("Informe " + (x + 1) + "º valor: ");
				valores[x] = teclado.nextDouble();
			}
			System.out.println("");
			System.out.println("== Valores armazenados no vetor ==");
			System.out.println("");
			
			for(int x = 0; x < i; x++) {
				System.out.println("Valor na posição " + x + " = " + valores[x]);
			}
			teclado.close();
			System.out.println("");
			System.out.println("Me siga no GitHub :)    JohnMichaelDeveloper");
	}

}
