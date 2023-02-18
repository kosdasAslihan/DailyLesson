package Ders10_nestedIfElseStatements;

import java.util.Scanner;

public class C02_NestedIfElseBirinciCozum {
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

        //once degiskenlerden birini ana degisken secelim
        //mesela cinsiyeti secelim ve ona göre ana yapiyi kuralim

        if (cinsiyet.equalsIgnoreCase("Kadin")){
            //kadin bolumu
            if (yas<0 || yas>90){
                System.out.println("yas girisi gecersiz");
            } else if (yas<60) {
                System.out.println("Emekli olamk icin "+(60-yas)+" yil daha calisman gerekir");
            }else {
                System.out.println("Emekli olabilirsin");
            }
        } else if (cinsiyet.equalsIgnoreCase("Erkek")) {
            //erkek bolumu
            if (yas<0 || yas>90){
                System.out.println("yas girisi gecersiz");
            } else if (yas<65) {
                System.out.println("Emekli olamk icin "+(65-yas)+" yil daha calisman gerekir");
            }else {
                System.out.println("Emekli olabilirsin");
            }
        }else {
            System.out.println("Cinsiyet girisi hatali");
        }
    }
}
