//Bir mağazanın günlük satış miktarını, ürün adı ve fiyatını bir dizi olarak tutan ve toplam satış gelirini hesaplayan bir algoritma yazınız.

public class hw1 {
    public static void main(String[] args) {
        String[] urunAdi = {"Ekran Koruyucu", "Mouse", "Şarj Aleti"};
        double[] fiyat = {220.95, 500, 890.75};
        int[] satisMiktari = {20, 12, 6};
        double toplam = 0;

        for (int i = 0; i < urunAdi.length; i++) {
            System.out.println(urunAdi[i] + " isimli üründen gün içerisinde " + satisMiktari[i] + " adet satılmıştır.");
            System.out.println("Toplam satış tutarı: " + (fiyat[i] * satisMiktari[i])+ "TL'dir.");
        }
        System.out.println("-------");
    }
}