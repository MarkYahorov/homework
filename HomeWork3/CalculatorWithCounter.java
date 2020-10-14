package HomeWork3;

public class CalculatorWithCounter {

    private final CalculatorWithOperator calcOperator;
    private final CalculatorWithMathExtends calcExtends;
    private final CalculatorWithMathCopy calcCopy;

    public static void main(String[] args) {



    }

    CalculatorWithCounter(CalculatorWithOperator cwo){

        this.calcCopy = null;
        this.calcExtends = null;
        this.calcOperator = cwo;
        
    }

    CalculatorWithCounter(CalculatorWithMathExtends cwme){

        this.calcCopy = null;
        this.calcExtends = cwme;
        this.calcOperator = null;
    }

    CalculatorWithCounter(CalculatorWithMathCopy cwmc){

        this.calcCopy = cwmc;
        this.calcExtends = null;
        this.calcOperator = null;
    }

    public CalculatorWithMathCopy getCalcCopy() {
        return calcCopy;
    }

    public CalculatorWithMathExtends getCalcExtends() {
        return calcExtends;
    }

    public CalculatorWithOperator getCalcOperator() {
        return calcOperator;
    }


}
