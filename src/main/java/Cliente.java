
public class Cliente {
	private String nome;
	private String cpf;
	private boolean assinatura;
	
	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.assinatura = false;
	}
	
	public void assinar() {
		this.assinatura = true;
	}
	
	public void cancelarAssinatura() {
		this.assinatura = false;
	}

	public double desconto() {
		if (this.assinatura) {
			return 0.05;
		}
		return 0;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
}
