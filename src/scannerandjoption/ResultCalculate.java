package scannerandjoption;

import javax.swing.*;

public class ResultCalculate {
    public static void main(String[] args) {

        String num1 = JOptionPane.showInputDialog(null, "ilk sayıyı giriniz");
        String num2 = JOptionPane.showInputDialog(null, "ikinci sayıyı giriniz");
        JOptionPane.showMessageDialog(null,sum(num1,num2),"TOPLAM",JOptionPane.PLAIN_MESSAGE);


    }

    static String sum(String s1,String s2){
        int x=Integer.parseInt(s1);
        int y=Integer.parseInt(s2);
        int sum=0;
        if (x>y){
        for (int i = y; i <=x; i++) {
            sum+=i;
        }
        }else{
            for (int i = x; i <=y; i++) {
                sum+=i;
            }
    }
       String mesaj= String.format("%d sayısı ile %d sayısı arasındaki sayıların toplamı=%d",x,y,sum);
    return mesaj;

    }
}
