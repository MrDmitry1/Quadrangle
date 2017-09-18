package main.java.com.quadrangle.entity;

import main.java.com.quadrangle.action.QuadrangleAction;

public class QuadrangleParametrs implements Observer{ // наблюдатель

	public int square;
	public int perimetr;
	
	Quadrangle quadrangle;
	
	
	public QuadrangleParametrs() {
	}



	public int getSquare() {
		return square;
	}


	public void setSquare(int square) {
		this.square = square;
	}



	public int getPerimetr() {
		return perimetr;
	}


	public void setPerimetr(int perimetr) {
		this.perimetr = perimetr;
	}


	@Override
	public void update(Point p1, Point p2, Point p3, Point p4) {
	
		perimetr =QuadrangleAction.calculatePerimetr(quadrangle);
		square = QuadrangleAction.calculateSquare(quadrangle);;
		//LOG.info("Observer successfully updated");
	}
}
