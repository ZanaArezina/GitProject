import java.util.Scanner;

public class paran_nepran {
    public static <Initializing> void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi prvi broj: ");
        int broj = scanner.nextInt();
        System.out.println("Uneti broj je: " + (broj));
        int ostatak = (broj %2);
        System.out.println( "ostatak je:" + broj %2 );

        boolean res = (ostatak == 0 && true);
        System.out.println("broj je paran:  " + (res));

//        if (ostatak == 1)
//        System.out.println("broj je neparan");
//        else
//        System.out.println( "broj je paran" );

    }
}

