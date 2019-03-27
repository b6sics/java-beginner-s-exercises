package java20190206;

import java.util.Scanner;
import java.util.Random;

public class Java20190206 {

    private static final Scanner SC = new Scanner(System.in, ("Cp1250"));

    private static void f00(int hossz, char jel, String name) {
        System.out.print(jel + "| ");
        System.out.print(name + " |");
        for (int ii = name.length() - 5; ii < hossz; ii++) {
            System.out.print(jel);
        }
        System.out.println("");
    }

    private static void f01(String cimke) {
        f00(60, '*', cimke);
        int pont = 0;
        int db = 0;
        int legkisebb = 301;
        int legnagyobb = 0;
        int dobas;
        while (pont != 301) {
            db++;
            System.out.println("Pont: " + pont);
            System.out.print(db + ". dobás: ");
            dobas = SC.nextInt();
            if (pont + dobas <= 301) {
                pont += dobas;
                if (dobas > legnagyobb) {
                    legnagyobb = dobas;
                }
                if (dobas < legkisebb) {
                    legkisebb = dobas;
                }
            }
        }
        System.out.println("Nyertél!");
        System.out.println("A dobások száma: " + db);
        System.out.println("A legnagyobb dobás: " + legnagyobb);
        System.out.println("A legkisebb dobás: " + legkisebb);
        System.out.println(" ");
    }

    private static void f02(String cimke, int n) {
        f00(60, '*', cimke);

        System.out.print(n + " osztói: ");
        for (int ii = 1; ii <= n; ii++) {
            if (n % ii == 0) {
                System.out.print(ii + " ");
            }
        }
        System.out.println("\n");
    }

    private static void f03(String cimke) {
        f00(60, '*', cimke);

        System.out.print("Az induló összeg: ");
        double osszeg = SC.nextDouble();
        System.out.print("Kamat százalék: ");
        double kamat = SC.nextDouble() / 100;
        System.out.print("A betét éve: ");
        int ev1 = SC.nextInt();
        System.out.print("A kivét éve: ");
        int ev2 = SC.nextInt();
        f00(60, '-', "=");
        for (int ii = ev1 + 1; ii <= ev2; ii++) {
            osszeg += osszeg * kamat;
            System.out.println(ii + " " + Math.round(osszeg));
        }
        System.out.println("A kapott összeg: " + Math.round(osszeg) + "\n");
    }

    private static void f04(String cimke, int kezdete, int vege) {
        f00(60, '*', cimke);

        for (int ii = kezdete; ii <= vege; ii += 2) {
            System.out.print(ii + " ");
        }
        System.out.println("\n");
    }

    private static void f05(String cimke) {
        f00(60, '*', cimke);

        System.out.print("Az induló egyenleg: ");
        int egyenleg = SC.nextInt();
        int kivet;
        while (egyenleg > 4) {
            System.out.print("Kivét: ");
            kivet = SC.nextInt();
            if (kivet > 0) {
                if (kivet % 5 == 0 && kivet < egyenleg) {
                    egyenleg -= kivet + 1;
                    System.out.println("Új egyenleg: " + egyenleg);
                } else {
                    System.out.println("Sikertelen művelet!");
                }
            } else {
                break;
            }
        }
        System.out.println("Tranzakció befejeződött!\n");
    }

    private static void f06(String cimke, int dobasszam) {
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

    private static void f07(String cimke) {
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

    private static void f08(String cimke, int also, int felso) {
        f00(60, '*', cimke);

        Random veletlen = new Random();
        int szam = veletlen.nextInt(felso - also + 1) + also;
        System.out.println(" " + szam + "\n");
    }

    public static void main(String[] args) {
        f00(60, '*', "START JAVA 2019feb06");
        f01("17 Ciklusok 4 - Darts játék");
        f02("18 Ciklusok 5 - a FOR ciklus ('n' osztói)", 54);
        f03("18 Ciklusok 5 - kamatos kamat");
        f04("18 Ciklusok 5 - számok kettesével", 100, 120);
        f05("19 Automata - HF");
        f06("20 Véletlen - fej vagy írás", 10);
        f07("20 Véletlen - kockajáték");
        f08("20 Véletlen - 20 és 99 között", 20, 99);
        f00(60, '*', "END JAVA 2019feb06");
    }

}
