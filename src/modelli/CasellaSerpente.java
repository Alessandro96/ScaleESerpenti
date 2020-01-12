package modelli;

public class CasellaSerpente extends Casella {

	int posizioneFinale;
	
	public CasellaSerpente(int numero, int posizioneFinale) {
		super(numero);
		this.posizioneFinale = posizioneFinale;
	}
	
	@Override
	public int getCasella() {
		return this.posizioneFinale;
	}

	@Override
	public String toString() {
		return "Sono la casella numero " +super.getNumero()+ " e sono un serpente. "
				+ "La mia casella di destinazione e' la numero " + this.posizioneFinale;
	}

}
