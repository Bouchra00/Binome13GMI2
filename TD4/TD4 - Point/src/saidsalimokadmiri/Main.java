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

    }
}
