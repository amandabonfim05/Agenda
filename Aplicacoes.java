package aplicacao;
import java.util.Scanner;
import agenda.Agenda;
import contatos.Contato;
	public class Aplicacoes {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Agenda a = new Agenda();
			int opcao;
			do {
				System.out.println("\nEscolha uma opção:");
				System.out.println("1.Adicionar contatos");
				System.out.println("2.Consultar contatos");
				System.out.println("3.Listar aniversariantes do mes");
				System.out.println("4.Listar todos os contatos");
				System.out.println("0.Sair");
				opcao = sc.nextInt();
				sc.nextLine();
				//escolha
				switch(opcao) {
				case 1:
					System.out.println("Nome: ");
					String nome = sc.nextLine();
					System.out.println("Telefone: ");
					String telefone = sc.nextLine();
					System.out.println("Data de aniversario(DDMMAA): ");
					String datAniver = sc.nextLine();
					System.out.println("Email: ");
					String email = sc.nextLine();
					Contato novoContato = new Contato(nome, telefone, datAniver, email);
					a.adicionarContato(novoContato);
					break;
				case 2:
					System.out.println("Digite o nome do contato: ");
					String nomeConsulta = sc.nextLine();
					Contato contatoConsultado = a.consultarContato(nomeConsulta);
					if(contatoConsultado != null) {
						System.out.println("Contato encontrado: ");
						System.out.println("Nome: " + contatoConsultado.getNome());
						System.out.println("Telefone: " + contatoConsultado.getTelefone());
						System.out.println("Data de aniversario: " + contatoConsultado.getDatAniversario());
						System.out.println("Email: " + contatoConsultado.getEmail());
						
					} else {
						System.out.println("Contato não encontrado");
					}
					break;
				case 3:
					System.out.println("Digite o mes(MM) para listar os aniversariantes: ");
					String mes = sc.nextLine();
					a.listarAniverMes(mes);
					break;
				case 4:
					a.listarContatos();
					break;
				case 0:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção invalida");
					break;
				}
			} while(opcao != 0);
			sc.close();
		}
	}
