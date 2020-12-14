package br.com.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.beans.Usuario;

/*
 * Design Pattern -> DAO = Data Access Object
 * O DAO é uma classe/interface que é responsável pelo CRUD. Manipulação de dados 
 * C -> Create - cadastrar algum dado --> insert
 * R -> Read - consultar algum dado   --> select
 * U -> Update - alterar algum dado   --> update
 * D -> Delete - excluir algum dado   --> delete
 * 
 */

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
	
	/*
	 *  save() --> Gravar ou alterar um registro/linha da tabela
	 *  findById() => Pesquisar pela chave primária
	 *  findAll() => Pesquisar todos
	 *  deleteById() => Apagar pelo ID
	 *  deleteAll() => Apagar todas as linhas da tabela
	 */
	
	public Usuario findByEmailAndSenha(String email, String senha);
	
	
	
	
	
	
	

}
