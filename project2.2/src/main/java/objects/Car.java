package objects;

import java.awt.Point;
import java.util.Vector;

import javax.vecmath.Vector2d;

public class Car {
	public Vector2d origin;
	public Vector2d destination;
	public Vector2d currentLocation;
	public int departureTime;
	
	//Constructor
	public Car(Vector2d origin, Vector2d destination, Vector2d currentLocation, int departureTime) {
		this.origin = origin;
		this.destination = destination;
		this.currentLocation = currentLocation;
		this.departureTime = departureTime;
	}
}
