package Gün04;

public class _05_Ornek2 {
    public static void main(String[] args) {
        // 1 tane double ve 1 tane short değişken tanımlayınız,
        // değer atayınız, sonra double değişkeni short değişkene çevirerek,
        // bütün değerleri ekrana yazdırınız.

        double sayi1= 3.2;
        short sayi2 = 5;
        System.out.println("İlk sayı 1 değeri : " + sayi1);

        sayi1 = (short) sayi2;

        System.out.println("Atama yapıldıktan sonra sayı değeri :" + sayi1);
        System.out.println("sayı 2 değeri :" + sayi2);



    }
}
