public abstract class Radnik {

    protected String ime;
    protected String prezima;
    protected String jmbg;
    protected String ziroRacun;
    double plata;


    public Radnik(String ime, String prezima, String jmbg, String ziroRacun) {
        this.ime = ime;
        this.prezima = prezima;
        this.jmbg = jmbg;
        this.ziroRacun = ziroRacun;

    }
    void isplatiPlatu(){
            System.out.println("Ime: " + ime + " Prezime: " + prezima + " JMBG: " + jmbg + " Ziro Racun: " + ziroRacun + " Plata: "+ plata);
        }

    public String toString(){
      return "ime: " +ime + " Prezime: " + prezima + " JMBG: " + jmbg + " ZiroRacun: " +  ziroRacun + " ";

    }
    public void obracunPlate() {
        System.out.println("Plata: ");
    }
}
