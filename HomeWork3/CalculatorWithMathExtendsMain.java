package HomeWork3;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calculator = new CalculatorWithMathExtends();
        double umn = calculator.multiplication(15.0,7.0);
        double del = calculator.division(28.0,5);
        double st = calculator.exponentiation(del,2);
        double sum1 = calculator.summ(4.1, umn);
        double sum2 = calculator.summ(sum1,st);
        double result = sum2;
        System.out.println(result);
    }
}
