package exaptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6KlavyedenUyumsuzDegerEx {

    public static void main(String[] args) throws InputMismatchException{
        Scanner input=new Scanner(System.in);
        System.out.println("klavyeden bir değer giriniz");
        char c = input.next().charAt(0);
try {
    while (Character.isDigit(c)){

        if (Character.isDigit(c)==false){
            throw new InputMismatchException();
        }
        c=  input.next().charAt(0);

    }
}catch (InputMismatchException e){
    System.err.println(e.getStackTrace());
}
//burada neden hata yönetimni yapamadığımızı bul



    }
}
