import java.util.Observable;
import java.util.Observer;

public class Contador extends Observable {

	private int gol;

	public void setNovoGol(int novoGol) {
		this.gol = novoGol;

		setChanged();
		notifyObservers();
	}

	public int getGol() {
		return this.gol;
	}
}

class TimeJogador implements Observer {

	Observable Contador;

	int golNovoMarcado;

	public TimeJogador(Observable Contador) {
		this.Contador = Contador;
		Contador.addObserver(this);
	}

	@Override
	public void update(Observable contadorSubject, Object arg1) {
		if (contadorSubject instanceof Contador) {
			Contador Contador = (Contador) contadorSubject;
			golNovoMarcado = Contador.getGol();
			System.out.println("Quantidade de gols do jogador: " + golNovoMarcado + "\n\n");
		}
	}
}