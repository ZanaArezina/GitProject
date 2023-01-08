import java.util.Random;
import java.util.Scanner;
public class Cas4_vezba17 {

    public static void main(String[] args) {

       Random rand = new Random();
       int zamisljeniBroj = rand.nextInt(3);

       Scanner scanner = new Scanner(System.in);
       System.out.println("Koji broj sam zamislio?");

       while (true) {
//           System.out.println("Koji broj sam zamislio?");
           System.out.println("Unesi broj: ");
           int x = scanner.nextInt();
           if (x == zamisljeniBroj){
               System.out.println("Jeste! ");
               System.out.println("Koji broj sam zamislio?");
           }else{
               System.out.println("Nije");
           }
        }
    }
}
