package scannerandjoption;

import java.util.Scanner;

public class KlavyedenNotGirme {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.err.println("notunuzun ortalamasını giriniz");
        if (input.nextInt()<50){
            System.out.println("kaldınız !");
        }else {
            System.err.println("geçtiniz");
        }



    }
}
