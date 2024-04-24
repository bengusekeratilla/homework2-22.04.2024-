//Restoranın menüsündeki yemekleri, fiyatlarını ve popülerlik derecelendirmelerini bir dizi ile tutan algoritma yazınız.

public class hw2 {
    public static void main(String[] args) {
        String[] yemekler = {"Cheeseburger ", "Dört Peynirli Pizza", "Izgara Tavuk Salata"};
        double[] fiyat = {270.00, 320.00, 250.00};
        double[] puan = {4.42, 4.89, 4.16};

        double enYuksekPuan = puan[0];
        String enYuksekPuanYemek = yemekler[0];

        for (int i = 0; i < yemekler.length; i++) {
            System.out.println(yemekler[i] + "-> Fiyatı: " + fiyat[i] + " TL" + " Puanı: " + puan[i]);
            if (puan[i] > enYuksekPuan) {
                enYuksekPuan = puan[i];
                enYuksekPuanYemek = yemekler[i];
            }
        }
        System.out.println("Menüdeki en popüler yemek: " + enYuksekPuan + " puan ile: " +enYuksekPuanYemek);
    }
}