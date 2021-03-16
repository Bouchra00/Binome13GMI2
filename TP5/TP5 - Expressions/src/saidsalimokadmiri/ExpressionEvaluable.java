package saidsalimokadmiri;

public class ExpressionEvaluable implements Evaluable {

    private ExpAbstraite expression;
    private Env env;
    public ExpressionEvaluable(ExpAbstraite expression, Env env) {
        this.expression = expression;
        this.env = env;
    }

    @Override
    public String toString() {
        return this.expression.toStringInfixe() + " avec " + this.env;
    }

    @Override
    public double evaluer() {
        return this.expression.evaluer(this.env);
    }
}
