package Gün06;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        // Girilen bir ad soyadı "Ismet Temur"  I.T.  şeklinde yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Adınızı Giriniz : ");
        String name = scan.nextLine();
        System.out.println("Soyadınızı Giriniz");
        String surName = scan.nextLine();

        char nameFirstChar = name.toUpperCase().charAt(0);
        char surnameFirstChar= surName.toUpperCase().charAt(0);

        System.out.println("Girilen adınız ve soyadınız : " + name + " " + surName + " " + "Baş Harfler : " + nameFirstChar + "." + surnameFirstChar);



    }
}
