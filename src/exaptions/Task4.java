package exaptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {

    public static class NotDigitException extends Exception{

        public NotDigitException(){

            System.err.println("klavyeden girilen değer rakam dışında bir değer olamaz");
        }
    }
    /**
    Klavyeden tek tek değer alan ve bu değer sayı olduğunda
     çalışmaya devam eden sayı dışında bir karekter olduğunda
     önce hata mesajı yayınlayıp daha sonrasında sonlanan uygulamanın
     kodlarını yazın
    **/

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("bir rakam giriniz");



try {
    while (Character.isDigit(input.next().charAt(0))){

        if (Character.isDigit(input.next().charAt(0))==false) {
            throw new NotDigitException();
        }
    }

}catch ( NotDigitException e){
    System.err.println("girilen değer rakam dışında bir değer olamaz:"+e.getMessage());

}




}
}
