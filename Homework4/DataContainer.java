package Homework4;


import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {

    public DataContainer(T[] data) {
        this.data = data;
    }

    private T[] data;

    public static void main(String[] args) {

        DataContainer dataContainer = new DataContainer<>(new java.lang.Object[5]);
        Integer abc = 654;
        dataContainer.add(675);
        dataContainer.add(null);
        dataContainer.add(123);
        dataContainer.add(5436789);
        dataContainer.add(abc);
        dataContainer.add(3146);
        dataContainer.add(879);
        dataContainer.add(2);
        dataContainer.get(0);
        dataContainer.getItems();
        dataContainer.delete(1);
        dataContainer.delete(abc);

    }


    public int add(T item) {

       int index=0;

        for (int i = 0; i < data.length; i++) {

            if(data[i]==null && item!=null){

                data[i]=item;
                index = i;
                return index;

            } else if (item == null) {
                return -1;
            }
        }

            data = Arrays.copyOf(data,data.length+1);
            index = data.length-1;
        return index;
    }


    public T get(int index){

       return data[index];

    }

    public T[] getItems(){
       return data;
    }

    boolean delete(int index){

       if(index>0 || index< data.length){
           for (int i = 0, l = 0; i < data.length; i++) {
               if(index==i){
                   continue;
               } else {
                   data[l++] = data[i];
               }
           }
           data = Arrays.copyOf(data, data.length-1);
           System.out.println(Arrays.toString(data));

           return true;
       } else {
           System.out.println(Arrays.toString(data));
           return false;
       }
    }

    boolean delete(T item) {
        boolean found = false;

        int look_at = 0;
        while (!found && look_at < data.length) {
            found = data[look_at].equals(item);
            look_at++;
        }

        if (found) {
            for (int i = 0,l=0; i <data.length ; i++) {
                if(data[i].equals(item)){
                    continue;
                } else {
                    data[l++] = data[i];
                }

            }
            data = Arrays.copyOf(data,data.length-1);
        }

        return found;
    }


    public void sort(Comparator comparator){


    }



}
