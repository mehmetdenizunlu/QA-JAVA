package Gün17;

public class _03_JavaArray {
    public static void main(String[] args) {
        // 100 Elemanlı bir diziyi random olarak 100 e kadar olan sayılarla doldurunuz.
        // Sonrasında en büyük elemanı ve indexini bulunuz.

        int [] dizi  =new int[100];
        int enb = dizi[0];
        for (int i = 0; i < dizi.length ; i++) {
            int random = (int) (Math.random()*100) ;
            dizi[i]=random;
        }

        for (int i = 0; i < dizi.length ; i++) {
            if (enb<dizi[i]){
                enb = dizi[i];
            }

        }

        System.out.println("Dizideki en büyük sayı :" + enb);
    }
}
