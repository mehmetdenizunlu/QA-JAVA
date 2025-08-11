package Gün23;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HasSet {
    public static void main(String[] args) {
        int sayi = 5 ; // bir sayı tutar .
        int [] sayilar = new int[5]; // hafızada 5 rakam tutuyor.
        int [][] tablo = new int[3][4]; // 12 adet sayı tutuyor.

        // dinamik boyutlu diziler lazım.
        ArrayList<Integer> liste=new ArrayList<>(); // boyu eklendikçe artan dinamik dizi.
        ArrayList< ArrayList<Integer> > listelerinListesi=new ArrayList<>(); // dinamik 2 boyutlu

        // Bana artık elemanları gelişigüzel miktarınca tutan değil, aynı elemanları tutmayan,
        // yani 1 elemandan sadece 1 tane olan dizler lazım.hangi sırada oldugunun bir önemi yok
        // bunlara SET denir :  LINKEDHASHSET(eklenme sırasına göre), TREESET(ordered-sıralı) , HASHSET(hızlı)

        HashSet <Integer> hs1 = new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        hs1.add(4);
        hs1.add(5);
        boolean eklendiMi = hs1.add(5);
        System.out.println("Eklendimi : " + eklendiMi);
        System.out.println("hs1 : " + hs1);
    }
}
