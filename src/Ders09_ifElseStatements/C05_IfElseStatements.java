package Ders09_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {
        // 5-Kullanicidan bir tam sayi alin, sayi 3 ile bolunuyorsa "Uc ile bolunebilen sayi"
        // 5 ile bolunebiliyorsa "Bes ile bolunebilen sayi"
        // hem 3 hem 5 ile bolunebiliyorsa "super sayi" yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lufen bir tam sayi girin");
        int girilenSayi= scan.nextInt();

        if (girilenSayi%3==0 && girilenSayi%5==0){
            System.out.println("super sayi");
        } else if (girilenSayi%5==0){
            System.out.println("5'e bolunebilen sayi");
        } else if (girilenSayi%3==0) {
            System.out.println("3'e bolunebilen sayi");
        }
    }
}
