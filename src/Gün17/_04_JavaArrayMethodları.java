package Gün17;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _04_JavaArrayMethodları {
    public static void main(String[] args) {
        // Arrays.toString(dizi) -> diziyi string olarak direk yazdırır
        String [] isimler= {"Zehra","Ahmet", "Mehmet" , "Hasan" , "Osman"};
        System.out.println("Dizinin Yazılma hali : " + Arrays.toString(isimler));

        // Arrays.sort(isimler) -> diziyi sıralar
        Arrays.sort(isimler);
        System.out.println(".sort : " + Arrays.toString(isimler));

        // Diziler eşitmi ?  Arrays.equals(dizi1,dizi2)

        int [] a = {1,3,4,5,6,7} ;
        int [] b = {3,5,6};
        int [] c = {3,5,6};

        System.out.println("a ile b eşit mi : " + Arrays.equals(a,b));
        System.out.println("a ile c eşit mi : " + Arrays.equals(a,c));
        System.out.println("b ile c eşit mi : " + Arrays.equals(b,c));

        // Arrays.fill-> bütün kutucuklara 7 atar;
        Arrays.fill(c, 7);
        System.out.println("c = " + Arrays.toString(c));

        //Arrays.binarySearch(rakamlar, 5)   -> Sıralı dizide aranan elemanın indexi verir
        // aranan elaman birden fazla ise herhangi birini verebilir.
        // esas amacı var mı yok mu kontrolü, var ise indexini verir, yok ise negatif sayı döndürür
        int[] rakamlar={2,7,4,6,5,5,5};
        System.out.println("rakamlar = " + Arrays.binarySearch(rakamlar, 5));
        Arrays.sort(rakamlar);
        System.out.println(Arrays.toString(rakamlar));
        System.out.println("rakamlar = " + Arrays.binarySearch(rakamlar, 5));



    }
}
