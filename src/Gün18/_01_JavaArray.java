package Gün18;

import java.util.Arrays;

public class _01_JavaArray {
    public static void main(String[] args) {
        // 100 elemanlı bir diziyi random (0-100 arası) doldurduktan sonra,
        // sadece tek elemanlarını bir başka diziye atayınız.

        int [] dizi = new int[100];
        int [] tekler = new int[100];

        for (int i = 0; i < dizi.length; i++) {
            int random = (int) (Math.random()*100);
            dizi[i]=random;
        }

        for (int i = 0; i < dizi.length ; i++) {

            if (dizi[i]% 2 == 1) {
                tekler[i] = dizi[i];
            }

        }

        System.out.println("tekler : " + Arrays.toString(tekler));
    }
}
