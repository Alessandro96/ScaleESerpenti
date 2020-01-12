package modelli;

import java.util.*;

public class Gioco {

	private Tabellone tabellone;
	private LinkedList<Dado> dadi;
	private LinkedList<Giocatore> giocatori;
	public Tabellone getTabellone() {
		return tabellone;
	}
	public void setTabellone(Tabellone tabellone) {
		this.tabellone = tabellone;
	}
	public LinkedList<Dado> getDadi() {
		return dadi;
	}
	public void setDadi(LinkedList<Dado> dadi) {
		this.dadi = dadi;
	}
	public LinkedList<Giocatore> getGiocatori() {
		return giocatori;
	}
	public void setGiocatori(LinkedList<Giocatore> giocatori) {
		this.giocatori = giocatori;
	}
	public Gioco(Tabellone tabellone, LinkedList<Dado> dadi, LinkedList<Giocatore> giocatori) {
		this.tabellone = tabellone;
		this.dadi = dadi;
		this.giocatori = giocatori;
	}
	
	
}
