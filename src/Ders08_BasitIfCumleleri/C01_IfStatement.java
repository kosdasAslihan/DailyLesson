package Ders08_BasitIfCumleleri;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {
        // 1-Kullanicidan bir sayı isteyin,
        // sayiyi kontrol edip 5 ile bolunebiliyorsa "Sayi 5'in tam kati" yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int girilenSayi= scan.nextInt();

        if (girilenSayi%5 == 0){
            System.out.println("Girilen sayi 5'in tam kati");
        }
    }
}
