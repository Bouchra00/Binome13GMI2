package saidsalimokadmiri;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Point p1 = new Point(2,3);
        Point p2 = p1;
        Point p3 = new Point(2,3);
        System.out.println(p1 == p2); // true
        System.out.println(p1.equals(p3)); // false
        System.out.println(Point.getCompteur()); // nb de point

        Point a = new Point(0,2);
        Point b = new Point(1,2);
        Point c = new Point(2,0);
//        LigneBrisee ligne = new LigneBrisee(new Point[] {a,b,c});
       LigneBrisee ligne = new LigneBrisee(new Point[3]);
        System.out.println(" * " + ligne);
        Point d = new Point(2,1);
        System.out.println(" d : " +  d);
        System.out.println(" * ligne contient d ? : " + ligne.contientPoint(d));
ligne.addPoint(d);
ligne.addPoint(a);
ligne.addPoint(b);
//ligne.addPoint(c); la ligne est rempli

        System.out.println(" * (après ajout de d) : " + ligne);
    }
}
