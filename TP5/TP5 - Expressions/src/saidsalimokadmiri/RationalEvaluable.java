package saidsalimokadmiri;

public class RationalEvaluable extends Rational implements Evaluable{
    public RationalEvaluable(int numerateur, int denominateur) {
        super(numerateur, denominateur);
    }
    public RationalEvaluable(int numerateur) {
        super(numerateur);
    }

    @Override
    public double evaluer() {
        return (double) this.getNum()/this.getDen();
    }
}
