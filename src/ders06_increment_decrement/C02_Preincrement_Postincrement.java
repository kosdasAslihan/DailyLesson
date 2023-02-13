package ders06_increment_decrement;

public class C02_Preincrement_Postincrement {
    public static void main(String[] args) {

        int sayi=10;

        // sayi degerini olusturcagimiz b variable'ina atayalim
        // ve sonra sayi degerini 1 artiralim

        int b= sayi;
        sayi++;

        System.out.println(b); // 10
        System.out.println(sayi); // 11

        // bnun tek satirda yapabilir miyiz?
        // sayi degerini olusturacagimiz c variable'ina atayalim
        // ve sonra sayi degerini 1 artiralim

        sayi=11;
        int c= sayi++; // önce artirma yapılsın ++sayi; - artirma sonra yapilsin sayi++;
        System.out.println(c); // 11
        System.out.println(sayi); // 12

        sayi=11;
        c= ++sayi;
        System.out.println(c); // 12
        System.out.println(sayi); // 12

    }
}
