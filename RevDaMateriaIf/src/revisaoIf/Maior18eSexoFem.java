package revisaoIf;

public class Maior18eSexoFem {

	public static void main(String[] args) {
		// Vamos verificar se uma pessoa é maior de idade ou do sexo feminino para preencher a vaga de emprego.
		// para seguir adiante na seleção.
		
		int idade;
		String sexo;
		idade = 15; //false
		sexo = "Feminino"; // true
		if (idade > 18 || sexo =="Feminino") { // Como o if pede uma das duas então a resposta será "true" nesse caso.
			System.out.println("Próxima etapa"); // true
		} else {
			System.out.println("Etapa encerrada"); //false
		}
		

	}

}
