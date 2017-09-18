package main.java.com.quadrangle.entity;

public interface Observable { //наблюдаемый

	void addObserver(Observer observer);
	void deleteObserver(Observer observer);
	void notifyObserver(); // оповещаем observer
	
	
}
