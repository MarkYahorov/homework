import java.util.Scanner;

public class Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[]a = new int[10];

        for(int i=0;i<10;i++){
            int b = sc.nextInt();
            a[i] = b;
        }
        System.out.println(createPhoneNumber(a));


    }

    public static String createPhoneNumber(int[] a){

        return "("+ a[0] +a[1]+a[2]+") "+a[3]+a[4]+a[5]+ "-"+a[6]+a[7]+a[8]+a[9] ;
    }
}
