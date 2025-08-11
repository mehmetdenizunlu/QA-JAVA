package Gün21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _03_ArrayLis {
    public static void main(String[] args) {
        // ArrayList Collection grubunun bir elemanı
        // Array i sıralatırken Arrays.sort u kullandığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.

        ArrayList <Integer> rakamlar = new ArrayList<>();
        rakamlar.add(10);
        rakamlar.add(100);
        rakamlar.add(456);
        rakamlar.add(30);
        rakamlar.add(20);


        System.out.println("Rakamların ilk hali : " + rakamlar);

        //Sırala işlemleri
        Collections.sort(rakamlar);
        System.out.println("Rakamlar.sort : " + rakamlar);

        // tersine çevir
        Collections.reverse(rakamlar);
        System.out.println("Terse çevrilmiş hali : " +rakamlar);

        // max min

        System.out.println("rakamların en min : " + Collections.min(rakamlar));
        System.out.println("rakamların en max : " + Collections.max(rakamlar));

        Collections.fill(rakamlar,0); // Listenin büyün elemanlarına verilen değer ile değiştirir
        System.out.println(rakamlar);

        //Liste içindeki verilen değerlerin hepsini yeni veri ile değiştir.
        Collections.replaceAll(rakamlar,0,2) ;
        System.out.println("Rakamlar replaceAll : " + rakamlar );
    }
}
