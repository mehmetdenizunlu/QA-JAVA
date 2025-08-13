package Gün25._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        // Ogretmen için not defteri programı yapılma isteniyor.
        // Her ogrencının okulNo(int), tamAdi(String) ve notu(int) vardır.
        // Öğretmenden 20 öğrenci için bu bilgileri alınız.
        // bütün öğrencileri bir metodda yazdırınız.
        // sınıfın not ortalamasını yine bir metodda yazdırınız.
        // gerekli Class(lar) için ayrı dosya açınız

      ArrayList<Ogrenciler> snf = new ArrayList<>();

        Scanner scanStr = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);

        for (int i = 0; i < 3 ; i++) {
            Ogrenciler ogr = new Ogrenciler();
            System.out.print("okul no : " );
            ogr.schoolNo = scanInt.nextInt();
            System.out.print("ad : ");
            ogr.fullName = scanStr.nextLine();
            System.out.print("not : ");
            ogr.not = scanInt.nextInt();

            snf.add(ogr);

        }

        yaz(snf);
        System.out.println(ortalama(snf));


    }

    public static void yaz(ArrayList<Ogrenciler> snf) {
        for (Ogrenciler ogr : snf) {
            System.out.print("adı : " + ogr.fullName);
            System.out.println();
            System.out.print("okul no : " + ogr.schoolNo);
            System.out.println();
            System.out.println("notu : " + ogr.not);
        }
    }

    public static int ortalama(ArrayList<Ogrenciler>snf) {
        int toplam = 0;
        int ortalama = 0;
        for (Ogrenciler ogr : snf) {
            toplam=toplam+ogr.not;
        }
      return   ortalama=toplam/snf.size();

    }
}
