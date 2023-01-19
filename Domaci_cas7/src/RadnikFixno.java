public class RadnikFixno extends Radnik {

    final static double plataFix=2000;

    public RadnikFixno(String ime, String prezima, String jmbg, String ziroRacun) {
        super(ime, prezima, jmbg, ziroRacun);
    }

    @Override
    public void obracunPlate() {
        System.out.println("Plata: " + plataFix);
    }
    @Override
    void isplatiPlatu(){
        System.out.println("Ime: " + ime + " Prezime: " + prezima + " JMBG: " + jmbg + " Ziro Racun: " + ziroRacun + " Plata: "+ plataFix);
    }
}
