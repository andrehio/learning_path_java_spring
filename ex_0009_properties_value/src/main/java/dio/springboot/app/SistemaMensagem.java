package dio.springboot.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {
	/* Forma declarativa
	 * private String nome = "ANDRE HIOKI"; private String email =
	 * "ahdreki@gmail.com" private List<Long> telefones = new
	 * ArrayList<>(Arrays.asList(new Long[]{11956781254L}));
	 */
	
	//Atraves do Spring e application.properties
	@Value("${name: Nao Encontrado}") //se não for encontrado a "name" em application.properties, um valor padrão será dado
	private String nome;
	@Value("${email}")
	private String email;
	@Value("${telefones}")
	private List<Long> telefones =
			new ArrayList<>(Arrays.asList(new Long[]{11956781254L}));

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Mensagem enviada por: " + nome
				+ "\nE-mail:" + email
				+ "\nCom telefones para contato: " + telefones);
		System.out.println("Seu cadastro foi aprovado");
	}
}
