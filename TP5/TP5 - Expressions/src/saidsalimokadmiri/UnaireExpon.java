package saidsalimokadmiri;

public class UnaireExpon extends ExpUnaire {

    public UnaireExpon(ExpAbstraite operande) {
        super(operande);
    }

    @Override
    public double evaluer(Env env) {
        return Math.exp(this.getOperande().evaluer(env));
    }

    @Override
    public String toStringInfixe() {
        String s="exp(";
        s+=this.getOperande().toStringInfixe();
        s+= ")";
        return s;
    }

}
