package gemotrie;
import java.util.Arrays;

public class LigneBrisee {
    private Point [] points;
    private static int taille=3;
   
   
    public LigneBrisee(Point[] points) {
        super();
        if (points==null)
        {
            this.points= new Point[taille];
        }
        else
        this.points = points;
    }
   
    public LigneBrisee() {
    this.points = new Point[taille];
       }

	public Point[] getPoints() {
		return points;
	}

	public void setPoints(Point[] points) {
		this.points = points;
	}



	@Override
	public String toString() {
		return "LigneBrisee [points=" + Arrays.toString(points) + "]";
	}

public  boolean contientPoint(Point point) {
	
	
	for ( Point pt: points)
		
		if (pt.equals(point)) //point en paramètre
		   return true;
		
	return false;
}

public void addPoint(Point point) {
	
	for ( Point pt: points)
		if (contientPoint(point)==true)
			System.out.println("ce point est déja dans la liste");
		
		else
			if (pt==null)
			pt = point;
}

public int nbPoints() {
	int nb=0;
	
	for (Point pt: points)
		nb++;
	return nb;
}
	
	
			
			
	
}


}
