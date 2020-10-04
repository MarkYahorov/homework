package HomeWork2.Cicles;

public class Cycles {
    public static void main(String[] args) {
        //
        int exInt = 10;
        //переменная на счет
       int x=0;

       do{
           x++;
           System.out.print(x);
           if(x==ex(exInt)){
               break;
           }
           System.out.print("*");
       }while (x<=ex(exInt));

        System.out.print("=");


        int fact = 1;
        for (int i=2; i<=ex(exInt); i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }


    public static int ex(int i){
        return i;
    }
}
