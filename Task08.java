package by.oks.jb29_les06;

/*Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать
число, которое меньше максимального элемента массива, но больше всех других элементов).*/

public class Task08 {

	public static void main(String[] args) {
		int size = Task01.enterNumber();
		int [] numbers = new int[size];
		
		for (int i = 0; i < size; i++) {
			numbers[i] = Task01.enterNumber();
		}
		
		int maxNumber = maxNumber(numbers);
		
		int [] newNumbers = new int[size-1];
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != maxNumber) {
				newNumbers[count] = numbers[i];
				count++;
			}
		}
		
		int secondMaxNumber = maxNumber(newNumbers);
		
		System.out.println("Число, которое меньше максимального элемента массива, но больше всех других элементов = " + secondMaxNumber);

	}
	
	public static int maxNumber(int[] numbers) {
		int maxNumber = numbers[0];
		
		for (int i = 1; i < numbers.length; i ++) {
			if (maxNumber < numbers[i]) {
				maxNumber = numbers[i];
			}
		}
		return maxNumber;
	}

}
