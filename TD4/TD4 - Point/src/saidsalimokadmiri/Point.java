package saidsalimokadmiri;

import java.util.Objects;

public class Point {

    private int x;
    private int y;
private static int compteur = 0;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        compteur++;
    }

    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    //on ne crée pas de mutateurs car on ne va pas choisir cb de points on a créé.
    public static int getCompteur() {
        return compteur;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    protected void finalize() throws Throwable { // on fait quoi avant de deetuire l'objet
        super.finalize();
        compteur--; // à chaque destruction on décrmente

    }
}
