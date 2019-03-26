package java20190109;

/**
 * @author kissjgabi
 */
public class Java20190109 {

    private static void f00(int n) {
        System.out.println("");
        for (int ii = 0; ii < n; ii++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    private static void f01() {
        System.out.println("01 Bevezetés");
        System.out.println("\tHelló világ");
        f00(25);
    }

    private static void f02() {
        int fokozat;
        double sebesseg;
        char szinkod;
        boolean metal;

        System.out.println("02 Változók");
        System.out.println("\tEz egy virtuális autó");

        fokozat = 4;
        sebesseg = 58.6;
        szinkod = 'R';
        metal = true;

        System.out.println("\tAz autó sebességfokozata: " + fokozat);
        System.out.println("\tAz autó pillanatnyi sebessége: " + sebesseg);
        System.out.println("\tAz autó színkódja: " + szinkod);
        System.out.println("\tAz autó metalfényű: " + metal);

        f00(25);
    }

    private static void f03() {

        int szam1 = 10;
        int szam2 = 20;
        int osszeg, kulonbseg;

        System.out.println("03 Műveletek 1");

        osszeg = szam1 + szam2;
        kulonbseg = szam1 - szam2;

        System.out.println("\tA számok összege: ");
        System.out.println("\t" + osszeg);

        System.out.print("\tA számok összege: ");
        System.out.println(osszeg);

        System.out.println("\tA számok összege: " + osszeg);
        System.out.println("\tA számok különbsége: " + kulonbseg);

        f00(25);
    }

    private static void f04() {
        int a = 10;

        System.out.println("03 Műveletek 2");

        System.out.println("\ta  : " + a);
        System.out.println("\ta++: " + a++);
        System.out.println("\ta  : " + a);

        a = 10;

        System.out.println("\ta  : " + a);
        System.out.println("\t++a: " + ++a);
        System.out.println("\ta  : " + a);

        f00(25);
    }

    private static void f05() {
        int szam1 = 10;
        int szam2 = 20;

        System.out.println("03 Műveletek 3");

        // kasztolás
        System.out.println("\tA számok hányadosa: " + (szam1 / (double) szam2));
        System.out.println("\tA maradék: " + (szam1 % szam2));
        System.out.println("\tA számok szorzata: " + (szam1 * szam2));

        f00(25);
    }

    private static void f06() {
        int szam1 = 10;
        int szam2 = 20;

        System.out.println("04 Metódusok");

        // kasztolás
        System.out.println("\tMath.min: " + Math.min(szam1, szam2));
        System.out.println("\tMath.sqrt: " + Math.sqrt((double) szam1));
        System.out.println("\tMath.PI: " + Math.PI);

        double r = 2.54;
        double ker = 2 * r * Math.PI;
        double ter = Math.pow(r, 2) * Math.PI;

        f00(25);

        System.out.println("Kör ");
        System.out.println("\tA kör sugara: " + r);
        System.out.println("\tA kör kerülete: " + Math.round(ker * 100) / 100.0);
        System.out.println("\tA kör területe: " + Math.round(ter * 100) / 100.0);

        f00(25);
    }

    public static void main(String[] args) {
        f00(25);    // 25db '*' egy sorban 
        f01();      // "Hello Világ!"
        f02();      // 02 Változók - virtuális autó
        f03();      // 03 Műveletek 1 - összeg/lülönbség
        f04();      // 03 Műveletek 2 - szorzat/hányados
        f05();      // 03 Műveletek 3 - kasztolás
        f06();      // 04 Metódusok - kör
    }

}
