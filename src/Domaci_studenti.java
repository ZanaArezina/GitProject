import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Domaci_studenti {
    public static void main(String[] args) {
        List<Student> listaSviStudenti = new ArrayList<>();
        List<Student> listaPolozili = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Student student = new Student();

            System.out.println("Unesi ime studenta ili 'quit' da izadjes iz programa: ");
            student.ime = scanner.nextLine();
            if (student.ime.equalsIgnoreCase("quit")) {
                break;
            }
            System.out.println("Unesi prezime studenta: ");
            student.prezime = scanner.nextLine();

            System.out.println("Unesi ocenu studenta: ");
            student.ocena = Integer.parseInt(scanner.nextLine());

            student.toString();
            listaSviStudenti.add(student);
            if (student.ocena > 5) {
                listaPolozili.add(student);
            }
        }
//        scanner.close();
        System.out.println("Lista svih studenata:");
//        System.out.println(listaSviStudenti);
        for (Object o: listaSviStudenti){
            System.out.println(o);
        }
        System.out.println("Lista studenata koji su polozili:");
//        System.out.println(listaPolozili);
        for (Object o2: listaPolozili){
            System.out.println(o2);
        }
    }
}


