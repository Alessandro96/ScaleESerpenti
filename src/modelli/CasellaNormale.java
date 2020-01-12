package modelli;

public class CasellaNormale extends Casella {

	public CasellaNormale(int numero) {
		super(numero);
	}

	@Override
	public int getCasella() {
		return super.getNumero();
	}

	@Override
	public String toString() {
		return "Sono la casella numero " + super.getNumero() + " e sono normale";
	}
	
}
