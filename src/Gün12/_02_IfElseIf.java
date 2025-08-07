package Gün12;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner scan  = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz : ");
        int sayi1 = scan.nextInt();
        System.out.println("2. sayıyı giriniz : ");
        int sayi2 = scan.nextInt();


        Scanner strScan = new Scanner(System.in);
        System.out.println("İşlem yapmak istediğiniz harfi giriniz. ");
        String islemHarf = strScan.nextLine().toUpperCase();

        if (islemHarf.equals("T")){
            System.out.println("Toplama : " + (sayi1+sayi2));
        } else if (islemHarf.equals("Ç")) {
            System.out.println("Çıkartma  : " + (sayi1-sayi2) );

        } else if (islemHarf.equals("P")) {
            System.out.println("Çarpma : " + (sayi1*sayi2));

        } else if (islemHarf.equals("B")) {
            System.out.println("Bölme : " + (sayi1/sayi2));
        }else {
            System.out.println("Geçerli İşlem Harfi Girilmedi");
        }

    }
}
