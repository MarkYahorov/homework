package HomeWork1;

public class BynaryCode {
    public static void main(String[] args) {
        byte a = 42;
        byte b = 15;

        int and = a&b;// двоичный код 1010, результат операции = 10
        int or = a|b;// двоичный код 101111, результат операции = 47
        byte NotA = (byte) ~a;// двоичный код 11111111111111111111111111010101, результат операции = -43
        byte notB = (byte) ~b;// двоичный код 11111111111111111111111111110000, результат операции = -16
        int xor = a^b;// двоичный код 100101, результат операции = 37
        int shiftLeft = a<<15;// двоичный код 101010000000000000000, результат операции = 1376256
        int shiftRight = b>>42; //двоичный код 0, результат операции = 0




        int c = -42;
        int d = -15;

        int andCD = c&d;// двоичный код 11111111111111111111111111010000, результат операции = -48
        int orCD = c|d;// двоичный код 11111111111111111111111111110111, результат операции = -9
        byte NotC = (byte) ~c;// двоичный код 101001, результат операции = 41
        byte notD = (byte) ~d;// двоичный код 1110, результат операции = 14
        int xorCD = c^d;// двоичный код 100111, результат операции = 39
        int shiftRigthC = c<<-15;// двоичный код 11111111101011000000000000000000, результат операции = -5505024
        int shiftLeftD = d>>-42;// двоичный код 11111111111111111111111111111111, результат операции = -1
        int assigC = c<<=-15;// двоичный код 11111111101011000000000000000000, результат операции = -5505024
        int assigD = d>>=-42;// двоичный код 11111111111111111111111111111111, результат операции = -1

        double doub = 42.5;

        //double shiftRigthDoub = doub>>1; // Operator ">>"  cannot be applied  to 'double', 'int'.
    }
}
