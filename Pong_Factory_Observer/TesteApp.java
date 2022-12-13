public class TesteApp {

	public static void main(String args[]) {
		//Observer
		int novoGol = 2;
		Contador contador = new Contador();
		TimeJogador timeJogador = new TimeJogador(contador);
		contador.setNovoGol(novoGol);

		//Factory
		FactoryPlayer factory = new FactoryPlayer();
		String classico = "Classico 1"; //Altere entre "Classico 1", "Classico 2" e "Classico 3" para mudar as skins dos jogadores
		factory.getPlayer(classico);
	}
}