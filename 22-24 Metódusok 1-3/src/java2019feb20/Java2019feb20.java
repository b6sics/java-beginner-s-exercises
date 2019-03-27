package java2019feb20;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author KjG
 */
public class Java2019feb20 {

    private static final Scanner SC = new Scanner(System.in, ("Cp1250"));

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
    // --- textdekoráció metódus vége

    private static void vonal(int db, char jel) {
        for (int ii = 0; ii < db; ii++) {
            System.out.print(jel);
        }
        System.out.println("");
    }

    private static double kob(double x) {
        return Math.pow(x, 3);
    }

    private static void f01(String label, int db, char jel) {
        f00(60, '-', label);
        vonal(db, jel);
    }

    private static void f02(String label, int first, int last) {
        f00(60, '.', label);

        for (int ii = first; ii <= last; ii++) {
            System.out.println(ii + "\t" + String.format("%10.2f", kob(ii)));
        }
        System.out.println("");
    }

    private static int dobas(int db) {
        Random kocka = new Random();
        int osszeg = 0;
        for (int ii = 0; ii < db; ii++) {
            osszeg += kocka.nextInt(6) + 1;
        }
        return osszeg;
    }

    private static void f03(String label, int db) {
        f00(60, '*', label);

        int jatekos, gep;
        String valasz;
        do {
            jatekos = dobas(db);
            System.out.println("A játékos dobása: " + jatekos);
            gep = dobas(db);
            System.out.println("A gép dobása: " + gep);
            if (jatekos > gep) {
                System.out.println("A játékos nyert!");
            } else if (jatekos < gep) {
                System.out.println("A gép nyert!");
            } else {
                System.out.println("Döntetlen!");
            }
            System.out.println("Még egy játék (i/n)? ");
            valasz = SC.nextLine();
            if (valasz.length() == 0) {  // Ha csak Entert üt
                valasz = "i";
            }
        } while (valasz.charAt(0) != 'n');
        System.out.println(" ");
    }

    private static double reciprok(double x) {
        double reciprok = 0;
        if (x != 0) {
            reciprok = 1 / x;
        }
        return reciprok;
    }

    private static void f04(String label, int first, int last) {
        f00(60, '-', label);

        for (int ii = first; ii <= last; ii++) {
            String str = ii + "\t";
            str += String.format("%10.8f", reciprok(ii));
            System.out.println(str);
        }
        System.out.println("");
    }

    private static int atszamol(int ora, int perc, int mp) {
        return ora * 3600 + perc * 60 + mp;
    }

    private static int beolvas(String s) {
        System.out.print(s + " (ó p mp): ");
        int o = SC.nextInt();
        int p = SC.nextInt();
        int mp = SC.nextInt();
        return atszamol(o, p, mp);
    }

    private static final int CSUCSDIJ = 30;
    private static final int DIJ = 15;

    private static void f05(String label) {
        f00(60, '-', label);

        System.out.println("Percdíj számítása");
        int ido1 = beolvas("A hívás eleje");
        int ido2 = beolvas("A hívás vége");
        int hossz = (int) Math.ceil((ido2 - ido1) / 60.0);
        System.out.println("Számlázott percek: " + hossz);
        if (ido1 > atszamol(7, 0, 0) && ido1 < atszamol(19, 0, 0)) {
            System.out.println("Fizetendő: " + hossz * CSUCSDIJ + " Ft");
        } else {
            System.out.println("Fizetendő: " + hossz * DIJ + " Ft");
        }
        System.out.println("");
    }

    private static int atvalt(int m, int cm) {
        return m * 1000 + cm * 10;
    }

    private static void f06(String label) {
        f00(60, '-', label);

        System.out.println("Hossz: ");
        System.out.print(" m: ");
        int m = SC.nextInt();
        System.out.print("cm: ");
        int cm = SC.nextInt();
        System.out.println(atvalt(m, cm) + " mm");

        System.out.println("");
    }

    public static void main(String[] args) {
        f00(60, '*', "STARTofJAVA 2019feb20 Metódusok");
        f00(60, '-', "");
        f01("22 Vonal készítés", 60, '-');
        vonal(40, '=');
        vonal(50, '*');
        f00(60, '-', "");
        f02("22 Visszaadott érték - számok köbei", 0, 9);
        f00(60, '-', "");
        f03("23 Kocka", 5);
        f00(60, '-', "");
        f04("23 Reciprok", 0, 10);
        f00(60, '-', "");
        f05("24 Percdíj");
        f00(60, '-', "");
        f06("24 Hossz");
        f00(60, '-', "");
        f00(60, '*', "ENDofJAVA   2019feb20");
    }

}
