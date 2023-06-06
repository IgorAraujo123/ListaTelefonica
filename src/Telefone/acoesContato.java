package Telefone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class acoesContato {
	
	private List<Contato> list = new ArrayList<>();
	private Scanner s = new Scanner(System.in);
	private Contato contato = new Contato("", "");
	private boolean contatoAchado = false;
	private int contatoIndex;
	
	public Contato salvarContato(String nome,String telefone) {
		return new Contato(nome.toLowerCase(),telefone.toLowerCase());
	}
	
	public void adicionarContato(Contato contato) {
		list.add(contato);
	}
	
	public void listar() {
		list.forEach(x -> {
			System.out.println(x);
		});
	}
	
	public void buscar() {
		
		System.out.println("Digite o nome do contato: ");
		String nome = s.next();
		
		list.forEach(x -> {
			if(x.verificar(nome)){
				setContato(x);
				setContatoAchado(true);
			}
		});
				
		if(isContatoAchado()) {
			System.out.println("Contato Achado com sucesso!!!");
			System.out.println("Contato: " + getContato());
			setContatoAchado(false);
		}else {
			System.out.println("Contato não encontrado");
		}
				
	}
	
	public void deletar(boolean contatoAchado) {
		buscar();
		
		if(contatoAchado == true) {
			contatoIndex = list.indexOf(getContato());
			list.remove(contatoIndex);
			System.out.println("Contato deletado com sucesso");
		}
	}
	
	private void setContato(Contato contato) {
		this.contato = contato;
	}
	
	private Contato getContato() {
		return this.contato;
	}

	public boolean isContatoAchado() {
		return contatoAchado;
	}

	private void setContatoAchado(boolean contatoAchado) {
		this.contatoAchado = contatoAchado;
	}
	
}
