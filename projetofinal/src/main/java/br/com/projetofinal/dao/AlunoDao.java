package br.com.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.beans.Artista;

public interface AlunoDao extends CrudRepository<Artista, Integer> {

}
