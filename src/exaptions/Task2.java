package exaptions;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner giris=new Scanner(System.in);
        String metin;
        System.out.println("Lütfen bir metin giriniz:");
        metin=giris.nextLine();
        String dizi[]=new String[6];
        for(int i=0;i<6;i++){
            String harf=metin.substring(i, i+1);
            dizi[i]=harf;
        }

        /*for(int a=0;a<metin.length();a++){
            System.out.println("dizi["+a+"]="+dizi[a]);
        }*/

    }
}
