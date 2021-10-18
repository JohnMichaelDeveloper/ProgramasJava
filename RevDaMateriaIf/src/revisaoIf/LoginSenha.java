package revisaoIf;

public class LoginSenha {

	public static void main(String[] args) {
		// Verificar se usuário digitou a login e a senha corretamente.
		
		String login, senha;
		login = "adm";
		senha = "1234";
		
		if(login == "adm" && senha == "1234") {
			System.out.println("Próxima etapa");
		} else {
			System.out.println("Confira os dados");
		}
		
	}

}
