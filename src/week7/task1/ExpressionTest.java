package week7.task1;

public class ExpressionTest {
    public static void main(String[] args) {
        Expression bieuthuc = new Square(new Addition(new Subtraction(new Square(new Numeral(10)), new Numeral(1)),new Multiplication(new Numeral(2),new Numeral(3))));
        System.out.println(bieuthuc.toString() + " = " + bieuthuc.evaluate());


        try {
            Expression abc = new Division(new Numeral(100), new Numeral(0));
            System.out.print(abc.evaluate());
        }
        catch (ArithmeticException e){
            System.out.print("Lỗi chia cho 0");

        }
    }
}
