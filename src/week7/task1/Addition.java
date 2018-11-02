package week7.task1;

public class Addition extends BinaryExpression{

    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    @Override
     public int evaluate() {
        return getLeft().evaluate()+getRight().evaluate();
    }

    @Override
    public String toString() {
        return getLeft().toString() + "+" + getRight().toString();
    }

}