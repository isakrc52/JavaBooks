package MultiArrays;

import java.util.Arrays;

public class Arrays8_UcBoyutluDiziIsleri {
    public static void main(String[] args) {

        /**
        3x3 lük 2 matris tanımlayın ve dmngüler ile bu matrisin içeriğini
         istediğiniz gibi doldrun daha sonra bu matrisleri çarparak
         bir sonuç matrisi olşturun
       **/

       /** int[][][] x={{{2,3,6},{5,7,9}},{
                     {123,52,14}},
                {
                    {23,12,11,45},{12,11,10}
                }};

        int[][][] y={
                {{2,45,6},{5,7,9}},
                {{123,52,14}},
                {{23,12,11,45},{12,11,10}}
                    };(üç boyutlu dizi yazımı)**/

       int x[][][]=new int[3][3][2];
       int y[][][]=new int[2][3][4];
       int z [][][]=new int[2][3][2];

       /** birinci dizi **/

        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                for (int k = 0; k <2; k++) {
                    x[i][j][k]=i*j+1+k;
                }
            }
        }

        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                for (int k = 0; k <2; k++) {
                    System.out.println("x ["+i+"]"+"["+j+"]"+"["+k+"]="+ x[i][j][k]);
                }
            }
        }

        /** ikinci dizi */
        System.err.println("*".repeat(32));
        System.out.println();

        for (int i = 0; i <2; i++) {
            for (int j = 0; j <3; j++) {
                for (int k = 0; k <4; k++) {
                    y[i][j][k]=i*j+1+k;
                }
            }
        }

        for (int i = 0; i <2; i++) {
            for (int j = 0; j <3; j++) {
                for (int k = 0; k <4; k++) {
                    System.out.println("y ["+i+"]"+"["+j+"]"+"["+k+"]="+ y[i][j][k]);
                }
            }
        }
        /** üçüncü dizi */
        System.err.println("*".repeat(32));
        System.out.println();

        for (int i = 0; i <2; i++) {
            for (int j = 0; j <3; j++) {
                for (int k = 0; k <2; k++) {
                    z[i][j][k]=x[i][j][k]*y[i][j][k];
                }
            }
        }

        for (int i = 0; i <2; i++) {
            for (int j = 0; j <3; j++) {
                for (int k = 0; k <2; k++) {
                    System.out.println("z ["+i+"]"+"["+j+"]"+"["+k+"]="+ z[i][j][k]);
                }
            }
        }

    }
}
