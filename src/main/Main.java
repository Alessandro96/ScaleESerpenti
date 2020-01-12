package main;

import java.util.*;
import modelli.*;

public class Main {

	public static void main(String[] args) {
		Gioco gioco = CreazioneGioco.creazioneGioco();
		Tabellone tabellone = gioco.getTabellone();
		LinkedList<Giocatore> giocatori = gioco.getGiocatori();
		
		//Stampo tutto
		for(Giocatore g : giocatori) {
			System.out.println("Segnalino colore " + g.getSegnalino().getColore() 
				+ " (" + g.getNome() + ")" + ", casella " + g.getSegnalino().getCasella().getNumero());
		}
		for(int k = 1; k<=tabellone.getCaselle().size(); k++) {
			System.out.println(gioco.getTabellone().getCaselle().get(k).toString());
		}
		
		//INIZIO SIMULAZIONE
		System.out.println("-----------------------------INIZIO SIMULAZIONE-----------------------------");
		Simulatore.simulazione(gioco);
		System.out.println("-----------------------------FINE SIMULAZIONE-----------------------------");
	}
}


















