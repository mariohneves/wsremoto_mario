package tratarexcecao;

public class Minhaexcecao {

		
		public static String tratar(Exception e) {	
		if (e instanceof NullPointerException) {
			return "Objeto Nulo";
		}else if (e instanceof NumberFormatException) {
			return "Número inválido";
		}else if (e instanceof ArrayIndexOutOfBoundsException) {
			return "Vetor estourou";
			
		}else {
			e.printStackTrace();
			return "Exceção desconhecida";
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
