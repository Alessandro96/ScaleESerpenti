package modelli;
public abstract class Casella {
	private int numero;
	
	public Casella(int numero) {
		this.numero = numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public abstract int getCasella();
	
	@Override
	public abstract String toString();
}
