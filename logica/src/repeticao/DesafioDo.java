package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		// 
		/*
		 * Game = adivinha��o
		 * Jogador 1 : digita um n�mero inteiro
		 * Jogador 2: vai ter que acertar o numero
		 * Quando acertar, mostra Parab�ns
		 * 
		 * Plus:
		 * - Implemente uma ajuda da sua aplica��o. Se o jogador estiver chutando alto falar que � mais baixo
		 * 
		 * Quando o jogador 2 acertar, mostrar a quantidade de tentativas
		 */

		
		short jogador1 = Short.parseShort(JOptionPane.showInputDialog("Escolha um n�mero"));
		short jogador2 = 0;
		short count=0;
		
		
		do {
			jogador2= Short.parseShort(JOptionPane.showInputDialog("Adivinhe o n�mero escolhido pelo jogador 1"));
			count++;
			
			
			if (jogador2 > jogador1) {
				System.out.println("Tente um n�mero mais alto");
			} else if (jogador2 < jogador1) {
				System.out.println("Tente um n�mero mais baixo");
			}	
			
		}while (jogador1!=jogador2) ;
			System.out.println("Voc� acertou o n�mero com " + count + " Tentativa!");
		
	
		
			
	
			
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
