package by.oks.jb29_les06;

/*Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.*/

public class Task09 {

	public static void main(String[] args) {
		int number1 = Task01.enterNumber();
		int number2 = Task01.enterNumber();
		int number3 = Task01.enterNumber();

		areNumbersMutuallySimple(number1, number2, number3);
		
	}
	
	public static int maxDivider(int number1, int number2, int number3) {
		int divider = 1;
		
		int minNumber = Task05.minNumber(number1, number2, number3);
				
		for (int i = 2; i <= minNumber; i++) {
			if(number1 % i == 0 && number2 % i == 0 && number3 % i == 0) {
				divider = i;
			}
		}
		
		return divider;	
	}
	
	public static void areNumbersMutuallySimple(int number1, int number2, int number3) {
		int divider = maxDivider(number1, number2, number3);
		if(divider == 1) {
			System.out.println("Данные числа являются взаимно простыми");
		} else {
			System.out.println("Данные числа не являются взаимно простыми");
		}
		System.out.println(divider);
	}

}
