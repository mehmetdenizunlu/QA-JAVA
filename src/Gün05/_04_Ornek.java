package Gün05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve soyadını ayrı ayrı okutarak alıp
        // birlikte ekrana yazdırnız.

        Scanner scanName = new Scanner(System.in);
        System.out.print("Adınızı giriniz: ");
        String name = scanName.nextLine();
        Scanner scanSurName = new Scanner(System.in);
        System.out.print("Soy Adınızı Giriniz : " );
        String surName = scanSurName.nextLine();

        System.out.println("Adınız : " + name + " ,Soy Adınız : "+ surName);
    }
}
