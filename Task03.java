package by.oks.jb29_les06;

/*Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.*/

public class Task03 {

	public static void main(String[] args) {
		int[] numbers = new int[4];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Task01.enterNumber();
		}		
		
		int maxDivider = maxDivider(numbers);
		
		System.out.println("Наибольший общий делитель = " + maxDivider);

	}
	
	public static int minNumber(int[] numbers) {
		int minNumber = numbers[0];
		
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < minNumber) {
				minNumber = numbers[i];
			}
		}
		
		return minNumber;
	}
	
	public static int maxDivider(int[] numbers) {
		int divider = 1;
		
		int minNumber = minNumber(numbers);
		System.out.println("Наименьшее число = " + minNumber);
		
		for (int i = 2; i <= minNumber; i++) {
			if(numbers[0] % i == 0 && numbers[1] % i == 0 && numbers[2] % i == 0 && numbers[3] % i == 0) {
				divider = i;
			}
		}
		
		return divider;	
	}

}
