package Gün07;

public class _04_StringStartsWith {
    public static void main(String[] args) {
        // StartsWith : Bir stringin verilen string ile başlayıp başlamadığının
        // sonucunu boolean olark döner.

        String text = "HCL Teknoloji" ;

        System.out.println("HC ile başlıyor mu ? " + text.startsWith("HC")); // true
        System.out.println("HCL  ile başlıyor mu ? " + text.startsWith("HCL  ")); // boşlukta bir karakterdir iki boşluk verdirk false olucak
        System.out.println("Me ile baslıyormu = " + text.startsWith("Me")); // false
        System.out.println("M ile baslıyormu = " + text.startsWith("M")); //false
        System.out.println("h ile baslıyormu = " + text.startsWith("h")); // false  büyük küçük harf hassasiyeti vardır.
        System.out.println("hc ile baslıyormu = " + text.startsWith("hc")); // false
    }
}
