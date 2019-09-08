package by.oks.jb29_les06;

/*Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел:
НОК(А, В) = А * В / НОД(А, В) */

public class Task02 {

	public static void main(String[] args) {
		int numberA = Task01.enterNumber();
		int numberB = Task01.enterNumber();
		
		int divider = maxDivider(numberA, numberB);
		int multiple = minCommomMultiple(numberA, numberB);
		
		System.out.println("Наибольший общий делитель чисел " + numberA + " и " + numberB + " = " + divider);
		System.out.println("Наименьшее общее кратное чисел " + numberA + " и " + numberB + " = " + multiple);

	}

	public static int maxDivider(int number1, int number2) {
		int divider;
		int minNumber;
		
		if (number1 < number2) {
			minNumber = number1;
		} else {
			minNumber = number2;
		}
			
		divider = 1;
		
		for (int i = 2; i <= minNumber; i++) {
			if (number1 % i == 0 && number2 % i == 0) {
				divider = i;
			}
		}
		
		return divider;
	}
	
	public static int minCommomMultiple(int number1, int number2) {
		int multiple = number1 * number2 / maxDivider(number1, number2);
		return multiple;
		
	}
}
