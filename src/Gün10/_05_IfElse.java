package Gün10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
        // hayır yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cümle giriniz. ");
        String text = scan.nextLine();


        if (text.length() >10 && text.contains("study")){
            System.out.println("Evet");
        }else {
            System.out.println("Hayır");
        }
    }
}
