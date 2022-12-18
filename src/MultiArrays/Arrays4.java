package MultiArrays;

public class Arrays4 {
    //düzensiz dizileri ekrana yazdırma
    //fereach ile multiple arraysları yazdırma
    public static void main(String[] args) {
        int[][] dizi = {
                {0,1,2},
                {3,4},
                {5,6,7,8,9,10},
                {11,12,13,14,15}
        };

        for (int [] i:
            dizi ) {
            for (int eleman:i) {
                System.out.print(eleman+" ");
            }
            System.out.println();

        }

    }
}
