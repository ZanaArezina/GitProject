public class primer_za_studenta {

    public static void main(String[] args){
        // Student - tip podatka (koja je objekat), student - varijabla (u koju smo stavili nas objekat),
        // new Sudent je pokazivac na mesto u memoriji

//      zbog ovog ispod imamo prazan konstruktor tamo u klasi student
        Student student = new Student();  //pravimo objekat neke klase //Student() - konstruktor -
        student.ime = "Laza";
        student.prezime = "Lazic";
        student.godine = 20;

        Student student1 = new Student("John", "Smith", 21);
        Student student2 = new Student("John", "Smith", 19);
        Student student3 = new Student("zana","arezina");


        student.zbirDvaBroja(2,3);
        student.ispis();


    }
}
