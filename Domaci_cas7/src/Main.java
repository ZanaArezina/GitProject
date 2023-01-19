import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Radnik> radnikList = new ArrayList<Radnik>();

        RadnikPoDanu radnikPD = new RadnikPoDanu("John", "Doe", "1234567890123", "HR123456789", 10.0,1.0);
        radnikList.add(radnikPD);
//        radnikPD.obracunPlate();


        RadnikPoSatu radnikPS = new RadnikPoSatu("Pera", "Peric","1234567892222", "ZR123456788", 10,2);
        radnikList.add(radnikPS);
//        radnikPS.obracunPlate();

        RadnikFixno radnikF = new RadnikFixno("Bob", "Doe", "1234567890125", "HR123456791");
        radnikList.add(radnikF);
//        radnikF.obracunPlate();


        for (Radnik radnik : radnikList) {
            System.out.println(radnik.toString());
            radnik.obracunPlate();

        }
    }
}
