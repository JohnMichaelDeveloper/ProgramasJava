package tratamentoDeErro;

public class SegExemplo {

	public static void main(String[] args) {
		
			try {
			int[] vetor = new int [4];
			
			System.out.println("Antes da Exception");
			
			vetor[5] = 10;
			
			System.out.println("Esse texto n�o sera exibido!");
			}
			catch(ArrayIndexOutOfBoundsException exception) {
				System.out.println("Quando for acessado o �ndice inexistente");
			}
			System.out.println("Esse texto sera exibido ap�s a exception!");
		}	

	}
