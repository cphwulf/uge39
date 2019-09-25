/*
* FORMÅL:
* At læse en større programstump og kunne tilpasse den

* OPGAVEN:
* Hangman-programmet virker nogenlunde men er langt fra perfekt. Bla er teksten taget helt random
* fra nettet. Overvej om I vil bruge en anden tekst i stedet. Brug lidt tid på at eksperimentere
* med koden. Bla er teksten taget helt random fra nettet så overvej om I vil bruge en anden tekst i stedet.
* Løs derpå flg tasks:
*
* 1) Sørg for at SecretWord rummer mindst 4 karakterer (så ArrayHelperHangMan-metoden skal tjekke
* for ordlængde inden ordet returneres)
* 2) Sørg for at tjekket for om en karaktér er i ordet også tjekker 
* hvor i ordet karakteren forekommer og hvor mange gange . 
* Lad tjekket være i ArrayHelperHangman så man i main får dette retur: 
* [1, 2, -1, -1, -1] = ArrayHelperHangMan.getAllIdx("eller",'l');
*
* 3) Ordet som brugeren bygger med de rigtigt gættede karakterer - myWord - bruges slet 
* ikke i koden så man kan ikke se hvor langt man er. Modificér koden så dér, hvor der
* bare udskrives "is found at" tilføjes karakteren til myWord som så udskrives.
* Altså flg udskrives hvis man har gættet 'l' i ordet "eller":
* W: [null l, l, null, null]
* Sørg også for at while-loopet stopper hvis man har gættet alle karakterer. 
*
* 4) De forkerte bogstaver gemmes ikke. Overvej at sende dem med som parameter
* til figuren og print dem som en ekstra linje i bunden.
*
*/
public class HangMan {
	public static void main(String[] args) {
		String secretWord = ArrayHelperHangMan.getSecretWord();
		System.out.println(secretWord);
		System.out.println(secretWord.length());
		int counter = 0;
		char[] myWord= new char[secretWord.length()];
		while (counter < 8) {
			char userChar = ArrayHelperHangMan.getUserChar();
			int idx = secretWord.indexOf(userChar);
			if (idx >= 0) {
				System.out.println("is found at " + idx);
			} else {
				printFigure(counter);
				counter++;
			}
		}
	}
	public static void printFigure(int step) {
		String format = "";
		String myEmpty = " ";
		if (step==1){
			format = "______%n";
			System.out.printf(format, myEmpty);
			format = "|%4s|%n";
			System.out.printf(format, myEmpty);
			for(int i=0;i<3;i++) {
				format = "|%4s%n";
				System.out.printf(format, myEmpty);
			}
		} else if (step == 2) {
			format = "______%n";
			System.out.printf(format, myEmpty);
			format = "|%4s|%n";
			System.out.printf(format, myEmpty);
			format = "|%4sO%n";
			System.out.printf(format, myEmpty);
			for(int i=0;i<2;i++) {
				format = "|%4s%n";
				System.out.printf(format, myEmpty);
			}
		} else if (step==3) {
			format = "______%n";
			System.out.printf(format, myEmpty);
			format = "|%4s|%n";
			System.out.printf(format, myEmpty);
			format = "|%4sO%n";
			System.out.printf(format, myEmpty);
			format = "|%4s|%n";
			System.out.printf(format, myEmpty);
			format = "|%4s%n";
			System.out.printf(format, myEmpty);
			format = "|%4s%n";
			System.out.printf(format, myEmpty);
		} else if (step==4) {
			format = "______%n";
			System.out.printf(format, myEmpty);
			format = "|%4s|%n";
			System.out.printf(format, myEmpty);
			format = "|%4sO%n";
			System.out.printf(format, myEmpty);
			format = "|%3s/|%n";
			System.out.printf(format, myEmpty);
			format = "|%4s%n";
			System.out.printf(format, myEmpty);
			format = "|%4s%n";
			System.out.printf(format, myEmpty);
		} else if (step==5) {
			format = "______%n";
			System.out.printf(format, myEmpty);
			format = "|%4s|%n";
			System.out.printf(format, myEmpty);
			format = "|%4sO%n";
			System.out.printf(format, myEmpty);
			format = "|%3s/|\\%n";
			System.out.printf(format, myEmpty);
			format = "|%4s%n";
			System.out.printf(format, myEmpty);
			format = "|%4s%n";
			System.out.printf(format, myEmpty);
		} else if (step==6) {
			format = "______%n";
			System.out.printf(format, myEmpty);
			format = "|%4s|%n";
			System.out.printf(format, myEmpty);
			format = "|%4sO%n";
			System.out.printf(format, myEmpty);
			format = "|%3s/|\\%n";
			System.out.printf(format, myEmpty);
			format = "|%3s/%n";
			System.out.printf(format, myEmpty);
			format = "|%4s%n";
			System.out.printf(format, myEmpty);
		} else if (step==7) {
			format = "______%n";
			System.out.printf(format, myEmpty);
			format = "|%4s|%n";
			System.out.printf(format, myEmpty);
			format = "|%4sO%n";
			System.out.printf(format, myEmpty);
			format = "|%3s/|\\%n";
			System.out.printf(format, myEmpty);
			format = "|%3s/ \\%n";
			System.out.printf(format, myEmpty);
			format = "|%4s%n";
			System.out.printf(format, myEmpty);
		}
	}
}
