package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// dados n�mericos: tipo de dado que PODE ser utilizado em uma express�o
		// aritimetica, ou quando for um dado sensivel para busca (grau de import�ncia)
		/*
		 * No Java representado pelo : int -> se n�mero inteiro double -> n�meros reais
		 * (casa decimal � importante) Float -> Casas decimais com menor percis�o que a
		 * double CEP no contexto correios CPF no contexto receita federal
		 * (sensibilidade e necessidade critica do dado)
		 * 
		 * 
		 * Dados alfa-n�mericos: n�o ser� utilizado para c�lculos Em java � representado
		 * pela String (nesse caso necess�rio criar entre "") CEP = no contexto DP do
		 * Itau CPF no contexto cadastro faculdade
		 * 
		 * 
		 * Swing = pacote que cont�m recursos para telas em java
		 * 
		 * PARSE: processo de convers�o da variavel
		 * 
		 * Tipos n�mericos = tipos primitivos, fazem parte da linguagem, fazendo com que
		 * seja necess�rio utilizar uma class para acessar um m�todo chamo a class para
		 * acessar o m�todo, Integer, Double e Float (Classes criadas para converter os
		 * campos primitivos)
		 * 
		 */

		// criar variavel ==> <tipo de dado> <nome da variavel> = <valor>
		String nome = JOptionPane.showInputDialog("Digite o nome:");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso:"));
		System.out.println("Nome  : " + nome);
		System.out.println("Idade : " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Peso  : " + peso);

		double imc = peso / (altura * altura);
		System.out.println("IMC     " + imc);

	}

}
