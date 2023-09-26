package TesteUm;

public class Principal {

	public static void main(String[] args) {
		
		Individuo individuo = new Individuo(1,"Iury", 26, "025.515.032-64");
		individuo.pessoa();
		
		System.out.println();
	
		Violao violao = new Violao(1,"Takamine","Preto",1500.79);
		violao.violao();
		
	}

}
