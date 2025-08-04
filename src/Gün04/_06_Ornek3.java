package Gün04;

public class _06_Ornek3 {
    public static void main(String[] args) {
        // Kişinin ağırlığını double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)

        double agirlik = 108.5;
        int boy = 190;

        System.out.println("Boyunuz :" + boy + " " + "Kilonuz :" + agirlik);

        double kitleIndex1 = (agirlik/(boy*boy));
        int kitleIndex2 = (int) agirlik/(boy*boy) ;
        System.out.println("Vucut Kitle İndexiniz : " + kitleIndex1);
        System.out.println(kitleIndex2);

    }
}
