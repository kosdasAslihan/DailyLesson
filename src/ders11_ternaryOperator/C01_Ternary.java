package ders11_ternaryOperator;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        //1-Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        // "sayi 5'in tam kati" yazdirin. Bolunemiyorsa "5'in tam kati degil" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();

        System.out.println(girilenSayi%5==0 ? "Sayi 5'in tam kati" :"5'in kati degil");
    }
}
