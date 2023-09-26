package TesteUm;

public class Violao {
	
	private long id;
	private String modelo;
	private String cor;
	private double preco;
	
	
	public Violao(long i, String m, String c, double p) {
		this.id = i;
		this.modelo = m;
		this.cor = c;
		this.preco = p;
	}
	
	public long getId() {
		return this.id;
	}
	
	public void setId(long i) {
		this.id = i;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String c) {
		this.cor = c;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setPreco(double p) {
		this.preco = p;
	}
	
	public void violao() {
		System.out.println("ID de compra: " + this.getId());
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Cor:" + this.getCor());
		System.out.println("Valor R$ " + this.getPreco());
	
	}	
}
