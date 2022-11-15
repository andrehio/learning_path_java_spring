package inversaoDeControle;

public class Pedido {
	
	private EnviarEmails enviar = EnviarEmails.obterDadosEmail();

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		
		pedido.gravar();
	}
	
	public void gravar() {
		this.enviar.retornar("Pedido criado!");
	}

}
