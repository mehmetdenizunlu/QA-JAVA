package Gün05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve soyadını alarak ekrana yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Adınızı ve Soy Adınızı giriniz : ");
        String nameAndSurname = scan.nextLine();
        System.out.println("Adınız ve Soyadınız : " + nameAndSurname);
    }
}
