package metodlar.sorular;

public class Soru4 {

    public static void main(String[] args) {

        /*  TASK :
        Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
                String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         */

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int x=pickName.indexOf('E');
        int y=pickName.indexOf('L');
        int z=pickName.indexOf('I');

       // System.out.println(x);
       // System.out.println(pickName.substring(x,x+1));

        String k=  String.format(pickName.substring(x,x+1)+pickName.substring(y,y+1)+pickName.substring(z,z+1).toLowerCase());
        System.out.println(k);
        
    }
}
