package saidsalimokadmiri;

public class Variable extends ExpAbstraite {
    private String name;

    public Variable(String nom) {
        this.name = nom;
    }

    public String getName() {
        return name;
    }

    @Override
    public double evaluer(Env env) {
        return env.obtenirValeur(this.name);
    }

    @Override
    public String toStringInfixe() {
        return this.name;
    }
}
