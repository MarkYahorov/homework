package HomeWork1.Names;

import java.util.Objects;
import java.util.Scanner;

public class ifElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String friendName = "Вася";
        String girlFriend = "Анастасия";

        boolean friend = Objects.equals(friendName,name);
        boolean girl = Objects.equals(girlFriend,name);
        if(friend){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        } else if(girl){
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто? ");
        }
    }
}
