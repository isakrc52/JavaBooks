package scannerandjoption;

import java.util.Scanner;

public class MultipleArraysNextInt {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int dizi[][]=new int[3][2];

        for (int i = 0; i <3; i++) {
            for (int j = 0; j <2 ; j++) {
                System.err.println("bir sayı giriniz");
                dizi[i][j]=input.nextInt();
            }
        }

        for (int i = 0; i <3; i++) {
            for (int j = 0; j <2; j++) {
                System.err.println("dizi ["+i+"]"+"["+j+"]="+dizi[i][j]);
               // System.err.printf("dizi [%d] [%d]=",dizi[i][j]); bu formatı bir nasuıl olur bak
            }
        }

    }
}
