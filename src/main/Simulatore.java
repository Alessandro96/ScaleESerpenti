package main;

import java.util.LinkedList;

import modelli.Casella;
import modelli.Giocatore;
import modelli.Gioco;
import modelli.Segnalino;
import modelli.Tabellone;

public class Simulatore {
	public static void simulazione(Gioco gioco) {
		Tabellone tabellone = gioco.getTabellone();
		LinkedList<Giocatore> giocatori = gioco.getGiocatori();

		Giocatore giocatore;
		Segnalino segnalino;
		Casella casella;		
		
		Giocatore vincitore = null;
		
		while(vincitore == null) {
			//prendiTurno()
			giocatore = giocatori.pop();
			System.out.println("E' il turno del " + giocatore.getNome());
			giocatori.add(giocatore);
			
			//prendiPezzo()
			segnalino = giocatore.getSegnalino();
				
			//nuovaCasella()
			casella = nuovaCasella(giocatore, segnalino, tabellone);
			
			//muoviSegnalino()
			muoviSegnalino(tabellone, casella, segnalino);
			
			//controlloVincitore()
			vincitore = controlloVincitore(giocatore, tabellone);
		}
		
		System.out.println("Ha vinto il " + vincitore.getNome() + "!");
	}
	
	public static Casella nuovaCasella(Giocatore giocatore, Segnalino segnalino, Tabellone tabellone){
		int tiroDadi = giocatore.tiroDadi();
		System.out.println("Hai tirato i dati ed è uscito " + tiroDadi);
		int grandezzaTabellone = tabellone.getCaselle().size();
		int posizioneAttuale = segnalino.getCasella().getNumero();
		int posizioneFinale = tiroDadi+posizioneAttuale;
		
		if(posizioneFinale>grandezzaTabellone) {
			posizioneFinale = grandezzaTabellone-(posizioneFinale-grandezzaTabellone);
			System.out.println("Hai superato il limite del tabellone, torni alla casella " + posizioneFinale);
		}

		System.out.println("Sei arrivato alla casella " + posizioneFinale);
		return tabellone.getCaselle().get(posizioneFinale);
	}
	
	public static void muoviSegnalino(Tabellone tabellone, Casella casella, Segnalino segnalino) {
		segnalino.setCasella(casella.getCasella(tabellone));
	}
	
	public static Giocatore controlloVincitore(Giocatore giocatore, Tabellone tabellone){
		if(giocatore.getSegnalino().getCasella().getNumero()==tabellone.getCaselle().size())
			return giocatore;
		return null;
	}
}
