package br.universidade.implementacao;

import br.com.universidadexyz.beans.Aluno;
import br.com.universidadexyz.beans.Curso;
import br.com.universidadexyz.beans.Endereco;
import br.com.universidadexyz.beans.Professor;
import br.com.universidadexyz.beans.Turma;
import br.com.universidadexyz.util.Magic;

public class ImplementarTurma {

	
	public static void main(String[] args) {
		
		Turma t = new Turma(
				Magic.i("Numero"),
				new Aluno (
						10,
						"Mario",
						"40719678897"					
						),
				new Professor(
						30,
						"Humberto",
						"MS",
						15,
						new Endereco(
								"Rua",
								"10",
								"O",
								"Altos",
								"SP",
								"SP",
								"05413"
								)
						),
				new Curso(
		
        				),
				Magic.s("Periodo"),
				Magic.s("Sala")
				);
				
						
	
						
		
                
                
				
	}

}
