/**
 * @author kissjgabi
 */
package java20190116;

import java.util.Scanner;

public class Java20190116 {

    private static Scanner sc = new Scanner(System.in, ("Cp1250"));

    private static void f00(int n, char c, String name) {
        System.out.println("");
        System.out.print(name + " ");
        for (int ii = name.length(); ii < n; ii++) {
            System.out.print(c);
        }
        System.out.println("");
    }

    private static void f01() {
        f00(40, '*', "05 ÜDVÖZLET");   // Fejléc 
        System.out.print("Mi a neved? ");
        String nev = sc.nextLine();
        System.out.println("Üdvözöllek " + nev + "!");
    }

    private static void f02() {
        f00(40, '*', "05 KÖR");   // Fejléc 
        System.out.print("A kör sugara: ");
        double r = sc.nextDouble();

        double ker = 2 * r * Math.PI;
        double ter = Math.pow(r, 2) * Math.PI;

        System.out.println("Kör ");
        System.out.println("\tA kör sugara: " + r);
        System.out.println("\tA kör kerülete: " + Math.round(ker * 100) / 100.0);
        System.out.println("\tA kör területe: " + Math.round(ter * 100) / 100.0);
    }

    private static void f03() {
        f00(40, '*', "05 PITAGORASZ");   // Fejléc 
        System.out.print("a oldal: ");
        double a = sc.nextDouble();
        System.out.print("b oldal: ");
        double b = sc.nextDouble();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("\tA c oldal: " + Math.round(c * 100) / 100.0);
    }

    private static void f04() {
        f00(40, '*', "06 MEDENCE");   // Fejléc 
        System.out.print("A medence sugara: ");
        double r = sc.nextDouble();
        System.out.print("A medence mélysége: ");
        double h = sc.nextDouble();

        double felszin = Math.pow(r, 2) * Math.PI;
        double terfogat = felszin * h;
        System.out.printf("\tA vízfelszin:  %.2f m2\n", felszin);
        System.out.printf("\tA medence térfogata: %.2f m3\n", terfogat);

        final int AR = 500;

        System.out.printf("\tA feltöltés ára: %,.2f Ft2"
                + "\n", terfogat * AR);
    }

    private static void f05() {
        f00(40, '*', "06 FAHRENHEIT/CELSIUS");   // Fejléc 
        System.out.print("Hőmérséklet (USA) °F: ");
        double f = sc.nextDouble();

        double c = (f - 32) * 5 / 9;

        System.out.printf("\tHőmérséklet (EU):  %.2f °C\n", c);
    }

    private static void f06() {
        f00(40, '*', "07 PIAC");   // Fejléc 
        final int ALMA_AR = 49;
        final int KORTE_AR = 69;

        System.out.print("Almák száma: ");
        int alma_db = sc.nextInt();
        System.out.print("Körték száma: ");
        int korte_db = sc.nextInt();

        int ar = alma_db * ALMA_AR + korte_db * KORTE_AR;
        System.out.printf("\tFizetendő:  %,8d"
                + " Ft\n", Math.round(ar / 5f) * 5);

        System.out.print("Kapott összeg: ");
        int kapott = sc.nextInt();
        int vissza = Math.round((kapott - ar) / 5f) * 5;

        System.out.printf("\tVisszajáró:  %,8d"
                + " Ft\n\n", vissza);

        System.out.printf("\t100 Ft-os:  %,3d"
                + " db\n", vissza / 100);
        vissza = vissza % 100;
        System.out.printf("\t 50 Ft-os:  %,3d"
                + " db\n", vissza / 50);
        vissza = vissza % 50;
        System.out.printf("\t 20 Ft-os:  %,3d"
                + " db\n", vissza / 20);
        vissza = vissza % 20;
        System.out.printf("\t 10 Ft-os:  %,3d"
                + " db\n", vissza / 10);
        vissza = vissza % 10;
        System.out.printf("\t  5 Ft-os:  %,3d"
                + " db\n", vissza / 5);
        vissza = vissza % 5;
    }

    private static void f07() {
        f00(40, '*', "07 CELSIUS/FAHRENHEIT");   // Fejléc 
        System.out.print("Hőmérséklet (EU) °C: ");
        double c = sc.nextDouble();

        double f = c * 9 / 5 + 32;

        System.out.printf("\tHőmérséklet (EU):  %.2f °F\n", f);
    }

    private static void f08() {
        f00(40, '*', "08 ELÁGAZÁS 1");   // Fejléc 
        System.out.print("Hány fok van: ");
        int t = sc.nextInt();

        if (t > 25) {
            System.out.println("Meleg van!");
            System.out.println("Nyisd ki az ablakot!");
        } else {
            System.out.println("Nincs meleg");
            System.out.println("Ne nyisd ki az ablakot!");
        }
    }

    private static void f09() {
        f00(40, '*', "08 PÁROS/PÁRATLAN");   // Fejléc 
        System.out.print("Irj be egy számot: ");
        int szam = sc.nextInt();

        if (szam % 2 == 0) {
            System.out.println("Páros");
        } else {
            System.out.println("Páratlan");
        }
    }

    private static void f10() {
        f00(40, '*', "09 RUHA");   // Fejléc 
        System.out.print("Hány fok van: ");
        int t = sc.nextInt();

        if (t < 10) {
            System.out.println("Kabátot vegyél fel!");
        } else if (t < 20) {
            System.out.println("Pulóvert vegyél fel!");
        } else if (t < 30) {
            System.out.println("Pólót vegyél fel!");
        } else {
            System.out.println("Fürdőruhát vegyél fel!");
        }
    }

    private static void f11() {
        f00(40, '*', "09 ELETKOR");   // Fejléc 
        System.out.print("Hány éves? ");
        int t = sc.nextInt();

        if (t < 18) {
            System.out.println("tanuló");
        } else if (t < 65) {
            System.out.println("dolgozó");
        } else {
            System.out.println("nyugdíjas");
        }
    }

    public static void main(String[] args) {
        f01();
        f02();
        f03();
        f04();
        f05();
        f06();
        f07();
        f08();
        f09();
        f10();
        f11();
    }
}
