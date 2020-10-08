package HomeWork2.Cicles;


public class Cycles2 {
    public static void main(String[] args) {

        ex(543);

    }

    public static void ex(int a){
        int b = 1;

        for(b=1; a!=0; a/=10){
            b*= a%10;
            if(b<=a){
                System.out.print(a%10+"*");
            } else System.out.print(a%10);
        }
        System.out.print("="+b);
    }
}
