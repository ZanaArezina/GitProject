public class RadnikPoDanu extends Radnik{

    double dan;
    double cenaDana;

    double plata;

    double plataPoDanu =dan*cenaDana;

    public RadnikPoDanu(String ime, String prezima, String jmbg, String ziroRacun, double dan, double cenaDana) {
        super(ime, prezima, jmbg, ziroRacun);
        this.dan = dan;
        this.cenaDana = cenaDana;
    }
    @Override
    public void obracunPlate() {
        System.out.println("Plata: " + dan * cenaDana);
    }

}
