package saidsalimokadmiri;

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

}
