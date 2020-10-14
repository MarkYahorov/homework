package HomeWork3;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        double umn = calculator.multiplication(15.0,7.0);
        double del = calculator.division(28.0,5);
        double st = calculator.exponentiation(del,2);
        double sum1 = calculator.summ(4.1, umn);
        double sum2 = calculator.summ(sum1,st);
        double result = sum2;
        double result2 = calculator.sqrtA(sum2);
        System.out.println(result);
        System.out.println(result2);
    }
}
