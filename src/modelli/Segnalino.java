package modelli;

public class Segnalino {
	
	private String colore;
	private Casella casella;
	
	public String getColore() {
		return colore;
	}
	
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public Casella getCasella() {
		return casella;
	}
	
	public void setCasella(Casella casella) {
		this.casella = casella;
	}
	
	public Segnalino (String colore, Casella casella) {
		this.colore = colore;
		this.casella = casella;
	}
	
}
