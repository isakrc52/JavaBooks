package scannerandjoption;

import javax.swing.*;
import java.util.Random;

public class JOptions2 {
    public static void main(String[] args) {

        Random rnd=new Random();

        int sayac=1;
        int sayi= rnd.nextInt(10);

        while (true){

            String tahmin = JOptionPane.showInputDialog("Bir Sayı Griniz");
            int t=Integer.parseInt(tahmin);

            if (sayi==t){
                String mesaj="Tebrikler Tahmininiz "+sayac+".denemede eşleşti";
                JOptionPane.showMessageDialog(null,mesaj);
                break;
            }else
                sayac++;
        }


    }
}
