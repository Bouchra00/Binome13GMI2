package saidsalimokadmiri;
import java.util.Arrays;

public class LigneBrisee {
    private Point[] points;
    private static int taille=3;//minimum 2 points au départ

    public LigneBrisee(Point[] pts) {
        if (pts == null) { //si liste vide
            this.points = new Point[taille]; //on crée une liste de taille 3
        } else {
            this.points = pts;
        }

    }
    @Override
    public String toString() {
        return "Liste des points de la ligne = " + Arrays.toString(this.points);
    }

    public boolean contientPoint(Point p) {

        for (Point x : this.points) {
            if(x != null) {
                if (x.equals(p)) {
                return true;
                }
            }
        }
        return false;
    }

    public void addPoint(Point p) {
int n = this.points.length;
        if (!this.contientPoint(p)) {
            int i = 0;
            while(i < n){
                if(this.points[i] == null) {
                    this.points[i] = p;
                    break;
                }
                i++;
            }
            if (i== n) {
                throw new java.lang.Error("la ligne est rempli !");
            }
        } else {
            throw new java.lang.Error("Point déjà dans la ligne");
        }

    }
public int nbPoints() {
        return this.points.length;
}




}
