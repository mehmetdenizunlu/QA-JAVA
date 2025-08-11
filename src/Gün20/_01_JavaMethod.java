package Gün20;

public class _01_JavaMethod {
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya");
        merhabaYaz(); // giden yok dönen yok.
        toplamYaz(4,5); // giden var dönen yok.
        int enb1= Math.max(4,5); // giden 4 ve 5, dönen 5
        enbYaz(4,5);  //giden 4,5  dönen yok


      int enb = enbBul(4,5); // giden 4,5 dönen 5
        System.out.println("en büyük:" + enb);

    }

    public static void merhabaYaz () {
        System.out.println("Merhaba Dünya");
    }

    public static void toplamYaz(int a , int b) {
        int toplam = a+b;
        System.out.println("Toplam : " + toplam);
    }

    public static void enbYaz(int a , int b) {
        if (a>b) {
            System.out.println("en Büyük : " + a);
        } else {
            System.out.println("En büyük : " + b);
        }
    }

    public  static int enbBul (int a, int b) {
        int enb = a;
        if (a>b){
            enb=a;
        }else {
            enb=b;
        }

        return enb;
    }
}
