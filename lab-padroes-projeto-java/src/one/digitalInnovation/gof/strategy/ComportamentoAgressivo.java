package one.digitalInnovation.gof.strategy;

public class ComportamentoAgressivo implements Comportamento {
	
	@Override
	public void mover() {
		System.err.println("Movendo-se agressivamente...");
	}
	
}
