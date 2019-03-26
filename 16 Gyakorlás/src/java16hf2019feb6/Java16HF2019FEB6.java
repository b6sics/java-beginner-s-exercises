package java16hf2019feb6;

import java.util.Scanner;

/**
 *
 * @author KjG
 */
public class Java16HF2019FEB6 {

    private static Scanner sc = new Scanner(System.in, ("Cp1250"));

    private static void f00(int hossz, char jel, String name) {
        System.out.print(name);
        for (int ii = name.length(); ii < hossz; ii++) {
            System.out.print(jel);
        }
        System.out.println("");
    }

    private static void f01(String cimke) {
        f00(60, '*', cimke);   // Fejléc 

        System.out.print("A szám: ");
        int n = sc.nextInt();
        int i = 1;

        while (i <= n) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println("");
    }

    private static void f02(String cimke) {
        f00(60, '*', cimke);   // Fejléc 

        System.out.print("Az 1. szám: ");
        int a = sc.nextInt();
        System.out.print("Az 2. szám: ");
        int b = sc.nextInt();

        if (b > a) {
            int dummy = a;
            a = b;
            b = dummy;
        }

        int m = a % b;
        while (a % b > 0) {
            a = b;
            b = m;
            m = a % b;
        }
        System.out.println("LNKO: " + b);
    }

    public static void main(String[] args) {
        f00(60, '-', "HÁZI FELADAT 16 JAVA GYAKORLÁS ");
        f01("Egy egész szám osztói ");
        f02("Két egész legnagyobb közös osztója ");
    }

}
