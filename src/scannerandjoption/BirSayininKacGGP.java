package scannerandjoption;

import java.util.Arrays;
import java.util.Scanner;

public class BirSayininKacGGP {
    public static void main(String[] args) {

        System.out.print("Dizinin boyutu  : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] list = new int[n];
        int[] list2 = new int[n];

        for (int i = 0; i < list.length; i++) {
            System.out.print((i + 1) + ". Elemanı giriniz : ");
            list[i] = input.nextInt();
        }
           Arrays.sort(list);
        System.out.println("Dizi  : " + Arrays.toString(list));

        int repeatedNumber = 0;
        for (int r : list) {
            int a = 0;
            for (int j = 0; j < list.length; j++) {
                if (r == list2[j]) {
                    a++;
                }
            }

            if (a == 0) {
                int counter = 0;
                for (int i : list) {
                    if (r == i) {
                        counter++;
                    }
                }

                list2[repeatedNumber] = r;
                repeatedNumber++;
                System.out.println(r + " sayısından " + counter + " tane var ");
               }
             }
    }
}
