package saidsalimokadmiri;

public class Main {

    public static void main(String[] args) {
	/* A & B
        Point p1 = new Point(2,3);
        Point p2 = p1;
        Point p3 = new Point(2,3);
        System.out.println(p1 == p2); // true
        System.out.println(p1.equals(p3)); // false
        System.out.println(Point.getCompteur()); // nb de point

        Point a = new Point(0,2);System.out.println(" * a " + a);
        Point b = new Point(1,2);System.out.println(" * b " + b);
        Point c = new Point(2,0);System.out.println(" * c " + c);
       LigneBrisee ligne = new LigneBrisee(new Point[] {a,b,c});
        System.out.println(" ------\n * ligne 1 " + ligne);
       LigneBrisee ligne2 = new LigneBrisee(new Point[3]);
        System.out.println(" * ligne 2 " + ligne2);

        Point d = new Point(2,1);
        System.out.println(" --\n # ajout de la du point " + d + " a la ligne 2 (vide)  ");
        //ligne.addPoint(d); la ligne 1 est rempli !
        ligne2.addPoint(d);
        System.out.println(" ------\n * ligne 1 " + ligne);
        System.out.println(" * ligne 2 " + ligne2);

        System.out.println(" --\n # suppression du point a " + a + " a la ligne 1 ");
        ligne.deletePoint(a);
//      ligne.deletePoint(b);
        ligne.deletePoint(c);
        System.out.println(" ------\n * ligne 1 " + ligne);
        System.out.println(" * ligne 2 " + ligne2);

	 */
        Rectangle rec = new Rectangle("Rouge",2,5);
        Rectangle rec2 = new Rectangle("Rouge",2,5);
        System.out.println(rec);
        System.out.println(rec.equals(rec2));
        Cercle c = new Cercle("Rouge",2);
        Cercle c2 = new Cercle("Rouge",2);
        System.out.println(c);
        System.out.println(c.equals(c2));
        Carre car = new Carre("Rouge",5);
        Carre car2 = new Carre("Rouge",5);
        System.out.println(car);
        System.out.println(car.equals(car2));


    }

}
