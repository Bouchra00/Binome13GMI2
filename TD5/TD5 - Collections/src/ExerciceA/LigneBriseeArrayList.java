package ExerciceA;
import java.util.ArrayList;

public class LigneBriseeArrayList {


    //1.
    ArrayList<Point> liste2Points;
    public static int taille = 2;//au moins 2 points


    public LigneBriseeArrayList(ArrayList<Point> al, int n) {
        super();
        this.liste2Points = al;
        this.taille=n;
    }

    public ArrayList<Point> getList() {
        return liste2Points;
    }

    public void setList(ArrayList<Point> list) {
        this.liste2Points = list;
    }

    public static int getTaille() {
        return taille;
    }

    public static void setTaille(int taille) {
        LigneBriseeArrayList.taille = taille;
    }

    public LigneBriseeArrayList() {
        this.liste2Points = new ArrayList<Point>();
    }

    @Override
    public String toString() {
        return "LigneBriseeArrayList{" +
                "list=" + liste2Points +
                '}';
    }

    //2.
    public boolean contientPoint(Point p){
        if(this.liste2Points.contains(p)) {
            return true;
        }
        else{
            return false;
        }
    }

    //3.
    public void addPoint(Point p){
        if(!this.contientPoint(p)){
            this.liste2Points.add(p);
        }
    }

    //4.
    public void nbPoints(){

        int i=this.liste2Points.size();
        System.out.println("Nous avons "+i+" points dans la ligne brisée");
    }

    //5.
    public void deletePoint(Point p){
        if(this.contientPoint(p)){
            this.liste2Points.remove(p);
        }
        else{
            System.out.println("Ce point n'est pas dans la ligne brisée");
        }
    }

}
