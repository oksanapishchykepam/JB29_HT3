package by.oks.jb29_les06;

/*Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] + D[5] + D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.*/

public class Task11 {

	public static void main(String[] args) {
		int [] numbers = new int [6];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Task01.enterNumber();
		}
		
		int sum1 = sumOfThreeSequentialElements (numbers, 1, 3);
		int sum2 = sumOfThreeSequentialElements (numbers, 3, 5);
		int sum3 = sumOfThreeSequentialElements (numbers, 4, 6);
		
		System.out.println("D[l] + D[2] + D[3] = " + sum1);
		System.out.println("D[3] + D[4] + D[5] = " + sum2);
		System.out.println("D[4] + D[5] + D[6] = " + sum3);

	}
	
	public static int sumOfThreeSequentialElements (int [] numbers, int firstElement, int lastElement) {
		int sum = 0;	

		for (int i = firstElement - 1; i < lastElement; i++) {
			sum = sum + numbers[i];
		}
		
		return sum;
	}

}
