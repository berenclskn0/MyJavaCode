public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Sabiha Gokcen Havalimanina Hosgeldiniz");

        String sartlar = "Yurtdisi Cikis Kurallari\n"
                + "Herhangi bir siyasi yasaginizin bulunmamasi gerekiyor.\n"
                + "500 TL harc bedelini yatirmis olmaniz gerekiyor.\n"
                + "Gideceginiz ulkeye vizenizin bulanmasi gerekiyor.";

        String msg = "Yurtdisi sartlarindan hepsini saglamaniz gerekiyor.";

        while (true){

            System.out.println("****************************");
            System.out.println(sartlar);
            System.out.println("****************************");

            Yolcu yolcu1 = new Yolcu();

            System.out.println("Harc bedeli kontrol ediliyor...");

            Thread.sleep(3000);

            if(!yolcu1.yurtDisiHarciKontrol()){

                System.out.println(msg);
                continue;
            }

            System.out.println("Siyasi yasak kontrol ediliyor");

            Thread.sleep(3000);

            if(!yolcu1.siyasiYasakKontrol()){

                System.out.println(msg);
                continue;
            }

            System.out.println("Vize durumu kontrol ediliyor");

            Thread.sleep(3000);

            if(!yolcu1.vizeDurumuKontrol()){

                System.out.println(msg);
                continue;
            }

            Thread.sleep(3000);
            System.out.println("Islemleriniz tamamlandi. Yurtdisina cikabilirsiniz");
            break;
        }
    }
}
