package revisaoIf;

public class Maior18eSexoFem {

	public static void main(String[] args) {
		// Vamos verificar se uma pessoa � maior de idade ou do sexo feminino para preencher a vaga de emprego.
		// para seguir adiante na sele��o.
		
		int idade;
		String sexo;
		idade = 15; //false
		sexo = "Feminino"; // true
		if (idade > 18 || sexo =="Feminino") { // Como o if pede uma das duas ent�o a resposta ser� "true" nesse caso.
			System.out.println("Pr�xima etapa"); // true
		} else {
			System.out.println("Etapa encerrada"); //false
		}
		

	}

}
