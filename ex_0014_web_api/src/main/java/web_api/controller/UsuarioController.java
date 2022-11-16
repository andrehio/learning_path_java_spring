package web_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web_api.model.Usuario;
import web_api.repository.UserRepository;


//O controler é so um proxy, da o direcionamento.
//Não aplique regras de negocio no controller, mas sim no Service ou de dominio da aplicação

@RestController
@RequestMapping("/users")
public class UsuarioController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public List<Usuario> getUsers(){
		return repository.findAll();
	}
	
	@GetMapping("/{username}")
	public Usuario getOne(@PathVariable("username") String username) {
		return repository.findByUsername(username);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		repository.deleteById(id);
	}
	
	@PostMapping
	public void postUser(@RequestBody Usuario usuario) {
		repository.save(usuario);
	}
}
