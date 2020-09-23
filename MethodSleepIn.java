import java.util.Scanner;

public class MethodSleepIn {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите true, если у вас рабочий или false, если выходной");
            boolean weekday = sc.nextBoolean();
            System.out.println("Введите true, если выходной или false, если рабочий");
            boolean vacation = sc.nextBoolean();

            if (sleepIn(weekday, vacation)) {
                System.out.println("Можем спать дальше.");
            } else {
                System.out.println("Пора идти на работу.");
            }
        } catch (Exception e){
            System.out.println("Вы ввели не то, о чем вас просили");
  }

//        Scanner scan = new Scanner(System.in);
//        String work = scan.nextLine();
//
//        switch (work){
//            case("Понедельник"):
//            case ("Вторник"):
//            case ("Среда"):
//            case ("Четверг"):
//            case ("Пятница"):
//                boolean weekday1 = false;
//                System.out.println("На работу");
//                break;
//            case ("Суббота"):
//            case ("Воскресенье"):
//                boolean weekday2 = true;
//                System.out.println("Спать");
//                break;
//        }

    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {

        return !weekday || vacation;
    }
}
