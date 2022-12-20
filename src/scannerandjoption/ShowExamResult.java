package scannerandjoption;

import javax.swing.*;

public class ShowExamResult {
    public static void main(String[] args) {



     int x= Integer.parseInt(JOptionPane.showInputDialog("Vize Notunu Giriniz"));
        if (x<0 || x>100){
            x= Integer.parseInt(JOptionPane.showInputDialog("Vize Notunu Giriniz"));
        }

     int y= Integer.parseInt(JOptionPane.showInputDialog("Final Notunu Giriniz"));

      if (y<0||y>100){
          y= Integer.parseInt(JOptionPane.showInputDialog("Final Notunu Giriniz"));
      }

      if (avarege(x,y)<50){

          JOptionPane.showMessageDialog(null,"dersi geçemediniz!");
      }
      else
          JOptionPane.showMessageDialog(null,"dersi geçtiniz tebrikler!");

      /**  PLAIN MESSAGE LI ÖRNEKTE STRİNG FORMAT GİBİ AÇIKLAMAMNIN SONUNA DEĞİŞKENİ VEREBİLRSUNUZ BKNZ AŞAĞIDAKİ ÖRNEK*/

        if (avarege(x,y)<50){

            JOptionPane.showMessageDialog(null,avarege(x,y),"maalesef dersi geçemediniz.ortalamanız:",JOptionPane.PLAIN_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null,avarege(x,y),"dersi geçtiniz tebrikler!ortalamanız:",JOptionPane.PLAIN_MESSAGE);

    }
    static double avarege(int x, int y){
      double mean = 0.3 * x+0.7*y;
        return mean;
    }

}
