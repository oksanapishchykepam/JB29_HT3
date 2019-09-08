package by.oks.jb29_les06;

/*Треугольник задан координатами своих вершин. 
 * Написать метод для вычисления его площади.*/

import static java.lang.Math.*;
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		int[] coordinates = new int[6];
		
		System.out.println("Введите сначала координату x, а затем координату y");
		for (int i = 0; i < coordinates.length; i++) {
			coordinates[i] = enterNumber();
		}
		
		double side1 = sideByCoordinates(coordinates[0], coordinates[1], coordinates[2], coordinates[3]);
		double side2 = sideByCoordinates(coordinates[2], coordinates[3], coordinates[4], coordinates[5]);
		double side3 = sideByCoordinates(coordinates[0], coordinates[1], coordinates[4], coordinates[5]);
		
		double square = squareOfTriangle(side1, side2, side3);
		
		System.out.println("Площадь треугольника равна " + square);
		
	}
	
	public static int enterNumber() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите число > ");
		
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Вы ввели не целое число. Попробуйте еще раз > ");
		}
		
		int number = sc.nextInt();
		
		return number;
	} 
	
	public static double sideByCoordinates(int x1, int y1, int x2, int y2) {
		double side;
		
		int cathet1 = abs(x1 - x2);
		int cathet2 = abs(y1 - y2);
		
		side = sqrt(pow(cathet1, 2) + pow(cathet2, 2));
		
		return side;
	}

	public static double squareOfTriangle(double side1, double side2, double side3) {
		double halfPerimeter = (side1 + side2 + side3) / 2;
		double square = sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
		
		return square;
		
	}
}
