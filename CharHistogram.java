import java.util.Arrays;

public class CharHistogram {
	public static void main(String[] args) {
          /*
           * FORMÅL: Øve arrays
           *
           * OPGAVE:
           * Der er to opgaver
           * 1)Skriv hjælperklassen fillWithRand i ArrayHelper.java
           *
           * 2)Benyt samme teknik som i Thinkjava afsnit 7.7 til at lave et
           * histogram over forekomsten af tal i det array som fillWithRand laver.
           *
           * Fremgangsmåde:
           * skriv en metode - uniqueArr - som har følgende signatur:
           * public static void uniqueArr(int[] myArr, int[] myRetValArr){
           * myArr er et array fyldt med tilfældige heltal i en given range
           * i myArr.
           * myRetValArr er et array som rummer hyppighederne af tallene i myArr
           * Metoden skal altså tælle hyppigheden af de enkelte tal i rangen, gemme det i
           * myRetValArr  og printe så et histogram som vist nedenfor
           *
           * TESTKØRSEL:
           * Metoden skal printe flg:
           
           
              0:*
              1:*********
              2:******
              3:****
              4:*******
              5:**
              6:***
              7:*
              8:******
           
           * for dette array
           * [3, 5, 2, 1, 4, 1, 1, 5, 2, 1, 2, 8, 8, 1, 7, 8, 6, 1, 8, 1, 4, 6, 4, 
           * 1, 1, 3, 4, 8, 2, 2, 3, 4, 3, 4, 6, 2, 0, 4, 8, 7]
           *
           * 
           */
		int size = 40;
		int randRange = 9;
		int[] myArr = new int[size];
		//ArrayHelper.fillWithRand(myArr,randRange);
		int[] myRetArr = new int[randRange+1];
		//uniqueArr(myArr,myRetArr);
		
	}
        // TODO: Her skrives uniqeArr-metoden
}
