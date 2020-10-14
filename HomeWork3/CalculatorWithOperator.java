package HomeWork3;


public class CalculatorWithOperator {

    public double summ(double a, double b) {
        return a+b;
    }

    public double compute(double a, double b) {
        return a-b;
    }

    public double division(double a, double b) {
        return a/b;
    }

    public double multiplication(double a, double b) {
        return a*b;
    }

    public double exponentiation(double a, int b) {
        if (a>0 && b>0){
            for(int i=1;i<b;i++){
                a*=a;
            }
        } else {
            a= a*-1;
            b= b*-1;
            for(int i=1;i<b;i++){
                a*=a;
            }
        }
        return a ;
    }

    public double moduleA(double a ) {

        if(a<0){
            return -1*a;
        }
        return a;
    }
    public double moduleB(double b) {
        if(b<0){
            return -1*b;
        }
        return b;
    }

    public double sqrtA(double a){
        return Math.sqrt(a);
    }

    public double sqrtB(double b){
        return Math.sqrt(b);
    }

}
