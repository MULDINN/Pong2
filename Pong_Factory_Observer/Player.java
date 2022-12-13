public abstract class Player {
	public String classico;
	public String skin_Jogador1;
	public String skin_Jogador2;
	public float velocidade;
	public int posicao_x;
	public int posicao_y;
}


// "Produtos" que fazem parte da Factory
class Classico1 extends Player {

	public Classico1(String classico) {
		this.classico = classico;
		this.skin_Jogador1 = "CORINTHIANS";
		this.skin_Jogador2 = "PALMEIRAS";
		System.out.println("Bem vindo ao " + this.classico);
		System.out.println("Skin do jogador 1: " + this.skin_Jogador1 + "\nSkin do jogador 2: " + this.skin_Jogador2);
	}
}

class Classico2 extends Player {

	public Classico2(String classico) {
		this.classico = classico;
		this.skin_Jogador1 = "INTERNACIONAL";
		this.skin_Jogador2 = "GRÊMIO";
		System.out.println("Bem vindo ao " + this.classico);
		System.out.println("Skin do jogador 1: " + this.skin_Jogador1 + "\nSkin do jogador 2: " + this.skin_Jogador2);
	}
}

class Classico3 extends Player {
	
	public Classico3(String classico) {
		this.classico = classico;
		this.skin_Jogador1 = "FLAMENGO";
		this.skin_Jogador2 = "VASCO";
		System.out.println("Bem vindo ao " + this.classico);
		System.out.println("Skin do jogador 1: " + this.skin_Jogador1 + "\nSkin do jogador 2: " + this.skin_Jogador2);
	}
}