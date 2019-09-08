package by.oks.jb29_les06;

/*Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.*/

public class Task14 {

	public static void main(String[] args) {
		int number1 = Task01.enterNumber();
		int number2 = Task01.enterNumber();

		findNumberWithMaxQuantityOfDigits(number1, number2);
	}
	
	public static void findNumberWithMaxQuantityOfDigits(int number1, int number2) {
		
		int digitsOfNumber1 = Task13.quantityOfDigits(number1);
		int digitsOfNumber2 = Task13.quantityOfDigits(number2);
		
		if (digitsOfNumber1 > digitsOfNumber2) {
			System.out.println("В первом числе больше цифр, чем во втором.");
		} else {
			if (digitsOfNumber2 > digitsOfNumber1) {
				System.out.println("Во втором числе больше цифр, чем в первом.");
			} else {
				System.out.println("В заданных числах одинаковое количество цифр.");
			}
		}
	}

}
