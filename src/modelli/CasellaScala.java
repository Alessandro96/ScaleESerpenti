package modelli;

public class CasellaScala extends Casella{

int posizioneFinale;
	
	public CasellaScala(int numero, int posizioneFinale) {
		super(numero);
		this.posizioneFinale = posizioneFinale;
	}
	
	@Override
	public int getCasella() {
		return this.posizioneFinale;
	}

	@Override
	public String toString() {
		return "Sono la casella numero " +super.getNumero()+ " e sono una scala. "
				+ "La mia casella di destinazione e' la numero " + this.posizioneFinale;
	}

}
