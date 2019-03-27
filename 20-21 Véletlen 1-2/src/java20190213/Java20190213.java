package java20190213;

import java.util.Scanner;
import java.util.Random;

public class Java20190213 {

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

    private static void f01(String cimke, int dobasszam) {
        f00(60, '*', cimke);

        Random vel = new Random();
        int dobas;
        int fej = 0;
        int iras = 0;
        for (int ii = 1; ii <= dobasszam; ii++) {
            dobas = vel.nextInt(2);
            if (dobas == 0) {
                System.out.print(ii + ".fej ");
                fej++;
            } else {
                System.out.print(ii + ".írás ");
                iras++;
            }
        }
        System.out.println("\n" + fej + " fej és " + iras + " írás" + "\n");
    }

    private static void f02(String cimke) {
        f00(60, '*', cimke);

        Random kocka = new Random();
        int jatekos, gep;
        String valasz;
        do {
            jatekos = kocka.nextInt(6) + 1;
            System.out.println("A játékos dobása: " + jatekos);
            gep = kocka.nextInt(6) + 1;
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

    private static void f03(String cimke, int also, int felso) {
        f00(60, '*', cimke);

        Random veletlen = new Random();
        int szam = veletlen.nextInt(felso - also + 1) + also;
        System.out.println(" " + szam + "\n");
    }

    private static void f04(String cimke, int also, int felso) {
        f00(60, '*', cimke);

        Random veletlen = new Random();
        int tipp, lepes, szam;
        String valasz;
        do {
            szam = veletlen.nextInt(felso - also + 1) + also;
            lepes = 0;
            System.out.println("Gondoltam egy számot " + also + " és " + felso + " között.");
            System.out.println("Találd ki!");
            do {
                System.out.println("Tipp: ");
                tipp = SC.nextInt();
                lepes++;
                if (tipp < szam) {
                    System.out.println("Ennél nagyobb!");
                } else if (tipp > szam) {
                    System.out.println("Ennél kisebb!");
                }
            } while (tipp != szam);
            System.out.println("Gratulálok, eltaláltad " + lepes + " lépésben!");
            System.out.println("Még egy játék? (i/n)? ");
            SC.nextLine();
            valasz = SC.nextLine();
            if (valasz.length() == 0) {  // Ha csak Entert üt
                valasz = "i";
            }
        } while (valasz.charAt(0) != 'n');
    }

    public static void main(String[] args) {
        f00(60, '*', "STARTofJAVA 2019feb13");
        f00(60, '-', "");
        f01("20 Véletlen - fej vagy írás", 10);
        f02("20 Véletlen - kockajáték");
        f03("20 Véletlen - 20 és 99 között", 20, 99);
        f04("21 Véletlen - Számkitaláló játék", 1, 100);
        f04("21 Véletlen - Számkitaláló játék", 1, 1000);
        f00(60, '-', "");
        f00(60, '*', "ENDofJAVA   2019feb13");
    }

}
