package Gün17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // Bu gun hava cok guzel -> 5

        Scanner scan =new Scanner(System.in);
        System.out.print("Bir Cümle Giriniz : ");
        String text = scan.nextLine();
        int boslukSayisi = 1;

        for (int i = 0; i < text.length() ; i++) {

            if (text.charAt(i) == ' ') {
                boslukSayisi++;
            }
        }

        System.out.println(boslukSayisi);
    }
}
