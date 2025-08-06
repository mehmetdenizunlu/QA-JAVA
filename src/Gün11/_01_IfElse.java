package Gün11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz


        Scanner scan  =new Scanner(System.in);
        System.out.println("Aralarında bir boşluk olucak şekilde iki sayı giriniz.");
        String sayi = scan.nextLine();
        int boslukIndex = sayi.indexOf(" ");

        String ilkSayi = sayi.substring(0,boslukIndex);
        String sonSayi = sayi.substring(boslukIndex+1);

        int ilkSayiInteger = Integer.valueOf(ilkSayi);
        int sonSayiInteger = Integer.valueOf(sonSayi);

        if (ilkSayiInteger == sonSayiInteger) {
            System.out.println("Sayilar eşit");
        }else {
            System.out.println("Sayilar eşit değil");
        }
    }
}
