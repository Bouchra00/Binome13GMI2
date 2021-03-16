package saidsalimokadmiri;
import java.util.HashMap;

public class Env {
    private HashMap<String, Double> Carte =new HashMap<String, Double>();

    public Env() {
    }
    @Override
    public String toString() {
        return "Env{" + Carte +
                '}';
    }

    public void associer(String nom, double val) {
        this.Carte.put(nom,val);
    }

    public double obtenirValeur(String nom) {

            if (this.Carte.containsKey(nom)) {
                return this.Carte.get(nom);
            } else {
                throw new java.lang.Error("la variable n'est pas encore connue dans l'environnement !");
            }

    }



}
