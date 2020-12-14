package br.com.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Artista;
import br.com.projetofinal.dao.AlunoDao;

@RestController
@CrossOrigin("*")
public class ArtistaController {

	@Autowired
	private AlunoDao dao;
	
	@PostMapping("/artistapost")
	public ResponseEntity<Artista> getPost(@RequestBody Artista objeto) {
		
		Artista resposta = dao.findById(objeto.getId()).orElse(null);
		
		if (resposta == null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(objeto);
		
		}
	
	@GetMapping("/apagarartista/{cod}")
	public void deletarArtista(@PathVariable int cod) {
		try {
		dao.deleteById(cod);
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	
	@DeleteMapping("/deletar/{cod}")
	public void remover(@PathVariable int cod) {
		dao.findById(cod);
	
	}
	
	@GetMapping("/artista/{cod}")
	public ResponseEntity<Artista> getArtista(@PathVariable int cod) {
		Artista objeto = dao.findById(cod).orElse(null);
		if (objeto == null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(objeto);
	}
	
	@GetMapping("/artistas")
	public ResponseEntity<List<Artista>> getAll() {
		List<Artista> lista = (List<Artista>) dao.findAll();
		if (lista.size()==0) {
		return ResponseEntity.status(400).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	
	
	
	
}
