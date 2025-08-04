package Gün04;

public class _08_Ornek4 {
    public static void main(String[] args) {
        //short olarak atadığınız bir değeri stringe çevirerek
        // ekrana yazdırınız.

        short deger = 5;
        String donusum  = Short.toString(deger);

        System.out.println(donusum); // herhangi bir işlemde sayı olarak kullanılamaz
        // ekranda sayı gibi gözükse bile aslında o bir yazi
    }
}
