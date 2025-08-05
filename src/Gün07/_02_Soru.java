package Gün07;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // Girilen bir ad soyadın adını ve soyadını ayırıp, ayrı ayrı yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Adınızı ve Soyadınızı Giriniz");
        String name = scan.nextLine();
        int boslukIndex = name.indexOf(" ");
        System.out.println(boslukIndex);
        String ilkKisim = name.substring(0,boslukIndex);
        String ikinciKisim = name.substring(boslukIndex+1);


        System.out.println("Ad : " + ilkKisim);
        System.out.println("Soyad : " + ikinciKisim);
    }
}
