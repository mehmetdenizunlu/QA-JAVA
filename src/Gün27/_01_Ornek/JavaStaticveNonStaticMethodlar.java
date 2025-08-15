package Gün27._01_Ornek;

public class JavaStaticveNonStaticMethodlar {
    public static void main(String[] args) {
        // Eğer elimizde bir integer sayi değeri olsaydı bunu Stringe ve tekrar int e çevirmeyi aşağıdaki gibi yapardık.
        int sayi = 345;
        String strRakam = String.valueOf(sayi);
        int intRakam = Integer.parseInt(strRakam);

        // Eğer kendi methoduzu yazıp çevrim yapmak isteseydik, Utility dosyasında 1. yöntem olarak methodu koyuyorum.

        //Class canlardıma yapmam gerek new ile

        Utility util = new Utility();
        util.getString(sayi);
        util.getInteger(strRakam); // iki methoduda kullandık.

        // 2. yöntem ise static ile method yazmak . Utilityde bulunuyor


        Utility.getString2(sayi);
        Utility.getInteger2(strRakam); // new yapmadan direk Utility classından
                                       // methoda ulaşabildim.Static farklarından biri.


    }
}
