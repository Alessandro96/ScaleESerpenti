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

}
