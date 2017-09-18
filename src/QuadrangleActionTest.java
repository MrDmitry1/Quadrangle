package test.java.com.quadrangle.action;
import static org.testng.Assert.assertTrue;

import java.util.Observer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import main.java.com.quadrangle.action.QuadrangleAction;
import main.java.com.quadrangle.entity.Point;
import main.java.com.quadrangle.entity.Quadrangle;

public class QuadrangleActionTest {

	private Quadrangle quadrangle;
	private Observer quadrangleParameters;
	
	@BeforeMethod
	public void before() {
		 // должен считать точки из файла xml и создать xsd
		// тут parseFile
		quadrangle = new Quadrangle(new Point(1,1), new Point(1,3), new Point(3,3), new Point(3,1));
	}
	
	@Test
	public void calculateSquareTest() {
		int square=QuadrangleAction.calculateSquare(quadrangle);
		assertTrue(square == -50, " square is not expected");
	}
	
	
	
	
}
