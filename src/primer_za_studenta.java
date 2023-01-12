public class primer_za_studenta {

    public static void main(String[] args){
//      zbog ovog ispod imamo prazan konstruktor tamo u klasi student

        Student_sa_casa studentSacasa = new Student_sa_casa();  //pravimo objekat neke klase //Student() - konstruktor -
        // Student - slozen tip podatka (koja je objekat), student - varijabla (u koju smo stavili nas objekat),
        // new Sudent je pokazivac na mesto u memoriji

        studentSacasa.ime = "Laza";
        studentSacasa.prezime = "Lazic";
        studentSacasa.godine = 20;

        Student_sa_casa studentSacasa1 = new Student_sa_casa("John", "Smith", 21);
        Student_sa_casa studentSacasa2 = new Student_sa_casa("John", "Smith", 19);
        Student_sa_casa studentSacasa3 = new Student_sa_casa("zana","arezina");


        studentSacasa.zbirDvaBroja(2,3);
        studentSacasa.ispis();


    }
}
