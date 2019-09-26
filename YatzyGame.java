package yatzygame;
public class YatzyGame {
	/*
	OPGAVEN:
	Yatzyprogrammet er langt fra færdigt men vi når ikke mere idag. Så opgaven
	består i at få testet det vi har ind til nu. Der skal altså laves
	et nyt bæger, som skal rystes med et holdPattern. Dette mønster skal
	i næste omgang komme fra brugeren men opgaven består i at lave en
	metode i main som kan simulere et holdemønster. Signaturen er flg:
	public static int[] userGet(String task)
	og håndteres på flg måde i main:
	holdPattern = userGet("holdPattern");
	så det kan bruges i kaldet til bægerets shufflte-metode.
	
	*/
	
	public static void main(String[] args) {
		//TODO: lav et bæger og ryst et antal gange
		int[] holdPattern = new int[4];
		DieCup myCup = new DieCup();
		System.out.println(myCup);
		holdPattern = userGet("holdPattern");
		myCup.shuffle(holdPattern);
		System.out.println(myCup);
		holdPattern = userGet("holdPattern");
		myCup.shuffle(holdPattern);
		System.out.println(myCup);
		holdPattern = userGet("holdPattern");
		myCup.shuffle(holdPattern);
		System.out.println(myCup);
		holdPattern = userGet("holdPattern");
		myCup.shuffle(holdPattern);
		System.out.println(myCup);
		holdPattern = userGet("holdPattern");
		myCup.shuffle(holdPattern);
		System.out.println(myCup);
		
	}
	public static int[] userGet(String task) {
          // TODO: sørg for at metoden returnere noget som
          // kan bruges i bægerets ryste-metode
		int[] holdPat = new int[4];
		if (task.equals("holdPattern")) {
			holdPat = new int[] {0,0,0,1,1};
		}
		return holdPat;
	}
}

