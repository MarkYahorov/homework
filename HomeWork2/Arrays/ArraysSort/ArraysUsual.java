package HomeWork2.Arrays.ArraysSort;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysUsual extends ArraySortMany{

    public static void main(String[] args) {

        int[] arraySort = new int[]{1,2,3,4,5,6};
        int[] arrayOne = new int[]{1,1,1,1};
        int[] arrayNorm = new int[]{9,1,5,99,9,9};
        int[] arrayEmpty = new int[]{};

        int randomm = (int) Math.random();
        


        int[] randomArray = new int[randomm];


        Scanner sc = new Scanner(System.in);
        int[] scannerArray = new int[10];
        for(int i=0;i<scannerArray.length; i++){
            int NumbOfArray = sc.nextInt();
            scannerArray[i] = NumbOfArray;
        }


        for(int i=0;i<randomArray.length; i++){
            randomArray[i] = (int) (Math.random()*10);
        }

        System.out.println(Arrays.toString(arraySort));
        ArraySortMany.BubblesSort1(arraySort);
        System.out.println(Arrays.toString(arraySort));
        System.out.println(Arrays.toString(arrayOne));
        ArraySortMany.BubblesSort1(arrayOne);
        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayNorm));
        ArraySortMany.BubblesSort1(arrayNorm);
        System.out.println(Arrays.toString(arrayNorm));
        System.out.println(Arrays.toString(arrayEmpty));
        ArraySortMany.BubblesSort1(arrayEmpty);
        System.out.println(Arrays.toString(arrayEmpty));
        System.out.println(Arrays.toString(randomArray));
        ArraySortMany.BubblesSort1(randomArray);
        System.out.println(Arrays.toString(randomArray));
        System.out.println(Arrays.toString(scannerArray));
        ArraySortMany.BubblesSort1(scannerArray);
        System.out.println(Arrays.toString(scannerArray));


    }


}
