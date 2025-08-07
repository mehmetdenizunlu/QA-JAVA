package Gün12;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.(switch kullanınız)

        Scanner scanInt = new Scanner(System.in);
        System.out.println("1. Sayıyı Giriniz");
        int sayi1 = scanInt.nextInt();
        System.out.println("2. Sayıyı Giriniz");
        int sayi2 = scanInt.nextInt();

        Scanner scanStr = new Scanner(System.in);
        System.out.println("Toplama için T \n Çıkartma için Ç \n Çarpma için P \n Bölme için B harfini seçiniz ");
        String islemHarf = scanStr.nextLine().toUpperCase();

        switch (islemHarf) {
            case "T" :
                System.out.println("Toplama : " + (sayi1+sayi2));break;
            case "Ç" :
                System.out.println("Çıkartma : " +(sayi1-sayi2)); break;
            case "P" :
                System.out.println("Çarpma : " + (sayi1*sayi2)); break;
            case "B"  :
                System.out.println("Bölme  :" + (sayi1/sayi2));break;
            default:
                System.out.println("Hatalı Kodlama Yaptınız");break;

        }
    }
}
