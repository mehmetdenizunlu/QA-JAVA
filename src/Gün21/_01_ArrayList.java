package Gün21;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        // array : Boyut sayısının belli olduğu durumlardaki veriler için kullanılır
        int [] dizi = new int[5];// Array 5 elemanlı boyutu sonradan değiştirelimiyor.

        // ArrayList : Boyutu dinamik olarak değişebilen, yani eleman eklendikçe
        // artan, sildikçe azalan Array.

        ArrayList <Integer> integerList = new ArrayList<>();
        ArrayList <Boolean> booleanList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();

        // String ArrayList tanımlayalım

        ArrayList <String> isimler = new ArrayList<>();
        isimler.add("Mehmet") ;  // ekleme yaptık uzunluğu 1 oldu
        isimler.add("Büşra") ; // ekleme yaptık uzunluğu 2 oldu
        isimler.add("Kaya");
        isimler.add("Kaya"); // hep sonuna ekliyor.

        System.out.println("isimler : " + isimler); // hızlı yazdırma yöntemi .
        System.out.println("isimler.length : " + isimler.size()); // arraydeki length e karşılık gelir

        isimler.add(1,"Deniz") ; // 1. indexe yerleştirir içerisindekiler bir sona doğru kayar
        System.out.println("isimler yeni hali : " + isimler);

        int elemanSayisi=isimler.size(); // dizideki eleman sayısını verir
        System.out.println("elemanSayisi = " + elemanSayisi);

        isimler.remove("Mehmet") ; // mehmet ismini sildi.
        System.out.println("isimlerden mehmet silindikten sonraki hali : " + isimler);

        isimler.remove(1); // verilen indexe göre silme yapar .
        System.out.println("indexe göre silme yaptıktan sonra  isimler :  " + isimler);

        int indexOfKaya = isimler.indexOf("Kaya"); // verilen elemanın indexini verir.
        System.out.println("elemanın indexi : " + indexOfKaya);

        for (int i = 0; i <isimler.size() ; i++) {
            System.out.println("isim elemanları : " + isimler.get(i));// belli bir indexteki eleanı get ile alıyoruz.

        }

        isimler.clear();// tüm list boşaltıldı. ilk hale geldi.

        System.out.println("son isimler hali : " + isimler); // boş dizi haline geir.

     }
}
