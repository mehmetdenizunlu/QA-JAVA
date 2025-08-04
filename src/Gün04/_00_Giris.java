package Gün04;

public class _00_Giris {
    public static void main(String[] args) {
        byte ogrNote1 = 55;
        int notToplam = ogrNote1; // byte türünü int turune atamıs oldum

      ogrNote1 = (byte)notToplam; // int turunu byte turune donustururken
        // bunu bılerek yaptığımızı belirtmemiz gerekir.Bunu atanan degıskenın
        // basına esıtlenen değişkeni tipi
        // parantez arasında yazılarak yapılır.

        // NOT : Daha büyük boyutlu değişkene daha küçük boyut ataması yapabiliriz fakat daha küçük boyutluya daha büyük boyutlu değer atarken
        // tür dönüşümü yapmamız gerekir bilerek atıyorum kabul ediyorum anlamında . Yukarıda bunun örneğini görmekteyiz.
    }
}
