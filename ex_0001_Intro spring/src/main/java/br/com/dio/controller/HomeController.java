package br.com.dio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.dio.config.BeanTeste;
import br.com.dio.config.BeanTeste2;
import br.com.dio.service.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String home(Model model) {

		userService.buscaDadosBanco();
		userService.deletaDados();
		userService.buscaUsuarioPorId(1);

//		model.addAttribute("mensagem", "Hello Word");

		return "home";
	}
	

	@Autowired
	private BeanTeste teste1;
	
	@Autowired
	private BeanTeste teste2;
	
	@RequestMapping("/bean_single_e_proto")
	public void metodoBeanSingleProto(Model model) {
		teste1.setNome("Bean teste 1");
		
		System.out.println(teste1.getNome());
		System.out.println(teste2.getNome());
		
	}
	
	@Autowired
	private BeanTeste2 teste3;
	
	@RequestMapping("/bean_scopes")
	public void metodoBeanReqSes(Model model) {
		
		System.out.println(teste3.getNome());
		teste3.setNome("Bean teste 1");
		System.out.println(teste3.getNome());
		
		//recarregue varias vezes a pagina para simular requisições
		
	}

}
