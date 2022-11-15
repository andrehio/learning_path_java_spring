# Primeiros passos

Criação de um projeto Maven básico, sem adicionar dependencias extras, pelo site do <a href="https://start.spring.io/">Spring Initializr</a>.

### Demonstração de implementação sem o springboot
	
Calculadora calculadora = new Calculadora();

System.out.println("O resultado é " + calculadora.somar(2,7));

### Demonstração de implementação com o springboot

Usar a interface "CommandLineRunner" e usar uma instancia da Calculadora atraves da anotação @Autowired