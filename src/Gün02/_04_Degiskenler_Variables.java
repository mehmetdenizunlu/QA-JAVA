package Gün02;

public class _04_Degiskenler_Variables {
    public static void main(String[] args) {
        int sayi; // int miktarınca alan kaplayan tam sayı tipi
        int saYi; // yukarıdaki variable ile farklidır değişken ismi değişiyor

        sayi =5; // sayi variablesine 5 değeri atandı
        saYi = 10;
        System.out.println("sayi="); // output olarak sadece sayi= yazar
        System.out.println(sayi); // output olarak sayi variablesine atadığımız değişkeni verir
        System.out.println("sayi = " + sayi); // output olarak sayi = değişkene verilen değer basar.

        sayi=7; // sayi değeri 5 iken yeni değer 7 oldu
        System.out.println("sayi yeni değer = " + sayi);

        int shortSide = 5;
        int longSide = 7;
        int area= shortSide*longSide;

        System.out.println("Alanın metrekaresi = " + area);

    }
}
