package metodlar.sorular;

public class Soru3 {
    public static void main(String[] args) {

        //sütun ve sayi; sütun 14 sayi 4

        int sayi=5;

        for (int i = 0; i <sayi; i++) {//burdaki dizgi satur sayıyısını tayin eder
            if (i==0 || i==sayi-1){
                for (int j = 1; j <sayi+1; j++) {//burasıda söz konusu satırdaki sütünları belirler
                    System.out.print("a");//buradan yukarısı alt ve üst sınırı yazdırdı
                }

            } else {
                for (int j = 0; j < sayi; j++) {

                    if (j==0|| j==sayi-1){
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

    }
}
