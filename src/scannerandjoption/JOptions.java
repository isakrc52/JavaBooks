package scannerandjoption;

import javax.swing.*;

public class JOptions {
    public static void main(String[] args) {
     String sayi=   JOptionPane.showInputDialog("BİR SAYI GİRİNİZ!!");

     int sayi2=Integer.parseInt(sayi);

     //yukarıdaki işlemde soutta sayi2 yi yazdırmak istediğimzde önce ekrana değer girilyr akabinde işlem tesis
        //ediliyor

        JOptionPane.showMessageDialog(null,"Bilgilendirme Mesajı");//Parent component tanımlanmadığından null
        //değer atyruz
        JOptionPane.showMessageDialog(null,sayi2,"SONUÇ",JOptionPane.WARNING_MESSAGE);



    }
}
