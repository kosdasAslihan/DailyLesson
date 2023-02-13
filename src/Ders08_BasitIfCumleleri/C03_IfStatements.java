package Ders08_BasitIfCumleleri;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {
        // 3- kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa "Uc ile bolunebilen sayi",
        // 5 ile boluenbiliyorsa "Bes ile bolunebilen sayi" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int girilenSayi= scan.nextInt();

        /*
        if cumlesinden sonra { } kullanilirsa
        if sarti saglandiginda suslu parantezin ici tamamen calistirilir
        sart saglanmazsa suslu parantezin ici hic calisitirilmaz

        ancak suslu parantez kullanilmazsa, java if body'si olarak
        if sartindan sonra ilk ; kadar olan kismi alir
        geriye kalan kodlar if cumlesiyle ilgili olmaz
         */

        if (girilenSayi % 3== 0){
            System.out.println("Uc ile bolunme kontrol sonucu olumlu");
            System.out.println("Uc ile bolunebilen sayi");
        }

        if (girilenSayi % 5 == 0){
            System.out.println("Bes ile bolunme kontrolu sonucu olumlu");
            System.out.println("Bes ile bolunebilen sayi");
        }

    }
}
