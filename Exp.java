import java.util.Scanner;

public class Exp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("what day?");
        String work = sc.nextLine();
        System.out.println("What day?");
        String work1 = sc.nextLine();
        boolean weekday1 = false;
        boolean weekday2 = false;


        switch (work) {
            case ("Понедельник"):
            case ("Вторник"):
            case ("Среда"):
            case ("Четверг"):
            case ("Пятница"):
                weekday1 = true;
                break;

        }
        switch (work1) {
            case ("Суббота"):
            case ("Воскресенье"):
                weekday2 = true;
            //    System.out.println("Спать");
                break;
        }

        if(weekday1==weekday2){
            System.out.println("Very bad");
            System.exit(0);
        }

        if (sleepIn(weekday1, weekday2)){
            System.out.println("Sleep");
        } else {
            System.out.println("Work");
        }



    }


    public static boolean sleepIn(boolean w, boolean v) {
        return !w || v;
    }
}

