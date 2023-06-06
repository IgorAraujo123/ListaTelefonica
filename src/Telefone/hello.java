package Telefone;

import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		acoesContato acoesContato = new acoesContato();
		int opt = 0;

		while(opt != 5) {
			System.out.println("1 - Salvar"
							 + "\n2 - Deletar"
							 + "\n3 - Buscar"
							 + "\n4 - listar"
							 + "\n5 - Sair");
							 opt = s.nextInt();
			
			switch(opt) {
				case 1:
					System.out.println("Digite o nome do contato: ");
					String nome = s.next();
					System.out.println("Digite o telefone do contato: ");
					String telefone = s.next();
					Contato novoContato =  acoesContato.salvarContato(nome, telefone);
					acoesContato.adicionarContato(novoContato);
					break;
				case 2:
					acoesContato.deletar(acoesContato.isContatoAchado());
					break;
				case 3:
					acoesContato.buscar();
					break;
				case 4:
					acoesContato.listar();
					break;
				case 5:
					break;
				default:
					System.out.println("Opção icorreta");
					break;
			}
		}
	}

}
