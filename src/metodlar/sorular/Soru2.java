package metodlar.sorular;

import java.util.Scanner;

public class Soru2 {

    //kullanıcıdan girilen sayıya göre a harflerinden içi boş diktrgen yapmak

    public static void main(String[] args) {

        int sayi;
        System.out.println("Sayi Giriniz :");
        Scanner giris = new Scanner(System.in);
       // sayi =4; i=sütun, j ler satır
        sayi = giris.nextInt();
        for(int i=0;i<sayi;i++)
        {

            if(i==0 || i ==sayi-1)
                for(int j=0;j<sayi+1;j++)
                    System.out.print("*");
            else
            {
                for(int j=0;j<sayi;j++)
                {
                    if(j==0 || j==sayi-1)
                        System.out.print("*");
                    else
                        System.out.print("");
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
