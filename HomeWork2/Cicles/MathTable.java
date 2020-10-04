package HomeWork2.Cicles;

public class MathTable {
    public static void main(String[] args) {
        for(int i=1; i<=10;i++){
            for(int l=1;l<=5;l++){
                int a = i*l;
                System.out.print(l+"*"+i +"=" +a +"\t\t");

            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for(int i=1; i<=10;i++){
            for(int l=6;l<=10;l++){
                int a = i*l;
                System.out.print(l+"*"+i +"=" +a +"\t\t");

            }
            System.out.println(" ");
        }

    }
}
