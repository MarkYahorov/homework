package HomeWork2.Cicles;

public class Cycles4 {
    public static void main(String[] args) {

        many(523);
        int sum = 0;
        int num = many(523);
        while (many(523) > 0) {
            sum = sum + many(523) % 10;
            num = many(523) / 10;

        }
        System.out.println(sum);


    }

    public static int many(int a){
        return a;
    }
}
