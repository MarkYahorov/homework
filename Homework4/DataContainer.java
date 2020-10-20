package Homework4;


import java.util.Arrays;

public class DataContainer<T> {

    public static void main(String[] args) {

        DataContainer<Object> dataContainer = new DataContainer<>();

        dataContainer.add(777);
        dataContainer.add(null);
        dataContainer.add(123);
        dataContainer.add(5436789);
        dataContainer.print();







    }

    T[] data;

   DataContainer(){
       data = (T[]) new Object[]{23, null, 3246,6, null};
   }


    public int add(T item){

       int count = 0;

        for (int i = 0; i < data.length; i++) {

            if(item == null){
                return -1;
            }

            if (data[i] == null){
                data[i] = item;
                count++;
                break;
            }
            if(data[0]!=null && data[data.length-1]!=null){
                data = Arrays.copyOf(data, data.length + 1);
                data[data.length-1] = item;
                count++;
            }

        }


        return count;

    }


    public void print(){

        System.out.println(Arrays.toString(data));

    }


}
