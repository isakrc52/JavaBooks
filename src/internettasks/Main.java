package internettasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ///---> Değişken Tanımlaması <---\\\
        String ayrac = "------";
        int diziSatiri,diziSutunu,deger,ciftSayi=0,tekSayi=0,ciftToplam=0,tekToplam=0,genelToplam=0;
        int diziAdi [][]; //---> Kullanıcıdan alacağım değere göre dizinin tanımlamasını gerçekleştireceğim.
        ///---> Scanner Sınıfının Tanımlanamsı <---\\\
        Scanner scanner = new Scanner(System.in);
        System.out.println(ayrac+"\n< Java İki Boyutlu Dizi Örnekleri >\n"+ayrac);
        System.out.print("-> Oluşturacağınız dizinin satır sayısı: ");
        diziSatiri = scanner.nextInt();
        System.out.print("-> Oluşturacağınız dizinin sütun sayısı: ");
        diziSutunu = scanner.nextInt();
        System.out.println(ayrac);
        diziAdi = new int[diziSatiri][diziSutunu];
        for(int i=0; i< diziSatiri ;i++){
            for(int k=0; k< diziSutunu; k++){
                System.out.print("-> ["+i+"]["+k+"] matris elemanını girin: ");
                deger = scanner.nextInt();
                genelToplam += deger;
                if(deger % 2 == 0){
                    ciftSayi += 1;
                    ciftToplam += deger;
                }
                else {
                    tekSayi += 1;
                    tekToplam += deger;
                }
            }
        }
        System.out.println(ayrac+"\n-> Dizi değerlerinin toplamı: "+genelToplam +"\n"+ayrac+"\n-> Toplam çift sayı adeti: "+ciftSayi +"\n-> Çift sayıların toplamı: "+ciftToplam+"\n"+ayrac+"\n-> Toplam tek sayı adeti: "+tekSayi+"\n-> Tek sayıların toplamı: "+tekToplam+"\n"+ayrac);
    }
    }

