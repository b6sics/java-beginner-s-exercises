package java20190306;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author t1
 */
public class Java20190306 {

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

    static boolean vizsgalat(String s) {
        int bal = 0;
        int jobb = s.length() - 1;

        while (bal < jobb) {
            if (s.charAt(bal) != s.charAt(jobb)) {
                return false;
            }
            bal++;
            jobb--;
        }
        return true;
    }

    private static void f01(String label, String s0) {
        f00(60, '-', label);
        String be;
        if (s0.equals("")) {
            System.out.print("Szöveg: ");
            be = SC.nextLine().toUpperCase().replace(" ", "");
            System.out.print("Átalakítva: " + be);
        } else {
            be = s0.toUpperCase().replace(" ", "");
            System.out.println("Átalakítva: " + be);
        }

        if (vizsgalat(be)) {
            System.out.println("Palindróma!");
        } else {
            System.out.println("Nem palindróma.");
        }

        System.out.println("");
    }

    private static void f02(String label) {
        String kar = "abcdefghijklmnopqrstuvwxyz";
        kar += kar.toUpperCase();
        kar += "0123456789_()";
        f00(60, '-', label);
        Random vg = new Random();
        int vel;
        String jelszo;

        for (int ii = 0; ii < 5; ii++) {
            jelszo = "";
            for (int jj = 0; jj < 16; jj++) {
                vel = vg.nextInt(kar.length());
                jelszo += kar.charAt(vel);
            }
            System.out.println(jelszo);
        }
        System.out.println("");
    }

    private static void f03(String label) {
        f00(60, '-', label);
        for (int ii = 33; ii < 128; ii++) {
            System.out.print((char) ii + " ");
            if ((ii - 32) % 20 == 0) {
                System.out.println("");
            }
        }
        System.out.println("");

        String mh = "íöüóőéáúű";
        mh += mh.toUpperCase();

        for (int ii = 0; ii < mh.length(); ii++) {
            char c = mh.charAt(ii);
            System.out.println(c + " " + (int) c);
        }

        System.out.println("");
    }

    static double szamol(String s) {
        int db = 0;
        int osszeg = 0;
        char c;
        for (int ii = 0; ii < s.length(); ii++) {
            c = s.charAt(ii);
            if (c >= '1' && c <= '5') {
                db++;
                osszeg += (int) c - (int) '0';
            }
        }
        if (db > 0) {
            return (double) osszeg / db;
        } else {
            return 0;
        }
    }

    private static void f04(String label, String s0) {
        f00(60, '-', label);
        String be;

        while (true) {
            System.out.print("Osztályzatok: ");
            be = SC.nextLine();
            if (be.equals(" ")) {
                be = s0;
            }
            if (be.equals("")) {
                break;
            }
            System.out.printf("Átlag: %.2f\n", szamol(be));
        }

        System.out.println("");
    }

    static private String ABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    static String atalakit(String s) {
        String uj = "";
        char c;
        for (int ii = 0; ii < s.length(); ii++) {
            c = s.charAt(ii);
            switch (c) {
                case 'Á':
                    c = 'A';
                    break;
                case 'É':
                    c = 'E';
                    break;
                case 'Í':
                    c = 'I';
                    break;
                case 'Ó':
                case 'Ö':
                case 'Ő':
                    c = 'O';
                    break;
                case 'Ú':
                case 'Ü':
                case 'Ű':
                    c = 'U';
                    break;
            }
            if (ABC.indexOf(c) > -1) {
                uj += c;
            }
        }
        return uj;
    }

    static String kodol(String s) {
        String uj = "";
        char c;
        int n;
        for (int ii = 0; ii < s.length(); ii++) {
            c = s.charAt(ii);
            n = ABC.indexOf(c);
            uj += ABC.charAt(ABC.length() - 1 - n);

        }
        return uj;
    }

    private static void f05(String label, String s0) {
        f00(60, '-', label);
        String be;
        while (true) {
            System.out.print("Nyílt szöveg: ");
            be = SC.nextLine();
            if (be.equals(" ")) {
                be = s0;
                System.out.print(be);
            }
            System.out.println("\n");
            if (be.equals("")) {
                break;
            }
            String at = atalakit(be.toUpperCase());
            System.out.println("Átalakítva: " + at);
            String kodolt = kodol(at);
            System.out.println("Kódolva: " + kodolt);
        }

        System.out.println("");
    }

    private static void f06(String label) {
        f00(60, '-', label);

        System.out.println("");
    }

    public static void main(String[] args) {
        f00(60, '*', "STARTofJAVA 2019mar06");
        f00(60, '-', "");

        f01("28 Stringek 3 - Palindróma", "Indul a görög aludni");
        f02("28 Stringek 3 - Erős jelszó");

        f03("29 Stringek 4 - Karaktertábla");
        f04("29 Stringek 4 - Átlag", "1 2 5 4 3 7");

        f05("30 Stringek 5 - Titkosírás", "Pogánysuli");

        f00(60, '-', "");
        f00(60, '*', "ENDofJAVA   2019mar06");
    }

}
