package Names;

import java.util.Scanner;

public class ifOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if(name.equals("Вася")){
            System.out.println("Привет");
            System.out.println("Я тебя так долго ждал!");
        }

        if(name.equals("Анастасия")){
            System.out.println("Я тебя так долго ждал!");
        }

        if(!name.equals("Анастасия") && !name.equals("Вася")){
            System.out.println("Добрый день, а вы кто?");
        }


    }
}
