package by.oks.jb29_les06;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/*На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между
какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.*/

public class Task07 {

	public static void main(String[] args) {
		
		int numberOfDots = Task01.enterNumber();
		int [][] coordinates = new int [2][numberOfDots];
		
		for (int i = 0; i < numberOfDots; i++) {
			System.out.println("Введите x");
			coordinates[0][i] = Task01.enterNumber();
			
			System.out.println("Введите y");
			coordinates[1][i] = Task01.enterNumber();
		}
	
		numbersOfDotsWithMaxDist(coordinates);

	}
	
	public static double distanceBetweenDots(int x1, int y1, int x2, int y2) {
		double distance;
		
		int cathet1 = abs(x1 - x2);
		int cathet2 = abs(y1 - y2);
		
		distance = sqrt(pow(cathet1, 2) + pow(cathet2, 2));
		
		return distance;
		
	}
	
	public static void numbersOfDotsWithMaxDist (int [][] coordinates) {
		int numberOfDot1 = 0;
		int numberOfDot2 = 0;
		
		double maxDist = 0;
		double dist;
		
		for (int i = 0; i < coordinates[0].length - 1; i++) {
			for (int j = i + 1; j < coordinates[0].length; j++) {
				dist = distanceBetweenDots(coordinates[0][i], coordinates[1][i], coordinates[0][j], coordinates[1][j]);
				if (dist > maxDist) {
					maxDist = dist;
					numberOfDot1 = i + 1;
					numberOfDot2 = j + 1;
				}
			}
		}
		
		System.out.println("Максимальное расстояние между точками " + numberOfDot1 + " и " + numberOfDot2);
	}

}
