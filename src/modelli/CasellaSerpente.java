package modelli;

public class CasellaSerpente extends Casella {

	int posizioneFinale;
	
	public CasellaSerpente(int numero, int posizioneFinale) {
		super(numero);
		this.posizioneFinale = posizioneFinale;
	}
	
	@Override
	public Casella getCasella(Tabellone tabellone) {
		System.out.println("Ti sei fermato sulla testa di un serpente, torni alla casella " + this.posizioneFinale);
		return tabellone.getCaselle().get(this.posizioneFinale);
	}

	@Override
	public String toString() {
		return "Sono la casella numero " +super.getNumero()+ " e sono un serpente. "
				+ "La mia casella di destinazione e' la numero " + this.posizioneFinale;
	}

}
