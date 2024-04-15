package contatos;
public class Contato {
	protected String nome;
	protected String telefone;
	protected String datAniversario;
	protected String email;
	public Contato(String n, String t, String da, String e) {
		this.setNome(n);
		this.setTelefone(t);
		this.setDatAniversario(da);
		this.setEmail(e);
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public String getTelefone() {
		return this.telefone;
	}
	public void setTelefone(String t) {
		this.telefone = t;
	}
	public String getDatAniversario() {
		return this.datAniversario;
	}
	public void setDatAniversario(String da) {
		this.datAniversario = da;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String e) {
		this.email = e;
	}
}