package objects;

import java.awt.Point;
import java.util.Vector;

public class Car {
	public Point origin;
	public Point destination;
	public Vector currentLocation;
	public int departureTime;
	
	//Constructor
	public Car(Point origin, Point destination, Vector currentLocation, int departureTime) {
		this.origin = origin;
		this.destination = destination;
		this.currentLocation = currentLocation;
		this.departureTime = departureTime;
	}
}
