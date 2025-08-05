package Gün06;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        // Girilen bir stringin sadece son Harfini yazdırınız.
        //   Merhaba  -> length : 7
        //   0123456
        // yani Length -1 i bana son harfin index ini verir

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cümle giriniz : ");
        String girilenKelime = scan.nextLine();
        int sonHarfIndex = girilenKelime.length()-1;
        System.out.println("Son Harf : " + girilenKelime.charAt(sonHarfIndex));
    }
}
