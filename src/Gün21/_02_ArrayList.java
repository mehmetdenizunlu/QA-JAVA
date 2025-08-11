package Gün21;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_ArrayList {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz

        ArrayList<Integer> notlar = new ArrayList<>();
        String devamMiTamamMi = " ";

       do {
           Scanner scanInt = new Scanner(System.in);
           Scanner scanStr = new Scanner(System.in);
           System.out.println("Öğrencinin notunu giriniz");
           int not = scanInt.nextInt();
           notlar.add(not);
           System.out.println("Devam etmek istiyorsanız E bitirmek istiyorsanız H ye basınız. ");
           devamMiTamamMi = scanStr.next().toUpperCase();
       } while (devamMiTamamMi.equals("E")) ;

        System.out.println("Öğrencilerin notları : " + notlar);
        System.out.println("Öğrencininlerim Not Ortalaması : " + ortalamaBul(notlar));
        System.out.println("Gecen sayısı : " + gecenSayısı(notlar,ortalamaBul(notlar)));

    }

    public  static int ortalamaBul (ArrayList <Integer> notlar) {
        int toplam = 0;
        for (int i = 0; i <notlar.size() ; i++) {
            toplam = toplam+ notlar.get(i);
        }
        int ortalama = toplam/notlar.size();
        return  ortalama;
    }

    public static int gecenSayısı (ArrayList<Integer> notlar , int ortalama) {
        int sayac = 0;
        for (int i = 0; i <notlar.size() ; i++) {
            if (notlar.get(i)>=ortalama) {
                sayac++;
            }

        }
        return sayac;
    }
}
