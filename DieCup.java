package yatzygame;
/*
OPGAVEN:
Der skal laves et raflebæger med 5 terninger.
Konstruktøren skal initialisere et array med 5 terninger

Så skal der laves en metode shuffle med flg signatur:
public void shuffle(int[] holdPattern )
holdPattern er et array med 5 tal som enten er 0 eller 1 og som skal
symbolisere at en bruger f.eks holder terning1, terning3 og terning4 (1,0,1,1,0)
Bægeret holder desuden styr på hvor mange gange det er rystet - noOfShuffles. Den
skal derfor incrementes hver gang bægeret rystes og hvis man er ude over grænsen
skal der kaldes en toString-metode som udskriver flg:

Dette er dit sidste slag
d1:4 d2:6 d3:3 d4:5 d5:6

Ellers skal metoden bare udskrive:
d1:4 d2:6 d3:3 d4:5 d5:6

*/


public class DieCup {
  Die[] diecesInCup;
  int noOfShuffles;
  int shuffCounter=1;

  public DieCup() {
    //TODO: initialiser et array til de 5 terninger.
    // lav hver terning som terningsobjekt og put terningen i diecesInCup
    // tildel variablen noOfShuffles værdien 3 som passer til Yatzy
  }
  // TODO: skriv metoden shuffle 
  // TODO: skriv metoden toString
}
