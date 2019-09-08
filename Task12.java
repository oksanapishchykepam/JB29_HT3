package by.oks.jb29_les06;

import static java.lang.Math.sqrt;

/*Даны числа X, Y, Z, Т — длины сторон четырехугольника. 
Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y — прямой*/

public class Task12 {

	public static void main(String[] args) {
		int [] sidesOfQuadrangle = new int [4];
		
		for (int i = 0; i < sidesOfQuadrangle.length; i++) {
			System.out.println("Сторона четырехугольника " + (i+1));
			sidesOfQuadrangle[i] = Task01.enterNumber();
		}
		
		double squareOfQuadrangle = squareOfQuadrangle(sidesOfQuadrangle);
		System.out.println("Площадь четырехугольника равна " + squareOfQuadrangle);

	}
	
	public static double squareOfQuadrangle (int [] sidesOfQuadrangle) {
		double squareOfTriangle1 = (sidesOfQuadrangle[0] * sidesOfQuadrangle[1]) / 2;
		
		double diagonal = hypotenuse(sidesOfQuadrangle[0], sidesOfQuadrangle[1]);
		double squareOfTriangle2 = squareOfTriangle(sidesOfQuadrangle[2], sidesOfQuadrangle[3], diagonal);
		
		double squareOfQuadrangle = squareOfTriangle1 + squareOfTriangle2;
		
		return squareOfQuadrangle;
	}
	
	public static double hypotenuse(int cathet1, int cathet2) {
		double hypotenuse = Math.sqrt(Math.pow(cathet1, 2) + Math.pow(cathet2, 2));
		return hypotenuse;
	}
	
	public static double squareOfTriangle(double side1, double side2, double side3) {
		double halfPerimeter = (side1 + side2 + side3) / 2;
		double square = sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
		
		return square;
		
	}

}
