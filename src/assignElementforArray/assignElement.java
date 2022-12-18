package assignElementforArray;

public class assignElement {
    public static void main(String[] args) {

        String[] family =new String[3];
        
        getFamily();

        for (int i = 0; i < 3; i++) {
            System.out.println(family [i]);
            System.out.println();
        }
    }
    private static void getFamily() {
    }

    static String getFamily (String family){

        String [] f1= {"ali","hasan","hüseyin","mehmet","isa","sibel","fatma","aysel","selahattin","afet"};

        for (int i = 0; i <3; i++) {

            family=f1 [i];
        }
        return family;
    }
}
