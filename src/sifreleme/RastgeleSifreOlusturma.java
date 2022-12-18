package sifreleme;

import java.util.Random;
import java.util.Scanner;

public class RastgeleSifreOlusturma {
    public static void main(String[] args)
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.print("Şifre kaç basamaklı olacak = ");
        int uzunluk = input.nextInt();

        System.out.println(kodkampusu_sifreolusturma(uzunluk));
    }
    static char[] kodkampusu_sifreolusturma(int uzunlukdegeri)
    {
        String karakterler = "QWERTYUIOPĞÜASDFGHJKLŞİZXCVBNMÖÇ"+
                "qwertyuıopğüasdfghjklşizxcvbnmöç"+
                "1234567890"+
                "₺€$£><$½[]()=?!/*-+,:.;@ß~%"+
                "‡‰ŠŒŽ‘'“”•–—˜™š›œžŸ¡¢£¤¥¦§¨©ª«¬­®¯"+
                "°±²³´µ¶·¸¹º»¼½¾¿ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏĞÑÒ"+
                "ÓÔÕÖ×ØÙÚÛÜİŞßàáâãäåæçèéêëìíîïğñòóôõö÷øùúûüışÿ";

        String deger = karakterler;

        char[] sifre = new char[uzunlukdegeri];

        for (int i=0; i < uzunlukdegeri; i++)
        {
            Random rastgelesifre = new Random();
            sifre[i] += deger.charAt(rastgelesifre.nextInt(deger.length()));
        }

        System.out.println("... LUTFEN BEKLEYİN ...");


        for( int gerisayim = 0 ; gerisayim <= 4 ; gerisayim++)
        {

            System.out.println("Şifreniz oluşturuluyor ... " + (4-gerisayim));

            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException  e)
            {
                System.out.println(e);
            }
        }

        System.out.print("Oluşturulan şifre = ");
        return sifre;
    }
}
