public class cas4_loop_while {

    public static void main(String [] args) {

        int a = 0;
//        boolien uslov unutar while
        while (a < 10){
            a++;
//            System.out.println("Ispis: " + (a));
//           preskoci ovo iz uslova
            if (a == 5) {
                continue;
            }else {
                System.out.println(a);
            }

        }


    }
}
