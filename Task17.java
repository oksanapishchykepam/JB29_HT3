package by.oks.jb29_les06;

/*Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n, равна самому числу. 
 * Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.*/

public class Task17 {

	public static void main(String[] args) {
		int numberK = Task01.enterNumber();
		findArmstrongNumbers(numberK);
	}
	
	public static void findArmstrongNumbers(int numberK) {
		System.out.println("Числа Армстронга от 1 до " + numberK);
		
		for (int i = 1; i <= numberK; i++) {
			if (isANumberAnArmstrongNumber(i)) {
				System.out.println(i);
			}
		} 
	}
	
	public static boolean isANumberAnArmstrongNumber(int number) {
		
		int sum = Task15.sumOfDigitsInNumber(number);
		int digits = Task13.quantityOfDigits(number);
		
		if(Math.pow(sum, digits) == number) {
			return true;
		} else {
			return false;
		}
	}

}
