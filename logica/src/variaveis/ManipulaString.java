package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
	
		String email = "xpTO@gAmA.com";
		System.out.println("Original: " + email);
		System.out.println("Maiscula: " + email.toUpperCase());
		System.out.println("Miniscula: " + email.toLowerCase());
		System.out.println("Qtde Caracteres: " + email.length());
		System.out.println("Tem @? " + email.contains("@"));
		System.out.println("@ na posicao: " + email.indexOf("@"));
		System.out.println("Parte da Strin: " + email.substring(2,4));
		System.out.println("metade da string : " + email.substring(0,email.length()/2));
		
		
		if (email.contains("@")==true) {
		System.out.println("Nome do usu�rio: " + email.substring(0,email.indexOf("@")));
		System.out.println("servidor:  " + email.substring(email.indexOf("@")+1));
		
		}
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static int length() {
		// TODO Auto-generated method stub
		return 0;
	}

}
