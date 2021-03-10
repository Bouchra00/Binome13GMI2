package ligneBrisee;
import java.util.Set;
import java.util.TreeSet;

public class LigneBriseeTreeSet {
	Set<Point> arbre = new TreeSet<Point>();

	public Set<Point> getPoints() {
		return arbre;
	}

	public void setPoints(Set<Point> points) {
		this.arbre = points;
	}

	@Override
	public String toString() {
		return "LigneBriseeTreeSet [arbre=" + arbre + "]";
	}

	
public void addPoint(Point p) {
	if (arbre.contains(p)==false)
		arbre.add(p);
	else
		System.out.println("Ce point est déjà dans notre liste, TreesET PAS DE DOUBLONS :)");
	
}	

public void nbPoints() {
	System.out.println("la liste conient: " + arbre.size() +" points");
	
	 } 

public void deletePoint(Point p) {
	arbre.remove(p);

}






}
