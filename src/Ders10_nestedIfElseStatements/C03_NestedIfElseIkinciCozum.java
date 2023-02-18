package Ders10_nestedIfElseStatements;

import java.util.Scanner;

public class C03_NestedIfElseIkinciCozum {
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
        //mesela yasi secelim ve ona göre ana yapiyi kuralim

        if (yas<0 || yas>90){
            System.out.println("Yas girisi gecersiz");
        } else if (yas<60) {
            //60 yastan kucuk bolumu
            if (cinsiyet.equalsIgnoreCase("Kadin")){
                System.out.println("Emekli olmak icin "+(60-yas)+" yil daha calisman gerekir");
            } else if (cinsiyet.equalsIgnoreCase("Erkek")) {
                System.out.println("Emekli olmak icin "+(65-yas)+" yil daha calisman gerekir");

            }else {
                System.out.println("Cinsiyet girisi gecersiz");
            }

        } else if (yas<65) {
            // 60-65 arasi
            if (cinsiyet.equalsIgnoreCase("Kadin")){
                System.out.println("Emekli olabilir");
            } else if (cinsiyet.equalsIgnoreCase("Erkek")) {
                System.out.println("Emekli olmak icin "+(65-yas)+" yil daha calisman gerekir");

            }else {
                System.out.println("Cinsiyet girisi gecersiz");
            }
        }else{
                //65-90 arasi
                if (cinsiyet.equalsIgnoreCase("Kadin")) {
                    System.out.println("Emekli olabilir");
                } else if (cinsiyet.equalsIgnoreCase("Erkek")) {
                    System.out.println("Emekli olabilir");

                } else {
                    System.out.println("Cinsiyet girisi gecersiz");
            }
        }
    }
}
