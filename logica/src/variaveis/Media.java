package variaveis;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {
		/* Crie uma aplica��o que receba: (Nome da disciplina, notas dos 1�, 2� semestres, calcula e exiba a m�dia
		 * 
		 * 
		 */

		String nomedadisciplina = JOptionPane.showInputDialog("Nome da Disciplina:");
		Double Nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota do 1� Semestre"));
		Double Nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota do 2� Semestre"));
		Double Media = (Nota1 + Nota2) / 2;
		
		
				
		System.out.println("Disciplina:" + nomedadisciplina);
		System.out.println("1� Semestre:" + Nota1);
		System.out.println("2� Semestre:" + Nota2);
		System.out.println("M�dia Aluno:" + (Media));
		
		
		
		
		/*
		 * Regras para identificadores: 
		 *  1� - N�o come�ar com n�meros
		 *  2� - N�o usar palavras reservadas da linguagem (double, int, class, etc...)
		 *  3� - N�o usar caracteres especiais
		 *  
		 *  Padr�es para identificadores:
		 *  CamelCase: cada palavra de um nome deve come�ar com letra maiscula (exceto variaveis que come�am com letra miniscula)
		 *  Utilizar _ no local dos espa�os data_de_nascimento
		 *  Utilize nomes significativos, evite criar variav�is sem sentido (X,y,Z e etc,,,)
		 *  Padr�o UML (POO) criado para qualquer linguagem com paradigma ligado a objeto
		 *  	-> Toda Classe deve iniciar com letra maiscula
		 *  	-> Toda variavel deve iniciar com letra miniscula
		 *  	-> Todo m�todo pertence a uma classe e deve vir seguido de " "
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
