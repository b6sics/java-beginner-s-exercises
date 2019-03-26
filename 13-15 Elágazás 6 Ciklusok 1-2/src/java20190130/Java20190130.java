package java20190130;

import java.util.Scanner;

/**
 *
 * @author KjG
 */
public class Java20190130 {

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
        System.out.print("A nap sorszáma: ");
        int nap = sc.nextInt();

        switch (nap) {
            case 1:
                System.out.println("hétfő");
                break;
            case 2:
                System.out.println("kedd");
                break;
            case 3:
                System.out.println("szerda");
                break;
            case 4:
                System.out.println("csütörtök");
                break;
            case 5:
                System.out.println("péntek");
                break;
            case 6:
                System.out.println("szombat");
                break;
            case 7:
                System.out.println("vasárnap");
                break;
            default:
                System.out.println("nincs ilyen nap");
                break;
        }
    }

    private static void f02(String cimke) {
        f00(60, '*', cimke);   // Fejléc 
        System.out.print("Hány Ft 1 Euro ");
        int arfolyam = sc.nextInt();
        int osszeg;

        System.out.print("1. Euro->Ft 2. Ft->Euro ");
        int valasz = sc.nextInt();

        switch (valasz) {
            case 1:
                System.out.println("Átváltandó összeg (EUR): ");
                osszeg = sc.nextInt();
                System.out.println(Math.round(osszeg * arfolyam) + " Ft");
                break;
            case 2:
                System.out.println("Átváltandó összeg (HUF): ");
                osszeg = sc.nextInt();
                System.out.println(Math.round(osszeg / arfolyam) + " EUR");
                break;
            default:
                System.out.println("nincs ilyen nap");
                break;
        }

    }

    private static void f03(String cimke) {
        f00(60, '*', cimke);   // Fejléc 

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    private static void f04(String cimke) {
        f00(60, '*', cimke);   // Fejléc 

        int i = 10;
        while (i <= 50) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();
    }

    private static void f05(String cimke) {
        f00(60, '*', cimke);   // Fejléc 

        int i = 500;
        while (i >= 400) {
            System.out.print(i + " ");
            i -= 7;
        }
        System.out.println();
    }

    private static void f06(String cimke) {
        f00(60, '*', cimke);   // Fejléc 

        int i = 200;
        while (i <= 300) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }

    private static void f07(String cimke) {
        f00(60, '*', cimke);   // Fejléc 

        System.out.print("Az első szám: ");
        double x = sc.nextDouble();
        while (x != 0) {
            System.out.println("A szám négyzete: " + Math.pow(x, 2));
            System.out.print("A következő szám: ");
            x = sc.nextDouble();
        }
    }

    private static void f08(String cimke) {
        f00(60, '*', cimke);   // Fejléc 

        int jegy;
        do {
            System.out.print("Az osztályzat: ");
            jegy = sc.nextInt();

            switch (jegy) {
                case 1:
                    System.out.println("1: elégtelen");
                    break;
                case 2:
                    System.out.println("2: elégséges");
                    break;
                case 3:
                    System.out.println("3: közepes");
                    break;
                case 4:
                    System.out.println("4: jó");
                    break;
                case 5:
                    System.out.println("5: jeles");
                    break;
            }

        } while (jegy < 1 || jegy > 5);
    }

    public static void main(String[] args) {
        f00(60, '-', "ELÁGAZÁS 6 ");
        f01("A hét napjai ");
        f02("Pénzváltás ");
        f00(60, '-', "CIKLUSOK 1 - WHILE ");
        f03("Szamsorozat 1-től 10-ig ");
        f04("10-től 50-ig kettesével ");
        f05("500-től 400-ig hetesével ");
        f06("200-től 300-ig 2-vel és 7-el osztható ");
        f00(60, '-', "CIKLUSOK 2 ");
        f07("Számok négyzete - ha 0, akkor EXIT ");
        f08("Hátul tesztelő ciklus - DO WHILE ");
    }

}
