import java.util.Arrays;
import java.util.Random;
public class Cas5_Vezba18 {
    public static void main(String[] args) {

        String niz [] = new String [] {"Heart", "Cherry", "Coin", "Melon", "Jocker"};
        //definisem prazan niz u koji cu da ubacujem elemente iz zadatog niza random redom:
        String nizRand [] = new String [niz.length];
        // definisanje indexa novog praznog niza:

        Random rand = new Random();
        int index0 = rand.nextInt(niz.length); //nultom indeu dodeljujem random broj od 0-4 (duzina niza 5)
        int index1;
        int index2;
        int index3;
        int index4;

        nizRand [0] = niz[index0]; //novom nizu dodelim na nultom indexu element iz zadatog niza sa random pozicije

        // na indexu 1 novog niza dodeljujem novi element iz zadatog niza ali pazim da se razlikuje od prethodnoh elementa:
       while (true) {
           index1 = rand.nextInt(niz.length);
           if (index1 != index0) {
               nizRand [1] = niz[index1];
               break;
           }
        };
        while (true) {
            index2 = rand.nextInt(niz.length);
            if (index2 != index1 && index2 != index0) {
                nizRand [2] = niz[index2];
                break;
            }
        };
        while (true) {
            index3 = rand.nextInt(niz.length);
            if (index3 != index2 && index2 != index1 && index3 !=index0) {
                nizRand [3] = niz[index3];
                break;
            }
        };
        while (true) {
            index4 = rand.nextInt(niz.length);
            if (index4 != index3 && index4 != index2 && index4!=index1 && index4 !=index0) {
                nizRand [4] = niz[index4];
                break;
            }
        };
        System.out.println("Combination is: ");
//        System.out.println(Arrays.toString(nizRand)); // ispis kao niz
        for (int i = 0; i < nizRand.length; i++) { //ispis pojedinacnih elemenata
            System.out.print((nizRand[i]) + " ");
        }
}
}
