package ligneBrisee;

public class Point implements Comparable<Point>  {
	private int x;
	private int y;
	private static int compteur=0;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		compteur++;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override //ce mot clé pr dire qu'on redéfinirt une méthode qui est existe déja ds classe mère
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	public static int getCompteur() { //static car attribut compteur=static
		return compteur;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		compteur--;
	}
	
	 public int compareTo(Point p) {
	        if(! p.equals(this)) {
	            double norme = Math.sqrt(this.x*this.x + this.y*this.y) ;
	            double normep =Math.sqrt( p.getX()*p.getX() + p.getY()*p.getY()); //norme du point p
	            if(norme >= normep) {
	                return 1;
	            }
	            if(norme < normep) {
	                return -1;
	            }
	        }
	        return 0;

	}

	//avant de détruire un objet, on déecremente le compteur d'ou compteur--
    // car à chaque fois pr créer un objet de type point on incrémente
	
	
	
	
	
	
}
