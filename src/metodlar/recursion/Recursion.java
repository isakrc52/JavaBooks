package metodlar.recursion;

public class Recursion {

    static int faktoriyel (int sayi){//recursive metodda parametre döngüye dahil ediliyr

        if (sayi==0)
            return 1;
        else
            return (sayi*faktoriyel(sayi-1));//burada faktöriyeldeki sayı tekraren çağrılı taki
        //1 olana kadar..
    }
    //recursive metodla fibonacci dizininde sırası verilen sayıyı bulma

    static int fibonacci(int x){

        if (x<=1)
            return 1;
        else
            return fibonacci(x-1)+fibonacci(x-2);
    }
    //aşağıdaki örnekte recursive olmayan interative metodla yapılan örnek

    static int hesapla (int x){
        int deger=1;
        for (int i = x; 0<i; i--) {
            deger*=i;
        }return deger;
    }

    public static void main(String[] args) {

        System.out.println(faktoriyel(5));//recursive çağırdık
        System.out.println(hesapla(6));//interative çağırdık

        //aşağıdaki örnek normal bir şekilde faktöriyel hesabı

        int deger=1;
        int x=6;
        for (int i = x; 0<i; i--) {
            deger*=i;        }
        System.out.println(deger);
        System.out.printf("%d fibonacci diznindeki sayı:%d",fibonacci(fibonacci(x)),fibonacci(8));
        //yukarıdaki fibonacci dizinindeki formatta ilki %d otrtulamadı



    }

}
