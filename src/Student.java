public class Student {

    //polja
    String ime;
    String prezime;
    int godine;

    //konstruktori - mehanizam za kreiranje objekata (uvek nosi isto ime koa klasa)

        String a = "Pera";
    public  Student(){        //prazan konstruktor da bi kreirao Student() tamo u primeru za student
        System.out.println("Poziv  praznog konstruktora");

    }
    public Student(String ime, String prezime, int godine) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
        System.out.println("Poziv konstruktora sa 3 parametra");
    }

    public Student(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    // metode (funkcije) - ono sto objekat moze da radi, odnosno izvrsava
    public void ispis(){
        System.out.println("Ispis iz klase Student.");
    }

    public void zbirDvaBroja (int a, int b){
        System.out.println(a + b);
    }

}
