 public class Main {
public static <Initializing> void main(String [] args) {
    // Initializing variables here:
    int x = 25;
    int y = 35;
    int z = 45;
    int[] currentPosition = {x, y, z};
    System.out.println("Your current position is: ");
    System.out.printf("x:%d,y:%d,z:%d \n",
            currentPosition[0], currentPosition[1], currentPosition[2]);
}
}