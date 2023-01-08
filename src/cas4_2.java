public class cas4_2 {

        public static void main(String [] args) {

            boolean res = 10 == 10;

            String ime = "Pera";

            //kad ima jednu liniju koda IF ne mora blok da se otvara
            if (true) System.out.println("True");

            if (10 == 10 && 5 > 43 || true || ime.equals("Pera")) {
                if (ime.contains("a")){
                    if (!ime.contains("z")){
                        System.out.println("Ne sadrzi dato slovo!");
                    }
                    System.out.println("Sadrzi slovo a!");
                }
                System.out.println("Tacno!");
            } else if (10 > 5) {
                System.out.println("Drugi uslov je tacan!");

            } else if (ime.equals("Pera!")) {
                System.out.println("Ime je tacno!");

            } else {
                System.out.println("Nista od navedenog!");
            }
        }
    }

