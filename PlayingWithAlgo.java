package co.simplon.recall;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Array;
import java.util.*;

public class PlayingWithAlgo {
	
	public static String helloWorld(String name) {
		// TODO Auto-generated method stub
		String message;
		//message = name == "" ? "Hello World": "Hello "+name;
		if (name == "")
			message = "Hello World";
		else
			message = "Hello " + name;
		return message;
	}

	public static List<String> selectElementsStartingWithA(String array[]) {
		 ArrayList<String> resultat = new ArrayList<String>();
		 	for(int i = 0 ; i < array.length ; i++) {
		 		if(array[i].startsWith("a")) {
		 			resultat.add(array[i]);
		 		}
		 	}
		 	return resultat;
	}

	public static List<String> selectElementsStartingWithVowel(String array[]) {
		//String arrayIn[] = { "john", "david", "omar", "fred", null, "idris", "angela" };
			ArrayList<String> resultat = new ArrayList<String>();
			
			for (int i = 0 ; i < array.length ; ++i) {
				if (array[i].startsWith("a")||array[i].startsWith("e")||array[i].startsWith("i")||array[i].startsWith("o")||array[i].startsWith("u")||array[i].startsWith("y")) {
					resultat.add(array[i]);
				}
				else if(array[i] != "") {
					return null;
				}
			}
			return resultat;
	}

	public static String removeNullElements(String array[]) { // à compléter
		String resultat = new String();
		
		for (int i = 0 ; i < array.length ; ++i){
		if (array[i] == "") {
			resultat = resultat + i;
		}
			}
		return resultat;
	}

	public static String[] reverseWordsInMyStringArray(String array[]) {
		return null;
	}

	public static String[] reverseOrderInArray(String array[]) {
		return null;
	}

	public static String[][] everyPossiblePair(String array[]) {
		return null;
	}

	public static List<String> sortByLastLetter(String array[]) {
		return null;
	}

	public static String getFirstHalf(String string) {
		return null;
	}

	public static String exportWordWithoutALetter(String array[], char letter) {
		return null;
	}

	public static int numberOfPalindromeWord(String text) {
		return 0;
	}

	public static int numberOfPalindromeText(String text) {
		return 0;
	}
	
	public static String shortestWord(String text) { // à compléter
		String [] tab = text.split("");
		int length = tab.length;
		String shortest = new String();
		for(int i = 0 ; i < tab.length ; i++) {
			if(tab[i]<tab[i+1]) {
				
			}
		}
		return shortest;
	}

	public static String longestWord(String text) {
		return null;
	}

	public static String getAllLetters(String[] array) {
		return null;
	}
	
	public static String removeCapitals(String text) {
		return null ;
	}
	
	public static String formatDateNicely(String text) {
		return null;
	}
	
	public static String getDomainName(String email) {
		return null;
	}

	public static String titleize(String title) {
		return null;
	}
	
	public static boolean checkForSpecialCharacters(String string) {
		return false;
	}
	
	public static String[] findAnagrams(String name) {
		return null;
	}

	public static int[] letterPosition(String name) {
		return null;
	}
	
	public static long addingTwoNumbers(long number1, long number2) {
		return number1 + number2;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		return number1 + number2 + number3;
	}

	public static long addingSeveralNumbers(final long... numbers) {
		return 0;
	}

	public static int[] allElementsExceptFirstThree(int array[]) { 
			
		return null;
	}

	public static int[] addElementToBeginning(int array[], int element) {
		return null;
	}

	public static Float makeNegative(Float number) {
		float negative = 0;
		if( number <0) {
			negative = number;
		}
		else {
			negative = number*(-1);
		}
		return negative;
	}

	public static String[] getElementsLowerThanSix(String[] array) { // à compléter
		
		return lower6;
	}
	
	public static int[] sortTabBySelection(int[] array) {
		return null;
	}
	
	public static int[] sortTabByInsertion(int[] array) {
		return null;
	}

	public static int[] sortTabByBubble(int[] array) {
		return null;
	}
	
	public static int findIndexByDichotomy(int elemet, int[] array) {
		return 0;
	}
	
	public static int roundUp(float number) {
		return 0;
	}

	public static int findLastDayOfMonth(int month, int year) {
		return 0;
	}

	public static int factorial(int number) {
		int valeur = 5;
		int factorial = 1;
		for( int bing = 1 ; bing <= valeur ; bing++) {
			factorial = factorial*bing;
		}
		return factorial;
	}

	public static int convertToCelsius(int temperature) {
		return 0;
	}
	
	public static boolean checkIfPair(int number) {
		boolean resultat;
		if(number%2==0) {
			resultat = true;
		}
		else {
			resultat = false;
		}
		return resultat;
	}
	
	public static boolean checkIfPairPairImpair(int number1, int number2, int number3) {
		boolean resultat = true;
		if(number1%2==0 && number2%2 == 0 && number3%2 != 0) {
			resultat = true;
		}
		else {
			resultat = false;
		}
		return resultat;
	}
	
	public static boolean checkIfSumIsPair(int number1, int number2, int number3) {
		boolean checkSumPair = true;
		if ( (number1 + number2 + number3)%2 == 0) {
			checkSumPair = true;
		}
		else {
			checkSumPair = false;
		}
		return checkSumPair;
	}
	
	public static boolean checkIfAllElementsPair(int[] array) {
		boolean allPair = true;
		for(int i = 0 ; i < array.length ; i++) {
			if(array[i]%2 ==0) {
				allPair = true;
			}
			else {
				allPair = false;
			}
		}
		return allPair;
	}
	
	public static ArrayList<Integer> exportAllElementsPair(int[] array) {
		ArrayList<Integer> resultat = new ArrayList<Integer>();
		for(int i = 0 ; i < array.length ; i++) {
			if(array[i]%2 ==0) {
				resultat.add(array[i]);
			}
		}
		return resultat;
	}
	
	public static ArrayList<Integer> exportAllUniqueElementsPair(int[] array) {
		return null;
	}
	
	public static boolean checkIfTriangleRectangle(int number1, int number2, int number3) {
		boolean triangleRectangle = true;
		int cote1 = number1^2;
		int cote2 = number2^2;
		int cote3 = number3^2;
		if(cote1 + cote2 == cote3 || cote1 + cote3 == cote2 || cote2 + cote3 == cote1) {
			triangleRectangle = true;
		}
		else {
			triangleRectangle = false;
		}
		
		return triangleRectangle;
	}
	
	public static boolean checkSiTuPeuxAcheter(int prix) {
		// t'as 22 euros en monnaies de 2 euros, la machine ne rend pas de monnaie, check si tu peux payer
		boolean enough = true;
		if(prix%2 == 0 && prix <= 22) {
			enough = true;
		}
		else {
			enough = false;
		}
		
		return enough;
	}
	
	public static boolean checkCase1(double prix, int pourcentDeRemise) {
		// t'as 100 euros, verifie si tu peux acheter l'article solde
		boolean soldeOk = true;
		if((prix - ((prix * pourcentDeRemise) / 100)) <= 100) {
			soldeOk = true;
		}
		else {
			soldeOk = false;
		}
		
		return soldeOk;
	}
	
	public static boolean checkCase2(int number1, int number2) {
		// check si un des 2 chiffres, ou leur somme se divise par 7
		boolean resultat;
		if(number1%7 == 0 || number2%7 ==0 || (number1 + number2)%7 == 0) {
			resultat = true;
		}
		else {
			resultat = false;
		}
		return resultat;
	}
	
	public static boolean checkCase2a(int number1, int number2) { // mystere ???????????????????????????????????????,
		// check si une de 2 chiffres mais pas leur somme se divise par 7
		boolean resultat = true;
		if(number1%7 == 0 || number2%7 == 0 && (number1 + number2)%7 != 0) {
			resultat = true;
		}
		else {
			resultat = false;
		}
		return resultat;
	}
	
	public static boolean checkCase3(int number1, int number2, int number3) {
		// check si les trois chiffres sont dans l'ordre, soit croissant ou decroissant
		boolean ordonne = true;
		if( number1 < number2 && number2 < number3) {
			ordonne = true;
		}
		else if(number1 > number2 && number2 > number3) {
			ordonne = true;
		}
		else {
			ordonne = false;
		}
		return ordonne;
	}
	
	public static ArrayList<Integer> allElementsExceptFirstAndLast(int array[]) {

		return null;
	}
	
	public static int[] allElementsExceptFirstAndLastInt(int array[]) {
		return null;
	}
	
	
	public static ArrayList<Integer> allElementsWithIndexPair(int array[]) {
		ArrayList<Integer> resultat = new ArrayList<Integer>();
		for(int i = 0 ; i < array.length ; i++) {
			if(i % 2 == 0) {
				resultat.add(array[i]);
			}
		}
		
		return resultat;
	}
	
	public static ArrayList<Integer> reverseOrder(int array[]) {
		ArrayList<Integer> inverse = new ArrayList<Integer>();
		for(int i = array.length - 1 ; i >= 0 ; i--) {
			inverse.add(array[i]);
		}
		return inverse;
	}
	
	public static int[] reverseOrderInt(int array[]) {
		
		return null;
	}
	
	public static ArrayList<Integer> insertElementInTheMiddleOfAnArray(int array[], int element ) {
		return null;
	}
	
	public static ArrayList<Integer> exportElementsPair( ArrayList<Integer> list ) {
		
		return null;
	}
	
	public static ArrayList<Integer> exportElementsWithIndexPair( ArrayList<Integer> list ) {
		
		return null;
	}
	
	public static int Addition( HashMap<String, Integer> addition ) {
		
			return 0;
			}
	
	public static boolean checkIfStringStartsWithA( String word ) {
		boolean withA = true;
		if ( word.charAt(0) == "a" || word.charAt(0) == "A") { // à compléter
			withA = true;
		}
		return withA;
	}
	
	public static boolean checkIfStringStartsWithVowel( String word ) {
		return false;
	}
	
	public static boolean checkIfStringEndsWithS( String word ) {
		return false;
	}
	
	public static String findShortestWord(String[] array ) {
		
		return null;
	}
	
	public static String swapFirstandLastLetter(String array ) {
		return null;
		
	}
	
	public static int[] swapFirstandLastElement(int[] array ) {
		
		return null;
	}

}
