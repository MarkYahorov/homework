package HomeWork2.Arrays;

import java.util.Scanner;

public class ArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for(int i=0; i<array.length;i++){
            int number = sc.nextInt();
            array[i]=number;
        }
        int l=0;
       do{
            System.out.println(array[l]);
            l++;
       }while (l<array.length);


        while (l<array.length){
            System.out.println(array[l]);
            l++;
        }

        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }


        for (int k:array) {
            System.out.println(k);
        }

        for (int i=0;i<array.length;i++){
            if(i%2==0){
                System.out.println(array[i]);
            }
        }

        for(int i=9;i>=args.length;i--){
            System.out.println(array[i]);
        }

        int p = 9;
        do{
            System.out.println(array[p]);
            p--;
        }while (p>array.length);


        while (p>array.length){
            System.out.println(array[p]);
            p--;
        }


        for (int i = p; i >= 0; i--)
        {
            System.out.println(array[i]);
        }


    }
}
