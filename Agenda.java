package agenda;
import contatos.Contato;
	public class Agenda {
		private Contato[] contatos;
		private int qntdContatos;
	public Agenda() {
		this.contatos = new Contato[50];
		this.qntdContatos = 0;
	}
	public void adicionarContato(Contato contato) {
		if(this.qntdContatos < 50) {
			this.contatos[this.qntdContatos] = contato;
			this.qntdContatos++;
			System.out.println("Contato adicionado com sucesso!");
		} else {
			System.out.println("Agenda cheia!");
		}
	}
	public Contato consultarContato(String nome) {
		for(int i = 0; i < this.qntdContatos; i++) {
			if(this.contatos[i].getNome().equalsIgnoreCase(nome)) {
				return this.contatos[i];
			}
		}
		return null;
	}
	public void listarContatos() {
		System.out.println("Lista de contatos: ");
		for(int i = 0; i < this.qntdContatos; i++) {
			System.out.print(this.contatos[i].getNome() + ", ");
		}
	}
	public void listarAniverMes(String mes) {
		System.out.println("Lista de aniversariantes do mes de " + mes + ": ");
		for(int i = 0; i < this.qntdContatos; i++) {
			String datAniver = this.contatos[i].getDatAniversario();
			if(datAniver.substring(2, 4).equals(mes)) {
				System.out.println(this.contatos[i].getNome() + ": " + this.contatos[i].getDatAniversario());
			}
		}
	}
	}