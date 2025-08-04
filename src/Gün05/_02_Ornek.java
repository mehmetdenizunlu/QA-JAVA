package Gün05;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {
        // Girilen bir adı ekrana yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Adınızı Giriniz");
       // String name = scan.next(); // tek kelimeli kısmını alır cümlenin tamamını almak için aşağıdakini yapmak gerek
        String name = scan.nextLine();

        System.out.println("Adınız : " + name);
    }
}
