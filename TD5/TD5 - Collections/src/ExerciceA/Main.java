package ExerciceA;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(2,5);
        Point p2 = new Point(3,1);
        Point p3 = new Point(2,0);

        System.out.println("1)ArrayList: ");
        System.out.println();

        LigneBriseeArrayList list = new LigneBriseeArrayList();

        list.addPoint(p1);
        list.addPoint(p2);
        list.addPoint(p3);

        System.out.println(list);


        System.out.println(list.contientPoint(p1));
        list.nbPoints();

        list.deletePoint(p1);
        System.out.println(list);
    }
}
