package modelli;

public class CasellaScala extends Casella{

int posizioneFinale;
	
	public CasellaScala(int numero, int posizioneFinale) {
		super(numero);
		this.posizioneFinale = posizioneFinale;
	}
	
	@Override
	public Casella getCasella(Tabellone tabellone) {
		System.out.println("Ti sei fermato ai piedi di una scala, arrivi sulla casella " + this.posizioneFinale);
		return tabellone.getCaselle().get(this.posizioneFinale);
	}

	@Override
	public String toString() {
		return "Sono la casella numero " +super.getNumero()+ " e sono una scala. "
				+ "La mia casella di destinazione e' la numero " + this.posizioneFinale;
	}

}
