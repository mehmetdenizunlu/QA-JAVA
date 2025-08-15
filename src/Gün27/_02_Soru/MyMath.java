package Gün27._02_Soru;

public class MyMath {
    public static int getMin(int a, int b){
        return Math.min(a,b);
    }

    public static int getMax(int a, int b) {
        return Math.max(a,b);
    }

    public static double getPow(double a,double b) {
        return Math.pow(a,b);
    }

    public static int getRandom(int max,int min){
        int randomNumber = (int) (Math.random()*((max-min)+1)+min);
        return randomNumber;
    }

    public static int getAbs(int a) {
        return Math.abs(a);
    }

    public static int getDiziElemanlariniTopla(int[] dizi) {
        int toplam=0;
        for (int e : dizi) {
            toplam+=e;
        }
        return toplam;
    }
}
