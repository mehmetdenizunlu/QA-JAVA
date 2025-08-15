package Gün26._03_Ornek;

public class ElektirikHesabi {
   int toplamTuketim=0;
   double birimFiyat=0.7;
   double fatura;


   public void tuketimEkle(int tuketim) {
       toplamTuketim = toplamTuketim+tuketim;
   }

   public void toplamTuketimiYaz() {
       System.out.println("Toplam Tuketiminiz : " + toplamTuketim);
   }

   public void odenecekTutar () {
      fatura = toplamTuketim*birimFiyat;
       System.out.println("Ödenecek Tutar : " + fatura);
   }
}
