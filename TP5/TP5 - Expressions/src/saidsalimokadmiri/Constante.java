package saidsalimokadmiri;

public class Constante extends ExpAbstraite {
    private double val;

    public Constante(double valeur) {
        this.val = valeur;
    }

    public double getVal() {
        return val;
    }

    @Override
    public double evaluer(Env env) {
        return this.val;
    }

    @Override
    public String toStringInfixe() {
        return String.valueOf(this.val);
    }
}
