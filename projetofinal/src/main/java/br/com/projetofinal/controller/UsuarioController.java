package br.com.projetofinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Usuario;
import br.com.projetofinal.dao.UsuarioDAO;

@RestController //Indica que essa é a controller que vai ficar direcionando
@CrossOrigin("*") //Indica que requisições podem vir fora do servidor, sem ele a resposta só vem quando a requisição parte do mesmo servidor

public class UsuarioController {

	/*
	 * Model --> Tirando a controller todo o restante é definido como model
	 */
	
	@Autowired //representa que quem vai gerar é o SpringBoot
	private UsuarioDAO dao;
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario objeto){
			try {
			dao.save(objeto);
		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(404).build();
		}
			return ResponseEntity.ok(objeto);
		}
		
		
		
	
	
	@GetMapping("/usuarios")
	public ResponseEntity<List<Usuario>> getAll(){
		List<Usuario> lista = (List<Usuario>) dao.findAll();	
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/usuario/{cod}")
	public ResponseEntity<Usuario> getUser(@PathVariable int cod) {
		Usuario objeto = dao.findById(cod).orElse(null);
		if (objeto==null) {
		return ResponseEntity.status(404).build();
	}
		return ResponseEntity.ok(objeto);
	}
	
	@PostMapping("/login")
	public ResponseEntity<Usuario> logar(@RequestBody Usuario objeto){
		Usuario resposta = dao.findByEmailAndSenha(objeto.getEmail(), objeto.getSenha());
		if (resposta==null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);
		
	}
	
	
	
	
	
}
