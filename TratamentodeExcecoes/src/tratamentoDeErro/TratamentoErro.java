package tratamentoDeErro;

public class TratamentoErro 
{

	public static void main(String[] args) 
	{
		try {
		// TODO Auto-generated method stub
		
		int[] myNumbers = {1, 2, 3};
		System.out.println(myNumbers[10]); //error!
		} catch (Exception e) {
			System.out.println("Algo deu errado.");
		} finally {
			System.out.println("O 'try catch' terminou.");
		}
	}

}

