package by.oks.jb29_les06;

/*Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел.*/

public class Task04 {

	public static void main(String[] args) {
		int [] numbers;
		numbers = new int[3];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Task01.enterNumber();
		}
		
		int multiple = minCommomMultiple(numbers);
		
		System.out.println("Наименьшее общее кратное = " + multiple);
	}
	
	public static int maxNumber(int[] numbers) {
		int maxNumber = numbers[0];
		
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > maxNumber) {
				maxNumber = numbers[i];
			}
		}
		
		return maxNumber;
	}
	
	public static int minCommomMultiple(int[] numbers) {
		int multiple = 1;
		int findMinMultiple = maxNumber(numbers);
		
		while (multiple == 1) {
			if (findMinMultiple % numbers[0] == 0 && findMinMultiple % numbers[1] == 0 && findMinMultiple % numbers[2] == 0) {
				multiple = findMinMultiple;
			}
			findMinMultiple++;
		}
		
		return multiple;
		
	}

}
