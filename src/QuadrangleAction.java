package main.java.com.quadrangle.action;

import main.java.com.quadrangle.entity.Point;
import main.java.com.quadrangle.entity.Quadrangle;

public class QuadrangleAction {

	public static int calculateSquare(Quadrangle quadrangle) {
		int quadrangleSquare = 0;
		if(checkNotLine()){
						
			//Логика по вычислению площади
			int width = calculateLenght(quadrangle.getP1(), quadrangle.getP2());
			int lenght = calculateLenght(quadrangle.getP2(), quadrangle.getP3());
			 return quadrangleSquare = width * lenght;
			
			
		}
		
		return quadrangleSquare; //return calculated Square
	}
	
	private static int calculateLenght(Point p1, Point p2) {
		return (int) Math.hypot(p1.getX(), p2.getY()); // Обязательно hypot
	}

	private static boolean checkNotLine() {
		//Логика по определению линииs
		return true;// заглушка
	}

	
	public static int calculatePerimetr(Quadrangle quadrangle) { // (Point p1, Point p2, Point p3, Point p4)
		int quadranglePerimetr = 0;
		if(checkNotLine()) {
			//Логика по вычислению периметра
			int a = calculateLenght(quadrangle.getP1(), quadrangle.getP2());
			int b = calculateLenght(quadrangle.getP2(), quadrangle.getP3());
			int c = calculateLenght(quadrangle.getP3(), quadrangle.getP4());
			int d =	calculateLenght(quadrangle.getP4(), quadrangle.getP1());
			return quadranglePerimetr = a + b + c + d;
		}
		
		//return calculated Square
		return quadranglePerimetr; // 
	}
	// проверка? это прямоугольник, квадрат?
}
