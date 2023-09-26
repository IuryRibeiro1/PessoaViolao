package TesteUm;

public class Individuo {
	
	private long id;
	private String nome;
	private int idade;
	private String cpf;
	
	public Individuo(long i, String n, int ida, String c) {
		this.id = i;
		this.nome = n;
		this.idade = ida;
		this.cpf = c;
	}
	
	public long getid() {
		return this.id;
	}
	
	public void setid(long i) {
		this.id = i;
	}

	public String getnome() {
		return this.nome;
	}
	
	public void setnome(String n) {
		this.nome = n;
	}
	
	public int getidade() {
		return this.idade;
	}
	
	public void setidade(int ida) {
		this.idade = ida;
	}
	
	public String getcpf() {
		return this.cpf;
	}
	
	public void setCpf(String c) {
		this.cpf = c;
	}

	public void pessoa() {
		System.out.println("ID: " + this.getid());
		System.out.println("Nome:  " + this.getnome());
		System.out.println("Idade: " + this.getidade());
		System.out.println("CPF: " + this.getcpf());
	}
}
