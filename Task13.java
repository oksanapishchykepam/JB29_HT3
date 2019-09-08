package by.oks.jb29_les06;

/*Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.*/

public class Task13 {

	public static void main(String[] args) {
		int number = Task01.enterNumber();
		
		int size = quantityOfDigits(number);
		int [] digitsOfNumber = new int [size];
		
		createMassiveDigitsOfNumber(digitsOfNumber, number);
		
		for (int i = 0; i < digitsOfNumber.length; i++) {
			System.out.println(digitsOfNumber[i] + " ");
		}

	}
	
	public static void createMassiveDigitsOfNumber(int[] digitsOfNumber, int number) {
		
		for (int i = 0; i < digitsOfNumber.length; i++) {
			digitsOfNumber[i] = number % 10;
			number = number / 10;
		}
		
	}
	
	public static int quantityOfDigits (int number) {
		
		int quantityOfDigits = 1;
		
		while(number >= 10) {
			quantityOfDigits++;
			number = number / 10;
		}
		
		return quantityOfDigits;
	}
	

}
