package scannerandjoption;

import java.util.Scanner;

public class WhileScannerIfBreak {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int sum=0;
        int sayac=0;
        while (true){
            System.out.println("pozitif bir sayı giriniz");
            int x= input.nextInt();
            sayac++;

            if (x>0){
                sum+=x;
            }else
                break;
        }
        System.err.printf("%d.sayıda negatif bir değer girdiniz. Buraya kadar olan pozitif sayıların toplamı:%d",
                sayac,sum);
    }
}
