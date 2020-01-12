package modelli;

public class CasellaNormale extends Casella {

	public CasellaNormale(int numero) {
		super(numero);
	}

	@Override
	public Casella getCasella(Tabellone tabellone) {
		return this;
	}

	@Override
	public String toString() {
		return "Sono la casella numero " + super.getNumero() + " e sono normale";
	}
	
}
