package exaptions;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

    public static class NotNumberException2 extends Exception{

        public NotNumberException2 (){

            super("girilen değer harf haricinde bir değer olamaz");
        }
    }

    public static void main(String[] args) throws NotNumberException2 {

                char [] check="ABCDEFGĞHJKLMNOÖPRSŞTUÜVYZIİQXW".toCharArray();

                char str[]=new char[4];

        Scanner input=new Scanner(System.in);

try {
    for (int i = 0; i <4 ; i++)  {
        System.err.println("bir harf giriniz");
        str[i]=input.next().toUpperCase().charAt(0);
        if (Arrays.binarySearch(check,str[i])<0){
            throw new NotNumberException2();
        }
    }
}catch (NotNumberException2 e){
    System.err.println(e.getMessage());
        }
}}







