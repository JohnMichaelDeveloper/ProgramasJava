package revisaoSwitchCase;

public class TimesPorEstadoRJouSP {

	public static void main(String[] args) {
		
		String time = "Vasco";
		switch (time) {
		case "Palmeiras":
		case "Santos":
		case "Sao Paulo":
			System.out.println("Time do estado de São Paulo");
			break;
		
		case "Vasco":
		case "Flamengo":
		case "Bota Fogo":
			System.out.println("Time do estado de Rio de Janeiro");
			break;
		
		default:
			System.out.println("Time fora do eixo Rio e São Paulo");
		}
		
	}

}
