package Gün03;

public class _05_Ornek2 {
    public static void main(String[] args) {
        // Ornek Soru : yarıcapı(r) verilen bir dairenin cevresini ve alanını bulunuz
        // alan= pi*r*r    cevre = 2*pi*r      pi=3.14

        int r=5;
        double pi = 3.14;
        double daireCevre = 2*pi*r;
        double daireAlan = pi*r*r;

        System.out.println("Çevresi = " + daireCevre);
        System.out.println("Alanı = " + daireAlan);

    }
}
