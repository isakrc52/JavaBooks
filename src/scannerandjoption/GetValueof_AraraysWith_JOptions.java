package scannerandjoption;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class GetValueof_AraraysWith_JOptions {
    public static void main(String[] args) {
        /** Bir dizi tanımlayın ve dizinin eleman sayısını yani legnthini Scanner ile klavyeden alın.
            Daha sonrasında dizinin elemanlarını JOption yardımıyla tanımlayın
         * */

        Scanner input=new Scanner(System.in);
        System.out.print("dizinin eleman sayısını giriniz!!");

       int x= input.nextInt();
        System.out.println(x);

        int[] sayi = new int[x];

        for (int i = 0; i < sayi.length; i++) {
       // String s=JOptionPane.showInputDialog("Bir Sayı Giriniz");

            sayi[i]=Integer.parseInt(JOptionPane.showInputDialog("BİR SAYI GİRİNİZ"));
        }
        JOptionPane.showMessageDialog(null, Arrays.toString(sayi),
                "Girmiş Olduğunuz Dizinin Elemeanları",JOptionPane.PLAIN_MESSAGE);

    }
}
