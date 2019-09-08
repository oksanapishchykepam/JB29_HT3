package by.oks.jb29_les06;

/*Даны натуральные числа К и N. Написать метод(методы) формирования массива А, 
 * элементами которого являются числа, сумма цифр которых равна К и которые не большее N.*/

public class Task15 {

	public static void main(String[] args) {
		int numberK = Task01.enterNumber();
		int numberN = Task01.enterNumber();
		
		fillNewMassive(numberK, numberN);

	}
	
	public static void fillNewMassive(int numberK, int numberN) {
		
		int size = findSizeOfNewMassive(numberK, numberN);
		int [] newMassive = new int[size];
		
		int indexForMassive = 0;
		
		for (int i = 1; i < numberN; i++) {
			if (sumOfDigitsInNumber(i) == numberK) {
				newMassive[indexForMassive] = i;
				indexForMassive++;
			}
		}
		
		for (int i = 0; i < newMassive.length; i++) {
			System.out.println(newMassive[i] + " ");
		}
	}
	
	public static int findSizeOfNewMassive(int numberK, int numberN) {
		int quantityOfNecessaryNumbers = 0;
		
		for (int i = 1; i < numberN; i++) {
			if (sumOfDigitsInNumber(i) == numberK) {
				quantityOfNecessaryNumbers++;
			}
		}
		
		return quantityOfNecessaryNumbers;
	}

	public static int sumOfDigitsInNumber(int number) {
		int sum = 0;
		
		while (number >= 1) {
			sum = sum + (number % 10);
			number = number / 10;
		}
		
		return sum;
	}
}
