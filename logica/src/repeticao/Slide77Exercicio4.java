package repeticao;

import javax.swing.JOptionPane;

public class Slide77Exercicio4 {

	public static void main(String[] args) {
		//

		int cont = 0;
		int idade = 0;
		String nome = "0";
		int total =  0;
		int idadetotal =  0;
		String nomeExperiente = "";
		int idadeExperiente=0;
		String nomeJovem="";
		int idadeJovem=0;
						
		
		do {
			nome = JOptionPane.showInputDialog("Digite seu nome:");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
			
			idadetotal +=  idade;
			 System.out.println(idadetotal);
			
			total++;
			
			if (idade >= 18) {
				cont++;
				
			if (idade>idadeExperiente) {
				idadeExperiente=idade;
				nomeExperiente=nome;
			
				
			if (idade<idadeJovem || total==1) {
				idadeJovem=idade;
				nomeJovem=nome;
			}
				
			}
			
			}
			

		} while (JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "Pergunta", JOptionPane.YES_NO_OPTION) == 0);
			
		System.out.println("A quantidade de pessoas maiores de idade � : " + cont);
		System.out.println("M�dia de Idades: " + (idadetotal / total));
		System.out.println("A pessoa mais experiente � " + nomeExperiente + " com a idade: " + idadeExperiente);
		System.out.println("A pessoa mais jovem � " + nomeJovem + " com a idade: " + idadeJovem);
		
		/*
		 * apresentar os resultados com casas decimais especificas
		 * float media = idadetotal / total;
		 * 
		 * system.out.printf("M�dia: %.2f\n", media);
		 * 
		 * % variavel
		 * .2 -> quantidade de casas decimais
		 * f --> fracional
		 * \n pra mostrar e dar enter
		 * 
		 */

	}

}
