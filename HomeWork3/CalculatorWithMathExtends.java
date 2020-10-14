package HomeWork3;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    @Override
    public double summ(double a, double b) {
        return super.summ(a, b);
    }

    @Override
    public double compute(double a, double b) {
        return super.compute(a, b);
    }

    @Override
    public double division(double a, double b) {
        return super.division(a, b);
    }

    @Override
    public double multiplication(double a, double b) {
        return super.multiplication(a, b);
    }

    @Override
    public double exponentiation(double a, int b) {
        return Math.pow(a,b);
    }

    @Override
    public double moduleA(double a) {
        return Math.abs(a);
    }

    @Override
    public double moduleB(double b) {
        return Math.abs(b);
    }

    @Override
    public double sqrtA(double a) {
        return Math.sqrt(a);
    }

    @Override
    public double sqrtB(double b) {
        return Math.sqrt(b);
    }
}
