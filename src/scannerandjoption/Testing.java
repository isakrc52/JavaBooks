package scannerandjoption;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {

        int [] sayi=new int[5];


        for (int i = 0; i < 5; i++) {
            int x=Integer.parseInt(JOptionPane.showInputDialog("Bir Sayı Giriniz"));
            sayi[i]=x;
        }
        JOptionPane.showMessageDialog(null, Arrays.toString(sayi),
                "Girmiş Olduğunuz Dizinin Elemeanları",JOptionPane.PLAIN_MESSAGE);

        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int x= input.nextInt();
        System.out.println(x);
    }
}
