/**
 *
 * KjG
 */
package kissjgabi20190206;

import java.util.Scanner;

public class KissJGabi20190206 {

    private static Scanner sc = new Scanner(System.in, ("Cp1250"));

    private static void f00(int hossz, char jel, String name) {
        System.out.print(jel + " |");
        System.out.print(name + "| ");
        for (int ii = name.length() - 5; ii < hossz; ii++) {
            System.out.print(jel);
        }
        System.out.println("");
    }

    private static void f01(String cimke) {
        f00(60, '*', cimke);

        System.out.print("Kérem az első számot: ");
        double a = sc.nextDouble();
        System.out.print("Kérem a második számot: ");
        double b = sc.nextDouble();

        if (a == b) {
            System.out.println("A két szám egyenlő!");
        } else if (a > b) {
            System.out.println("Az első szám a nagyobb!");
        } else {
            System.out.println("A második szám a nagyobb!");
        }
        System.out.println(" ");
    }

    private static void f02(String cimke) {
        f00(60, '*', cimke);

        System.out.println(" Az 5-tel, de 25-tel nem ostható számok 1-200-ig");
        for (int ii = 0; ii <= 200; ii++) {
            if (ii % 5 == 0 && ii % 25 != 0) {
                System.out.print(ii + ", ");
            }
        }
        System.out.println("\n");
    }

    private static void f03(String cimke) {
        f00(60, '*', cimke);

        String jegy;
        System.out.print("A dolgozat pontszáma: ");
        int pont = sc.nextInt();

        if (pont < 0) {
            jegy = " Hibás pontszámot adott meg! ";
        } else if (pont < 51) {
            jegy = " ez nem elég.";
        } else if (pont < 61) {
            jegy = " elérted az elégségest.";
        } else if (pont < 71) {
            jegy = " ez egy jó közepes szint.";
        } else if (pont < 81) {
            jegy = " jónak illik be.";
        } else if (pont < 91) {
            jegy = " szuper Vagy.";
        } else {
            jegy = " Hibás pontszámot adott meg! ";
        }
        System.out.println("Értékelés:" + jegy);
        System.out.println(" ");
    }

    private static void f04(String cimke) {
        f00(60, '*', cimke);

        System.out.println("Egész számok osztása Jávában: ");
        System.out.println("Osszuk el a 157-et 17-tel!");
        System.out.println("A 15 / 17 eredménye: " + 157 / 17 + ", ");
        System.out.println("Ami az osztás egész részét adja.");
        System.out.println("A 157 % 17 eredménye: " + 157 % 17 + ", ");
        System.out.println("Ami az osztás maradékát adja adja.");
        System.out.print("Az osztás eredménye tizedes törtként ");
        System.out.println("kasztolás után jeleníthető meg:");
        System.out.println("(double) 157 / 17 = " + (double) 157 / 17);
        System.out.println(" ");
    }

    private static void f05(String cimke) {
        f00(60, '*', cimke);

        double szum = 0;
        int darab = 0;

        System.out.print("Kérem az első számot: ");
        double a = sc.nextDouble();

        if (a == 0) {
            System.out.println("Nem adtál meg számot! ");
        } else {
            while (a != 0) {
                szum += a;
                darab++;
                System.out.print("Kérem a " + (darab + 1) + ". számot: ");
                a = sc.nextDouble();
            }
            System.out.println("A számok összege: " + szum);
            System.out.println("A számok átlaga: " + szum / darab);
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        f00(60, '*', "START JAVA 2019feb06 dolgozat");
        f01("1. feladat");
        f02("2. feladat");
        f03("3. feladat");
        f04("4. feladat");
        f05("5. feladat");
        f00(60, '*', "END JAVA 2019feb06 dolgozat");
    }

}
