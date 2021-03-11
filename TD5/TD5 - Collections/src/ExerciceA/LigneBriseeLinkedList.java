package ExerciceA;

import java.util.LinkedList;

public class LigneBriseeLinkedList {
    LinkedList<Point> liste2Point;
    public static int taille = 2;//au moins 2 points

    public LigneBriseeLinkedList(LinkedList<Point> list) {
        this.liste2Point = list;
    }

    public LinkedList<Point> getList() {
        return liste2Point;
    }

    public void setList(LinkedList<Point> list) {
        this.liste2Point = list;
    }

    public static int getTaille() {
        return taille;
    }

    public static void setTaille(int taille) {
        LigneBriseeLinkedList.taille = taille;
    }

    @Override
    public String toString() {
        return "LigneBriseeLinkedList{" +
                "list=" + liste2Point +
                '}';
    }

    public boolean contientPoint(Point p){
        return this.liste2Point.contains(p);
    }

    public void addPoint(Point p){
        this.liste2Point.add(p);
    }
    public void nbPoints(){
        int n=this.liste2Point.size();
        System.out.println("Cette ligne brisée contient "+n+" points");
    }

    public void deletePoint(Point p){
        if(contientPoint(p)){
            this.liste2Point.remove(p);
        }
        else{
            System.out.println("Ce point n'est pas dans la ligne brisée");
        }
    }
}