package Ders07_Concatenation_Operators;

public class C01_Concatenation {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        System.out.println("verilen iki degerin toplamı : "+(a+b));

        // girilen 10 ve 20 sayilarinin toplami : 30

        System.out.println("girilen "+ a + " ve " + b + " sayilarin toplami : " + (a+b));

        System.out.println("sayilarin toplami : " + a + b); // parantez olmadigi icin
                                                            // sayilarin toplamı 1020


    }
}
