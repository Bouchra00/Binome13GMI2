package saidsalimokadmiri;
import java.lang.Math;

public class UnaireSin extends ExpUnaire {

    public UnaireSin(ExpAbstraite operande) {
        super(operande);
    }

    @Override
    public double evaluer(Env env) {
        return Math.sin(this.getOperande().evaluer(env));
    }

    public String toStringInfixe(){
        String s="sin(";
        s+=getOperande().toStringInfixe();
        s+= ")";
        return s;
    }
}
