package by.oks.jb29_les06;

/*Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.*/

public class Task05 {

	public static void main(String[] args) {
		int number1 = Task01.enterNumber();
		int number2 = Task01.enterNumber();
		int number3 = Task01.enterNumber();
		
		int sum = sumOfMinAndMax(number1, number2, number3);
		
		System.out.println("Сумма минимального и максимального чисел равна " + sum);

	}
	
	public static int maxNumber(int number1, int number2, int number3) {
		int max = number1;
		
		if (number2 > max) {
			max = number2;
		}
		if (number3 > max) {
			max = number3;
		}
		
		return max;
	}
	
	public static int minNumber(int number1, int number2, int number3) {
		int min = number1;
		
		if (number2 < min) {
			min = number2;
		}
		if (number3 < min) {
			min = number3;
		}
		
		return min;
	}
	
	public static int sumOfMinAndMax(int number1, int number2, int number3) {
		int min = minNumber(number1, number2, number3);
		int max = maxNumber(number1, number2, number3);
		
		int sum = min + max;
		return sum;
	}

}
