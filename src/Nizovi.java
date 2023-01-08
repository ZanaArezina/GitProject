import java.util.Arrays;

public class Nizovi {

    public static void main(String[] args) {
        //niz celih brojeva

        int a = 5;
        int [] mojNiz = new int [6]; // -----> @urf84sdhks //prazan niz ali mozes max 6 da dodas
        mojNiz[0] = 15;
        mojNiz[1] = 20;
        mojNiz[5] = 50;
        //prazne pozicije popuni difoltnim vrednosti za int
        for (int i = 0; i < mojNiz.length; i++) {
            System.out.println(mojNiz[i]);
//            System.out.print(mojNiz[i]);
        }

//        drugi nacin definisanja niza
        int niz[] = new int [] {55, 8, 9, 10, 56, 78}; //indeksi krecu od 0 mesto u memoriji ---> [I@49e4cb85
//        int niz1 [] = {55, 8, 9, 10, 56, 78};
        int max = niz[0];
        for (int i = 1; i < niz.length; i++) {
            if (niz[i] > max) {
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

        System.out.println(niz.length);
        System.out.println(niz); // mesto u memoriji ---> [I@49e4cb85

        for (int i = 0; i < niz.length; i++) {
            System.out.println(niz[i]);
//            System.out.print(niz[i]);
        }

        for (int i: niz) {  //hasNext prolazi kroz niz dok god ima clanova
            System.out.println(i);
        }

//        niz slozenih podataka
        String nizDanaUNedelji [] = new String [] {"Ponedeljak", "Utorak", "Sreda"};


        // dvodimenzionalni niz - niz u nizu
        int[][] niz2d = new int[][]{
                {1,2,8},
                {3,5,6} ,
                {5,6,7}
        };

        System.out.println(niz2d[1][2]); // isprintaj broj 6 iz drugog niza

        // probaj preko for iche petlje
        for (int i =0; i < niz2d.length; i++){
            for (int j = 0; j < niz2d[i].length ; j++) {
                System.out.print(niz2d[i][j]);
            }
            System.out.println();
        }



        // multidimenzionalni niz
        int [][][] multiniz = new int[1][2][3];




    }
}
