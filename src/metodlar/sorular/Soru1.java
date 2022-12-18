package metodlar.sorular;

public class Soru1 {

    //2 adet int tipindeki değişkenlerin arasındaki beşe bölünen sayıları
    //ekrana veren islemYap() metodu tanımlayınız

    public static void main(String[] args) {
      /*  public  String islemYap(int x, int y){
            String str=" ";
            for (int i = x; i <=y ; i++) {
                if (i%5==0) {
                }}return str+islemYap(x, y);}*/

      islemYap(2,11);



}


    public static void islemYap(int x, int y) {
        for (int i = x; i <= y; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}




