package objects;

import java.awt.Point;

public class Car {
	public Point origin;
	public Point destination;
	public int departureTime;
	
	//Constructor
	public Car(Point origin, Point destination, int departureTime) {
		this.origin = origin;
		this.destination = destination;
		this.departureTime = departureTime;
	}
}
