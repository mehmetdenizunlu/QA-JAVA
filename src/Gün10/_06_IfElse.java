package Gün10;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
        // hayır yazdırınız.
        // bu soruyu büyük küçük harf girilsede doğru çalışacak şekilde çözünüz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cümle giriniz. ");
        String text = scan.nextLine().toLowerCase();
        System.out.println(text);


        if (text.length() >10 && text.contains("study")){
            System.out.println("Evet");
        }else {
            System.out.println("Hayır");
        }

    }
}
