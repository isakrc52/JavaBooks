package exaptions;

import java.util.Arrays;

public class ContainsExamples {


/**
 * public void notNumber(String value) throws NotNumberException {
 *         //char [] asd="ABCDEFGĞHJKLMNOÖPRSŞTUÜVYZIİQXW".toCharArray();
 *         String asd="ABCDEFGĞHJKLMNOÖPRSŞTUÜVYZIİQXW";
 *         if (!asd.contains(value)) throw new NotNumberException ();
 *         this.value=value;
 *     }
 * */

public static void main(String[] args) {

    String asd="ABCDEFGĞHJKLMNOÖPRSŞTUÜVYZIİQXW";

    if (asd.contains("2")){
        System.out.println(true);}
    else {
        System.out.println(false);
    }

    String asd1="ABCDEFGĞHJKLMNOÖPRSŞTUÜVYZIİQXW";

    char [] a={'A','B'};



    if (0<(Arrays.binarySearch(asd1.toCharArray(),a[0]))){
        System.out.println("char a dizinin içinde vardır");
    }else {
        System.out.println("char a dizinin içinde yoktur");
    }

    }
}
