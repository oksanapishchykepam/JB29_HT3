package by.oks.jb29_les06;

/*Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789). 
 * Для решения задачи использовать декомпозицию.*/

public class Task18 {

	public static void main(String[] args) {
		int numberOfSigns = Task01.enterNumber();
		
		int leftBound = (int) Math.pow(10, (numberOfSigns - 1));
		int rightBound = (int) Math.pow(10, (numberOfSigns));
		
		System.out.println(numberOfSigns + "-значные числа, цифры в которых образуют строго возрастающую последовательность: ");
		
		for (int i = leftBound; i < rightBound; i++) {
			if (IsTheSequenceStrictlyIncreasing(i)) {
				System.out.println(i);
			};
		}

	}
	
	public static boolean IsTheSequenceStrictlyIncreasing(int number) {
		
		boolean result = true;
		
		int lastDigit = number % 10;
		number = number / 10;
		int nextDigit = number % 10;
			
		while (number > 0) {
			if (lastDigit > nextDigit) {
				number = number / 10;
				lastDigit = nextDigit;
				nextDigit = number % 10;
			} else {
				result = false;
				number = 0;
			}
		}
		
		return result;
			
	}
		
}
