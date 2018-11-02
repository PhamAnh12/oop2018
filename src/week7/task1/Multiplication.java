package week7.task1;

public
class Multiplication extends BinaryExpression {
    private Expression left;
    private Expression right;
     public Multiplication(Expression left, Expression right){
         this.left = left;
         this.right = right;
     }
    @Override
    public Expression left() {
        return  null;

    }

    @Override
    public Expression right() {
        return null;
    }

    @Override
    public int evaluate() {
        return left.evaluate()* right.evaluate();
    }

    @Override
    public String toString() {
        return left.toString() + " * " + right.toString();
    }

}
