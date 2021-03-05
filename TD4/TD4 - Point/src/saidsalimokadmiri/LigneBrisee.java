package saidsalimokadmiri;
import java.util.Arrays;
import java.util.ArrayList;

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
        return Arrays.toString(this.points);
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
    public int nbMaxPoints() {
        int s = 0;
        for(Point x : this.points) {
            if (x==null) {
                s++;
            }
        }
        return s;
    }

    public void deletePoint(Point p) {


        if (this.contientPoint(p)) {
            int n  = this.nbPoints() - 1;
            if (n < 2) n = 2;

            Point[] copy = new Point[n];
            int k = 0;
            for(Point x : this.points) {
                if (!x.equals(p) && x != null)
                {
                    copy[k] =  x;
                            k++;
                }
            }
            this.points = copy;
        }

    }




}
