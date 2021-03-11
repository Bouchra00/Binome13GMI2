package ExerciceA;

import java.util.HashSet;

public class LigneeBriseeHashSet {
    HashSet<Point> list2points;
    public static int taille = 2;//au moins 2 points

    public LigneeBriseeHashSet(HashSet<Point> list) {
        this.list2points = list;
    }

    public HashSet<Point> getList() {
        return list2points;
    }

    public void setList(HashSet<Point> list) {
        this.list2points = list;
    }

    public static int getTaille() {
        return taille;
    }

    public static void setTaille(int taille) {
        LigneeBriseeHashSet.taille = taille;
    }

    @Override
    public String toString() {
        return "LigneeBriseeHashSet{" +
                "list=" + list2points +
                '}';
    }

    public boolean contientPoint(Point p){
        return this.list2points.equals(p);
    }

    public void addPoint(Point p){
        if(!this.contientPoint(p)){
            this.list2points.add(p);
        }
        else{
            System.out.println("Ce point est déjà contenu");
        }
    }

    public void nbPoints(){
        int n=this.list2points.size();
        System.out.println("Cette ligne brisée contient "+n+" points");
    }

    public void deletePoint(Point p){
        if(this.contientPoint(p)){
            this.list2points.remove(p);
        }
        else{
            System.out.println("Ce point n'est pas dans la ligne brisée");
        }
    }

}
