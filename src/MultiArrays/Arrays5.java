package MultiArrays;

import java.awt.*;
import java.util.Arrays;

public class Arrays5 {
    public static void main(String[] args) {

        int [] dizi={2,4,5,9};

        int [] dizi1=new int[4];

        int j=0;
        int k = 1;
        int l=0;
        int m=1;

        for (int i = 0; i <dizi.length; i++) {
            j+=dizi[i];
        }
        System.out.println(j);


        for (int i = 0; i < dizi.length; i++) {
            k*=dizi[i];
        }

        System.out.println(k);

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==0){
                l+=dizi[i];
            }
        }

        System.out.println(l);

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==0){
                m*=dizi[i];
            }
        }
        System.out.println(m);

        dizi1[0]=j;
        dizi1[1]=k;
        dizi1[2]=l;
        dizi1[3]=m;

        System.out.println(Arrays.toString(dizi1));

    }
}
