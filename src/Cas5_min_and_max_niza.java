import java.util.Arrays;
public class Cas5_min_and_max_niza {
    public static void main(String[] args) {

    int niz[] = new int [] {55, 8, 9, 10, 56, 78};
    int max = niz[0]; //proglasim prvi element kao max
        for (int i = 1; i < niz.length; i++) { //kroz For petlju poredim taj prvi element sa indexom 0 sa svim ostalim elementima od indexa 1 do indexa 5
        if (niz[i] > max) { //kada naidje na veci broj njega proglasi novim maximumom
            max = niz[i];
        }
    }
    int min = niz[0];
        for (int i = 1; i < niz.length; i++) {
        if (niz[i] < min) {
            min = niz[i];
        }
    }
        System.out.println(Arrays.toString(niz));
        System.out.println("Max vrednost niza: " + (max));
        System.out.println("Min vrednost niza: " + (min));

    }
}
