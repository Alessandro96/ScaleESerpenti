package modelli;

import java.util.*;

public class Tabellone{

	private HashMap<Integer,Casella> caselle;

	public HashMap<Integer, Casella> getCaselle() {
		return caselle;
	}

	public void setCaselle(HashMap<Integer,Casella> caselle) {
		this.caselle = caselle;
	}
	
	public void addCasella(Casella casella) {
		this.caselle.put(casella.getNumero(), casella);
	}
	
	public Tabellone() {
		this.caselle = new HashMap<Integer, Casella>();
	}
	
	public Tabellone(Map<Integer, Casella> caselle) {
		this.caselle.putAll(caselle);
	}
	
}
