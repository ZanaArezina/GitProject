public class string_memorija {
        public static <Initializing> void main(String [] args) {

            //slozeni tipovi porede memorijsku lokaciju, "Pera" pokazuje odredjeno mesto u memoriji
            String ime = "Pera"; // ------> pera@5435435345
            String ime2 = new String("Pera"); //String pool ------> pera@13212123
            String ime3 = "Pera"; // ------> pera@5435435345

            System.out.println(ime.equals(ime2));
            System.out.println(ime == ime2);

            System.out.println(ime.equals(ime3));
            System.out.println(ime == ime3);

            Main main = new Main();
//            Main main = null;
//            String n = null;
            System.out.println(main);

            // primitivni tipovi podataka poredi vrednosti
            int x = 10;
            int y = 10;
            System.out.println(x==y);



        }

}
