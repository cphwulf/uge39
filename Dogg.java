public class Dogg {
	private String navn ;
	private int alder;
	private double vægt;
	private double pris;
	private String køn;
	private String ejer;
        // TODO opg2: Attribut til sulten
        // TODO opg3: Attribut til hvalpe
	
	public Dogg(String navn){
		this.navn = navn;
                // TODO opg3: initialisér hvalpearrayet
	}
	
	public String getOwner() {
		return this.ejer;
	}
	public String[] getOffSpring() {
		return this.offSpring;
	}
        //TODO opg 3:lav metoden setOffSpring som sætter en given Streng med
        //hvalpenavn ind i offSpring
	// 

	public void setOwner(String myOwner) {
		this.ejer = myOwner;
	}
	public void setAlder(int hundeAlder){
		alder = hundeAlder;
	}
	public int getAlder(){
		return alder;
	}
	public String getName(){
		return this.navn;
	}
	public String toString() {
		return "Dog named " + navn;
	}
		// TODO opg 2: Lav en feedDog-metode. Hhunden skal fodres kun hvis den er sulten
		// hvis den er blevet fodret skal der sættes en attribut-værdi
		// returnér en besked om hvorvidt den er blevet fodret
                // 
}
