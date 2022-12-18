package metodlar;

public class Soru4 {
    public static void main(String[] args) {

        //sütun ve sayi; sütun 14 sayi 4

        //int sayi=5;

        for (int i = 0; i <4; i++) {
            if (i==0 || i==3){
                for (int j = 1; j <14+1; j++) {
                    System.out.print("a");//buradan yukarısı alt ve üst sınırı yazdırdı
                }

            } else {
                for (int j = 0; j <14; j++) {

                    if (j==0|| j==14-1){
                        System.out.print("a");
                    }
                    else
                        //   System.out.print("");//olsada olur olmasada
                        System.out.print(" ");//bu satır olmazsa sadece iki a yazdırır
                    //alt ve üst satır haricindekiler için arada boşluğu burası verir

                }
            }
            System.out.println("");//bunun tersi nasıl yapılacak araştırılacak
        }
}}
