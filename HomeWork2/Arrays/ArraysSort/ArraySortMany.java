package HomeWork2.Arrays.ArraysSort;

public class ArraySortMany {

    public static void main(String[] args) {



    }

    public static void BubblesSort1(int[] array){

        for (int i=0; i<array.length-1;i++){
            if (array[i]>array[i+1]){
                int tepm = array[i];
                array[i]=array[i+1];
                array[i+1]=tepm;
            }

        }

    }

    public static void sheikSort(int[] array) {
        int left = 0; // левая граница
        int right = array.length - 1; // правая граница

        do {
            //Сдвигаем к концу массива "тяжелые элементы"
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    array[i] ^= array[i + 1];
                    array[i + 1] ^= array[i];
                    array[i] ^= array[i + 1];
                }
            }
            right--; // уменьшаем правую границу
            //Сдвигаем к началу массива "легкие элементы"
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    array[i] ^= array[i - 1];
                    array[i - 1] ^= array[i];
                    array[i] ^= array[i - 1];
                }
            }
            left++; // увеличиваем левую границу
        } while (left <= right);
    }



}
