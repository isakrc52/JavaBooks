package MultiArrays;

public class Arrays2 {
    public static void main(String[] args) {
        int [][] dizi = {{12,23},{25,67},{12,56}};

        for (int i = 0; i < dizi.length ; i++) {

            for (int j = 0; j < 2; j++) {

                System.out.println("["+i+"]"+"["+j+"] = "+dizi [i][j]);
            }

        }

        for (int [] i:dizi ) {
            for (int [] j:dizi
                 ) {

                System.out.println("["+i+"]"+"["+j+"]");

            }
        }


    }
}
