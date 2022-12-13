class FactoryPlayer {

	//Condicionais que permitem que a Factory produza o objeto que desejamos
	public Player getPlayer(String classico) {
		if (classico.equals("Classico 1"))
			return new Classico1(classico);
		if (classico.equals("Classico 2"))
			return new Classico2(classico);
		if (classico.equals("Classico 3"))
			return new Classico3(classico);
        return null;
	}

}