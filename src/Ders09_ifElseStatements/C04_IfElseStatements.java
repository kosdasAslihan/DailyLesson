package Ders09_ifElseStatements;

import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {
        // 2- Kullanicinin kilo (kg) ve boyunu (cm) isteyip vucut kitle endeksini hesaplayın (kilo*10000/ (boy*boy))
        // vucut kitle endeksi 30'dan buyukse obez, 23-30 arasi ise  kilolu,
        //20-25 arasi ise normal, 20'den kucukse zayif yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen agirliginizi kilo olarak girin");
        double agirlik= scan.nextDouble();

        System.out.println("lutfen boyunuzu cm olarak girin");
        double boy= scan.nextDouble();

        double vke= agirlik*10000 / (boy*boy);

        System.out.println("Vucut kitle endeksiniz : " + vke);
        if (vke>=30) System.out.println("Obez");
        else if (vke>=25) System.out.println("Kilolu");
        else if (vke>=20) System.out.println("Normal");
        else System.out.println("Zayif");
    }

}
