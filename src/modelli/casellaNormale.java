package modelli;

public class casellaNormale extends casella {

	public casellaNormale(int numero) {
		super(numero);
	}

	@Override
	public int getCasella() {
		return super.getNumero();
	}
	
}
