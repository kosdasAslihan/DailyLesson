package Ders10_nestedIfElseStatements;

import java.util.Scanner;

public class C01_ifElseCozumu {
    public static void main(String[] args) {
        /*
        Kullanicidan cinsiyetini ve yasini alin, kadin 60 yas uzeri, erkek 65 yas uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak "Emekli olabilirsin" veya
        "Emekli olmak icin .. yil daha calisman gerekir" yazidirin.
      */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz");
        String cinsiyet= scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        double yas= scan.nextDouble();

        if (yas<0 || yas>90){
            System.out.println("Girilen yas gecersiz");
        } else if (!(cinsiyet.equalsIgnoreCase("Kadin") ||
        cinsiyet.equalsIgnoreCase("Erkek"))) {
            System.out.println("Girilen cinsiyet gecersiz");
        } else if (cinsiyet.equalsIgnoreCase("Kadin") && yas>=60) {
            System.out.println("Emekli olabilirsin");

        } else if (cinsiyet.equalsIgnoreCase("Kadin") && yas<60) {
            System.out.println("Emekli olmak icin "+(60-yas) +" yil daha calisman gerekir");

        } else if (cinsiyet.equalsIgnoreCase("Erkek") && yas>=65) {
            System.out.println("Emekli olabilir");

        } else if (cinsiyet.equalsIgnoreCase("Erkek") && yas<65) {
            System.out.println("Emekli olmak icin "+ (65-yas) +" yil daha calisman gerekir");

        }

    }
}
