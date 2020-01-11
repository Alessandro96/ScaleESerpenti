package modelli;
public abstract class casella {
	private int numero;
	
	public casella(int numero) {
		this.numero = numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public abstract int getCasella();
}
