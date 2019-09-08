package by.oks.jb29_les06;

/*Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.*/

public class Task19 {

	public static void main(String[] args) {
		int numberOfSigns = Task01.enterNumber();
		
		int sum = 0;
		
		int leftBound = (int) Math.pow(10, (numberOfSigns - 1));
		int rightBound = (int) Math.pow(10, (numberOfSigns));
		
		for (int i = leftBound; i < rightBound; i++) {
			if (quantityOfOddDigits(i) == numberOfSigns) {
				sum = sum + i;
			}
		}
		
		int quantityOfOddDigitsInSum = quantityOfOddDigits(sum);

		System.out.println("Сумма " + numberOfSigns + "-значных чисел, содержащих только нечетные цифры = " + sum);
		System.out.println("Количество четных цифр в найденной сумме = " + quantityOfOddDigitsInSum);
	}

	public static int quantityOfOddDigits(int number) {
		int quantity = 0;
		int lastDigit;
		
		while(number >= 1) {
			lastDigit = number % 10;
			
			if (lastDigit % 2 == 1) {
				quantity++;
			}
			number = number / 10;
		}
		
		return quantity;
	}
}
