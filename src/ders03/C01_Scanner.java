package ders03;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {


        // kullanicidan ismini alip sonra da yazdiralim

        // 1. adim scanner objesi olustur


        Scanner scan = new Scanner(System.in);

        // 2. adim kullaniciya ne istedigimizi söyleyelim

        System.out.println("Lutfen isminizi giriniz");

        // 3. adim scan objesini kullanarak, kullanicidan bilgiyi alip
        // olusturacagımız uygun bir variable'a kaydedelim

        String kullaniciIsmi = scan.nextLine();
        // next metodu sadece ilk space'e kadar olan metni alirken
        // nextLine() tüm satiri alir

        System.out.println("Girilen kullanici ismi : " + kullaniciIsmi);
    }
}
