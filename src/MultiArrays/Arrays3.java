package MultiArrays;

import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int dizi[][] = {{8,3,4}, {7,5,6},{11,9,12},{-4,-9,-2}}; // öylesine bir dizi tanımladım
        for (int i = 0; i < dizi.length; i++) { // burada dizi.length = 4
            System.out.println(Arrays.toString(dizi[i]));//bu yöntemide kullanabiliriz.
        }

        String [][] deneme={{"ali","ahmet"},{"mehmet","isa"},{"hüseyin","ishak"}};
        for (int i = 0; i < deneme.length ; i++) {//string yapısı Arrays ile yapılamaz override etmek gerekir
        }
        System.out.println(Arrays.toString(deneme));
    }
}
