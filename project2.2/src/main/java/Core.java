import gui.GraphicalInterface;

import java.util.ArrayList;

import datastructures.*;

public class Core {

	public static void main(String[] args){
		
		GraphicalInterface graphical_interface = new GraphicalInterface();
		graphical_interface.setVisible(true);
	
		StreetMap map = new StreetMap();
		
		map.addIntersection(new Intersection());
		map.addIntersection(new Intersection());
		map.addIntersection(new Intersection());

		map.addConnection(2, 1, new Connection());
		
		System.out.println(map.getAdjacencyMatrix());
	}
}

