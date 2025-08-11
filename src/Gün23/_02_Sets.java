package Gün23;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {
        // SETS : HashSet (hızlı),
        // LinkedHashSet(ekleme sırası göre sıralı),
        // TreeSet(herzaman sıralı)

        // Hızlı çalışmak için keni özel algoritma sırasına göre saklar

        HashSet <String> hs = new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("üc");
        hs.add("dört");
        hs.add("bes");

        System.out.println("hs : " + hs);


        // Eklenme sırasına göre elemanlarını tutuyor

        LinkedHashSet <String> lhs = new LinkedHashSet<>();
        lhs.add("iki");
        lhs.add("bir");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("bes");
        System.out.println("lhs = " + lhs); //lhs = [iki, bir, üç, dört, bes]

        //Alfabetik olarak sıralı tutar

        TreeSet<String> ths = new TreeSet<>();
        ths.add("iki");
        ths.add("bir");
        ths.add("üç");
        ths.add("dört");
        ths.add("bes");
        System.out.println("ths : " + ths);

        //sayısal sıraya göre sıralı tutuyor
        TreeSet<Integer> ts2=new TreeSet<>();
        ts2.add(5);
        ts2.add(89);
        ts2.add(3);
        ts2.add(17);
        ts2.add(1);
        System.out.println("ts2 = " + ts2); //ts2 = [1, 3, 5, 17, 89]
    }
}
