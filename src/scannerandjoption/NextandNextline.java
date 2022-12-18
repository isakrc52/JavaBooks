package scannerandjoption;

import java.util.Scanner;

public class NextandNextline {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.err.println("Bir cümle giriniz");
        for (int i = 0; i <10; i++) {
            String inp=input.next();
            System.out.println(inp);

        }
        System.out.println();
        System.err.println("Bir cümle giriniz");
        for (int i = 0; i <10; i++) {
            String inp=input.nextLine();
            System.out.println(inp);
        }


        /** Not: next ve nextline arasındaki fark next te boşluğa kadar olan bir kelime
         sayar yani cümleyi kelimelere böler.eğer maksimum kelime sayısında bir cümle yazılması
         isteniyorsa mutlaka for veya diğer döngülerle gerekli ayarlamalar yapılmalı
         yukarıdaki gibi
         *
         * */
    }
}
