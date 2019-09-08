package by.oks.jb29_les06;

/*Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). 
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
 * Для решения задачи использовать декомпозицию.*/

public class Task16 {

	public static void main(String[] args) {
		int number = Task01.enterNumber();
		
		findTwinsNumbers(number);

	}
	
	public static void findTwinsNumbers (int number) {
	
		// количество чисел на отрезке = 2n - n + 1 = n + 1;
		// количество пар чисел на заданном отрезке = n + 1 - 2 = n - 1;
		
		int quantityOfTwins = number - 1;
		
		int [][] massiveOfTwinsNumbers = new int [2][quantityOfTwins];
		
		for (int i = 0; i < massiveOfTwinsNumbers[0].length; i++) {
			massiveOfTwinsNumbers[0][i] = number;
			massiveOfTwinsNumbers[1][i] = number + 2;
			number++;
		}
		
		for (int i = 0; i < massiveOfTwinsNumbers[0].length; i++) {
			System.out.println(massiveOfTwinsNumbers[0][i] + ", " + massiveOfTwinsNumbers[1][i]);
		}
	}

	
}
