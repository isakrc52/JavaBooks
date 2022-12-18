package scannerandjoption;

import java.util.Random;
import java.util.Scanner;

public class TahminNextint {
    public static void main(String[] args) {

        int sayac=0;

        Scanner input=new Scanner(System.in);
        Random rnd=new Random();
        int x= rnd.nextInt(10);

        while (true){
            System.err.println("bir ile 10 arasında bir sayı giriniz");
            if (input.nextInt()==x){
                System.out.println("tahmininiz doğru "+sayac+".nci tahminde bildiniz");
                break;
            }
            else
                sayac++;

        }
    }
}
