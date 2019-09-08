package by.oks.jb29_les06;

/*Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. 
Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.*/

public class Task20 {

	public static void main(String[] args) {
		
		int number = Task01.enterNumber();
		
		int quantityOfOperations = findQuantityOfOperations(number);
		
		System.out.println("Количество операций = " + quantityOfOperations);

	}
	
	public static int findQuantityOfOperations (int number) {
		int count = 0;
		
		while(number != 0) {
			number = number - sumOfDigitsInNumber(number);
			count++;
		}
		
		return count;
	}
	
	public static int sumOfDigitsInNumber(int number) {
		int sum = 0;
		
		while (number >= 1) {
			sum = sum + (number % 10);
			number = number / 10;
		}
		
		return sum;
	}

}
