package exaptions;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static class NotNumberException2 extends Exception{

        public NotNumberException2 (){

            super("girilen değer harf haricinde bir değer olamaz");
        }
    }

    public static void main(String[] args) {

        char str[]=new char[4];

        Scanner input=new Scanner(System.in);

        try {
            for (int i = 0; i <4 ; i++)  {
                System.err.println("bir harf giriniz");
                str[i]=input.next().toUpperCase().charAt(0);
                if (!Character.isAlphabetic(str[i])){
                    throw new Task3.NotNumberException2();
                }
            }
        }catch (Task3.NotNumberException2 e){
            System.err.println(e.getMessage());
        }

    }
}
