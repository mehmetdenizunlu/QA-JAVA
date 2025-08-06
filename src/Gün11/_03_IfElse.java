package Gün11;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        // Otopark ücretleri :
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç saat otoparkta kaldınız");
        int saat = scan.nextInt();
        
        if (saat>0 && saat<=3) {
            System.out.println("10 TL ücretiniz bulunmaktadır.");
        } else if (saat>3 && saat<=5) {
            System.out.println("15 TL ücretiniz bulunmaktadır.");
        } else if(saat>5){
            System.out.println("Ucretiniz 20 TL dir.");
        }else {
            System.out.println("Uygun saat girilmedi.");
        }

    }
}
