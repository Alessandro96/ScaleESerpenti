package modelli;

public class casellaSerpente extends casella {

	int posizioneFinale;
	
	public casellaSerpente(int numero, int posizioneFinale) {
		super(numero);
		this.posizioneFinale = posizioneFinale;
	}
	
	@Override
	public int getCasella() {
		return this.posizioneFinale;
	}

}
