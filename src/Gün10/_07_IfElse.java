package Gün10;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner scan = new Scanner(System.in);
        System.out.println("Password giriniz");
        String password = scan.nextLine();


        if (password.length()>= 8 && !password.contains("pass") && password.length()<=12) {
            System.out.println("Password Başarılı Şekilde Kaydedildi.");
        } else {
            System.out.println("Geçersiz Şifre Girildi.");
        }

    }
}
