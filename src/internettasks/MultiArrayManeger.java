package internettasks;

import java.text.DecimalFormat;
import java.util.Random;

public class MultiArrayManeger {

        ///---> Değişken Tanımlaması <---\\\
        private int vizeNotu,finalNotu;
        private double notOrtalamasi; ///---> Vize notunun %40 ile Final notunun %60'ı alınarak hesaplanacak.
        private String harfNotu,ayrac = "-------------";
        ///---> Random Oluşacak Notlar İçin Tanımlama <---\\\
        private Random random = new Random();
        ///---> Dizi Tanımlaması <---\\\
        private String ogrIsimleri [] = {"Metehan","Ömer","Mustafa","Enes","Mert","İhsan","Oktay","Emre"}; ///--->  8 elemanı bulunan tek boyutlu bir dizi.
        private Object ogrBilgileri [][] = new Object [ogrIsimleri.length][5]; /// ---> Çok boyutlu dizimizin 8 Satır 5 Sütundan oluşmasını istiyoruz.
        ///---> Metot Tanımlamaları <---\\\
        private String  getHarfNotu(double notOrtalamasi){
            if(notOrtalamasi >= 88 && notOrtalamasi <= 100)
                return "AA";
            else if(notOrtalamasi >= 77 && notOrtalamasi < 88)
                return "BA";
            else if(notOrtalamasi >= 66 && notOrtalamasi < 77)
                return "BB";
            else if(notOrtalamasi >= 55 && notOrtalamasi < 66)
                return "CB";
            else if(notOrtalamasi >= 44 && notOrtalamasi < 55)
                return "CC";
            else if(notOrtalamasi >= 33 && notOrtalamasi < 44)
                return "DC";
            else
                return "FF";
        }
        protected  void createArray(){
            for(int i=0; i < ogrIsimleri.length; i++){
                vizeNotu = random.nextInt(100)+1;
                finalNotu = random.nextInt(100)+1;
                notOrtalamasi = (vizeNotu*0.4)+(finalNotu*0.6);
                ogrBilgileri[i][0] =ogrIsimleri[i] ;
                ogrBilgileri[i][1] = vizeNotu;
                ogrBilgileri[i][2] = finalNotu;
                ogrBilgileri[i][3] = new DecimalFormat("##.##").format(notOrtalamasi);
                ogrBilgileri[i][4] = getHarfNotu(notOrtalamasi);
            }
        }
        protected  void getArray(){
            if(ogrBilgileri[0][0] != null){
                System.out.println(ayrac+"\n< Öğrenci Not Bilgileri >\n"+ayrac);
                System.out.print("Öğrenci İsmi\t\tVize Notu\t\tFinal Notu\t\tNot Ortalaması\t\tHarf Notu\n"+ayrac+"\n");
                for(int i = 0 ; i < ogrIsimleri.length ; i++)
                    System.out.println(ogrBilgileri[i][0]+"\t\t\t\t"+ogrBilgileri[i][1]+"\t\t\t\t"+ogrBilgileri[i][2]+"\t\t\t\t"+ogrBilgileri[i][3]+"\t\t\t\t"+ogrBilgileri[i][4]);
                System.out.println(ayrac);
            }
            else
                System.out.println(ayrac+"\n-> Lütfen öncelikle diziyi oluşturun.\n"+ayrac);
        }
}
