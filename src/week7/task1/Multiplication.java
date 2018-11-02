package week7.task1;

public class Multiplication extends BinaryExpression {


    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int evaluate() {
        return getLeft().evaluate()*getRight().evaluate();

    }

    @Override
    public String toString() {
        return getLeft().toString() + "*" + getRight().toString();
    }
}
