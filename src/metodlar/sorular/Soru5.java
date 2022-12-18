package metodlar.sorular;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {

        System.out.print("Üç Harfli Bir İsim Giriniz:");
        Scanner input=new Scanner(System.in);
        String name= input.nextLine();

        if (name.indexOf(name.length())==2){
            if (name.substring(0,1)==name.substring(1,2)&& name.substring(0,1)==name.substring(2,3)){

                System.out.println("girilen isim unique'dir");
            }
            else {
                System.out.println("girilen ismin harfleri farklıdır");
            }
        }else {
            System.out.println("yanlış bir değer girdiniz");
        }

    }
}
