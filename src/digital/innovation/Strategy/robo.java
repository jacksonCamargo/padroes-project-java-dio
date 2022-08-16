package digital.innovation.Strategy;

public class robo {

	private Comportamento comportamento;
	
	

	public void setStrategy(Comportamento comportamento) {
		this.comportamento = comportamento;
	}

	public void mover() {
		comportamento.mover();
	}
}
