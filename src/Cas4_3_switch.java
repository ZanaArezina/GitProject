import java.util.Scanner;

public class Cas4_3_switch {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi prvi broj: ");
        int operand1 = scanner.nextInt();

        System.out.println("Unesi drugi broj: ");
        int operand2 = scanner.nextInt();

        System.out.println("Unesi racunsku operaciju: ");
        String operator = scanner.next();

//        //if (operator == "+") proverava mesto u memoriji a ne da li je uneo korisnik +
//        //slozen tip podatka mora preko funkcije
//        if (operator.equals("+")) {
//            System.out.println("Rezultat sabiranja je: " + (operand1 + operand2));
//        } else if (operator.equals("-")) {
//            System.out.println("Rezultat oduzimanja je: " + (operand1 - operand2));
//        } else if (operator.equals("*")) {
//            System.out.println("Rezultat mnozenja je: " + (operand1 * operand2));
//            //else if (operator.equals("/") && operand2 !=0 )
//        } else if (operator.equals("/")) {
//            if (operand2 == 0){
//                System.out.println("Deljenje sa 0 nije dozvoljeno");
//            }else
//                System.out.println("Rezultat deljenja je: " + (operand1 / operand2));
//        } else {
//            System.out.println("Greska pri unosu: ");
//        }
    switch (operator){
        case "+":{
            System.out.println("Rezultat sabiranja je: " + (operand1 + operand2));
        }break;

        case "-":{
            System.out.println("Rezultat oduzimanja je: " + (operand1 - operand2));
        }break;

        case "*":{
            System.out.println("Rezultat mnozenja je: " + (operand1 * operand2));
        }break;
        case "/":{
            if (operand2 == 0){
                System.out.println("Deljenje sa nulom nije dozvoljeno");

            }else {
                System.out.println("Rezultat deljenja je: " + (operand1 / operand2));
            }
        }break;
        default: System.out.println("Greska pri unosu");
    }
    }

}
