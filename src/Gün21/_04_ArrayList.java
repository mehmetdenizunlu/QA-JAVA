package Gün21;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_ArrayList {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye atayarak
        // yazdırınız.

        ArrayList <Integer> sayilar = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Sayı : ");
            int sayi = scan.nextInt();
            sayilar.add(sayi);

        } while (sayilar.size()<6) ;

        System.out.println("Listenin ilk hali : " + sayilar);
        System.out.println("Tek sayıların Listesi : " + tekSayilar(sayilar));
    }

    public  static ArrayList<Integer> tekSayilar (ArrayList <Integer> sayilar) {
        ArrayList <Integer> tekler = new ArrayList<>();
        for (int i = 0; i <sayilar.size() ; i++) {
            if (sayilar.get(i) % 2 == 1) {
                tekler.add(sayilar.get(i));
            }

        }

        return tekler;
    }
}
