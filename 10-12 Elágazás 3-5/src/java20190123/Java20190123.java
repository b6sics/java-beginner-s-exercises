package java20190123;

import java.util.Scanner;

/**
 *
 * @author KjG
 */
public class Java20190123 {

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

        String alkat;
        System.out.print("Hány cm magas vagy? ");
        double cm = sc.nextDouble() / 100;

        System.out.print("Hány kg a tömeged? ");
        double kg = sc.nextDouble();

        double tti = kg / Math.pow(cm, 2);
        tti = Math.round(tti * 100) / 100.0;

        if (tti < 20) {
            alkat = " alultáplált ";
        } else if (tti < 25) {
            alkat = " normális ";
        } else if (tti < 30) {
            alkat = " túlsúlyos ";
        } else if (tti < 35) {
            alkat = " elhízott ";
        } else {
            alkat = " erősen elhízott ";
        }
        System.out.println("Testtömegindexed: " + tti + alkat);
        System.out.println("");
    }

    private static void f02(String cimke) {
        f00(60, '*', cimke);   // Fejléc 

        String jegy;

        System.out.print("A dolgozat pontszáma (0-100): ");
        int pont = sc.nextInt();

        if (pont < 51) {
            jegy = " elégtelen ";
        } else if (pont < 61) {
            jegy = " elégséges ";
        } else if (pont < 71) {
            jegy = " közepes ";
        } else if (pont < 81) {
            jegy = " jó";
        } else if (pont < 101) {
            jegy = " jeles ";
        } else {
            jegy = " Hibás pontszámot adott meg! ";
        }
        System.out.println("Pontszám: " + pont);
        System.out.println("Osztályzat: " + jegy);
        System.out.println("");
    }

    private static void f03(String cimke) {
        f00(60, '*', cimke);   // Fejléc 

        String negyed;

        System.out.print("x = ");
        int pontx = sc.nextInt();
        System.out.print("y = ");
        int ponty = sc.nextInt();

        if (pontx < 0) {
            if (ponty < 0) {
                negyed = "harmadik ";
            } else {
                negyed = "második ";
            }
        } else {
            if (ponty < 0) {
                negyed = "negyedik ";
            } else {
                negyed = "első ";
            }
        }

        System.out.print("A pont a(z) ");
        System.out.println(negyed + " negyedben van.");
        System.out.println("");
    }

    private static void f04(String cimke) {
        f00(60, '*', cimke);   // Fejléc 

        System.out.print("Születési év: ");
        int ev = sc.nextInt();
        sc.nextLine();
        System.out.print("Nem (f/n): ");
        String nem = sc.nextLine();

        int szam;
        if (ev < 2000) {
            if (nem.charAt(0) == 'f') {
                szam = 1;
            } else {
                szam = 2;
            }
        } else {
            if (nem.charAt(0) == 'f') {
                szam = 3;
            } else {
                szam = 4;
            }
        }
        System.out.println("Személyi számod eleje: " + szam);
        System.out.println("");
    }

    private static void f05(String cimke) {
        f00(60, '*', cimke);   // Fejléc 

        System.out.print("Osztályzat: ");
        int x = sc.nextInt();
        System.out.println("");

        if (x < 0 || x > 5) {
            System.out.println("Hibás adat!");
        } else {
            System.out.println("Köszönöm!");
        }

        System.out.println("");
    }

    private static void f06(String cimke) {
        f00(60, '*', cimke);   // Fejléc 

        System.out.print("Osztályzat: ");
        int x = sc.nextInt();
        System.out.println("");

        if (x > 0 && x < 6) {
            System.out.println("Köszönöm!");
        } else {
            System.out.println("Hibás adat!");
        }

        System.out.println("");
    }

    private static void f07(String cimke) {
        f00(60, '*', cimke);   // Fejléc 

        System.out.print("Év (1800-2100): ");
        int ev = sc.nextInt();

        if (ev < 1800 || ev > 2100) {
            System.out.println("Hibás adat!");
        } else {
            if (ev % 4 == 0 && ev % 100 != 0 || ev % 400 == 0) {
                System.out.println("Szökőév!");
            } else {
                System.out.println("Nem szökőév!");
            }
        }

        System.out.println("");
    }

    private static int rnd(int ah, int fh) {
        return (int) (Math.random() * (fh - ah + 1) + ah);
    }

    private static void f08(String cimke) {
        f00(60, '*', cimke);   // Fejléc 

        for (int ii = 0; ii < 10; ii++) {
            int szam = rnd(-10, 50);
            if (szam > 20 && szam < 30) {
                System.out.println("A(z) " + szam + " OK, mert 20 és 30 közé esik!");
            } else {
                System.out.println("A szám: " + szam + ", nem része az intervallumnak!");
            }
        }

        System.out.println("");
    }

    private static void f09(String cimke) {
        f00(60, '*', cimke);   // Fejléc 

        for (int ii = 0; ii < 10; ii++) {
            int szam = rnd(-10, 50);
            if (szam % 3 == 0 || szam % 5 == 0) {
                System.out.println("A(z) " + szam + " OK, mert osztható 5-tel, vagy 3-mal!");
            } else {
                System.out.println("A szám: " + szam + ", nem osztható 5-tel, vagy 3-mal!");
            }
        }

        System.out.println("");
    }

    public static void main(String[] args) {
        f00(60, '-', "ELÁGAZÁS 3 ");
        f01("Testtömeg index ");
        f02("Dolgozat osztályozás ");
        f00(60, '-', "ELÁGAZÁS 4 ");
        f03("Síknegyed ");
        f04("Személyi szám ");
        f00(60, '-', "ELÁGAZÁS 5 ");
        f05("Jegyek 1");
        f06("Jegyek 2");
        f07("Szökőév ");
        f08("Intervallum (20,30) ");
        f09("Oszthatóság 3-mal, vagy 5-tel ");
        f00(60, '-', "VÉGE ");
    }

}
