package main.java.com.quadrangle.entity;

import java.util.ArrayList;

public class Quadrangle implements Observable { // наблюдаемый, 

	private Point p1, p2, p3, p4;				// Quadrangle это мой ConcreteObservable
												// Ч конкретный класс, который реализует интерфейс Observable	

	// Observer quadrangleParametrs = new QuadrangleParametrs(); //свойство

	QuadrangleParametrs parametrs;

	ArrayList<Observer> observers = new ArrayList<Observer>();

	public Quadrangle() {
	}

	public Quadrangle(Point p1, Point p2, Point p3, Point p4) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		parametrs = new QuadrangleParametrs();
		notifyObserver();
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;

		notifyObserver();
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
		notifyObserver();
	}

	public Point getP3() {
		return p3;
	}

	public void setP3(Point p3) {
		this.p3 = p3;
		notifyObserver();
	}

	public Point getP4() {
		return p4;
	}

	public void setP4(Point p4) {
		this.p4 = p4;
		notifyObserver();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p1 == null) ? 0 : p1.hashCode());
		result = prime * result + ((p2 == null) ? 0 : p2.hashCode());
		result = prime * result + ((p3 == null) ? 0 : p3.hashCode());
		result = prime * result + ((p4 == null) ? 0 : p4.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quadrangle other = (Quadrangle) obj;
		if (p1 == null) {
			if (other.p1 != null)
				return false;
		} else if (!p1.equals(other.p1))
			return false;
		if (p2 == null) {
			if (other.p2 != null)
				return false;
		} else if (!p2.equals(other.p2))
			return false;
		if (p3 == null) {
			if (other.p3 != null)
				return false;
		} else if (!p3.equals(other.p3))
			return false;
		if (p4 == null) {
			if (other.p4 != null)
				return false;
		} else if (!p4.equals(other.p4))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Quadrangle [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", p4=" + p4 + "]";
	}

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
		if (observers.contains(observer)) {
			//LOG.info("new Observer added: " + observer.getClass());
		}
	}

	@Override
	public void deleteObserver(Observer observer) {
		observers.remove(observer);
		if (!observers.contains(observer)) {
			//LOG.info("Observer successfully removed: " + observer.getClass());
		}
	}

	@Override
	public void notifyObserver() { // оповещение

		for (Observer element : observers) {

			element.update(p1, p2, p3, p4);
			
		}
		//LOG.info("Observers successfully notified");
	}

}
