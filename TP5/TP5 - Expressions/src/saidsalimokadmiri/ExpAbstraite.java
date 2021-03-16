package saidsalimokadmiri;

public abstract class ExpAbstraite {

    public abstract double evaluer(Env env);
    public abstract String toStringInfixe() ;

    @Override
    public String toString() {
        return "Je suis une expression et me voilà en notation infixée : " + this.toStringInfixe();
    }
}
