package ligneBrisee;
import java.util.*;

public class LigneBriseeLinkedList {
	
	 LinkedList<Point> points = new LinkedList<Point>(); //points=notre  liste de points
	 

	public LinkedList<Point> getPoints() {
		return points;
	}

	public void setPoints(LinkedList<Point> points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "LigneBriseeLinkedList [points=" + points + "]";
	}
	 
	//q2
		public boolean contientPoint(Point p) {
			return points.contains(p); //contains(obect)=une methode qui renvoie un boolena
			
		}
	//q3
		public void addPoint(Point p) {
			if (points.contains(p)==false)
				points.add(p);
		}
		

		
		
		public void nbPoints() {
		System.out.println("la liste conient: " + points.size() +" points");
		
		 } 
		 
		
		public void deletePoint(Point p) {
			points.remove(p);
		}
		

			
		

}
