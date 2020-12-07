package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		// 
		/*
		 * Game = adivinhação
		 * Jogador 1 : digita um número inteiro
		 * Jogador 2: vai ter que acertar o numero
		 * Quando acertar, mostra Parabéns
		 * 
		 * Plus:
		 * - Implemente uma ajuda da sua aplicação. Se o jogador estiver chutando alto falar que é mais baixo
		 * 
		 * Quando o jogador 2 acertar, mostrar a quantidade de tentativas
		 */

		
		short jogador1 = Short.parseShort(JOptionPane.showInputDialog("Escolha um número"));
		short jogador2 = 0;
		short count=0;
		
		
		do {
			jogador2= Short.parseShort(JOptionPane.showInputDialog("Adivinhe o número escolhido pelo jogador 1"));
			count++;
			
			
			if (jogador2 > jogador1) {
				System.out.println("Tente um número mais alto");
			} else if (jogador2 < jogador1) {
				System.out.println("Tente um número mais baixo");
			}	
			
		}while (jogador1!=jogador2) ;
			System.out.println("Você acertou o número com " + count + " Tentativa!");
		
	
		
			
	
			
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
