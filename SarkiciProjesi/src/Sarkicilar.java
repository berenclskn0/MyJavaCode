import java.util.ArrayList;

public class Sarkicilar {
    private ArrayList<String> sarkici_listesi = new ArrayList<String>();

    public void sarkicilari_bastir(){

        if(sarkici_listesi.isEmpty()){
            System.out.println("Sarkici listesi bos...");
        }

        else{
            System.out.println("Sarkici listesinde " + sarkici_listesi.size() + " kadar sarkici var");

            for(int i = 0 ; i < sarkici_listesi.size() ; i++){
                System.out.println((i + 1) + ". Sarkici: " + sarkici_listesi.get(i));
            }
        }
    }

    public void sarkici_ekle(String isim){
        sarkici_listesi.add(isim);

        System.out.println("Sarkici Listesi Guncellendi...");
    }

    public void sarkici_guncelle(String yeni_isim, int pozisyon){

        if(pozisyon >= 0 && pozisyon < sarkici_listesi.size()){

            sarkici_listesi.set(pozisyon, yeni_isim);

            System.out.println("Sarkici listesi guncellendi...");
        }

        else {
            System.out.println("Gecersiz pozisyon. Lutfen tekrar deneyin");
        }
    }

    public void sarkici_sil(int pozisyon){

        if(pozisyon >= 0 && pozisyon < sarkici_listesi.size()){
            String isim = sarkici_listesi.get(pozisyon);

            sarkici_listesi.remove(pozisyon);

            System.out.println(isim + " isimli sarkici listeden silindi.");
        }

        else{
            System.out.println("Gecersiz pozisyon. Lutfen tekrar deneyiniz.");
        }
    }

    public void sarkici_ara(String sarkici_ismi){

        int pozisyon = sarkici_listesi.indexOf(sarkici_ismi);

        if(pozisyon >= 0){
            System.out.println("Sarkici Bulundu");

            System.out.println(sarkici_ismi + " isimli sarkici " + (pozisyon + 1) + ". pozisyonda");
        }
        else{
            System.out.println("Sarkici Bulunamadi...");
        }
    }
}