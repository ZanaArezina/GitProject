import java.util.Random;

public class Cas5_Vezba18b {
        public static void main(String[] args) {

            String niz [] = new String [] {"Heart", "Cherry", "Coin", "Melon", "Jocker"};
            //definisem prazan niz u koji cu da ubacujem elemente iz zadatog niza random redom:

            Random random = new Random();
            int randomize = random.nextInt(niz.length);
            System.out.print(niz[randomize] + " ");

}
    }
