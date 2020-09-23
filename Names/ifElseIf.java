package Names;

import java.util.Scanner;

public class ifElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if(name.equals("Вася")){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        } else if(name.equals("Анастасия")){
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто? ");
        }
    }
}
