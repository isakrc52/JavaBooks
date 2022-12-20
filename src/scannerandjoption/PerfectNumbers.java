package scannerandjoption;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {

        /**  Klavyeden 2 sayı alın bu sayıları bir metoda parametre olarak atayın.

         * metod içinde alınan bu sayıların içindeki mükemmel sayıları bulun  */


        /*Scanner input=new Scanner(System.in);
        int x= input.nextInt();
        int y= input.nextInt();*/

      perfectNumber(6);
      System.out.println(perfectNumber(2,7));


    }

      static int perfectNumber(int x, int y) {
          int sum = 0;
          int perfect = 0;

              for (int i = x; i < y; i++) {
                  for (int j = 1; j < i; j++) {
                      if (i % j == 0) {
                          sum += j;
                      }
                      if (i==sum){
                          perfect=i;
                      }
                  }
              }
          return perfect;
      }

      static void perfectNumber(int x){

        int sum=0;
          for (int i = 1; i <x; i++) {

              if (x%i==0){
                  sum+=i;
              }
          }
          if (sum==x){
              System.out.println(x+" bir mükemmel sayıdır");
          }
          else
          {System.out.println(x+" bir mükemmel sayı değildir");}
      }
}
