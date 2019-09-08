package by.oks.jb29_les06;

/*Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.*/

public class Task10 {

	public static void main(String[] args) {
		int sum = sumOfFactorials();

		System.out.println("Сумма факториалов всех нечетных чисел от 1 до 9 равна " + sum);
	}
	
	public static int factorial(int number) {
		int factorial = 1;
		
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		
		return factorial;
	}
	
	public static int sumOfFactorials() {
		int sum = 0;
		
		for (int i = 1; i <= 9; i = i+2) {
			sum = sum + factorial(i);
		}
		
		return sum;
	}

}
