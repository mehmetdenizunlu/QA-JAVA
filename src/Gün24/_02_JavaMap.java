package Gün24;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {
        // Bir kartvizit uygulamasını 2 kişi için yapınız.
        Map <String,String> nKartvizit = new HashMap<>();
        nKartvizit.put("isim" , "Nazmiye");
        nKartvizit.put("email" , "nazmiye@gmail.com");
        nKartvizit.put("adres" , "Ankara");
        nKartvizit.put("telefon" , "3324235324324");


        System.out.println("nkartvizit.get(isim) : " + nKartvizit.get("isim"));
        System.out.println("nkartvizit.get(telefon) :" + nKartvizit.get("telefon"));

        Map <String,String> kKartvizit = new HashMap<>();
        kKartvizit.put("isim","Kadir");
        kKartvizit.put("email","kadir@gmail.com");
        kKartvizit.put("adres","Almanya");
        kKartvizit.put("telefon","56565656");

        Map<String,Map<String,String> > kartDefteri = new HashMap<>();
        kartDefteri.put("nazmiye" ,nKartvizit); // nazmiye ismine nkartvizit atandi.
        kartDefteri.put("Kadir" , kKartvizit) ;

        System.out.println(kartDefteri.get("nazmiye"));
        System.out.println(kartDefteri.get("Kadir"));
        System.out.println("Kadirin telefonu : " + kartDefteri.get("Kadir").get("telefon"));

        for (Map.Entry<String , Map<String,String>> kartvizit : kartDefteri.entrySet()){
            System.out.println(kartvizit);
        }
    }
}
