package main;

import java.util.*;
import modelli.*;

public class Main {

	public static void main(String[] args) {
		Gioco gioco = creazioneGioco();
		//Stampo tutto
				for(Giocatore g : gioco.getGiocatori()) {
					System.out.println("Segnalino colore " + g.getSegnalino().getColore() 
							+ " (" + g.getNome() + ")" + ", casella " + g.getSegnalino().getCasella().getNumero());
				}
				for(int k = 0; k<gioco.getTabellone().getCaselle().size(); k++) {
					System.out.println(gioco.getTabellone().getCaselle().get(k));
				}
	}
	
	public static Gioco creazioneGioco() {
		Scanner scanner = new Scanner(System.in);
		LinkedList <Giocatore> giocatori = new LinkedList<>();
		Tabellone tabellone = new Tabellone();
		LinkedList <Dado> dadi = new LinkedList<>();
		
		//Creazione dadi
		System.out.println("Inserisca il numero di dadi a sei facce");
		int numeroDadi = scanner.nextInt();
		for(int z = 0; z<numeroDadi; z++) {
			dadi.add(new Dado(6));
		}
		
		//Creazione tabellone
		System.out.println("Inserisca il numero di righe");
		int righe = scanner.nextInt();
		System.out.println("Inserisca il numero di colonne");
		int colonne = scanner.nextInt();
		for(int i=0; i<(righe*colonne); i++) {
			tabellone.addCasella(new CasellaNormale(i));
		}
		
		//Creazione serpenti
		System.out.println("Inserisca il numero di caselle serpente");
		int numeroSerpenti = scanner.nextInt();
		int testaSerpente;
		for(int i=1; i<=numeroSerpenti; i++) {
			System.out.println("Inserisca il numero di casella della testa del serpente numero " + i);
			testaSerpente = scanner.nextInt();
			System.out.println("Inserisca il numero di casella della coda del serpente numero " + i);
			tabellone.addCasella(new CasellaSerpente(testaSerpente, scanner.nextInt()));
		}
		
		//Creazione scale
		System.out.println("Inserisca il numero di caselle scala");
		int numeroScale = scanner.nextInt();
		int cimaScala;
		for(int i=1; i<=numeroScale; i++) {
			System.out.println("Inserisca il numero di casella della cima della scala numero " + i);
			cimaScala = scanner.nextInt();
			System.out.println("Inserisca il numero di casella dei piedi della scala numero " + i);
			tabellone.addCasella(new CasellaScala(scanner.nextInt(), cimaScala));
		}
		
		//Creazione giocatori
		System.out.println("Inserisca il numero di giocatori");
		int numeroGiocatori = scanner.nextInt();
		for(int j=1; j<=numeroGiocatori; j++) {
			System.out.println("Inserisca il colore del segnalino del giocatore" + j);
			giocatori.add(new Giocatore("giocatore"+j, new Segnalino(scanner.next(), tabellone.getCaselle().get(1)), dadi));
		}
		
		return new Gioco(tabellone, dadi, giocatori);
	}

}
