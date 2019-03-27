package java20190227;

import java.util.Scanner;

/**
 *
 * @author KjG
 */
public class Java20190227 {

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

    private static long szorzat(int m, int n) {
        if (n - m > 1) {
            return m * szorzat(m + 1, n);
        } else {
            return m * n;
        }
    }

    private static void f01(String label) {
        f00(60, '-', label);
        System.out.println("5-ös lottó:\t" + szorzat(86, 90) / szorzat(1, 5));
        System.out.println("6-os lottó:\t" + szorzat(40, 45) / szorzat(1, 6));
        System.out.println("Skandináv:\t" + szorzat(29, 35) / szorzat(1, 7));
        System.out.println("");
    }

    private static void kiir(int n) {
        if (n > 0) {
            kiir(n - 1);
            System.out.println(n);
        }
    }

    private static void kiir2(int n) {
        if (n > 0) {
            System.out.println(n);
            kiir2(n - 1);
        }
    }

    private static void f02(String label, int n) {
        f00(60, '-', label);
        f00(60, '-', "A");
        kiir(n);
        f00(60, '-', "B");
        kiir2(n);
        System.out.println("");
    }

    private static void f03(String label, String s0) {
        f00(60, '-', label);
        String s;
        if (s0.equals("")) {
            System.out.print("Szöveg: ");
            s = SC.nextLine();
        } else {
            s = s0;
            System.out.println("Szöveg: " + s);
        }

        for (int ii = 0; ii < s.length(); ii++) {
            System.out.print(s.charAt(ii) + " ");
        }
        System.out.println("\n");
    }

    private static void f04(String label, String s) {
        f00(60, '-', label);
        for (int ii = s.length() - 1; ii >= 0; ii--) {
            System.out.println(s.substring(ii));
        }
        System.out.println("");
    }

    private static void f05(String label, String s, int start, int end) {
        f00(60, '-', label);
        System.out.println(s.substring(start, end));
        System.out.println("");
    }

    private static void kiir(String s) {
        final String MH = "AÁEÉIÍOÓÖŐUÚÜŰ";
        for (int ii = 0; ii < s.length(); ii++) {
            char c = s.charAt(ii);
            System.out.print(c);
            if (MH.indexOf(c) > -1) {
                System.out.print("V" + c);
            }
        }
    }

    private static void f06(String label, String s0) {
        f00(60, '-', label);
        String mit;
        if (s0.equals("")) {
            f00(60, '-', label);
            System.out.print("Szöveg: ");
            mit = SC.nextLine().toUpperCase();
        } else {
            mit = s0;
            System.out.println("Szöveg: " + mit);
            mit = mit.toUpperCase();
        }
        kiir(mit);
        System.out.println("\n");
    }

    private static void f07(String label) {
        f00(60, '-', label);
        String mit;
        while (true) {
            System.out.print("Szöveg: ");
            mit = SC.nextLine().toUpperCase();
            if (mit.isEmpty()) {
                break;
            }
            kiir(mit);
            System.out.println("");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        f00(60, '*', "STARTofJAVA 2019feb27");
        f00(60, '-', "");

        f01("25 - Metódusok 4. Lottó variációk száma:");
        f02("25 - Metódusok 4. Rekurzió", 8);

        f03("26 Stringek 1 - Széthúz", "klhsdafkjhlakfdsh");
        f04("26 Stringek 1 - Vakáció", "vakáció");
        f05("26 Stringek 1 - Európa Bajnokság", "Európa Bajnokság", 7, 10);

        f06("27 Stringek 2 - Tuvudsz 1", "Kőműves Kelemen");
        f07("27 Stringek 2 - Tuvudsz 2");

        f00(60, '-', "");
        f00(60, '*', "ENDofJAVA   2019feb27");
    }

}
