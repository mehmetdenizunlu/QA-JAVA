import java.util.Arrays;

public class _02_JavaArray {
    public static void main(String[] args) {
        int[] dizi = new int[100];
        int teklerSayac = 0;

        // Diziyi doldur
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100);
        }

        // Tek sayıları say
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 1) {
                teklerSayac++;
            }
        }

        // Tekler dizisini oluştur
        int[] teklerDizi = new int[teklerSayac];
        int j = 0; // ayrı sayaç
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 1) {
                teklerDizi[j] = dizi[i];
                j++;
            }
        }

        System.out.println("Dizinin kendisi : " + Arrays.toString(dizi));
        System.out.println("Tekler dizisi   : " + Arrays.toString(teklerDizi));
    }
}
