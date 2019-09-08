package by.oks.jb29_les06;

/*Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
треугольника.*/

public class Task06 {

	public static void main(String[] args) {
		int side = Task01.enterNumber();
		
		double squareOfHexagon = 6 * squareOfTriangle(side);
		
		System.out.println("Площадь шестиугольника со стороной " + side + " равна " + squareOfHexagon);

	}
	
	public static double squareOfTriangle(int side) {
		double square = Math.pow(side, 2) * Math.sqrt(3.0) / 4;
		
		return square;
	}

}
