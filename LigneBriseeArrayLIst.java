package ligneBrisee;
import java.util.*;


public class LigneBriseeArrayLIst {
	
  //q1
	ArrayList<Point> list;
	
	public LigneBriseeArrayLIst() {
		super();
		list = new ArrayList<>();
		
	}
//getters et setters grace à source
	public ArrayList<Point> getList() {
		return list;
	}

	public void setList(ArrayList<Point> list) {
		this.list = list;
	}
	
	@Override
	public String toString() {
		return "LigneBriseeArrayLIst [list=" + list + "]";
	}
	
//q2
	public boolean contientPoint(Point p) {
		return list.contains(p); //contains(obect)=une methode qui renvoie un boolena
		
	}
//q3
	public void addPoint(Point p) {
		if (list.contains(p)==false)
			list.add(p);
	}
	

	
	
	public void nbPoints() {
	System.out.println("la liste conient: " + list.size() +" points");
	
	 } 
	 
	
	
	public void deletePoint(Point p) {
		list.remove(p);
	}
	

	

	

}
