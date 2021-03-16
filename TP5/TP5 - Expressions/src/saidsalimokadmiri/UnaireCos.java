package saidsalimokadmiri;
import java.lang.Math;

public class UnaireCos extends ExpUnaire {

    public UnaireCos(ExpAbstraite operande) {
        super(operande);
    }

    @Override
    public double evaluer(Env env) {
        return Math.cos(this.getOperande().evaluer(env));
    }

    @Override
    public String toStringInfixe() {
        String s="cos(";
        s+=this.getOperande().toStringInfixe();
        s+= ")";
        return s;
    }
}
