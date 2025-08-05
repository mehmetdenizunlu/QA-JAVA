package Gün06;

public class _07_StringContains {
    public static void main(String[] args) {
        // bir stringin içinde karakter(lerin) var olup olmadıgını soyler
        // boolean cinsinden true veya false döndürür

        String kelime = "Merhaba Dünya";
        boolean varMi= kelime.contains("M");
        System.out.println("var mı? : " + varMi);

        System.out.println("varMi = " + kelime.contains("f"));
        System.out.println("varMi = " + kelime.contains("ya"));
        System.out.println("varMi = " + kelime.contains("Dünya"));

    }
}
