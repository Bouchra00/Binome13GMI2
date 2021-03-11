package ExerciceA;


import java.util.HashMap;
import java.util.Map;


public class LigneBriseeMap {
    HashMap<Integer,Point> carte;
    public static int taille = 2;//au moins 2 points

    public LigneBriseeMap(HashMap<Integer, Point> l) {
        this.carte = l;
    }

    public HashMap<Integer, Point> getL() {
        return carte;
    }

    public void setL(HashMap<Integer, Point> l) {
        this.carte = l;
    }

    public static int getTaille() {
        return taille;
    }

    public static void setTaille(int taille) {
        LigneBriseeMap.taille = taille;
    }

    @Override
    public String toString() {
        return "LigneBriseeMap{" +
                "l=" + this.carte +
                '}';
    }

    public boolean contientPoint(Point p){
        boolean b=false;
        for(Map.Entry<Integer,Point> element: this.carte.entrySet()){
            if (element.getValue()==p){
                b=true;
                break;
            }
        }
        return b;
    }

    public void addPoint(Point p,int index){
        if(!contientPoint(p)){
            this.carte.put(index,p);
        }
    }

    public void nbPoints(){

    }
}