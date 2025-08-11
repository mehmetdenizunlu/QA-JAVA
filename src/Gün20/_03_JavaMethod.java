package Gün20;

public class _03_JavaMethod {
    public static void main(String[] args) {
        String tamAd  = topla("Mehmet" , "Ünlü") ;
        System.out.println(tamAd);
        int toplam = topla(10,20); // aynı isim fakat parametre tipleri farklı oldugun karısmaz.
        System.out.println(toplam);
    }

    public static String topla(String name , String surName) {
        return name + " " + surName ;
    }

    public static int topla (int a , int b) {
        return a+b;
    }
}
