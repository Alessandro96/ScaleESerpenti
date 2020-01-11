package modelli;

import java.util.concurrent.ThreadLocalRandom;

public class Dado {

	private int numeroFacce;
	
	public int getFacce(){
		return this.numeroFacce;
	}
	
	public void setFacce(int facce) {
		this.numeroFacce = facce;
	}
	
	public int tiroDado() {
		return ThreadLocalRandom.current().nextInt(1, numeroFacce+1);
	}
	
	public Dado(int numeroFacce) {
		this.numeroFacce = numeroFacce;
	}
	
}
