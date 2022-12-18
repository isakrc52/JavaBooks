package exaptions;

import java.util.Arrays;
import java.util.Scanner;
public class Task1 {


    public static class NotNumberException extends Exception {
        public NotNumberException (){
           super("girilen değer harf dışında bir değer olamaz");
        }

    }
    public static void main(String[] args) {

        //krakterleri tek tek alıp bir diziye atan  ve sadece harfleri kabul eden
        //karakter ve rakam girildiğinde hata olarak algılayan ve bu hatayı, çağrıldığı yerde
        //kontrol eden Exception türünün kodunu yazın

        char str []=new char[6];
        String check="ABCDEFGĞHJKLMNOÖPRSŞTUÜVYZIİQXW";

          try {
              for (int i = 0; i < str.length; i++) {
              Scanner input=new Scanner(System.in);
              System.out.println("bir harf giriniz");
              str [i]=input.next().toUpperCase().charAt(0);
                  if ((Arrays.binarySearch(check.toCharArray(),str[i]))<0){
                      throw new NotNumberException();
                  }
              }
          }catch (NotNumberException ex){
              System.err.println("hata:"+ex.getMessage());
          }
        System.out.println(Arrays.toString(str));
        }
}





