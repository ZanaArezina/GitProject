public class RadnikPoSatu extends Radnik {

    double brojRadnihSati;
    double cenaSata;

    public RadnikPoSatu(String ime, String prezima, String jmbg, String ziroRacun, int brojRadnihSati, double cenaSata) {
        super(ime, prezima, jmbg, ziroRacun);
        this.brojRadnihSati = brojRadnihSati;
        this.cenaSata = cenaSata;
    }

    @Override
    public void obracunPlate() {
        System.out.println("Plata: " + brojRadnihSati * cenaSata);
    }


}
