package br.com.concessionariarubinho.testes;

import javax.swing.JOptionPane;

import br.com.concessionariarubinho.modelo.CarroFormula1;

public class TesteCarro {

	public static void main(String[] args) {
		
		CarroFormula1 objeto = new CarroFormula1();
		
		objeto.preencherEscuderia(JOptionPane.showInputDialog("Escuderia"));
		objeto.preencherCor(JOptionPane.showInputDialog("Cor"));
		objeto.preencherValor(Float.parseFloat(JOptionPane.showInputDialog("Valor")));
		objeto.ligar();
		objeto.acelerar(40);
		objeto.acelerar(30);
		objeto.desacelerar(20);
		System.out.println("Velocidade: " + objeto.retornarVelocidade());
		System.out.println(objeto.ligar());
		objeto.brecar();
		System.out.println(objeto.desligar());
		
		
		
		
		
		
		
		System.out.println("Escuderia : " + objeto.retornarEscuderia());
		System.out.println("Valor : " + objeto.retornarValor());
		System.out.println("Cor : " + objeto.retornarCor());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
