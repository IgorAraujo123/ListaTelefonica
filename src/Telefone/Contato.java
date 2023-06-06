package Telefone;

public class Contato {
	
	private String nome;
	private String telefone;
	
	public Contato(String nome,String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public boolean verificar(String nome) {
		return this.nome.equals(nome.toLowerCase());
	}

	@Override
	public String toString() {
		return "contato [nome=" + nome + ", telefone=" + telefone + "]";
	}
}
