package yatzygame;
/*
OPGAVEN:
Der skal laves et raflebæger med 5 terninger.
Konstruktøren skal initialisere et array med 5 terninger

Så skal der laves en metode shuffle med flg signatur:
public void shuffle(int[] holdPattern )
holdPattern er et array med 5 tal som enten er 0 eller 1 og som skal
symbolisere at en bruger f.eks holder terning1, terning3 og terning4 (1,0,1,1,0)
Bægeret holder styr  på hvor mange gange det er rystet - noOfShuffles. Den
skal derfor incrementes hver gang bægeret rystes og hvis man er ude over grænsen
skal der kaldes en toString-metode som udskriver flg:

Dette er dit sidste slag
d1:4 d2:6 d3:3 d4:5 d5:6

Ellers skal metoden bare udskrive:
d1:4 d2:6 d3:3 d4:5 d5:6

*/


public class DieCup {
	Die[] diecesInCup;
	int nuOfShuffles;
	int shuffCounter=1;
	
	public DieCup() {
		nuOfShuffles = 3;
		//TODO: initialiser et array til de 5 terninger.
		// lav hver terning som terningsobjekt og put terningen i
		// diecesInCup
		diecesInCup = new Die[5] ;
		Die d1 = new Die();
		diecesInCup[0] = d1;
		Die d2 = new Die();
		diecesInCup[1] = d2;
		Die d3 = new Die();
		diecesInCup[2] = d3;
		Die d4 = new Die();
		diecesInCup[3] = d4;
		Die d5 = new Die();
		diecesInCup[4] = d5;
	}
	
	public void shuffle(int[] holdPattern ) {
		//TODO: Tjek om der er flere slag
		// hvis det er ok så rul de terninger som ikke er markeret
		// i holdemønstret
		System.out.println(shuffCounter);
		if (shuffCounter < nuOfShuffles) {
			shuffCounter++;
			for (int i = 0;i<holdPattern.length;i++) {
				if(holdPattern[i]!=1){
					this.diecesInCup[i].rollDie();
				}
			}
		} else {
			this.toString();
		}
	}
	public String toString() {
		//TODO: skriv toString så den f.eks returnerer
		//d1:4 d2:6 d3:3 d4:5 d5:6
		//husk at tjekke om der skal en besked med ang opbrugte slag
		String retDie = "";
		if (shuffCounter == nuOfShuffles) {
			retDie += "Du har ikke flere slag\n";
		}
		retDie = "d1:"+this.diecesInCup[0].getValue();
		retDie += " d2:"+this.diecesInCup[1].getValue();
		retDie += " d3:"+this.diecesInCup[2].getValue();
		retDie += " d4:"+this.diecesInCup[3].getValue();
		retDie += " d5:"+this.diecesInCup[4].getValue();
		return retDie;
	}
}

