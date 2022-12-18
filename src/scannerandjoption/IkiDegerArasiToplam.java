package scannerandjoption;

import java.util.Scanner;

public class IkiDegerArasiToplam {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz");
        int x=input.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int y= input.nextInt();
        int toplam=0;

        for (int i = x; i <y+1; i++) {
            toplam+=i;
        }
        System.err.printf("%d ve %d arasındaki sayıların toplamı=%d, ortalamaları=%d",
                x,y,toplam,(toplam/Math.abs(x-y)));
    }

}
