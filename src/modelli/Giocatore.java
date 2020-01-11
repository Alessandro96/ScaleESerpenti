package modelli;

import java.util.*;

public class Giocatore {

	private String nome;
	private Segnalino segnalino;
	private LinkedList<Dado> dadi;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Segnalino getSegnalino() {
		return segnalino;
	}

	public void setSegnalino(Segnalino segnalino) {
		this.segnalino = segnalino;
	}
	
	public int tiroDadi() {
		int n = 0;
		for(Dado d: this.dadi) {
			n+=d.tiroDado();
		}
		return n;
	}

	public Giocatore(String nome, Segnalino segnalino, LinkedList<Dado> dadi) {
		this.nome = nome;
		this.segnalino = segnalino;
		this.dadi = dadi;
	}
	
}
