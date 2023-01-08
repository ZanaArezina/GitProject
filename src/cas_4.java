public class cas_4 {

    public static void main(String [] args) {

     boolean res = 10==10;

     String ime = "Pera";

     //kad ima jednu liniju koda IF ne mora blok da se otvara
     if (true)
         System.out.println("True");

     if (10==10 && 5>43 || false || !ime.equals("Pera")) {
        System.out.println("Tacno!");
     } else if (10 > 5) {
         System.out.println("Drugi uslov je tacan!");

     } else if (ime.equals("Pera!")) {
         System.out.println("Ime je tacno!");

     }else {
         System.out.println("Nista od navedenog!");
     }

//     if (10==10) {
//            System.out.println("Tacno!");
//     } if (10 > 5) {
//            System.out.println("Drugi uslov je tacan!");
//
//     } if (ime.equals("Pera!")) {
//            System.out.println("Ime je tacno!");
//
//     }else {
//            System.out.println("Nista od navedenog!");
//        }



    }
    }