package Gün26._03_Ornek;

public class Ornek3 {
    public static void main(String[] args) {
         /*
        1.Adım  :Musteri isimli (fields: name) isimli bir class tanımlayınız.
        2.Adım  :ElektrikHesabi isimli (fields : toplamTuketim(int), birimFiyat(double),
                 fatura(double))  class tanımlayınız
        3.Adım  :Musteri a bir ElektrikHesabi ekleyiniz.
        4.Adım  :1 tane müşteri oluşturunuz,
        5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
                 tuketimEkle olsun her verilen aylık rakamı toplayarak biriktirsin.
        6.Adım  :Ödenecek rakamı  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız, yazdırınız.

        ipucu : hesabı olşuturduktan sonra tuketimEkle metoduna 2,3 ay tüketim ekletiniz, faturayı
                ondan sonra toplam alarak çıkartınız  */

        Musteri m1 = new Musteri();
        m1.name ="Mehmet";
        ElektirikHesabi hesap = new ElektirikHesabi();
        m1.elektirikHesabi = hesap;
        m1.elektirikHesabi.tuketimEkle(100);
        m1.elektirikHesabi.tuketimEkle(200);
        m1.elektirikHesabi.tuketimEkle(150);

        System.out.println("musteri = " + m1.name);
        m1.elektirikHesabi.toplamTuketimiYaz();

        m1.elektirikHesabi.odenecekTutar();
    }
}
