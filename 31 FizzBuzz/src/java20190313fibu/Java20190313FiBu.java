package java20190313fibu;

/**
 *
 * @author KjG
 */
public class Java20190313FiBu {

    private static void f00(int hossz, char jel, String name) {
        int start = 0;
        if (name.length() != 0) {
            start = name.length() + 5;
            System.out.print(jel + "| ");
            System.out.print(name + " |");
        }
        for (int ii = start; ii < hossz; ii++) {
            System.out.print(jel);
        }
        System.out.println("");
    }

    private static void f1(String label, int start, int end) {
        f00(60, '-', label);
        for (int ii = start; ii < end; ii++) {
            if (ii % 3 != 0 && ii % 5 != 0) {
                System.out.print(ii);
            } else {
                if (ii % 3 == 0) {
                    System.out.print("Fizz");
                }
                if (ii % 5 == 0) {
                    System.out.print("Buzz");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        f00(60, '*', "STARTofJAVA 2019mar13 FizzBuzz");
        f00(60, '-', "");

        f1("1. kiíratás", 1, 100);

        f00(60, '-', "");
        f00(60, '*', "ENDofJAVA   2019mar13");
    }

}
