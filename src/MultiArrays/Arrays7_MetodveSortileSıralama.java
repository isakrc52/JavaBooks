package MultiArrays;

import java.util.Arrays;

public class Arrays7_MetodveSortileSıralama {
    public static void main(String[] args) {
        /**
         sort netodunu kullanmadan dizideki elemanları küçükten büyüğe sıralayan
         algoritma tasarlayın ve programınızda yugulayın.
         * */

        int [] sayi={5,2,30,24,32};

        int [] sayi2={55,14,12,63,120};
      //  System.out.println(Arrays.toString(sayi));

        System.out.println(Arrays.toString(sayi));
        sortArrays(sayi);
        System.out.println(Arrays.toString(sayi));
        System.err.println("-".repeat(32));
        System.out.println(Arrays.toString(sayi2));
        Arrays.sort(sayi2);//sayıları hizalayan kalıp yukarıda biz kendi kalıbmızı yazdık
        //burada sıtaya koydurduktan sonra yazdık aşağıdaki gibi sout içinde Arrays.sort u yazdrmayruz
        //zaten sout kalıbını kllndığından aynı bizim sortArrays metodunda olduğu gibi
        System.out.println(Arrays.toString(sayi2));


    }


    public static void sortArrays (int [] k){

        int temp;

        for (int i = 0; i <k.length-1; i++) {
            for (int j =i+1; j < k.length; j++) {
                if(k[j] < k[i]) {
                    temp = k[i];
                    k[i] = k[j];
                    k[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(k));
    }



}
